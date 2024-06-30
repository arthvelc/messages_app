package com.curso.mensajes_app;
import java.sql.Connection;
import java.util.Scanner;
import com.curso.mensajes_app.MessagesServices;


public class App {
    public static void main( String[] args ){


        //Lógica de la aplicación de mensajes con la base de datos en MySQL.
        Scanner sc = new Scanner(System.in);
        int option = 0;

        do {
            if(option < 0 || option > 5){
                System.out.println("Selecciona una opcion valida");
                option = 0;
            }else{
                System.out.println("-----------------");
                System.out.println("Aplicacion de mensajes");
                System.out.println("1. Crear mensaje");
                System.out.println("2. Listar mensajes");
                System.out.println("3. Editar mensaje");
                System.out.println("4. Eliminar mensaje");
                System.out.println("5. Salir");

                //Leer la opcion del usuario
                option = sc.nextInt();

                switch(option){
                    case 1:
                        MessagesServices.createMessage();
                        break;
                    case 2:
                        MessagesServices.listMessages();
                        break;
                    case 3:
                        MessagesServices.updateMessage();
                        break;
                    case 4:
                        MessagesServices.deleteMessage();
                        break;
                    default:
                        break;
                }

            } 
        } while (option != 5);


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
