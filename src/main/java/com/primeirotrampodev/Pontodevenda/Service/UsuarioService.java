package com.primeirotrampodev.Pontodevenda.Service;

import com.primeirotrampodev.Pontodevenda.Entidade.Usuario;
import com.primeirotrampodev.Pontodevenda.Repository.UsuarioRepository;
import com.primeirotrampodev.Pontodevenda.converter.UsuarioConverter;
import com.primeirotrampodev.Pontodevenda.dto.UsuarioDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario criarUsuario(UsuarioDto usuarioDto){

        Usuario usuario = UsuarioConverter.usuarioDtoToUsuario(usuarioDto);

        return usuarioRepository.save(usuario);

    }

    public Usuario atualizarUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public List<Usuario> usuarioList(){
        return usuarioRepository.findAll();
    }

    public void usuarioDelete(Usuario usuario){
        usuarioRepository.delete(usuario);

    }
}
