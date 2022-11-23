package ista.Backed20.api.service;


import ista.Backed20.api.entity.Persona;

import java.util.List;

public interface PersonaService {
	
	public Persona save(Persona persona);

    public List<Persona> findAll();

    public Persona findById(Long id);

    public void delete(Long id);

}
