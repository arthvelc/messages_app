package com.curso.mensajes_app;


public class Message {
    private int idMessage;
    private String message;
    private String authorMessage;
    private String dateMessage;
    //Constructor
    public Message() {
    }
    public Message(String message, String authorMessage, String dateMessage) {
        this.message = message;
        this.authorMessage = authorMessage;
        this.dateMessage = dateMessage;
    }

    //Getters and Setters
    public int getIdMessage() {
        return idMessage;
    }
    public void setIdMessage(int idMessage) {
        this.idMessage = idMessage;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public String getAuthorMessage() {
        return authorMessage;
    }
    public void setAuthorMessage(String authorMessage) {
        this.authorMessage = authorMessage;
    }
    public String getDateMessage() {
        return dateMessage;
    }
    public void setDateMessage(String dateMessage) {
        this.dateMessage = dateMessage;
    }
    //toString
    @Override
    public String toString() {
        return "Message [idMessage=" + idMessage + ", message=" + message + ", authorMessage=" + authorMessage
                + ", dateMessage=" + dateMessage + "]";
    }
    
}
