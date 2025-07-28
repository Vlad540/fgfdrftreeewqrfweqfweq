package defpackage;

import android.os.SystemClock;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: ybe  reason: default package */
public final class ybe implements qbe {
    public static final String F0 = qbe.class.getName();
    public final t97 A0;
    public final t97 B0;
    public volatile r7e C0;
    public final r7e D0;
    public final t97 E0;
    public final t97 X;
    public final t97 Y;
    public final t97 Z;
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public volatile CountDownLatch b;
    public final AtomicLong c = new AtomicLong(0);
    public final CopyOnWriteArraySet o = new CopyOnWriteArraySet();
    public final t97 w0;
    public final g15 x0;
    public final t97 y0;
    public final t97 z0;

    public ybe(t97 t97, t97 t972, t97 t973, t97 t974, g15 g15, t97 t975, t97 t976, t97 t977, bce bce, t97 t978, f3d f3d, t97 t979) {
        this.X = t97;
        this.Y = t972;
        this.Z = t973;
        this.w0 = t974;
        this.x0 = g15;
        this.y0 = t975;
        this.z0 = t976;
        this.A0 = t977;
        this.B0 = t978;
        this.E0 = t979;
        this.D0 = new r7e(new r9c(8, t975));
        this.C0 = new r7e(new r9c(9, t975));
        ((h3d) f3d).a(this);
        bce.o = this;
    }

    public static void a(ybe ybe, ol olVar) {
        ybe.getClass();
        String str = F0;
        String name = olVar.getClass().getName();
        long j = olVar.a;
        udd.p(str, "onTaskSuccess: %s, requestId: %s", new Object[]{name, Long.valueOf(j)});
        boolean z = olVar instanceof go7;
        t97 t97 = ybe.z0;
        t97 t972 = ybe.B0;
        if (z) {
            dce dce = (dce) t972.getValue();
            AtomicLong atomicLong = dce.w0;
            ((rf4) dce.X.getValue()).getClass();
            atomicLong.set(SystemClock.elapsedRealtime());
            o1d.y((luf) t97.getValue());
        }
        if (olVar instanceof tna) {
            ((jee) ybe.X.getValue()).d(j);
        }
        if (olVar instanceof d99) {
            o1d.y((luf) t97.getValue());
        }
        i03 i03 = ((j2b) ((g2b) ybe.Y.getValue())).a;
        i03.getClass();
        if (i03.g.getBoolean("app.forceConnection", false) && olVar.s().V()) {
            udd.q(str, "onTaskSuccess: set force connection to false after success tam task");
            i03.w(false);
        }
        if (olVar.s().V()) {
            ((rf4) ybe.Z.getValue()).getClass();
            i03.k("app.lastSuccessfulRequestTime", Long.valueOf(SystemClock.elapsedRealtime()));
        }
        ((dce) t972.getValue()).h();
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [it4, java.lang.Object] */
    public final long b(ol olVar, qce qce, boolean z) {
        String str = F0;
        udd.q(str, "executeTask: " + olVar.getClass().getName() + " isRetry=" + z);
        ((dce) this.B0.getValue()).f(false);
        if (olVar instanceof ip7) {
            this.b = new CountDownLatch(1);
        }
        ? obj = new Object();
        obj.c = this;
        obj.a = olVar;
        obj.b = qce;
        ((ExecutorService) this.D0.getValue()).execute(new g88(this, olVar, z, obj, qce));
        return olVar.a;
    }

    public final void c(int i) {
        if (i == 2) {
            i2d i2d = new i2d(((j2b) ((g2b) this.Y.getValue())).a.n(), 0);
            b(i2d, i2d, false);
        }
    }

    public final long d(ibe ibe) {
        long currentTimeMillis = System.currentTimeMillis();
        xbe xbe = (xbe) this.a.get(ibe.getClass().getName());
        if (xbe == null) {
            return currentTimeMillis;
        }
        kxb.a.getClass();
        jbe P = ibe.P();
        long j = xbe.b;
        return P.n(xbe.a, j, kxb.b.e() * 0.2f);
    }

    public final void e(boolean z) {
        u1d u1d;
        AtomicLong atomicLong = this.c;
        ((rf4) this.Z.getValue()).getClass();
        atomicLong.set(SystemClock.elapsedRealtime());
        if (z) {
            this.a.clear();
            t97 t97 = this.B0;
            if (t97.a() && (u1d = (u1d) ((dce) t97.getValue()).Z.get()) != null) {
                u1d.i.set(0);
                u1d.h.set(0);
                udd.q(u1d.a, "resetConnectionTimeout");
            }
        }
    }

    public final void f(ol olVar, uae uae) {
        String str = F0;
        dae dae = uae.X;
        String name = olVar.getClass().getName();
        long j = olVar.a;
        udd.u(str, dae, "onTaskFailed: %s, requestId: %s, error %s", new Object[]{name, Long.valueOf(j), uae});
        String str2 = uae.b;
        if ("proto.ver".equals(str2)) {
            udd.q(str, "got version error: mark current version as deprecated, close connection");
            u1d u1d = (u1d) ((dce) this.B0.getValue()).Z.get();
            if (u1d != null) {
                u1d.n(false);
            }
            ((tt0) this.w0.getValue()).c(new wt(5));
        }
        if (olVar instanceof tna) {
            ((jee) this.X.getValue()).c(j);
            if ("proto.payload".equals(str2)) {
                tna tna = (tna) olVar;
                try {
                    tna.f();
                } catch (Throwable th) {
                    this.x0.c(new Exception("TaskRunnable: failed to execute onMaxFailCount method for task " + tna.getId() + " type " + tna.getType(), th), true);
                }
            }
            ((gee) this.A0.getValue()).a();
            o1d.y((luf) this.z0.getValue());
        }
        if ((olVar instanceof ip7) && this.b != null) {
            udd.n(str, "countDownSyncLogoutLatch");
            this.b.countDown();
        }
    }
}
