package com.primeirotrampodev.Pontodevenda.Controller;

import com.primeirotrampodev.Pontodevenda.Entidade.Fornecedor;
import com.primeirotrampodev.Pontodevenda.Service.FornecedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/fornecedor")
public class FornecedorController {

    @Autowired
    private FornecedorService fornecedorService;

    @PostMapping(value = "/salvar")
    public Fornecedor getFornecedor(@RequestBody Fornecedor fornecedor) {

        return fornecedorService.getFornecedor(fornecedor);
    }
    @PutMapping(value = "/atualizar")
    public Fornecedor editFornecedor(@RequestBody Fornecedor fornecedor){

        return fornecedorService.atualizarFornecedor(fornecedor);

    }
}

