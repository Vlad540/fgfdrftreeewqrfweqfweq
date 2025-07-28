package defpackage;

import java.io.Serializable;

/* renamed from: rq8  reason: default package */
public final class rq8 implements Serializable {
    public final String X;
    public final int a;
    public final long b;
    public final ym8 c;
    public final String o;

    public rq8(int i, long j, ym8 ym8, String str, String str2) {
        this.a = i;
        this.b = j;
        this.c = ym8;
        this.o = str;
        this.X = str2;
    }

    public final String toString() {
        return "{type=" + wn6.q(this.a) + "}";
    }
}
