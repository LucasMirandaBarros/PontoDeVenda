package com.primeirotrampodev.Pontodevenda.Controller;

import com.primeirotrampodev.Pontodevenda.Entidade.Usuario;
import com.primeirotrampodev.Pontodevenda.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping(value = "/salvar")
    public Usuario criarUsuario(@RequestBody Usuario usuario) {

        return usuarioService.criarUsuario(usuario);
    }

    @PostMapping(value = "/atualizar")
    public Usuario atualizarUsuario(@RequestBody Usuario usuario){
        return usuarioService.atualizarUsuario(usuario);
    }

}