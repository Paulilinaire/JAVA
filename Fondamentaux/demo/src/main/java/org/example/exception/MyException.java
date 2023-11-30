package org.example.exception;

// exception surveillée
public class MyException extends Exception{

    public MyException(String message){
        super(message); // super appel du parent Exception
     }
}
