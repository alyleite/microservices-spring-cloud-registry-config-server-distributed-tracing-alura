package br.com.fornecedor.repository;

import br.com.fornecedor.model.InfoFornecedor;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface InfoRepository extends CrudRepository<InfoFornecedor, Long> {
    Optional<InfoFornecedor> findByEstado(String estado);
}
