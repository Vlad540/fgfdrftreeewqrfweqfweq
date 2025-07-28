package defpackage;

import android.os.Bundle;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: dk2  reason: default package */
public final class dk2 extends h5b {
    public final t97 f;
    public final t97 g;
    public final t97 h;
    public final t97 i;
    public final t97 j;
    public final String k = dk2.class.getName();
    public final t97 l;
    public final r7e m;
    public final r7e n;
    public final t97 o;
    public final t97 p;
    public final t97 q;
    public final t97 r;
    public final t97 s;
    public final AtomicLong t;

    public dk2(long j2, ou3 ou3) {
        super(j2);
        i6b i6b = i6b.a;
        t97 c = i6b.c();
        this.f = c;
        this.g = i6b.e();
        t97 f2 = i6b.f();
        this.h = f2;
        this.i = i6b.g();
        this.j = i6b.d();
        this.l = i6b.getAccessor().d(gg7.class);
        this.m = new r7e(new p22(24));
        this.n = new r7e(new p22(25));
        this.o = i6b.getAccessor().d(vy1.class);
        this.p = i6b.b();
        this.q = ez3.O(3, new p22(26));
        this.r = ez3.O(3, new p22(27));
        this.s = i6b.getAccessor().d(l47.class);
        this.t = new AtomicLong();
        ez3.N(ez3.J(new ck5(new ik5(new bc(new djc(new ck2(new ik5(((aw2) ((bv2) c.getValue())).m(j2), 2), (Continuation) null, ou3, this)), 11, this), 2), new hp0(2, this, dk2.class, "emitState", "emitState(Lone/me/profile/viewmodel/logic/Profile$State;)V", 4, 7), 5), ((pae) f2.getValue()).a()), ou3);
    }

