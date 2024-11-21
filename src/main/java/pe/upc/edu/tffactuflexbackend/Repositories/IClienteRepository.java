package pe.upc.edu.tffactuflexbackend.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.upc.edu.tffactuflexbackend.Entities.Cliente;

public interface IClienteRepository extends JpaRepository<Cliente, Long> {
}
