package dao;

import factory.ConnectionFactory;
import model.User;
import java.sql.*;
import java.sql.PreparedStatement;
import java.util.ArrayList;

public class UserDAO {
    private Connection connection;
    
    int id;
    String name, gender, rating;
    Double weight, height, imc;
    
    public UserDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }
    
    public void calculate(User user) {
        user.setIMC(user.getWeight() / (user.getHeight() * user.getHeight()));
        
        if (user.getGender().equals("Feminino")) {
            if (user.getIMC() < 22) {
                user.setRating("Abaixo do peso");
            } else if (user.getIMC() > 21.9 && user.getIMC() < 27.1) {
                user.setRating("Peso normal");
            } else if (user.getIMC() > 27 && user.getIMC() < 32.1) {
                user.setRating("Sobrepeso");
            } else if (user.getIMC() > 32 && user.getIMC() < 37.1) {
                user.setRating("Obesidade Grau I");
            } else if (user.getIMC() > 37 && user.getIMC() < 42) {
                user.setRating("Obesidade Grau II - severa");
            } else if (user.getIMC() > 41.9) {
                user.setRating("Obesidade Grau III - mórbida");
            } 
        } else {
            if (user.getIMC() < 22) {
                user.setRating("Abaixo do peso");
            } else if (user.getIMC() > 21.9 && user.getIMC() < 27.1) {
                user.setRating("Peso normal");
            } else if (user.getIMC() > 27 && user.getIMC() < 30.1) {
                user.setRating("Sobrepeso");
            } else if (user.getIMC() > 30 && user.getIMC() < 35.1) {
                user.setRating("Obesidade Grau I");
            } else if (user.getIMC() > 35 && user.getIMC() < 40) {
                user.setRating("Obesidade Grau II - severa");
            } else if (user.getIMC() > 39.9) {
                user.setRating("Obesidade Grau III - mórbida");
            } 
        }
    }
    
    public void add(User user) {
        
        calculate(user);
        
        String sql = "INSERT INTO results(name, gender, weight, height, imc, rating) VALUES(?,?,?,?,?,?)";
        
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, user.getName());
            stmt.setString(2, user.getGender());
            stmt.setDouble(3, user.getWeight());
            stmt.setDouble(4, user.getHeight());
            stmt.setDouble(5, user.getIMC());
            stmt.setString(6, user.getRating());
            stmt.execute();
            stmt.close();
        } catch(SQLException e) {
            throw new RuntimeException(e);
        }
    
    }
    
    public ArrayList<User> listName(String name) {
        ArrayList<User> list = new ArrayList();
        
        String sql = "select * from results where name like ?";
        
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, "%"+name+"%");
            ResultSet rset = stmt.executeQuery();
            while(rset.next()){
                User user = new User();
                user.setId(rset.getInt("id"));
                user.setName(rset.getString("name"));
                user.setGender(rset.getString("gender"));
                user.setRating(rset.getString("rating"));
                user.setWeight(rset.getDouble("weight"));
                user.setHeight(rset.getDouble("height"));
                user.setIMC(rset.getDouble("imc"));
                list.add(user);
            }
            stmt.close();
        } catch(SQLException u) {
            throw new RuntimeException(u);
        }
        return list;
    }
    
    public void delete(String name) {
               
        String sql = "DELETE FROM results WHERE name = ?";
        
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, name);
            stmt.execute();
            stmt.close();
        } catch(SQLException e) {
            throw new RuntimeException(e);
        }
    
    }
    
    public void update(String name, User user) {
        
        calculate(user);
        
        int id = -1;

        String sqlBusca = "SELECT id FROM results WHERE name = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sqlBusca);
            stmt.setString(1, name);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                id = rs.getInt("id");
            } else {
                throw new RuntimeException("Nome não encontrado.");
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao buscar ID: " + e.getMessage(), e);
        }

        String sql = "UPDATE results SET name = ?, gender = ?, rating = ?, weight = ?, height = ?, imc = ? WHERE id = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, user.getName());
            stmt.setString(2, user.getGender());
            stmt.setString(3, user.getRating());
            stmt.setDouble(4, user.getWeight());
            stmt.setDouble(5, user.getHeight());
            stmt.setDouble(6, user.getIMC());
            stmt.setInt(7, id);
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao atualizar usuário: " + e.getMessage(), e);
        }
    }
}
