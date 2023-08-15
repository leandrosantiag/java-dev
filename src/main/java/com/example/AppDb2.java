package com.example;

import java.sql.SQLException;
import java.util.Scanner;

import com.example.dao.ProdutoDAO;

public class AppDb2 {

    String teste;

    public AppDb2() {

        Scanner scanner = new Scanner(System.in);

        int um = (short)10;
        double dois = 22.2;
        //System.out.println("Diga seu nome:");
        //var nome = scanner.nextLine();

        String a = "a";
        //int b = 2 + a++;
        if (a=="12/12/2023"){

        }

        
        System.out.println(2+ ++a);
    
    
    }

    private Object input(String string) {
        return null;
    }

    public static void main(String[] args) {
        var constr = new AppDb2();
        
        //System.out.println(constr.teste);

        /* ProdutoDAO produto = new ProdutoDAO();

        try {
            var produtos = produto.listar();

            for(var prod:produtos) {
                System.out.println(prod);
    
            }

        } catch (SQLException e) {
            System.out.println(e);
        } */

       

    }
}
