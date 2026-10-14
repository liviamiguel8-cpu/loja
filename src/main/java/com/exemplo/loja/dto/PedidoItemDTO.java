package com.exemplo.loja.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public class PedidoItemDTO {

    private Integer pedidoCodigo;
    private LocalDate pedidoData;
    private Integer itemCodigo;
    private String itemDescricao;
    private Integer quantidade;
    private BigDecimal valor;

    public PedidoItemDTO(
            Integer pedidoCodigo,
            LocalDate pedidoData,
            Integer itemCodigo,
            String itemDescricao,
            Integer quantidade,
            BigDecimal valor) {

        this.pedidoCodigo = pedidoCodigo;
        this.pedidoData = pedidoData;
        this.itemCodigo = itemCodigo;
        this.itemDescricao = itemDescricao;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public Integer getPedidoCodigo() {
        return pedidoCodigo;
    }

    public LocalDate getPedidoData() {
        return pedidoData;
    }

    public Integer getItemCodigo() {
        return itemCodigo;
    }

    public String getItemDescricao() {
        return itemDescricao;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public BigDecimal getValor() {
        return valor;
    }
}