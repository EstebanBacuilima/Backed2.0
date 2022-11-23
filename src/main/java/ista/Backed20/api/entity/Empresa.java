package ista.Backed20.api.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Empresa")
public class Empresa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_empresa;
	
	private String ruc;
	private String razon_Social;
	private String nombre_Comercial;
	private String alias;
	private String provincia;
	private String ciudad;
	private String direccion;
	private String celular;
	private String correo;
	private String logotipo;



	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER, mappedBy = "empresa")
	private Set<Usuario> usuario = new HashSet<>();

	/*@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER, mappedBy = "productos")
	private Set<Productos> productos = new HashSet<>();*/

	public Empresa() {
		super();
	}


	public Empresa(Long id_empresa, String ruc, String razon_Social, String nombre_Comercial, String alias, String provincia, String ciudad, String direccion, String celular, String correo, String logotipo, Set<Usuario> usuario) {
		this.id_empresa = id_empresa;
		this.ruc = ruc;
		this.razon_Social = razon_Social;
		this.nombre_Comercial = nombre_Comercial;
		this.alias = alias;
		this.provincia = provincia;
		this.ciudad = ciudad;
		this.direccion = direccion;
		this.celular = celular;
		this.correo = correo;
		this.logotipo = logotipo;
		this.usuario = usuario;
	}

	public Long getId_empresa() {
		return id_empresa;
	}


	public void setId_empresa(Long id_empresa) {
		this.id_empresa = id_empresa;
	}



	public String getRuc() {
		return ruc;
	}


	public void setRuc(String ruc) {
		this.ruc = ruc;
	}

	public String getRazon_Social() {
		return razon_Social;
	}

	public void setRazon_Social(String razon_Social) {
		this.razon_Social = razon_Social;
	}

	public String getNombre_Comercial() {
		return nombre_Comercial;
	}

	public void setNombre_Comercial(String nombre_Comercial) {
		this.nombre_Comercial = nombre_Comercial;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getLogotipo() {
		return logotipo;
	}

	public void setLogotipo(String logotipo) {
		this.logotipo = logotipo;
	}



}
