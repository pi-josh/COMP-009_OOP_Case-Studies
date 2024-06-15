package main;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBManager {

  private final static String URL = "jdbc:mysql://localhost:3306/telephone_directory";
  private final static String USERNAME = "root";
  private final static String PASSWORD = "";
  private final static String DRIVER = "com.mysql.jdbc.Driver";
  public Connection con;
  public Statement state;
  public ResultSet result;
  public PreparedStatement prep;

  public void connect(){
    try {
      Class.forName(DRIVER);
      con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
    } catch (Exception e) {
        System.out.println(e);
    }
  }

  public void disconnect() {
    try{
      if (result != null) {
        result.close();
      }
      if (state != null) {
        state.close();
      }
      if (prep != null){
        prep.close();
      }
      if (con != null) {
        con.close();
      }
      System.out.println("Database disconnected successfully.");
    } catch (SQLException e) {
        System.out.println("Error closing database connection: " + e.getMessage());
    }
  }
}