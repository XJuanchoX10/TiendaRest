package pe.com.tienda.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.tienda.entity.Categoria;
import pe.com.tienda.service.CategoriaService;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categoria")
public class CategoriaRestController {
    @Autowired
    private CategoriaService servicio;

    @GetMapping
    public List<Categoria> findAll(){
        return servicio.findAll();
    }

    @GetMapping("/custom")
    public List<Categoria> findAllCustom(){
        return servicio.findAllCustom();
    }

    @GetMapping("/{id}")
    public Optional<Categoria> findById(@PathVariable Long id){
        return servicio.findById(id);
    }

    @PostMapping
    public Categoria add(@RequestBody Categoria c){
        return servicio.add(c);
    }

    @PutMapping("/{id}")
    public Categoria update(@PathVariable long id, @RequestBody Categoria c){
        c.setCodigo(id);
        return servicio.update(c);
    }

    @DeleteMapping("/{id}")
    public Categoria delete(@PathVariable long id){
        Categoria obCategoria = new Categoria();
        obCategoria.setEstado(false);
        return servicio.delete(Categoria.builder().codigo(id).build());
    }
}
