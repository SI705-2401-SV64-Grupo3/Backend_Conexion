package pe.edu.upc.demogrupo3_sv64.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demogrupo3_sv64.entities.Usuario;
import pe.edu.upc.demogrupo3_sv64.repositories.IUsuarioRepository;
import pe.edu.upc.demogrupo3_sv64.servicesinterfaces.IUsuarioService;

import java.util.List;

@Service
public class UsuarioServiceImplement implements IUsuarioService {
    @Autowired
    private IUsuarioRepository usR;
    @Override
    public void insert(Usuario us) {
        usR.save(us);
    }

    @Override
    public List<Usuario> list() {
        return usR.findAll();
    }

    @Override
    public Usuario listId(int id) {
        return usR.findById(id).orElse(new Usuario());
    }

    @Override
    public void delete(int id) {
        usR.deleteById(id);

    }
}
