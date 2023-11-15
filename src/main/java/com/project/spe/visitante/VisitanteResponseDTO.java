package com.project.spe.visitante;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public record VisitanteResponseDTO(String nome, Long id, Long CPF, String placaCarro, LocalDateTime dataHora, String nomeEmpresa, String email, Long telefone, String situacao, String motivo, Long porteiro) {
    public VisitanteResponseDTO(Visitante visitante) {
        this(visitante.getNome(), visitante.getId(), visitante.getCPF(), visitante.getPlacaCarro(),
                visitante.getDataHora(), visitante.getNomeEmpresa(), visitante.getEmail(),
                visitante.getTelefone(), visitante.getSituacao(), visitante.getMotivo(), visitante.getPorteiro());
    }
}


