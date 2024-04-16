package pe.edu.upc.demogrupo3_sv64.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demogrupo3_sv64.entities.Rol;

@Repository
public interface IRolRepository extends JpaRepository<Rol, Integer> {
}
