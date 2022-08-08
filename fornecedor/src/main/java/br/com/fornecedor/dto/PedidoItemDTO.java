package br.com.fornecedor.dto;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PedidoItemDTO {
    private Long id;

    private Integer quantidade;
    private ProdutoDTO produto;


}
