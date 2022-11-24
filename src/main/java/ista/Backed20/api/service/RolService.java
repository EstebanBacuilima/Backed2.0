package ista.Backed20.api.service;


import ista.Backed20.api.entity.Rol;

import java.util.List;

public interface RolService {

	public Rol save(Rol rol);

    public List<Rol> findAll();

    public Rol findById(Long id);

    public void delete(Long id);
    
    // ROLES


}
