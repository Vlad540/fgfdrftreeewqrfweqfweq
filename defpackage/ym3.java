package defpackage;

import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* renamed from: ym3  reason: default package */
public final class ym3 extends h5b {
    public final boolean f;
    public final t97 g;
    public final t97 h;
    public final t97 i;
    public final t97 j;
    public final t97 k;
    public final t97 l;
    public a53 m;
    public final sp2 n = new sp2();
    public final t97 o = ez3.O(3, new xd3(5));
    public final t97 p = ez3.O(3, new xd3(6));
    public final qg4 q;
    public final t97 r;
    public final grd s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ym3(long j2, ou3 ou3, boolean z) {
        super(j2);
        long j3 = j2;
        ou3 ou32 = ou3;
        this.f = z;
        i6b i6b = i6b.a;
        t97 e = i6b.e();
        this.g = e;
        this.h = i6b.c();
        r7e d = i6b.getAccessor().d(s2b.class);
        this.i = d;
        this.j = i6b.getAccessor().d(xf3.class);
        this.k = i6b.getAccessor().d(ch3.class);
        this.l = i6b.getAccessor().d(mn3.class);
        t97 f2 = i6b.f();
        qg4 a = ((o5b) i6b.getAccessor().c(o5b.class)).a(j3);
        this.q = a;
        this.r = i6b.getAccessor().d(r59.class);
        grd a2 = hrd.a(hw4.a);
        this.s = a2;
        a53 a53 = new a53(j3);
        this.m = a53;
        ez3.N(new ck5(a53.i, new um3(this, (Continuation) null), 5), ou32);
        ez3.N(ez3.J(new ck5(ez3.s(new ik5(ez3.H(((ap3) e.getValue()).c(j3), new wm3(this, j3, (Continuation) null)), 2), new t0c(((q2b) ((s2b) d.getValue()).a.getValue()).d().c(j3)), new t0c(a2), new vm3(this, (Continuation) null)), new hp0(2, this, ym3.class, "emitState", "emitState(Lone/me/profile/viewmodel/logic/Profile$State;)V", 4, 12), 5), ((pae) f2.getValue()).a()), ou32);
        ez3.N(ez3.J(new ck5(new s0c(a.d), new hp0(2, this, ym3.class, "handleProfileEvent", "handleProfileEvent(Lone/me/profile/viewmodel/logic/DialogProfileEvent;)V", 4, 13), 5), ((pae) f2.getValue()).a()), ou32);
    }

    public final void D(Continuation continuation) {
        ((mn3) this.l.getValue()).a(this.a);
    }

    public final wia E(tf3 tf3) {
        List list;
        o62 o62;
        tf3 tf32 = tf3;
        String name = ym3.class.getName();
        udd.q(name, "buildAppBarAndItems " + tf32);
        l5b l5b = new l5b(tf3.n(), tf3.c(), tf3.r(), tf32.p(fj0.b), tf3.d(), tf3.m(), new lge(((q2b) ((s2b) this.i.getValue()).a.getValue()).b(tf32)), new lge(ehe.c(tf3.j())), tf3.s() || tf3.k() != 0, tf3.u());
        ntc ntc = (ntc) this.c.getValue();
        t97 t97 = this.h;
        long j2 = this.a;
        i22 q2 = ((aw2) ((bv2) t97.getValue())).q(j2);
        ntc.getClass();
        lg7 c = hwf.c();
        ntc.b(c, tf32, q2);
        w6a a = ntc.a();
        CharSequence l2 = tf32.l(ntc.a());
        a.getClass();
        CharSequence a2 = a.a(l2, false, false, true, (List) null, true);
        if (!(a2 == null || a2.length() == 0)) {
            c.add(new hcb(a2, new hge(tf3.t() ? l8a.E : l8a.F)));
        }
        long o2 = tf3.o();
        wbb wbb = null;
        if (o2 > 0) {
            String valueOf = String.valueOf(o2);
            t97 t972 = ntc.c;
            String a3 = che.a((loa) ntc.b.getValue(), valueOf, ((i03) ((f03) t972.getValue())).g.getString("app.location.country.code", (String) null), ((lqc) ((f03) t972.getValue())).q());
            if (a3 != null && a3.length() > 1) {
                c.add(new lcb(a3));
            }
        }
        c.add(new Object());
        lg7 a4 = hwf.a(c);
        gu0 gu0 = (gu0) this.b.getValue();
        i22 q3 = ((aw2) ((bv2) t97.getValue())).q(j2);
        gu0.getClass();
        if (tf3.s()) {
            list = p23.B(new c1a[]{new c1a(j8a.o1, Integer.valueOf(l8a.L), (Integer) null, Integer.valueOf(phc.g1), (Integer) null, 52), gu0.c()});
        } else {
            lg7 c2 = hwf.c();
            if (!this.f) {
                c2.add(gu0.d());
            }
            if (!tf3.t() && !tf3.w() && tf3.k() == 0) {
                c2.add(new c1a(j8a.l, Integer.valueOf(l8a.k), (Integer) null, Integer.valueOf(phc.c0), (Integer) null, 52));
                c2.add(new c1a(j8a.p1, Integer.valueOf(l8a.M), (Integer) null, Integer.valueOf(phc.m2), (Integer) null, 52));
            }
            if (!(((q3 == null || (o62 = q3.b) == null) ? null : o62.c) == m62.o || q3 == null)) {
                c2.add(q3.S((f03) gu0.a.getValue()) ? gu0.a() : gu0.b());
            }
            list = hwf.a(c2);
        }
        l6b l6b = (l6b) this.o.getValue();
        l6b.getClass();
        lg7 c3 = hwf.c();
        c3.add((c1a) l6b.a.getValue());
        c3.add((c1a) l6b.b.getValue());
        if (!tf3.s()) {
            c3.add((c1a) l6b.e.getValue());
        }
        c3.add((c1a) l6b.f.getValue());
        lg7 a5 = hwf.a(c3);
        if (!tf3.c() && !tf3.s() && tf3.k() == 0) {
            wbb = new wbb(l8a.h);
        }
        lg7 c4 = hwf.c();
        if ((!list.isEmpty()) || (!a5.isEmpty())) {
            c4.add(new vbb(list, a5, true));
        }
        if (wbb != null) {
            c4.add(wbb);
        }
        c4.addAll(a4);
        return new wia(l5b, hwf.a(c4));
    }

