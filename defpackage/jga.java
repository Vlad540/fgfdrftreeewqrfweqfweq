package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: jga  reason: default package */
public final class jga extends lzd {
    public static final byte[] p = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] q = {79, 112, 117, 115, 84, 97, 103, 115};
    public boolean o;

    public static boolean g(ija ija, byte[] bArr) {
        if (ija.a() < bArr.length) {
            return false;
        }
        int i = ija.b;
        byte[] bArr2 = new byte[bArr.length];
        ija.e(0, bArr2, bArr.length);
        ija.G(i);
        return Arrays.equals(bArr2, bArr);
    }

    public final long b(ija ija) {
        byte[] bArr = ija.a;
        byte b = 0;
        byte b2 = bArr[0];
        if (bArr.length > 1) {
            b = bArr[1];
        }
        return (((long) this.f) * ete.D(b2, b)) / 1000000;
    }

    public final boolean d(ija ija, long j, j1c j1c) {
        if (g(ija, p)) {
            byte[] copyOf = Arrays.copyOf(ija.a, ija.c);
            byte b = copyOf[9] & 255;
            ArrayList h = ete.h(copyOf);
            if (((xu5) j1c.b) != null) {
                return true;
            }
            uu5 uu5 = new uu5();
            uu5.m = c49.l("audio/opus");
            uu5.A = b;
            uu5.B = 48000;
            uu5.p = h;
            j1c.b = new xu5(uu5);
            return true;
        } else if (g(ija, q)) {
            oyb.l((xu5) j1c.b);
            if (this.o) {
                return true;
            }
            this.o = true;
            ija.H(8);
            a39 v = h2g.v(ws6.k((String[]) h2g.x(ija, false, false).b));
            if (v == null) {
                return true;
            }
            uu5 a = ((xu5) j1c.b).a();
            a.j = v.b(((xu5) j1c.b).k);
            j1c.b = new xu5(a);
            return true;
        } else {
            oyb.l((xu5) j1c.b);
            return false;
        }
    }

    public final void f(boolean z) {
        super.f(z);
        if (z) {
            this.o = false;
        }
    }
}
