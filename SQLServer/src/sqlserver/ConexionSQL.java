/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlserver;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author CRASH
 */
    
    public class ConexionSQL {

    //public String db = "actividad1_2";
    public String url = "jdbc:sqlserver://localhost:1433;databaseName=E201425";
    public String user = "sa";
    public String pass = "12345";


   public Connection Conectar(){

       Connection link = null;

       try{

           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

           link = DriverManager.getConnection(this.url, this.user, this.pass);

       }catch(Exception ex){

           JOptionPane.showMessageDialog(null, ex);

       }


       return link;

   }

}
