package defpackage;

import com.google.android.exoplayer2.extractor.flv.TagPayloadReader$UnsupportedFormatException;

/* renamed from: u8f  reason: default package */
public final class u8f extends u2 {
    public int X;
    public boolean Y;
    public boolean Z;
    public final yze c = new yze(kjd.l);
    public final yze o = new yze(4);
    public int w0;

    public u8f(ape ape) {
        super(10, ape);
    }

    public final boolean Z1(yze yze) {
        int v = yze.v();
        int i = (v >> 4) & 15;
        int i2 = v & 15;
        if (i2 == 7) {
            this.w0 = i;
            return i != 5;
        }
        throw new TagPayloadReader$UnsupportedFormatException(m4b.h(39, i2, "Video format not supported: "));
    }

    public final boolean a2(long j, yze yze) {
        int v = yze.v();
        byte[] bArr = yze.a;
        int i = yze.b;
        int i2 = i + 1;
        yze.b = i2;
        int i3 = i + 2;
        yze.b = i3;
        int i4 = (bArr[i2] & 255) << 8;
        yze.b = i + 3;
        long j2 = (((long) ((bArr[i3] & 255) | i4 | (((bArr[i] & 255) << 24) >> 8))) * 1000) + j;
        ape ape = (ape) this.b;
        if (v == 0 && !this.Y) {
            byte[] bArr2 = new byte[yze.c()];
            yze yze2 = new yze(bArr2);
            yze.g(0, bArr2, yze.c());
            tc0 a = tc0.a(yze2);
            this.X = a.b;
            tu5 tu5 = new tu5();
            tu5.k = "video/avc";
            tu5.h = a.f;
            tu5.p = a.c;
            tu5.q = a.d;
            tu5.t = a.e;
            tu5.m = a.a;
            ape.d(new vu5(tu5));
            this.Y = true;
            return false;
        } else if (v != 1 || !this.Y) {
            return false;
        } else {
            int i5 = this.w0 == 1 ? 1 : 0;
            if (!this.Z && i5 == 0) {
                return false;
            }
            yze yze3 = this.o;
            byte[] bArr3 = yze3.a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i6 = 4 - this.X;
            int i7 = 0;
            while (yze.c() > 0) {
                yze.g(i6, yze3.a, this.X);
                yze3.H(0);
                int y = yze3.y();
                yze yze4 = this.c;
                yze4.H(0);
                ape.c(4, yze4);
                ape.c(y, yze);
                i7 = i7 + 4 + y;
            }
            ((ape) this.b).b(j2, i5, i7, 0, (yoe) null);
            this.Z = true;
            return true;
        }
    }
}
