package defpackage;

import java.util.Arrays;

/* renamed from: mw6  reason: default package */
public final class mw6 extends gr8 {
    public static volatile mw6[] e;
    public int a = 0;
    public int b = 0;
    public int c = 0;
    public byte[] d = iu7.o;

    public mw6() {
        this.cachedSize = -1;
    }

    public static mw6[] a() {
        if (e == null) {
            synchronized (tz6.b) {
                try {
                    if (e == null) {
                        e = new mw6[0];
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return e;
    }

    public final int computeSerializedSize() {
        int i = this.a;
        int f = i != 0 ? o13.f(1, i) : 0;
        int i2 = this.b;
        if (i2 != 0) {
            f += o13.n(2, i2);
        }
        int i3 = this.c;
        if (i3 != 0) {
            f += o13.n(3, i3);
        }
        return !Arrays.equals(this.d, iu7.o) ? f + o13.b(4, this.d) : f;
    }

    public final gr8 mergeFrom(n13 n13) {
        while (true) {
            int s = n13.s();
            if (s == 0) {
                break;
            } else if (s == 8) {
                int p = n13.p();
                if (p == 0 || p == 1 || p == 2 || p == 3 || p == 4) {
                    this.a = p;
                }
            } else if (s == 16) {
                this.b = n13.p();
            } else if (s == 24) {
                this.c = n13.p();
            } else if (s == 34) {
                this.d = n13.g();
            } else if (!n13.u(s)) {
                break;
            }
        }
        return this;
    }

    public final void writeTo(o13 o13) {
        int i = this.a;
        if (i != 0) {
            o13.w(1, i);
        }
        int i2 = this.b;
        if (i2 != 0) {
            o13.G(2, i2);
        }
        int i3 = this.c;
        if (i3 != 0) {
            o13.G(3, i3);
        }
        if (!Arrays.equals(this.d, iu7.o)) {
            o13.s(4, this.d);
        }
    }
}
