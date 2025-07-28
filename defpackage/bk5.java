package defpackage;

/* renamed from: bk5  reason: default package */
public final class bk5 implements rj5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rj5 b;
    public final /* synthetic */ i26 c;

    public /* synthetic */ bk5(rj5 rj5, i26 i26, int i) {
        this.a = i;
        this.b = rj5;
        this.c = i26;
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01be  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            int r0 = r6.a
            switch(r0) {
                case 0: goto L_0x019d;
                case 1: goto L_0x0133;
                case 2: goto L_0x00c1;
                case 3: goto L_0x0065;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r0 = r8 instanceof rm5
            if (r0 == 0) goto L_0x0018
            r0 = r8
            rm5 r0 = (rm5) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0018
            int r1 = r1 - r2
            r0.X = r1
            goto L_0x001d
        L_0x0018:
            rm5 r0 = new rm5
            r0.<init>(r6, r8)
        L_0x001d:
            java.lang.Object r8 = r0.o
            pu3 r1 = pu3.a
            int r2 = r0.X
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 == r4) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            wx3.H(r8)
            goto L_0x0062
        L_0x002f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0037:
            rj5 r6 = r0.w0
            java.lang.Object r7 = r0.Z
            wx3.H(r8)
            goto L_0x0054
        L_0x003f:
            wx3.H(r8)
            r0.Z = r7
            rj5 r8 = r6.b
            r0.w0 = r8
            r0.X = r4
            i26 r6 = r6.c
            java.lang.Object r6 = r6.invoke(r7, r0)
            if (r6 != r1) goto L_0x0053
            goto L_0x0064
        L_0x0053:
            r6 = r8
        L_0x0054:
            r8 = 0
            r0.Z = r8
            r0.w0 = r8
            r0.X = r3
            java.lang.Object r6 = r6.a(r7, r0)
            if (r6 != r1) goto L_0x0062
            goto L_0x0064
        L_0x0062:
            jue r1 = jue.a
        L_0x0064:
            return r1
        L_0x0065:
            boolean r0 = r8 instanceof xl5
            if (r0 == 0) goto L_0x0078
            r0 = r8
            xl5 r0 = (xl5) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0078
            int r1 = r1 - r2
            r0.X = r1
            goto L_0x007d
        L_0x0078:
            xl5 r0 = new xl5
            r0.<init>(r6, r8)
        L_0x007d:
            java.lang.Object r8 = r0.o
            pu3 r1 = pu3.a
            int r2 = r0.X
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x009d
            if (r2 == r4) goto L_0x0097
            if (r2 != r3) goto L_0x008f
            wx3.H(r8)
            goto L_0x00be
        L_0x008f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0097:
            rj5 r6 = r0.Y
            wx3.H(r8)
            goto L_0x00b2
        L_0x009d:
            wx3.H(r8)
            rj5 r8 = r6.b
            r0.Y = r8
            r0.X = r4
            i26 r6 = r6.c
            java.lang.Object r6 = r6.invoke(r7, r0)
            if (r6 != r1) goto L_0x00af
            goto L_0x00c0
        L_0x00af:
            r5 = r8
            r8 = r6
            r6 = r5
        L_0x00b2:
            r7 = 0
            r0.Y = r7
            r0.X = r3
            java.lang.Object r6 = r6.a(r8, r0)
            if (r6 != r1) goto L_0x00be
            goto L_0x00c0
        L_0x00be:
            jue r1 = jue.a
        L_0x00c0:
            return r1
        L_0x00c1:
            boolean r0 = r8 instanceof tl5
            if (r0 == 0) goto L_0x00d4
            r0 = r8
            tl5 r0 = (tl5) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x00d4
            int r1 = r1 - r2
            r0.Y = r1
            goto L_0x00d9
        L_0x00d4:
            tl5 r0 = new tl5
            r0.<init>(r6, r8)
        L_0x00d9:
            java.lang.Object r8 = r0.X
            pu3 r1 = pu3.a
            int r2 = r0.Y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x00fd
            if (r2 == r4) goto L_0x00f5
            if (r2 != r3) goto L_0x00ed
            bk5 r6 = r0.o
            wx3.H(r8)
            goto L_0x0128
        L_0x00ed:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x00f5:
            java.lang.Object r7 = r0.w0
            bk5 r6 = r0.o
            wx3.H(r8)
            goto L_0x010f
        L_0x00fd:
            wx3.H(r8)
            r0.o = r6
            r0.w0 = r7
            r0.Y = r4
            i26 r8 = r6.c
            java.lang.Object r8 = r8.invoke(r7, r0)
            if (r8 != r1) goto L_0x010f
            goto L_0x012c
        L_0x010f:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x0127
            rj5 r8 = r6.b
            r0.o = r6
            r2 = 0
            r0.w0 = r2
            r0.Y = r3
            java.lang.Object r7 = r8.a(r7, r0)
            if (r7 != r1) goto L_0x0128
            goto L_0x012c
        L_0x0127:
            r4 = 0
        L_0x0128:
            if (r4 == 0) goto L_0x012d
            jue r1 = jue.a
        L_0x012c:
            return r1
        L_0x012d:
            kotlinx.coroutines.flow.internal.AbortFlowException r7 = new kotlinx.coroutines.flow.internal.AbortFlowException
            r7.<init>(r6)
            throw r7
        L_0x0133:
            boolean r0 = r8 instanceof defpackage.gk5
            if (r0 == 0) goto L_0x0146
            r0 = r8
            gk5 r0 = (defpackage.gk5) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0146
            int r1 = r1 - r2
            r0.X = r1
            goto L_0x014b
        L_0x0146:
            gk5 r0 = new gk5
            r0.<init>(r6, r8)
        L_0x014b:
            java.lang.Object r8 = r0.o
            pu3 r1 = pu3.a
            int r2 = r0.X
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x016d
            if (r2 == r4) goto L_0x0165
            if (r2 != r3) goto L_0x015d
            wx3.H(r8)
            goto L_0x019a
        L_0x015d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0165:
            rj5 r6 = r0.Z
            java.lang.Object r7 = r0.Y
            wx3.H(r8)
            goto L_0x0184
        L_0x016d:
            wx3.H(r8)
            r0.Y = r7
            rj5 r8 = r6.b
            r0.Z = r8
            r0.X = r4
            i26 r6 = r6.c
            java.lang.Object r6 = r6.invoke(r7, r0)
            if (r6 != r1) goto L_0x0181
            goto L_0x019c
        L_0x0181:
            r5 = r8
            r8 = r6
            r6 = r5
        L_0x0184:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x019a
            r8 = 0
            r0.Y = r8
            r0.Z = r8
            r0.X = r3
            java.lang.Object r6 = r6.a(r7, r0)
            if (r6 != r1) goto L_0x019a
            goto L_0x019c
        L_0x019a:
            jue r1 = jue.a
        L_0x019c:
            return r1
        L_0x019d:
            boolean r0 = r8 instanceof defpackage.ak5
            if (r0 == 0) goto L_0x01b0
            r0 = r8
            ak5 r0 = (defpackage.ak5) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x01b0
            int r1 = r1 - r2
            r0.X = r1
            goto L_0x01b5
        L_0x01b0:
            ak5 r0 = new ak5
            r0.<init>(r6, r8)
        L_0x01b5:
            java.lang.Object r8 = r0.o
            pu3 r1 = pu3.a
            int r2 = r0.X
            r3 = 1
            if (r2 == 0) goto L_0x01cc
            if (r2 != r3) goto L_0x01c4
            wx3.H(r8)
            goto L_0x01fb
        L_0x01c4:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x01cc:
            wx3.H(r8)
            java.util.List r7 = (java.util.List) r7
            java.util.Iterator r7 = r7.iterator()
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x01fe
            java.lang.Object r8 = r7.next()
        L_0x01df:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x01f0
            i26 r2 = r6.c
            java.lang.Object r4 = r7.next()
            java.lang.Object r8 = r2.invoke(r8, r4)
            goto L_0x01df
        L_0x01f0:
            r0.X = r3
            rj5 r6 = r6.b
            java.lang.Object r6 = r6.a(r8, r0)
            if (r6 != r1) goto L_0x01fb
            goto L_0x01fd
        L_0x01fb:
            jue r1 = jue.a
        L_0x01fd:
            return r1
        L_0x01fe:
            java.lang.UnsupportedOperationException r6 = new java.lang.UnsupportedOperationException
            java.lang.String r7 = "Empty collection can't be reduced."
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bk5.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public bk5(i26 i26, rj5 rj5) {
        this.a = 2;
        this.c = i26;
        this.b = rj5;
    }
}
