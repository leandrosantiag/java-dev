package com.example.educacao.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import com.example.educacao.model.Aluno;

public class AlunoDAO extends Conexao {
    
    protected Connection conn;

    public AlunoDAO() {
        try {
            this.conn = Conexao.getConnection();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void inserir(Aluno aluno) {   
        try {
            var sql = "INSERT INTO alunos (nome, nota1, nota2, nota3) VALUES (?,?,?,?)";
            var statement = this.conn.prepareStatement(sql);
            statement.setString(1,aluno.getNome());
            statement.setDouble(2,aluno.getNota1());
            statement.setDouble(3,aluno.getNota2());
            statement.setDouble(4,aluno.getNota3());
            statement.execute();
        } catch (SQLException e) {
            System.out.println("Erro ao inserir aluno");
        }

    }


    public void inserirNota (int idDisciplina, double nota, int matricula) {

        if (idDisciplina <= 0 || idDisciplina > 3) {
            System.out.println("Disciplina invalida");
        } else {
            try {
                var sql = "UPDATE alunos SET nota"+idDisciplina+" = ? WHERE matricula = ?";
                var statement = this.conn.prepareStatement(sql);
                statement.setDouble(1,nota);
                statement.setInt(2,matricula);
                statement.execute();

                System.out.println("Nota atribuida com sucesso!");

            } catch (SQLException e) {
                System.out.println("Não foi possível atribuir nota" + e);
            }
        }
       
    }

    public List<Aluno> listar() throws SQLException {
        
        var lista = new LinkedList<Aluno>();

        var sql = "SELECT * FROM alunos";
        var statement = this.conn.createStatement();
        var result = statement.executeQuery(sql);

        while(result.next()) {
            Aluno aluno = new Aluno();
            aluno.setNome(result.getString("nome"));
            aluno.setNota1(result.getInt("nota1"));
            lista.add(aluno);
        }

        return lista;

    }



}
