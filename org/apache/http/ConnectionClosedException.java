package org.apache.http;

import java.io.IOException;

@Deprecated
public class ConnectionClosedException extends IOException {
    private static final long serialVersionUID = 617550366255636674L;

    public ConnectionClosedException(String str) {
        super(str);
    }
}
