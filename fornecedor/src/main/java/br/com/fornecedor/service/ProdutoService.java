package br.com.fornecedor.service;

import br.com.fornecedor.dto.ProdutoDTO;
import br.com.fornecedor.model.Produto;

import java.util.List;

public interface ProdutoService {
    List<ProdutoDTO> getProdutosPorEstado(String estado);
}
