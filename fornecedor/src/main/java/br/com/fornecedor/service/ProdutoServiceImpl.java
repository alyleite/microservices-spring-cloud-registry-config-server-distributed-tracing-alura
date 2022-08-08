package br.com.fornecedor.service;

import br.com.fornecedor.dto.ProdutoDTO;
import br.com.fornecedor.mapper.MapperProduto;
import br.com.fornecedor.repository.ProdutoRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class ProdutoServiceImpl implements ProdutoService {
    private final ProdutoRepository produtoRepository;
    private final MapperProduto mapperProduto;

    @Override
    public List<ProdutoDTO> getProdutosPorEstado(String estado) {
        return mapperProduto.toListDto(produtoRepository.findByEstado(estado));
    }
}
