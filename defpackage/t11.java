package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: t11  reason: default package */
public final class t11 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ x11 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t11(x11 x11, Continuation continuation) {
        super(2, continuation);
        this.Y = x11;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((t11) n((d41) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        t11 t11 = new t11(this.Y, continuation);
        t11.X = obj;
        return t11;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r15) {
        /*
            r14 = this;
            defpackage.wx3.H(r15)
            java.lang.Object r15 = r14.X
            d41 r15 = (defpackage.d41) r15
            boolean r0 = r15 instanceof defpackage.v31
            r1 = 0
            x11 r14 = r14.Y
            if (r0 == 0) goto L_0x0040
            v31 r15 = (defpackage.v31) r15
            long r2 = r15.a
            java.lang.Long r15 = r14.o
            if (r15 != 0) goto L_0x0018
            goto L_0x00c8
        L_0x0018:
            long r4 = r15.longValue()
            int r15 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r15 != 0) goto L_0x00c8
            r14.o = r1
        L_0x0022:
            grd r15 = r14.j
            java.lang.Object r0 = r15.getValue()
            r1 = r0
            k11 r1 = (defpackage.k11) r1
            k11 r1 = new k11
            r6 = 0
            r7 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r8 = 62
            r2 = r1
            r2.<init>((java.lang.Long) r3, (java.lang.CharSequence) r4, (java.lang.String) r5, (java.lang.Long) r6, (java.lang.CharSequence) r7, (int) r8)
            boolean r15 = r15.b(r0, r1)
            if (r15 == 0) goto L_0x0022
            goto L_0x00c8
        L_0x0040:
            boolean r0 = r15 instanceof defpackage.w31
            if (r0 == 0) goto L_0x00c8
            w31 r15 = (defpackage.w31) r15
            qd7 r0 = r15.a
            long r2 = r0.a
            java.lang.Long r0 = r14.o
            if (r0 != 0) goto L_0x0050
            goto L_0x00c8
        L_0x0050:
            long r4 = r0.longValue()
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x00c8
            r14.o = r1
        L_0x005a:
            grd r0 = r14.j
            java.lang.Object r2 = r0.getValue()
            r3 = r2
            k11 r3 = (defpackage.k11) r3
            qd7 r3 = r15.a
            java.lang.Long r4 = r3.b
            if (r4 != 0) goto L_0x006a
            goto L_0x0077
        L_0x006a:
            long r4 = r4.longValue()
            r6 = -1
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x0077
            r4 = 1
        L_0x0075:
            r11 = r4
            goto L_0x0079
        L_0x0077:
            r4 = 0
            goto L_0x0075
        L_0x0079:
            zc6 r4 = r3.X
            if (r4 == 0) goto L_0x0084
            java.lang.String r5 = r4.X
            if (r5 != 0) goto L_0x0082
            goto L_0x0084
        L_0x0082:
            r7 = r5
            goto L_0x008c
        L_0x0084:
            s2f r5 = r3.Y
            if (r5 == 0) goto L_0x008b
            java.lang.String r5 = r5.o
            goto L_0x0082
        L_0x008b:
            r7 = r1
        L_0x008c:
            if (r4 == 0) goto L_0x0092
            java.lang.String r4 = r4.Y
            r8 = r4
            goto L_0x0093
        L_0x0092:
            r8 = r1
        L_0x0093:
            java.lang.String r4 = ""
            if (r11 == 0) goto L_0x0099
        L_0x0097:
            r10 = r4
            goto L_0x00ac
        L_0x0099:
            java.util.regex.Pattern r5 = t5a.a
            if (r7 != 0) goto L_0x009e
            goto L_0x009f
        L_0x009e:
            r4 = r7
        L_0x009f:
            t97 r5 = r14.e
            java.lang.Object r5 = r5.getValue()
            w6a r5 = (defpackage.w6a) r5
            java.lang.CharSequence r4 = t5a.a(r4, r5)
            goto L_0x0097
        L_0x00ac:
            k11 r4 = new k11
            java.lang.Long r6 = r3.b
            if (r6 == 0) goto L_0x00b7
            long r12 = r6.longValue()
            goto L_0x00b9
        L_0x00b7:
            r12 = -9223372036854775808
        L_0x00b9:
            java.lang.Long r9 = new java.lang.Long
            r9.<init>(r12)
            r5 = r4
            r5.<init>((java.lang.Long) r6, (java.lang.CharSequence) r7, (java.lang.String) r8, (java.lang.Long) r9, (java.lang.CharSequence) r10, (boolean) r11)
            boolean r0 = r0.b(r2, r4)
            if (r0 == 0) goto L_0x005a
        L_0x00c8:
            jue r14 = defpackage.jue.a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t11.o(java.lang.Object):java.lang.Object");
    }
}
