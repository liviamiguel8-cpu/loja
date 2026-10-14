package com.exemplo.loja.dto;

import java.math.BigDecimal;

public class ProdutoComCategoriaDTO {

    private Integer id;
    private String nome;
    private BigDecimal preco;
    private Integer estoque;
    private Integer categoriaCodigo;
    private String categoriaDescricao;

    public ProdutoComCategoriaDTO() {
    }

    public ProdutoComCategoriaDTO(
            Integer id,
            String nome,
            BigDecimal preco,
            Integer estoque,
            Integer categoriaCodigo,
            String categoriaDescricao) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
        this.categoriaCodigo = categoriaCodigo;
        this.categoriaDescricao = categoriaDescricao;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public Integer getEstoque() {
        return estoque;
    }

    public Integer getCategoriaCodigo() {
        return categoriaCodigo;
    }

    public String getCategoriaDescricao() {
        return categoriaDescricao;
    }
}