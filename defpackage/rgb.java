package defpackage;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;

/* renamed from: rgb  reason: default package */
public final class rgb implements fj7 {
    public long A0 = -1;
    public vjc B0;
    public boolean C0;
    public final /* synthetic */ xgb D0;
    public final h75 X;
    public final ga3 Y;
    public final le4 Z = new Object();
    public final long a = xi7.h.getAndIncrement();
    public final Uri b;
    public final esd c;
    public final it4 o;
    public volatile boolean w0;
    public boolean x0 = true;
    public long y0;
    public xz3 z0 = b(0);

    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Object, le4] */
    public rgb(xgb xgb, Uri uri, oz3 oz3, it4 it4, h75 h75, ga3 ga3) {
        this.D0 = xgb;
        this.b = uri;
        this.c = new esd(oz3);
        this.o = it4;
        this.X = h75;
        this.Y = ga3;
    }

    public final void a() {
        this.w0 = true;
    }

    public final xz3 b(long j) {
        Collections.emptyMap();
        String str = this.D0.x0;
        Map map = xgb.b1;
        Uri uri = this.b;
        if (uri != null) {
            return new xz3(uri, 0, 1, (byte[]) null, map, j, -1, str, 6, (Object) null);
        }
        throw new IllegalStateException("The uri must be set.");
    }

    public final void load() {
        oz3 oz3;
        int i;
        int i2 = 0;
        while (i2 == 0 && !this.w0) {
            try {
                long j = this.Z.a;
                xz3 b2 = b(j);
                this.z0 = b2;
                long N = this.c.N(b2);
                this.A0 = N;
                if (N != -1) {
                    this.A0 = N + j;
                }
                this.D0.G0 = oo6.a(this.c.a.a());
                esd esd = this.c;
                oo6 oo6 = this.D0.G0;
                if (oo6 == null || (i = oo6.Y) == -1) {
                    oz3 = esd;
                } else {
                    oz3 = new ko6(esd, i, this);
                    xgb xgb = this.D0;
                    xgb.getClass();
                    vjc t = xgb.t(new vgb(0, true));
                    this.B0 = t;
                    t.d(xgb.c1);
                }
                long j2 = j;
                this.o.p(oz3, this.b, this.c.a.a(), j, this.A0, this.X);
                if (this.D0.G0 != null) {
                    d75 d75 = (d75) this.o.b;
                    if (d75 instanceof l79) {
                        ((l79) d75).r = true;
                    }
                }
                if (this.x0) {
                    it4 it4 = this.o;
                    long j3 = this.y0;
                    d75 d752 = (d75) it4.b;
                    d752.getClass();
                    d752.d(j2, j3);
                    this.x0 = false;
                }
                while (true) {
                    long j4 = j2;
                    while (i2 == 0 && !this.w0) {
                        this.Y.a();
                        it4 it42 = this.o;
                        le4 le4 = this.Z;
                        d75 d753 = (d75) it42.b;
                        d753.getClass();
                        q74 q74 = (q74) it42.c;
                        q74.getClass();
                        i2 = d753.i(q74, le4);
                        j2 = this.o.i();
                        if (j2 > this.D0.y0 + j4) {
                            ga3 ga3 = this.Y;
                            synchronized (ga3) {
                                ga3.b = false;
                            }
                            xgb xgb2 = this.D0;
                            xgb2.E0.post(xgb2.D0);
                        }
                    }
                }
                if (i2 == 1) {
                    i2 = 0;
                } else if (this.o.i() != -1) {
                    this.Z.a = this.o.i();
                }
                bm3.f(this.c);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            } catch (Throwable th) {
                if (!(i2 == 1 || this.o.i() == -1)) {
                    this.Z.a = this.o.i();
                }
                bm3.f(this.c);
                throw th;
            }
        }
    }
}
