package com.primeirotrampodev.Pontodevenda.Service;

import com.primeirotrampodev.Pontodevenda.Entidade.Produto;
import com.primeirotrampodev.Pontodevenda.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public Produto salvarProduto(Produto produto){
        return produtoRepository.save(produto);
    }

    public Produto editarProduto(Produto produto){
        return produtoRepository.save(produto);
    }

    public List<Produto> listaDeProdutos() {
        return produtoRepository.findAll();
    }

    public void deletarProduto(Produto produto) {
        produtoRepository.delete(produto);
    }
}
