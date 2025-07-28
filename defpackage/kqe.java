package defpackage;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: kqe  reason: default package */
public final class kqe {
    public final Context a;
    public final iqe b;
    public final boolean c = false;
    public final boolean d = false;
    public final long e;
    public final qh7 f;
    public final ys g;
    public final gf6 h;
    public final k4f i;
    public final l13 j;
    public final vc9 k;
    public final Looper l;
    public final pv0 m;
    public final z7e n;
    public final h8e o;
    public final k2e p;
    public final m55 q;
    public oqe r;
    public ad9 s;
    public j93 t;
    public String u;
    public int v;
    public t79 w;

    static {
        g78.a("media3.transformer");
    }

    /* JADX WARNING: type inference failed for: r3v4, types: [java.lang.Object, m55] */
    public kqe(Context context, iqe iqe, long j2, qh7 qh7, gf6 gf6, qc4 qc4, m74 m74, lhd lhd, Looper looper) {
        pv0 pv0 = pv0.o;
        z7e z7e = z7e.a;
        this.a = context;
        this.b = iqe;
        this.e = j2;
        this.f = qh7;
        this.g = null;
        this.h = gf6;
        this.i = qc4;
        this.j = m74;
        this.k = lhd;
        this.l = looper;
        this.m = pv0;
        this.n = z7e;
        this.v = 0;
        this.o = z7e.a(looper, (Handler.Callback) null);
        this.p = new k2e(this);
        ? obj = new Object();
        obj.b();
        this.q = obj;
    }

    public static void a(kqe kqe) {
        kqe.v = 0;
        j93 j93 = kqe.t;
        j93.getClass();
        String str = kqe.u;
        str.getClass();
        kqe kqe2 = kqe;
        kqe2.f(j93, new ad9(str, kqe.k, kqe.p, 0, false, (xu5) null, kqe.e), kqe.p, 0);
    }

    public static void b(kqe kqe) {
        kqe.getClass();
        xle xle = new xle(1, kqe);
        qh7 qh7 = kqe.f;
        qh7.c(-1, xle);
        qh7.b();
        kqe.v = 0;
    }

    public final void c() {
        g();
        oqe oqe = this.r;
        if (oqe != null) {
            try {
                if (!oqe.z) {
                    oqe.g();
                    oqe.j.b((Object) null, 4, 1, 0).b();
                    oqe.g.getClass();
                    oqe.p.b();
                    oqe.p.c();
                    RuntimeException runtimeException = oqe.w;
                    if (runtimeException != null) {
                        throw runtimeException;
                    }
                }
            } finally {
                this.r = null;
            }
        }
    }

