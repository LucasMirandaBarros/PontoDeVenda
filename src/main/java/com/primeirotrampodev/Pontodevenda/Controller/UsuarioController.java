package com.primeirotrampodev.Pontodevenda.Controller;

import com.primeirotrampodev.Pontodevenda.Entidade.Usuario;
import com.primeirotrampodev.Pontodevenda.Service.UsuarioService;
import com.primeirotrampodev.Pontodevenda.dto.UsuarioDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value ="/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping(value = "/salvar")
    public Usuario criarUsuario(@RequestBody UsuarioDto usuarioDto) {

        return usuarioService.criarUsuario(usuarioDto);
    }

    @PutMapping(value = "/atualizar")
    public Usuario atualizarUsuario(@RequestBody UsuarioDto usuarioDto){

        return usuarioService.atualizarUsuario(usuarioDto);
    }

    @GetMapping(value = "/list")
    public List<Usuario> usuarioList(){

        return usuarioService.usuarioList();
    }

    @DeleteMapping(value = "/delete")
    public void deleteUsuario(@RequestParam("id")Integer idUsuario){

        usuarioService.usuarioDelete(idUsuario);
    }



}
