package pe.edu.upc.demogrupo3_sv64.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demogrupo3_sv64.entities.Metas;

@Repository
public interface IMetasRepository extends JpaRepository <Metas, Integer>{
}
