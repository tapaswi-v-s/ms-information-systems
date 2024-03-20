/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tapaswi.java.db.connectivity;

/**
 *
 * @author tapas
 */
import java.sql.*;
import java.util.ArrayList;
import models.User;

public class DatabaseConnector {

    private static final String CONNECTION_STRING = "jdbc:mysql://localhost:3306/userdb?useSSL=false";
    private static final String USERNAME = "user1";
    private static final String PASSWORD = "root";

    public DatabaseConnector() {
    }

    /**
     * Insert given user to database
     *
     * @see User
     * @param user User object to be added
     */
    public static boolean addUser(User user) {
        String query = "INSERT INTO userdb.user(name, age) VALUES(?,?)";
        try (Connection conn = DriverManager.getConnection(CONNECTION_STRING, USERNAME,
                PASSWORD)) {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, user.getName());
            stmt.setInt(2, user.getAge());
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * Return lost of all users in database
     *
     * @see User
     * @return list of users
     */
    public static ArrayList<User> getAllusers() {
        // return list of users from db
        ArrayList<User> users = new ArrayList<>();
        String query = "SELECT * FROM userdb.user";
        try (Connection conn = DriverManager.getConnection(CONNECTION_STRING, USERNAME,
                PASSWORD)) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                User u = new User();
                u.setName(rs.getString("name"));
                u.setAge(rs.getInt("age"));
                u.setId(rs.getInt("id"));
                users.add(u);
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }

    /**
     * Delete given user from database
     *
     * @see User
     * @param id User to be deleted
     *
     */
    public static boolean deleteUser(int id) {
        String query = "delete from userdb.user where id = ?";
        try (Connection conn = DriverManager.getConnection(CONNECTION_STRING, USERNAME,
                PASSWORD)) {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, id);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * Edit given user details in the database
     * @param user existing user in database
     */
    public static boolean editUser(User user) {
        String query = "UPDATE userdb.user SET name=?, age=? WHERE id=?";
        try (Connection conn = DriverManager.getConnection(CONNECTION_STRING, USERNAME,
                PASSWORD)) {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, user.getName());
            stmt.setInt(2, user.getAge());
            stmt.setInt(3, user.getId());
            return (stmt.executeUpdate() > 0);
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
