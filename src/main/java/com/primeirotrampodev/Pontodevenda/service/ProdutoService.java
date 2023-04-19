package com.primeirotrampodev.Pontodevenda.service;

import com.primeirotrampodev.Pontodevenda.entity.Produto;
import com.primeirotrampodev.Pontodevenda.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public Produto salvarProduto(Produto produto){
        return produtoRepository.save(produto);
    }
}
