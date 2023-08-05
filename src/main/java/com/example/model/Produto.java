package com.example.model;

public class Produto {
    private Long id;
    private String nome;

    public long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String toString() {
        return "Nome: " + nome;
    }
    
}
