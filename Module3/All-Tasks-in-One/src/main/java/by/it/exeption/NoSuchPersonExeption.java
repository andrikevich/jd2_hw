package by.it.exeption;

public class NoSuchPersonExeption extends Error {

    public NoSuchPersonExeption() {
    }

    public NoSuchPersonExeption(String message) {
        super(message);
    }
}
