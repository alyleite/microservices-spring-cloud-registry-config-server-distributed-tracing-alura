package br.com.fornecedor.dto;

import br.com.fornecedor.model.PedidoStatus;
import lombok.*;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PedidoDTO {
    private Long id;

    private Integer tempoDePreparo;
    private PedidoStatus status;
    private List<PedidoItemDTO> itens;


}
