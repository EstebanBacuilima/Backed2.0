package ista.Backed20.api.repository;


import ista.Backed20.api.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    public Usuario findByCedula(String cedula);

    public Usuario findByUsername(String username);

    Boolean existsByCedula (String cedula);

    Boolean existsByUsername(String username);
}
