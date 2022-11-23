package ista.Backed20.api.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_usuario;
	
	private String cedula;
	private String nombres;
	private String username;
	private String contrasenia;
	private Boolean estado;

	public Usuario() {
	}


	public Usuario(String cedula, String nombres, String username, String contrasenia, Boolean estado, Persona persona, Empresa empresa, Rol rol) {
		this.cedula = cedula;
		this.nombres = nombres;
		this.username = username;
		this.contrasenia = contrasenia;
		this.estado = estado;
		this.persona = persona;
		this.empresa = empresa;
		this.rol = rol;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	private Persona persona;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Empresa empresa;


	@ManyToOne(fetch = FetchType.EAGER)
	private Rol rol;

	public Long getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Long id_usuario) {
		this.id_usuario = id_usuario;
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}
}
