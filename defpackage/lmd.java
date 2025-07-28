package defpackage;

import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;

/* renamed from: lmd  reason: default package */
public final class lmd extends rg0 {
    public final Object i;
    public final rcc j;
    public final s7e k;
    public final xx l = new xx(4, (byte) 0);
    public final ArrayDeque m = new ArrayDeque();
    public lq7 n;
    public lq7 o;
    public long p;
    public long q;
    public long r;
    public float s;
    public long t;
    public boolean u;

    public lmd(rcc rcc) {
        this.j = rcc;
        Object obj = new Object();
        this.i = obj;
        this.k = new s7e(obj);
        n();
    }

    public final ByteBuffer a() {
        ByteBuffer a = m() ? this.k.a() : super.a();
        synchronized (this.i) {
            try {
                if (!this.m.isEmpty()) {
                    if (this.l.f() <= this.p || d()) {
                        hr1.r(this.m.remove());
                        l(this.l.h());
                        throw null;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return a;
    }

    public final void b(ByteBuffer byteBuffer) {
        int i2;
        ByteBuffer byteBuffer2 = byteBuffer;
        long j2 = this.t;
        h50 h50 = this.b;
        long a0 = oze.a0(j2, 1000000, ((long) h50.a) * ((long) h50.d), RoundingMode.FLOOR);
        float b = this.j.b(a0);
        synchronized (this.i) {
            if (b != this.s) {
                lq7 lq7 = this.o;
                long b2 = lq7.b(lq7.b - 1);
                lq7 lq72 = this.n;
                long b3 = a0 - lq72.b(lq72.b - 1);
                this.n.a(a0);
                lq7 lq73 = this.o;
                if (m()) {
                    s7e s7e = this.k;
                    synchronized (s7e.b) {
                        b3 = s7e.c.g(b3);
                    }
                }
                lq73.a(b3 + b2);
                this.s = b;
                if (m()) {
                    s7e s7e2 = this.k;
                    synchronized (s7e2.b) {
                        qld qld = s7e2.c;
                        if (qld.c != b) {
                            qld.c = b;
                            qld.i = true;
                        }
                    }
                    s7e s7e3 = this.k;
                    synchronized (s7e3.b) {
                        qld qld2 = s7e3.c;
                        if (qld2.d != b) {
                            qld2.d = b;
                            qld2.i = true;
                        }
                    }
                }
                this.k.flush();
                this.u = false;
                super.a();
            }
        }
        int limit = byteBuffer.limit();
        long a = this.j.a(a0);
        if (a != -9223372036854775807L) {
            long j3 = a - a0;
            h50 h502 = this.b;
            i2 = (int) oze.a0(j3, ((long) h502.a) * ((long) h502.d), 1000000, RoundingMode.CEILING);
            int i3 = this.b.d;
            int i4 = i3 - (i2 % i3);
            if (i4 != i3) {
                i2 += i4;
            }
            byteBuffer2.limit(Math.min(limit, byteBuffer.position() + i2));
        } else {
            i2 = -1;
        }
        long position = (long) byteBuffer.position();
        if (m()) {
            this.k.b(byteBuffer2);
            if (i2 != -1 && ((long) byteBuffer.position()) - position == ((long) i2)) {
                this.k.c();
                this.u = true;
            }
        } else {
            ByteBuffer k2 = k(byteBuffer.remaining());
            if (byteBuffer.hasRemaining()) {
                k2.put(byteBuffer2);
            }
            k2.flip();
        }
        this.t = (((long) byteBuffer.position()) - position) + this.t;
        o();
        byteBuffer2.limit(limit);
    }

    public final boolean d() {
        return super.d() && this.k.d();
    }

    public final long f(long j2) {
        long j3 = 0;
        double d = 0.0d;
        while (j3 < j2) {
            rcc rcc = this.j;
            long a = rcc.a(j3);
            if (a == -9223372036854775807L) {
                a = Long.MAX_VALUE;
            }
            d += ((double) (Math.min(a, j2) - j3)) / ((double) rcc.b(j3));
            j3 = a;
        }
        return Math.round(d);
    }

    public final h50 g(h50 h50) {
        return this.k.e(h50);
    }

    public final void h() {
        n();
        this.k.flush();
    }

    public final void i() {
        if (!this.u) {
            this.k.c();
            this.u = true;
        }
    }

    public final void j() {
        n();
        this.k.reset();
    }

    public final void l(long j2) {
        long j3;
        int i2 = this.n.b - 1;
        while (i2 > 0 && this.n.b(i2) > j2) {
            i2--;
        }
        lq7 lq7 = this.n;
        if (i2 == lq7.b - 1) {
            if (this.q < lq7.b(i2)) {
                this.q = this.n.b(i2);
                this.r = this.o.b(i2);
            }
            j3 = j2 - this.q;
            if (m()) {
                s7e s7e = this.k;
                synchronized (s7e.b) {
                    j3 = s7e.c.g(j3);
                }
            }
        } else {
            int i3 = i2 + 1;
            j3 = Math.round((((double) (this.o.b(i3) - this.o.b(i2))) / ((double) (this.n.b(i3) - this.n.b(i2)))) * ((double) (j2 - this.q)));
        }
        this.q = j2;
        this.r += j3;
    }

    public final boolean m() {
        boolean z;
        synchronized (this.i) {
            z = this.s != 1.0f;
        }
        return z;
    }

    public final void n() {
        synchronized (this.i) {
            lq7 lq7 = new lq7(1);
            this.n = lq7;
            this.o = new lq7(1);
            lq7.a(0);
            this.o.a(0);
            this.p = 0;
            this.q = 0;
            this.r = 0;
            this.s = 1.0f;
        }
        this.t = 0;
        this.u = false;
    }

    public final void o() {
        long j2;
        synchronized (this.i) {
            if (m()) {
                s7e s7e = this.k;
                synchronized (s7e.b) {
                    qld qld = s7e.c;
                    long j3 = qld.n;
                    old old = qld.j;
                    old.getClass();
                    j2 = j3 - ((long) ((old.l * old.c) * 2));
                }
                h50 h50 = this.b;
                long a0 = oze.a0(j2, 1000000, ((long) h50.a) * ((long) h50.d), RoundingMode.FLOOR);
                lq7 lq7 = this.n;
                this.p = lq7.b(lq7.b - 1) + a0;
            } else {
                long j4 = this.t;
                h50 h502 = this.b;
                this.p = oze.a0(j4, 1000000, ((long) h502.a) * ((long) h502.d), RoundingMode.FLOOR);
            }
        }
    }
}
