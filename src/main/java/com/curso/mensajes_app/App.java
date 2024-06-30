package com.curso.mensajes_app;
import java.sql.Connection;

import ui.Menu;


public class App {
    public static void main( String[] args ){


        //Lógica de la aplicación de mensajes con la base de datos en MySQL.
    	Menu.showMenu();


        
        //Prueba de conexion a la base de datos desde main
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
