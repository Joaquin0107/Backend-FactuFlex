package pe.upc.edu.tffactuflexbackend.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.upc.edu.tffactuflexbackend.Entities.Role;

@Repository
public interface IRoleRepository extends JpaRepository<Role, Long> {
}
