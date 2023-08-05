package com.example;

import com.example.model.Cliente;

public class AppOperacoes {

    boolean teste (){
        return true;
    }

    public static void main(String[] args) {

        var app = new AppOperacoes();

        System.out.println(app.teste());

        Cliente cliente1 = new Cliente();
        cliente1.setNome("bebe");
    
        Cliente cliente2 = new Cliente();
        cliente2.setNome("baba");
    
        if (cliente1.getNome().equals(cliente2.getNome())) {
            System.out.println("Vai!!!!");
        } else {
            System.out.println("NÃO");
        }

    }
    
    public static int Pontos(int saldo) {
        if (saldo > 2)
            return 1;
        else return 0;
    }


}
