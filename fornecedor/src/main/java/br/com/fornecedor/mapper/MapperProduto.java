package br.com.fornecedor.mapper;

import br.com.fornecedor.dto.ProdutoDTO;
import br.com.fornecedor.model.Produto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface MapperProduto {
    ProdutoDTO toDto(Produto entity);

    Produto toEntity(ProdutoDTO dto);

    List<ProdutoDTO> toListDto(List<Produto> entity);

    List<Produto> toListEntity(List<ProdutoDTO> dto);
}
