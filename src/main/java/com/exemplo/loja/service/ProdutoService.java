package com.exemplo.loja.service;

import com.exemplo.loja.dto.ProdutoComCategoriaDTO;
import com.exemplo.loja.model.Produto;
import com.exemplo.loja.repository.ProdutoRepository;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    private final ProdutoRepository repository;

    public ProdutoService(ProdutoRepository repository) {
        this.repository = repository;
    }

    public List<Produto> listarTodos() {
        return repository.findAll();
    }

    public Optional<Produto> buscarPorId(Integer id) {
        return repository.findById(id);
    }

    public Produto salvar(Produto produto) {
        return repository.save(produto);
    }

    public Produto atualizar(Integer id, Produto produtoAtualizado) {
        return repository.findById(id)
                .map(produto -> {
                    produto.setNome(produtoAtualizado.getNome());
                    produto.setPreco(produtoAtualizado.getPreco());
                    produto.setEstoque(produtoAtualizado.getEstoque());
                    produto.setCategoriaId(produtoAtualizado.getCategoriaId());
                    return repository.save(produto);
                })
                .orElseThrow(() ->
                        new RuntimeException("Produto não encontrado com o id: " + id));
    }

    public void deletar(Integer id) {
        if (!repository.existsById(id)) {
            throw new RuntimeException(
                    "Produto não encontrado com o id: " + id);
        }
        repository.deleteById(id);
    }

    public List<ProdutoComCategoriaDTO> listarProdutosComCategoria() {
        return repository.listarProdutosComCategoria();
    }
}