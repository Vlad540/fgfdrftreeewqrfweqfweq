package defpackage;

/* renamed from: kxf  reason: default package */
public final class kxf implements ihc {
    public final /* synthetic */ gx0 a;

    public kxf(gx0 gx0) {
        this.a = gx0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(defpackage.hhc r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            gx0 r0 = r0.a
            r0.getClass()
            boolean r2 = r1 instanceof defpackage.nod
            if (r2 == 0) goto L_0x0015
            nod r1 = (defpackage.nod) r1
            java.util.List r1 = r1.a
            r0.N1 = r1
            goto L_0x016c
        L_0x0015:
            boolean r2 = r1 instanceof defpackage.x10
            pe1 r3 = r0.t1
            if (r2 == 0) goto L_0x0027
            r0 = r1
            x10 r0 = (defpackage.x10) r0
            java.util.List r0 = r0.a
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r3.q(r0)
            goto L_0x016c
        L_0x0027:
            boolean r2 = r1 instanceof defpackage.gmd
            if (r2 == 0) goto L_0x0035
            r0 = r1
            gmd r0 = (defpackage.gmd) r0
            ge1 r0 = r0.a
            r3.o(r0)
            goto L_0x016c
        L_0x0035:
            boolean r2 = r1 instanceof defpackage.bp6
            if (r2 == 0) goto L_0x004a
            bp6 r1 = (defpackage.bp6) r1
            java.util.Map r1 = r1.a
            java.util.HashMap r1 = (java.util.HashMap) r1
            gvf r0 = r0.H1
            java.lang.Object r0 = r0.b
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            r0.putAll(r1)
            goto L_0x016c
        L_0x004a:
            boolean r2 = r1 instanceof defpackage.y7f
            if (r2 == 0) goto L_0x006a
            e3 r0 = r0.Z1
            java.lang.Object r0 = r0.a
            c9 r0 = (c9) r0
            r0.getClass()
            mod r2 = new mod
            y7f r1 = (defpackage.y7f) r1
            x7f r1 = r1.a
            r3 = 6
            r2.<init>(r3, r1)
            java.lang.Object r0 = r0.b
            t7f r0 = (defpackage.t7f) r0
            r0.a(r2)
            goto L_0x016c
        L_0x006a:
            boolean r2 = r1 instanceof defpackage.zh9
            if (r2 == 0) goto L_0x015f
            zh9 r1 = (defpackage.zh9) r1
            fe1 r0 = r0.y0
            pe0 r0 = r0.A
            r3.getClass()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Map r1 = r1.a
            java.util.Set r4 = r1.keySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x0086:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0156
            java.lang.Object r5 = r4.next()
            ge1 r5 = (defpackage.ge1) r5
            ke1 r6 = r3.j(r5)
            java.lang.Object r5 = r1.get(r5)
            java.lang.Float r5 = (java.lang.Float) r5
            if (r6 == 0) goto L_0x0086
            if (r5 != 0) goto L_0x00a1
            goto L_0x0086
        L_0x00a1:
            float r5 = r5.floatValue()
            xh9 r7 = defpackage.xh9.a
            xh9 r8 = defpackage.xh9.c
            iw0 r9 = r0.a
            if (r9 == 0) goto L_0x0128
            xh9 r12 = r6.i
            double r13 = r9.b
            double r10 = r9.a
            r15 = r1
            r9 = r2
            double r1 = r13 + r10
            float r1 = (float) r1
            double r10 = r10 - r13
            float r2 = (float) r10
            if (r12 != r7) goto L_0x00c4
            int r10 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r10 >= 0) goto L_0x00c4
            r6.i = r8
        L_0x00c2:
            r10 = 1
            goto L_0x00ce
        L_0x00c4:
            if (r12 != r8) goto L_0x00cd
            int r10 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r10 < 0) goto L_0x00cd
            r6.i = r7
            goto L_0x00c2
        L_0x00cd:
            r10 = 0
        L_0x00ce:
            ne0 r11 = r0.d
            boolean r13 = r11.a
            if (r13 == 0) goto L_0x0125
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "last status: "
            r13.<init>(r14)
            java.lang.String r14 = r12.name()
            r13.append(r14)
            java.lang.String r14 = "; current check: "
            r13.append(r14)
            r13.append(r5)
            java.lang.String r14 = " "
            r13.append(r14)
            if (r12 != r7) goto L_0x00fa
            java.lang.String r1 = "< "
            r13.append(r1)
            r13.append(r2)
            goto L_0x010a
        L_0x00fa:
            if (r12 != r8) goto L_0x0105
            java.lang.String r2 = ">= "
            r13.append(r2)
            r13.append(r1)
            goto L_0x010a
        L_0x0105:
            java.lang.String r1 = "ERROR: INVALID STATE"
            r13.append(r1)
        L_0x010a:
            if (r10 == 0) goto L_0x011a
            java.lang.String r1 = "; PASSES, now "
            r13.append(r1)
            xh9 r1 = r6.i
            java.lang.String r1 = r1.name()
            r13.append(r1)
        L_0x011a:
            java.lang.String r1 = r13.toString()
            java.lang.String r2 = "CallParticipant"
            xwb r7 = r3.d
            r11.b(r7, r2, r1)
        L_0x0125:
            r6.h = r5
            goto L_0x014d
        L_0x0128:
            r15 = r1
            r9 = r2
            r1 = 1058642330(0x3f19999a, float:0.6)
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x0134
            r6.i = r7
            goto L_0x0142
        L_0x0134:
            r1 = 1050253722(0x3e99999a, float:0.3)
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x0140
            xh9 r1 = defpackage.xh9.b
            r6.i = r1
            goto L_0x0142
        L_0x0140:
            r6.i = r8
        L_0x0142:
            float r1 = r6.h
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x014a
            r10 = 1
            goto L_0x014b
        L_0x014a:
            r10 = 0
        L_0x014b:
            r6.h = r5
        L_0x014d:
            if (r10 == 0) goto L_0x0152
            r9.add(r6)
        L_0x0152:
            r2 = r9
            r1 = r15
            goto L_0x0086
        L_0x0156:
            r9 = r2
            ob1 r0 = r3.b
            yh9 r0 = r0.e
            r0.onCallParticipantNetworkStatusChanged(r9)
            goto L_0x016c
        L_0x015f:
            boolean r2 = r1 instanceof defpackage.oef
            if (r2 == 0) goto L_0x016c
            oef r1 = (defpackage.oef) r1
            g41 r2 = defpackage.g41.Y0
            g79 r1 = r1.a
            r0.k(r2, r1)
        L_0x016c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kxf.b(hhc):void");
    }
}
