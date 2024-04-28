package pe.edu.upc.conexion_24.servicesinterfaces;

import pe.edu.upc.conexion_24.entities.Suggestions;

import java.util.List;

public interface SuggestionsService {
    public void insert (Suggestions suggestions);
    public List<Suggestions> list();
    public void delete(Long id);
    public Suggestions listId(Long id);
}
