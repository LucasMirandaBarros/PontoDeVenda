package com.primeirotrampodev.Pontodevenda.Repository;

import com.primeirotrampodev.Pontodevenda.Entidade.Fornecedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FornecedorRepository extends JpaRepository<Fornecedor, Integer> {
}
