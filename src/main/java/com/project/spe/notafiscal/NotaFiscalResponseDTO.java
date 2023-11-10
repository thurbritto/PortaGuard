package com.project.spe.notafiscal;

public record NotaFiscalResponseDTO(String nome, Long id, Long CPF, String placaCarro, String dataHora, String nomeEmpresa, String email, Long telefone, Long numeroNF, String situacao) {
    public NotaFiscalResponseDTO(NotaFiscal notaFiscal) {
        this(notaFiscal.getNome(), notaFiscal.getId(), notaFiscal.getCPF(), notaFiscal.getPlacaCarro(),
            notaFiscal.getDataHora(), notaFiscal.getNomeEmpresa(), notaFiscal.getEmail(),
            notaFiscal.getTelefone(), notaFiscal.getNumeroNF(), notaFiscal.getSituacao());
    }
}
