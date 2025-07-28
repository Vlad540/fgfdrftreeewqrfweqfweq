package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ej3  reason: default package */
public final class ej3 extends l5e implements i26 {
    public final /* synthetic */ hj3 X;
    public final /* synthetic */ sr4 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ej3(hj3 hj3, sr4 sr4, Continuation continuation) {
        super(2, continuation);
        this.X = hj3;
        this.Y = sr4;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ej3(this.X, this.Y, continuation);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0056, code lost:
        if ((!(r8 == null || r8.length() == 0)) != false) goto L_0x0058;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r9) {
        /*
            r8 = this;
            wx3.H(r9)
            hj3 r9 = r8.X
            t97 r0 = r9.z
            java.lang.Object r0 = r0.getValue()
            r1 = r0
            pk r1 = (defpackage.pk) r1
            sr4 r8 = r8.Y
            java.lang.String r0 = r8.c
            r2 = 0
            if (r0 == 0) goto L_0x001e
            java.lang.CharSequence r0 = h0e.B0(r0)
            java.lang.String r0 = r0.toString()
            goto L_0x001f
        L_0x001e:
            r0 = r2
        L_0x001f:
            if (r0 != 0) goto L_0x0023
            java.lang.String r0 = ""
        L_0x0023:
            java.lang.String r3 = r8.f
            if (r3 == 0) goto L_0x0030
            java.lang.CharSequence r3 = h0e.B0(r3)
            java.lang.String r3 = r3.toString()
            goto L_0x0031
        L_0x0030:
            r3 = r2
        L_0x0031:
            grd r9 = r9.i
            java.lang.Object r4 = r9.getValue()
            sr4 r4 = (defpackage.sr4) r4
            if (r4 == 0) goto L_0x003e
            java.lang.String r4 = r4.h
            goto L_0x003f
        L_0x003e:
            r4 = r2
        L_0x003f:
            java.lang.String r8 = r8.h
            boolean r4 = hhd.f(r4, r8)
            r5 = 1
            r4 = r4 ^ r5
            if (r4 == 0) goto L_0x005a
            if (r8 == 0) goto L_0x0054
            int r4 = r8.length()
            if (r4 != 0) goto L_0x0052
            goto L_0x0054
        L_0x0052:
            r4 = 0
            goto L_0x0055
        L_0x0054:
            r4 = r5
        L_0x0055:
            r4 = r4 ^ r5
            if (r4 == 0) goto L_0x005a
        L_0x0058:
            r6 = r8
            goto L_0x0079
        L_0x005a:
            java.lang.Object r9 = r9.getValue()
            sr4 r9 = (defpackage.sr4) r9
            if (r9 == 0) goto L_0x0065
            java.lang.String r9 = r9.h
            goto L_0x0066
        L_0x0065:
            r9 = r2
        L_0x0066:
            boolean r9 = hhd.f(r9, r8)
            r9 = r9 ^ r5
            if (r9 == 0) goto L_0x0078
            if (r8 == 0) goto L_0x0075
            int r8 = r8.length()
            if (r8 != 0) goto L_0x0078
        L_0x0075:
            java.lang.String r8 = "$REMOVE$"
            goto L_0x0058
        L_0x0078:
            r6 = r2
        L_0x0079:
            r5 = 0
            r7 = 0
            r4 = 0
            r2 = r0
            long r8 = ((defpackage.gy9) r1).I(2, 0, r5, r2, r3, r4, r6, r7)
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ej3.o(java.lang.Object):java.lang.Object");
    }
}
