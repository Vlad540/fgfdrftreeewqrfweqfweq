package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: fu2  reason: default package */
public final class fu2 extends taf {
    public static final /* synthetic */ k77[] Z0;
    public final t97 A0;
    public final t97 B0;
    public final t97 C0;
    public final t97 D0;
    public final t97 E0;
    public final t97 F0;
    public final t97 G0;
    public final t97 H0;
    public final t97 I0;
    public final grd J0;
    public final t0c K0;
    public final grd L0;
    public final grd M0;
    public final t0c N0;
    public final grd O0;
    public final t0c P0;
    public final l05 Q0;
    public final l05 R0;
    public volatile zb9 S0;
    public final yb9 T0;
    public final grd U0;
    public final e3 V0;
    public final hcd W0;
    public final kr2 X;
    public final pj5 X0;
    public final pae Y;
    public qod Y0;
    public final t97 Z;
    public final ok3 b;
    public final String c;
    public final we1 o;
    public final t97 w0;
    public final t97 x0;
    public final t97 y0;
    public final t97 z0;

    static {
        hc9 hc9 = new hc9(fu2.class, "unblockContactJob", "getUnblockContactJob()Lkotlinx/coroutines/Job;");
        m7c.a.getClass();
        Z0 = new k77[]{hc9};
    }

