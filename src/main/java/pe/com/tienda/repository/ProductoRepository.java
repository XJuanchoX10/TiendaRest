package pe.com.tienda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.tienda.entity.Producto;

import java.util.List;

public interface ProductoRepository extends JpaRepository<Producto,Long> {
    @Query("select p from Producto p where p.estado=true")
    List<Producto> findAllCustom();
}
