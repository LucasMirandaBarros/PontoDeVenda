package com.primeirotrampodev.Pontodevenda.Controller;

import com.primeirotrampodev.Pontodevenda.Entidade.Produto;
import com.primeirotrampodev.Pontodevenda.Service.ProdutoService;
import com.primeirotrampodev.Pontodevenda.dto.ProdutoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/produto")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @PostMapping(value = "/salvar")
    public Produto salvarProduto(@RequestBody ProdutoDto produtoDto){
        return produtoService.salvarProduto(produtoDto);

    }

    @PutMapping(value = "/editar")
    public Produto editarProduto(@RequestBody ProdutoDto produtoDto){
        return produtoService.editarProduto(produtoDto);
    }

    @GetMapping(value = "/lista")
    public List<Produto> listaDeProdutos(){
        return produtoService.listaDeProdutos();
    }

    @GetMapping(value = "/deletar")
    public void deletarProduto(@RequestParam("id") Integer id){
        produtoService.deletarProduto(id);
    }

}
