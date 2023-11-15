package com.project.spe.notafiscal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface NotaFiscalRepository extends JpaRepository<NotaFiscal, Long> {

    @Query("SELECT nf FROM nf " +
            "WHERE (:nome IS NULL OR nome LIKE %:nome%) " +
            "AND (:cpf IS NULL OR CPF LIKE %:cpf%) " +
            "AND (:placaCarro IS NULL OR placaCarro LIKE %:placaCarro%) " +
            "AND (:dataHora IS NULL OR dataHora LIKE %:dataHora%) " +
            "AND (:nomeEmpresa IS NULL OR nomeEmpresa LIKE %:nomeEmpresa%) " +
            "AND (:email IS NULL OR email LIKE %:email%) " +
            "AND (:telefone IS NULL OR telefone LIKE %:telefone%) " +
            "AND (:numeroNF IS NULL OR numeroNF LIKE %:numeroNF%) " +
            "AND (:situacao IS NULL OR situacao LIKE %:situacao%) " +
            "AND (:idPorteiro IS NULL OR idPorteiro LIKE %:idPorteiro%)")
    List<NotaFiscal> filter(
            @Param("nome") String nome,
            @Param("cpf") String cpf,
            @Param("placaCarro") String placaCarro,
            @Param("dataHora") String dataHora,
            @Param("nomeEmpresa") String nomeEmpresa,
            @Param("email") String email,
            @Param("telefone") String telefone,
            @Param("numeroNF") String numeroNF,
            @Param("situacao") String situacao,
            @Param("idPorteiro") String idPorteiro
    );
}
