
package com.exemplo.loja.controller;

import com.exemplo.loja.model.Categoria;
import com.exemplo.loja.service.CategoriaService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categorias")
@CrossOrigin(origins = "*")
public class CategoriaController {

    private final CategoriaService service;

    public CategoriaController(CategoriaService service) {
        this.service = service;
    }

    // Listar todas as categorias
    @GetMapping
    public List<Categoria> listarTodas() {
        return service.listarTodas();
    }

    // Buscar categoria por ID
    @GetMapping("/{id}")
    public ResponseEntity<Categoria> buscarPorId(@PathVariable Integer id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Cadastrar categoria
    @PostMapping
    public Categoria cadastrar(@RequestBody Categoria categoria) {
        categoria.setId(null);
        return service.salvar(categoria);
    }

    // Atualizar categoria
    @PutMapping("/{id}")
    public ResponseEntity<Categoria> atualizar(
            @PathVariable Integer id,
            @RequestBody Categoria categoria) {

        try {
            return ResponseEntity.ok(service.atualizar(id, categoria));
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    // Excluir categoria
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Integer id) {
        try {
            service.deletar(id);
            return ResponseEntity.noContent().build();
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }
}
