package pe.com.tienda.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "Producto")
@Table(name = "t_producto")
public class Producto implements Serializable {
    private static final long serialVersionUID=1L;

    @Id
    @Column(name = "codpro")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;

    @Column(name = "nompro")
    private String nombre;

    @Column(name = "precioprocompra")
    private double precioCompra;

    @Column(name = "precioproventa")
    private double precioVenta;

    @Column(name = "cantpro")
    private double cantidad;

    @Column(name = "estpro")
    private boolean estado;

    @ManyToOne
    @JoinColumn(name = "codcat",nullable = false)
    private Categoria categoria;
}
