package pe.com.tienda.service;

import pe.com.tienda.entity.Categoria;
import java.util.List;
import java.util.Optional;

public interface CategoriaService {
    public List<Categoria> findAll();
    public List<Categoria> findAllCustom();

    public Optional<Categoria> findById(long id);
    public Categoria add(Categoria c);
    public Categoria update(Categoria c);
    public Categoria delete(Categoria c);

}
