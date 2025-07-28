package defpackage;

import com.google.android.exoplayer2.ParserException;
import java.math.RoundingMode;

/* renamed from: tef  reason: default package */
public final class tef implements ref, sef {
    public final /* synthetic */ int a = 0;
    public final int b;
    public long c;
    public int d;
    public long e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;

    public tef(h75 h75, ape ape, wef wef, String str, int i2) {
        this.f = h75;
        this.g = ape;
        this.h = wef;
        int i3 = wef.d;
        int i4 = wef.a;
        int i5 = (i3 * i4) / 8;
        int i6 = wef.c;
        if (i6 == i5) {
            int i7 = wef.b;
            int i8 = i7 * i5;
            int i9 = i8 * 8;
            int max = Math.max(i5, i8 / 10);
            this.b = max;
            tu5 tu5 = new tu5();
            tu5.k = str;
            tu5.f = i9;
            tu5.g = i9;
            tu5.l = max;
            tu5.x = i4;
            tu5.y = i7;
            tu5.z = i2;
            this.i = new vu5(tu5);
            return;
        }
        StringBuilder sb = new StringBuilder(50);
        sb.append("Expected block size: ");
        sb.append(i5);
        sb.append("; got: ");
        sb.append(i6);
        throw ParserException.a((RuntimeException) null, sb.toString());
    }

    public final void a(long j) {
        switch (this.a) {
            case 0:
                this.c = j;
                this.d = 0;
                this.e = 0;
                return;
            default:
                this.c = j;
                this.d = 0;
                this.e = 0;
                return;
        }
    }

    public final void b(int i2, long j) {
        switch (this.a) {
            case 0:
                ((h75) this.f).K(new xef((wef) this.h, 1, (long) i2, j));
                ((ape) this.g).d((vu5) this.i);
                return;
            default:
                ((i75) this.f).M(new yef((wef) this.h, 1, (long) i2, j));
                ((bpe) this.g).e((xu5) this.i);
                return;
        }
    }

    public boolean c(r74 r74, long j) {
        int i2;
        int i3;
        int i4;
        Object obj = this.g;
        long j2 = j;
        while (true) {
            i2 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
            if (i2 <= 0 || (i3 = this.d) >= (i4 = this.b)) {
                wef wef = (wef) this.h;
                int i5 = wef.c;
                int i6 = this.d / i5;
            } else {
                int c2 = ((bpe) obj).c(r74, (int) Math.min((long) (i4 - i3), j2), true);
                if (c2 == -1) {
                    j2 = 0;
                } else {
                    this.d += c2;
                    j2 -= (long) c2;
                }
            }
        }
        wef wef2 = (wef) this.h;
        int i52 = wef2.c;
        int i62 = this.d / i52;
        if (i62 > 0) {
            long j3 = this.c;
            long j4 = this.e;
            long j5 = (long) wef2.b;
            int i7 = oze.a;
            int i8 = i62 * i52;
            int i9 = this.d - i8;
            ((bpe) obj).a(j3 + oze.a0(j4, 1000000, j5, RoundingMode.FLOOR), 1, i8, i9, (zoe) null);
            this.e += (long) i62;
            this.d = i9;
        }
        return i2 <= 0;
    }

    public boolean d(q74 q74, long j) {
        int i2;
        int i3;
        int i4;
        long j2 = j;
        while (true) {
            i2 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
            if (i2 <= 0 || (i3 = this.d) >= (i4 = this.b)) {
                wef wef = (wef) this.h;
                int i5 = wef.c;
                int i6 = this.d / i5;
            } else {
                int a2 = ((ape) this.g).a(q74, (int) Math.min((long) (i4 - i3), j2), true);
                if (a2 == -1) {
                    j2 = 0;
                } else {
                    this.d += a2;
                    j2 -= (long) a2;
                }
            }
        }
        wef wef2 = (wef) this.h;
        int i52 = wef2.c;
        int i62 = this.d / i52;
        if (i62 > 0) {
            int i7 = i62 * i52;
            int i8 = this.d - i7;
            ((ape) this.g).b(this.c + mze.J(this.e, 1000000, (long) wef2.b), 1, i7, i8, (yoe) null);
            this.e += (long) i62;
            this.d = i8;
        }
        return i2 <= 0;
    }

    public tef(i75 i75, bpe bpe, wef wef, String str, int i2) {
        this.f = i75;
        this.g = bpe;
        this.h = wef;
        int i3 = wef.d;
        int i4 = wef.a;
        int i5 = (i3 * i4) / 8;
        int i6 = wef.c;
        if (i6 == i5) {
            int i7 = wef.b;
            int i8 = i7 * i5;
            int i9 = i8 * 8;
            int max = Math.max(i5, i8 / 10);
            this.b = max;
            uu5 uu5 = new uu5();
            uu5.m = c49.l(str);
            uu5.g = i9;
            uu5.h = i9;
            uu5.n = max;
            uu5.A = i4;
            uu5.B = i7;
            uu5.C = i2;
            this.i = new xu5(uu5);
            return;
        }
        throw androidx.media3.common.ParserException.a((RuntimeException) null, "Expected block size: " + i5 + "; got: " + i6);
    }
}
