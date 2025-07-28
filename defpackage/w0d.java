package defpackage;

/* renamed from: w0d  reason: default package */
public final class w0d extends f1d {
    public final String D0;
    public final long E0;
    public final int F0;
    public final String G0;
    public final String H0;

    public w0d(v0d v0d) {
        super(v0d);
        this.D0 = v0d.l;
        this.E0 = v0d.m;
        this.F0 = v0d.n;
        this.G0 = v0d.o;
        this.H0 = v0d.p;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, p10] */
    /* JADX WARNING: type inference failed for: r3v0, types: [p00, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v4, types: [java.lang.Object, m00] */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0133, code lost:
        if (r1g.p(r8) == false) goto L_0x0158;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0154, code lost:
        if (r1g.p(r8) == false) goto L_0x0158;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.uo8 y() {
        /*
            r17 = this;
            r1 = r17
            p10 r2 = new p10
            r2.<init>()
            p00 r3 = new p00
            r3.<init>()
            long r4 = r1.E0
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0016
            r8 = r4
            goto L_0x0017
        L_0x0016:
            r8 = r6
        L_0x0017:
            r3.b = r8
            java.lang.String r8 = r1.D0
            boolean r9 = r1g.p(r8)
            r10 = 0
            if (r9 != 0) goto L_0x0024
            goto L_0x0158
        L_0x0024:
            if (r0 <= 0) goto L_0x0136
            d0d r0 = r1.a
            if (r0 == 0) goto L_0x002b
            goto L_0x002c
        L_0x002b:
            r0 = r10
        L_0x002c:
            t97 r0 = r0.A
            java.lang.Object r0 = r0.getValue()
            u98 r0 = (defpackage.u98) r0
            d0d r8 = r1.a
            if (r8 == 0) goto L_0x0039
            goto L_0x003a
        L_0x0039:
            r8 = r10
        L_0x003a:
            t97 r8 = r8.i
            java.lang.Object r8 = r8.getValue()
            di3 r8 = (defpackage.di3) r8
            d0d r9 = r1.a
            if (r9 == 0) goto L_0x0047
            goto L_0x0048
        L_0x0047:
            r9 = r10
        L_0x0048:
            t97 r9 = r9.C
            java.lang.Object r9 = r9.getValue()
            oec r9 = (defpackage.oec) r9
            xh0 r0 = (defpackage.xh0) r0
            ydc r0 = r0.e
            r0.getClass()
            java.lang.Object r11 = r0.c
            zz9 r11 = (zz9) r11
            java.lang.Long r12 = java.lang.Long.valueOf(r4)
            java.lang.Object[] r12 = new java.lang.Object[]{r12}
            java.lang.String r13 = "getVcfByContactId: contactId %d"
            java.lang.String r14 = "ydc"
            udd.p(r14, r13, r12)
            t97 r12 = r11.a     // Catch:{ Exception -> 0x0082 }
            java.lang.Object r12 = r12.getValue()     // Catch:{ Exception -> 0x0082 }
            qna r12 = (defpackage.qna) r12     // Catch:{ Exception -> 0x0082 }
            java.lang.String[] r13 = defpackage.qna.f     // Catch:{ Exception -> 0x0082 }
            boolean r12 = r12.b(r13)     // Catch:{ Exception -> 0x0082 }
            if (r12 != 0) goto L_0x0085
            java.lang.String r0 = "getVcfByContactId: no permissions for contacts"
            udd.s(r14, r0, r10)     // Catch:{ Exception -> 0x0082 }
        L_0x007f:
            r8 = r10
            goto L_0x012f
        L_0x0082:
            r0 = move-exception
            goto L_0x011a
        L_0x0085:
            if (r8 != 0) goto L_0x008c
            java.lang.String r12 = "Contact controller is null"
            udd.s(r14, r12, r10)     // Catch:{ Exception -> 0x0082 }
        L_0x008c:
            r12 = 0
            tf3 r8 = r8.i(r4, r12)     // Catch:{ Exception -> 0x0082 }
            if (r8 != 0) goto L_0x00a1
            java.lang.String r0 = "getVcfByContactId: no contact found for id %d"
            java.lang.Long r6 = java.lang.Long.valueOf(r4)     // Catch:{ Exception -> 0x0082 }
            java.lang.Object[] r6 = new java.lang.Object[]{r6}     // Catch:{ Exception -> 0x0082 }
            udd.t(r14, r0, r6)     // Catch:{ Exception -> 0x0082 }
            goto L_0x007f
        L_0x00a1:
            long r15 = r8.o()     // Catch:{ Exception -> 0x0082 }
            int r6 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r6 > 0) goto L_0x00b7
            java.lang.String r0 = "getVcfByContactId: no server phone for contact id %d"
            java.lang.Long r6 = java.lang.Long.valueOf(r4)     // Catch:{ Exception -> 0x0082 }
            java.lang.Object[] r6 = new java.lang.Object[]{r6}     // Catch:{ Exception -> 0x0082 }
            udd.t(r14, r0, r6)     // Catch:{ Exception -> 0x0082 }
            goto L_0x007f
        L_0x00b7:
            long r6 = r8.o()     // Catch:{ Exception -> 0x0082 }
            java.lang.String r8 = "getVcfByServerPhone: no phoneDb found with server phone "
            t97 r11 = r11.a     // Catch:{ Exception -> 0x00d2 }
            java.lang.Object r11 = r11.getValue()     // Catch:{ Exception -> 0x00d2 }
            qna r11 = (defpackage.qna) r11     // Catch:{ Exception -> 0x00d2 }
            boolean r11 = r11.b(r13)     // Catch:{ Exception -> 0x00d2 }
            if (r11 != 0) goto L_0x00d4
            java.lang.String r0 = "getVcfByServerPhone: no permissions for contacts"
            udd.s(r14, r0, r10)     // Catch:{ Exception -> 0x00d2 }
        L_0x00d0:
            r0 = r10
            goto L_0x0118
        L_0x00d2:
            r0 = move-exception
            goto L_0x0104
        L_0x00d4:
            r9.getClass()     // Catch:{ Exception -> 0x00d2 }
            java.lang.Long r11 = java.lang.Long.valueOf(r6)     // Catch:{ Exception -> 0x00d2 }
            java.util.List r11 = java.util.Collections.singletonList(r11)     // Catch:{ Exception -> 0x00d2 }
            java.util.ArrayList r9 = r9.f(r11)     // Catch:{ Exception -> 0x00d2 }
            java.lang.Object r9 = o23.X(r9)     // Catch:{ Exception -> 0x00d2 }
            ioa r9 = (defpackage.ioa) r9     // Catch:{ Exception -> 0x00d2 }
            if (r9 != 0) goto L_0x00fd
            java.util.Locale r0 = java.util.Locale.ENGLISH     // Catch:{ Exception -> 0x00d2 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00d2 }
            r0.<init>(r8)     // Catch:{ Exception -> 0x00d2 }
            r0.append(r6)     // Catch:{ Exception -> 0x00d2 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00d2 }
            udd.s(r14, r0, r10)     // Catch:{ Exception -> 0x00d2 }
            goto L_0x00d0
        L_0x00fd:
            int r8 = r9.o     // Catch:{ Exception -> 0x00d2 }
            java.lang.String r0 = r0.B(r8)     // Catch:{ Exception -> 0x00d2 }
            goto L_0x0118
        L_0x0104:
            java.util.Locale r8 = java.util.Locale.ENGLISH     // Catch:{ Exception -> 0x0082 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0082 }
            java.lang.String r9 = "getVcfByServerPhone: exception for server phone "
            r8.<init>(r9)     // Catch:{ Exception -> 0x0082 }
            r8.append(r6)     // Catch:{ Exception -> 0x0082 }
            java.lang.String r6 = r8.toString()     // Catch:{ Exception -> 0x0082 }
            udd.s(r14, r6, r0)     // Catch:{ Exception -> 0x0082 }
            goto L_0x00d0
        L_0x0118:
            r8 = r0
            goto L_0x012f
        L_0x011a:
            java.util.Locale r6 = java.util.Locale.ENGLISH
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "getVcfByContactId: exception for contactId "
            r6.<init>(r7)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            udd.s(r14, r4, r0)
            goto L_0x007f
        L_0x012f:
            boolean r0 = r1g.p(r8)
            if (r0 != 0) goto L_0x0136
            goto L_0x0158
        L_0x0136:
            int r0 = r1.F0
            if (r0 <= 0) goto L_0x0157
            d0d r4 = r1.a
            if (r4 == 0) goto L_0x013f
            goto L_0x0140
        L_0x013f:
            r4 = r10
        L_0x0140:
            t97 r4 = r4.A
            java.lang.Object r4 = r4.getValue()
            u98 r4 = (defpackage.u98) r4
            xh0 r4 = (defpackage.xh0) r4
            ydc r4 = r4.e
            java.lang.String r8 = r4.B(r0)
            boolean r0 = r1g.p(r8)
            if (r0 != 0) goto L_0x0157
            goto L_0x0158
        L_0x0157:
            r8 = r10
        L_0x0158:
            r3.a = r8
            java.lang.String r0 = r1.H0
            boolean r4 = r1g.p(r0)
            if (r4 == 0) goto L_0x0163
            r0 = r10
        L_0x0163:
            r3.h = r0
            java.lang.String r0 = r1.G0
            boolean r1 = r1g.p(r0)
            if (r1 == 0) goto L_0x016f
            r1 = r10
            goto L_0x0170
        L_0x016f:
            r1 = r0
        L_0x0170:
            r3.c = r1
            boolean r1 = r1g.p(r0)
            if (r1 == 0) goto L_0x0179
            goto L_0x017a
        L_0x0179:
            r10 = r0
        L_0x017a:
            r3.d = r10
            q00 r0 = new q00
            r0.<init>(r3)
            m00 r1 = new m00
            r1.<init>()
            r1.s = r0
            j10 r0 = defpackage.j10.z0
            r1.a = r0
            o10 r0 = r1.a()
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r2.a = r0
            jj7 r0 = r2.c()
            uo8 r1 = new uo8
            r1.<init>()
            r1.n = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w0d.y():uo8");
    }
}
