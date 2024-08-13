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
@Entity(name = "Categoria")
@Table(name = "t_categoria")
public class Categoria implements Serializable {

    private static final long serialVersionUID=1L;

    @Id
    @Column(name = "codcat")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;

    @Column(name = "nomcat")
    private String nombre;

    @Column(name = "estcat")
    private Boolean estado;

}
