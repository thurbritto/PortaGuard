package com.project.spe.controller;

import com.project.spe.dtos.FiltroVisitanteDTO;
import com.project.spe.infra.security.AuthenticationFacade;
import com.project.spe.repositories.UserRepository;
import com.project.spe.repositories.VisitanteRepository;
import com.project.spe.visitante.Visitante;
import com.project.spe.visitante.VisitanteRequestDTO;
import com.project.spe.visitante.VisitanteResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("visitante")
public class VisitanteController {

    @Autowired
    private VisitanteRepository visitanteRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private AuthenticationFacade authenticationFacade;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void registrarVisitante(@RequestBody VisitanteRequestDTO data) {
        String nomePorteiro = authenticationFacade.getAuthenticatedUserName();

        Visitante dadosVisitante = new Visitante(data);
        dadosVisitante.setPorteiro(nomePorteiro);
        visitanteRepository.save(dadosVisitante);
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<VisitanteResponseDTO> getAll() {
        List<VisitanteResponseDTO> listaVisitantes = visitanteRepository.findAll().stream().map(VisitanteResponseDTO::new).toList();
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

        List<Visitante> visitantesFiltrados = visitanteRepository.findVisitanteByFiltros(nome, CPF, placaCarro, nomeEmpresa, situacao, data, hora);

        List<VisitanteResponseDTO> listaVisitantes = visitantesFiltrados.stream()
                .map(VisitanteResponseDTO::new)
                .toList();

        return listaVisitantes;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @DeleteMapping
    public void deleteVisitor(@RequestBody Long id) {
        visitanteRepository.deleteById(id);
    }
}
