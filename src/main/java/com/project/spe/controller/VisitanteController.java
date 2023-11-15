package com.project.spe.controller;

import com.project.spe.visitante.Visitante;
import com.project.spe.visitante.VisitanteRepository;
import com.project.spe.visitante.VisitanteRequestDTO;
import com.project.spe.visitante.VisitanteResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

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
    @GetMapping("/filter")
    public List<VisitanteResponseDTO> filter(
            @RequestParam(required = false) String nome,
            @RequestParam(required = false) Long cpf,
            @RequestParam(required = false) String placaCarro,
            @RequestParam(required = false) LocalDateTime dataHora,
            @RequestParam(required = false) String nomeEmpresa,
            @RequestParam(required = false) String situacao) {

        List<Visitante> visitantesFiltrados = repository.findVisitanteByFiltros(nome, cpf, placaCarro, dataHora, nomeEmpresa, situacao);

        List<VisitanteResponseDTO> listaVisitantes = visitantesFiltrados.stream()
                .map(VisitanteResponseDTO::new)
                .toList();

        return listaVisitantes;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @DeleteMapping
    public void deleteVisitor(@RequestBody Long id) {
        repository.deleteById(id);
    }
}
