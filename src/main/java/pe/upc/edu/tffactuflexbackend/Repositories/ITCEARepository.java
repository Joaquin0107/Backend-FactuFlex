package pe.upc.edu.tffactuflexbackend.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.upc.edu.tffactuflexbackend.Entities.Tasas;

public interface ITCEARepository extends JpaRepository<Tasas.TCEA, Long> {
}
