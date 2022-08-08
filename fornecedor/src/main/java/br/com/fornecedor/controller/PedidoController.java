package br.com.fornecedor.controller;

import br.com.fornecedor.dto.ItemDoPedidoDTO;
import br.com.fornecedor.dto.PedidoDTO;
import br.com.fornecedor.model.Pedido;
import br.com.fornecedor.service.PedidoService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedido")
@Slf4j
@AllArgsConstructor
public class PedidoController {

    private final PedidoService pedidoService;

    @RequestMapping(method = RequestMethod.POST)
    public PedidoDTO realizaPedido(@RequestBody List<ItemDoPedidoDTO> produtos) {
        return pedidoService.realizaPedido(produtos);
    }

    @RequestMapping("/{id}")
    public PedidoDTO getPedidoPorId(@PathVariable Long id) {
        return pedidoService.getPedidoPorId(id);
    }
}
