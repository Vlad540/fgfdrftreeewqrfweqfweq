package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: lp5  reason: default package */
public final class lp5 {
    public final String a;
    public final tr2 b;
    public final v72 c;
    public final grd d;
    public final ik5 e;
    public final AtomicInteger f;
    public final grd g;
    public final String h;

    public lp5(String str, tr2 tr2, v72 v72, tt0 tt0, ju3 ju3) {
        this.a = str;
        this.b = tr2;
        this.c = v72;
        grd a2 = hrd.a((Object) null);
        this.d = a2;
        this.e = new ik5(new t0c(a2), 2);
        ContextScope a3 = n1g.a(ju3);
        AtomicInteger atomicInteger = new AtomicInteger(0);
        this.f = atomicInteger;
        pj5 a4 = hrd.a(Integer.valueOf(atomicInteger.get()));
        this.g = a4;
        this.h = rf0.h("FolderCountersDataSource-", str);
        tt0.d(this);
        kf4 kf4 = new kf4(new pj5[]{((b92) v72).g(), a4}, 1);
        int i = zp4.o;
        ez3.N(new ck5(vx3.M(kf4, mt0.P(1000, eq4.c)), new jp5(this, (Continuation) null), 5), a3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(defpackage.lp5 r12, kotlin.coroutines.Continuation r13) {
        /*
            r12.getClass()
            boolean r0 = r13 instanceof defpackage.kp5
            if (r0 == 0) goto L_0x0016
            r0 = r13
            kp5 r0 = (defpackage.kp5) r0
            int r1 = r0.w0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.w0 = r1
            goto L_0x001b
        L_0x0016:
            kp5 r0 = new kp5
            r0.<init>(r12, r13)
        L_0x001b:
            java.lang.Object r13 = r0.Y
            pu3 r1 = pu3.a
            int r2 = r0.w0
            jue r3 = jue.a
            r4 = 1
            r5 = 2
            if (r2 == 0) goto L_0x0042
            if (r2 == r4) goto L_0x003c
            if (r2 != r5) goto L_0x0034
            or2 r12 = r0.X
            lp5 r0 = r0.o
            wx3.H(r13)
            r5 = r12
            goto L_0x0094
        L_0x0034:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x003c:
            lp5 r12 = r0.o
            wx3.H(r13)
            goto L_0x005e
        L_0x0042:
            wx3.H(r13)
            java.lang.String r13 = r12.h
            java.lang.String r2 = "updateCounter"
            udd.q(r13, r2)
            v72 r13 = r12.c
            java.lang.String r2 = r12.a
            r0.o = r12
            r0.w0 = r4
            b92 r13 = (defpackage.b92) r13
            java.lang.Object r13 = r13.d(r2, r0)
            if (r13 != r1) goto L_0x005e
            goto L_0x0113
        L_0x005e:
            ep5 r13 = (defpackage.ep5) r13
            if (r13 != 0) goto L_0x0065
        L_0x0062:
            r1 = r3
            goto L_0x0113
        L_0x0065:
            boolean r2 = r13.b()
            if (r2 == 0) goto L_0x006e
            mr2 r13 = defpackage.mr2.a
            goto L_0x007f
        L_0x006e:
            nr2 r2 = new nr2
            java.util.Set r7 = r13.z0
            java.util.Set r8 = r13.Y
            java.util.Set r9 = r13.A0
            java.util.Set r10 = r13.B0
            java.util.Map r11 = r13.E0
            r6 = r2
            r6.<init>(r7, r8, r9, r10, r11)
            r13 = r2
        L_0x007f:
            tr2 r2 = r12.b
            r0.o = r12
            r0.X = r13
            r0.w0 = r5
            aw2 r2 = (defpackage.aw2) r2
            java.lang.Object r0 = r2.r(r13)
            if (r0 != r1) goto L_0x0091
            goto L_0x0113
        L_0x0091:
            r5 = r13
            r13 = r0
            r0 = r12
        L_0x0094:
            java.util.List r13 = (java.util.List) r13
            tr2 r12 = r0.b
            r4 = r12
            aw2 r4 = (defpackage.aw2) r4
            r8 = 0
            r9 = 2147483647(0x7fffffff, float:NaN)
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.util.List r12 = r4.s(r5, r6, r8, r9)
            java.util.ArrayList r12 = o23.i0(r13, r12)
            boolean r13 = r12.isEmpty()
            r1 = 0
            r2 = 0
            if (r13 == 0) goto L_0x00b5
            goto L_0x00d4
        L_0x00b5:
            java.util.Iterator r12 = r12.iterator()
        L_0x00b9:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x00d4
            java.lang.Object r13 = r12.next()
            i22 r13 = (defpackage.i22) r13
            o62 r13 = r13.b
            int r13 = r13.m
            if (r13 <= 0) goto L_0x00b9
            int r2 = r2 + 1
            if (r2 < 0) goto L_0x00d0
            goto L_0x00b9
        L_0x00d0:
            p23.F()
            throw r1
        L_0x00d4:
            java.lang.String r12 = r0.h
            fn6 r13 = udd.e
            if (r13 != 0) goto L_0x00db
            goto L_0x0102
        L_0x00db:
            boolean r4 = r13.c()
            if (r4 == 0) goto L_0x0102
            tn7 r4 = defpackage.tn7.X
            grd r5 = r0.d
            java.lang.Object r5 = r5.getValue()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "updateCounter: unreadChatsCount = "
            r6.<init>(r7)
            r6.append(r2)
            java.lang.String r7 = ", old = "
            r6.append(r7)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r13.d(r4, r12, r5, r1)
        L_0x0102:
            grd r12 = r0.d
            if (r2 > 0) goto L_0x0109
            dv3 r13 = defpackage.dv3.b
            goto L_0x010e
        L_0x0109:
            dv3 r13 = new dv3
            r13.<init>(r2)
        L_0x010e:
            r12.m(r1, r13)
            goto L_0x0062
        L_0x0113:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lp5.a(lp5, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void b() {
        this.g.m((Object) null, Integer.valueOf(this.f.incrementAndGet()));
    }

    @a1e
    public final void onEvent(mw2 mw2) {
        b();
    }

    @a1e
    public final void onEvent(gv6 gv6) {
        b();
    }

    @a1e
    public final void onEvent(to7 to7) {
        b();
    }
}
