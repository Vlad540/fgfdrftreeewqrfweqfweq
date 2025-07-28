package defpackage;

import java.io.EOFException;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: kj6  reason: default package */
public final class kj6 implements ape {
    public static final vu5 g;
    public static final vu5 h;
    public final xo a = new xo(1);
    public final ape b;
    public final vu5 c;
    public vu5 d;
    public byte[] e;
    public int f;

    static {
        tu5 tu5 = new tu5();
        tu5.k = "application/id3";
        g = tu5.a();
        tu5 tu52 = new tu5();
        tu52.k = "application/x-emsg";
        h = tu52.a();
    }

    public kj6(ape ape, int i) {
        this.b = ape;
        if (i == 1) {
            this.c = g;
        } else if (i == 3) {
            this.c = h;
        } else {
            throw new IllegalArgumentException(m4b.h(33, i, "Unknown metadataType: "));
        }
        this.e = new byte[0];
        this.f = 0;
    }

    public final int a(iz3 iz3, int i, boolean z) {
        int i2 = this.f + i;
        byte[] bArr = this.e;
        if (bArr.length < i2) {
            this.e = Arrays.copyOf(bArr, (i2 / 2) + i2);
        }
        int read = iz3.read(this.e, this.f, i);
        if (read != -1) {
            this.f += read;
            return read;
        } else if (z) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    public final void b(long j, int i, int i2, int i3, yoe yoe) {
        this.d.getClass();
        int i4 = this.f - i3;
        yze yze = new yze(Arrays.copyOfRange(this.e, i4 - i2, i4));
        byte[] bArr = this.e;
        System.arraycopy(bArr, i4, bArr, 0, i3);
        this.f = i3;
        String str = this.d.A0;
        vu5 vu5 = this.c;
        if (!mze.a(str, vu5.A0)) {
            if ("application/x-emsg".equals(this.d.A0)) {
                this.a.getClass();
                v05 V = xo.V(yze);
                vu5 k = V.k();
                if (k == null || !mze.a(vu5.A0, k.A0)) {
                    Objects.toString(V.k());
                    return;
                }
                byte[] o = V.o();
                o.getClass();
                yze = new yze(o);
            } else {
                String valueOf = String.valueOf(this.d.A0);
                if (valueOf.length() != 0) {
                    "Ignoring sample for unsupported format: ".concat(valueOf);
                    return;
                }
                return;
            }
        }
        int c2 = yze.c();
        this.b.c(c2, yze);
        this.b.b(j, i, c2, i3, yoe);
    }

    public final void c(int i, yze yze) {
        int i2 = this.f + i;
        byte[] bArr = this.e;
        if (bArr.length < i2) {
            this.e = Arrays.copyOf(bArr, (i2 / 2) + i2);
        }
        yze.g(this.f, this.e, i);
        this.f += i;
    }

    public final void d(vu5 vu5) {
        this.d = vu5;
        this.b.d(this.c);
    }
}
