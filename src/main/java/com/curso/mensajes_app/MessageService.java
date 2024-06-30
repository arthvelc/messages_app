package com.curso.mensajes_app;
import java.util.Scanner;

public class MessageService {

    public static void createMessage(){
        // Instanciar la clase Scanner
        Scanner sc = new Scanner(System.in);
        // Pedir al usuario que escriba un mensaje
        System.out.println("Escribe tu mensaje: ");
        String contentMessage = sc.nextLine();
        // Pedir al usuario que escriba su nombre
        System.out.println("Tu nombre: ");
        String author = sc.nextLine();
        // Crear un objeto de la clase Message
        Message message = new Message();
        // Establecer el mensaje y el autor del mensaje
        message.setMessage(contentMessage);
        message.setAuthorMessage(author);
        // Llamar al metodo createMessageDB de la clase MessageDAO
        MessageDAO.createMessageDB(message);
    }

    public static void listMessages(){

    }

    public static void deleteMessage(){

    }

    public static void updateMessage(){

    }


}
