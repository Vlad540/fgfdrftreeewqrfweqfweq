package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: g29  reason: default package */
public final class g29 extends l5e implements i26 {
    public final /* synthetic */ jv5 A0;
    public Object X;
    public int Y;
    public final /* synthetic */ h29 Z;
    public final /* synthetic */ long w0;
    public final /* synthetic */ CharSequence x0;
    public final /* synthetic */ Long y0;
    public final /* synthetic */ boolean z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g29(h29 h29, long j, CharSequence charSequence, Long l, boolean z, jv5 jv5, Continuation continuation) {
        super(2, continuation);
        this.Z = h29;
        this.w0 = j;
        this.x0 = charSequence;
        this.y0 = l;
        this.z0 = z;
        this.A0 = jv5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new g29(this.Z, this.w0, this.x0, this.y0, this.z0, this.A0, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            pu3 r1 = pu3.a
            int r2 = r0.Y
            r3 = 1
            boolean r4 = r0.z0
            java.lang.CharSequence r5 = r0.x0
            r6 = 2
            long r7 = r0.w0
            h29 r9 = r0.Z
            if (r2 == 0) goto L_0x0033
            if (r2 == r3) goto L_0x0029
            if (r2 != r6) goto L_0x0021
            java.lang.Object r0 = r0.X
            j1d r0 = (defpackage.j1d) r0
            wx3.H(r17)
            r2 = r0
            r0 = r17
            goto L_0x008f
        L_0x0021:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0029:
            java.lang.Object r2 = r0.X
            java.util.List r2 = (java.util.List) r2
            wx3.H(r17)
            r3 = r17
            goto L_0x0057
        L_0x0033:
            wx3.H(r17)
            t97 r2 = r9.e
            java.lang.Object r2 = r2.getValue()
            m86 r2 = (defpackage.m86) r2
            java.util.List r2 = r2.b(r5, r7)
            t97 r10 = r9.d
            java.lang.Object r10 = r10.getValue()
            gw8 r10 = (defpackage.gw8) r10
            r0.X = r2
            r0.Y = r3
            java.lang.Long r3 = r0.y0
            java.lang.Object r3 = r10.a(r7, r3, r0)
            if (r3 != r1) goto L_0x0057
            return r1
        L_0x0057:
            sq8 r3 = (defpackage.sq8) r3
            java.lang.CharSequence r5 = h0e.B0(r5)
            java.lang.String r13 = r5.toString()
            h1d r5 = new h1d
            if (r2 != 0) goto L_0x0067
            hw4 r2 = hw4.a
        L_0x0067:
            r15 = r2
            long r11 = r0.w0
            r14 = 1
            r10 = r5
            r10.<init>(r11, r13, r14, r15)
            r5.b = r3
            r2 = r4 ^ 1
            r5.e = r2
            j1d r2 = new j1d
            r2.<init>(r5)
            t97 r3 = r9.c
            java.lang.Object r3 = r3.getValue()
            g86 r3 = (defpackage.g86) r3
            r0.X = r2
            r0.Y = r6
            jv5 r5 = r0.A0
            java.lang.Object r0 = r3.b(r5, r0)
            if (r0 != r1) goto L_0x008f
            return r1
        L_0x008f:
            java.util.List r0 = (java.util.List) r0
            boolean r1 = r0.isEmpty()
            jue r3 = jue.a
            if (r1 == 0) goto L_0x00a8
            t97 r0 = r9.b
            java.lang.Object r0 = r0.getValue()
            luf r0 = (defpackage.luf) r0
            r2.getClass()
            r0.a(r2)
            return r3
        L_0x00a8:
            lg7 r1 = hwf.c()
            r1.add(r2)
            r1.addAll(r0)
            lg7 r0 = hwf.a(r1)
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>(r0)
            g0d r0 = new g0d
            r2 = 2
            r0.<init>(r7, r1, r2)
            r0.e = r4
            g1d r1 = new g1d
            r1.<init>(r0)
            t97 r0 = r9.b
            java.lang.Object r0 = r0.getValue()
            luf r0 = (defpackage.luf) r0
            r0.a(r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g29.o(java.lang.Object):java.lang.Object");
    }
}
