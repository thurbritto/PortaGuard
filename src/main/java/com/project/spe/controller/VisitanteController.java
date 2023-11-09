package com.project.spe.controller;

import com.project.spe.visitante.Visitante;
import com.project.spe.visitante.VisitanteRepository;
import com.project.spe.visitante.VisitanteRequestDTO;
import com.project.spe.visitante.VisitanteResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.Set;

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
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<VisitanteResponseDTO> getAll() {

        List<VisitanteResponseDTO> listaVisitantes = repository.findAll().stream().map(VisitanteResponseDTO::new).toList();
        return listaVisitantes;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @DeleteMapping
    public void deleteVisitor(@RequestBody Long id) {
        repository.deleteById(id);
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PutMapping
    public void updateVisitor(@RequestBody Long id, Optional<String> nome) {
        Optional<VisitanteResponseDTO> visitante = repository.findById(id).map(VisitanteResponseDTO::new);

    }
}
