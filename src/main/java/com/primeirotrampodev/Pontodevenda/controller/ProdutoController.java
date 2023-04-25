package com.primeirotrampodev.Pontodevenda.controller;

import com.primeirotrampodev.Pontodevenda.entity.Produto;
import com.primeirotrampodev.Pontodevenda.repository.ProdutoRepository;
import com.primeirotrampodev.Pontodevenda.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/produto")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @PostMapping(value = "/salvar")
    public Produto produto(@RequestBody Produto produto){
        return produtoService.salvarProduto(produto);

    }


}
