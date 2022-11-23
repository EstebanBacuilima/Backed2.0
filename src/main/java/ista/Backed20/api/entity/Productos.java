package ista.Backed20.api.entity;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "Productos")
public class Productos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_producto;
    private long precio;
    private String nombre;
    private String descripcion;
    private String tipo_Producto;
    private String tipo_Iva;
    private String ice;
    private String stock;
    private String categoria;
    private Date fecha_Vencimiento;
    private String unidad;
    private String foto;

    @ManyToOne(fetch = FetchType.EAGER)
    private Empresa empresa;

}
