package com.curso.mensajes_app;
import javax.swing.JFrame;

public class MiVentana extends JFrame {
    public MiVentana() {
        super("Mi Primera Ventana"); // Título de la ventana
        setSize(300, 200); // Tamaño de la ventana: ancho, alto
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Finaliza el programa cuando se cierra la ventana
    }

    
}
