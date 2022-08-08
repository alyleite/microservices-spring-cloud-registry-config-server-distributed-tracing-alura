package br.com.fornecedor.service;

import br.com.fornecedor.dto.InfoFornecedorDTO;
import br.com.fornecedor.mapper.MapperInfoFornecedor;
import br.com.fornecedor.repository.InfoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class InfoServiceImpl implements InfoService {

    private final InfoRepository infoRepository;
    private final MapperInfoFornecedor mapper;


    @Override
    public InfoFornecedorDTO getInfoPorEstado(String estado) {
        log.info("Recebido o pedido de informações do fornecedor de {}", estado);
        var infoFornecedor = this.infoRepository.findByEstado(estado).orElse(null);
        return this.mapper.toDto(infoFornecedor);
    }
}
