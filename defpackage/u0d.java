package defpackage;

import java.util.Collections;

/* renamed from: u0d  reason: default package */
public final class u0d extends f1d {
    public final /* synthetic */ int D0 = 0;
    public final long E0;

    public u0d(long j, long j2) {
        super(new t0d(j, j2, 0));
        this.E0 = j2;
    }

    /* JADX WARNING: type inference failed for: r13v3, types: [ugd] */
    /* JADX WARNING: type inference failed for: r13v5, types: [g5f] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x013d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void x() {
        /*
            r28 = this;
            r0 = r28
            r1 = 1
            int r2 = r0.D0
            switch(r2) {
                case 0: goto L_0x000c;
                default: goto L_0x0008;
            }
        L_0x0008:
            super.x()
            return
        L_0x000c:
            to8 r2 = r28.n()
            long r3 = r0.E0
            vo8 r2 = r2.q(r3)
            if (r2 == 0) goto L_0x01f7
            ls8 r5 = defpackage.ls8.DELETED
            ls8 r6 = r2.z0
            if (r6 != r5) goto L_0x0020
            goto L_0x01f7
        L_0x0020:
            t52 r5 = r28.b()
            long r6 = r0.c
            i22 r5 = r5.B(r6)
            if (r5 != 0) goto L_0x003e
            g15 r0 = r28.j()
            ru.ok.tamtam.util.HandledException r2 = new ru.ok.tamtam.util.HandledException
            java.lang.String r3 = "chat is null"
            r2.<init>(r3)
            r4a r0 = (r4a) r0
            r0.c(r2, r1)
            goto L_0x01fe
        L_0x003e:
            boolean r6 = r2.m()
            if (r6 == 0) goto L_0x01cd
            boolean r6 = r2.o()
            if (r6 != 0) goto L_0x01cd
            jj7 r6 = r2.D0
            if (r6 == 0) goto L_0x01cd
            java.lang.Object r6 = r6.a
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L_0x01cd
            java.util.Iterator r6 = r6.iterator()
        L_0x0058:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x01cd
            java.lang.Object r8 = r6.next()
            o10 r8 = (defpackage.o10) r8
            a10 r9 = r8.b
            if (r9 == 0) goto L_0x0077
            java.lang.String r9 = r9.Z
            if (r9 == 0) goto L_0x0077
            int r9 = r9.length()
            if (r9 != 0) goto L_0x0073
            goto L_0x0077
        L_0x0073:
            r27 = r6
            goto L_0x01c8
        L_0x0077:
            d0d r9 = r0.a
            if (r9 == 0) goto L_0x007c
            goto L_0x007d
        L_0x007c:
            r9 = 0
        L_0x007d:
            t97 r9 = r9.r
            java.lang.Object r9 = r9.getValue()
            xod r9 = (defpackage.xod) r9
            r9.getClass()
            j10 r10 = r8.a
            r11 = -1
            if (r10 != 0) goto L_0x008f
            r12 = r11
            goto L_0x0097
        L_0x008f:
            int[] r12 = defpackage.wod.$EnumSwitchMapping$1
            int r13 = r10.ordinal()
            r12 = r12[r13]
        L_0x0097:
            r13 = 2
            r14 = 3
            r15 = 11
            n10 r7 = r8.d
            if (r12 == r1) goto L_0x00c8
            if (r12 == r13) goto L_0x00ad
            if (r12 == r14) goto L_0x00ab
            r11 = 4
            if (r12 == r11) goto L_0x00a9
            r13 = 0
            goto L_0x0126
        L_0x00a9:
            r11 = 7
            goto L_0x00c9
        L_0x00ab:
            r11 = r13
            goto L_0x00c9
        L_0x00ad:
            int r12 = r7.b
            if (r12 != 0) goto L_0x00b2
            goto L_0x00ba
        L_0x00b2:
            int[] r11 = defpackage.wod.$EnumSwitchMapping$0
            int r12 = hr1.t(r12)
            r11 = r11[r12]
        L_0x00ba:
            if (r11 == r1) goto L_0x00c6
            if (r11 != r13) goto L_0x00c0
            r11 = r15
            goto L_0x00c9
        L_0x00c0:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x00c6:
            r11 = r14
            goto L_0x00c9
        L_0x00c8:
            r11 = r1
        L_0x00c9:
            java.lang.String r12 = r8.r
            if (r11 == r14) goto L_0x00cf
            if (r11 != r15) goto L_0x00f5
        L_0x00cf:
            m10 r15 = r7.l
            if (r15 == 0) goto L_0x00f5
            g5f r13 = new g5f
            l10 r14 = new l10
            r14.<init>(r1)
            qjb r1 = r15.c
            r14.a = r1
            float r1 = r15.a
            r14.b = r1
            float r1 = r15.b
            r14.c = r1
            boolean r1 = r15.d
            r14.d = r1
            f3f r1 = new f3f
            r1.<init>(r14)
            java.lang.String r7 = r7.d
            r13.<init>(r11, r12, r1, r7)
            goto L_0x0126
        L_0x00f5:
            if (r11 != r1) goto L_0x0121
            a10 r1 = r8.b
            java.lang.String r7 = r1.y0
            boolean r7 = r1g.p(r7)
            if (r7 != 0) goto L_0x0121
            r65 r13 = new r65
            java.lang.String r23 = r1.a()
            java.lang.String r7 = r8.r
            int r11 = r1.c
            java.lang.String r12 = r1.x0
            int r14 = r1.o
            java.lang.String r1 = r1.y0
            r17 = r13
            r18 = r12
            r19 = r11
            r20 = r14
            r21 = r7
            r22 = r1
            r17.<init>(r18, r19, r20, r21, r22, r23)
            goto L_0x0126
        L_0x0121:
            ugd r13 = new ugd
            r13.<init>(r11, r12)
        L_0x0126:
            if (r13 != 0) goto L_0x013d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r7 = "skipped for type "
            r1.<init>(r7)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            java.lang.String r7 = defpackage.xod.f
            udd.U(r7, r1)
            goto L_0x0073
        L_0x013d:
            boolean r1 = r13 instanceof defpackage.r65
            k77[] r7 = defpackage.xod.e
            nj4 r11 = r9.a
            long r14 = r0.c
            r17 = r11
            long r10 = r0.E0
            java.lang.String r8 = r8.q
            if (r1 == 0) goto L_0x019a
            r1 = 0
            r1 = r7[r1]
            java.lang.Object r1 = r17.get()
            to8 r1 = (defpackage.to8) r1
            lpa r12 = new lpa
            r27 = r6
            r6 = 27
            r12.<init>(r6)
            r1.v(r10, r8, r12)
            r1 = 1
            r6 = r7[r1]
            nj4 r6 = r9.b
            java.lang.Object r6 = r6.get()
            luf r6 = (defpackage.luf) r6
            t65 r12 = new t65
            r16 = 3
            r7 = r7[r16]
            nj4 r7 = r9.d
            java.lang.Object r7 = r7.get()
            f03 r7 = (defpackage.f03) r7
            lqc r7 = (defpackage.lqc) r7
            long r18 = r7.n()
            r65 r13 = (defpackage.r65) r13
            java.lang.String r7 = r13.Y
            java.lang.String r9 = r13.b
            r17 = r12
            r20 = r9
            r21 = r8
            r22 = r10
            r24 = r14
            r26 = r7
            r17.<init>(r18, r20, r21, r22, r24, r26)
            r6.b(r12)
            goto L_0x01c8
        L_0x019a:
            r27 = r6
            r1 = 1
            r6 = 0
            r6 = r7[r6]
            java.lang.Object r6 = r17.get()
            to8 r6 = (defpackage.to8) r6
            lpa r12 = new lpa
            r1 = 28
            r12.<init>(r1)
            r6.v(r10, r8, r12)
            r1 = 2
            r1 = r7[r1]
            nj4 r1 = r9.c
            java.lang.Object r1 = r1.get()
            r17 = r1
            uc5 r17 = (defpackage.uc5) r17
            r18 = r13
            r19 = r10
            r21 = r14
            r23 = r8
            r17.c(r18, r19, r21, r23)
        L_0x01c8:
            r6 = r27
            r1 = 1
            goto L_0x0058
        L_0x01cd:
            to8 r1 = r28.n()
            bp8 r6 = defpackage.bp8.SENDING
            r1.x(r2, r6)
            r0.z(r3, r5)
            d0d r1 = r0.a
            if (r1 == 0) goto L_0x01df
            r7 = r1
            goto L_0x01e0
        L_0x01df:
            r7 = 0
        L_0x01e0:
            t97 r1 = r7.c
            java.lang.Object r1 = r1.getValue()
            tt0 r1 = (tt0) r1
            ove r8 = new ove
            long r5 = r0.E0
            r7 = 0
            long r3 = r0.c
            r2 = r8
            r2.<init>(r3, r5, r7)
            r1.c(r8)
            goto L_0x01fe
        L_0x01f7:
            java.lang.String r0 = "u0d"
            java.lang.String r1 = "process: skip deleted message"
            udd.q(r0, r1)
        L_0x01fe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u0d.x():void");
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [java.lang.Object, m00] */
    /* JADX WARNING: type inference failed for: r0v8, types: [java.lang.Object, p10] */
    public final uo8 y() {
        switch (this.D0) {
            case 0:
                return null;
            default:
                d0d d0d = this.a;
                if (d0d == null) {
                    d0d = null;
                }
                i10 s = fu7.s((osd) ((zsd) d0d.j.getValue()).a.get(Long.valueOf(this.E0)));
                ? obj = new Object();
                obj.f = s;
                obj.a = j10.Y;
                o10 a = obj.a();
                ? obj2 = new Object();
                obj2.a = Collections.singletonList(a);
                jj7 c = obj2.c();
                uo8 uo8 = new uo8();
                uo8.n = c;
                return uo8;
        }
    }

    public u0d(t0d t0d) {
        super(t0d);
        this.E0 = t0d.m;
    }
}
