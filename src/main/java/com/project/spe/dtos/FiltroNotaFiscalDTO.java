package com.project.spe.dtos;

public class FiltroNotaFiscalDTO {
    private String nome;
    private Long CPF;
    private String placaCarro;
    private String nomeEmpresa;
    private String situacao;
    private String data;
    private String hora;
    private Long numeroNF;

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

    public String getSituacao() {
        return situacao;
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

}
