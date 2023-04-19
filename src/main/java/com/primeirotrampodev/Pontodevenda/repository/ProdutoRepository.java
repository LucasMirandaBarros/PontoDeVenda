package com.primeirotrampodev.Pontodevenda.repository;

import com.primeirotrampodev.Pontodevenda.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}
