package pe.edu.upc.conexion_24.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.conexion_24.entities.Suggestions;

public interface SuggestionsRepository extends JpaRepository<Suggestions, Long> {
}
