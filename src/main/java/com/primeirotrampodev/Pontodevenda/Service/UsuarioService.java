package com.primeirotrampodev.Pontodevenda.Service;

import com.primeirotrampodev.Pontodevenda.Entidade.Usuario;
import com.primeirotrampodev.Pontodevenda.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario criarUsuario(Usuario usuario){

        return usuarioRepository.save(usuario);

    }
}
