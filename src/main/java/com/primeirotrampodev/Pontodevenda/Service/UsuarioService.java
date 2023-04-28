package com.primeirotrampodev.Pontodevenda.Service;

import com.primeirotrampodev.Pontodevenda.Entidade.Usuario;
import com.primeirotrampodev.Pontodevenda.Repository.UsuarioRepository;
import com.primeirotrampodev.Pontodevenda.converter.UsuarioConverter;
import com.primeirotrampodev.Pontodevenda.dto.UsuarioDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario criarUsuario(UsuarioDto usuarioDto){

        Usuario usuario = UsuarioConverter.usuarioDtoToUsuario(usuarioDto);

        return usuarioRepository.save(usuario);

    }

    public Usuario atualizarUsuario(UsuarioDto usuarioDto){

        Usuario usuario = UsuarioConverter.usuarioDtoToUsuario(usuarioDto);

        return usuarioRepository.save(usuario);
    }

    public List<Usuario> usuarioList(){

        return usuarioRepository.findAll();
    }

    public void usuarioDelete(Integer idUsuario){

        Optional<Usuario> usuario = usuarioRepository.findById(idUsuario);

        usuarioRepository.delete(usuario.get());

    }
}
