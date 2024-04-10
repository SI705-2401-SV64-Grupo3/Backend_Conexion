package pe.edu.upc.demogrupo3_sv64.servicesinterfaces;

import pe.edu.upc.demogrupo3_sv64.entities.Metas;

import java.util.List;

public interface IMetasService {

    public void insert(Metas m);

    public List<Metas> list();

    public void delete(int id);

    public Metas listId(int id);


    public List<String[]> quantityGoalsByUser();
}
