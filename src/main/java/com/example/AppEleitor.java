package com.example;

import java.time.LocalDate;

import com.example.model.Cidadao;

public class AppEleitor {
    public static void main(String[] args) {
        var cidadao =  new Cidadao();
        cidadao.setDataNascimento(LocalDate.of(1990,10,1));
        //System.out.println(cidadao.idade());
        System.out.println(cidadao.eleitor());
    }
}
