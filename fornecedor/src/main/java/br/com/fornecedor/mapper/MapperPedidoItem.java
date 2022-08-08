package br.com.fornecedor.mapper;

import br.com.fornecedor.dto.PedidoItemDTO;
import br.com.fornecedor.model.PedidoItem;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface MapperPedidoItem {
    PedidoItemDTO toDto(PedidoItem entity);

    PedidoItem toEntity(PedidoItemDTO dto);

    List<PedidoItemDTO> toListDto(List<PedidoItem> entity);

    List<PedidoItem> toListEntity(List<PedidoItemDTO> dto);
}
