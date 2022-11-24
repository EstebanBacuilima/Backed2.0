package ista.Backed20.api.repository;


import ista.Backed20.api.entity.Rol;
import ista.Backed20.api.enums.RolNombre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface RolRepository extends JpaRepository<Rol, Long> {

    Optional<Rol> findByRolName(RolNombre rolNombre);
}
