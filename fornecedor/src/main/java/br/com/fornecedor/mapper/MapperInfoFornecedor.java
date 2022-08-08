package br.com.fornecedor.mapper;

import br.com.fornecedor.dto.InfoFornecedorDTO;
import br.com.fornecedor.model.InfoFornecedor;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface MapperInfoFornecedor {
    InfoFornecedorDTO toDto(InfoFornecedor entity);

    InfoFornecedor toEntity(InfoFornecedorDTO dto);

    List<InfoFornecedorDTO> toListDto(List<InfoFornecedor> entity);

    List<InfoFornecedor> toListEntity(List<InfoFornecedorDTO> dto);
}
