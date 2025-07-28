package com.fasterxml.jackson.core;

public class JsonProcessingException extends JacksonException {
    public final e67 a;

    public JsonProcessingException(String str, e67 e67, NumberFormatException numberFormatException) {
        super(str, numberFormatException);
        this.a = e67;
    }

    public String getMessage() {
        String message = super.getMessage();
        if (message == null) {
            message = "N/A";
        }
        e67 e67 = this.a;
        if (e67 == null) {
            return message;
        }
        StringBuilder sb = new StringBuilder(100);
        sb.append(message);
        if (e67 != null) {
            sb.append("\n at ");
            sb.append(e67.toString());
        }
        return sb.toString();
    }

    public final String toString() {
        return getClass().getName() + ": " + getMessage();
    }
}
