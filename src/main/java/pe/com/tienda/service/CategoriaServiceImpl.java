package pe.com.tienda.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.tienda.entity.Categoria;
import pe.com.tienda.repository.CategoriaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaServiceImpl implements CategoriaService{

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public List<Categoria> findAll() {
        return categoriaRepository.findAll();
    }

    @Override
    public List<Categoria> findAllCustom() {
        return categoriaRepository.findAllCustom();
    }

    @Override
    public Optional<Categoria> findById(long id) {
        return categoriaRepository.findById(id);
    }

    @Override
    public Categoria add(Categoria c) {
        return categoriaRepository.save(c);
    }

    @Override
    public Categoria update(Categoria c) {
        Categoria objCategoria = categoriaRepository.getById(c.getCodigo());
        BeanUtils.copyProperties(c,objCategoria);
        return categoriaRepository.save(objCategoria);
    }

    @Override
    public Categoria delete(Categoria c) {
        Categoria objCategoria = categoriaRepository.getById(c.getCodigo());
        objCategoria.setEstado(false);
        return categoriaRepository.save(objCategoria);
    }
}
