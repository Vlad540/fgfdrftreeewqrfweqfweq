package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: o19  reason: default package */
public final class o19 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ t97 Y;
    public final /* synthetic */ x19 Z;
    public final /* synthetic */ t97 w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o19(t97 t97, t97 t972, x19 x19, Continuation continuation) {
        super(2, continuation);
        this.Y = t97;
        this.Z = x19;
        this.w0 = t972;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        x19 x19 = this.Z;
        return new o19(this.Y, this.w0, x19, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0049  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r6) {
        /*
            r5 = this;
            pu3 r0 = pu3.a
            int r1 = r5.X
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x001d
            if (r1 == r4) goto L_0x0019
            if (r1 != r3) goto L_0x0011
            wx3.H(r6)
            goto L_0x0045
        L_0x0011:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0019:
            wx3.H(r6)
            goto L_0x0031
        L_0x001d:
            wx3.H(r6)
            t97 r6 = r5.Y
            java.lang.Object r6 = r6.getValue()
            ap3 r6 = (defpackage.ap3) r6
            r5.X = r4
            java.lang.Object r6 = r6.d(r5)
            if (r6 != r0) goto L_0x0031
            return r0
        L_0x0031:
            tf3 r6 = (defpackage.tf3) r6
            n19 r1 = new n19
            t97 r4 = r5.w0
            r1.<init>(r4, r6, r2)
            r5.X = r3
            r3 = 100
            java.lang.Object r6 = ez3.m0(r3, r1, r5)
            if (r6 != r0) goto L_0x0045
            return r0
        L_0x0045:
            android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6
            if (r6 == 0) goto L_0x0064
            x19 r5 = r5.Z
            grd r5 = r5.z0
            java.lang.Object r0 = r5.getValue()
            wna r0 = (wna) r0
            dk r0 = r0.a()
            androidx.core.graphics.drawable.IconCompat r6 = androidx.core.graphics.drawable.IconCompat.b(r6)
            r0.X = r6
            wna r6 = r0.a()
            r5.m(r2, r6)
        L_0x0064:
            jue r5 = jue.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o19.o(java.lang.Object):java.lang.Object");
    }
}
