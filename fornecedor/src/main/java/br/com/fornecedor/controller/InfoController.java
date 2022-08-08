package br.com.fornecedor.controller;

import br.com.fornecedor.dto.InfoFornecedorDTO;
import br.com.fornecedor.service.InfoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/info")
@Slf4j
@RequiredArgsConstructor
public class InfoController {
    private final InfoService infoService;

    @RequestMapping("{estado}")
    public ResponseEntity<InfoFornecedorDTO> getInfoPorEstado(@PathVariable String estado) {
        log.warn("getInfoPorEstado: " + estado);

        return Optional
                .ofNullable(this.infoService.getInfoPorEstado(estado))
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());

    }
}
