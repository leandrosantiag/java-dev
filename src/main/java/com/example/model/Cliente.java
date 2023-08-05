package com.example.model;

public class Cliente {

    private String nome;
    private int tipo = 3;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
       this.nome = nome;
    }

    public int getTipo() {
        return this.tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public Cliente() {
       this.tipo = 2;
    }

    public Cliente(int valor) {
        //this();
        //this.tipo = 2;
        //getTipo();
    }
    public String toString() {
        return "Cliente: " + nome;
    }
}