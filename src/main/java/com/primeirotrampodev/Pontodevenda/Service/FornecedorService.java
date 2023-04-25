package com.primeirotrampodev.Pontodevenda.Service;

import com.primeirotrampodev.Pontodevenda.Entidade.Fornecedor;
import com.primeirotrampodev.Pontodevenda.Repository.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FornecedorService {

    @Autowired
    private FornecedorRepository fornecedorRepository;

    public Fornecedor getFornecedor(Fornecedor fornecedor) {

        return fornecedorRepository.save(fornecedor);
    }
}
