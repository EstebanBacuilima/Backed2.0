package ista.Backed20.api.service;

import ista.Backed20.api.entity.Usuario;

public interface UsuarioService {

    public Usuario guardarUsuario(Usuario usuario);
    
    public Usuario obtenerUsuario(String username);
    
    public void eliminarUsuario(Long id_usuario);
    
    

}
