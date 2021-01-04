package it.academy.module2.exception;

public class ConnectionEstablishException  extends RuntimeException{

    public ConnectionEstablishException() {
    }

    public ConnectionEstablishException(String message) {
        super(message);
    }
}
