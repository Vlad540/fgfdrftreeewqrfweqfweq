package defpackage;

import android.content.Context;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: nn2  reason: default package */
public final class nn2 extends taf {
    public static final /* synthetic */ k77[] g1;
    public final t97 A0;
    public final t97 B0;
    public final t97 C0;
    public final t97 D0;
    public final t97 E0;
    public final t97 F0;
    public final t97 G0;
    public final t97 H0;
    public final t97 I0;
    public final t97 J0;
    public final t97 K0;
    public final t97 L0;
    public final e3 M0 = hwf.t();
    public final e3 N0 = hwf.t();
    public final e3 O0 = hwf.t();
    public final e3 P0 = hwf.t();
    public final e3 Q0 = hwf.t();
    public final e3 R0 = hwf.t();
    public final e3 S0 = hwf.t();
    public final e3 T0 = hwf.t();
    public final e3 U0 = hwf.t();
    public final e3 V0 = hwf.t();
    public final e3 W0 = hwf.t();
    public final yr4 X;
    public final e3 X0 = hwf.t();
    public final acc Y;
    public final t0c Y0;
    public final oz2 Z;
    public final t0c Z0;
    public final t0c a1;
    public final q65 b;
    public final hcd b1;
    public final ff5 c;
    public final l05 c1;
    public final bc d1;
    public final t0c e1;
    public final t0c f1;
    public final bv2 o;
    public final km4 w0;
    public final h29 x0;
    public final t97 y0;
    public final t97 z0;

    static {
        Class<nn2> cls = nn2.class;
        g1 = new k77[]{new hc9(cls, "sendMediaJob", "getSendMediaJob()Lkotlinx/coroutines/Job;"), c3d.g(m7c.a, cls, "sendStickerJob", "getSendStickerJob()Lkotlinx/coroutines/Job;"), new hc9(cls, "sendTypingJob", "getSendTypingJob()Lkotlinx/coroutines/Job;"), new hc9(cls, "sendContactsJob", "getSendContactsJob()Lkotlinx/coroutines/Job;"), new hc9(cls, "sendLocationJob", "getSendLocationJob()Lkotlinx/coroutines/Job;"), new hc9(cls, "sendBotCommandJob", "getSendBotCommandJob()Lkotlinx/coroutines/Job;"), new hc9(cls, "editMessageJob", "getEditMessageJob()Lkotlinx/coroutines/Job;"), new hc9(cls, "joinChatJob", "getJoinChatJob()Lkotlinx/coroutines/Job;"), new hc9(cls, "subscribeChannelJob", "getSubscribeChannelJob()Lkotlinx/coroutines/Job;"), new hc9(cls, "saveDraftJob", "getSaveDraftJob()Lkotlinx/coroutines/Job;"), new hc9(cls, "restoreDraftJob", "getRestoreDraftJob()Lkotlinx/coroutines/Job;"), new hc9(cls, "clearDraftJob", "getClearDraftJob()Lkotlinx/coroutines/Job;")};
    }

