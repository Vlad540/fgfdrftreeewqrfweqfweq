package defpackage;

import android.content.Context;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: m66  reason: default package */
public final class m66 extends taf {
    public static final /* synthetic */ int V0 = 0;
    public final grd A0;
    public final w56 B0;
    public j56 C0;
    public final grd D0;
    public final grd E0;
    public final grd F0;
    public final t0c G0;
    public final us0 H0;
    public final j02 I0;
    public final pwc J0;
    public boolean K0;
    public g37 L0;
    public qod M0;
    public final t97 N0;
    public final o56 O0;
    public qod P0;
    public final p56 Q0;
    public final d66 R0;
    public final grd S0 = hrd.a((Object) null);
    public final r7e T0;
    public final l05 U0;
    public final gl7 X;
    public final f56 Y;
    public final t97 Z;
    public final q46 b;
    public final Context c;
    public final ku3 o;
    public final t97 w0;
    public final t97 x0;
    public final grd y0;
    public final grd z0;

    public m66(q46 q46, Context context, qj qjVar, wk7 wk7, gl7 gl7, t97 t97, t97 t972, f56 f56) {
        t97 t973 = mqc.m;
        t97 t974 = mqc.l;
        this.b = q46;
        this.c = context;
        this.o = qjVar;
        this.X = gl7;
        this.Y = f56;
        this.Z = t974;
        this.w0 = t97;
        this.x0 = t972;
        hw4 hw4 = hw4.a;
        this.y0 = hrd.a(hw4);
        Boolean bool = Boolean.FALSE;
        this.z0 = hrd.a(bool);
        grd a = hrd.a(hw4);
        this.A0 = a;
        this.B0 = new w56(a, this, 2);
        this.C0 = hhd.a(context);
        grd a2 = hrd.a(bool);
        this.D0 = a2;
        this.E0 = a2;
        grd a3 = hrd.a((Object) null);
        this.F0 = a3;
        this.G0 = new t0c(a3);
        us0 a4 = xs7.a(-2, 0, 6);
        this.H0 = a4;
        this.I0 = ez3.V(a4);
        pwc pwc = wk7.f;
        this.J0 = pwc;
        this.N0 = t973;
        o56 o56 = new o56(this);
        this.O0 = o56;
        p56 p56 = new p56(this);
        this.Q0 = p56;
        d66 d66 = new d66(this);
        this.R0 = d66;
        r7e r7e = new r7e(new gz3(16, this));
        this.T0 = r7e;
        l05 l05 = new l05(0);
        this.U0 = l05;
        bv6 bv6 = (bv6) gl7;
        g37 g37 = bv6.C0;
        if (g37 == null || !g37.isCompleted()) {
            bv6.f();
        }
        udd.q("m66", "init");
        pj5 J = ez3.J(new ck5(new w56(q46.b ? bv6.Z : bv6.y0, this, 0), new y56(this, (Continuation) null), 5), s().e());
        ContextScope contextScope = this.a;
        ez3.N(J, n1g.M(contextScope, qjVar));
        ez3.N(ez3.J(new ck5(new w56(bv6.A0, this, 1), new z56(this, (Continuation) null), 5), s().a()), n1g.M(contextScope, qjVar));
        if (q46.c) {
            pwc.c.add(p56);
            pwc.e.add(d66);
            pwc.f.add(o56);
            pwc.m.add((q56) r7e.getValue());
        }
        int i = zp4.o;
        ez3.N(new ck5(n1g.Z(l05, mt0.Q(300, eq4.c)), new a66(this, (Continuation) null), 5), n1g.M(contextScope, qjVar));
    }

    public static final Object q(m66 m66, List list, Continuation continuation) {
        return xs7.U(m66.s().e(), new k66(m66, list, (Continuation) null), continuation);
    }

    public static void r(m66 m66, boolean z, int i) {
        boolean z2 = false;
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        m66.getClass();
        udd.q("m66", "clearSelections()");
        if (z2) {
            pwc pwc = m66.J0;
            pwc.a.clear();
            pwc.n();
            pwc.b.clear();
            if (((kp) pwc.h).g.getBoolean("app.send.media.as.collage", true)) {
                pwc.l = 3;
            } else {
                pwc.l = 1;
            }
        }
        taf.n(m66, m66.s().e().plus(m66.o), (ru3) null, new r56(m66, z, (Continuation) null), 2);
        hw4 hw4 = hw4.a;
        f56 f56 = m66.Y;
        f56.getClass();
        taf.o(f56.c, new z46(hw4));
    }

    public final void p() {
        udd.q("m66", "onCleared()");
        pwc pwc = this.J0;
        pwc.e.remove(this.R0);
        pwc.f.remove(this.O0);
        pwc.c.remove(this.Q0);
        pwc.m.remove((q56) this.T0.getValue());
        ConcurrentHashMap concurrentHashMap = ((bv6) this.X).E0;
        for (n46 n46 : concurrentHashMap.keySet()) {
            if (n46 instanceof i46) {
                concurrentHashMap.put(n46, hw4.a);
            }
        }
    }

    public final pae s() {
        return (pae) this.Z.getValue();
    }

    public final int t(yk7 yk7) {
        return this.J0.g(kjd.N(yk7));
    }

    public final int u(yk7 yk7, boolean z) {
        udd.q("m66", "onItemSelect: " + yk7);
        this.K0 = true;
        tk7 N = kjd.N(yk7);
        pwc pwc = this.J0;
        int g = pwc.g(N);
        if (g == 0 && ((Boolean) this.z0.getValue()).booleanValue()) {
            return 0;
        }
        vqc vqc = (vqc) ((xzc) this.x0.getValue());
        vqc.getClass();
        int o2 = (int) vqc.o(PmsKey.f57maxattachcount, (long) 12);
        f56 f56 = this.Y;
        if (!((Boolean) f56.b.invoke()).booleanValue() || g != 0 || pwc.b() < o2) {
            if (z) {
                pwc.r(N);
            }
            taf.n(this, s().e().plus(this.o), (ru3) null, new c66(this, (Continuation) null), 2);
            this.K0 = false;
            return pwc.g(kjd.N(yk7));
        }
        taf.o(f56.c, new b56(o2));
        return 0;
    }
}
