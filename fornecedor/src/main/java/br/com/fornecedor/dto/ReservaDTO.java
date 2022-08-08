package br.com.fornecedor.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
public class ReservaDTO {

    public Integer idReserva;

    public Integer tempoDePreparo;
}
