package com.example;

import java.util.Scanner;

import com.example.model.Cliente;

public class AppTestes {

    public static void main(String[] args) {

        Cliente cliente = new Cliente(10);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o nome do cara? ");
        cliente.setNome(scanner.nextLine());

        System.out.println("A primeira letra dele é: " + cliente.getNome().charAt(0));


        System.out.println("Qual o tipo de bunda? ");
        cliente.setTipo(scanner.nextInt());

        System.out.println("O tipo é: " + cliente.getTipo());

        

        int matriz[][] = { {20,20,30}, {40,40,50} };

        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][1] + " ");
        }

    }
}
