package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppOperacoesTest {
    @Test
    void testandoPontos() {

        var saldo = 2;

        var esperado = 1;
        var obtido = AppOperacoes.Pontos(saldo);

        assertEquals(esperado, obtido);

    }
}
