package ista.Backed20.api.service;

import ista.Backed20.api.enums.RolNombre;
import ista.Backed20.api.repository.RolRepository;
import ista.Backed20.api.entity.Rol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


@Service
public class RolServiceImpl implements RolService {
	
	@Autowired
    private RolRepository rolRepository;


    public Optional<Rol> getByNombreRol(RolNombre rolNombre) {
        // TODO Auto-generated method stub
        return rolRepository.findByRolName(rolNombre);
    }

    @Override
    public List<Rol> findAll() {
        // TODO Auto-generated method stub
        return (List<Rol>) rolRepository.findAll();
    }

    @Override
    public Rol save(Rol rol) {
        // TODO Auto-generated method stub
        return rolRepository.save(rol);
    }


    @Override
    public Rol findById(Long id) {
        // TODO Auto-generated method stub
        return rolRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        // TODO Auto-generated method stub
    	rolRepository.deleteById(id);

    }


}
