package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: yj5  reason: default package */
public final class yj5 extends l5e implements i26 {
    public final /* synthetic */ long A0;
    public d73 X;
    public n1c Y;
    public int Z;
    public long w0;
    public int x0;
    public /* synthetic */ Object y0;
    public final /* synthetic */ pj5 z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yj5(long j, pj5 pj5, Continuation continuation) {
        super(2, continuation);
        this.z0 = pj5;
        this.A0 = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((d5b) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        yj5 yj5 = new yj5(this.A0, this.z0, continuation);
        yj5.y0 = obj;
        return yj5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x00eb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r25) {
        /*
            r24 = this;
            r0 = r24
            pu3 r1 = pu3.a
            int r2 = r0.x0
            r3 = 1
            r10 = 0
            if (r2 == 0) goto L_0x002b
            if (r2 != r3) goto L_0x0023
            long r4 = r0.w0
            int r2 = r0.Z
            n1c r6 = r0.Y
            d73 r7 = r0.X
            java.lang.Object r8 = r0.y0
            d5b r8 = (d5b) r8
            wx3.H(r25)
            r11 = r4
            r13 = r6
            r14 = r7
            r15 = r8
            r4 = r25
            goto L_0x00e0
        L_0x0023:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x002b:
            wx3.H(r25)
            java.lang.Object r2 = r0.y0
            d5b r2 = (d5b) r2
            h37 r4 = lp.a()
            xj5 r5 = new xj5
            pj5 r6 = r0.z0
            r5.<init>(r6, r4, r10)
            bw4 r6 = bw4.a
            ru3 r7 = ru3.a
            r8 = 4
            r9 = 2147483647(0x7fffffff, float:NaN)
            us0 r8 = xs7.a(r9, r3, r8)
            hu3 r6 = xie.x(r2, r6)
            a5b r11 = new a5b
            r11.<init>(r6, r8)
            r11.start(r7, r11, r5)
            long r5 = r0.A0
            r15 = r2
            r14 = r4
            r2 = r9
            r13 = r11
            r11 = r5
        L_0x005c:
            yvc r9 = new yvc
            hu3 r4 = r0.b
            r9.<init>(r4)
            r4 = r14
            i47 r4 = (i47) r4
            uvc r16 = r4.getOnJoin()
            vj5 r22 = new vj5
            r17 = 0
            r4 = r22
            r5 = r13
            r6 = r2
            r7 = r15
            r8 = r10
            r25 = r9
            r9 = r17
            r4.<init>(r5, r6, r7, r8, r9)
            wvc r4 = new wvc
            r5 = r16
            nxc r5 = (defpackage.nxc) r5
            java.lang.Object r6 = r5.a
            kotlinx.coroutines.internal.Symbol r21 = bwc.e
            java.lang.Object r7 = r5.b
            r19 = r7
            k26 r19 = (k26) r19
            java.lang.Object r7 = r5.c
            r23 = r7
            k26 r23 = (k26) r23
            java.lang.Object r5 = r5.o
            r20 = r5
            awc r20 = (awc) r20
            r16 = r4
            r17 = r25
            r18 = r6
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            r5 = 0
            r9 = r25
            r9.f(r4, r5)
            vj5 r8 = new vj5
            r16 = 1
            r4 = r8
            r5 = r13
            r6 = r2
            r7 = r15
            r3 = r8
            r8 = r10
            r10 = r9
            r9 = r16
            r4.<init>(r5, r6, r7, r8, r9)
            long r4 = defpackage.ek8.b0(r11)
            kjd.F(r10, r4, r3)
            r0.y0 = r15
            r0.X = r14
            r0.Y = r13
            r0.Z = r2
            r0.w0 = r11
            r3 = 1
            r0.x0 = r3
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = yvc.Y
            java.lang.Object r4 = r4.get(r10)
            boolean r4 = r4 instanceof wvc
            if (r4 == 0) goto L_0x00d9
            java.lang.Object r4 = r10.c(r0)
            goto L_0x00dd
        L_0x00d9:
            java.lang.Object r4 = r10.d(r0)
        L_0x00dd:
            if (r4 != r1) goto L_0x00e0
            return r1
        L_0x00e0:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L_0x00eb
            jue r0 = jue.a
            return r0
        L_0x00eb:
            r10 = 0
            goto L_0x005c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yj5.o(java.lang.Object):java.lang.Object");
    }
}
