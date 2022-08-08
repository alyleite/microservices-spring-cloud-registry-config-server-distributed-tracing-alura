package br.com.fornecedor.controller;

import br.com.fornecedor.dto.ProdutoDTO;
import br.com.fornecedor.model.Produto;
import br.com.fornecedor.service.ProdutoService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/produto")
@Slf4j
@AllArgsConstructor
public class ProdutoController {

    private final ProdutoService produtoService;

    @RequestMapping("/{estado}")
    public List<ProdutoDTO> getProdutosPorEstado(@PathVariable("estado") String estado) {
        return produtoService.getProdutosPorEstado(estado);
    }
}
