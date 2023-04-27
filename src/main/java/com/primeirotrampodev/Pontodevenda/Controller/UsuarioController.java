package com.primeirotrampodev.Pontodevenda.Controller;

import com.primeirotrampodev.Pontodevenda.Entidade.Usuario;
import com.primeirotrampodev.Pontodevenda.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value ="/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping(value = "/salvar")
    public Usuario criarUsuario(@RequestBody Usuario usuario) {

        return usuarioService.criarUsuario(usuario);
    }

    @PutMapping(value = "/atualizar")
    public Usuario atualizarUsuario(@RequestBody Usuario usuario){
        return usuarioService.atualizarUsuario(usuario);
    }

    @GetMapping(value = "/list")
    public List<Usuario> usuarioList(){
        return usuarioService.usuarioList();
    }

    @DeleteMapping(value = "/delete")
    public void deleteUsuario(@RequestBody Usuario usuario){
        usuarioService.usuarioDelete(usuario);
    }



}
