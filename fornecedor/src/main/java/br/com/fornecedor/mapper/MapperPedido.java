package br.com.fornecedor.mapper;

import br.com.fornecedor.dto.PedidoDTO;
import br.com.fornecedor.model.Pedido;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface MapperPedido {
    PedidoDTO toDto(Pedido entity);

    Pedido toEntity(PedidoDTO dto);

    List<PedidoDTO> toListDto(List<Pedido> entity);

    List<Pedido> toListEntity(List<PedidoDTO> dto);
}
