package com.exemplo.loja.model;

import java.io.Serializable;
import java.util.Objects;

public class ItemPedidoId implements Serializable {

    private Integer pedido;
    private Integer produto;

    public ItemPedidoId() {
    }

    public ItemPedidoId(Integer pedido, Integer produto) {
        this.pedido = pedido;
        this.produto = produto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (!(o instanceof ItemPedidoId)) {
            return false;
        }

        ItemPedidoId that = (ItemPedidoId) o;

        return Objects.equals(pedido, that.pedido)
                && Objects.equals(produto, that.produto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pedido, produto);
    }
}