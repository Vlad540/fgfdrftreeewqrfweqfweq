package defpackage;

/* renamed from: q0e  reason: default package */
public final class q0e extends b97 implements i26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0e(Object obj, boolean z, int i) {
        super(2);
        this.a = i;
        this.c = obj;
        this.b = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(java.lang.Object r12, java.lang.Object r13) {
        /*
            r11 = this;
            int r0 = r11.a
            switch(r0) {
                case 0: goto L_0x00eb;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            r0 = 0
            r7 = 0
            java.lang.Object r1 = r11.c
            r8 = r1
            java.util.List r8 = (java.util.List) r8
            boolean r11 = r11.b
            r1 = 1
            if (r11 != 0) goto L_0x0051
            int r2 = r8.size()
            if (r2 != r1) goto L_0x0051
            int r11 = r8.size()
            if (r11 == 0) goto L_0x0049
            if (r11 != r1) goto L_0x0041
            java.lang.Object r11 = r8.get(r0)
            java.lang.String r11 = (java.lang.String) r11
            r1 = 4
            int r12 = defpackage.h0e.a0(r12, r11, r13, r0, r1)
            if (r12 >= 0) goto L_0x0036
            goto L_0x00d4
        L_0x0036:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            wia r13 = new wia
            r13.<init>(r12, r11)
            goto L_0x00d5
        L_0x0041:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "List has more than one element."
            r11.<init>(r12)
            throw r11
        L_0x0049:
            java.util.NoSuchElementException r11 = new java.util.NoSuchElementException
            java.lang.String r12 = "List is empty."
            r11.<init>(r12)
            throw r11
        L_0x0051:
            fz6 r2 = new fz6
            if (r13 >= 0) goto L_0x0056
            r13 = r0
        L_0x0056:
            int r0 = r12.length()
            r2.<init>(r13, r0, r1)
            boolean r0 = r12 instanceof java.lang.String
            int r9 = r2.b
            if (r0 == 0) goto L_0x009d
            if (r13 <= r9) goto L_0x0067
            goto L_0x00d4
        L_0x0067:
            java.util.Iterator r0 = r8.iterator()
        L_0x006b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0089
            java.lang.Object r10 = r0.next()
            r4 = r10
            java.lang.String r4 = (java.lang.String) r4
            r5 = r12
            java.lang.String r5 = (java.lang.String) r5
            int r3 = r4.length()
            r1 = 0
            r2 = r13
            r6 = r11
            boolean r1 = defpackage.p0e.N(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L_0x006b
            goto L_0x008a
        L_0x0089:
            r10 = r7
        L_0x008a:
            java.lang.String r10 = (java.lang.String) r10
            if (r10 == 0) goto L_0x0098
            java.lang.Integer r11 = java.lang.Integer.valueOf(r13)
            wia r13 = new wia
            r13.<init>(r11, r10)
            goto L_0x00d5
        L_0x0098:
            if (r13 == r9) goto L_0x00d4
            int r13 = r13 + 1
            goto L_0x0067
        L_0x009d:
            if (r13 <= r9) goto L_0x00a0
            goto L_0x00d4
        L_0x00a0:
            java.util.Iterator r0 = r8.iterator()
        L_0x00a4:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00c0
            java.lang.Object r10 = r0.next()
            r1 = r10
            java.lang.String r1 = (java.lang.String) r1
            int r5 = r1.length()
            r2 = 0
            r3 = r12
            r4 = r13
            r6 = r11
            boolean r1 = defpackage.h0e.j0(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L_0x00a4
            goto L_0x00c1
        L_0x00c0:
            r10 = r7
        L_0x00c1:
            java.lang.String r10 = (java.lang.String) r10
            if (r10 == 0) goto L_0x00cf
            java.lang.Integer r11 = java.lang.Integer.valueOf(r13)
            wia r13 = new wia
            r13.<init>(r11, r10)
            goto L_0x00d5
        L_0x00cf:
            if (r13 == r9) goto L_0x00d4
            int r13 = r13 + 1
            goto L_0x00a0
        L_0x00d4:
            r13 = r7
        L_0x00d5:
            if (r13 == 0) goto L_0x00ea
            java.lang.Object r11 = r13.b
            java.lang.String r11 = (java.lang.String) r11
            int r11 = r11.length()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            wia r7 = new wia
            java.lang.Object r12 = r13.a
            r7.<init>(r12, r11)
        L_0x00ea:
            return r7
        L_0x00eb:
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            java.lang.Object r0 = r11.c
            char[] r0 = (char[]) r0
            boolean r11 = r11.b
            int r11 = defpackage.h0e.b0(r12, r0, r13, r11)
            if (r11 >= 0) goto L_0x0101
            r11 = 0
            goto L_0x0110
        L_0x0101:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r12 = 1
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            wia r13 = new wia
            r13.<init>(r11, r12)
            r11 = r13
        L_0x0110:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q0e.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
