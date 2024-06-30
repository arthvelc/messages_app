package com.curso.mensajes_app;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class MessageDAO {

    // private String url = "jdbc:mysql://localhost:3306/mensajes_app";
    // private String user = "root";
    // private String password = "";

    //esta parte va a hacer el CRUD de la base de datos.


    //metodo para creat el mesaje
    public static void createMessageDB(Message message) {
        // Instanciar la clase Conexion
        Conexion dbConnect = new Conexion();
        // Crear la conexion a la base de datos
        try (Connection connect = dbConnect.getConnectionApp()) {
            // Preparar la consulta SQL
            PreparedStatement ps = null;

            // Manejar la excepcion
            try {
                // Query para insertar un mensaje
                String query = "INSERT INTO mensajes (mensaje, autor_mensaje) VALUES (?,?);";
                ps = connect.prepareStatement(query);
                // Establecer los valores de los parametros
                ps.setString(1, message.getMessage());
                ps.setString(2, message.getAuthorMessage());
                // Ejecutar la consulta
                ps.executeUpdate();
                System.out.println("Mensaje creado con éxito");

            } catch (SQLException ex) {
                System.out.println(ex);
            }

        } catch (SQLException e) {
            System.out.println(e);
        }


    }

    //metodo para leer los mensajes
    public static void readMessageDB() {

    }

    //metodo para borrar un mensaje
    public static void deleteMessageDB(int id_message) {

    }

    //metodo para actualizar un mensaje
    public static void updateMessageDB(Message message) {

    }

}
