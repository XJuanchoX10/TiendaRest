package pe.com.tienda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.tienda.entity.Categoria;

import java.util.List;

public interface CategoriaRepository extends JpaRepository<Categoria,Long> {
    @Query("select c from Categoria c where c.estado=true")
    List<Categoria> findAllCustom();
}
