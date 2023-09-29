package com.project.spe.visitante;

public record VisitanteResponseDTO(String nome, Long id, Long CPF, String placaCarro, String dataHora, String nomeEmpresa, String email, Long telefone, String situacao, String motivo) {
    public VisitanteResponseDTO(Visitante visitante) {
        this(visitante.getNome(), visitante.getId(), visitante.getCPF(), visitante.getPlacaCarro(),
                visitante.getDataHora(), visitante.getNomeEmpresa(), visitante.getEmail(),
                visitante.getTelefone(), visitante.getSituacao(), visitante.getMotivo());
    }
}


