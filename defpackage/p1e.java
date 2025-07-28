package defpackage;

import java.util.List;

/* renamed from: p1e  reason: default package */
public abstract class p1e extends rx implements g1e {
    public long X;
    public long c;
    public g1e o;

    public final int h(long j) {
        g1e g1e = this.o;
        g1e.getClass();
        return g1e.h(j - this.X);
    }

    public final long k(int i) {
        g1e g1e = this.o;
        g1e.getClass();
        return g1e.k(i) + this.X;
    }

    public final List q(long j) {
        g1e g1e = this.o;
        g1e.getClass();
        return g1e.q(j - this.X);
    }

    public final int u() {
        g1e g1e = this.o;
        g1e.getClass();
        return g1e.u();
    }

    public abstract void v();

    public final void w(long j, g1e g1e, long j2) {
        this.c = j;
        this.o = g1e;
        if (j2 != Long.MAX_VALUE) {
            j = j2;
        }
        this.X = j;
    }
}
