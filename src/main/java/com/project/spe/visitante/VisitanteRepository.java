package com.project.spe.visitante;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

@Repository
public interface VisitanteRepository extends JpaRepository<Visitante, Long> {
    @Query("SELECT v FROM visitantes v " +
            "WHERE (:nome IS NULL OR v.nome = :nome) " +
            "AND (:cpf IS NULL OR v.CPF = :cpf) " +
            "AND (:placaCarro IS NULL OR v.placaCarro = :placaCarro) " +
            "AND (:nomeEmpresa IS NULL OR v.nomeEmpresa = :nomeEmpresa) " +
            "AND (:data IS NULL OR v.data = :data) " +
            "AND (:hora IS NULL OR v.hora = :hora) " +
            "AND (:situacao IS NULL OR v.situacao = :situacao)")
    List<Visitante> findVisitanteByFiltros(
            @Param("nome") String nome,
            @Param("cpf") Long cpf,
            @Param("placaCarro") String placaCarro,
            @Param("nomeEmpresa") String nomeEmpresa,
            @Param("situacao") String situacao,
            @Param("data") String data,
            @Param("hora") String hora);
}



