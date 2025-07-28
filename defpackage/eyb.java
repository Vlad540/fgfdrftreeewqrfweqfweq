package defpackage;

import com.google.android.exoplayer2.ParserException;
import java.io.IOException;

/* renamed from: eyb  reason: default package */
public final class eyb implements d75 {
    public final vu5 a;
    public final yze b = new yze(9);
    public ape c;
    public int d = 0;
    public int e;
    public long f;
    public int g;
    public int h;

    public eyb(vu5 vu5) {
        this.a = vu5;
    }

    public final void d(long j, long j2) {
        this.d = 0;
    }

    public final void g(h75 h75) {
        h75.K(new si5(-9223372036854775807L));
        ape B = h75.B(0, 3);
        this.c = B;
        B.d(this.a);
        h75.w();
    }

    public final boolean h(f75 f75) {
        yze yze = this.b;
        yze.E(8);
        ((q74) f75).r(yze.a, 0, 8, false);
        return yze.h() == 1380139777;
    }

    public final int i(f75 f75, le4 le4) {
        swb.i(this.c);
        while (true) {
            int i = this.d;
            yze yze = this.b;
            if (i == 0) {
                yze.E(8);
                if (!((q74) f75).i(yze.a, 0, 8, true)) {
                    return -1;
                }
                if (yze.h() == 1380139777) {
                    this.e = yze.v();
                    this.d = 1;
                } else {
                    throw new IOException("Input not RawCC");
                }
            } else if (i == 1) {
                int i2 = this.e;
                if (i2 == 0) {
                    yze.E(5);
                    if (!((q74) f75).i(yze.a, 0, 5, true)) {
                        break;
                    }
                    this.f = (yze.w() * 1000) / 45;
                    this.g = yze.v();
                    this.h = 0;
                    this.d = 2;
                } else if (i2 == 1) {
                    yze.E(9);
                    if (!((q74) f75).i(yze.a, 0, 9, true)) {
                        break;
                    }
                    this.f = yze.p();
                    this.g = yze.v();
                    this.h = 0;
                    this.d = 2;
                } else {
                    StringBuilder sb = new StringBuilder(39);
                    sb.append("Unsupported version number: ");
                    sb.append(i2);
                    throw ParserException.a((RuntimeException) null, sb.toString());
                }
            } else if (i == 2) {
                while (this.g > 0) {
                    yze.E(3);
                    ((q74) f75).i(yze.a, 0, 3, false);
                    this.c.c(3, yze);
                    this.h += 3;
                    this.g--;
                }
                int i3 = this.h;
                if (i3 > 0) {
                    this.c.b(this.f, 1, i3, 0, (yoe) null);
                }
                this.d = 1;
                return 0;
            } else {
                throw new IllegalStateException();
            }
        }
        this.d = 0;
        return -1;
    }

    public final void release() {
    }
}
