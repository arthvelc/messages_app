package com.curso.mensajes_app;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    // Atributos de la clase
    private String url = "jdbc:mysql://localhost:3306/mensajes_app"; // el url de la base de datos
    private String user = "root";
    private String password = "";

    // Metodo para conectarse a la base de datos
    public Connection getConnectionApp() {
        // Connection es una interfaz de java.sql
        //Sirve para establecer la conexion con la base de datos
        Connection conection = null;

        // DriverManager es una clase de java.sql
        //Sirve para manejar la conexion con la base de datos
        try {
            conection = DriverManager.getConnection(url, user, password);

            if(conection != null){
                System.out.println("Conexion exitosa con la base de datos");
            }
        } catch (SQLException e) {
            // TODO: handle exception
            System.out.println(e);
        }

        return conection;
    }
}
