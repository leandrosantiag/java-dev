package com.example;

import java.sql.SQLException;

import com.example.dao.ProdutoDAO;

public class AppDb2 {

    String teste;

    public AppDb2() {

        this.teste = "ok";
    
    }

    public static void main(String[] args) {
        var constr = new AppDb2();
        
        System.out.println(constr.teste);

        ProdutoDAO produto = new ProdutoDAO();

        try {
            var produtos = produto.listar();

            for(var prod:produtos) {
                System.out.println(prod);
    
            }

        } catch (SQLException e) {
            System.out.println(e);
        }

       

    }
}
