package com.primeirotrampodev.Pontodevenda.converter;

import com.primeirotrampodev.Pontodevenda.Entidade.Produto;
import com.primeirotrampodev.Pontodevenda.dto.ProdutoDto;

public abstract class ProdutoConverter {

    public static Produto produtoDtoToProduto(ProdutoDto produtoDto){

        Produto produto = new Produto();
        produto.setNome(produtoDto.getNome());
        produto.setPreco(produtoDto.getPreco());

        return produto;
    }
}
