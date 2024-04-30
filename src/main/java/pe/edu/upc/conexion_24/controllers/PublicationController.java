package pe.edu.upc.conexion_24.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.conexion_24.dtos.LikeByUsersDTO;
import pe.edu.upc.conexion_24.dtos.PublicationByUsersDTO;
import pe.edu.upc.conexion_24.dtos.PublicationDTO;
import pe.edu.upc.conexion_24.entities.Publication;
import pe.edu.upc.conexion_24.servicesinterfaces.PublicationService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@RestController
@RequestMapping("/publicacion")
@PreAuthorize("hasAnyAuthority('PADRE','HIJO','ADMIN')")
public class PublicationController {
    @Autowired
    private PublicationService pS;

    @GetMapping
    public List<PublicationDTO> lista(){
        return pS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,PublicationDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void registrar(@RequestBody PublicationDTO dto) {
        ModelMapper m = new ModelMapper();
        Publication p = m.map(dto, Publication.class);
        pS.insert(p);
    }

    @GetMapping("/publicacionesusuarios")
    public List<PublicationByUsersDTO> publicaciones() {
        List<String[]> filaLista = pS.PublicationByUser();
        List<PublicationByUsersDTO> dtoLista = new ArrayList<>();

        for (String[] columna : filaLista) {
            PublicationByUsersDTO dto = new PublicationByUsersDTO();
            dto.setName(columna[0]);
            dto.setPublicationByUser(Integer.parseInt(columna[1]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }

    @GetMapping("/likesusuarios")
    public List<LikeByUsersDTO> likes() {
        List<String[]> filaLista = pS.LikesByUser();
        List<LikeByUsersDTO> dtoLista = new ArrayList<>();

        for (String[] columna : filaLista) {
            LikeByUsersDTO dto = new LikeByUsersDTO();
            dto.setName(columna[0]);
            dto.setMostLikesUser(Integer.parseInt(columna[1]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }

    @PutMapping
    public void modificar(@RequestBody PublicationDTO pdto) {
        ModelMapper m = new ModelMapper();
        Publication p= m.map(pdto, Publication.class);
        pS.insert(p);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Long id) {
        pS.delete(id);
    }


}
