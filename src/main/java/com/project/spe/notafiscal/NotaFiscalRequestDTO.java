package com.project.spe.notafiscal;

public record NotaFiscalRequestDTO(String nome, Long CPF, String placaCarro, String nomeEmpresa, String email, Long telefone, Long numeroNF, String situacao) {
}
