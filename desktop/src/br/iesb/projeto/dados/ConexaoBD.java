package br.iesb.projeto.dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class ConexaoBD {

    public static Connection getConexao() throws DadosException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost/nome-do-banco", "root", "");
        } catch (ClassNotFoundException e) {
            throw new DadosException("Erro ao carregar JDBC: " + e.getMessage());
        } catch (SQLException e) {
            throw new DadosException("Erro ao conectar com SGBD: " + e.getMessage());
        }
    }
}
