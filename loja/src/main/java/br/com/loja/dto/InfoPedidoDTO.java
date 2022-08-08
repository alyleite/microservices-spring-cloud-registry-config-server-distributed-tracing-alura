package br.com.loja.dto;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class InfoPedidoDTO {
    private Long id;
    private Integer tempoDePreparo;
}
