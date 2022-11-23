package ista.Backed20.api.service;

import ista.Backed20.api.repository.PersonaRepository;
import ista.Backed20.api.entity.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class PersonaServiceImpl implements PersonaService {
	
	@Autowired
	private PersonaRepository personaRepository;
	

    @Override
    public List<Persona> findAll() {
        // TODO Auto-generated method stub
        return (List<Persona>) personaRepository.findAll();
    }

    @Override
    public Persona save(Persona persona) {
        // TODO Auto-generated method stub
        return personaRepository.save(persona);
    }


    @Override
    public Persona findById(Long id) {
        // TODO Auto-generated method stub
        return personaRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        // TODO Auto-generated method stub
    	personaRepository.deleteById(id);

    }
	

}
