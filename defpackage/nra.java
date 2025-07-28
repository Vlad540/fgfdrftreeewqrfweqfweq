package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;

/* renamed from: nra  reason: default package */
public final class nra extends l5e implements i26 {
    public mc9 X;
    public int Y;
    public final /* synthetic */ xra Z;
    public final /* synthetic */ Set w0;
    public final /* synthetic */ bua x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nra(xra xra, Set set, bua bua, Continuation continuation) {
        super(2, continuation);
        this.Z = xra;
        this.w0 = set;
        this.x0 = bua;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((nra) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new nra(this.Z, this.w0, this.x0, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00c9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00f7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00f8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r13) {
        /*
            r12 = this;
            pu3 r0 = defpackage.pu3.a
            int r1 = r12.Y
            jue r2 = defpackage.jue.a
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r1 == 0) goto L_0x0040
            if (r1 == r7) goto L_0x003a
            if (r1 == r6) goto L_0x0034
            if (r1 == r5) goto L_0x002d
            if (r1 == r4) goto L_0x0026
            if (r1 != r3) goto L_0x001e
            mc9 r12 = r12.X
            defpackage.wx3.H(r13)
            goto L_0x0106
        L_0x001e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0026:
            mc9 r1 = r12.X
            defpackage.wx3.H(r13)
            goto L_0x00f3
        L_0x002d:
            mc9 r12 = r12.X
            defpackage.wx3.H(r13)
            goto L_0x00cc
        L_0x0034:
            mc9 r1 = r12.X
            defpackage.wx3.H(r13)
            goto L_0x0093
        L_0x003a:
            mc9 r1 = r12.X
            defpackage.wx3.H(r13)
            goto L_0x0074
        L_0x0040:
            defpackage.wx3.H(r13)
            xra r13 = r12.Z
            grd r1 = r13.B0
            java.util.Set r13 = r12.w0
            int r13 = r13.size()
            java.lang.Class<b29> r8 = b29.class
            if (r13 <= r7) goto L_0x00d0
            tp2 r13 = defpackage.tp2.a
            w4 r13 = r13.getAccessor()
            java.lang.Object r13 = r13.c(r8)
            b29 r13 = (b29) r13
            java.util.Set r3 = r12.w0
            java.lang.Object r3 = defpackage.o23.U(r3)
            java.lang.Number r3 = (java.lang.Number) r3
            long r3 = r3.longValue()
            r12.X = r1
            r12.Y = r7
            java.lang.Object r13 = r13.a(r3, r12)
            if (r13 != r0) goto L_0x0074
            return r0
        L_0x0074:
            vo8 r13 = (vo8) r13
            if (r13 == 0) goto L_0x00cf
            long r3 = r13.x0
            tp2 r13 = defpackage.tp2.a
            w4 r13 = r13.getAccessor()
            java.lang.Class<bv2> r7 = bv2.class
            java.lang.Object r13 = r13.c(r7)
            bv2 r13 = (bv2) r13
            r12.X = r1
            r12.Y = r6
            java.lang.Object r13 = r13.d(r3, r12)
            if (r13 != r0) goto L_0x0093
            return r0
        L_0x0093:
            i22 r13 = (i22) r13
            r13.h0()
            java.lang.CharSequence r13 = r13.y0
            bua r3 = r12.x0
            java.util.Set r4 = r12.w0
            int r4 = r4.size()
            r12.X = r1
            r12.Y = r5
            r3.getClass()
            sra r12 = new sra
            int r3 = defpackage.g2a.a
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r4)
            java.lang.Object[] r13 = new java.lang.Object[]{r5, r13}
            fge r7 = new fge
            java.util.List r13 = defpackage.cs.g0(r13)
            r7.<init>(r13, r3, r4)
            r10 = 0
            r11 = 0
            r8 = 0
            r9 = 0
            r6 = r12
            r6.<init>(r7, r8, r9, r10, r11)
            if (r12 != r0) goto L_0x00ca
            return r0
        L_0x00ca:
            r13 = r12
            r12 = r1
        L_0x00cc:
            sra r13 = (defpackage.sra) r13
            goto L_0x0108
        L_0x00cf:
            return r2
        L_0x00d0:
            tp2 r13 = defpackage.tp2.a
            w4 r13 = r13.getAccessor()
            java.lang.Object r13 = r13.c(r8)
            b29 r13 = (b29) r13
            java.util.Set r5 = r12.w0
            java.lang.Object r5 = defpackage.o23.U(r5)
            java.lang.Number r5 = (java.lang.Number) r5
            long r5 = r5.longValue()
            r12.X = r1
            r12.Y = r4
            java.lang.Object r13 = r13.a(r5, r12)
            if (r13 != r0) goto L_0x00f3
            return r0
        L_0x00f3:
            vo8 r13 = (vo8) r13
            if (r13 != 0) goto L_0x00f8
            return r2
        L_0x00f8:
            bua r4 = r12.x0
            r12.X = r1
            r12.Y = r3
            java.lang.Object r13 = r4.a(r13, r12)
            if (r13 != r0) goto L_0x0105
            return r0
        L_0x0105:
            r12 = r1
        L_0x0106:
            sra r13 = (defpackage.sra) r13
        L_0x0108:
            r12.setValue(r13)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nra.o(java.lang.Object):java.lang.Object");
    }
}
