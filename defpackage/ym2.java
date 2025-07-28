package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ym2  reason: default package */
public final class ym2 extends l5e implements i26 {
    public final /* synthetic */ Long A0;
    public final /* synthetic */ jv5 B0;
    public Object X;
    public int Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ dm7 w0;
    public final /* synthetic */ float x0;
    public final /* synthetic */ long y0;
    public final /* synthetic */ nn2 z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ym2(long j, dm7 dm7, float f, long j2, nn2 nn2, Long l, jv5 jv5, Continuation continuation) {
        super(2, continuation);
        this.Z = j;
        this.w0 = dm7;
        this.x0 = f;
        this.y0 = j2;
        this.z0 = nn2;
        this.A0 = l;
        this.B0 = jv5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ym2) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ym2(this.Z, this.w0, this.x0, this.y0, this.z0, this.A0, this.B0, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0093  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r14) {
        /*
            r13 = this;
            r0 = 2
            pu3 r6 = defpackage.pu3.a
            int r1 = r13.Y
            jue r7 = defpackage.jue.a
            r2 = 3
            r3 = 1
            long r8 = r13.Z
            nn2 r10 = r13.z0
            if (r1 == 0) goto L_0x0036
            if (r1 == r3) goto L_0x002d
            if (r1 == r0) goto L_0x0023
            if (r1 != r2) goto L_0x001b
            defpackage.wx3.H(r14)
            r0 = r14
            goto L_0x00ca
        L_0x001b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0023:
            java.lang.Object r1 = r13.X
            y0d r1 = (y0d) r1
            defpackage.wx3.H(r14)
            r3 = r1
            r1 = r14
            goto L_0x0080
        L_0x002d:
            java.lang.Object r1 = r13.X
            x0d r1 = (x0d) r1
            defpackage.wx3.H(r14)
            r3 = r14
            goto L_0x0062
        L_0x0036:
            defpackage.wx3.H(r14)
            x0d r1 = new x0d
            r1.<init>(r8)
            r4 = 0
            r1.l = r4
            dm7 r4 = r13.w0
            r1.m = r4
            float r4 = r13.x0
            r1.n = r4
            long r11 = r13.y0
            r1.o = r11
            t97 r4 = r10.J0
            java.lang.Object r4 = r4.getValue()
            gw8 r4 = (gw8) r4
            r13.X = r1
            r13.Y = r3
            java.lang.Long r3 = r13.A0
            java.lang.Object r3 = r4.a(r8, r3, r13)
            if (r3 != r6) goto L_0x0062
            return r6
        L_0x0062:
            sq8 r3 = (sq8) r3
            r1.b = r3
            y0d r3 = new y0d
            r3.<init>(r1)
            t97 r1 = r10.H0
            java.lang.Object r1 = r1.getValue()
            g86 r1 = (g86) r1
            r13.X = r3
            r13.Y = r0
            jv5 r4 = r13.B0
            java.lang.Object r1 = r1.b(r4, r13)
            if (r1 != r6) goto L_0x0080
            return r6
        L_0x0080:
            java.util.List r1 = (java.util.List) r1
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L_0x0093
            luf r0 = defpackage.nn2.r(r10)
            r3.getClass()
            r0.a(r3)
            return r7
        L_0x0093:
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            r4.add(r3)
            r4.addAll(r1)
            g0d r1 = new g0d
            r1.<init>(r8, r4, r0)
            g1d r0 = new g1d
            r0.<init>(r1)
            luf r1 = defpackage.nn2.r(r10)
            r1.a(r0)
            t97 r0 = r10.G0
            java.lang.Object r0 = r0.getValue()
            r3 = r0
            et0 r3 = (defpackage.et0) r3
            r0 = 0
            r13.X = r0
            r13.Y = r2
            r2 = 1
            jv5 r4 = r13.B0
            long r0 = r13.Z
            r5 = r13
            java.lang.Object r0 = ns7.b(r0, r2, r3, r4, r5)
            if (r0 != r6) goto L_0x00ca
            return r6
        L_0x00ca:
            yl2 r0 = (defpackage.yl2) r0
            l05 r1 = r10.c1
            taf.o(r1, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ym2.o(java.lang.Object):java.lang.Object");
    }
}
