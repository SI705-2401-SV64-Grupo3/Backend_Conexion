package pe.edu.upc.demogrupo3_sv64.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demogrupo3_sv64.dtos.MetasDTO;
import pe.edu.upc.demogrupo3_sv64.entities.Metas;
import pe.edu.upc.demogrupo3_sv64.servicesinterfaces.IMetasService;

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
}
