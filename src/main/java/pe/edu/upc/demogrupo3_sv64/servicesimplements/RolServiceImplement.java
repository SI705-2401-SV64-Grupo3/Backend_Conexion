package pe.edu.upc.demogrupo3_sv64.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demogrupo3_sv64.entities.Rol;
import pe.edu.upc.demogrupo3_sv64.repositories.IRolRepository;
import pe.edu.upc.demogrupo3_sv64.servicesinterfaces.IRolService;

import java.util.List;

@Service
public class RolServiceImplement implements IRolService {

    @Autowired
    private IRolRepository rR;


    @Override
    public void insert(Rol rol) {
        rR.save(rol);

    }

    @Override
    public List<Rol> list() {
        return rR.findAll();
    }

    @Override
    public void delete(int idRol) {
        rR.deleteById(idRol);

    }

    @Override
    public Rol listarId(int idRol) {
        return rR.findById(idRol).orElse(new Rol());
    }
}
