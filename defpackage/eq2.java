package defpackage;

/* renamed from: eq2  reason: default package */
public final class eq2 {
    public final f03 a;

    public eq2(f03 f03) {
        this.a = f03;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:133:0x01c1, code lost:
        if (r0 != false) goto L_0x01c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x01e3, code lost:
        if (r0 != false) goto L_0x01c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0200, code lost:
        if (r0 != false) goto L_0x01c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x021c, code lost:
        if (r0 != false) goto L_0x01c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x022b, code lost:
        if (r0 != false) goto L_0x01c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x023a, code lost:
        if (r0 != false) goto L_0x01c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        r0 = r10.k();
     */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x00b5 A[EDGE_INSN: B:198:0x00b5->B:58:0x00b5 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00e6 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(java.util.Set r8, java.util.Map r9, defpackage.i22 r10) {
        /*
            r7 = this;
            boolean r0 = r8.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            r72 r0 = defpackage.r72.Z
            boolean r0 = r8.contains(r0)
            r2 = 1
            if (r0 == 0) goto L_0x0017
            boolean r0 = r10.J()
            if (r0 != 0) goto L_0x0019
        L_0x0017:
            r0 = r1
            goto L_0x002c
        L_0x0019:
            tf3 r0 = r10.k()
            if (r0 == 0) goto L_0x0017
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x0017
            boolean r0 = r10.F()
            if (r0 != 0) goto L_0x0017
            r0 = r2
        L_0x002c:
            if (r0 != 0) goto L_0x0055
            r72 r0 = defpackage.r72.w0
            boolean r0 = r8.contains(r0)
            if (r0 == 0) goto L_0x003c
            boolean r0 = r10.J()
            if (r0 != 0) goto L_0x003e
        L_0x003c:
            r0 = r1
            goto L_0x0055
        L_0x003e:
            tf3 r0 = r10.k()
            if (r0 == 0) goto L_0x003c
            oi3 r0 = r0.a
            ni3 r0 = r0.c
            mi3 r0 = r0.k
            mi3 r3 = defpackage.mi3.b
            if (r0 != r3) goto L_0x003c
            boolean r0 = r10.F()
            if (r0 != 0) goto L_0x003c
            r0 = r2
        L_0x0055:
            if (r0 != 0) goto L_0x0068
            r72 r0 = defpackage.r72.x0
            boolean r0 = r8.contains(r0)
            if (r0 == 0) goto L_0x0067
            boolean r0 = r10.F()
            if (r0 == 0) goto L_0x0067
            r0 = r2
            goto L_0x0068
        L_0x0067:
            r0 = r1
        L_0x0068:
            if (r0 != 0) goto L_0x007d
            r72 r0 = defpackage.r72.o
            boolean r0 = r8.contains(r0)
            if (r0 == 0) goto L_0x007a
            boolean r0 = r10.G()
            if (r0 == 0) goto L_0x007a
            r0 = r2
            goto L_0x007b
        L_0x007a:
            r0 = r1
        L_0x007b:
            r3 = r0
            goto L_0x007e
        L_0x007d:
            r3 = r1
        L_0x007e:
            if (r0 != 0) goto L_0x00ec
            r72 r0 = defpackage.r72.X
            boolean r0 = r8.contains(r0)
            if (r0 == 0) goto L_0x00b9
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x008f
            goto L_0x00a8
        L_0x008f:
            java.util.Iterator r0 = r8.iterator()
        L_0x0093:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x00a8
            java.lang.Object r4 = r0.next()
            r72 r4 = (defpackage.r72) r4
            java.util.LinkedHashSet r5 = defpackage.r72.b
            boolean r4 = r5.contains(r4)
            if (r4 == 0) goto L_0x0093
            goto L_0x00b9
        L_0x00a8:
            boolean r0 = r10.H()
            if (r0 != 0) goto L_0x00b7
            boolean r0 = r10.N()
            if (r0 == 0) goto L_0x00b5
            goto L_0x00b7
        L_0x00b5:
            r0 = r1
            goto L_0x00e4
        L_0x00b7:
            r0 = r2
            goto L_0x00e4
        L_0x00b9:
            r72 r0 = defpackage.r72.X
            boolean r0 = r8.contains(r0)
            if (r0 == 0) goto L_0x00b5
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x00c8
            goto L_0x00b5
        L_0x00c8:
            java.util.Iterator r0 = r8.iterator()
        L_0x00cc:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x00b5
            java.lang.Object r4 = r0.next()
            r72 r4 = (defpackage.r72) r4
            java.util.LinkedHashSet r5 = defpackage.r72.b
            boolean r4 = r5.contains(r4)
            if (r4 == 0) goto L_0x00cc
            boolean r0 = r10.H()
        L_0x00e4:
            if (r3 != 0) goto L_0x00eb
            if (r0 == 0) goto L_0x00e9
            goto L_0x00eb
        L_0x00e9:
            r3 = r1
            goto L_0x00ec
        L_0x00eb:
            r3 = r2
        L_0x00ec:
            if (r0 != 0) goto L_0x00ff
            r72 r0 = defpackage.r72.Y
            boolean r0 = r8.contains(r0)
            if (r0 == 0) goto L_0x00fe
            boolean r0 = r10.J()
            if (r0 == 0) goto L_0x00fe
            r0 = r2
            goto L_0x00ff
        L_0x00fe:
            r0 = r1
        L_0x00ff:
            boolean r4 = r8.isEmpty()
            if (r4 == 0) goto L_0x0106
            goto L_0x011f
        L_0x0106:
            java.util.Iterator r4 = r8.iterator()
        L_0x010a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x011f
            java.lang.Object r5 = r4.next()
            r72 r5 = (defpackage.r72) r5
            java.util.LinkedHashSet r6 = defpackage.r72.c
            boolean r5 = r6.contains(r5)
            if (r5 == 0) goto L_0x010a
            goto L_0x0120
        L_0x011f:
            r0 = r2
        L_0x0120:
            boolean r4 = r8.isEmpty()
            if (r4 == 0) goto L_0x0127
            goto L_0x0183
        L_0x0127:
            java.util.Iterator r4 = r8.iterator()
        L_0x012b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0183
            java.lang.Object r5 = r4.next()
            r72 r5 = (defpackage.r72) r5
            java.util.LinkedHashSet r6 = defpackage.r72.b
            boolean r5 = r6.contains(r5)
            if (r5 == 0) goto L_0x012b
            if (r3 == 0) goto L_0x0183
            r72 r3 = defpackage.r72.z0
            boolean r4 = r8.contains(r3)
            if (r4 == 0) goto L_0x0163
            r72 r4 = defpackage.r72.y0
            boolean r4 = r8.contains(r4)
            if (r4 == 0) goto L_0x0163
            boolean r3 = r10.Y()
            if (r3 != 0) goto L_0x015d
            boolean r3 = r10.a0()
            if (r3 == 0) goto L_0x0161
        L_0x015d:
            if (r0 == 0) goto L_0x0161
        L_0x015f:
            r0 = r2
            goto L_0x0183
        L_0x0161:
            r0 = r1
            goto L_0x0183
        L_0x0163:
            r72 r4 = defpackage.r72.y0
            boolean r4 = r8.contains(r4)
            if (r4 == 0) goto L_0x0174
            boolean r3 = r10.a0()
            if (r3 == 0) goto L_0x0161
            if (r0 == 0) goto L_0x0161
            goto L_0x015f
        L_0x0174:
            boolean r3 = r8.contains(r3)
            if (r3 == 0) goto L_0x0161
            boolean r3 = r10.Y()
            if (r3 == 0) goto L_0x0161
            if (r0 == 0) goto L_0x0161
            goto L_0x015f
        L_0x0183:
            boolean r3 = r8.isEmpty()
            o62 r4 = r10.b
            if (r3 == 0) goto L_0x018d
            goto L_0x023d
        L_0x018d:
            java.util.Iterator r3 = r8.iterator()
        L_0x0191:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x023d
            java.lang.Object r5 = r3.next()
            r72 r5 = (defpackage.r72) r5
            java.util.LinkedHashSet r6 = defpackage.r72.a
            boolean r5 = r6.contains(r5)
            if (r5 == 0) goto L_0x0191
            r72 r3 = defpackage.r72.A0
            boolean r5 = r8.contains(r3)
            if (r5 == 0) goto L_0x01c9
            r72 r5 = defpackage.r72.B0
            boolean r5 = r8.contains(r5)
            if (r5 == 0) goto L_0x01c9
            r72 r5 = defpackage.r72.C0
            boolean r5 = r8.contains(r5)
            if (r5 == 0) goto L_0x01c9
            int r7 = r4.m
            if (r7 <= 0) goto L_0x01c6
            if (r0 == 0) goto L_0x01c6
        L_0x01c3:
            r0 = r2
            goto L_0x023d
        L_0x01c6:
            r0 = r1
            goto L_0x023d
        L_0x01c9:
            boolean r5 = r8.contains(r3)
            f03 r7 = r7.a
            if (r5 == 0) goto L_0x01e6
            r72 r5 = defpackage.r72.C0
            boolean r5 = r8.contains(r5)
            if (r5 == 0) goto L_0x01e6
            int r3 = r4.m
            if (r3 <= 0) goto L_0x01c6
            boolean r7 = r10.S(r7)
            if (r7 == 0) goto L_0x01c6
            if (r0 == 0) goto L_0x01c6
            goto L_0x01c3
        L_0x01e6:
            r72 r5 = defpackage.r72.B0
            boolean r6 = r8.contains(r5)
            if (r6 == 0) goto L_0x0203
            r72 r6 = defpackage.r72.C0
            boolean r6 = r8.contains(r6)
            if (r6 == 0) goto L_0x0203
            int r3 = r4.m
            if (r3 <= 0) goto L_0x01c6
            boolean r7 = r10.S(r7)
            if (r7 != 0) goto L_0x01c6
            if (r0 == 0) goto L_0x01c6
            goto L_0x01c3
        L_0x0203:
            boolean r6 = r8.contains(r3)
            if (r6 == 0) goto L_0x0210
            boolean r6 = r8.contains(r5)
            if (r6 == 0) goto L_0x0210
            goto L_0x023d
        L_0x0210:
            boolean r5 = r8.contains(r5)
            if (r5 == 0) goto L_0x021f
            boolean r7 = r10.S(r7)
            if (r7 != 0) goto L_0x01c6
            if (r0 == 0) goto L_0x01c6
            goto L_0x01c3
        L_0x021f:
            boolean r3 = r8.contains(r3)
            if (r3 == 0) goto L_0x022e
            boolean r7 = r10.S(r7)
            if (r7 == 0) goto L_0x01c6
            if (r0 == 0) goto L_0x01c6
            goto L_0x01c3
        L_0x022e:
            r72 r7 = defpackage.r72.C0
            boolean r7 = r8.contains(r7)
            if (r7 == 0) goto L_0x023d
            int r7 = r4.m
            if (r7 <= 0) goto L_0x01c6
            if (r0 == 0) goto L_0x01c6
            goto L_0x01c3
        L_0x023d:
            r72 r7 = defpackage.r72.D0
            boolean r7 = r8.contains(r7)
            if (r7 == 0) goto L_0x024e
            if (r0 == 0) goto L_0x024d
            boolean r7 = r4.k0
            if (r7 == 0) goto L_0x024d
            r0 = r2
            goto L_0x024e
        L_0x024d:
            r0 = r1
        L_0x024e:
            g62 r7 = r4.C
            if (r0 != 0) goto L_0x027b
            if (r7 == 0) goto L_0x027b
            r72 r10 = defpackage.r72.E0
            java.lang.Object r9 = r9.get(r10)
            boolean r3 = r9 instanceof long[]
            if (r3 == 0) goto L_0x0261
            long[] r9 = (long[]) r9
            goto L_0x0262
        L_0x0261:
            r9 = 0
        L_0x0262:
            if (r9 == 0) goto L_0x027b
            boolean r8 = r8.contains(r10)
            if (r8 == 0) goto L_0x027b
            long[] r7 = r7.b
            int r8 = r7.length
        L_0x026d:
            if (r1 >= r8) goto L_0x027b
            r3 = r7[r1]
            boolean r10 = cs.M(r9, r3)
            if (r10 == 0) goto L_0x0278
            goto L_0x027c
        L_0x0278:
            int r1 = r1 + 1
            goto L_0x026d
        L_0x027b:
            r2 = r0
        L_0x027c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eq2.a(java.util.Set, java.util.Map, i22):boolean");
    }
}