    public final int d(ii5 ii5) {
        int e2;
        g();
        int i2 = this.v;
        if (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4) {
            return 3;
        }
        if (i2 == 5 || i2 == 6) {
            if (this.w != null) {
                j93 j93 = this.t;
                oyb.g(j93);
                long j2 = ((gs4) ((hs4) j93.a.get(0)).a.get(0)).a.e.b;
                t79 t79 = this.w;
                float f2 = ((float) (t79.b - j2)) / ((float) t79.a);
                if (this.v == 5) {
                    oqe oqe = this.r;
                    if (!(oqe == null || (e2 = oqe.e(ii5)) == 0 || e2 == 1)) {
                        if (e2 == 2) {
                            ii5.b = Math.round(((float) ii5.b) * f2);
                        } else if (e2 == 3) {
                            return 3;
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                } else {
                    float f3 = 100.0f * f2;
                    oqe oqe2 = this.r;
                    if (oqe2 == null) {
                        ii5.b = Math.round(f3);
                    } else {
                        int e3 = oqe2.e(ii5);
                        if (e3 == 0 || e3 == 1) {
                            ii5.b = Math.round(f3);
                        } else if (e3 == 2) {
                            ii5.b = Math.round(((1.0f - f2) * ((float) ii5.b)) + f3);
                        } else if (e3 == 3) {
                            return 3;
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                }
                return 2;
            }
            return 1;
        }
        oqe oqe3 = this.r;
        if (oqe3 == null) {
            return 0;
        }
        return oqe3.e(ii5);
    }

    public final void e(j93 j93, String str) {
        g();
        this.t = j93;
        this.u = str;
        this.q.b();
        if (this.c) {
            j93 j932 = this.t;
            oyb.g(j932);
            if (j932.a.size() <= 1 && ((hs4) this.t.a.get(0)).a.size() <= 1) {
                this.v = 5;
                j93 j933 = this.t;
                oyb.g(j933);
                gs4 gs4 = (gs4) ((hs4) j933.a.get(0)).a.get(0);
                l68 l68 = gs4.a;
                v58 v58 = l68.e;
                long j2 = v58.b;
                a68 a68 = l68.b;
                oyb.g(a68);
                a4d A = udd.A(this.a, j2, a68.a.toString());
                tx txVar = new tx(this, v58.d, j2, gs4);
                h8e h8e = this.o;
                Objects.requireNonNull(h8e);
                swb.a(A, txVar, new c93(h8e, 1));
                return;
            }
        }
        String str2 = str;
        j93 j934 = j93;
        f(j934, new ad9(str2, this.k, this.p, 0, this.d, (xu5) null, this.e), this.p, 0);
    }

    /* JADX WARNING: type inference failed for: r1v11, types: [pb5, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v1, types: [java.lang.Object, i6g] */
    public final void f(j93 j93, ad9 ad9, k2e k2e, long j2) {
        BitmapFactory.Options options;
        rh7 rh7;
        j93 j932 = j93;
        oyb.j("There is already an export in progress.", this.r == null);
        iqe iqe = this.b;
        if (j932.g != 0) {
            wx a2 = iqe.a();
            a2.b = j932.g;
            iqe = a2.a();
        }
        iqe iqe2 = iqe;
        s39 s39 = new s39(j932, this.f, this.o, iqe2);
        ys ysVar = this.g;
        ys ysVar2 = ysVar;
        if (ysVar == null) {
            Context context = this.a;
            Context applicationContext = context.getApplicationContext();
            Object obj = new Object();
            pv0 pv0 = pv0.Z;
            ? obj2 = new Object();
            obj2.a = applicationContext;
            obj2.c = obj;
            obj2.b = -2000;
            obj2.o = pv0;
            z7e z7e = this.n;
            ? obj3 = new Object();
            obj3.a = context.getApplicationContext();
            obj3.b = obj2;
            obj3.c = z7e;
            if (oze.a >= 26) {
                options = new BitmapFactory.Options();
                options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            } else {
                options = null;
            }
            ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
            if (newSingleThreadExecutor instanceof rh7) {
                rh7 = (rh7) newSingleThreadExecutor;
            } else {
                rh7 = newSingleThreadExecutor instanceof ScheduledExecutorService ? new j69((ScheduledExecutorService) newSingleThreadExecutor) : new g69(newSingleThreadExecutor);
            }
            obj3.o = new sz3(rh7, new f64(context), options);
            ysVar2 = obj3;
        }
        ys ysVar3 = ysVar2;
        LinkedHashMap linkedHashMap = b24.a;
        synchronized (b24.class) {
            b24.a.clear();
            SystemClock.elapsedRealtime();
        }
        oqe oqe = r1;
        oqe oqe2 = new oqe(this.a, j93, iqe2, ysVar3, this.h, this.i, this.j, ad9, k2e, s39, this.o, this.m, this.n, j2);
        oqe oqe3 = oqe;
        this.r = oqe3;
        oqe3.g();
        oqe3.j.f(1);
        synchronized (oqe3.r) {
            oqe3.x = 1;
            oqe3.y = 0;
        }
    }

    public final void g() {
        if (Looper.myLooper() != this.l) {
            throw new IllegalStateException("Transformer is accessed on the wrong thread.");
        }
    }
}
