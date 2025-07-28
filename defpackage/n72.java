package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;

/* renamed from: n72  reason: default package */
public final class n72 extends bs4 {
    public static final /* synthetic */ k77[] E;
    public final p87 A;
    public final boolean B;
    public final boolean C;
    public final boolean D;
    public final long n;
    public final AtomicBoolean o = new AtomicBoolean(false);
    public volatile boolean p;
    public final t97 q;
    public final t97 r;
    public final t97 s;
    public final t97 t;
    public final t97 u;
    public final t97 v;
    public final t97 w;
    public final t97 x;
    public final e3 y;
    public final e3 z;

    static {
        Class<n72> cls = n72.class;
        E = new k77[]{new hc9(cls, "leaveChatJob", "getLeaveChatJob()Lkotlinx/coroutines/Job;"), c3d.g(m7c.a, cls, "deleteChatJob", "getDeleteChatJob()Lkotlinx/coroutines/Job;")};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n72(long j, ou3 ou3) {
        super(ou3);
        boolean z2 = true;
        this.n = j;
        z7b z7b = z7b.a;
        this.q = z7b.b();
        t97 c = z7b.c();
        this.r = c;
        this.s = z7b.d();
        this.t = z7b.getAccessor().d(y8c.class);
        this.u = z7b.getAccessor().d(luf.class);
        this.v = z7b.getAccessor().d(xy1.class);
        this.w = z7b.getAccessor().d(vy1.class);
        this.x = z7b.getAccessor().d(x8c.class);
        this.y = hwf.t();
        this.z = hwf.t();
        this.A = new p87(p23.B(new tze[]{new Object(), new Object()}));
        i22 p2 = p();
        this.B = p2 != null && p2.G();
        i22 p3 = p();
        this.C = p3 != null && p3.a0();
        i22 p4 = p();
        this.D = (p4 == null || !p4.r()) ? false : z2;
        ez3.N(ez3.J(new ck5(new bc(new djc(new k72(new ik5(((aw2) ((bv2) c.getValue())).m(j), 2), (Continuation) null, this)), 9, this), new z62(this, (Continuation) null), 5), q().a()), ou3);
    }

    public static final void n(n72 n72) {
        qod D2 = xs7.D(n72.a, n72.q().b(), ru3.b, new c72(n72, (Continuation) null));
        n72.z.o1(n72, E[1], D2);
    }

    public static final rr4 o(n72 n72, i22 i22) {
        n72.getClass();
        String f = i22.f(fj0.c, ej0.a);
        long j = i22.b.a;
        i22.i0();
        return new rr4(f, j, i22.B0, i22.p(), (r33) null, i22.j(), i22.b.r0);
    }

    public final void a(int i) {
        xs7.E(this.a, q().a(), (ru3) null, new a72(i, this, (Continuation) null), 2);
    }

    public final void b() {
        k77[] k77Arr = E;
        k77 k77 = k77Arr[1];
        e3 e3Var = this.z;
        g37 g37 = (g37) e3Var.T0(this, k77);
        if (g37 != null) {
            g37.cancel((CancellationException) null);
        }
        e3Var.o1(this, k77Arr[1], (Object) null);
        k77 k772 = k77Arr[0];
        e3 e3Var2 = this.y;
        g37 g372 = (g37) e3Var2.T0(this, k772);
        if (g372 != null) {
            g372.cancel((CancellationException) null);
        }
        e3Var2.o1(this, k77Arr[0], (Object) null);
    }

    public final boolean d() {
        return this.p;
    }

    public final long e() {
        return this.n;
    }

    public final void g(int i) {
        xs7.E(this.a, q().a(), (ru3) null, new e72(i, this, (Continuation) null), 2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object h(java.lang.String r7, android.graphics.RectF r8, kotlin.coroutines.Continuation r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.f72
            if (r0 == 0) goto L_0x0013
            r0 = r9
            f72 r0 = (defpackage.f72) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            f72 r0 = new f72
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
            i22 r9 = r6.p()
            if (r9 != 0) goto L_0x003d
            return r3
        L_0x003d:
            d10 r8 = iu7.i(r8)
            java.util.concurrent.atomic.AtomicLong r2 = r6.m
            t97 r6 = r6.w
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n72.h(java.lang.String, android.graphics.RectF, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final jue i() {
        x7b x7b;
        i22 p2 = p();
        jue jue = jue.a;
        if (p2 == null) {
            return jue;
        }
        grd grd = this.b;
        x7b x7b2 = (x7b) grd.getValue();
        if (x7b2 != null) {
            x7b = x7b.a(x7b2, p2.b.b(fj0.c, ej0.a), false, 126);
        } else {
            x7b = null;
        }
        grd.setValue(x7b);
        return jue;
    }

    public final void j() {
        xs7.E(this.a, q().b(), (ru3) null, new g72(this, (Continuation) null), 2);
    }

    public final void k() {
        xs7.E(this.a, q().a(), (ru3) null, new h72(this, (Continuation) null), 2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object l(kotlin.coroutines.Continuation r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof defpackage.l72
            if (r0 == 0) goto L_0x0013
            r0 = r11
            l72 r0 = (defpackage.l72) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Y = r1
            goto L_0x0018
        L_0x0013:
            l72 r0 = new l72
            r0.<init>(r10, r11)
        L_0x0018:
            java.lang.Object r11 = r0.o
            pu3 r1 = pu3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L_0x0030
            if (r2 != r3) goto L_0x0028
            wx3.H(r11)
            goto L_0x00a3
        L_0x0028:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0030:
            wx3.H(r11)
            grd r11 = r10.j
            java.lang.Object r2 = r11.getValue()
            rr4 r2 = (defpackage.rr4) r2
            if (r2 != 0) goto L_0x0040
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            return r10
        L_0x0040:
            i22 r4 = r10.p()
            if (r4 != 0) goto L_0x0049
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            return r10
        L_0x0049:
            java.lang.Object r5 = r11.getValue()
            rr4 r5 = (defpackage.rr4) r5
            r6 = 0
            if (r5 == 0) goto L_0x0055
            java.lang.String r5 = r5.d
            goto L_0x0056
        L_0x0055:
            r5 = r6
        L_0x0056:
            if (r5 != 0) goto L_0x005a
            java.lang.String r5 = ""
        L_0x005a:
            p87 r7 = r10.A
            r8 = 3
            r33 r5 = r7.a(r8, r5)
            if (r5 != 0) goto L_0x0065
            r7 = r3
            goto L_0x0066
        L_0x0065:
            r7 = 0
        L_0x0066:
            java.lang.Object r8 = r11.getValue()
            rr4 r8 = (defpackage.rr4) r8
            if (r8 == 0) goto L_0x0075
            r9 = 111(0x6f, float:1.56E-43)
            rr4 r5 = defpackage.rr4.c(r8, r6, r5, r6, r9)
            goto L_0x0076
        L_0x0075:
            r5 = r6
        L_0x0076:
            r11.setValue(r5)
            ur4 r11 = r10.f()
            java.util.List r11 = r11.a(r10)
            grd r5 = r10.c
            r5.setValue(r11)
            if (r7 != 0) goto L_0x008b
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            return r10
        L_0x008b:
            pae r11 = r10.q()
            n3a r11 = (n3a) r11
            ju3 r11 = r11.b()
            m72 r5 = new m72
            r5.<init>(r2, r10, r4, r6)
            r0.Y = r3
            java.lang.Object r10 = xs7.U(r11, r5, r0)
            if (r10 != r1) goto L_0x00a3
            return r1
        L_0x00a3:
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n72.l(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void m(int i, String str) {
        rr4 rr4;
        grd grd = this.j;
        if (i == 131072) {
            rr4 rr42 = (rr4) grd.getValue();
            if (rr42 != null) {
                grd.m((Object) null, rr4.c(rr42, str, (r33) null, (String) null, 103));
            }
        } else if (i == 4 && (rr4 = (rr4) grd.getValue()) != null) {
            grd.m((Object) null, rr4.c(rr4, (String) null, (r33) null, str, 95));
        }
    }

    public final i22 p() {
        return (i22) ((aw2) ((bv2) this.r.getValue())).m(this.n).a.getValue();
    }

    public final pae q() {
        return (pae) this.s.getValue();
    }
}
