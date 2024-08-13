package pe.com.tienda.service;


import pe.com.tienda.entity.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductoService {

    public List<Producto> findAll();
    public List<Producto> findAllCustom();

    public Optional<Producto> findById(long id);
    public Producto add(Producto p);
    public Producto update(Producto p);
    public Producto delete(Producto p);
}
