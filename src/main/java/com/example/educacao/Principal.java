package com.example.educacao;

import java.util.List;

import com.example.educacao.dao.AlunoDAO;
import com.example.educacao.model.Aluno;

public class Principal {
    
    public static void main(String[] args) {
        
        try {
            AlunoDAO alunoDAO = new AlunoDAO();
            Aluno aluno = new Aluno();
            /* aluno.setNome("Manoel");
            aluno.setNota1(1);
            aluno.setNota2(1);
            aluno.setNota3(1);
            alunoDAO.inserir(aluno);
            System.out.println("Aluno inserido com sucesso!"); */
            
            //alunoDAO.inserirNota(3, 5, 1);

            var alunos = alunoDAO.listar();

            for(var alu:alunos) {
                System.err.println("Nome: " + alu.getNome() + " Nota: " + alu.getNota1());
            }
                

        } catch (Exception e) {
            System.out.println("Não foi possivel inserir o Aluno");
        }

    }
}
