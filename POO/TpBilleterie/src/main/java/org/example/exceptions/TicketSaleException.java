package org.example.exceptions;

public class TicketSaleException extends RuntimeException{
    public TicketSaleException(String message){
        super(message);
    }
}
