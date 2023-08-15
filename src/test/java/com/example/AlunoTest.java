package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.example.educacao.model.Aluno;

public class AlunoTest {
    
    @Test
    public void calculaMediaTest() {

        Aluno aluno = new Aluno();
        aluno.setNota1(10);
        aluno.setNota2(10);
        aluno.setNota3(10);
        var esperado = 15;
        var obtido = aluno.calculaMedia();

        assertEquals(esperado, obtido,0.01);

    }

}
