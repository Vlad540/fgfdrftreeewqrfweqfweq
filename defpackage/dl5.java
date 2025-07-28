package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: dl5  reason: default package */
public final class dl5 extends l5e implements k26 {
    public long X;
    public int Y;
    public /* synthetic */ Object Z;
    public /* synthetic */ Object w0;
    public final /* synthetic */ long x0;
    public final /* synthetic */ pj5 y0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dl5(long j, pj5 pj5, Continuation continuation) {
        super(3, continuation);
        this.x0 = j;
        this.y0 = pj5;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        dl5 dl5 = new dl5(this.x0, this.y0, (Continuation) obj3);
        dl5.Z = (ou3) obj;
        dl5.w0 = (rj5) obj2;
        return dl5.o(jue.a);
    }

    /* JADX WARNING: type inference failed for: r10v10, types: [p02] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00d9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            pu3 r1 = defpackage.pu3.a
            int r2 = r0.Y
            r3 = 0
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0026
            if (r2 != r4) goto L_0x001e
            long r6 = r0.X
            java.lang.Object r2 = r0.w0
            n1c r2 = (defpackage.n1c) r2
            java.lang.Object r8 = r0.Z
            rj5 r8 = (defpackage.rj5) r8
            defpackage.wx3.H(r22)
            r5 = r22
            goto L_0x00ce
        L_0x001e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0026:
            defpackage.wx3.H(r22)
            java.lang.Object r2 = r0.Z
            ou3 r2 = (defpackage.ou3) r2
            java.lang.Object r6 = r0.w0
            rj5 r6 = (defpackage.rj5) r6
            int r7 = defpackage.zp4.o
            long r7 = r0.x0
            r9 = 0
            int r9 = defpackage.zp4.c(r7, r9)
            if (r9 <= 0) goto L_0x00db
            r9 = 2
            pj5 r10 = r0.y0
            pj5 r9 = defpackage.ez3.f(r10, r3, r9)
            boolean r10 = r9 instanceof defpackage.p02
            if (r10 == 0) goto L_0x004c
            r10 = r9
            p02 r10 = (defpackage.p02) r10
            goto L_0x004d
        L_0x004c:
            r10 = r5
        L_0x004d:
            if (r10 != 0) goto L_0x005c
            x02 r10 = new x02
            r14 = 14
            r13 = 0
            r15 = 0
            r12 = 0
            r11 = r10
            r16 = r9
            r11.<init>(r12, r13, r14, r15, r16)
        L_0x005c:
            n1c r2 = r10.l(r2)
            r19 = r7
            r8 = r6
            r6 = r19
        L_0x0065:
            yvc r15 = new yvc
            hu3 r9 = r0.b
            r15.<init>(r9)
            vvc r9 = r2.b()
            bl5 r14 = new bl5
            r14.<init>(r8, r5)
            wvc r13 = new wvc
            b0d r9 = (defpackage.b0d) r9
            java.lang.Object r11 = r9.b
            java.lang.Object r10 = r9.o
            r16 = r10
            k26 r16 = (defpackage.k26) r16
            r17 = 0
            java.lang.Object r10 = r9.c
            r12 = r10
            k26 r12 = (defpackage.k26) r12
            java.lang.Object r9 = r9.X
            r18 = r9
            k26 r18 = (defpackage.k26) r18
            r9 = r13
            r10 = r15
            r4 = r13
            r13 = r16
            r16 = r14
            r14 = r17
            r5 = r15
            r15 = r16
            r16 = r18
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r5.f(r4, r3)
            cl5 r4 = new cl5
            r9 = 0
            r4.<init>(r6, r9)
            long r9 = ek8.b0(r6)
            defpackage.kjd.F(r5, r9, r4)
            r0.Z = r8
            r0.w0 = r2
            r0.X = r6
            r4 = 1
            r0.Y = r4
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r9 = defpackage.yvc.Y
            java.lang.Object r9 = r9.get(r5)
            boolean r9 = r9 instanceof defpackage.wvc
            if (r9 == 0) goto L_0x00c7
            java.lang.Object r5 = r5.c(r0)
            goto L_0x00cb
        L_0x00c7:
            java.lang.Object r5 = r5.d(r0)
        L_0x00cb:
            if (r5 != r1) goto L_0x00ce
            return r1
        L_0x00ce:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L_0x00d9
            jue r0 = defpackage.jue.a
            return r0
        L_0x00d9:
            r5 = 0
            goto L_0x0065
        L_0x00db:
            kotlinx.coroutines.TimeoutCancellationException r0 = new kotlinx.coroutines.TimeoutCancellationException
            java.lang.String r1 = "Timed out immediately"
            r2 = 0
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dl5.o(java.lang.Object):java.lang.Object");
    }
}
