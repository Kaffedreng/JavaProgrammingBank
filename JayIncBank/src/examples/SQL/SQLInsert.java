/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples.SQL;

import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author jan
 */
public class SQLInsert extends SQLOperater {

    public SQLInsert(String SQLStatement) throws SQLException {
        SQLConn();
        Statement stmt = null;
        
        System.out.println("Executing Statement...");
        stmt = conn.createStatement();
        stmt.executeUpdate(SQLStatement);
        
        System.out.println("Statement Executed...");
        stmt.close();
        SQLDisconnect();
    }
    
}
