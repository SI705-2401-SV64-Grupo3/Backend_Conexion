package pe.edu.upc.demogrupo3_sv64.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demogrupo3_sv64.entities.Metas;
import pe.edu.upc.demogrupo3_sv64.repositories.IMetasRepository;
import pe.edu.upc.demogrupo3_sv64.servicesinterfaces.IMetasService;

import java.util.List;

@Service
public class MetasServiceImplement implements IMetasService {
    @Autowired
    private IMetasRepository mR;


    @Override
    public void insert(Metas m) {
        mR.save(m);

    }

    @Override
    public List<Metas> list() {
        return mR.findAll();
    }

    @Override
    public void delete(int id) {
        mR.deleteById(id);

    }

    @Override
    public Metas listId(int id) {
        return mR.findById(id).orElse(new Metas());
    }

    @Override
    public List<String[]> quantityGoalsByUser() {
        return mR.quantityGoalsByUser();
    }


}
