package com.project.spe.visitante;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface VisitanteRepository extends JpaRepository<Visitante, Long> {
    @Query("SELECT v FROM visitantes v WHERE " +
            "(:nome IS NULL OR v.nome = :nome) AND " +
            "(:cpf IS NULL OR v.CPF = :cpf) AND " +
            "(:placaCarro IS NULL OR v.placaCarro = :placaCarro) AND " +
            "(:dataHora IS NULL OR v.dataHora = :dataHora) AND " +
            "(:nomeEmpresa IS NULL OR v.nomeEmpresa = :nomeEmpresa) AND " +
            "(:situacao IS NULL OR v.situacao = :situacao)")
    List<Visitante> findVisitanteByFiltros(String nome, Long cpf, String placaCarro, @Param("dataHora") LocalDateTime dataHora, String nomeEmpresa, String situacao);
}




