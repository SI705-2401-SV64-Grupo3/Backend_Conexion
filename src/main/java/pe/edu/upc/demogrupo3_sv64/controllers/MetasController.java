package pe.edu.upc.demogrupo3_sv64.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demogrupo3_sv64.dtos.MetasByUsuarioDTO;
import pe.edu.upc.demogrupo3_sv64.dtos.MetasDTO;
import pe.edu.upc.demogrupo3_sv64.entities.Metas;
import pe.edu.upc.demogrupo3_sv64.servicesinterfaces.IMetasService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/metas")
public class MetasController {

    @Autowired
    private IMetasService iM;

    @PostMapping
    public void insertar_metas(@RequestBody MetasDTO metasDTO){
        ModelMapper m =new ModelMapper();
        Metas mt=m.map(metasDTO, Metas.class);
        iM.insert(mt);

    }

    @GetMapping
    public List<MetasDTO> listar_metas(){
        return iM.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,MetasDTO.class);
        }).collect(Collectors.toList());

    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        iM.delete(id);
    }

    @GetMapping("/{id}")
    public MetasDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        MetasDTO dto=m.map(iM.listId(id),MetasDTO.class);
        return dto;
    }

    @GetMapping("/cantidades")
    public List<MetasByUsuarioDTO> cantidad(){
        List<String[]> filaLista=iM.quantityGoalsByUser();
        List<MetasByUsuarioDTO> dtoLista=new ArrayList<>();
        for(String[] columna:filaLista){
            MetasByUsuarioDTO dto=new MetasByUsuarioDTO();
            dto.setNameUser(columna[0]);
            dto.setQuantityMetas(Integer.parseInt(columna[1]));
            dtoLista.add(dto);
        }
        return dtoLista;

    }


}
