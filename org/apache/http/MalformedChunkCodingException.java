package org.apache.http;

import java.io.IOException;

@Deprecated
public class MalformedChunkCodingException extends IOException {
    private static final long serialVersionUID = 2158560246948994524L;

    public MalformedChunkCodingException() {
    }

    public MalformedChunkCodingException(String str) {
        super(str);
    }
}
