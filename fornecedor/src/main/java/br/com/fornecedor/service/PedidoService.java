package br.com.fornecedor.service;

import br.com.fornecedor.dto.ItemDoPedidoDTO;
import br.com.fornecedor.dto.PedidoDTO;
import br.com.fornecedor.dto.PedidoItemDTO;
import br.com.fornecedor.model.Pedido;
import br.com.fornecedor.model.PedidoItem;

import java.util.List;

public interface PedidoService {
    PedidoDTO realizaPedido(List<ItemDoPedidoDTO> itens);

    PedidoDTO getPedidoPorId(Long id);

    List<PedidoItemDTO> toPedidoItem(List<ItemDoPedidoDTO> itens);
}
