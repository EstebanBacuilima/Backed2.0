package ista.Backed20.api.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Roles")
public class Rol {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_rol;

	@NotNull
	@Enumerated(EnumType.STRING)
	private String nombre_rol;
	private String descripcion;
	private Boolean estado;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER, mappedBy = "rol")
	private Set<Permisos> rolespermisos = new HashSet<>();

	public Rol() {
	}

	public Rol(String nombre_rol, String descripcion, Boolean estado) {
		this.nombre_rol = nombre_rol;
		this.descripcion = descripcion;
		this.estado = estado;
	}

	public Long getId_rol() {
		return id_rol;
	}

	public void setId_rol(Long id_rol) {
		this.id_rol = id_rol;
	}

	public String getNombre_rol() {
		return nombre_rol;
	}

	public void setNombre_rol(String nombre_rol) {
		this.nombre_rol = nombre_rol;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}


	
	
}
