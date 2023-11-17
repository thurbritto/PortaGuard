package com.project.spe.visitante;

public record VisitanteResponseDTO(String nome, Long id, Long CPF, String placaCarro, String data, String hora, String nomeEmpresa, String email, Long telefone, String situacao, String motivo, String porteiro) {
    public VisitanteResponseDTO(Visitante visitante) {
        this(visitante.getNome(), visitante.getId(), visitante.getCPF(), visitante.getPlacaCarro(),
                visitante.getData(), visitante.getHora(), visitante.getNomeEmpresa(), visitante.getEmail(),
                visitante.getTelefone(), visitante.getSituacao(), visitante.getMotivo(), visitante.getPorteiro());
    }
}


