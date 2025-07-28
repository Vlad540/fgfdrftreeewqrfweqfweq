package defpackage;

import android.net.Uri;
import java.util.Map;

/* renamed from: lo6  reason: default package */
public final class lo6 implements qz3 {
    public int X;
    public final qz3 a;
    public final int b;
    public final sgb c;
    public final byte[] o;

    public lo6(qz3 qz3, int i, sgb sgb) {
        oyb.d(i > 0);
        this.a = qz3;
        this.b = i;
        this.c = sgb;
        this.o = new byte[1];
        this.X = i;
    }

    public final long G(yz3 yz3) {
        throw new UnsupportedOperationException();
    }

    public final void H(cqe cqe) {
        cqe.getClass();
        this.a.H(cqe);
    }

    public final Map a() {
        return this.a.a();
    }

    public final void close() {
        throw new UnsupportedOperationException();
    }

    public final Uri getUri() {
        return this.a.getUri();
    }

    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.X;
        qz3 qz3 = this.a;
        if (i3 == 0) {
            byte[] bArr2 = this.o;
            if (qz3.read(bArr2, 0, 1) != -1) {
                int i4 = (bArr2[0] & 255) << 4;
                if (i4 != 0) {
                    byte[] bArr3 = new byte[i4];
                    int i5 = i4;
                    int i6 = 0;
                    while (i5 > 0) {
                        int read = qz3.read(bArr3, i6, i5);
                        if (read != -1) {
                            i6 += read;
                            i5 -= read;
                        }
                    }
                    while (i4 > 0 && bArr3[i4 - 1] == 0) {
                        i4--;
                    }
                    if (i4 > 0) {
                        ija ija = new ija(i4, bArr3);
                        sgb sgb = this.c;
                        long max = !sgb.B0 ? sgb.y0 : Math.max(sgb.C0.j(true), sgb.y0);
                        int a2 = ija.a();
                        bpe bpe = sgb.A0;
                        bpe.getClass();
                        bpe.b(ija, a2, 0);
                        bpe.a(max, 1, a2, 0, (zoe) null);
                        sgb.B0 = true;
                    }
                }
                this.X = this.b;
            }
            return -1;
        }
        int read2 = qz3.read(bArr, i, Math.min(this.X, i2));
        if (read2 != -1) {
            this.X -= read2;
        }
        return read2;
    }
}
