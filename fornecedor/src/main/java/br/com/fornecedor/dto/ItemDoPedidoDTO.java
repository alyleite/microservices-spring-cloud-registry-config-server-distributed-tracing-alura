package br.com.fornecedor.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
public class ItemDoPedidoDTO {
    private long id;

    private int quantidade;
}
