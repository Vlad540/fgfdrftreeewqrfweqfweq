package org.apache.http.conn;

@Deprecated
public class ConnectionPoolTimeoutException extends ConnectTimeoutException {
    private static final long serialVersionUID = -7898874842020245128L;

    public ConnectionPoolTimeoutException() {
    }

    public ConnectionPoolTimeoutException(String str) {
        super(str);
    }
}
