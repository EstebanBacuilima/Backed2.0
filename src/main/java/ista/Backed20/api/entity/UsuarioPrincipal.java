package ista.Backed20.api.entity;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class UsuarioPrincipal implements UserDetails {

    private String cedula;
    private String nombres;
    private String username;
    private String contrasenia;
    private Boolean estado;
    private Collection< ? extends GrantedAuthority> authorities;

    public UsuarioPrincipal(String cedula, String nombres, String username, String contrasenia, Boolean estado, Collection<? extends GrantedAuthority> authorities) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.username = username;
        this.contrasenia = contrasenia;
        this.estado = estado;
        this.authorities = authorities;
    }

    public static UsuarioPrincipal build(Usuario usuario){
        List<GrantedAuthority > authorities =
                usuario.getRol().stream().map( rol -> new SimpleGrantedAuthority(rol
                        .getNombre_rol())).collect(Collectors.toList());

        return new UsuarioPrincipal(
                usuario.getCedula(),
                usuario.getNombres(),
                usuario.getUsername(),
                usuario.getContrasenia(),
                usuario.getEstado(),
                authorities);
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return contrasenia;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
