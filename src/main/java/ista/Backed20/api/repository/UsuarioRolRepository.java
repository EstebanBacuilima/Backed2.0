package ista.Backed20.api.repository;


import ista.Backed20.api.entity.Permisos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRolRepository extends JpaRepository<Permisos, Long> {

}
