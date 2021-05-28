/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlserver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author CRASH
 */
public class SQLServer {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        
        String url = "jdbc:sqlserver://localhost:1433;databaseName=E201425";
        String user = "sa";
        String pass = "diosesamor";
        String url2 = "jdbc:mysql://localhost:3306/e201425";
        String user2 = "root";
        String pass2 = "";
        String url4 = "jdbc:postgresql://localhost:5432/E201425";
        String user4 = "postgres";
        String pass4 = "";
        
        Connection conn = null;
        Statement st = null;
        Connection conn2 = null;
        Statement st2 = null;
        Connection conn4 = null;
        Statement st4 = null;
        
        try{

           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           Class.forName("com.mysql.jdbc.Driver");
           Class.forName("org.postgresql.Driver");

           conn = DriverManager.getConnection (url, user, pass);
           conn2 = DriverManager.getConnection(url2, user2, pass2);
           conn4 = DriverManager.getConnection(url4, user4, pass4);
           
           st = conn.createStatement();
           st2 = conn2.createStatement();
           st4 = conn4.createStatement();

       } catch(Exception ex){
            System.out.println("No se pudo conectar.");
           JOptionPane.showMessageDialog(null, ex);

       }
        
        if(conn!=null){

//            JOptionPane.showMessageDialog(null, "Conectado");
            Metodos metodos = new Metodos();
            double [] tiempo = new double [6];
            double [] tiempo2 = new double [6];
            double [] tiempo4 = new double [6];
            
            metodos.ejecutar_consultas(st, tiempo, 1);
            metodos.ejecutar_consultas(st, tiempo, 2);
            metodos.ejecutar_consultas(st, tiempo, 3);
            metodos.ejecutar_consultas(st, tiempo, 4);
            metodos.ejecutar_consultas(st, tiempo, 5);
            
            System.out.println("SQL SERVER");
            System.out.println("Ciudades: " + tiempo [0] + " segundos.");
            System.out.println("Alumnos 5.000: " + tiempo [1] + " segundos.");
            System.out.println("Alumnos 10.000: " + tiempo [2] + " segundos.");
            System.out.println("Alumnos 15.000: " + tiempo [3] + " segundos.");
            System.out.println("Alumnos 20.000: " + tiempo [4] + " segundos.\n");
//
            metodos.ejecutar_consultas(st2, tiempo2, 1);
            metodos.ejecutar_consultas(st2, tiempo2, 2);
            metodos.ejecutar_consultas(st2, tiempo2, 3);
            metodos.ejecutar_consultas(st2, tiempo2, 4);
            metodos.ejecutar_consultas(st2, tiempo2, 5);
//          

            System.out.println("MYSQL");
            System.out.println("Ciudades: " + tiempo2 [0] + " segundos.");
            System.out.println("Alumnos 5.000: " + tiempo2 [1] + " segundos.");
            System.out.println("Alumnos 10.000: " + tiempo2 [2] + " segundos.");
            System.out.println("Alumnos 15.000: " + tiempo2 [3] + " segundos.");
            System.out.println("Alumnos 20.000: " + tiempo2 [4] + " segundos.\n");
//
            metodos.ejecutar_consultas(st4, tiempo4, 1);
            metodos.ejecutar_consultas(st4, tiempo4, 2);
            metodos.ejecutar_consultas(st4, tiempo4, 3);
            metodos.ejecutar_consultas(st4, tiempo4, 4);
            metodos.ejecutar_consultas(st4, tiempo4, 5);
            
            System.out.println("POSTGRESQL");
            System.out.println("Ciudades: " + tiempo4 [0] + " segundos.");
            System.out.println("Alumnos 5.000: " + tiempo4 [1] + " segundos.");
            System.out.println("Alumnos 10.000: " + tiempo4 [2] + " segundos.");
            System.out.println("Alumnos 15.000: " + tiempo4 [3] + " segundos.");
            System.out.println("Alumnos 20.000: " + tiempo4 [4] + " segundos.\n");
            
            
                try{

                    conn.close();
                    conn2.close();
                    conn4.close();
                    
                }catch(SQLException e){

                    System.out.println("Error al desconectar " + e);

                }

        }
        
    }
    
}
