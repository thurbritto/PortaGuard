package com.project.spe.controller;

import com.project.spe.dtos.FiltroNotaFiscalDTO;
import com.project.spe.notafiscal.NotaFiscal;
import com.project.spe.notafiscal.NotaFiscalRepository;
import com.project.spe.notafiscal.NotaFiscalRequestDTO;
import com.project.spe.notafiscal.NotaFiscalResponseDTO;
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

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/filter")
    public List<NotaFiscalResponseDTO> filter(@RequestBody FiltroNotaFiscalDTO filtro) {
        String nome = filtro.getNome();
        Long CPF = filtro.getCPF();
        String placaCarro = filtro.getPlacaCarro();
        String nomeEmpresa = filtro.getNomeEmpresa();
        String situacao = filtro.getSituacao();
        String data = filtro.getData();
        String hora = filtro.getHora();
        Long numeroNF = filtro.getNumeroNF();

        List<NotaFiscal> notasFiscaisFiltradas = repository.findNotaFiscalByFiltros(nome, CPF, placaCarro, nomeEmpresa, situacao, data, hora, numeroNF);

        List<NotaFiscalResponseDTO> notasFiscais = notasFiscaisFiltradas.stream()
                .map(NotaFiscalResponseDTO::new)
                .toList();

        return notasFiscais;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @DeleteMapping
    public void deleteNotaFiscal(@RequestBody Long id) {
        repository.deleteById(id);
    }
}
