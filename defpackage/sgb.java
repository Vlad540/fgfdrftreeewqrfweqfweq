package defpackage;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;

/* renamed from: sgb  reason: default package */
public final class sgb implements gj7 {
    public bpe A0;
    public boolean B0;
    public final /* synthetic */ ygb C0;
    public final i75 X;
    public final ga3 Y;
    public final le4 Z = new Object();
    public final long a = yi7.b.getAndIncrement();
    public final Uri b;
    public final fsd c;
    public final ul7 o;
    public volatile boolean w0;
    public boolean x0 = true;
    public long y0;
    public yz3 z0 = b(0);

    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Object, le4] */
    public sgb(ygb ygb, Uri uri, qz3 qz3, ul7 ul7, i75 i75, ga3 ga3) {
        this.C0 = ygb;
        this.b = uri;
        this.c = new fsd(qz3);
        this.o = ul7;
        this.X = i75;
        this.Y = ga3;
    }

    public final void a() {
        this.w0 = true;
    }

    public final yz3 b(long j) {
        Collections.emptyMap();
        String str = this.C0.x0;
        Map map = ygb.d1;
        Uri uri = this.b;
        oyb.m(uri, "The uri must be set.");
        return new yz3(uri, 0, 1, (byte[]) null, map, j, -1, str, 6, (Object) null);
    }

    public final void load() {
        qz3 qz3;
        int i;
        int i2 = 0;
        while (i2 == 0 && !this.w0) {
            try {
                long j = this.Z.a;
                yz3 b2 = b(j);
                this.z0 = b2;
                long G = this.c.G(b2);
                if (this.w0) {
                    if (!(i2 == 1 || this.o.v() == -1)) {
                        this.Z.a = this.o.v();
                    }
                    vx3.i(this.c);
                    return;
                }
                if (G != -1) {
                    G += j;
                    ygb ygb = this.C0;
                    ygb.F0.post(new pgb(ygb, 0));
                }
                long j2 = G;
                this.C0.H0 = po6.a(this.c.a.a());
                fsd fsd = this.c;
                po6 po6 = this.C0.H0;
                if (po6 == null || (i = po6.Y) == -1) {
                    qz3 = fsd;
                } else {
                    qz3 = new lo6(fsd, i, this);
                    ygb ygb2 = this.C0;
                    ygb2.getClass();
                    bpe y = ygb2.y(new wgb(0, true));
                    this.A0 = y;
                    y.e(ygb.e1);
                }
                long j3 = j;
                this.o.z(qz3, this.b, this.c.a.a(), j, j2, this.X);
                if (this.C0.H0 != null) {
                    e75 e75 = (e75) this.o.b;
                    if (e75 != null) {
                        e75 m = e75.m();
                        if (m instanceof m79) {
                            ((m79) m).G0 = true;
                        }
                    }
                }
                if (this.x0) {
                    ul7 ul7 = this.o;
                    long j4 = this.y0;
                    e75 e752 = (e75) ul7.b;
                    e752.getClass();
                    e752.d(j3, j4);
                    this.x0 = false;
                }
                while (true) {
                    long j5 = j3;
                    while (i2 == 0 && !this.w0) {
                        this.Y.a();
                        ul7 ul72 = this.o;
                        le4 le4 = this.Z;
                        e75 e753 = (e75) ul72.b;
                        e753.getClass();
                        r74 r74 = (r74) ul72.c;
                        r74.getClass();
                        i2 = e753.g(r74, le4);
                        j3 = this.o.v();
                        if (j3 > this.C0.y0 + j5) {
                            this.Y.c();
                            ygb ygb3 = this.C0;
                            ygb3.F0.post(ygb3.E0);
                        }
                    }
                }
                if (i2 == 1) {
                    i2 = 0;
                } else if (this.o.v() != -1) {
                    this.Z.a = this.o.v();
                }
                vx3.i(this.c);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            } catch (Throwable th) {
                if (!(i2 == 1 || this.o.v() == -1)) {
                    this.Z.a = this.o.v();
                }
                vx3.i(this.c);
                throw th;
            }
        }
    }
}
