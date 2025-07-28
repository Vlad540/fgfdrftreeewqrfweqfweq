package defpackage;

import android.net.Uri;
import android.os.Handler;
import androidx.work.WorkRequest;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.exoplayer2.upstream.HttpDataSource$CleartextNotPermittedException;
import com.google.android.exoplayer2.upstream.Loader$UnexpectedLoaderException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: xgb  reason: default package */
public final class xgb implements r88, h75, cj7, hj7, tjc {
    public static final Map b1;
    public static final vu5 c1;
    public final it4 A0;
    public final ga3 B0;
    public final ogb C0;
    public final ogb D0;
    public final Handler E0;
    public p88 F0;
    public oo6 G0;
    public vjc[] H0;
    public vgb[] I0;
    public boolean J0;
    public boolean K0;
    public boolean L0;
    public stf M0;
    public utc N0;
    public long O0;
    public boolean P0;
    public int Q0;
    public boolean R0;
    public boolean S0;
    public int T0;
    public long U0;
    public long V0;
    public long W0;
    public final af8 X;
    public boolean X0;
    public final eo4 Y;
    public int Y0;
    public final chb Z;
    public boolean Z0;
    public final Uri a;
    public boolean a1;
    public final oz3 b;
    public final mo4 c;
    public final lk9 o;
    public final l34 w0;
    public final String x0 = null;
    public final long y0;
    public final jj7 z0;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        b1 = Collections.unmodifiableMap(hashMap);
        tu5 tu5 = new tu5();
        tu5.a = "icy";
        tu5.k = "application/x-icy";
        c1 = tu5.a();
    }

    public xgb(Uri uri, oz3 oz3, it4 it4, mo4 mo4, eo4 eo4, lk9 lk9, af8 af8, chb chb, l34 l34, int i) {
        this.a = uri;
        this.b = oz3;
        this.c = mo4;
        this.Y = eo4;
        this.o = lk9;
        this.X = af8;
        this.Z = chb;
        this.w0 = l34;
        this.y0 = (long) i;
        this.z0 = new jj7("ProgressiveMediaPeriod");
        this.A0 = it4;
        this.B0 = new ga3(false, 0);
        this.C0 = new ogb(this, 0);
        this.D0 = new ogb(this, 1);
        this.E0 = mze.m((Handler.Callback) null);
        this.I0 = new vgb[0];
        this.H0 = new vjc[0];
        this.W0 = -9223372036854775807L;
        this.U0 = -1;
        this.O0 = -9223372036854775807L;
        this.Q0 = 1;
    }

    public final ape B(int i, int i2) {
        return t(new vgb(i, false));
    }

    public final long D(long j, wtc wtc) {
        d();
        if (!this.N0.c()) {
            return 0;
        }
        stc e = this.N0.e(j);
        return wtc.a(j, e.a.a, e.b.a);
    }

    public final boolean F(long j) {
        if (this.Z0) {
            return false;
        }
        jj7 jj7 = this.z0;
        if (jj7.B() || this.X0) {
            return false;
        }
        if (this.K0 && this.T0 == 0) {
            return false;
        }
        boolean g = this.B0.g();
        if (jj7.C()) {
            return g;
        }
        v();
        return true;
    }

    public final void K(utc utc) {
        this.E0.post(new hg9(this, 23, utc));
    }

    public final void L(p88 p88, long j) {
        this.F0 = p88;
        this.B0.g();
        v();
    }

    public final long M(f55[] f55Arr, boolean[] zArr, xjc[] xjcArr, boolean[] zArr2, long j) {
        boolean[] zArr3;
        f55 f55;
        d();
        stf stf = this.M0;
        voe voe = (voe) stf.a;
        int i = this.T0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int length = f55Arr.length;
            zArr3 = (boolean[]) stf.c;
            if (i3 >= length) {
                break;
            }
            tgb tgb = xjcArr[i3];
            if (tgb != null && (f55Arr[i3] == null || !zArr[i3])) {
                int i4 = tgb.a;
                swb.h(zArr3[i4]);
                this.T0--;
                zArr3[i4] = false;
                xjcArr[i3] = null;
            }
            i3++;
        }
        boolean z = !this.R0 ? j != 0 : i == 0;
        for (int i5 = 0; i5 < f55Arr.length; i5++) {
            if (xjcArr[i5] == null && (f55 = f55Arr[i5]) != null) {
                swb.h(f55.length() == 1);
                swb.h(f55.f(0) == 0);
                int b2 = voe.b(f55.a());
                swb.h(!zArr3[b2]);
                this.T0++;
                zArr3[b2] = true;
                xjcArr[i5] = new tgb(this, b2);
                zArr2[i5] = true;
                if (!z) {
                    vjc vjc = this.H0[b2];
                    z = !vjc.A(j, true) && vjc.o() != 0;
                }
            }
        }
        if (this.T0 == 0) {
            this.X0 = false;
            this.S0 = false;
            jj7 jj7 = this.z0;
            if (jj7.C()) {
                vjc[] vjcArr = this.H0;
                int length2 = vjcArr.length;
                while (i2 < length2) {
                    vjcArr[i2].i();
                    i2++;
                }
                jj7.o();
            } else {
                for (vjc z2 : this.H0) {
                    z2.z(false);
                }
            }
        } else if (z) {
            j = k(j);
            while (i2 < xjcArr.length) {
                if (xjcArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.R0 = true;
        return j;
    }

    public final void a() {
        for (vjc vjc : this.H0) {
            vjc.z(true);
            yn4 yn4 = vjc.h;
            if (yn4 != null) {
                yn4.f(vjc.e);
                vjc.h = null;
                vjc.g = null;
            }
        }
        it4 it4 = this.A0;
        d75 d75 = (d75) it4.b;
        if (d75 != null) {
            d75.release();
            it4.b = null;
        }
        it4.c = null;
    }

    public final boolean b() {
        boolean z;
        if (this.z0.C()) {
            ga3 ga3 = this.B0;
            synchronized (ga3) {
                z = ga3.b;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final void c() {
        this.E0.post(this.C0);
    }

    public final void d() {
        swb.h(this.K0);
        this.M0.getClass();
        this.N0.getClass();
    }

    public final int e() {
        int i = 0;
        for (vjc vjc : this.H0) {
            i += vjc.q + vjc.p;
        }
        return i;
    }

    public final long f() {
        if (this.T0 == 0) {
            return Long.MIN_VALUE;
        }
        return r();
    }

    public final void g(fj7 fj7, long j, long j2, boolean z) {
        rgb rgb = (rgb) fj7;
        esd esd = rgb.c;
        xi7 xi7 = new xi7(rgb.a, rgb.z0, esd.c, esd.o, j, j2, esd.b);
        this.o.getClass();
        this.X.d(xi7, 1, -1, (vu5) null, 0, (Object) null, rgb.y0, this.O0);
        if (!z) {
            if (this.U0 == -1) {
                this.U0 = rgb.A0;
            }
            for (vjc z2 : this.H0) {
                z2.z(false);
            }
            if (this.T0 > 0) {
                p88 p88 = this.F0;
                p88.getClass();
                p88.c(this);
            }
        }
    }

    public final long h() {
        long j;
        long j2 = Long.MIN_VALUE;
        for (vjc vjc : this.H0) {
            synchronized (vjc) {
                j = vjc.v;
            }
            j2 = Math.max(j2, j);
        }
        return j2;
    }

    public final void i() {
        int h = this.o.h(this.Q0);
        jj7 jj7 = this.z0;
        IOException iOException = (IOException) jj7.c;
        if (iOException == null) {
            ej7 ej7 = (ej7) jj7.b;
            if (ej7 != null) {
                if (h == Integer.MIN_VALUE) {
                    h = ej7.b;
                }
                IOException iOException2 = ej7.o;
                if (iOException2 != null && ej7.X > h) {
                    throw iOException2;
                }
            }
            if (this.Z0 && !this.K0) {
                throw ParserException.a((RuntimeException) null, "Loading finished before preparation is complete.");
            }
            return;
        }
        throw iOException;
    }

    public final boolean j() {
        return this.W0 != -9223372036854775807L;
    }

    public final long k(long j) {
        d();
        boolean[] zArr = (boolean[]) this.M0.b;
        if (!this.N0.c()) {
            j = 0;
        }
        this.S0 = false;
        this.V0 = j;
        if (j()) {
            this.W0 = j;
            return j;
        }
        if (this.Q0 != 7) {
            int length = this.H0.length;
            int i = 0;
            while (i < length) {
                if (this.H0[i].A(j, false) || (!zArr[i] && this.L0)) {
                    i++;
                }
            }
            return j;
        }
        this.X0 = false;
        this.W0 = j;
        this.Z0 = false;
        jj7 jj7 = this.z0;
        if (jj7.C()) {
            for (vjc i2 : this.H0) {
                i2.i();
            }
            jj7.o();
        } else {
            jj7.c = null;
            for (vjc z : this.H0) {
                z.z(false);
            }
        }
        return j;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [stf, java.lang.Object] */
    public final void l() {
        int i;
        y29 y29;
        if (!this.a1 && !this.K0 && this.J0 && this.N0 != null) {
            vjc[] vjcArr = this.H0;
            int length = vjcArr.length;
            int i2 = 0;
            while (i2 < length) {
                if (vjcArr[i2].r() != null) {
                    i2++;
                } else {
                    return;
                }
            }
            ga3 ga3 = this.B0;
            synchronized (ga3) {
                ga3.b = false;
            }
            int length2 = this.H0.length;
            toe[] toeArr = new toe[length2];
            boolean[] zArr = new boolean[length2];
            for (int i3 = 0; i3 < length2; i3++) {
                vu5 r = this.H0[i3].r();
                r.getClass();
                String str = r.A0;
                boolean h = b49.h(str);
                boolean z = h || b49.j(str);
                zArr[i3] = z;
                this.L0 = z | this.L0;
                oo6 oo6 = this.G0;
                if (oo6 != null) {
                    if (h || this.I0[i3].b) {
                        y29 y292 = r.y0;
                        if (y292 == null) {
                            y29 = new y29(oo6);
                        } else {
                            int i4 = mze.a;
                            w29[] w29Arr = y292.a;
                            Object[] copyOf = Arrays.copyOf(w29Arr, w29Arr.length + 1);
                            System.arraycopy(new w29[]{oo6}, 0, copyOf, w29Arr.length, 1);
                            y29 = new y29((w29[]) copyOf);
                        }
                        tu5 a2 = r.a();
                        a2.i = y29;
                        r = new vu5(a2);
                    }
                    if (h && r.Y == -1 && r.Z == -1 && (i = oo6.a) != -1) {
                        tu5 a3 = r.a();
                        a3.f = i;
                        r = new vu5(a3);
                    }
                }
                int b2 = this.c.b(r);
                tu5 a4 = r.a();
                a4.D = b2;
                toeArr[i3] = new toe(Integer.toString(i3), a4.a());
            }
            voe voe = new voe(toeArr);
            ? obj = new Object();
            obj.a = voe;
            obj.b = zArr;
            int i5 = voe.a;
            obj.c = new boolean[i5];
            obj.o = new boolean[i5];
            this.M0 = obj;
            this.K0 = true;
            p88 p88 = this.F0;
            p88.getClass();
            p88.d(this);
        }
    }

    public final void m(int i) {
        d();
        stf stf = this.M0;
        boolean[] zArr = (boolean[]) stf.o;
        if (!zArr[i]) {
            vu5 vu5 = ((voe) stf.a).a(i).c[0];
            this.X.b(b49.g(vu5.A0), vu5, 0, (Object) null, this.V0);
            zArr[i] = true;
        }
    }

    public final void n(int i) {
        d();
        boolean[] zArr = (boolean[]) this.M0.b;
        if (this.X0 && zArr[i] && !this.H0[i].t(false)) {
            this.W0 = 0;
            this.X0 = false;
            this.S0 = true;
            this.V0 = 0;
            this.Y0 = 0;
            for (vjc z : this.H0) {
                z.z(false);
            }
            p88 p88 = this.F0;
            p88.getClass();
            p88.c(this);
        }
    }

    public final long o() {
        if (!this.S0) {
            return -9223372036854775807L;
        }
        if (!this.Z0 && e() <= this.Y0) {
            return -9223372036854775807L;
        }
        this.S0 = false;
        return this.V0;
    }

    public final voe p() {
        d();
        return (voe) this.M0.a;
    }

    public final void q(fj7 fj7, long j, long j2) {
        utc utc;
        rgb rgb = (rgb) fj7;
        if (this.O0 == -9223372036854775807L && (utc = this.N0) != null) {
            boolean c2 = utc.c();
            long h = h();
            long j3 = h == Long.MIN_VALUE ? 0 : h + WorkRequest.MIN_BACKOFF_MILLIS;
            this.O0 = j3;
            this.Z.q(j3, c2, this.P0);
        }
        esd esd = rgb.c;
        xi7 xi7 = new xi7(rgb.a, rgb.z0, esd.c, esd.o, j, j2, esd.b);
        this.o.getClass();
        this.X.f(xi7, 1, -1, (vu5) null, 0, (Object) null, rgb.y0, this.O0);
        if (this.U0 == -1) {
            this.U0 = rgb.A0;
        }
        this.Z0 = true;
        p88 p88 = this.F0;
        p88.getClass();
        p88.c(this);
    }

    public final long r() {
        long j;
        boolean z;
        long j2;
        d();
        boolean[] zArr = (boolean[]) this.M0.b;
        if (this.Z0) {
            return Long.MIN_VALUE;
        }
        if (j()) {
            return this.W0;
        }
        if (this.L0) {
            int length = this.H0.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                if (zArr[i]) {
                    vjc vjc = this.H0[i];
                    synchronized (vjc) {
                        z = vjc.w;
                    }
                    if (!z) {
                        vjc vjc2 = this.H0[i];
                        synchronized (vjc2) {
                            j2 = vjc2.v;
                        }
                        j = Math.min(j, j2);
                    } else {
                        continue;
                    }
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == Long.MAX_VALUE) {
            j = h();
        }
        return j == Long.MIN_VALUE ? this.V0 : j;
    }

    public final void s(long j, boolean z) {
        d();
        if (!j()) {
            boolean[] zArr = (boolean[]) this.M0.c;
            int length = this.H0.length;
            for (int i = 0; i < length; i++) {
                this.H0[i].h(j, z, zArr[i]);
            }
        }
    }

    public final vjc t(vgb vgb) {
        int length = this.H0.length;
        for (int i = 0; i < length; i++) {
            if (vgb.equals(this.I0[i])) {
                return this.H0[i];
            }
        }
        mo4 mo4 = this.c;
        mo4.getClass();
        eo4 eo4 = this.Y;
        eo4.getClass();
        vjc vjc = new vjc(this.w0, mo4, eo4);
        vjc.f = this;
        int i2 = length + 1;
        vgb[] vgbArr = (vgb[]) Arrays.copyOf(this.I0, i2);
        vgbArr[length] = vgb;
        int i3 = mze.a;
        this.I0 = vgbArr;
        vjc[] vjcArr = (vjc[]) Arrays.copyOf(this.H0, i2);
        vjcArr[length] = vjc;
        this.H0 = vjcArr;
        return vjc;
    }

    public final void u(long j) {
    }

    public final void v() {
        rgb rgb = new rgb(this, this.a, this.b, this.A0, this, this.B0);
        if (this.K0) {
            swb.h(j());
            long j = this.O0;
            if (j == -9223372036854775807L || this.W0 <= j) {
                utc utc = this.N0;
                utc.getClass();
                long j2 = utc.e(this.W0).a.b;
                long j3 = this.W0;
                rgb.Z.a = j2;
                rgb.y0 = j3;
                rgb.x0 = true;
                rgb.C0 = false;
                for (vjc vjc : this.H0) {
                    vjc.t = this.W0;
                }
                this.W0 = -9223372036854775807L;
            } else {
                this.Z0 = true;
                this.W0 = -9223372036854775807L;
                return;
            }
        }
        this.Y0 = e();
        this.X.k(new xi7(rgb.a, rgb.z0, this.z0.G(rgb, this, this.o.h(this.Q0))), 1, -1, (vu5) null, 0, (Object) null, rgb.y0, this.O0);
    }

    public final void w() {
        this.J0 = true;
        this.E0.post(this.C0);
    }

    public final boolean x() {
        return this.S0 || j();
    }

    public final sz0 y(fj7 fj7, long j, long j2, IOException iOException, int i) {
        long j3;
        sz0 sz0;
        utc utc;
        IOException iOException2 = iOException;
        rgb rgb = (rgb) fj7;
        if (this.U0 == -1) {
            this.U0 = rgb.A0;
        }
        esd esd = rgb.c;
        xi7 xi7 = new xi7(rgb.a, rgb.z0, esd.c, esd.o, j, j2, esd.b);
        int i2 = mze.a;
        this.o.getClass();
        if (!(iOException2 instanceof ParserException) && !(iOException2 instanceof FileNotFoundException) && !(iOException2 instanceof HttpDataSource$CleartextNotPermittedException) && !(iOException2 instanceof Loader$UnexpectedLoaderException)) {
            int i3 = DataSourceException.b;
            Throwable th = iOException2;
            while (true) {
                if (th != null) {
                    if ((th instanceof DataSourceException) && ((DataSourceException) th).a == 2008) {
                        break;
                    }
                    th = th.getCause();
                } else {
                    j3 = (long) Math.min((i - 1) * 1000, 5000);
                    break;
                }
            }
        }
        j3 = -9223372036854775807L;
        if (j3 == -9223372036854775807L) {
            sz0 = jj7.Y;
        } else {
            int e = e();
            int i4 = e > this.Y0 ? 1 : 0;
            if (this.U0 != -1 || ((utc = this.N0) != null && utc.f() != -9223372036854775807L)) {
                this.Y0 = e;
            } else if (!this.K0 || x()) {
                this.S0 = this.K0;
                this.V0 = 0;
                this.Y0 = 0;
                for (vjc z : this.H0) {
                    z.z(false);
                }
                rgb.Z.a = 0;
                rgb.y0 = 0;
                rgb.x0 = true;
                rgb.C0 = false;
            } else {
                this.X0 = true;
                sz0 = jj7.X;
            }
            sz0 = new sz0(j3, i4, 4, false);
        }
        sz0 sz02 = sz0;
        this.X.h(xi7, 1, -1, (vu5) null, 0, (Object) null, rgb.y0, this.O0, iOException, !sz02.a());
        return sz02;
    }
}
