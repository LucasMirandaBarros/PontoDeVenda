package com.primeirotrampodev.Pontodevenda.Repository;

import com.primeirotrampodev.Pontodevenda.Entidade.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
