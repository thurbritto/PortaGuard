package com.project.spe.notafiscal;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;

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
    private String data;
    private String hora;
    private String nomeEmpresa;
    private String email;
    private Long telefone;
    private String situacao;
    private Long numeroNF;
    private String porteiro;

    public NotaFiscal(NotaFiscalRequestDTO data) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        this.nome = data.nome();
        this.CPF = data.CPF();
        this.placaCarro = data.placaCarro();
        this.nomeEmpresa = data.nomeEmpresa();
        this.email = data.email();
        this.telefone = data.telefone();
        this.situacao = data.situacao();
        this.numeroNF = data.numeroNF();
        this.data = simpleDateFormat.format(Date.valueOf(LocalDate.now()));
        this.hora = String.valueOf(LocalTime.now().withNano(0));
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

    public String getPorteiro() {
        return porteiro;
    }
    public String getData() {
        return data;
    }

    public String getHora() {
        return hora;
    }

    public Long getNumeroNF() {
        return numeroNF;
    }

    public void setPorteiro(String nomePorteiro) {
        this.porteiro = nomePorteiro;
    }
}
