package dao;

import factory.ConnectionFactory;
import model.User;
import java.sql.*;
import java.sql.PreparedStatement;

public class UserDAO {
    
    private Connection connection;
    
    int id;
    String nome, cpf, email, telefone;
    
    public UserDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }
    
    public void add(User user) {
        String sql = "INSERT INTO usuario(nome, cpf, email, telefone) VALUES(?,?,?,?)";
        
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, user.getNome());
            stmt.setString(2, user.getCPF());
            stmt.setString(3, user.getEmail());
            stmt.setString(4, user.getTelefone());
            stmt.execute();
            stmt.close();
        } catch(SQLException e) {
            throw new RuntimeException(e);
        }
    
    }
    
}
