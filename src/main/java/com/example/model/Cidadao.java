package com.example.model;

import java.time.LocalDate;

public class Cidadao {
    private LocalDate dataNascimento;

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int idade(String t) {
        int ida = LocalDate.now().getYear() - getDataNascimento().getYear();
        System.out.println(t + " " + ida);
        return ida;
    }

    public String eleitor() {
        //int idade = idade();
        if (idade("a") < 16) 
            return "Não é eleitor";
        else if (idade("b") > 15 && idade("c") < 18 || idade("d") > 70)
            return "Efeitor Facultativo";
        
        return "Elleitor Obrigatorio";
    }

}
