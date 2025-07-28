package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: yh3  reason: default package */
public final class yh3 extends dz1 {
    public final t97 j;
    public final t97 k;
    public final t97 l;
    public final pj5 m;
    public final hcd n;
    public final s0c o;
    public final AtomicLong p = new AtomicLong();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yh3(long j2, ou3 ou3) {
        super(j2, ou3);
        ou3 ou32 = ou3;
        z7b z7b = z7b.a;
        r7e d = z7b.d();
        r7e d2 = z7b.getAccessor().d(ap3.class);
        r7e r7e = new r7e(new xd3(1));
        t97 b = z7b.b();
        r7e r7e2 = new r7e(new xd3(2));
        r7e d3 = z7b.getAccessor().d(ng0.class);
        this.j = d;
        this.k = r7e;
        this.l = b;
        r7e r7e3 = d;
        this.m = ez3.J(new v11(new ik5(this.c, 2), this.d, th3.w0, 4), ((pae) r7e3.getValue()).a());
        hcd b2 = icd.b(0, 0, 0, 7);
        this.n = b2;
        this.o = new s0c(b2);
        ez3.N(ez3.J(new ck5(this.i, new lh3(this, (Continuation) null), 5), ((pae) r7e3.getValue()).a()), ou32);
        ez3.N(ez3.J(new ck5(new ph3(new djc(new sh3(new ik5(((ap3) d2.getValue()).c(j2), 2), (Continuation) null, this)), this, 0), new hp0(2, this, yh3.class, "emitState", "emitState(Lone/me/profileedit/screens/changelink/ChangeLink$State;)V", 4, 11), 5), ((pae) r7e3.getValue()).b()), ou32);
        ez3.N(new ck5(new ph3(((ng0) d3.getValue()).b, this, 1), new zv(2, this, yh3.class, "handleError", "handleError(Lone/me/profileedit/screens/changelink/ChangeLinkErrors;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 16), 5), ou32);
        ez3.N(new ck5(new s0c(((p8b) r7e2.getValue()).a), new mh3(this, (Continuation) null), 5), ou32);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        r7 = android.net.Uri.parse(r7);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final defpackage.tz1 m(defpackage.yh3 r6, defpackage.tf3 r7) {
        /*
            r6.getClass()
            tz1 r6 = new tz1
            oi3 r7 = r7.a
            ni3 r7 = r7.c
            java.lang.String r7 = r7.p
            if (r7 == 0) goto L_0x0019
            android.net.Uri r7 = android.net.Uri.parse(r7)
            if (r7 == 0) goto L_0x0019
            java.lang.String r7 = r7.getLastPathSegment()
        L_0x0017:
            r2 = r7
            goto L_0x001b
        L_0x0019:
            r7 = 0
            goto L_0x0017
        L_0x001b:
            int r1 = defpackage.i8a.f2
            r3 = 0
            r4 = 0
            r5 = 0
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yh3.m(yh3, tf3):tz1");
    }

    public final void b() {
    }

    public final pj5 f() {
        return this.m;
    }

    public final Object j(Continuation continuation) {
        tz1 tz1 = (tz1) this.i.getValue();
        jue jue = jue.a;
        if (tz1 == null) {
            return jue;
        }
        pu3 pu3 = pu3.a;
        if (tz1.e) {
            Object a = this.f.a(new f6b(tz1.c, (Integer) null, 14), continuation);
            return a == pu3 ? a : jue;
        }
        String str = tz1.b;
        String obj = str != null ? h0e.B0(str).toString() : null;
        if (obj == null || obj.length() == 0) {
            str = "$REMOVE$";
        }
        Object U = xs7.U(((pae) this.j.getValue()).b(), new uh3(this, str, (Continuation) null), continuation);
        return U == pu3 ? U : jue;
    }

    public final void k(String str) {
        xs7.E(this.b, ((pae) this.j.getValue()).c().getImmediate(), (ru3) null, new xh3(this, str, (Continuation) null), 2);
    }

    public final Object n(iz1 iz1, Continuation continuation) {
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
}
