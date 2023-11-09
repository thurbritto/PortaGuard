package com.project.spe.controller;

import com.project.spe.notafiscal.NotaFiscal;
import com.project.spe.notafiscal.NotaFiscalRepository;
import com.project.spe.notafiscal.NotaFiscalRequestDTO;
import com.project.spe.notafiscal.NotaFiscalResponseDTO;
import com.project.spe.visitante.Visitante;
import com.project.spe.visitante.VisitanteRequestDTO;
import com.project.spe.visitante.VisitanteResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("nf")
public class NotaFiscalController {

    @Autowired
    private NotaFiscalRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void registrarNotaFiscal(@RequestBody NotaFiscalRequestDTO data) {
        NotaFiscal dadosNotaFiscal = new NotaFiscal(data);
        repository.save(dadosNotaFiscal);
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<NotaFiscalResponseDTO> getAll() {

        List<NotaFiscalResponseDTO> listaNotaFiscais = repository.findAll().stream().map(NotaFiscalResponseDTO::new).toList();
        return listaNotaFiscais;
    }
}
