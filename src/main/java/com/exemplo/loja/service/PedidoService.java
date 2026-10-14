package com.exemplo.loja.service;

import com.exemplo.loja.dto.PedidoItemDTO;
import com.exemplo.loja.repository.PedidoRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    private final PedidoRepository pedidoRepository;

    public PedidoService(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    public List<PedidoItemDTO> buscarPedidosComItens() {
        return pedidoRepository.buscarPedidosComItens();
    }
}