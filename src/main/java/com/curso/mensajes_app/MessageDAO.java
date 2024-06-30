package com.curso.mensajes_app;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

// La capa DAO (Data Access Object) es la encargada de interactuar con la base de datos.
public class MessageDAO {

    // private String url = "jdbc:mysql://localhost:3306/mensajes_app";
    // private String user = "root";
    // private String password = "";

    //esta parte va a hacer el CRUD de la base de datos.


    //metodo para crear el mensaje
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
        // Instanciar la clase Conexion
        Conexion dbConnect = new Conexion();

        // Crear la conexion a la base de datos
        try(Connection connect = dbConnect.getConnectionApp()){
            // Preparar la consulta SQL
            PreparedStatement ps = null;
            //ResultSet es una interfaz de java.sql que sirve para manejar los resultados de una consulta SQL en una base de datos relacional en MySQL o MariaDB por ejemplo. 
            ResultSet rs = null;

            try{
                String query = "SELECT * FROM mensajes";
                ps = connect.prepareStatement(query);
                rs = ps.executeQuery(query);
                System.out.println("=================================");
                System.out.println("Mensajes: ");
                System.out.println("=================================");
                while (rs.next()){
                    System.out.println("ID: " + rs.getInt("id_mensajes"));
                    System.out.println("Autor: " + rs.getString("autor_mensaje"));
                    System.out.println("Mensaje: " + rs.getString("mensaje"));
                    System.out.println("Fecha: " + rs.getString("fecha_mensaje"));
                    System.out.println("=================================");
                }

                System.out.println("Todos los mensajes se han mostrado con éxito");
            }catch(SQLException ex){
                System.out.println(ex);
            }
        }catch(SQLException e){
            System.out.println(e);
        }
    }

    //metodo para borrar un mensaje
    public static void deleteMessageDB(int id_message) {
        Conexion dbConnect = new Conexion();
    
        try(Connection connect = dbConnect.getConnectionApp()){
            PreparedStatement ps = null;
            try{
                String query = "DELETE FROM mensajes WHERE id_mensajes = ?";
                ps = connect.prepareStatement(query);
                //setInt lleva por parametro el indice y el valor que se va a eliminar en este caso el id del mensaje.
                ps.setInt(1, id_message);
                ps.executeUpdate();
                System.out.println("============================================");
                System.out.println("El mensaje ha sido eliminado con éxito");
    
            }catch(SQLException ex){
                System.out.println(ex);
                System.out.println("No se pudo eliminar el mensaje");
            }
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    //metodo para actualizar un mensaje
    public static void updateMessageDB(Message message) {
    
    }

}
