package pe.edu.upc.demogrupo3_sv64.servicesinterfaces;

import pe.edu.upc.demogrupo3_sv64.entities.Rol;

import java.util.List;

public interface IRolService {
    public void insert(Rol rol);

    public List<Rol> list();

    public void delete(int idRol);

    public Rol listarId(int idRol);
}
