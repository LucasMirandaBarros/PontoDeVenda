package com.primeirotrampodev.Pontodevenda.Controller;

import com.primeirotrampodev.Pontodevenda.Entidade.Fornecedor;
import com.primeirotrampodev.Pontodevenda.Service.FornecedorService;
import com.primeirotrampodev.Pontodevenda.dto.FornecedorDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/fornecedor")
public class FornecedorController {

    @Autowired
    private FornecedorService fornecedorService;

    @PostMapping(value = "/salvar")
    public Fornecedor getFornecedor(@RequestBody FornecedorDto fornecedorDto) {

        return fornecedorService.getFornecedor(fornecedorDto);
    }
    @PutMapping(value = "/atualizar")
    public Fornecedor editFornecedor(@RequestBody FornecedorDto fornecedorDto){

        return fornecedorService.atualizarFornecedor(fornecedorDto);

    }

    @GetMapping(value = "/lista-fornecedores")
    public List<Fornecedor> fornecedorList(){

        return fornecedorService.listarTodosFornecedores();
    }
    @GetMapping(value = "/deletar-fornecedor")
    public void deletafornecedor(@RequestParam("id") Integer id){
        fornecedorService.deletarFornecedor(id);
    }

}

