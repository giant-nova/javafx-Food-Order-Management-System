package org.javafxproject.foodordermgmtsystem;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database {
    public static Connection connectDB(){
        try{
            Connection connect = DriverManager.getConnection("jdbc:sqlite:/home/kunal/javafxFoodOrderManagementSystem/Food.db");
            return connect;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
