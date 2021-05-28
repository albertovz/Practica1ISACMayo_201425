/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlserver;

import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author CRASH
 */
public class Metodos {
    
    public void ejecutar_consultas (Statement st, double tiempo [], int bandera) throws SQLException {
        int idCiudad;
        long codigo;
        
        switch (bandera) {
            case 1: {
                long startTimeCiudades = System.currentTimeMillis();
                for (codigo =1; codigo <=100; codigo++){
                    st.execute("INSERT INTO ciudad VALUES (" +codigo+ ","+"'Ciudad"+codigo+ "')");
                }
                tiempo [0] = (System.currentTimeMillis() - startTimeCiudades)/1000;
                break;
            }
            
            case 2: {
                long startTimeAlumnos1 = System.currentTimeMillis();
                for (codigo = 1; codigo <=5000; codigo++){
                    idCiudad = (int) (Math.random() * 5000);
//                    st.execute("INSERT INTO alumno VALUES (" +codigo+ "," +"'Alumno"+codigo+"',"+ "'Ciudad"+ idCiudad + "')");
                    st.execute("INSERT INTO alumno VALUES (" +codigo+ "," +"'Alumno"+codigo+"',"+ "'"+idCiudad + "')");
                }
                tiempo [1] = (System.currentTimeMillis() - startTimeAlumnos1)/1000;
                break;
            }
            
            case 3: {
                long startTimeAlumnos2 = System.currentTimeMillis();
                for (codigo = 5001; codigo <=15000; codigo++){
                    idCiudad = (int) (Math.random() * 10000);
//                    st.execute("INSERT INTO alumno VALUES (" +codigo+ "," +"'Alumno"+codigo+"',"+ "'Ciudad"+ idCiudad + "')");
                    st.execute("INSERT INTO alumno VALUES (" +codigo+ "," +"'Alumno"+codigo+"',"+ "'"+idCiudad + "')");
                }
                tiempo [2] = (System.currentTimeMillis() - startTimeAlumnos2)/1000;
                break;
            }
            
            case 4: {
                long startTimeAlumnos3 = System.currentTimeMillis();
                for (codigo = 15001; codigo <=30000; codigo++){
                    idCiudad = (int) (Math.random() * 15000);
//                    st.execute("INSERT INTO alumno VALUES (" +codigo+ "," +"'Alumno"+codigo+"',"+ "'Ciudad"+ idCiudad + "')");
                    st.execute("INSERT INTO alumno VALUES (" +codigo+ "," +"'Alumno"+codigo+"',"+ "'"+idCiudad + "')");
                }
                tiempo [3] = (System.currentTimeMillis() - startTimeAlumnos3)/1000;
                break;
            }
            
            case 5: {
                long startTimeAlumnos4 = System.currentTimeMillis();
                for (codigo = 30001; codigo <=50000; codigo++){
                    idCiudad = (int) (Math.random() * 20000);
//                    st.execute("INSERT INTO alumno VALUES (" +codigo+ "," +"'Alumno"+codigo+"',"+ "'Ciudad"+ idCiudad + "')");
                    st.execute("INSERT INTO alumno VALUES (" +codigo+ "," +"'Alumno"+codigo+"',"+ "'"+idCiudad + "')");
                }
                tiempo [4] = (System.currentTimeMillis() - startTimeAlumnos4)/1000;
                break;
            }
        }
        
    }
    
}
