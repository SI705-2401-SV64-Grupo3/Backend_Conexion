package pe.edu.upc.demogrupo3_sv64.servicesinterfaces;

import pe.edu.upc.demogrupo3_sv64.entities.Usuario;

import java.util.List;

public interface IUsuarioService {
    public void insert (Usuario us);
    public List<Usuario> list();
    public Usuario listId(int id);
    public void delete(int id);


}
