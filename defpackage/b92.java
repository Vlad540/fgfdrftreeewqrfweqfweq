package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: b92  reason: default package */
public final class b92 implements v72, pp7 {
    public static final String O0 = m7c.a(b92.class).b();
    public final t97 A0;
    public final ajb B0;
    public qod C0;
    public qod D0;
    public c97 E0;
    public final r7e F0;
    public final tc9 G0;
    public volatile ep5 H0;
    public final AtomicBoolean I0;
    public final ConcurrentHashMap J0;
    public final r7e K0;
    public qod L0;
    public g37 M0;
    public final AtomicBoolean N0;
    public final grd X;
    public final hu3 Y;
    public final ContextScope Z;
    public final t97 a;
    public final r7e b;
    public final t97 c;
    public final t97 o;
    public final t97 w0;
    public ConcurrentHashMap x0 = new ConcurrentHashMap();
    public final HashMap y0 = new HashMap();
    public final t97 z0;

    public b92(t97 t97, t97 t972, t97 t973, t97 t974, t97 t975, tt0 tt0, t97 t976, t97 t977, g15 g15, t97 t978) {
        this.a = t976;
        r7e r7e = new r7e(new xq(9, t973));
        this.b = r7e;
        this.c = t972;
        this.o = t978;
        grd a2 = hrd.a((Object) null);
        this.X = a2;
        hu3 plus = ((ju3) r7e.getValue()).plus(sk9.a);
        this.Y = plus;
        ContextScope a3 = n1g.a(plus.plus(new qj(g15)));
        this.Z = a3;
        this.w0 = ez3.O(2, new xq(10, t97));
        this.z0 = t974;
        this.A0 = t975;
        this.B0 = new ajb();
        this.F0 = new r7e(new w72(this, 0));
        this.G0 = uc9.a();
        this.I0 = new AtomicBoolean(false);
        this.J0 = new ConcurrentHashMap();
        this.K0 = new r7e(new w72(this, 1));
        this.N0 = new AtomicBoolean(false);
        i();
        h();
        tt0.d(new x72(this));
        ez3.N(new ck5(new ik5(a2, 2), new y72(t977, (Continuation) null), 5), a3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object b(defpackage.b92 r7, java.util.ArrayList r8, boolean r9, kotlin.coroutines.Continuation r10) {
        /*
            r7.getClass()
            boolean r0 = r10 instanceof defpackage.s82
            if (r0 == 0) goto L_0x0016
            r0 = r10
            s82 r0 = (defpackage.s82) r0
            int r1 = r0.y0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.y0 = r1
            goto L_0x001b
        L_0x0016:
            s82 r0 = new s82
            r0.<init>(r7, r10)
        L_0x001b:
            java.lang.Object r10 = r0.w0
            pu3 r1 = pu3.a
            int r2 = r0.y0
            r3 = 1
            if (r2 == 0) goto L_0x003e
            if (r2 != r3) goto L_0x0036
            java.util.Iterator r7 = r0.Z
            java.util.Collection r8 = r0.Y
            java.util.Comparator r9 = r0.X
            b92 r2 = r0.o
            wx3.H(r10)
            r6 = r0
            r0 = r8
            r8 = r2
        L_0x0034:
            r2 = r6
            goto L_0x008c
        L_0x0036:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003e:
            wx3.H(r10)
            boolean r10 = r8.isEmpty()
            if (r10 == 0) goto L_0x004a
            hw4 r1 = hw4.a
            goto L_0x009c
        L_0x004a:
            if (r9 == 0) goto L_0x004f
            yz r9 = defpackage.t52.J
            goto L_0x0051
        L_0x004f:
            yz r9 = defpackage.t52.I
        L_0x0051:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r8 = r8.iterator()
            r6 = r8
            r8 = r7
            r7 = r6
        L_0x005d:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x0096
            java.lang.Object r2 = r7.next()
            java.lang.Number r2 = (java.lang.Number) r2
            long r4 = r2.longValue()
            t97 r2 = r8.z0
            java.lang.Object r2 = r2.getValue()
            bv2 r2 = (defpackage.bv2) r2
            r0.o = r8
            r0.X = r9
            r0.Y = r10
            r0.Z = r7
            r0.y0 = r3
            aw2 r2 = (defpackage.aw2) r2
            java.lang.Object r2 = r2.k(r4, r0)
            if (r2 != r1) goto L_0x0088
            goto L_0x009c
        L_0x0088:
            r6 = r0
            r0 = r10
            r10 = r2
            goto L_0x0034
        L_0x008c:
            i22 r10 = (defpackage.i22) r10
            if (r10 == 0) goto L_0x0093
            r0.add(r10)
        L_0x0093:
            r10 = r0
            r0 = r2
            goto L_0x005d
        L_0x0096:
            java.util.List r10 = (java.util.List) r10
            java.util.List r1 = o23.m0(r10, r9)
        L_0x009c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b92.b(b92, java.util.ArrayList, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static Object j(b92 b92, List list, boolean z, Continuation continuation) {
        b92.getClass();
        Object f = n1g.f(new t82(b92, list, z, (s16) null, (Continuation) null), continuation);
        return f == pu3.a ? f : jue.a;
    }

    public final void a() {
        udd.q(O0, "onLogout");
        this.X.m((Object) null, hw4.a);
        qod qod = this.L0;
        if (qod != null) {
            qod.cancel((CancellationException) null);
        }
        qod qod2 = this.C0;
        if (qod2 != null) {
            qod2.cancel((CancellationException) null);
        }
        qod qod3 = this.D0;
        if (qod3 != null) {
            qod3.cancel((CancellationException) null);
        }
        c97 c97 = this.E0;
        if (c97 != null) {
            bj4.a(c97);
        }
        this.x0.clear();
        this.y0.clear();
        xs7.N(new n82(this, (Continuation) null));
    }

    public final Object c(String str, Continuation continuation) {
        Object U = xs7.U(this.Y, new c82(this, str, (Continuation) null), continuation);
        return U == pu3.a ? U : jue.a;
    }

    public final Object d(String str, Continuation continuation) {
        boolean f = hhd.f(str, "all.chat.folder");
        hu3 hu3 = this.Y;
        return f ? xs7.U(hu3, new f82(this, (Continuation) null), continuation) : xs7.U(hu3, new g82(this, str, (Continuation) null), continuation);
    }

    public final udc e() {
        return (udc) this.w0.getValue();
    }

    public final void f(List list, Set set) {
        g37 g37 = this.M0;
        if (g37 == null || (g37.isCompleted() && !this.N0.get())) {
            this.D0 = xs7.E(this.Z, (hu3) null, (ru3) null, new k82(this, list, set, (Continuation) null), 3);
        }
    }

    public final ik5 g() {
        return new ik5(new t0c(this.X), 2);
    }

    public final void h() {
        c97 c97 = this.E0;
        if (c97 != null) {
            bj4.a(c97);
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        ajb ajb = this.B0;
        ajb.getClass();
        qmc a2 = cnc.a();
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(a2, "scheduler is null");
        kv9 kv9 = new kv9(ajb, 1, timeUnit, a2, true);
        c97 c972 = new c97(new lv1(9, (Object) this), z3d.k, z3d.i);
        kv9.a(c972);
        this.E0 = c972;
    }

    public final void i() {
        qod qod = this.C0;
        if (qod != null) {
            qod.cancel((CancellationException) null);
        }
        udc e = e();
        e.getClass();
        sdc sdc = new sdc(e, pec.a(0, "SELECT * FROM chat_folder"), 0);
        this.C0 = ez3.N(new ck5(new zi1(ez3.J(new djc(new yu3(e.a, new String[]{"chat_folder"}, sdc, (Continuation) null)), (ju3) this.b.getValue()), 6), new r82(this, (Continuation) null), 5), this.Z);
    }

    public final void k(long j, i22 i22) {
        qod qod = this.L0;
        if (qod != null) {
            qod.cancel((CancellationException) null);
        }
        w82 w82 = new w82(this, j, i22, (Continuation) null);
        this.L0 = xs7.E(this.Z, this.Y, (ru3) null, w82, 2);
    }
}
