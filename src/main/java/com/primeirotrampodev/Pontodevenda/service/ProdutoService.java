package com.primeirotrampodev.Pontodevenda.Service;

import com.primeirotrampodev.Pontodevenda.Entidade.Produto;
import com.primeirotrampodev.Pontodevenda.converter.ProdutoConverter;
import com.primeirotrampodev.Pontodevenda.dto.ProdutoDto;
import com.primeirotrampodev.Pontodevenda.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public Produto salvarProduto(ProdutoDto produtoDto){

        Produto produto = ProdutoConverter.produtoDtoToProduto(produtoDto);

        return produtoRepository.save(produto);
    }

    public Produto editarProduto(ProdutoDto produtoDto){

        Produto produto = ProdutoConverter.produtoDtoToProduto(produtoDto);

        return produtoRepository.save(produto);
    }

    public List<Produto> listaDeProdutos() {
        return produtoRepository.findAll();
    }

    public void deletarProduto(Integer idProduto) {

        Optional<Produto> produto = produtoRepository.findById(idProduto);

        produtoRepository.delete(produto.get());
    }
}
