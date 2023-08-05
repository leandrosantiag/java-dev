package com.example.dao;

import java.sql.Connection;
import java.sql.SQLException;

public class GeralDAO {
    
    protected Connection conn;

    public GeralDAO() {

        try {
            this.conn = ConnectionManager.getConnection();
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public void listar(String tabela) {

        try {
            var sql = "select * from " + tabela;
            var statement = this.conn.prepareStatement(sql);
            //statement.setString(1,"PB");
            var result = statement.executeQuery();

            int cols = result.getMetaData().getColumnCount();
            for (int i = 1; i <= cols; i++) {
                System.out.print(result.getMetaData().getColumnName(i) + " | ");
            }
            System.out.println();
            while(result.next()) {
                for (int i = 1; i <= cols; i++) {
                    System.out.print(result.getString(i) + " | ");
                }
                System.out.println();
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

}
