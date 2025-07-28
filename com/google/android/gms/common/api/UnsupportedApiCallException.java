package com.google.android.gms.common.api;

public final class UnsupportedApiCallException extends UnsupportedOperationException {
    public final ib5 a;

    public UnsupportedApiCallException(ib5 ib5) {
        this.a = ib5;
    }

    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.a));
    }
}
