package com.project.spe.visitante;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


@Table(name = "visitantes")
@Entity(name = "visitantes")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Visitante {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Long CPF;
    private String placaCarro;
    private LocalDateTime dataHora;
    private String nomeEmpresa;
    private String email;
    private Long telefone;
    private String situacao;
    private String motivo;
    private Long porteiro;

    public Visitante(VisitanteRequestDTO data) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        this.nome = data.nome();
        this.CPF = data.CPF();
        this.placaCarro = data.placaCarro();
        this.dataHora = LocalDateTime.now();
        this.nomeEmpresa = data.nomeEmpresa();
        this.email = data.email();
        this.telefone = data.telefone();
        this.situacao = data.situacao();
        this.motivo = data.motivo();
        this.porteiro = data.porteiro();
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

    public LocalDateTime getDataHora() {
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

    public String getSituacao() {
        return situacao;
    }

    public String getMotivo() {
        return motivo;
    }
    public Long getPorteiro() {
        return porteiro;
    }
}
