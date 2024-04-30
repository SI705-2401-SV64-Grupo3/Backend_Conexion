package pe.edu.upc.conexion_24.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.conexion_24.entities.Publication;

import java.util.List;

@Repository
public interface PublicationRepository extends JpaRepository<Publication, Long> {

    @Query(value = "select u.name as Usuario, count(*) as Publicaciones\n" +
            "                        from users u  inner join publication p \n" +
            "                        on u.id=p.user_id \n" +
            "                       group by u.name\n" +
            "\t\t\t\t\t   ORDER BY COUNT(*) DESC;",nativeQuery = true)
    public List<String[]> PublicationByUser();
}
