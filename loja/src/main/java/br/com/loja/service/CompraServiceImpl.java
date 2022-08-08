package br.com.loja.service;

import br.com.loja.client.FornecedorClient;
import br.com.loja.dto.CompraDTO;
import br.com.loja.dto.InfoFornecedorDTO;
import br.com.loja.dto.InfoPedidoDTO;
import br.com.loja.model.Compra;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@AllArgsConstructor
public class CompraServiceImpl implements CompraService {

    private final FornecedorClient fornecedorClient;

    @Override
    public Compra realizaCompra(CompraDTO compra) {
        String estado = compra.getEndereco().getEstado();
        log.info("Buscando informações do fornecedor de {}", estado);
        InfoFornecedorDTO info = fornecedorClient.getInfoPorEstado(estado);

        log.info("Realizando o pedido");
        InfoPedidoDTO infoPedido = fornecedorClient.realizaPedido(compra.getItens());

        return Compra.builder()
                .pedidoId(infoPedido.getId())
                .tempoDePreparo(infoPedido.getTempoDePreparo())
                .enderecoDestino(compra.getEndereco().toString())
                .build();
    }

    public Compra realizaCompraFallback(CompraDTO compra) {
        return Compra.builder()
                .enderecoDestino(compra.getEndereco().toString())
                .build();
    }
}
