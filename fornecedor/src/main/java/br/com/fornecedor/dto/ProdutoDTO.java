package br.com.fornecedor.dto;

import lombok.*;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProdutoDTO {
    private Long id;

    private String nome;

    private String estado;

    private String descricao;

    private BigDecimal preco;


}
