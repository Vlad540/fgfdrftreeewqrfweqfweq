package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: im2  reason: default package */
public final class im2 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ nn2 Y;
    public final /* synthetic */ int Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public im2(nn2 nn2, int i, Continuation continuation) {
        super(2, continuation);
        this.Y = nn2;
        this.Z = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((im2) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new im2(this.Y, this.Z, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x009d A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r14) {
        /*
            r13 = this;
            pu3 r0 = defpackage.pu3.a
            int r1 = r13.X
            jue r2 = defpackage.jue.a
            r3 = 2
            r4 = 1
            nn2 r5 = r13.Y
            if (r1 == 0) goto L_0x0021
            if (r1 == r4) goto L_0x001d
            if (r1 != r3) goto L_0x0015
            defpackage.wx3.H(r14)
            goto L_0x009e
        L_0x0015:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x001d:
            defpackage.wx3.H(r14)
            goto L_0x002d
        L_0x0021:
            defpackage.wx3.H(r14)
            r13.X = r4
            java.lang.Object r14 = r5.y(r13)
            if (r14 != r0) goto L_0x002d
            return r0
        L_0x002d:
            java.lang.Number r14 = (java.lang.Number) r14
            long r8 = r14.longValue()
            int r14 = qhc.m0
            int r1 = r13.Z
            if (r1 != r14) goto L_0x004d
            t97 r14 = r5.z0
            java.lang.Object r14 = r14.getValue()
            f03 r14 = (f03) r14
            lqc r14 = (lqc) r14
            long r6 = r14.m()
            r10 = 3600000(0x36ee80, double:1.7786363E-317)
        L_0x004a:
            long r6 = r6 + r10
        L_0x004b:
            r10 = r6
            goto L_0x0080
        L_0x004d:
            int r14 = qhc.n0
            if (r1 != r14) goto L_0x0063
            t97 r14 = r5.z0
            java.lang.Object r14 = r14.getValue()
            f03 r14 = (f03) r14
            lqc r14 = (lqc) r14
            long r6 = r14.m()
            r10 = 18000000(0x112a880, double:8.8931816E-317)
            goto L_0x004a
        L_0x0063:
            int r14 = qhc.l0
            if (r1 != r14) goto L_0x0079
            t97 r14 = r5.z0
            java.lang.Object r14 = r14.getValue()
            f03 r14 = (f03) r14
            lqc r14 = (lqc) r14
            long r6 = r14.m()
            r10 = 86400000(0x5265c00, double:4.2687272E-316)
            goto L_0x004a
        L_0x0079:
            int r14 = qhc.o0
            if (r1 != r14) goto L_0x00b2
            r6 = -1
            goto L_0x004b
        L_0x0080:
            k77[] r14 = defpackage.nn2.g1
            pae r14 = r5.u()
            n3a r14 = (defpackage.n3a) r14
            ju3 r14 = r14.b()
            hm2 r1 = new hm2
            nn2 r7 = r13.Y
            r12 = 0
            r6 = r1
            r6.<init>(r7, r8, r10, r12)
            r13.X = r3
            java.lang.Object r13 = defpackage.xs7.U(r14, r1, r13)
            if (r13 != r0) goto L_0x009e
            return r0
        L_0x009e:
            l05 r13 = r5.c1
            dm2 r14 = new dm2
            int r0 = rhc.I
            int r1 = phc.m
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r1)
            r1 = 0
            r14.<init>(r0, r1, r4, r3)
            taf.o(r13, r14)
        L_0x00b2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.im2.o(java.lang.Object):java.lang.Object");
    }
}
