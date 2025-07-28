package defpackage;

import android.net.Uri;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: o42  reason: default package */
public final class o42 extends dz1 {
    public static final /* synthetic */ k77[] x;
    public final c8b j;
    public final t97 k;
    public final t97 l;
    public final t97 m;
    public final t97 n;
    public final t97 o;
    public final pj5 p;
    public final hcd q;
    public final s0c r;
    public final e3 s = hwf.t();
    public final AtomicLong t = new AtomicLong();
    public final AtomicLong u = new AtomicLong();
    public final AtomicLong v = new AtomicLong();
    public final AtomicBoolean w = new AtomicBoolean();

    static {
        k77 hc9 = new hc9(o42.class, "generateLinkJob", "getGenerateLinkJob()Lkotlinx/coroutines/Job;");
        m7c.a.getClass();
        x = new k77[]{hc9};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o42(long j2, ou3 ou3, c8b c8b) {
        super(j2, ou3);
        long j3 = j2;
        ou3 ou32 = ou3;
        z7b z7b = z7b.a;
        r7e d = z7b.d();
        r7e c = z7b.c();
        r7e d2 = z7b.getAccessor().d(gg7.class);
        r7e r7e = new r7e(new p22(4));
        t97 b = z7b.b();
        r7e r7e2 = new r7e(new p22(5));
        r7e d3 = z7b.getAccessor().d(ng0.class);
        this.j = c8b;
        this.k = d;
        this.l = c;
        this.m = d2;
        this.n = r7e;
        this.o = b;
        r7e r7e3 = d;
        this.p = ez3.J(new v11(new ik5(this.c, 2), this.d, j42.w0, 4), ((pae) r7e3.getValue()).a());
        hcd b2 = icd.b(0, 0, 0, 7);
        this.q = b2;
        this.r = new s0c(b2);
        ez3.N(ez3.J(new ck5(this.i, new s32(this, (Continuation) null), 5), ((pae) r7e3.getValue()).a()), ou32);
        ez3.N(ez3.J(new ck5(new e42(new ck5(new djc(new i42(new ik5(((aw2) ((bv2) c.getValue())).m(j3), 2), (Continuation) null, this)), new t32(this, (Continuation) null), 5), this, 0), new u32(this, (Continuation) null), 5), ((pae) r7e3.getValue()).b()), ou32);
        ez3.N(new ck5(new e42(((ng0) d3.getValue()).b, this, 1), new zv(2, this, o42.class, "handleError", "handleError(Lone/me/profileedit/screens/changelink/ChangeLinkErrors;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 2), 5), ou32);
        ez3.N(new ck5(new s0c(((p8b) r7e2.getValue()).a), new q32(this, j3, (Continuation) null), 5), ou32);
    }

    public static final void m(o42 o42, i22 i22) {
        o42.getClass();
        sz1 t2 = t(i22);
        o42.h.m((Object) null, t2);
        grd grd = o42.i;
        grd.m((Object) null, t2);
        sz1 sz1 = (sz1) grd.getValue();
        if ((sz1 != null ? sz1.b : null) == rz1.c) {
            grd.m((Object) null, t2);
        }
        o42.d(o42.s());
    }

    public static sz1 t(i22 i22) {
        String str;
        String str2;
        Object obj;
        Uri parse;
        m54 m54 = rz1.a;
        int i = i22.b.r0;
        if (i == 1) {
            str = "PUBLIC";
        } else if (i == 2) {
            str = "PRIVATE";
        } else {
            throw null;
        }
        m54.getClass();
        u1 it = rz1.X.iterator();
        while (true) {
            u1 u1Var = it;
            str2 = null;
            if (!u1Var.hasNext()) {
                obj = null;
                break;
            }
            obj = u1Var.next();
            if (hhd.f(((rz1) obj).name(), str)) {
                break;
            }
        }
        rz1 rz1 = (rz1) obj;
        if (rz1 == null) {
            rz1 = rz1.c;
        }
        rz1 rz12 = rz1.c;
        o62 o62 = i22.b;
        if (rz1 == rz12) {
            str2 = o62.I;
        } else {
            String str3 = o62.I;
            if (!(str3 == null || (parse = Uri.parse(str3)) == null)) {
                str2 = parse.getLastPathSegment();
            }
        }
        return new sz1(rz1, str2);
    }

    public final void a() {
        xs7.E(this.b, p().a(), (ru3) null, new w32(this, (Continuation) null), 2);
    }

    public final void b() {
        k77[] k77Arr = x;
        k77 k77 = k77Arr[0];
        e3 e3Var = this.s;
        g37 g37 = (g37) e3Var.T0(this, k77);
        if (g37 != null) {
            g37.cancel((CancellationException) null);
        }
        e3Var.o1(this, k77Arr[0], (Object) null);
    }

    public final Object c(Continuation continuation) {
        Object n2 = n(continuation);
        return n2 == pu3.a ? n2 : jue.a;
    }

    public final void e() {
        qod E = xs7.E(this.b, p().b(), (ru3) null, new y32(this, true, (Continuation) null), 2);
        this.s.o1(this, x[0], E);
    }

    public final pj5 f() {
        return this.p;
    }

    public final void g(int i) {
        xs7.E(this.b, (hu3) null, (ru3) null, new z32(i, this, (Continuation) null), 3);
    }

    public final void h(int i) {
        xs7.E(this.b, p().a(), (ru3) null, new a42(i, this, (Continuation) null), 2);
    }

    public final void i(int i) {
        xs7.E(this.b, p().a(), (ru3) null, new b42(i, this, (Continuation) null), 2);
    }

    public final Object j(Continuation continuation) {
        sz1 sz1;
        i22 o2 = o();
        jue jue = jue.a;
        if (o2 == null || (sz1 = (sz1) this.i.getValue()) == null) {
            return jue;
        }
        c8b c8b = c8b.CREATE;
        hcd hcd = this.f;
        pu3 pu3 = pu3.a;
        if (this.j == c8b && o2.G() && hhd.f(q(), Boolean.FALSE)) {
            Object a = hcd.a(new b6b(this.a), continuation);
            return a == pu3 ? a : jue;
        } else if (sz1.f) {
            Object a2 = hcd.a(new f6b(sz1.d, (Integer) null, 14), continuation);
            return a2 == pu3 ? a2 : jue;
        } else {
            Object U = xs7.U(p().b(), new k42(this, sz1, o2, (Continuation) null), continuation);
            return U == pu3 ? U : jue;
        }
    }

    public final void k(String str) {
        xs7.E(this.b, p().c().getImmediate(), (ru3) null, new n42(this, str, (Continuation) null), 2);
    }

    public final void l(int i) {
        int i2 = f8a.i0;
        grd grd = this.i;
        grd grd2 = this.h;
        if (i == i2) {
            sz1 sz1 = (sz1) grd2.getValue();
            rz1 rz1 = sz1 != null ? sz1.b : null;
            rz1 rz12 = rz1.c;
            grd.setValue(rz1 == rz12 ? (sz1) grd2.getValue() : new sz1(rz12, (String) null));
        } else if (i == f8a.j0) {
            sz1 sz12 = (sz1) grd2.getValue();
            rz1 rz13 = sz12 != null ? sz12.b : null;
            rz1 rz14 = rz1.b;
            grd.setValue(rz13 == rz14 ? (sz1) grd2.getValue() : new sz1(rz14, (String) null));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object n(kotlin.coroutines.Continuation r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof defpackage.x32
            if (r0 == 0) goto L_0x0013
            r0 = r12
            x32 r0 = (defpackage.x32) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            x32 r0 = new x32
            r0.<init>(r11, r12)
        L_0x0018:
            java.lang.Object r12 = r0.X
            pu3 r1 = pu3.a
            int r2 = r0.Z
            jue r3 = jue.a
            r4 = 6
            r5 = 0
            r6 = 4
            r7 = 3
            r8 = 2
            r9 = 1
            if (r2 == 0) goto L_0x004e
            if (r2 == r9) goto L_0x0047
            if (r2 == r8) goto L_0x0042
            if (r2 == r7) goto L_0x003c
            if (r2 != r6) goto L_0x0034
            wx3.H(r12)
            goto L_0x00a3
        L_0x0034:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x003c:
            o42 r11 = r0.o
            wx3.H(r12)
            goto L_0x007d
        L_0x0042:
            wx3.H(r12)
            goto L_0x00f0
        L_0x0047:
            o42 r11 = r0.o
            wx3.H(r12)
            goto L_0x00ca
        L_0x004e:
            wx3.H(r12)
            grd r12 = r11.i
            java.lang.Object r12 = r12.getValue()
            sz1 r12 = (defpackage.sz1) r12
            if (r12 != 0) goto L_0x005c
            return r3
        L_0x005c:
            rz1 r2 = r12.b
            int r2 = r2.ordinal()
            hcd r10 = r11.f
            java.lang.String r12 = r12.c
            if (r2 == 0) goto L_0x00aa
            if (r2 != r9) goto L_0x00a4
            if (r12 != 0) goto L_0x006d
            return r3
        L_0x006d:
            z5b r2 = new z5b
            r2.<init>(r12)
            r0.o = r11
            r0.Z = r7
            java.lang.Object r12 = r10.a(r2, r0)
            if (r12 != r1) goto L_0x007d
            return r1
        L_0x007d:
            boolean r12 = hhd.y()
            if (r12 == 0) goto L_0x00f0
            hcd r11 = r11.f
            f6b r12 = new f6b
            int r2 = defpackage.i8a.m2
            hge r7 = new hge
            r7.<init>(r2)
            int r2 = defpackage.phc.t
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r2)
            r12.<init>(r7, r8, r4)
            r0.o = r5
            r0.Z = r6
            java.lang.Object r11 = r11.a(r12, r0)
            if (r11 != r1) goto L_0x00a3
            return r1
        L_0x00a3:
            return r3
        L_0x00a4:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
        L_0x00aa:
            z5b r2 = new z5b
            t97 r6 = r11.m
            java.lang.Object r6 = r6.getValue()
            gg7 r6 = (defpackage.gg7) r6
            java.lang.String r6 = r6.e
            java.lang.String r7 = "/"
            java.lang.String r12 = defpackage.me4.i(r6, r7, r12)
            r2.<init>(r12)
            r0.o = r11
            r0.Z = r9
            java.lang.Object r12 = r10.a(r2, r0)
            if (r12 != r1) goto L_0x00ca
            return r1
        L_0x00ca:
            boolean r12 = hhd.y()
            if (r12 == 0) goto L_0x00f0
            hcd r11 = r11.f
            f6b r12 = new f6b
            int r2 = defpackage.i8a.r2
            hge r6 = new hge
            r6.<init>(r2)
            int r2 = defpackage.phc.t
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r2)
            r12.<init>(r6, r7, r4)
            r0.o = r5
            r0.Z = r8
            java.lang.Object r11 = r11.a(r12, r0)
            if (r11 != r1) goto L_0x00f0
            return r1
        L_0x00f0:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o42.n(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final i22 o() {
        return (i22) ((aw2) ((bv2) this.l.getValue())).m(this.a).a.getValue();
    }

    public final pae p() {
        return (pae) this.k.getValue();
    }

    public final Boolean q() {
        sz1 sz1 = (sz1) this.h.getValue();
        if (sz1 != null) {
            return Boolean.valueOf(sz1.b((uz1) this.i.getValue()));
        }
        return null;
    }

    public final Object r(iz1 iz1, Continuation continuation) {
        boolean f = hhd.f(iz1, fz1.a);
        jue jue = jue.a;
        pu3 pu3 = pu3.a;
        hcd hcd = this.f;
        if (f) {
            Object a = hcd.a(new f6b(new hge(i8a.i2), new hge(i8a.g2), true, new Integer(phc.J)), continuation);
            return a == pu3 ? a : jue;
        } else if (hhd.f(iz1, gz1.a)) {
            Object a2 = hcd.a(new f6b(new hge(i8a.j2), new hge(i8a.h2), true, new Integer(phc.J)), continuation);
            return a2 == pu3 ? a2 : jue;
        } else if (iz1 instanceof ez1) {
            Object a3 = hcd.a(new f6b(((ez1) iz1).a, (Integer) null, 14), continuation);
            return a3 == pu3 ? a3 : jue;
        } else if (iz1 instanceof hz1) {
            Object a4 = hcd.a(new f6b(((hz1) iz1).a, (Integer) null, 14), continuation);
            return a4 == pu3 ? a4 : jue;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final cz1 s() {
        i22 o2 = o();
        return new cz1(new qz1((o2 == null || !o2.G()) ? i8a.d2 : i8a.X1, false, true, false), ((jz1) this.g.getValue()).a(this));
    }
}
