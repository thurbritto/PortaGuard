package com.project.spe.notafiscal;

public record NotaFiscalResponseDTO(String nome, Long id, Long CPF, String placaCarro, String data, String hora, String nomeEmpresa, String email, Long telefone, Long numeroNF, String situacao, String porteiro) {
    public NotaFiscalResponseDTO(NotaFiscal notaFiscal) {
        this(notaFiscal.getNome(), notaFiscal.getId(), notaFiscal.getCPF(), notaFiscal.getPlacaCarro(),
            notaFiscal.getData(), notaFiscal.getHora(),notaFiscal.getNomeEmpresa(), notaFiscal.getEmail(),
            notaFiscal.getTelefone(), notaFiscal.getNumeroNF(), notaFiscal.getSituacao(), notaFiscal.getPorteiro());
    }
}
