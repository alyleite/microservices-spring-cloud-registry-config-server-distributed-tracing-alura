package br.com.loja.dto;

import lombok.*;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CompraDTO {

    private List<ItemDTO> itens;
    private EnderecoDTO endereco;
}
