package assignment.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;


import assignment.cart.Cart;


public class UsersManager {

    public static final String BASIC_USER_ID = "User00-";
    public static final List<User> users = new ArrayList<User>();


    public boolean findUserFromDB(String userID) throws SQLException {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", BASIC_USER_ID+userID, "password");) {
            String query = "select firstname, lastname from USERS where username = ?";
            try (PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setString(1, BASIC_USER_ID + userID);
                try (ResultSet rs = stmt.executeQuery()) {
                    return rs.next();
                }
            }

        } catch (SQLException e) {
            return false;
        }
    }

    void addUser(User user) throws SQLException{
        if(!findUserFromDB(user.getUserID()))
            users.add(user);
    }
    
    void removeEmptyTitlesFromUser(User user) {      
        List<String> titles = user.getTitles();
        int i;
        for (i = 0; i < titles.size(); i++) {
          if (titles.get(i).isEmpty()) {
                titles.remove(i);
                i--;
          }
        }
    }

    void addCartToUser(User user, Cart cart) throws Exception{
        user.linkCart(cart);
    }









}
