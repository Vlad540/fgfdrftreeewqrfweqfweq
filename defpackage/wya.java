package defpackage;

import android.os.Handler;
import androidx.media3.common.ParserException;

/* renamed from: wya  reason: default package */
public final class wya implements bpe {
    public final wjc a;
    public final qe4 b = new qe4(19);
    public final f39 c = new n24(1);
    public long d = -9223372036854775807L;
    public final /* synthetic */ xya e;

    /* JADX WARNING: type inference failed for: r2v3, types: [n24, f39] */
    public wya(xya xya, l34 l34) {
        this.e = xya;
        this.a = new wjc(l34, (no4) null, (fo4) null);
    }

    public final void a(long j, int i, int i2, int i3, zoe zoe) {
        long f;
        long j2;
        this.a.a(j, i, i2, i3, zoe);
        while (this.a.s(false)) {
            f39 f39 = this.c;
            f39.v();
            if (this.a.x(this.b, f39, 0, false) == -4) {
                f39.y();
            } else {
                f39 = null;
            }
            if (f39 != null) {
                long j3 = f39.Z;
                a39 l = ((yo) this.e.x0).l(f39);
                if (l != null) {
                    w05 w05 = (w05) l.a[0];
                    String str = w05.a;
                    String str2 = w05.b;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            j2 = oze.V(oze.q(w05.X));
                        } catch (ParserException unused) {
                            j2 = -9223372036854775807L;
                        }
                        if (j2 != -9223372036854775807L) {
                            uya uya = new uya(j3, j2);
                            Handler handler = this.e.b;
                            handler.sendMessage(handler.obtainMessage(1, uya));
                        }
                    }
                }
            }
        }
        wjc wjc = this.a;
        pjc pjc = wjc.a;
        synchronized (wjc) {
            int i4 = wjc.s;
            f = i4 == 0 ? -1 : wjc.f(i4);
        }
        pjc.c(f);
    }

    public final void b(ija ija, int i, int i2) {
        this.a.b(ija, i, 0);
    }

    public final int c(jz3 jz3, int i, boolean z) {
        return this.a.c(jz3, i, z);
    }

    public final void e(xu5 xu5) {
        this.a.e(xu5);
    }
}
