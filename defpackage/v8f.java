package defpackage;

import androidx.media3.extractor.flv.TagPayloadReader$UnsupportedFormatException;

/* renamed from: v8f  reason: default package */
public final class v8f extends u2 {
    public int X;
    public boolean Y;
    public boolean Z;
    public final ija c = new ija(pfa.b);
    public final ija o = new ija(4);
    public int w0;

    public v8f(bpe bpe) {
        super(11, bpe);
    }

    public final boolean Z1(ija ija) {
        int u = ija.u();
        int i = (u >> 4) & 15;
        int i2 = u & 15;
        if (i2 == 7) {
            this.w0 = i;
            return i != 5;
        }
        throw new TagPayloadReader$UnsupportedFormatException(wn6.h(i2, "Video format not supported: "));
    }

    public final boolean a2(long j, ija ija) {
        int u = ija.u();
        byte[] bArr = ija.a;
        int i = ija.b;
        int i2 = i + 1;
        ija.b = i2;
        int i3 = i + 2;
        ija.b = i3;
        int i4 = (bArr[i2] & 255) << 8;
        ija.b = i + 3;
        long j2 = (((long) ((bArr[i3] & 255) | i4 | (((bArr[i] & 255) << 24) >> 8))) * 1000) + j;
        bpe bpe = (bpe) this.b;
        if (u == 0 && !this.Y) {
            byte[] bArr2 = new byte[ija.a()];
            ija ija2 = new ija(bArr2);
            ija.e(0, bArr2, ija.a());
            uc0 a = uc0.a(ija2);
            this.X = a.b;
            uu5 uu5 = new uu5();
            uu5.m = c49.l("video/avc");
            uu5.i = a.l;
            uu5.s = a.c;
            uu5.t = a.d;
            uu5.w = a.k;
            uu5.p = a.a;
            bpe.e(uu5.a());
            this.Y = true;
            return false;
        } else if (u != 1 || !this.Y) {
            return false;
        } else {
            int i5 = this.w0 == 1 ? 1 : 0;
            if (!this.Z && i5 == 0) {
                return false;
            }
            ija ija3 = this.o;
            byte[] bArr3 = ija3.a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i6 = 4 - this.X;
            int i7 = 0;
            while (ija.a() > 0) {
                ija.e(i6, ija3.a, this.X);
                ija3.G(0);
                int y = ija3.y();
                ija ija4 = this.c;
                ija4.G(0);
                bpe.b(ija4, 4, 0);
                bpe.b(ija, y, 0);
                i7 = i7 + 4 + y;
            }
            ((bpe) this.b).a(j2, i5, i7, 0, (zoe) null);
            this.Z = true;
            return true;
        }
    }
}
