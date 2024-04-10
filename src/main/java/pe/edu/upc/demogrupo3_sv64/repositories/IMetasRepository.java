package pe.edu.upc.demogrupo3_sv64.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demogrupo3_sv64.entities.Metas;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IMetasRepository extends JpaRepository <Metas, Integer>{

    @Query(value = "select u.name_usuario as Usuario, count(*) as Metas_Cantidad \n" +
            "            from usuario u inner join metas m \n" +
            "            on u.id_usuario=m.usuario_id \n" +
            "            group by u.name_usuario ", nativeQuery = true)
    public List<String[]> quantityGoalsByUser();


}

