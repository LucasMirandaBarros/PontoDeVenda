package com.primeirotrampodev.Pontodevenda.Controller;

import com.primeirotrampodev.Pontodevenda.Entidade.Produto;
import com.primeirotrampodev.Pontodevenda.Service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @PutMapping(value = "/editar")
    public Produto produto1(@RequestBody Produto produto1){
        return produtoService.editarProduto(produto1);
    }


}
