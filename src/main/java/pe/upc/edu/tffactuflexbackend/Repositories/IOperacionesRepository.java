package pe.upc.edu.tffactuflexbackend.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.upc.edu.tffactuflexbackend.Entities.Operaciones;

import java.util.List;

@Repository
public interface IOperacionesRepository extends JpaRepository<Operaciones, Long> {
    @Query(value = "SELECT o.IdTransaccion, c.nombreEmpresa, o.tipoTasa, o.tasaAsignada, o.saldoFinal, o.fechaPago, o.montoOriginal, o.estado " +
            "FROM Operaciones o " +
            "JOIN o.IdCliente c " +
            "WHERE c.IdCliente = :idCliente", nativeQuery = true)
    List<Object[]> consultarOperacionesPorCliente(@Param("idCliente") Long idCliente);
}
