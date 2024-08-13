package pe.com.tienda.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.tienda.entity.Producto;
import pe.com.tienda.service.ProductoService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/producto")
public class ProductoRestController {
    @Autowired
    private ProductoService servicio;

    @GetMapping
    public List<Producto> findAll(){
        return servicio.findAll();
    }

    @GetMapping("/custom")
    public List<Producto> findAllCustom(){
        return servicio.findAllCustom();
    }

    @GetMapping("/{id}")
    public Optional<Producto> findById(@PathVariable Long id){
        return servicio.findById(id);
    }

    @PostMapping
    public Producto add(@RequestBody Producto p){
        return servicio.add(p);
    }

    @PutMapping("/{id}")
    public Producto update(@PathVariable long id, @RequestBody Producto p){
        p.setCodigo(id);
        return servicio.update(p);
    }

    @DeleteMapping("/{id}")
    public Producto delete(@PathVariable long id){
        Producto obProducto = new Producto();
        obProducto.setEstado(false);
        return servicio.delete(Producto.builder().codigo(id).build());
    }
}
