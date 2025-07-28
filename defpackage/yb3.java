package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: yb3  reason: default package */
public final class yb3 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ String Z;
    public final /* synthetic */ zb3 w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yb3(String str, zb3 zb3, Continuation continuation) {
        super(2, continuation);
        this.Z = str;
        this.w0 = zb3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        yb3 yb3 = new yb3(this.Z, this.w0, continuation);
        yb3.Y = obj;
        return yb3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: ou3} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0082 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0083 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0096 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0097  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r12) {
        /*
            r11 = this;
            pu3 r0 = pu3.a
            int r1 = r11.X
            jue r2 = jue.a
            r3 = 0
            r4 = 5
            r5 = 4
            r6 = 3
            r7 = 1
            r8 = 2
            zb3 r9 = r11.w0
            if (r1 == 0) goto L_0x003b
            if (r1 == r7) goto L_0x0037
            if (r1 == r8) goto L_0x0033
            if (r1 == r6) goto L_0x002f
            if (r1 == r5) goto L_0x0027
            if (r1 != r4) goto L_0x001f
            wx3.H(r12)
            goto L_0x00ac
        L_0x001f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0027:
            java.lang.Object r1 = r11.Y
            ou3 r1 = (ou3) r1
            wx3.H(r12)
            goto L_0x0090
        L_0x002f:
            wx3.H(r12)
            goto L_0x0083
        L_0x0033:
            wx3.H(r12)
            goto L_0x0077
        L_0x0037:
            wx3.H(r12)
            goto L_0x0066
        L_0x003b:
            wx3.H(r12)
            java.lang.Object r12 = r11.Y
            r1 = r12
            ou3 r1 = (ou3) r1
            r7e r12 = defpackage.dy4.a
            java.lang.String r12 = r11.Z
            java.lang.String r12 = defpackage.dy4.a(r12)
            boolean r10 = n1g.A(r1)
            if (r10 != 0) goto L_0x0052
            return r2
        L_0x0052:
            java.lang.String r10 = r9.b
            boolean r12 = hhd.f(r12, r10)
            grd r10 = r9.Z
            if (r12 != 0) goto L_0x0084
            wb3 r12 = defpackage.wb3.c
            r11.X = r7
            r10.m(r3, r12)
            if (r2 != r0) goto L_0x0066
            return r0
        L_0x0066:
            int r12 = zp4.o
            eq4 r12 = eq4.o
            long r4 = mt0.P(r8, r12)
            r11.X = r8
            java.lang.Object r12 = defpackage.ek8.r(r4, r11)
            if (r12 != r0) goto L_0x0077
            return r0
        L_0x0077:
            grd r12 = r9.Z
            wb3 r1 = defpackage.wb3.a
            r11.X = r6
            r12.m(r3, r1)
            if (r2 != r0) goto L_0x0083
            return r0
        L_0x0083:
            return r2
        L_0x0084:
            wb3 r12 = defpackage.wb3.b
            r11.Y = r1
            r11.X = r5
            r10.m(r3, r12)
            if (r2 != r0) goto L_0x0090
            return r0
        L_0x0090:
            boolean r12 = n1g.A(r1)
            if (r12 != 0) goto L_0x0097
            return r2
        L_0x0097:
            r11.Y = r3
            r11.X = r4
            k77[] r12 = defpackage.zb3.A0
            r9.getClass()
            xb3 r12 = new xb3
            r12.<init>(r9, r3)
            java.lang.Object r11 = n1g.f(r12, r11)
            if (r11 != r0) goto L_0x00ac
            return r0
        L_0x00ac:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yb3.o(java.lang.Object):java.lang.Object");
    }
}
