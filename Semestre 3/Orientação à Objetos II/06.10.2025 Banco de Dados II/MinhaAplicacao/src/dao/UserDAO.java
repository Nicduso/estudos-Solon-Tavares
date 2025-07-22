package dao;

import factory.ConnectionFactory;
import model.User;
import java.sql.*;
import java.sql.PreparedStatement;
import java.util.ArrayList;

public class UserDAO {
    
    private Connection connection;
    
    int id;
    String name, cpf, email, phone;
    
    public UserDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }
    
    public void add(User user) {
        String sql = "INSERT INTO users(name, cpf, email, phone) VALUES(?,?,?,?)";
        
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, user.getName());
            stmt.setString(2, user.getCPF());
            stmt.setString(3, user.getEmail());
            stmt.setString(4, user.getPhone());
            stmt.execute();
            stmt.close();
        } catch(SQLException e) {
            throw new RuntimeException(e);
        }
    
    }
    
    public ArrayList<User> listName(String name) {
        ArrayList<User> list = new ArrayList();
        
        String sql = "select * from users where name like ?";
        
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, "%"+name+"%");
            ResultSet rset = stmt.executeQuery();
            while(rset.next()){
                User user = new User();
                user.setId(rset.getInt("id"));
                user.setName(rset.getString("name"));
                user.setCPF(rset.getString("cpf"));
                user.setEmail(rset.getString("email"));
                user.setPhone(rset.getString("phone"));
                list.add(user);
            }
            stmt.close();
        } catch(SQLException u) {
            throw new RuntimeException(u);
        }
        return list;
    }

}
