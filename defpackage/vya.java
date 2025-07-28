package defpackage;

import android.os.Handler;
import com.google.android.exoplayer2.ParserException;

/* renamed from: vya  reason: default package */
public final class vya implements ape {
    public final vjc a;
    public final otf b = new Object();
    public final e39 c = new m24(1);
    public long d = -9223372036854775807L;
    public final /* synthetic */ xya e;

    /* JADX WARNING: type inference failed for: r2v2, types: [otf, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v3, types: [e39, m24] */
    public vya(xya xya, l34 l34) {
        this.e = xya;
        this.a = new vjc(l34, (mo4) null, (eo4) null);
    }

    public final int a(iz3 iz3, int i, boolean z) {
        return this.a.e(iz3, i, z);
    }

    public final void b(long j, int i, int i2, int i3, yoe yoe) {
        long g;
        long j2;
        this.a.b(j, i, i2, i3, yoe);
        while (this.a.t(false)) {
            e39 e39 = this.c;
            e39.v();
            if (this.a.y(this.b, e39, 0, false) == -4) {
                e39.y();
            } else {
                e39 = null;
            }
            if (e39 != null) {
                long j3 = e39.Y;
                y29 j4 = ((xo) this.e.x0).j(e39);
                if (j4 != null) {
                    v05 v05 = (v05) j4.a[0];
                    String str = v05.a;
                    String str2 = v05.b;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            j2 = mze.G(mze.n(v05.X));
                        } catch (ParserException unused) {
                            j2 = -9223372036854775807L;
                        }
                        if (j2 != -9223372036854775807L) {
                            tya tya = new tya(j3, j2);
                            Handler handler = this.e.b;
                            handler.sendMessage(handler.obtainMessage(1, tya));
                        }
                    }
                }
            }
        }
        vjc vjc = this.a;
        pjc pjc = vjc.a;
        synchronized (vjc) {
            int i4 = vjc.s;
            g = i4 == 0 ? -1 : vjc.g(i4);
        }
        pjc.c(g);
    }

    public final void c(int i, yze yze) {
        this.a.f(i, yze);
    }

    public final void d(vu5 vu5) {
        this.a.d(vu5);
    }
}
