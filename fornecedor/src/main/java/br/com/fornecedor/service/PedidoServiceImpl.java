package br.com.fornecedor.service;

import br.com.fornecedor.dto.ItemDoPedidoDTO;
import br.com.fornecedor.dto.PedidoDTO;
import br.com.fornecedor.dto.PedidoItemDTO;
import br.com.fornecedor.mapper.MapperPedido;
import br.com.fornecedor.mapper.MapperPedidoItem;
import br.com.fornecedor.model.Pedido;
import br.com.fornecedor.model.PedidoItem;
import br.com.fornecedor.model.PedidoStatus;
import br.com.fornecedor.model.Produto;
import br.com.fornecedor.repository.PedidoRepository;
import br.com.fornecedor.repository.ProdutoRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
@AllArgsConstructor
public class PedidoServiceImpl implements PedidoService {

    private final PedidoRepository pedidoRepository;
    private final ProdutoRepository produtoRepository;
    private final MapperPedido mapperPedido;
    private final MapperPedidoItem mapperPedidoItem;


    @Override
    public PedidoDTO realizaPedido(List<ItemDoPedidoDTO> itens) {
        log.info("Pedido recebido");
        if (itens == null) {
            return null;
        }

        List<PedidoItemDTO> pedidoItens = toPedidoItem(itens);
        Pedido pedido = Pedido.builder()
                .itens(mapperPedidoItem.toListEntity(pedidoItens))
                .status(PedidoStatus.RECEBIDO)
                .tempoDePreparo(itens.size())
                .build();
        return mapperPedido.toDto(pedidoRepository.save(pedido));
    }

    @Override
    public PedidoDTO getPedidoPorId(Long id) {
        return mapperPedido.toDto(this.pedidoRepository.findById(id).orElse(new Pedido()));
    }

    @Override
    public List<PedidoItemDTO> toPedidoItem(List<ItemDoPedidoDTO> itens) {
        List<Long> idsProdutos = itens
                .stream()
                .map(ItemDoPedidoDTO::getId)
                .collect(Collectors.toList());

        List<Produto> produtosDoPedido = produtoRepository.findByIdIn(idsProdutos);

        List<PedidoItem> pedidoItens = itens
                .stream()
                .map(item -> {
                    Produto produto = produtosDoPedido
                            .stream()
                            .filter(p -> p.getId() == item.getId())
                            .findFirst().get();

                    PedidoItem pedidoItem = new PedidoItem();
                    pedidoItem.setProduto(produto);
                    pedidoItem.setQuantidade(item.getQuantidade());
                    return pedidoItem;
                })
                .collect(Collectors.toList());
        return mapperPedidoItem.toListDto(pedidoItens);
    }
}
