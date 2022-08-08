package br.com.fornecedor.dto;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EnderecoDTO {
    private Long id;
    private String rua;
    private Integer numero;
    private String estado;

}
