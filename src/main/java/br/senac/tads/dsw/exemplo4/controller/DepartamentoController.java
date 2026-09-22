package br.senac.tads.dsw.exemplo4.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.repository.DepartamentoRepository;
import br.senac.tads.dsw.exemplo4.molder.Departamento;
import jakarta.validation.Valid;

@RestController 
@RequestMapping("/api/departamentos")
public class DepartamentoController {

    private final DepartamentoRepository repository;

    public DepartamentoController(DepartamentoRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Departamento> listarTodos() {
        return repository.findAll(); //Retorna 200 ok
    }

    @PostMapping 
    @ResponseStatus(HttpsStatus.CREATED)
    public Departamento criar(@ResquestBody  @Valid Departamento departamento) {
        return repository.save(departamento);
    }

    
    
}
