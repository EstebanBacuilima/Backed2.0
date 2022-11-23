package ista.Backed20.api.controller;

import ista.Backed20.api.entity.Empresa;
import ista.Backed20.api.service.EmpresaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/empresa")
public class EmpresaController {

    @Autowired
    private EmpresaServiceImpl empresaService;

    // Listar cliente
    @GetMapping("/listarcom")
    public ResponseEntity<List<Empresa>> listarcompra(){
        return new ResponseEntity<>(empresaService.findAll(), HttpStatus.OK);
    }

    // Crear cliente
    @PostMapping("/crearcom")
    public ResponseEntity <Empresa> crearcompra(@RequestBody Empresa empre) {
        return new ResponseEntity<>(empresaService.save(empre), HttpStatus.CREATED);

    }

    // Elimnar cliente
    @DeleteMapping("/eliminarcom/{id}")
    public ResponseEntity <?> eliminarcompra(@PathVariable long id) {
        empresaService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    // Buscar cliente
    @GetMapping("/com/{id}")
    public ResponseEntity <Empresa> buscar(@PathVariable Long id) {
        return new ResponseEntity<>(empresaService.findById(id), HttpStatus.OK);
    }

    // Actulizar cliente
    /*@PutMapping("/actualizarcom/{id}")
    public ResponseEntity <Empresa> actulizarcompra(@RequestBody Empresa empre, @PathVariable long id) {
        Empresa empresa = empresaService.findById(id);
        if (empre ==null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        try {
            empresa.setRuc(empresa.getRuc());
            empresa.setNombre(empresa.getNombre());
            return new ResponseEntity<>(empresaService.save(empresa), HttpStatus.CREATED);
        }catch (DataAccessException e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }*/
}
