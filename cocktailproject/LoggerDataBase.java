/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cocktailproject;
import java.sql.*;

/**
 *
 * @author ajymu
 */

public class LoggerDataBase implements Logger {
    @Override
    
    public void log(String description) {
        try {
           Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/coffee_machine", "safa", "1234")) {
                String insertSql = "INSERT INTO logs (description) VALUES(" + "\"" + description + "\"" + ")";
                PreparedStatement preparedStmt = con.prepareStatement(insertSql);
                preparedStmt.execute();
            }
       } catch (ClassNotFoundException | SQLException e) {
           System.out.println(e);
       }
    }
    
}
