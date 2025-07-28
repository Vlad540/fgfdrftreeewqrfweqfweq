package com.fasterxml.jackson.core.exc;

import com.fasterxml.jackson.core.JsonProcessingException;

public abstract class StreamReadException extends JsonProcessingException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StreamReadException(i67 i67, String str) {
        super(str, i67 == null ? null : i67.o(), (NumberFormatException) null);
    }
}
