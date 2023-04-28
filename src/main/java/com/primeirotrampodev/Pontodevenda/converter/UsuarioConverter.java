package com.primeirotrampodev.Pontodevenda.converter;

import com.primeirotrampodev.Pontodevenda.Entidade.Usuario;
import com.primeirotrampodev.Pontodevenda.dto.UsuarioDto;

public abstract class UsuarioConverter {

    public static Usuario usuarioDtoToUsuario(UsuarioDto usuarioDto){

        Usuario usuario = new Usuario();
        usuario.setNome(usuarioDto.getNome());
        usuario.setTelefone(usuarioDto.getTelefone());

        return usuario;
    }


}
