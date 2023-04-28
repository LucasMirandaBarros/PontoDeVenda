package com.primeirotrampodev.Pontodevenda.converter;

import com.primeirotrampodev.Pontodevenda.Entidade.Fornecedor;
import com.primeirotrampodev.Pontodevenda.dto.FornecedorDto;

public abstract class FornecedorConverter {

    public static Fornecedor fornecedorDtotoFornecedor(FornecedorDto fornecedorDto){

        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setNome(fornecedorDto.getNome());
        fornecedor.setTelefone(fornecedorDto.getTelefone());

        return fornecedor;
    }
}
