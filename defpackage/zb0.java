package defpackage;

/* renamed from: zb0  reason: default package */
public final class zb0 {
    public final t97 a;
    public final q16 b;
    public final r7e c = new r7e(new m(15));

    public zb0(int i, t97 t97) {
        this.a = t97;
        this.b = new q16(i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(defpackage.pi2 r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.xb0
            if (r0 == 0) goto L_0x0013
            r0 = r6
            xb0 r0 = (defpackage.xb0) r0
            int r1 = r0.w0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.w0 = r1
            goto L_0x0018
        L_0x0013:
            xb0 r0 = new xb0
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.Y
            pu3 r1 = defpackage.pu3.a
            int r2 = r0.w0
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            pi2 r5 = r0.X
            zb0 r4 = r0.o
            defpackage.wx3.H(r6)
            goto L_0x0043
        L_0x002b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0033:
            defpackage.wx3.H(r6)
            r0.o = r4
            r0.X = r5
            r0.w0 = r3
            java.io.Serializable r6 = r4.b(r5, r0)
            if (r6 != r1) goto L_0x0043
            return r1
        L_0x0043:
            wia r6 = (defpackage.wia) r6
            if (r6 == 0) goto L_0x0053
            q16 r4 = r4.b
            long r0 = r5.a
            java.lang.Long r5 = new java.lang.Long
            r5.<init>(r0)
            r4.put(r5, r6)
        L_0x0053:
            jue r4 = defpackage.jue.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zb0.a(pi2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0080 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.Serializable b(defpackage.pi2 r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.yb0
            if (r0 == 0) goto L_0x0013
            r0 = r8
            yb0 r0 = (defpackage.yb0) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            yb0 r0 = new yb0
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.X
            pu3 r1 = defpackage.pu3.a
            int r2 = r0.Z
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0032
            if (r2 != r4) goto L_0x002a
            android.net.Uri r6 = r0.o
            defpackage.wx3.H(r8)
            goto L_0x0072
        L_0x002a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0032:
            defpackage.wx3.H(r8)
            android.net.Uri r7 = r7.b
            if (r7 != 0) goto L_0x003a
            return r3
        L_0x003a:
            vb0 r8 = bz9.a
            dz9 r8 = dz9.a
            ur6 r2 = defpackage.ur6.d(r7)
            rr6 r5 = defpackage.rr6.b
            r2.g = r5
            ii0 r8 = bz9.a(r8)
            r2.l = r8
            u3b r8 = defpackage.u3b.c
            r2.k = r8
            r7e r8 = r6.c
            java.lang.Object r8 = r8.getValue()
            hbc r8 = (defpackage.hbc) r8
            r2.d = r8
            tr6 r8 = r2.a()
            t97 r6 = r6.a
            java.lang.Object r6 = r6.getValue()
            en0 r6 = (defpackage.en0) r6
            r0.o = r7
            r0.Z = r4
            java.io.Serializable r8 = r6.b(r8, r0)
            if (r8 != r1) goto L_0x0071
            return r1
        L_0x0071:
            r6 = r7
        L_0x0072:
            byte[] r8 = (byte[]) r8
            if (r8 == 0) goto L_0x0080
            int r7 = r8.length
            if (r7 != 0) goto L_0x007a
            goto L_0x0080
        L_0x007a:
            wia r7 = new wia
            r7.<init>(r6, r8)
            return r7
        L_0x0080:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zb0.b(pi2, kotlin.coroutines.Continuation):java.io.Serializable");
    }
}
