package com.hudson.praticadagger2android;

import java.util.List;

public class Usuario implements UsuarioContrato{

    private String nome;
    private String idade;

//    public Usuario(String nome, String idade) {
//        this.nome = nome;
//        this.idade = idade;
//    }

    public List<Pedido> listarPedidos(){
        List<Pedido> pedidos = null;

        return pedidos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }
}
