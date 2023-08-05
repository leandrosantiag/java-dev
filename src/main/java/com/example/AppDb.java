package com.example;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AppDb {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("Não foi possivel carregar a biblioteca do DB");
        }
        
        Statement statement = null;
        try {
            var conn = DriverManager.getConnection("jdbc:postgresql://localhost/postgres", "gitpod", "");
            System.err.println("Conetado ao DB");

            statement = conn.createStatement();
            var result = statement.executeQuery("Select * from estado");
            while(result.next()) {
                System.out.printf("Id: %d Nome: %s UF: %s\n", result.getInt("id"), result.getString("nome"), result.getString("uf"));
            }

        } catch (SQLException e) {
            if (statement == null)
                System.err.println("Não foi possivel concectar ao DB");
            else System.err.println("Não foi possivel executar consulta no DB");
        }

    }
}