    /* JADX WARNING: type inference failed for: r8v8, types: [km4, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v5, types: [stf, java.lang.Object] */
    public nn2(long j, s62 s62) {
        int i;
        int i2;
        t0c t0c;
        Object obj;
        tf3 k;
        long j2 = j;
        sl2 sl2 = sl2.a;
        sl2.getClass();
        r7e r7e = new r7e(new hk2(5));
        t97 t97 = rl2.a;
        r7e d = sl2.getAccessor().d(et0.class);
        r7e d2 = sl2.getAccessor().d(g86.class);
        Class<pk> cls = pk.class;
        r7e d3 = sl2.getAccessor().d(cls);
        Class<f03> cls2 = f03.class;
        r7e d4 = sl2.getAccessor().d(cls2);
        Class<xzc> cls3 = xzc.class;
        r7e d5 = sl2.getAccessor().d(cls3);
        r7e d6 = sl2.getAccessor().d(jb5.class);
        Class<pae> cls4 = pae.class;
        r7e d7 = sl2.getAccessor().d(cls4);
        Class<f03> cls5 = cls2;
        r7e d8 = sl2.getAccessor().d(zod.class);
        td3 td3 = (td3) sl2.getAccessor().c(td3.class);
        ab7 ab7 = (ab7) sl2.getAccessor().c(ab7.class);
        r7e d9 = sl2.getAccessor().d(mn3.class);
        Class<luf> cls6 = luf.class;
        r7e d10 = sl2.getAccessor().d(cls6);
        r7e d11 = sl2.getAccessor().d(gw8.class);
        r7e d12 = sl2.getAccessor().d(eha.class);
        r7e d13 = sl2.getAccessor().d(l47.class);
        r7e r7e2 = d10;
        Class<bv2> cls7 = bv2.class;
        r7e r7e3 = d7;
        q65 q65 = r1;
        r7e r7e4 = d6;
        Class<f03> cls8 = cls5;
        r7e r7e5 = d8;
        td3 td32 = td3;
        ab7 ab72 = ab7;
        r7e r7e6 = d9;
        r7e r7e7 = d11;
        r7e r7e8 = d5;
        r7e r7e9 = d2;
        r7e r7e10 = d4;
        Class<pk> cls9 = cls;
        r7e r7e11 = d;
        r7e r7e12 = r7e;
        q65 q652 = new q65(sl2.getDispatchers(), (tt0) sl2.getAccessor().c(tt0.class), j, s62, sl2.getAccessor().d(cls7));
        ff5 ff5 = (ff5) sl2.getAccessor().c(ff5.class);
        aw2 aw2 = (bv2) sl2.getAccessor().c(cls7);
        Class<m86> cls10 = m86.class;
        ap3 ap3 = (ap3) sl2.getAccessor().c(ap3.class);
        r7e r7e13 = d3;
        yr4 yr4 = new yr4(sl2.getAccessor().d(cls10), sl2.getAccessor().d(b29.class), sl2.getAccessor().d(cls4), sl2.getAccessor().d(cls6));
        acc acc = new acc(sl2.getAccessor().d(cls7), sl2.getAccessor().d(w6a.class), sl2.getAccessor().d(cls4), 0);
        oz2 b2 = sl2.b();
        sl2.getClass();
        oz2 oz2 = b2;
        lz2 lz2 = new lz2(sl2.getAccessor().d(cls4), sl2.getAccessor().d(jee.class));
        oz2 b3 = sl2.b();
        acc acc2 = acc;
        sl2.getAccessor().d(g15.class);
        r7e d14 = sl2.getAccessor().d(cls7);
        r7e d15 = sl2.getAccessor().d(cls8);
        r7e d16 = sl2.getAccessor().d(cls3);
        r7e d17 = sl2.getAccessor().d(cls9);
        r7e d18 = sl2.getAccessor().d(cls10);
        r7e d19 = sl2.getAccessor().d(cls4);
        ? obj2 = new Object();
        obj2.b = b3;
        obj2.c = lz2;
        obj2.a = km4.class.getName();
        obj2.o = d14;
        obj2.X = d15;
        obj2.Y = d16;
        obj2.Z = d17;
        obj2.w0 = d18;
        obj2.x0 = d19;
        h29 c2 = sl2.c();
        r7e d20 = sl2.getAccessor().d(jte.class);
        r7e d21 = sl2.getAccessor().d(cls8);
        r7e d22 = sl2.getAccessor().d(cls4);
        r7e d23 = sl2.getAccessor().d(ip.class);
        ? obj3 = new Object();
        obj3.a = new r7e(new xq(18, d22));
        obj3.b = d21;
        obj3.c = d22;
        obj3.o = d23;
        Context context = (Context) sl2.getAccessor().c(Context.class);
        q65 q653 = q65;
        this.b = q653;
        this.c = ff5;
        this.o = aw2;
        this.X = yr4;
        this.Y = acc2;
        this.Z = oz2;
        this.w0 = obj2;
        this.x0 = c2;
        this.y0 = r7e13;
        r7e r7e14 = r7e10;
        this.z0 = r7e14;
        this.A0 = r7e8;
        r7e r7e15 = r7e4;
        this.B0 = r7e15;
        r7e r7e16 = r7e3;
        this.C0 = r7e16;
        this.D0 = r7e5;
        this.E0 = r7e6;
        this.F0 = r7e12;
        this.G0 = r7e11;
        this.H0 = r7e9;
        this.I0 = r7e2;
        this.J0 = r7e7;
        this.K0 = d12;
        this.L0 = d13;
        v11 v11 = new v11((t0c) km4.y0.n(context).x0, obj3, context, 1);
        qr4 qr4 = ucd.a;
        this.Y0 = ez3.d0(v11, this.a, qr4, (Object) null);
        int ordinal = s62.ordinal();
        if (ordinal != 0) {
            i = 1;
            if (ordinal == 1) {
                i2 = 2;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            i = 1;
            i2 = 1;
        }
        aw2.getClass();
        int t = hr1.t(i2);
        if (t == 0) {
            t0c = aw2.m(j);
        } else if (t == i) {
            t0c = aw2.n(j);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.Z0 = t0c;
        this.a1 = ez3.d0(new zi1(new ik5(t0c, 2), 12), this.a, qr4, (Object) null);
        this.b1 = icd.b(0, 0, 0, 7);
        this.c1 = new l05(0);
        pj5 z = ez3.z(new v11(ab72.d, this, d20, 2));
        pj5 z2 = ez3.z(new bc(new t0c(td32.a), 12, this));
        int i3 = zp4.o;
        this.d1 = ez3.s(ez3.y(new ik5(vx3.M(t0c, mt0.P(1, eq4.SECONDS)), 2), new vg0(5)), z, z2, new ln2(this, r7e14, r7e15, (Continuation) null));
        i22 i22 = (i22) t0c.a.getValue();
        if (i22 == null || (k = i22.k()) == null) {
            obj = new tj5(3, (Object) null);
        } else {
            obj = ap3.c(k.n());
        }
        this.e1 = ez3.d0(new v11(new ik5(t0c, 2), obj, new od1((Object) this, (t97) r7e14, (Continuation) null, 1), 4), this.a, qr4, (Object) null);
        this.f1 = ez3.d0(ez3.J(new zi1(new s0c(q653.b), 13), ((pae) r7e16.getValue()).b()), this.a, qr4, Boolean.FALSE);
        ez3.N(ez3.J(new djc(new in2(new ik5(t0c, 2), (Continuation) null, this)), u().b()), this.a);
        ez3.N(new ck5(new s0c(ff5.b), new vl2(this, (Continuation) null), 5), this.a);
    }

    public static final et0 q(nn2 nn2) {
        return (et0) nn2.G0.getValue();
    }

    public static final luf r(nn2 nn2) {
        return (luf) nn2.I0.getValue();
    }

    public final void A(dm7 dm7, float f, long j, Long l, jv5 jv5) {
        String name = nn2.class.getName();
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            tn7 tn7 = tn7.X;
            fn6.d(tn7, name, "sendLocation " + dm7, (Throwable) null);
        } else {
            dm7 dm72 = dm7;
        }
        i22 i22 = (i22) this.Z0.a.getValue();
        if (i22 != null) {
            long j2 = i22.a;
            this.Q0.o1(this, g1[4], xs7.D(this.a, u().b(), ru3.b, new ym2(j2, dm7, f, j, this, l, jv5, (Continuation) null)));
        }
    }

    public final void B(CharSequence charSequence, List list, boolean z, Long l, jv5 jv5) {
        i22 i22 = (i22) this.Z0.a.getValue();
        if (i22 != null) {
            qod n = taf.n(this, (hu3) null, ru3.b, new zm2(this, i22.a, charSequence, list, z, l, jv5, (Continuation) null), 1);
            this.M0.o1(this, g1[0], n);
        }
    }

    public final void p() {
        q65 q65 = this.b;
        q65.a.f(q65);
        ff5 ff5 = this.c;
        ff5.a.f(ff5);
    }

    public final void s() {
        udd.p(nn2.class.getName(), "clear draft", new Object[0]);
        qod D = xs7.D(this.a, u().b(), ru3.b, new gm2(this, (Continuation) null));
        this.X0.o1(this, g1[11], D);
    }

    public final void t(CharSequence charSequence, Long l, List list, boolean z) {
        i22 i22 = (i22) this.Z0.a.getValue();
        Long valueOf = i22 != null ? Long.valueOf(i22.a) : null;
        if (l != null && valueOf != null) {
            this.S0.o1(this, g1[6], taf.n(this, (hu3) null, ru3.b, new jm2(this, l, valueOf, charSequence, list, z, (Continuation) null), 1));
            s();
        }
    }

    public final pae u() {
        return (pae) this.C0.getValue();
    }

    public final boolean v() {
        i22 i22 = (i22) this.Z0.a.getValue();
        return i22 != null && i22.G();
    }

    public final boolean w() {
        i22 i22 = (i22) this.Z0.a.getValue();
        return i22 != null && i22.J();
    }

    public final void x() {
        taf.o(this.c1, new am2(new hge(rhc.D), p23.B(new kc3(qhc.m0, new hge(rhc.F), 3, false), new kc3(qhc.n0, new hge(rhc.G), 3, false), new kc3(qhc.l0, new hge(rhc.E), 3, false), new kc3(qhc.o0, new hge(rhc.H), 1, false), new kc3(qhc.q, new hge(rhc.h), 3, false))));
    }

    public final Object y(Continuation continuation) {
        return xs7.U(u().b(), new rm2(this, (Continuation) null), continuation);
    }

    public final void z(CharSequence charSequence, Long l, Long l2) {
        String name = nn2.class.getName();
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            tn7 tn7 = tn7.X;
            Integer valueOf = charSequence != null ? Integer.valueOf(charSequence.length()) : null;
            fn6.d(tn7, name, "save draft, textLength:" + valueOf, (Throwable) null);
        }
        this.V0.o1(this, g1[9], xs7.D(this.a, u().b(), ru3.b, new tm2(this, charSequence, l, l2, (Continuation) null)));
    }
}
