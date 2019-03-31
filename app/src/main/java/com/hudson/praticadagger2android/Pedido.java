package com.hudson.praticadagger2android;

import java.util.List;

public class Pedido {

    private String nomePedido;
    private int codPedido;

    
    public Pedido(String nomePedido, int codPedido) {
        this.nomePedido = nomePedido;
        this.codPedido = codPedido;
    }

    public String getNomePedido() {
        return nomePedido;
    }

    public void setNomePedido(String nomePedido) {
        this.nomePedido = nomePedido;
    }

    public int getCodPedido() {
        return codPedido;
    }

    public void setCodPedido(int codPedido) {
        this.codPedido = codPedido;
    }
}
