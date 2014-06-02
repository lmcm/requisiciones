/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelResult;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aurum CEO
 */
public class conexion {

    private java.sql.Connection connection = null;
    private final String url = "jdbc:microsoft:sqlserver://";
    private final String serverName = "10.0.1.254";
    private final String portNumber = "1433";
    private final String databaseName = "REX_PRUEBAS";
    private final String userName = "sa";
    private final String password = "Grup0i@i";
    private final String statement = "select * aspnet_Membership where userName=";
    private ArrayList array;

    public ArrayList getArray() {
        return array;
    }

    public void setArray(ResultSet obj) {
        this.array.add(obj);
    }

    public String variable = "";
    // Informs the driver to use server a side-cursor,
    // which permits more than one active statement
    // on a connection.

    // Constructor
    public conexion() {
     
        this.array = new ArrayList();
    }

    private String getConnectionUrl() {
        return url + serverName + ":" + portNumber + ";databaseName="
                + databaseName + ";";
    }

    public java.sql.Connection getConnection() {
        try {
            Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver");
            connection = java.sql.DriverManager.getConnection(getConnectionUrl(),
                    userName, password);
            if (connection != null) {
                System.out.println("Connection Successful!");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error Trace in getConnection() : "
                    + e.getMessage());
        }
        return connection;
    }

    /*
     * Display the driver properties, database details
     */
  
    public void closeConnection() {
        try {
            if (connection != null) {
                connection.close();
            }
            connection = null;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
