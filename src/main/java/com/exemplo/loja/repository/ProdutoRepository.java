package com.exemplo.loja.repository;

import com.exemplo.loja.model.Produto;
import com.exemplo.loja.dto.ProdutoComCategoriaDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

    @Query("""
        SELECT new com.exemplo.loja.dto.ProdutoComCategoriaDTO(
            p.id,
            p.nome,
            p.preco,
            p.estoque,
            c.id,
            c.nome
        )
        FROM Produto p
        LEFT JOIN Categoria c ON p.categoriaId = c.id
    """)
    List<ProdutoComCategoriaDTO> listarProdutosComCategoria();
}