package ui;

import java.util.Scanner;
import com.curso.mensajes_app.MessageService;

public class Menu {
    
    public static void showMenu() {
    	int option = 0;
    	Scanner sc = new Scanner(System.in);
    	
		do{
			
            System.out.println("-----------------------");
            System.out.println("Aplicacion de mensajes");
            System.out.println("-----------------------");
            System.out.println("1. Crear mensaje");
            System.out.println("2. Listar mensajes");
            System.out.println("3. Editar mensaje");
            System.out.println("4. Eliminar mensaje");
            System.out.println("5. Salir");
            System.out.println("-----------------------");
            
        	option = sc.nextInt();

            clearConsole();   

            switch(option){
                case 1:
                    MessageService.createMessage();
                    break;
                case 2:
                    MessageService.listMessages();
                    break;
                case 3:
                    MessageService.updateMessage();
                    break;
                case 4:
                    MessageService.deleteMessage();
                    break;
                case 5:
                	System.out.println("=================================");
                	System.out.println("Gracias por usar la APP");
                	System.out.println("Hasta luego");
                	System.out.println("	c:			");
                	System.out.println("=================================");
                	break;
                default:
                    break;
            } 
        } while(option != 5);
	}

    public static void clearConsole() {
        try {
            final String os = System.getProperty("os.name");
    
            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (final Exception e) {
        	System.out.println("hubo algo mal");
            // En caso de error, simplemente se intenta imprimir líneas en blanco
            for (int i = 0; i < 100; i++) {
                System.out.println();
            }
        }
    }

}
