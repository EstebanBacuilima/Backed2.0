package ista.Backed20.api.entity;

import javax.persistence.*;

@Entity
@Table(name = "Permisos")
public class Permisos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_usuario_rol;

	private boolean permiso1;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Rol rol;

	public Long getId_usuario_rol() {
		return id_usuario_rol;
	}

	public void setId_usuario_rol(Long id_usuario_rol) {
		this.id_usuario_rol = id_usuario_rol;
	}


	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	
}
