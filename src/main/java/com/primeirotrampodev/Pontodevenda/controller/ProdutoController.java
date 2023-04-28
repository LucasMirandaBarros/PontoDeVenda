package com.primeirotrampodev.Pontodevenda.Controller;

import com.primeirotrampodev.Pontodevenda.Entidade.Produto;
import com.primeirotrampodev.Pontodevenda.Service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/produto")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @PostMapping(value = "/salvar")
    public Produto salvarProduto(@RequestBody Produto produto){
        return produtoService.salvarProduto(produto);

    }

    @PutMapping(value = "/editar")
    public Produto editarProduto(@RequestBody Produto produto){
        return produtoService.editarProduto(produto);
    }

    @GetMapping(value = "/lista")
    public List<Produto> listaDeProdutos(){
        return produtoService.listaDeProdutos();
    }

    @DeleteMapping(value = "/deletar")
    public void deletarProduto(@RequestBody Produto produto){
        produtoService.deletarProduto(produto);
    }

}
