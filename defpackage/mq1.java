package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: mq1  reason: default package */
public final class mq1 implements jq1 {
    public static final /* synthetic */ k77[] f;
    public final ro1 a;
    public final t97 b;
    public final t97 c;
    public final t97 d;
    public final e3 e = hwf.t();

    static {
        hc9 hc9 = new hc9(mq1.class, "tokenRefreshJob", "getTokenRefreshJob()Lkotlinx/coroutines/Job;");
        m7c.a.getClass();
        f = new k77[]{hc9};
    }

    public mq1(ro1 ro1, t97 t97, t97 t972, t97 t973) {
        this.a = ro1;
        this.b = t97;
        this.c = t972;
        this.d = t973;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(kotlin.coroutines.Continuation r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof defpackage.kq1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            kq1 r0 = (defpackage.kq1) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            kq1 r0 = new kq1
            r0.<init>(r10, r11)
        L_0x0018:
            java.lang.Object r11 = r0.X
            pu3 r1 = defpackage.pu3.a
            int r2 = r0.Z
            java.lang.String r3 = "app.calls.update_time"
            r4 = 1
            java.lang.String r5 = "CallsCredRepositoryTag"
            if (r2 == 0) goto L_0x0036
            if (r2 != r4) goto L_0x002e
            mq1 r10 = r0.o
            defpackage.wx3.H(r11)
            goto L_0x00c4
        L_0x002e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0036:
            defpackage.wx3.H(r11)
            android.os.Looper r11 = android.os.Looper.getMainLooper()
            boolean r11 = r11.isCurrentThread()
            if (r11 == 0) goto L_0x0058
            t97 r11 = r10.d
            java.lang.Object r11 = r11.getValue()
            q0a r11 = (defpackage.q0a) r11
            r11.getClass()
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r2 = "Call token was called from the main thread."
            r11.<init>(r2)
            defpackage.udd.S(r5, r2, r11)
        L_0x0058:
            t97 r11 = r10.b
            java.lang.Object r2 = r11.getValue()
            f03 r2 = (f03) r2
            lqc r2 = (lqc) r2
            long r6 = r2.m()
            java.lang.Object r11 = r11.getValue()
            f03 r11 = (f03) r11
            lqc r11 = (lqc) r11
            x97 r11 = r11.g
            r8 = 0
            long r8 = r11.getLong(r3, r8)
            int r11 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r11 < 0) goto L_0x00fc
            t97 r11 = r10.c
            java.lang.Object r11 = r11.getValue()
            m1a r11 = (m1a) r11
            r0.o = r10
            r0.Z = r4
            t97 r2 = r11.a
            java.lang.Object r2 = r2.getValue()
            sce r2 = (sce) r2
            dt r4 = new dt
            t97 r6 = r11.c
            java.lang.Object r6 = r6.getValue()
            zy9 r6 = (zy9) r6
            java.lang.String r6 = r6.f()
            if (r6 == 0) goto L_0x00f0
            t97 r11 = r11.b
            java.lang.Object r11 = r11.getValue()
            f03 r11 = (f03) r11
            lqc r11 = (lqc) r11
            long r7 = r11.s()
            dfa r11 = dfa.A1
            r9 = 11
            r4.<init>(r11, r9)
            java.lang.String r11 = "value"
            r4.s(r11, r6)
            java.lang.String r11 = "userId"
            r4.n(r7, r11)
            java.lang.Object r11 = r2.e(r4, r0)
            if (r11 != r1) goto L_0x00c4
            return r1
        L_0x00c4:
            bl1 r11 = (bl1) r11
            t97 r0 = r10.b
            java.lang.Object r0 = r0.getValue()
            f03 r0 = (f03) r0
            java.lang.String r1 = r11.c
            lqc r0 = (lqc) r0
            java.lang.String r2 = "user.callsToken"
            r0.l(r2, r1)
            t97 r10 = r10.b
            java.lang.Object r10 = r10.getValue()
            f03 r10 = (f03) r10
            lqc r10 = (lqc) r10
            long r0 = r11.X
            java.lang.Long r11 = java.lang.Long.valueOf(r0)
            r10.k(r3, r11)
            java.lang.String r10 = "Calls token updated."
            defpackage.udd.p(r5, r10, new java.lang.Object[0])
            goto L_0x0112
        L_0x00f0:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "Required value was null."
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L_0x00fc:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "Calls token will be expired in "
            r10.<init>(r11)
            r10.append(r8)
            java.lang.String r11 = "."
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            defpackage.udd.p(r5, r10, new java.lang.Object[0])
        L_0x0112:
            jue r10 = defpackage.jue.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mq1.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void b() {
        k77[] k77Arr = f;
        k77 k77 = k77Arr[0];
        e3 e3Var = this.e;
        g37 g37 = (g37) e3Var.T0(this, k77);
        if (g37 == null || !g37.isActive()) {
            e3Var.o1(this, k77Arr[0], xs7.E(this.a, (hu3) null, (ru3) null, new lq1(this, (Continuation) null), 3));
        }
    }
}
