package com.exemplo.loja.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "pedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "cliente_id", nullable = false)
    private Integer clienteId;

    @Column(nullable = false)
    private LocalDate data;

    @Column(name = "forma_pagamento_id")
    private Integer formaPagamentoId;

    @Column(name = "status_pedido_id")
    private Integer statusPedidoId;

    @Column(name = "funcionario_id")
    private Integer funcionarioId;

    public Pedido() {
    }

    public Pedido(Integer clienteId, LocalDate data, Integer formaPagamentoId,
                  Integer statusPedidoId, Integer funcionarioId) {
        this.clienteId = clienteId;
        this.data = data;
        this.formaPagamentoId = formaPagamentoId;
        this.statusPedidoId = statusPedidoId;
        this.funcionarioId = funcionarioId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClienteId() {
        return clienteId;
    }

    public void setClienteId(Integer clienteId) {
        this.clienteId = clienteId;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Integer getFormaPagamentoId() {
        return formaPagamentoId;
    }

    public void setFormaPagamentoId(Integer formaPagamentoId) {
        this.formaPagamentoId = formaPagamentoId;
    }

    public Integer getStatusPedidoId() {
        return statusPedidoId;
    }

    public void setStatusPedidoId(Integer statusPedidoId) {
        this.statusPedidoId = statusPedidoId;
    }

    public Integer getFuncionarioId() {
        return funcionarioId;
    }

    public void setFuncionarioId(Integer funcionarioId) {
        this.funcionarioId = funcionarioId;
    }
}