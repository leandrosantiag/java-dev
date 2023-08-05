package com.example.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import com.example.model.Produto;

public class ProdutoDAO extends GeralDAO {

    public List<Produto> listar() throws SQLException {
        
        var lista = new LinkedList<Produto>();

        var statement = this.conn.createStatement();
        var result = statement.executeQuery("Select * from estado");
        while(result.next()) {
            
            var produto = new Produto();
            produto.setNome(result.getString("nome"));
            lista.add(produto);

        }

        return lista;
    }

    public String localizar(String uf) {
        try {
            var sql  = "select * from estado where uf  = ?";
            var statement = this.conn.prepareStatement(sql);
            statement.setString(1,uf);
            var result = statement.executeQuery();
            while(result.next()) {
                System.out.println(result.getString("nome"));
            }
        } catch (SQLException e) {
            System.out.println("Erro ao executar consulta de um estato");
        }
        
        return uf;
    }

    public void excluir(int id) {
        var sql = "delete from produto where id = ?";
        try {
            var statement = this.conn.prepareStatement(sql);
            statement.setInt(1,id);
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void inserir(Produto produto) {
        var sql = "insert into produto (nome, marca_id, valor) values (?,1,5)";

        try {
            var statement = this.conn.prepareStatement(sql);
            //statement.setLong(1, produto.getId());
            statement.setString(1, produto.getNome());

            statement.executeQuery();
        } catch (SQLException e) {
            System.out.println(e);
        }
        

    }


    
}
