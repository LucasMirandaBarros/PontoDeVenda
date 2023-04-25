package com.primeirotrampodev.Pontodevenda.Controller;

import com.primeirotrampodev.Pontodevenda.Entidade.Fornecedor;
import com.primeirotrampodev.Pontodevenda.Service.FornecedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/fornecedor")
public class FornecedorController {

    @Autowired
    private FornecedorService fornecedorService;

    @PostMapping(value = "/salvar")
    public Fornecedor getFornecedor(@RequestBody Fornecedor fornecedor) {

        return fornecedorService.getFornecedor(fornecedor);

    }
}

