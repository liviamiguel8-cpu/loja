package com.exemplo.loja.repository;

import com.exemplo.loja.dto.PedidoItemDTO;
import com.exemplo.loja.model.Pedido;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

    @Query("""
        SELECT new com.exemplo.loja.dto.PedidoItemDTO(
            p.id,
            p.data,
            pr.id,
            pr.nome,
            i.quantidade,
            pr.preco
        )
        FROM Pedido p
        JOIN ItemPedido i ON i.pedido = p
        JOIN Produto pr ON pr = i.produto
        """)
    List<PedidoItemDTO> buscarPedidosComItens();
}