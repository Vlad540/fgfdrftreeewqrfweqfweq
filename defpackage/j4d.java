package defpackage;

/* renamed from: j4d  reason: default package */
public final class j4d implements rj5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rj5 b;

    public /* synthetic */ j4d(rj5 rj5, int i) {
        this.a = i;
        this.b = rj5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0175  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.Object r12, kotlin.coroutines.Continuation r13) {
        /*
            r11 = this;
            jue r0 = jue.a
            rj5 r1 = r11.b
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r3 = 1
            pu3 r4 = pu3.a
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            int r6 = r11.a
            switch(r6) {
                case 0: goto L_0x0197;
                case 1: goto L_0x0159;
                case 2: goto L_0x0120;
                case 3: goto L_0x00e5;
                case 4: goto L_0x00a6;
                case 5: goto L_0x004f;
                default: goto L_0x0010;
            }
        L_0x0010:
            boolean r6 = r13 instanceof defpackage.hmf
            if (r6 == 0) goto L_0x0021
            r6 = r13
            hmf r6 = (defpackage.hmf) r6
            int r7 = r6.X
            r8 = r7 & r5
            if (r8 == 0) goto L_0x0021
            int r7 = r7 - r5
            r6.X = r7
            goto L_0x0026
        L_0x0021:
            hmf r6 = new hmf
            r6.<init>(r11, r13)
        L_0x0026:
            java.lang.Object r11 = r6.o
            int r13 = r6.X
            if (r13 == 0) goto L_0x0038
            if (r13 != r3) goto L_0x0032
            wx3.H(r11)
            goto L_0x004e
        L_0x0032:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            r11.<init>(r2)
            throw r11
        L_0x0038:
            wx3.H(r11)
            tf3 r12 = (defpackage.tf3) r12
            boolean r11 = r12.u()
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            r6.X = r3
            java.lang.Object r11 = r1.a(r11, r6)
            if (r11 != r4) goto L_0x004e
            r0 = r4
        L_0x004e:
            return r0
        L_0x004f:
            boolean r6 = r13 instanceof d5f
            if (r6 == 0) goto L_0x0060
            r6 = r13
            d5f r6 = (d5f) r6
            int r7 = r6.X
            r8 = r7 & r5
            if (r8 == 0) goto L_0x0060
            int r7 = r7 - r5
            r6.X = r7
            goto L_0x0065
        L_0x0060:
            d5f r6 = new d5f
            r6.<init>(r11, r13)
        L_0x0065:
            java.lang.Object r11 = r6.o
            int r13 = r6.X
            if (r13 == 0) goto L_0x0077
            if (r13 != r3) goto L_0x0071
            wx3.H(r11)
            goto L_0x00a5
        L_0x0071:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            r11.<init>(r2)
            throw r11
        L_0x0077:
            wx3.H(r11)
            zw3 r12 = (zw3) r12
            b65 r11 = r12.j
            boolean r13 = r11 instanceof v55
            r2 = 0
            if (r13 != 0) goto L_0x008e
            boolean r13 = r11 instanceof u55
            if (r13 != 0) goto L_0x008e
            boolean r11 = r11 instanceof w55
            if (r11 == 0) goto L_0x008c
            goto L_0x008e
        L_0x008c:
            r11 = r2
            goto L_0x008f
        L_0x008e:
            r11 = r3
        L_0x008f:
            if (r11 != 0) goto L_0x0098
            b65 r11 = r12.j
            boolean r11 = r11 instanceof z55
            if (r11 != 0) goto L_0x0098
            r2 = r3
        L_0x0098:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r2)
            r6.X = r3
            java.lang.Object r11 = r1.a(r11, r6)
            if (r11 != r4) goto L_0x00a5
            r0 = r4
        L_0x00a5:
            return r0
        L_0x00a6:
            boolean r6 = r13 instanceof c5f
            if (r6 == 0) goto L_0x00b7
            r6 = r13
            c5f r6 = (c5f) r6
            int r7 = r6.X
            r8 = r7 & r5
            if (r8 == 0) goto L_0x00b7
            int r7 = r7 - r5
            r6.X = r7
            goto L_0x00bc
        L_0x00b7:
            c5f r6 = new c5f
            r6.<init>(r11, r13)
        L_0x00bc:
            java.lang.Object r11 = r6.o
            int r13 = r6.X
            if (r13 == 0) goto L_0x00ce
            if (r13 != r3) goto L_0x00c8
            wx3.H(r11)
            goto L_0x00e4
        L_0x00c8:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            r11.<init>(r2)
            throw r11
        L_0x00ce:
            wx3.H(r11)
            r11 = r12
            java.util.Collection r11 = (java.util.Collection) r11
            boolean r11 = r11.isEmpty()
            r11 = r11 ^ r3
            if (r11 == 0) goto L_0x00e4
            r6.X = r3
            java.lang.Object r11 = r1.a(r12, r6)
            if (r11 != r4) goto L_0x00e4
            r0 = r4
        L_0x00e4:
            return r0
        L_0x00e5:
            boolean r6 = r13 instanceof defpackage.nwe
            if (r6 == 0) goto L_0x00f6
            r6 = r13
            nwe r6 = (defpackage.nwe) r6
            int r7 = r6.X
            r8 = r7 & r5
            if (r8 == 0) goto L_0x00f6
            int r7 = r7 - r5
            r6.X = r7
            goto L_0x00fb
        L_0x00f6:
            nwe r6 = new nwe
            r6.<init>(r11, r13)
        L_0x00fb:
            java.lang.Object r11 = r6.o
            int r13 = r6.X
            if (r13 == 0) goto L_0x010d
            if (r13 != r3) goto L_0x0107
            wx3.H(r11)
            goto L_0x011f
        L_0x0107:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            r11.<init>(r2)
            throw r11
        L_0x010d:
            wx3.H(r11)
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r11 = o23.V(r12)
            r6.X = r3
            java.lang.Object r11 = r1.a(r11, r6)
            if (r11 != r4) goto L_0x011f
            r0 = r4
        L_0x011f:
            return r0
        L_0x0120:
            boolean r6 = r13 instanceof defpackage.byd
            if (r6 == 0) goto L_0x0131
            r6 = r13
            byd r6 = (defpackage.byd) r6
            int r7 = r6.X
            r8 = r7 & r5
            if (r8 == 0) goto L_0x0131
            int r7 = r7 - r5
            r6.X = r7
            goto L_0x0136
        L_0x0131:
            byd r6 = new byd
            r6.<init>(r11, r13)
        L_0x0136:
            java.lang.Object r11 = r6.o
            int r13 = r6.X
            if (r13 == 0) goto L_0x0148
            if (r13 != r3) goto L_0x0142
            wx3.H(r11)
            goto L_0x0158
        L_0x0142:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            r11.<init>(r2)
            throw r11
        L_0x0148:
            wx3.H(r11)
            xtd r12 = (defpackage.xtd) r12
            java.util.List r11 = r12.h
            r6.X = r3
            java.lang.Object r11 = r1.a(r11, r6)
            if (r11 != r4) goto L_0x0158
            r0 = r4
        L_0x0158:
            return r0
        L_0x0159:
            boolean r6 = r13 instanceof defpackage.ebd
            if (r6 == 0) goto L_0x016a
            r6 = r13
            ebd r6 = (defpackage.ebd) r6
            int r7 = r6.X
            r8 = r7 & r5
            if (r8 == 0) goto L_0x016a
            int r7 = r7 - r5
            r6.X = r7
            goto L_0x016f
        L_0x016a:
            ebd r6 = new ebd
            r6.<init>(r11, r13)
        L_0x016f:
            java.lang.Object r11 = r6.o
            int r13 = r6.X
            if (r13 == 0) goto L_0x0181
            if (r13 != r3) goto L_0x017b
            wx3.H(r11)
            goto L_0x0196
        L_0x017b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            r11.<init>(r2)
            throw r11
        L_0x0181:
            wx3.H(r11)
            r11 = r12
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L_0x0196
            r6.X = r3
            java.lang.Object r11 = r1.a(r12, r6)
            if (r11 != r4) goto L_0x0196
            r0 = r4
        L_0x0196:
            return r0
        L_0x0197:
            boolean r6 = r13 instanceof defpackage.i4d
            if (r6 == 0) goto L_0x01a8
            r6 = r13
            i4d r6 = (defpackage.i4d) r6
            int r7 = r6.X
            r8 = r7 & r5
            if (r8 == 0) goto L_0x01a8
            int r7 = r7 - r5
            r6.X = r7
            goto L_0x01ad
        L_0x01a8:
            i4d r6 = new i4d
            r6.<init>(r11, r13)
        L_0x01ad:
            java.lang.Object r11 = r6.o
            int r13 = r6.X
            if (r13 == 0) goto L_0x01bf
            if (r13 != r3) goto L_0x01b9
            wx3.H(r11)
            goto L_0x01d8
        L_0x01b9:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            r11.<init>(r2)
            throw r11
        L_0x01bf:
            wx3.H(r11)
            r11 = r12
            java.lang.Long r11 = (java.lang.Long) r11
            long r7 = r11.longValue()
            r9 = 0
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 < 0) goto L_0x01d8
            r6.X = r3
            java.lang.Object r11 = r1.a(r12, r6)
            if (r11 != r4) goto L_0x01d8
            r0 = r4
        L_0x01d8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j4d.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
