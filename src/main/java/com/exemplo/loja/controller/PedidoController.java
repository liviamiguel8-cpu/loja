package com.exemplo.loja.controller;

import com.exemplo.loja.dto.PedidoItemDTO;
import com.exemplo.loja.service.PedidoService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {

    private final PedidoService pedidoService;

    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @GetMapping("/com-itens")
    public List<PedidoItemDTO> buscarPedidosComItens() {
        return pedidoService.buscarPedidosComItens();
    }
}