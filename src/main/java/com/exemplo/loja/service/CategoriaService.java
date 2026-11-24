
package com.exemplo.loja.service;

import com.exemplo.loja.model.Categoria;
import com.exemplo.loja.repository.CategoriaRepository;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    private final CategoriaRepository repository;

    public CategoriaService(CategoriaRepository repository) {
        this.repository = repository;
    }

    public List<Categoria> listarTodas() {
        return repository.findAll();
    }

    public Optional<Categoria> buscarPorId(Integer id) {
        return repository.findById(id);
    }

    public Categoria salvar(Categoria categoria) {
        return repository.save(categoria);
    }

    public Categoria atualizar(Integer id, Categoria categoriaAtualizada) {
        return repository.findById(id)
                .map(categoria -> {
                    categoria.setNome(categoriaAtualizada.getNome());
                    return repository.save(categoria);
                })
                .orElseThrow(() ->
                        new RuntimeException("Categoria não encontrada com o id: " + id));
    }

    public void deletar(Integer id) {
        if (!repository.existsById(id)) {
            throw new RuntimeException(
                    "Categoria não encontrada com o id: " + id);
        }

        repository.deleteById(id);
    }
}
