package com.project.spe.controller;

import com.project.spe.visitante.Visitante;
import com.project.spe.visitante.VisitanteRepository;
import com.project.spe.visitante.VisitanteRequestDTO;
import com.project.spe.visitante.VisitanteResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("visitante")
public class VisitanteController {

    @Autowired
    private VisitanteRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void registrarVisitante(@RequestBody VisitanteRequestDTO data) {
        Visitante dadosVisitante = new Visitante(data);
        repository.save(dadosVisitante);
        return;
    }
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<VisitanteResponseDTO> getAll(){

        List<VisitanteResponseDTO> listaVisitantes = repository.findAll().stream().map(VisitanteResponseDTO::new).toList();
        return listaVisitantes;
    }
}
