package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: t56  reason: default package */
public final class t56 extends l5e implements i26 {
    public List X;
    public int Y;
    public final /* synthetic */ m66 Z;
    public final /* synthetic */ o46 w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t56(m66 m66, o46 o46, Continuation continuation) {
        super(2, continuation);
        this.Z = m66;
        this.w0 = o46;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new t56(this.Z, this.w0, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0098 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0099  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r12) {
        /*
            r11 = this;
            pu3 r0 = pu3.a
            int r1 = r11.Y
            jue r2 = jue.a
            java.lang.String r3 = "m66"
            r4 = 3
            r5 = 2
            r6 = 1
            o46 r7 = r11.w0
            r8 = 0
            m66 r9 = r11.Z
            if (r1 == 0) goto L_0x0034
            if (r1 == r6) goto L_0x0030
            if (r1 == r5) goto L_0x0027
            if (r1 != r4) goto L_0x001f
            java.util.List r11 = r11.X
            wx3.H(r12)
            goto L_0x00af
        L_0x001f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0027:
            java.util.List r1 = r11.X
            wx3.H(r12)
            r10 = r1
            r1 = r12
            r12 = r10
            goto L_0x008b
        L_0x0030:
            wx3.H(r12)
            goto L_0x0071
        L_0x0034:
            wx3.H(r12)
            grd r12 = r9.D0
            java.lang.Object r12 = r12.getValue()
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L_0x0046
            return r2
        L_0x0046:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r1 = "start fetch medias for "
            r12.<init>(r1)
            r12.append(r7)
            java.lang.String r12 = r12.toString()
            udd.q(r3, r12)
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            grd r1 = r9.D0
            r1.m(r8, r12)
            n46 r12 = r7.a
            gl7 r1 = r9.X
            bv6 r1 = (defpackage.bv6) r1
            java.util.List r12 = r1.c(r12)
            r11.Y = r6
            java.lang.Object r12 = defpackage.m66.q(r9, r12, r11)
            if (r12 != r0) goto L_0x0071
            return r0
        L_0x0071:
            java.util.List r12 = (java.util.List) r12
            grd r1 = r9.A0
            r1.setValue(r12)
            j56 r1 = r9.C0
            int r1 = r1.b
            r11.X = r12
            r11.Y = r5
            gl7 r5 = r9.X
            bv6 r5 = (defpackage.bv6) r5
            java.lang.Object r1 = r5.d(r7, r1, r11)
            if (r1 != r0) goto L_0x008b
            return r0
        L_0x008b:
            fl7 r1 = (defpackage.fl7) r1
            grd r5 = r9.D0
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r5.m(r8, r6)
            boolean r5 = r1 instanceof defpackage.dl7
            if (r5 == 0) goto L_0x0099
            return r2
        L_0x0099:
            boolean r5 = r1 instanceof defpackage.el7
            if (r5 == 0) goto L_0x00cc
            el7 r1 = (defpackage.el7) r1
            java.util.List r1 = r1.a
            r11.X = r12
            r11.Y = r4
            java.lang.Object r11 = defpackage.m66.q(r9, r1, r11)
            if (r11 != r0) goto L_0x00ac
            return r0
        L_0x00ac:
            r10 = r12
            r12 = r11
            r11 = r10
        L_0x00af:
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.ArrayList r11 = o23.i0(r11, r12)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = "finish fetch medias for "
            r12.<init>(r0)
            r12.append(r7)
            java.lang.String r12 = r12.toString()
            udd.q(r3, r12)
            grd r12 = r9.A0
            r12.m(r8, r11)
            return r2
        L_0x00cc:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t56.o(java.lang.Object):java.lang.Object");
    }
}
