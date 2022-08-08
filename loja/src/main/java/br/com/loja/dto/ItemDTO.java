package br.com.loja.dto;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ItemDTO {
    private Long id;
    private Integer quantidade;
}
