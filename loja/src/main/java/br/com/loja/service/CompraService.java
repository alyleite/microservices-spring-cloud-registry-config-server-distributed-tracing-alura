package br.com.loja.service;

import br.com.loja.dto.CompraDTO;
import br.com.loja.model.Compra;

public interface CompraService {
    Compra realizaCompra(CompraDTO dto);
}
