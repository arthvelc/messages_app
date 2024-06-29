package com.curso.mensajes_app;
import java.sql.Connection;


public class App {
    public static void main( String[] args ){

        Conexion conexion = new Conexion();
        
        try(Connection cnx = conexion.getConnectionApp()){
            if(cnx != null){
                System.out.println("Conexion exitosa desde main");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
