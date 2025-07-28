package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: vk0  reason: default package */
public final class vk0 implements ck8 {
    public final long a;
    public final ch2 b;
    public final pae c;
    public final t97 d;
    public final t97 e;
    public final t97 f;
    public final ContextScope g;
    public final grd h;
    public final t0c i;
    public final grd j;
    public final t0c k;
    public final AtomicLong l = new AtomicLong(0);
    public final AtomicBoolean m = new AtomicBoolean(false);

    public vk0(long j2, ch2 ch2, pae pae, t97 t97, t97 t972, t97 t973, t97 t974) {
        pae pae2 = pae;
        t97 t975 = t97;
        this.a = j2;
        this.b = ch2;
        this.c = pae2;
        this.d = t973;
        this.e = t972;
        this.f = t975;
        n3a n3a = (n3a) pae2;
        ContextScope a2 = n1g.a(n3a.b());
        this.g = a2;
        grd a3 = hrd.a(hw4.a);
        this.h = a3;
        this.i = new t0c(a3);
        grd a4 = hrd.a((Object) null);
        this.j = a4;
        grd a5 = hrd.a((Object) null);
        this.k = new t0c(a5);
        xs7.E(a2, (hu3) null, (ru3) null, new pk0(t975, this, t974, (Continuation) null), 3);
        ez3.N(ez3.J(new ck5(new bc(ez3.z(ez3.x(a4, 200)), 3, this), new zv(2, a5, mc9.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 1), 5), n3a.b()), a2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a4 A[LOOP:0: B:24:0x009e->B:26:0x00a4, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.io.Serializable f(defpackage.vk0 r15, java.lang.String r16, long r17, kotlin.coroutines.Continuation r19) {
        /*
            r0 = r15
            r1 = r19
            r15.getClass()
            boolean r2 = r1 instanceof defpackage.sk0
            if (r2 == 0) goto L_0x0019
            r2 = r1
            sk0 r2 = (defpackage.sk0) r2
            int r3 = r2.Z
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0019
            int r3 = r3 - r4
            r2.Z = r3
            goto L_0x001e
        L_0x0019:
            sk0 r2 = new sk0
            r2.<init>(r15, r1)
        L_0x001e:
            java.lang.Object r1 = r2.X
            pu3 r11 = pu3.a
            int r3 = r2.Z
            r12 = 2
            r4 = 1
            r13 = 0
            if (r3 == 0) goto L_0x0046
            if (r3 == r4) goto L_0x003e
            if (r3 != r12) goto L_0x0036
            java.lang.Object r0 = r2.o
            dh2 r0 = (defpackage.dh2) r0
            wx3.H(r1)
            goto L_0x00c5
        L_0x0036:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003e:
            java.lang.Object r0 = r2.o
            vk0 r0 = (defpackage.vk0) r0
            wx3.H(r1)
            goto L_0x0085
        L_0x0046:
            wx3.H(r1)
            t97 r1 = r0.f
            java.lang.Object r1 = r1.getValue()
            bv2 r1 = (defpackage.bv2) r1
            long r5 = r0.a
            aw2 r1 = (defpackage.aw2) r1
            t0c r1 = r1.m(r5)
            zqd r1 = r1.a
            java.lang.Object r1 = r1.getValue()
            i22 r1 = (defpackage.i22) r1
            if (r1 == 0) goto L_0x0089
            o62 r1 = r1.b
            long r5 = r1.a
            t97 r1 = r0.d
            java.lang.Object r1 = r1.getValue()
            r3 = r1
            v86 r3 = (defpackage.v86) r3
            r2.o = r0
            r2.Z = r4
            ch2 r1 = r0.b
            r4 = r5
            r6 = r1
            r7 = r17
            r9 = r16
            r10 = r2
            java.lang.Object r1 = r3.a(r4, r6, r7, r9, r10)
            if (r1 != r11) goto L_0x0085
            goto L_0x00f3
        L_0x0085:
            dh2 r1 = (defpackage.dh2) r1
            if (r1 != 0) goto L_0x008b
        L_0x0089:
            r11 = r13
            goto L_0x00f3
        L_0x008b:
            java.util.ArrayList r3 = r1.c
            if (r3 == 0) goto L_0x0089
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = q23.H(r3, r5)
            r4.<init>(r5)
            java.util.Iterator r3 = r3.iterator()
        L_0x009e:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x00b7
            java.lang.Object r5 = r3.next()
            bh2 r5 = (defpackage.bh2) r5
            uj3 r5 = r5.a
            long r5 = r5.a
            java.lang.Long r7 = new java.lang.Long
            r7.<init>(r5)
            r4.add(r7)
            goto L_0x009e
        L_0x00b7:
            r2.o = r1
            r2.Z = r12
            java.lang.Object r0 = r0.g(r4, r2)
            if (r0 != r11) goto L_0x00c2
            goto L_0x00f3
        L_0x00c2:
            r14 = r1
            r1 = r0
            r0 = r14
        L_0x00c5:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x00d0:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x00e7
            java.lang.Object r3 = r1.next()
            r4 = r3
            tf3 r4 = (defpackage.tf3) r4
            boolean r4 = r4.w()
            if (r4 != 0) goto L_0x00d0
            r2.add(r3)
            goto L_0x00d0
        L_0x00e7:
            long r0 = r0.o
            java.lang.Long r3 = new java.lang.Long
            r3.<init>(r0)
            wia r11 = new wia
            r11.<init>(r3, r2)
        L_0x00f3:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vk0.f(vk0, java.lang.String, long, kotlin.coroutines.Continuation):java.io.Serializable");
    }

    public final void a(String str) {
        this.j.setValue(str);
    }

    public final pj5 b() {
        return this.k;
    }

    public final boolean c() {
        return this.l.get() != -1 || !this.m.get();
    }

    public final t0c d() {
        return this.i;
    }

    public final void e() {
        if (this.m.compareAndSet(false, true)) {
            xs7.E(this.g, (hu3) null, (ru3) null, new tk0(this, (Continuation) null), 3).invokeOnCompletion(new l(13, this));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object g(java.util.ArrayList r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.rk0
            if (r0 == 0) goto L_0x0013
            r0 = r9
            rk0 r0 = (defpackage.rk0) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Y = r1
            goto L_0x0018
        L_0x0013:
            rk0 r0 = new rk0
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.o
            pu3 r1 = pu3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            wx3.H(r9)
            goto L_0x0073
        L_0x0027:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x002f:
            wx3.H(r9)
            pae r9 = r7.c
            n3a r9 = (n3a) r9
            ju3 r9 = r9.a()
            if (r9 != 0) goto L_0x003e
            hu3 r9 = r0.b
        L_0x003e:
            kotlinx.coroutines.internal.ContextScope r9 = n1g.a(r9)
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 10
            int r4 = q23.H(r8, r4)
            r2.<init>(r4)
            java.util.Iterator r8 = r8.iterator()
        L_0x0051:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L_0x006a
            java.lang.Object r4 = r8.next()
            qk0 r5 = new qk0
            r6 = 0
            r5.<init>(r4, r6, r7)
            r4 = 3
            zc4 r4 = xs7.d(r9, r6, r5, r4)
            r2.add(r4)
            goto L_0x0051
        L_0x006a:
            r0.Y = r3
            java.lang.Object r9 = lp.c(r2, r0)
            if (r9 != r1) goto L_0x0073
            return r1
        L_0x0073:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.List r7 = o23.T(r9)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vk0.g(java.util.ArrayList, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
