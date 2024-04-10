package pe.edu.upc.demogrupo3_sv64.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demogrupo3_sv64.dtos.UsuarioDTO;
import pe.edu.upc.demogrupo3_sv64.entities.Usuario;
import pe.edu.upc.demogrupo3_sv64.servicesinterfaces.IUsuarioService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    private IUsuarioService uG;

    @PostMapping
    public void insertar(@RequestBody UsuarioDTO usuarioDTO){
        ModelMapper m=new ModelMapper();
        Usuario g=m.map(usuarioDTO,Usuario.class);
        uG.insert(g);
    }
    @GetMapping
    public List<UsuarioDTO> listar(){
        return uG.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,UsuarioDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        uG.delete(id);
    }
    @GetMapping("/{id}")
    public UsuarioDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
       UsuarioDTO dto=m.map(uG.listId(id),UsuarioDTO.class);
        return dto;
    }
}
