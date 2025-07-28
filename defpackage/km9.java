package defpackage;

import kotlinx.coroutines.internal.ContextScope;

/* renamed from: km9  reason: default package */
public final class km9 {
    public static final /* synthetic */ int h = 0;
    public final t97 a;
    public final t97 b;
    public final t97 c;
    public final t97 d;
    public final t97 e;
    public final t97 f;
    public final ContextScope g;

    public km9(t97 t97, t97 t972, t97 t973, t97 t974, t97 t975, t97 t976, pae pae, ku3 ku3) {
        this.a = t97;
        this.b = t972;
        this.c = t973;
        this.d = t974;
        this.e = t975;
        this.f = t976;
        this.g = n1g.a(((n3a) pae).b().limitedParallelism(1, "notif-msg-delayed-logic").plus(ku3));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(defpackage.km9 r30, long r31, defpackage.ym8 r33, kotlin.coroutines.Continuation r34) {
        /*
            r0 = r30
            r1 = r34
            boolean r2 = r1 instanceof defpackage.jm9
            if (r2 == 0) goto L_0x0017
            r2 = r1
            jm9 r2 = (defpackage.jm9) r2
            int r3 = r2.w0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.w0 = r3
            goto L_0x001c
        L_0x0017:
            jm9 r2 = new jm9
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.Y
            pu3 r3 = pu3.a
            int r4 = r2.w0
            r5 = 1
            if (r4 == 0) goto L_0x0039
            if (r4 != r5) goto L_0x0031
            ym8 r0 = r2.X
            km9 r2 = r2.o
            wx3.H(r1)
            r7 = r0
            r0 = r2
            goto L_0x0050
        L_0x0031:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0039:
            wx3.H(r1)
            r2.o = r0
            r1 = r33
            r2.X = r1
            r2.w0 = r5
            r4 = r31
            java.lang.Object r2 = r0.c(r4, r2)
            if (r2 != r3) goto L_0x004e
            goto L_0x00de
        L_0x004e:
            r7 = r1
            r1 = r2
        L_0x0050:
            i22 r1 = (defpackage.i22) r1
            jue r8 = jue.a
            if (r1 != 0) goto L_0x0059
        L_0x0056:
            r3 = r8
            goto L_0x00de
        L_0x0059:
            t97 r2 = r0.d
            java.lang.Object r2 = r2.getValue()
            di3 r2 = (defpackage.di3) r2
            long r3 = r7.o
            r5 = 0
            tf3 r2 = r2.i(r3, r5)
            r9 = 0
            if (r2 == 0) goto L_0x0070
            java.lang.String r2 = r2.d()
            goto L_0x0071
        L_0x0070:
            r2 = r9
        L_0x0071:
            java.lang.String r10 = ""
            if (r2 != 0) goto L_0x0078
            r18 = r10
            goto L_0x007a
        L_0x0078:
            r18 = r2
        L_0x007a:
            tlc r12 = new tlc
            o62 r2 = r1.b
            long r13 = r2.a
            java.lang.String r17 = r1.p()
            r1 = r12
            r2 = r13
            r4 = r17
            r5 = r7
            r6 = r18
            r1.<init>(r2, r4, r5, r6)
            t97 r0 = r0.e
            java.lang.Object r0 = r0.getValue()
            hjb r0 = (defpackage.hjb) r0
            r0.getClass()
            java.lang.Object[] r1 = new java.lang.Object[]{r12}
            java.lang.String r2 = "hjb"
            java.lang.String r3 = "handleScheduledMessageNotification %s"
            udd.p(r2, r3, r1)
            long r1 = r7.a
            boolean r1 = r0.d(r13, r1)
            if (r1 == 0) goto L_0x00ad
            goto L_0x0056
        L_0x00ad:
            gb5 r16 = defpackage.gb5.SCHEDULED
            java.lang.String r1 = r12.a
            if (r1 != 0) goto L_0x00b6
            r23 = r10
            goto L_0x00b8
        L_0x00b6:
            r23 = r1
        L_0x00b8:
            long r1 = r7.a
            long r3 = -r1
            cb5 r5 = new cb5
            r11 = r5
            java.lang.String r6 = r12.d
            r27 = r6
            boolean r6 = r12.c
            r29 = r6
            long r6 = r7.o
            r19 = r6
            long r6 = r12.b
            r21 = r6
            r26 = 0
            r28 = 1
            r12 = r13
            r14 = r1
            r24 = r3
            r11.<init>(r12, r14, r16, r17, r18, r19, r21, r23, r24, r26, r27, r28, r29)
            r0.e(r5, r9)
            goto L_0x0056
        L_0x00de:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.km9.a(km9, long, ym8, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final cm9 b(km9 km9, fm9 fm9) {
        long j = fm9.c;
        ym8 ym8 = fm9.Y;
        if (ym8 != null) {
            return new cm9(j, (j22) null, ym8, false, 0, false);
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(long r6, kotlin.coroutines.Continuation r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.gm9
            if (r0 == 0) goto L_0x0013
            r0 = r8
            gm9 r0 = (defpackage.gm9) r0
            int r1 = r0.w0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.w0 = r1
            goto L_0x0018
        L_0x0013:
            gm9 r0 = new gm9
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.Y
            pu3 r1 = pu3.a
            int r2 = r0.w0
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            wx3.H(r8)
            goto L_0x006b
        L_0x002a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0032:
            long r6 = r0.X
            km9 r5 = r0.o
            wx3.H(r8)
            goto L_0x0054
        L_0x003a:
            wx3.H(r8)
            t97 r8 = r5.a
            java.lang.Object r8 = r8.getValue()
            bv2 r8 = (defpackage.bv2) r8
            r0.o = r5
            r0.X = r6
            r0.w0 = r4
            aw2 r8 = (defpackage.aw2) r8
            java.lang.Object r8 = r8.k(r6, r0)
            if (r8 != r1) goto L_0x0054
            return r1
        L_0x0054:
            i22 r8 = (defpackage.i22) r8
            if (r8 != 0) goto L_0x006b
            hm9 r8 = new hm9
            r2 = 0
            r8.<init>(r5, r6, r2)
            r0.o = r2
            r0.w0 = r3
            r5 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r8 = ez3.m0(r5, r8, r0)
            if (r8 != r1) goto L_0x006b
            return r1
        L_0x006b:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.km9.c(long, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
