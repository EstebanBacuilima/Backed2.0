package ista.Backed20.api.service;

import ista.Backed20.api.entity.Empresa;

import java.util.List;

public interface EmpresaService {

    public Empresa save(Empresa empresa);

    public List<Empresa> findAll();

    public Empresa findById(Long id);

    public void delete(Long id);

    public Empresa actualizar(Empresa empresa);

}
