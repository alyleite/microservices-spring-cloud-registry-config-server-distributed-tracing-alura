package br.com.loja.model;

import lombok.*;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
//@Entity
//@Table(name = "pedido")
public class Compra {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
    private Long pedidoId;

    private Integer tempoDePreparo;

    private String enderecoDestino;
}