    /* JADX WARNING: type inference failed for: r1v16, types: [i26, l5e] */
    public fu2(ok3 ok3, String str, we1 we1) {
        r7e r7e;
        Object obj;
        dw6 dw6;
        String str2 = str;
        tp2 tp2 = tp2.a;
        kr2 a = ((mq2) tp2.getAccessor().c(mq2.class)).a(str2);
        n3a d = tp2.d();
        r7e d2 = tp2.getAccessor().d(n22.class);
        r7e d3 = tp2.getAccessor().d(y8c.class);
        r7e d4 = tp2.getAccessor().d(bv2.class);
        r7e d5 = tp2.getAccessor().d(t52.class);
        r7e d6 = tp2.getAccessor().d(ch3.class);
        r7e d7 = tp2.getAccessor().d(mn3.class);
        r7e d8 = tp2.getAccessor().d(f03.class);
        r7e d9 = tp2.getAccessor().d(xzc.class);
        r7e d10 = tp2.getAccessor().d(m0c.class);
        ab7 ab7 = (ab7) tp2.getAccessor().c(ab7.class);
        fw6 fw6 = (fw6) tp2.getAccessor().c(fw6.class);
        fw6.getClass();
        if (str2.equals("all.chat.folder")) {
            obj = "all.chat.folder";
            r7e = d10;
            dw6 = new lv1(2, (s5a) fw6.a.c(s5a.class));
        } else {
            r7e = d10;
            obj = "all.chat.folder";
            dw6 = ew6.L;
        }
        r7e d11 = tp2.getAccessor().d(v72.class);
        r7e d12 = tp2.getAccessor().d(r59.class);
        r7e d13 = tp2.getAccessor().d(lr2.class);
        r7e d14 = tp2.getAccessor().d(ef7.class);
        r7e d15 = tp2.getAccessor().d(g5e.class);
        r7e d16 = tp2.getAccessor().d(luf.class);
        this.b = ok3;
        this.c = str2;
        this.o = we1;
        this.X = a;
        this.Y = d;
        this.Z = d3;
        this.w0 = d8;
        this.x0 = d9;
        this.y0 = d4;
        this.z0 = d5;
        this.A0 = d6;
        this.B0 = d7;
        this.C0 = d2;
        this.D0 = r7e;
        this.E0 = d11;
        this.F0 = d12;
        this.G0 = d14;
        this.H0 = d15;
        this.I0 = d16;
        grd a2 = hrd.a(dw6.f());
        this.J0 = a2;
        this.K0 = new t0c(a2);
        grd a3 = hrd.a(hw4.a);
        this.L0 = a3;
        grd a4 = hrd.a(a3.getValue());
        this.M0 = a4;
        this.N0 = new t0c(a4);
        grd a5 = hrd.a(Boolean.FALSE);
        this.O0 = a5;
        this.P0 = new t0c(a5);
        this.Q0 = new l05(0);
        this.R0 = new l05(0);
        this.S0 = tq7.a;
        yb9 yb9 = pq7.a;
        this.T0 = new yb9();
        this.U0 = hrd.a(0L);
        this.V0 = hwf.t();
        this.W0 = icd.a(20, 20, 2);
        if (hhd.f(str2, obj)) {
            q49 q49 = (q49) ((lr2) d13.getValue());
            qod qod = q49.h;
            if (qod != null) {
                qod.cancel((CancellationException) null);
            }
            u09 u09 = new u09(new nl5(a.C0, 0), 2);
            int i = zp4.o;
            bc bcVar = new bc(ez3.J(new ck5(ez3.J(new m49(ez3.y(new m49(vx3.M(u09, mt0.P(3, eq4.SECONDS)), q49, 0), new vg0(18)), q49, 1), q49.e), new o49(q49, (Continuation) null), 5), q49.d), 17, new ao2(3, (Continuation) null, 2));
            q49.h = ez3.N((cw1) (!(bcVar instanceof cw1) ? new ew1(bcVar) : bcVar), q49.f);
        }
        ez3.N(ez3.J(new ck5(new nt2(new v11(a.C0, ab7.d, new c3(this, (Continuation) null, 7), 4), this, 0), new zv(2, a2, mc9.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 11), 5), d.a()), this.a);
        vqc vqc = (xzc) d9.getValue();
        vqc.getClass();
        if (vqc.m(PmsKey.fake-chats, false)) {
            String f = ((f03) d8.getValue()).f("user.Phone", (String) null);
            StringBuilder sb = new StringBuilder();
            int length = f.length();
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = f.charAt(i2);
                if (Character.isDigit(charAt)) {
                    sb.append(charAt);
                }
            }
            ck5 ck5 = new ck5(ez3.P(new da1(new v11(this.b.a(), new ck5(new nt2(new nt2(this.U0, this, 1), this, 2), new l5e(2, (Continuation) null)), new tt2(3, (Continuation) null, 0), 4), new rt2(new zo4(15), 0), this, o0e.H(sb.toString()), 1), new ut2(this, (Continuation) null)), new vt2(this, (Continuation) null));
            n3a n3a = this.Y;
            pj5 J = ez3.J(ck5, n3a.a());
            ContextScope contextScope = this.a;
            ez3.N(J, contextScope);
            ez3.N(ez3.J(new ck5(this.K0, new wt2(this, (Continuation) null), 5), n3a.a()), contextScope);
        }
        xs7.E(this.a, this.Y.a(), (ru3) null, new dt2(this, (Continuation) null), 2);
        zi1 zi1 = new zi1(ez3.z(this.W0), 18);
        int i3 = zp4.o;
        ez3.N(ez3.J(new bc(new ck5(new zi1(new nt2(new q02(new yj5(mt0.P(5, eq4.SECONDS), zi1, (Continuation) null), bw4.a, -2, 1, 0), this, 4), 19), new cu2(this, (Continuation) null), 5), 17, new ao2(3, (Continuation) null, 1)), this.Y.b().limitedParallelism(1, "missed")), this.a);
        this.X0 = ez3.J(new zi1(ez3.z(new nt2(new v11(this.J0, ((v72) this.E0.getValue()).g(), new z9(3, (Continuation) null, 7), 4), this, 3)), 17), this.Y.a());
    }

    public static final boolean q(fu2 fu2, hq2 hq2) {
        fu2.getClass();
        return hq2.a.size() <= 10 && !hq2.b;
    }

    public static final bv2 r(fu2 fu2) {
        return (bv2) fu2.y0.getValue();
    }

    public static final void s(fu2 fu2, long j, long j2) {
        t52 t = fu2.t();
        long e = zp4.e(j2) + ((f03) fu2.w0.getValue()).m();
        i22 B = t.B(j);
        if (B != null) {
            t.l(e, B);
            ((pk) t.p.get()).r(B.a);
        }
    }

    public final t52 t() {
        return (t52) this.z0.getValue();
    }

    public final void u() {
        grd grd = this.U0;
        grd.m((Object) null, Long.valueOf(((Number) grd.getValue()).longValue() + 1));
    }
}
