package com.project.spe.repositories;

import com.project.spe.notafiscal.NotaFiscal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface NotaFiscalRepository extends JpaRepository<NotaFiscal, Long> {
    @Query("SELECT n FROM nf n " +
            "WHERE (:nome IS NULL OR n.nome = :nome) " +
            "AND (:cpf IS NULL OR n.CPF = :cpf) " +
            "AND (:placaCarro IS NULL OR n.placaCarro = :placaCarro) " +
            "AND (:nomeEmpresa IS NULL OR n.nomeEmpresa = :nomeEmpresa) " +
            "AND (:data IS NULL OR n.data = :data) " +
            "AND (:hora IS NULL OR n.hora = :hora) " +
            "AND (:numeroNF IS NULL OR n.numeroNF = :numeroNF) " +
            "AND (:situacao IS NULL OR n.situacao = :situacao)")
    List<NotaFiscal> findNotaFiscalByFiltros(
            @Param("nome") String nome,
            @Param("cpf") Long cpf,
            @Param("placaCarro") String placaCarro,
            @Param("nomeEmpresa") String nomeEmpresa,
            @Param("situacao") String situacao,
            @Param("data") String data,
            @Param("hora") String hora,
            @Param("numeroNF") Long numeroNF);
}