    public final tf3 F() {
        return (tf3) ((ap3) this.g.getValue()).c(this.a).a.getValue();
    }

    public final void a(Continuation continuation) {
        ((ch3) this.k.getValue()).a(this.a);
    }

    public final void d() {
        qg4 qg4 = this.q;
        qg4.b.f(qg4);
        a53 a53 = this.m;
        if (a53 != null) {
            r43 r43 = (r43) a53.e.getValue();
            r43.a.f(r43);
            k77[] k77Arr = a53.m;
            k77 k77 = k77Arr[0];
            e3 e3Var = a53.l;
            g37 g37 = (g37) e3Var.T0(a53, k77);
            if (g37 != null) {
                g37.cancel((CancellationException) null);
            }
            e3Var.o1(a53, k77Arr[0], (Object) null);
        }
        this.m = null;
    }

    public final t81 e() {
        return new rdb(this.a, r6b.CONTACT);
    }

    public final String h() {
        tf3 F = F();
        if (F != null) {
            return F.g();
        }
        return null;
    }

    public final Long i() {
        i22 q2 = ((aw2) ((bv2) this.h.getValue())).q(this.a);
        if (q2 != null) {
            return Long.valueOf(q2.a);
        }
        return null;
    }

    public final Long j() {
        i22 q2 = ((aw2) ((bv2) this.h.getValue())).q(this.a);
        if (q2 != null) {
            return Long.valueOf(q2.b.a);
        }
        return null;
    }

    public final int k() {
        return 2;
    }

    public final r6b l() {
        return r6b.CONTACT;
    }

    public final Object n(Continuation continuation) {
        return ((aw2) ((bv2) this.h.getValue())).u(this.a, continuation);
    }

    public final String o() {
        tf3 F = F();
        if (F != null) {
            return Long.valueOf(F.o()).toString();
        }
        return null;
    }

    public final boolean r() {
        return true;
    }

    public final void s() {
        a53 a53 = this.m;
        if (a53 != null) {
            qod E = xs7.E(a53.k, (hu3) null, ru3.b, new y43(a53, (Continuation) null), 1);
            a53.l.o1(a53, a53.m[0], E);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object t(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.xm3
            if (r0 == 0) goto L_0x0013
            r0 = r5
            xm3 r0 = (defpackage.xm3) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Y = r1
            goto L_0x0018
        L_0x0013:
            xm3 r0 = new xm3
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.o
            pu3 r1 = pu3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            wx3.H(r5)
            goto L_0x0046
        L_0x0027:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x002f:
            wx3.H(r5)
            t97 r5 = r4.j
            java.lang.Object r5 = r5.getValue()
            xf3 r5 = (defpackage.xf3) r5
            r0.Y = r3
            long r2 = r4.a
            r5.a(r2)
            jue r4 = jue.a
            if (r4 != r1) goto L_0x0046
            return r1
        L_0x0046:
            bfb r4 = new bfb
            int r5 = defpackage.phc.m
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r5)
            int r5 = defpackage.l8a.D0
            hge r1 = new hge
            r1.<init>(r5)
            r4.<init>(r1, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ym3.t(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final boolean w() {
        a53 a53 = this.m;
        if (a53 == null) {
            return false;
        }
        i53 i53 = (i53) a53.h.getValue();
        d53 d53 = i53 instanceof d53 ? (d53) i53 : null;
        return d53 != null && d53.b;
    }

    public final a34 x() {
        y76 y76 = r6b.b;
        kdb.c.getClass();
        return new a34(":profile/avatars?id=" + this.a + "&type=contact");
    }

    public final cfb y() {
        l5b l5b;
        CharSequence charSequence;
        g5b g5b = (g5b) this.e.a.getValue();
        if (g5b == null || (l5b = g5b.a) == null || (charSequence = l5b.e) == null) {
            return null;
        }
        return ((q5b) this.p.getValue()).a(2, charSequence, false);
    }
}
