package com.primeirotrampodev.Pontodevenda.Service;

import com.primeirotrampodev.Pontodevenda.Entidade.Fornecedor;
import com.primeirotrampodev.Pontodevenda.Repository.FornecedorRepository;
import com.primeirotrampodev.Pontodevenda.converter.FornecedorConverter;
import com.primeirotrampodev.Pontodevenda.dto.FornecedorDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FornecedorService {

    @Autowired
    private FornecedorRepository fornecedorRepository;

    public Fornecedor getFornecedor(FornecedorDto fornecedorDto) {

        Fornecedor fornecedor = FornecedorConverter.fornecedorDtotoFornecedor(fornecedorDto);

        return fornecedorRepository.save(fornecedor);
    }

    public Fornecedor atualizarFornecedor(FornecedorDto fornecedorDto){

        Fornecedor fornecedor = FornecedorConverter.fornecedorDtotoFornecedor(fornecedorDto);

        return fornecedorRepository.save(fornecedor);
    }

    public List<Fornecedor> listarTodosFornecedores(){

        return fornecedorRepository.findAll();
    }
    public void deletarFornecedor(Integer id){

        fornecedorRepository.deleteById(id);
    }
}
