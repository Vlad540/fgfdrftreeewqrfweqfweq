package defpackage;

import java.io.EOFException;
import java.util.Arrays;

/* renamed from: lj6  reason: default package */
public final class lj6 implements bpe {
    public static final xu5 g;
    public static final xu5 h;
    public final yo a = new yo(1);
    public final bpe b;
    public final xu5 c;
    public xu5 d;
    public byte[] e;
    public int f;

    static {
        uu5 uu5 = new uu5();
        uu5.m = c49.l("application/id3");
        g = uu5.a();
        uu5 uu52 = new uu5();
        uu52.m = c49.l("application/x-emsg");
        h = uu52.a();
    }

    public lj6(bpe bpe, int i) {
        this.b = bpe;
        if (i == 1) {
            this.c = g;
        } else if (i == 3) {
            this.c = h;
        } else {
            throw new IllegalArgumentException(wn6.h(i, "Unknown metadataType: "));
        }
        this.e = new byte[0];
        this.f = 0;
    }

    public final void a(long j, int i, int i2, int i3, zoe zoe) {
        int i4 = i3;
        this.d.getClass();
        int i5 = this.f - i4;
        ija ija = new ija(Arrays.copyOfRange(this.e, i5 - i2, i5));
        byte[] bArr = this.e;
        System.arraycopy(bArr, i5, bArr, 0, i4);
        this.f = i4;
        String str = this.d.n;
        xu5 xu5 = this.c;
        if (!oze.a(str, xu5.n)) {
            if ("application/x-emsg".equals(this.d.n)) {
                this.a.getClass();
                w05 Z = yo.Z(ija);
                xu5 k = Z.k();
                String str2 = xu5.n;
                if (k == null || !oze.a(str2, k.n)) {
                    xu5 k2 = Z.k();
                    ez3.j0("Ignoring EMSG. Expected it to contain wrapped " + str2 + " but actual wrapped format: " + k2);
                    return;
                }
                byte[] o = Z.o();
                o.getClass();
                ija = new ija(o);
            } else {
                ez3.j0("Ignoring sample for unsupported format: " + this.d.n);
                return;
            }
        }
        int a2 = ija.a();
        this.b.b(ija, a2, 0);
        this.b.a(j, i, a2, 0, zoe);
    }

    public final void b(ija ija, int i, int i2) {
        int i3 = this.f + i;
        byte[] bArr = this.e;
        if (bArr.length < i3) {
            this.e = Arrays.copyOf(bArr, (i3 / 2) + i3);
        }
        ija.e(this.f, this.e, i);
        this.f += i;
    }

    public final int c(jz3 jz3, int i, boolean z) {
        int i2 = this.f + i;
        byte[] bArr = this.e;
        if (bArr.length < i2) {
            this.e = Arrays.copyOf(bArr, (i2 / 2) + i2);
        }
        int read = jz3.read(this.e, this.f, i);
        if (read != -1) {
            this.f += read;
            return read;
        } else if (z) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    public final void e(xu5 xu5) {
        this.d = xu5;
        this.b.e(this.c);
    }
}
