package pe.edu.upc.conexion_24.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.conexion_24.entities.Suggestions;
import pe.edu.upc.conexion_24.repositories.SuggestionsRepository;
import pe.edu.upc.conexion_24.servicesinterfaces.SuggestionsService;

import java.util.List;

@Service
public class Suggestionsimplements implements SuggestionsService {
    @Autowired
    private SuggestionsRepository sR;
    @Override
    public void insert(Suggestions suggestions) {
        sR.save(suggestions);
    }

    @Override
    public List<Suggestions> list() {
        return sR.findAll();
    }

    @Override
    public void delete(Long id) {
        sR.deleteById(id);
    }

    @Override
    public Suggestions listId(Long id) {
        return sR.findById(id).orElse(new Suggestions());
    }
}
