package pe.edu.upc.conexion_24.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.conexion_24.entities.Users;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
    public List<Users> findByFechaNacimiento (LocalDate fechaNacimiento);
   /** public List<Users> findByGenero (String Genero);*/
   @Query("select u from Users u WHERE u.Genero =:genero")
   public List<Users> getUsersByGenero(@Param("genero") String genero);

    public Users findByUsername(String username);


}
