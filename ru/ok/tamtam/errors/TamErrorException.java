package ru.ok.tamtam.errors;

public class TamErrorException extends Exception {
    public final uae a;

    public TamErrorException(uae uae) {
        super(uae.b);
        this.a = uae;
    }
}
