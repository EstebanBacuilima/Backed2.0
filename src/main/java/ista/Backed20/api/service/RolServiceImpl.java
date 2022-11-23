package ista.Backed20.api.service;

import ista.Backed20.api.repository.RolRepository;
import ista.Backed20.api.repository.UsuarioRolRepository;
import ista.Backed20.api.entity.Rol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class RolServiceImpl implements RolService {
	
	@Autowired
    private RolRepository rolRepository;
	
	@Autowired
    private UsuarioRolRepository userRolRepository;

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