    public final cfb A(long j2) {
        String d;
        tf3 tf3 = (tf3) ((ap3) this.g.getValue()).c(j2).a.getValue();
        if (tf3 == null || (d = tf3.d()) == null) {
            return null;
        }
        q5b q5b = (q5b) this.r.getValue();
        int k2 = k();
        q5b.getClass();
        int t2 = hr1.t(k2);
        if (t2 == 0) {
            return new xeb(new jge(l8a.j2, cs.g0(new Object[]{d})), (mge) null, p23.B(new kc3[]{new kc3(j8a.A0, new hge(l8a.d2), 1, false), new kc3(j8a.C0, new hge(l8a.f2), 1, false), new kc3(j8a.B0, new hge(l8a.e2), 2, false)}), jjd.j(new wia[]{new wia("profile:participant_id_for_action", Long.valueOf(j2))}));
        }
        if (t2 == 1 || t2 == 2 || t2 == 3) {
            return q5b.c();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void D(Continuation continuation) {
    }

    public final i22 E() {
        return (i22) ((aw2) ((bv2) this.f.getValue())).m(this.a).a.getValue();
    }

    public final void a(Continuation continuation) {
    }

    public final boolean b() {
        i22 E = E();
        if (E != null) {
            return E.a();
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(java.lang.String r7, android.graphics.RectF r8, kotlin.coroutines.Continuation r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.wj2
            if (r0 == 0) goto L_0x0013
            r0 = r9
            wj2 r0 = (defpackage.wj2) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            wj2 r0 = new wj2
            r0.<init>(r6, r9)
        L_0x0018:
            java.lang.Object r9 = r0.X
            pu3 r1 = pu3.a
            int r2 = r0.Z
            jue r3 = jue.a
            r4 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r4) goto L_0x002b
            java.util.concurrent.atomic.AtomicLong r6 = r0.o
            wx3.H(r9)
            goto L_0x0059
        L_0x002b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0033:
            wx3.H(r9)
            i22 r9 = r6.E()
            if (r9 != 0) goto L_0x003d
            return r3
        L_0x003d:
            d10 r8 = iu7.i(r8)
            java.util.concurrent.atomic.AtomicLong r2 = r6.t
            t97 r6 = r6.o
            java.lang.Object r6 = r6.getValue()
            vy1 r6 = (defpackage.vy1) r6
            r0.o = r2
            r0.Z = r4
            long r4 = r9.a
            java.lang.Long r9 = r6.a(r4, r7, r8)
            if (r9 != r1) goto L_0x0058
            return r1
        L_0x0058:
            r6 = r2
        L_0x0059:
            java.lang.Number r9 = (java.lang.Number) r9
            long r7 = r9.longValue()
            r6.set(r7)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dk2.c(java.lang.String, android.graphics.RectF, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void d() {
    }

    public final t81 e() {
        return new rdb(this.a, r6b.LOCAL_CHAT);
    }

    public final long g() {
        return this.t.get();
    }

    public final String h() {
        o62 o62;
        i22 E = E();
        if (E == null || (o62 = E.b) == null) {
            return null;
        }
        return o62.I;
    }

    public final Long i() {
        return Long.valueOf(this.a);
    }

    public final Long j() {
        i22 E = E();
        if (E != null) {
            return Long.valueOf(E.b.a);
        }
        return null;
    }

    public final int k() {
        i22 E = E();
        return (E == null || !E.G()) ? 1 : 3;
    }

    public final r6b l() {
        return r6b.LOCAL_CHAT;
    }

    public final long m() {
        return this.a;
    }

    public final Object n(Continuation continuation) {
        return E();
    }

    public final boolean p() {
        i22 E = E();
        return E != null && E.G();
    }

    public final boolean q() {
        i22 E = E();
        return E != null && E.a0();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004c, code lost:
        r7 = r7.b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object t(kotlin.coroutines.Continuation r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.xj2
            if (r0 == 0) goto L_0x0013
            r0 = r7
            xj2 r0 = (defpackage.xj2) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Y = r1
            goto L_0x0018
        L_0x0013:
            xj2 r0 = new xj2
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.o
            pu3 r1 = pu3.a
            int r2 = r0.Y
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0037
            if (r2 == r4) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            wx3.H(r7)
            goto L_0x0069
        L_0x002b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0033:
            wx3.H(r7)
            goto L_0x0065
        L_0x0037:
            wx3.H(r7)
            i22 r7 = r6.E()
            if (r7 == 0) goto L_0x0066
            boolean r7 = r7.P()
            if (r7 != r4) goto L_0x0066
            i22 r7 = r6.E()
            if (r7 == 0) goto L_0x0053
            o62 r7 = r7.b
            if (r7 == 0) goto L_0x0053
            java.lang.String r7 = r7.I
            goto L_0x0054
        L_0x0053:
            r7 = r5
        L_0x0054:
            t97 r6 = r6.s
            java.lang.Object r6 = r6.getValue()
            l47 r6 = (defpackage.l47) r6
            r0.Y = r4
            java.lang.Object r6 = r6.a(r7, r0)
            if (r6 != r1) goto L_0x0065
            return r1
        L_0x0065:
            return r5
        L_0x0066:
            r0.Y = r3
            r7 = r5
        L_0x0069:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dk2.t(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final jue u() {
        i22 E = E();
        g5b g5b = (g5b) this.e.a.getValue();
        jue jue = jue.a;
        if (E == null || g5b == null) {
            return jue;
        }
        List g2 = E.g();
        String f2 = E.f(fj0.b, ej0.a);
        l5b l5b = g5b.a;
        jue jue2 = jue;
        l5b l5b2 = r4;
        l5b l5b3 = new l5b(l5b.a, l5b.b, g2, f2, l5b.e, l5b.f, l5b.g, l5b.h, l5b.i, l5b.j);
        f(g5b.a(g5b, l5b2, (List) null, 6));
        return jue2;
    }

    public final Object v(long j2, boolean z, Continuation continuation) {
        Object U = xs7.U(((pae) this.h.getValue()).b(), new yj2(this, j2, z, (Continuation) null), continuation);
        return U == pu3.a ? U : jue.a;
    }

    public final a34 x() {
        y76 y76 = r6b.b;
        kdb.c.getClass();
        return new a34(":profile/avatars?id=" + this.a + "&type=local_chat");
    }

    public final cfb y() {
        l5b l5b;
        CharSequence charSequence;
        g5b g5b = (g5b) this.e.a.getValue();
        if (g5b == null || (l5b = g5b.a) == null || (charSequence = l5b.e) == null) {
            return null;
        }
        int k2 = k();
        i22 E = E();
        t97 t97 = this.r;
        boolean z = true;
        if (E == null || !E.b()) {
            q5b q5b = (q5b) t97.getValue();
            i22 E2 = E();
            if (E2 == null || !E2.Y()) {
                z = false;
            }
            return q5b.a(k2, charSequence, z);
        }
        q5b q5b2 = (q5b) t97.getValue();
        q5b2.getClass();
        int t2 = hr1.t(k2);
        if (t2 == 0) {
            jge jge = new jge(l8a.n1, cs.g0(new Object[]{charSequence}));
            lg7 c = hwf.c();
            c.add(new kc3(j8a.Q, new hge(l8a.k1), 1, false));
            c.add(new kc3(j8a.y, new hge(l8a.l1), 3, false));
            return new xeb(jge, (mge) null, hwf.a(c), (Bundle) null);
        } else if (t2 == 1) {
            return q5b2.c();
        } else {
            if (t2 == 2) {
                jge jge2 = new jge(l8a.j1, cs.g0(new Object[]{charSequence}));
                hge hge = new hge(l8a.i1);
                lg7 c2 = hwf.c();
                c2.add(new kc3(j8a.Q, new hge(l8a.k1), 1, false));
                c2.add(new kc3(j8a.y, new hge(l8a.l1), 3, false));
                return new xeb(jge2, hge, hwf.a(c2), (Bundle) null);
            } else if (t2 == 3) {
                return q5b2.c();
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public final cfb z(int i2, long j2) {
        i22 E = E();
        if (E == null || !E.Y() || j2 == ((lqc) ((f03) this.j.getValue())).s()) {
            return null;
        }
        l6b l6b = (l6b) this.q.getValue();
        l6b.getClass();
        lg7 c = hwf.c();
        c.add((pq3) l6b.k.getValue());
        return new zeb(j2, hwf.a(c), i2);
    }
}
