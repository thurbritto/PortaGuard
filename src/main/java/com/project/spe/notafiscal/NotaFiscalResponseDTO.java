package com.project.spe.notafiscal;

import com.project.spe.visitante.Visitante;

public record NotaFiscalResponseDTO(String nome, Long id, Long CPF, String placaCarro, String dataHora, String nomeEmpresa, String email, Long telefone, String situacao) {
    public NotaFiscalResponseDTO(NotaFiscal notaFiscal) {
        this(notaFiscal.getNome(), notaFiscal.getId(), notaFiscal.getCPF(), notaFiscal.getPlacaCarro(),
            notaFiscal.getDataHora(), notaFiscal.getNomeEmpresa(), notaFiscal.getEmail(),
            notaFiscal.getTelefone(), notaFiscal.getSituacao());
    }
}
