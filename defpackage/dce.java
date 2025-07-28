package defpackage;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.http.HttpStatus;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: dce  reason: default package */
public final class dce implements dd3, e3d {
    public static final short[] y0 = {1, 5, 6, 89};
    public final t97 X;
    public final t97 Y;
    public final AtomicReference Z;
    public final h2d a;
    public final Executor b;
    public final t97 c;
    public final t97 o;
    public final AtomicLong w0 = new AtomicLong(0);
    public final String x0 = "SessionController";

    static {
        jk9 jk9 = dfa.c;
        jk9 jk92 = dfa.c;
        jk9 jk93 = dfa.c;
        jk9 jk94 = dfa.c;
    }

    public dce(h2d h2d, t97 t97, t97 t972, t97 t973, t97 t974, f3d f3d, ExecutorService executorService) {
        this.a = h2d;
        this.b = executorService;
        this.c = t97;
        this.o = t972;
        this.X = t973;
        this.Y = t974;
        AtomicReference atomicReference = new AtomicReference((Object) null);
        this.Z = atomicReference;
        ((h3d) f3d).a(this);
        ((ad3) t974.getValue()).a().c(this);
        atomicReference.set(g());
    }

    public static u1d d(dce dce, u1d u1d) {
        u1d u1d2;
        kb5 kb5 = ((j2b) ((g2b) dce.c.getValue())).e;
        kb5.getClass();
        if (!kb5.m(PmsKey.f86newsessionlogic, false) || u1d == null || !u1d.k.get()) {
            return u1d;
        }
        String str = dce.x0;
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            tn7 tn7 = tn7.Z;
            fn6.d(tn7, str, "old_session=" + u1d + " in connect process", (Throwable) null);
        }
        String str2 = u1d.a;
        fn6 fn62 = udd.e;
        if (fn62 != null && fn62.c()) {
            tn7 tn72 = tn7.X;
            fn62.d(tn72, str2, "fork, " + u1d, (Throwable) null);
        }
        if (!u1d.l.compareAndSet(false, true)) {
            String str3 = u1d.a;
            udd.s(str3, "failed to fork " + u1d + " because has ALREADY been marked for destroy", (Throwable) null);
            u1d2 = null;
        } else {
            zz2 zz2 = u1d.m;
            k3d k3d = u1d.C;
            ypc ypc = u1d.n;
            wl9 wl9 = u1d.t;
            kd3 kd3 = u1d.s;
            yz9 yz9 = u1d.o;
            i0a i0a = u1d.B;
            int i = u1d.z;
            sf8 sf8 = new sf8(zz2, k3d, ypc, wl9, kd3, yz9, i0a);
            sf8.a = i;
            sf8.i = u1d;
            u1d2 = new u1d(sf8);
            u1d.x.a();
        }
        if (u1d2 != null) {
            String str4 = dce.x0;
            fn6 fn63 = udd.e;
            if (fn63 != null && fn63.c()) {
                tn7 tn73 = tn7.X;
                fn63.d(tn73, str4, "new_session=" + u1d2 + " was created, old_session=" + u1d, (Throwable) null);
            }
            dce.b.execute(new zbe(u1d, 1, dce));
            return u1d2;
        }
        String str5 = dce.x0;
        fn6 fn64 = udd.e;
        if (fn64 == null || !fn64.c()) {
            return u1d;
        }
        fn64.d(tn7.Z, str5, "seems new session creation was already scheduled", (Throwable) null);
        return u1d;
    }

    public final void a() {
        f(false);
    }

    public final void b() {
        u1d u1d;
        udd.q(this.x0, "onConnectionTypeChange");
        AtomicReference atomicReference = this.Z;
        u1d u1d2 = (u1d) atomicReference.get();
        if (u1d2 != null) {
            t97 t97 = this.Y;
            if (!((ad3) t97.getValue()).a().f()) {
                u1d2.n(false);
                u1d2.f(true, false);
            } else if (((ad3) t97.getValue()).f() && (u1d = (u1d) atomicReference.updateAndGet(new cce(this, 1))) != null) {
                u1d.n(true);
            }
        }
    }

    public final void c(int i) {
        AtomicReference atomicReference = this.Z;
        String str = this.x0;
        if (i == 0) {
            udd.U(str, "onNoNet");
            u1d u1d = (u1d) atomicReference.get();
            if (u1d != null) {
                j(u1d);
            }
        } else if (i == 1) {
            udd.q(str, "onDisconnected");
            u1d u1d2 = (u1d) atomicReference.get();
            if (u1d2 == null) {
                udd.U(str, "onDisconnected, has NO active session!");
            } else {
                j(u1d2);
            }
        } else if (i == 2) {
            udd.q(str, "onConnected");
        } else if (i == 3) {
            udd.q(str, "onLoggedIn");
        } else {
            throw new IllegalStateException(("Unknown session state=" + i).toString());
        }
    }

    public final boolean e(ibe ibe, iae iae) {
        if (!((zy9) this.o.getValue()).e()) {
            return false;
        }
        short N = ibe.N();
        short[] sArr = y0;
        if (Arrays.binarySearch(sArr, 0, sArr.length, N) >= 0) {
            return false;
        }
        iae.d(new uae("session.forbidden.opcode.in.external.auth", "forbidden opcode in external authorization", (String) null));
        return true;
    }

    public final void f(boolean z) {
        if (!z) {
            t97 t97 = this.Y;
            if (!((ad3) t97.getValue()).a().f() || !((ad3) t97.getValue()).f()) {
                return;
            }
        }
        u1d u1d = (u1d) this.Z.updateAndGet(new cce(this, 1));
        if (u1d != null) {
            u1d.n(true);
        }
    }

    public final u1d g() {
        h2d h2d = this.a;
        yzc yzc = ((j2b) ((g2b) this.c.getValue())).b;
        yzc.getClass();
        sf8 sf8 = new sf8((g2d) h2d.a, (k3d) ((r7e) h2d.Z).getValue(), (ypc) ((t97) h2d.o).getValue(), (wl9) ((t97) h2d.c).getValue(), (kd3) ((t97) h2d.b).getValue(), (yz9) ((t97) h2d.X).getValue(), (i0a) ((t97) h2d.Y).getValue());
        sf8.a = (int) yzc.o(PmsKey.f105sendqueuesize, (long) 30);
        sf8.i = null;
        return new u1d(sf8);
    }

    public final void h() {
        int size;
        u1d u1d = (u1d) this.Z.get();
        if (u1d != null) {
            yzc yzc = ((j2b) ((g2b) this.c.getValue())).b;
            yzc.getClass();
            int o2 = (int) yzc.o(PmsKey.f27disconnecttimeout, (long) HttpStatus.SC_MULTIPLE_CHOICES);
            if (o2 > 0 && ((zy9) this.o.getValue()).d() && !((rf4) this.X.getValue()).d() && !((rf4) this.X.getValue()).c()) {
                long j = this.w0.get();
                int i = zp4.o;
                ((rf4) this.X.getValue()).getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                eq4 eq4 = eq4.c;
                boolean z = zp4.c(zp4.g(mt0.Q(elapsedRealtime, eq4), mt0.Q(j, eq4)), mt0.P(o2, eq4)) > 0;
                if (j > 0 && z) {
                    synchronized (u1d.w) {
                        size = u1d.v.size();
                    }
                    if (size == 0) {
                        udd.q(this.x0, "disconnectIfNeeded: timeout expired, disconnect");
                        u1d.n(false);
                        u1d.f(true, false);
                    }
                }
            }
        }
    }

    public final void i() {
        this.Z.getAndUpdate(new cce(this, 0));
    }

    public final void j(u1d u1d) {
        String str = this.x0;
        udd.q(str, "updateSession");
        t97 t97 = this.Y;
        if (!((ad3) t97.getValue()).a().f()) {
            udd.U(str, "updateSession, seems there is NO net");
            u1d.n(false);
        } else if (!((ad3) t97.getValue()).f()) {
            udd.U(str, "updateSession, connection is NOT permitted");
            u1d.n(false);
        } else {
            u1d.n(true);
        }
    }
}
