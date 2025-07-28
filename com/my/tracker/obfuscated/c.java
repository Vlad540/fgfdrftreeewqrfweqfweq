package com.my.tracker.obfuscated;

public final class c {
    public final String a;
    public final int b;

    public c(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AppSetIdData{id='");
        sb.append(this.a);
        sb.append("', scope=");
        return hr1.h(sb, this.b, '}');
    }
}
