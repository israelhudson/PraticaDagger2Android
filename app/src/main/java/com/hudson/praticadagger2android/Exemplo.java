package com.hudson.praticadagger2android;

import java.util.List;

public class Exemplo {

    private UsuarioContrato usuario;

    public Exemplo(UsuarioContrato usuario){
        this.usuario = usuario;
    }

    public List<Pedido> listarPedidosUsuario(){
        return usuario.listarPedidos();
    }
}
