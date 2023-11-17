package com.project.spe.visitante;

public record VisitanteRequestDTO(String nome, Long CPF, String placaCarro, String nomeEmpresa, String email, Long telefone, String situacao, String motivo) {
}
