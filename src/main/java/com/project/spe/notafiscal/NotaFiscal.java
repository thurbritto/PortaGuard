package com.project.spe.notafiscal;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Table(name = "nf")
@Entity(name = "nf")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class NotaFiscal {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Long CPF;
    private String placaCarro;
    private String dataHora;
    private String nomeEmpresa;
    private String email;
    private Long telefone;
    private Long numeroNF;
    private String situacao;
    private Long idPorteiro;

    public NotaFiscal(NotaFiscalRequestDTO data) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        this.nome = data.nome();
        this.CPF = data.CPF();
        this.placaCarro = data.placaCarro();
        this.dataHora = dtf.format(LocalDateTime.now());
        this.nomeEmpresa = data.nomeEmpresa();
        this.email = data.email();
        this.telefone = data.telefone();
        this.numeroNF = data.numeroNF();
        this.situacao = data.situacao();
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Long getCPF() {
        return CPF;
    }

    public String getPlacaCarro() {
        return placaCarro;
    }

    public String getDataHora() {
        return dataHora;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public String getEmail() {
        return email;
    }

    public Long getTelefone() {
        return telefone;
    }

    public Long getNumeroNF() {
        return numeroNF;
    }

    public String getSituacao() {
        return situacao;
    }
}
