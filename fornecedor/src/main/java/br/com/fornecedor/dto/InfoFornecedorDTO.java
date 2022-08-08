package br.com.fornecedor.dto;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class InfoFornecedorDTO {
    private Long id;

    private String nome;

    private String estado;

    private String endereco;
}
