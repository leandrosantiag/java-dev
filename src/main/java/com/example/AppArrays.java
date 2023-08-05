package com.example;

import java.util.Arrays;

public class AppArrays {
    public static void main(String[] args) {
        
        double matriz[][] = new double[2][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (i * matriz[i].length + j+1)*10;
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        //int vetor[] = {10,10,20};
        //System.out.println(Arrays.toString(vetor));

    }
}
