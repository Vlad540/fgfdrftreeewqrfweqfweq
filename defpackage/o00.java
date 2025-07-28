package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: o00  reason: default package */
public final class o00 {
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final long e;
    public final List f;

    static {
        n00 n00 = new n00();
        if (n00.e == null) {
            n00.e = Collections.emptyList();
        }
        new o00(n00);
    }

    public o00(n00 n00) {
        this.a = n00.a;
        this.b = n00.c;
        this.c = n00.d;
        this.d = n00.f;
        this.e = n00.b;
        this.f = n00.e;
    }

    public final boolean a() {
        return this.d == 3;
    }

    public final boolean b() {
        return c() || a() || this.d == 4;
    }

    public final boolean c() {
        return this.d == 5;
    }

    public final boolean d() {
        return this.c == 2;
    }
}
