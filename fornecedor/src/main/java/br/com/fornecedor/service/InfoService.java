package br.com.fornecedor.service;

import br.com.fornecedor.dto.InfoFornecedorDTO;

public interface InfoService {
    InfoFornecedorDTO getInfoPorEstado(String estado);
}
