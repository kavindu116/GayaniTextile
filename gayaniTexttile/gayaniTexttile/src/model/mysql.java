package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class mysql {

    private static Connection conection;

    public static void CreateConnection() {

        if (conection == null) {
            try {
                
                Class.forName("com.mysql.cj.jdbc.Driver");
                conection = DriverManager.getConnection("Jdbc:mysql://localhost:3306/gayanitextile", "root", "Kavindu@2003Lakshan");
                
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }

    }

    public static ResultSet executeSearch(String query) throws Exception {
        CreateConnection();
        return conection.createStatement().executeQuery(query);
    }

    public static Integer executeIUD(String query) throws Exception {
        CreateConnection();
        return conection.createStatement().executeUpdate(query);
    }

}
