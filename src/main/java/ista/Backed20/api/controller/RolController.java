package ista.Backed20.api.controller;


import ista.Backed20.api.entity.Rol;
import ista.Backed20.api.service.RolServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/rol")
public class RolController {

	@Autowired
	private RolServiceImpl rolService;
	
    @GetMapping("/listarRoles")
    public ResponseEntity<List<Rol>> listarRol(){
        return new ResponseEntity<>(rolService.findAll(), HttpStatus.OK);
    }

    @PostMapping("/guardarRoles")
    public ResponseEntity <Rol> crearRol(@RequestBody Rol rol) {
        return new ResponseEntity<>(rolService.save(rol), HttpStatus.CREATED);
    }

    @DeleteMapping("/eliminarRoles/{id}")
    public ResponseEntity <?> eliminarRol(@PathVariable long id) {
    	rolService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


    @GetMapping("/buscarRolesId/{id}")
    public ResponseEntity <Rol> buscar(@PathVariable Long id) {
        return new ResponseEntity<>(rolService.findById(id), HttpStatus.OK);
    }
}
