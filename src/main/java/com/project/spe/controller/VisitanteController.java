package com.project.spe.controller;

import com.project.spe.dtos.FiltroVisitanteDTO;
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
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<VisitanteResponseDTO> getAll() {
        List<VisitanteResponseDTO> listaVisitantes = repository.findAll().stream().map(VisitanteResponseDTO::new).toList();
        return listaVisitantes;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/filter")
    public List<VisitanteResponseDTO> filter(@RequestBody FiltroVisitanteDTO filtro) {
        String nome = filtro.getNome();
        Long CPF = filtro.getCPF();
        String placaCarro = filtro.getPlacaCarro();
        String nomeEmpresa = filtro.getNomeEmpresa();
        String situacao = filtro.getSituacao();
        String data = filtro.getData();
        String hora = filtro.getHora();

        List<Visitante> visitantesFiltrados = repository.findVisitanteByFiltros(nome, CPF, placaCarro, nomeEmpresa, situacao, data, hora);

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
