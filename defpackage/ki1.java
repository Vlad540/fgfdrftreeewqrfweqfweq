package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ki1  reason: default package */
public final class ki1 extends l5e implements p26 {
    public /* synthetic */ zw3 X;
    public /* synthetic */ bka Y;
    public /* synthetic */ k11 Z;
    public /* synthetic */ eoc w0;
    public /* synthetic */ ea x0;
    public final /* synthetic */ aj1 y0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ki1(aj1 aj1, Continuation continuation) {
        super(6, continuation);
        this.y0 = aj1;
    }

    public final void k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        ki1 ki1 = new ki1(this.y0, (Continuation) obj6);
        ki1.X = (zw3) obj;
        ki1.Y = (bka) obj2;
        ki1.Z = (k11) obj3;
        ki1.w0 = (eoc) obj4;
        ki1.x0 = (ea) obj5;
        ki1.o(jue.a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0249 A[LOOP:0: B:4:0x0023->B:102:0x0249, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0246 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01de  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01f0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r41) {
        /*
            r40 = this;
            r0 = r40
            defpackage.wx3.H(r41)
            zw3 r1 = r0.X
            bka r2 = r0.Y
            k11 r3 = r0.Z
            eoc r4 = r0.w0
            ea r5 = r0.x0
            qja r6 = r2.a
            ne1 r6 = r6.a
            boolean r6 = r6.a()
            r7 = 0
            aj1 r0 = r0.y0
            if (r6 != 0) goto L_0x0021
            po1 r6 = r0.c
            r6.i(r7)
        L_0x0021:
            grd r6 = r0.B0
        L_0x0023:
            java.lang.Object r8 = r6.getValue()
            r9 = r8
            u81 r9 = (defpackage.u81) r9
            kv2 r10 = r0.X
            r10.c = r1
            r10.o = r2
            r10.X = r3
            r10.Y = r4
            r10.Z = r5
            b65 r11 = r9.e
            boolean r12 = r11 instanceof defpackage.v55
            if (r12 == 0) goto L_0x0048
        L_0x003c:
            r35 = r0
            r36 = r1
            r37 = r2
            r38 = r3
            r39 = r4
            goto L_0x0230
        L_0x0048:
            boolean r12 = r11 instanceof defpackage.u55
            java.lang.String r13 = r9.a
            if (r12 != 0) goto L_0x004f
            goto L_0x0062
        L_0x004f:
            b65 r12 = r1.j
            boolean r12 = r12 instanceof defpackage.v55
            if (r12 != 0) goto L_0x003c
            boolean r12 = r1.g
            if (r12 == 0) goto L_0x0062
            java.lang.String r12 = r1.c
            boolean r12 = defpackage.hhd.f(r12, r13)
            if (r12 != 0) goto L_0x0062
            goto L_0x003c
        L_0x0062:
            java.lang.Object r12 = r10.c
            zw3 r12 = (defpackage.zw3) r12
            boolean r12 = r12.f
            java.lang.Object r14 = r10.o
            bka r14 = (defpackage.bka) r14
            qja r15 = r14.a
            ne1 r14 = r15.a
            boolean r17 = r14.isScreenCaptureEnabled()
            java.lang.Object r14 = r10.o
            bka r14 = (defpackage.bka) r14
            qja r14 = r14.a
            ne1 r14 = r14.a
            boolean r21 = r14.f()
            java.lang.Object r14 = r10.o
            bka r14 = (defpackage.bka) r14
            qja r14 = r14.a
            ne1 r14 = r14.a
            boolean r14 = r14.isScreenCaptureEnabled()
            r23 = 0
            if (r14 != 0) goto L_0x009e
            java.lang.Object r14 = r10.o
            bka r14 = (defpackage.bka) r14
            le1 r14 = r14.a()
            if (r14 == 0) goto L_0x009b
            goto L_0x009e
        L_0x009b:
            r18 = r23
            goto L_0x00a0
        L_0x009e:
            r18 = 1
        L_0x00a0:
            ne1 r14 = r15.a
            if (r17 == 0) goto L_0x00ab
            le1 r16 = r14.getId()
            r19 = r16
            goto L_0x00b5
        L_0x00ab:
            java.lang.Object r7 = r10.o
            bka r7 = (defpackage.bka) r7
            le1 r7 = r7.a()
            r19 = r7
        L_0x00b5:
            java.lang.Object r7 = r10.Z
            ea r7 = (defpackage.ea) r7
            r35 = r0
            boolean r0 = r7.d
            r16 = 1
            r20 = r0 ^ 1
            ai1 r0 = new ai1
            r36 = r1
            boolean r1 = r7.a
            r16 = r0
            r22 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22)
            java.lang.Object r1 = r10.Y
            eoc r1 = (defpackage.eoc) r1
            r37 = r2
            java.lang.Object r2 = r10.o
            bka r2 = (defpackage.bka) r2
            java.util.Map r2 = r2.c
            boolean r7 = r7.e
            yh1 r24 = defpackage.au7.d(r1, r15, r2, r7)
            java.lang.Object r1 = r10.c
            zw3 r1 = (defpackage.zw3) r1
            b65 r2 = r1.j
            boolean r7 = r2 instanceof defpackage.w55
            r16 = 1
            r7 = r7 ^ 1
            if (r7 == 0) goto L_0x00ef
            goto L_0x00f0
        L_0x00ef:
            r2 = 0
        L_0x00f0:
            if (r2 != 0) goto L_0x00f3
            r2 = r11
        L_0x00f3:
            ete r7 = r9.b
            if (r7 != 0) goto L_0x00f9
            ete r7 = r1.a
        L_0x00f9:
            r16 = r7
            java.lang.String r1 = r1.c
            if (r1 != 0) goto L_0x0100
            r1 = r13
        L_0x0100:
            java.lang.Object r7 = r10.X
            k11 r7 = (defpackage.k11) r7
            k11 r11 = defpackage.k11.g
            boolean r7 = defpackage.hhd.f(r7, r11)
            if (r7 == 0) goto L_0x010f
            y11 r7 = r9.f
            goto L_0x0110
        L_0x010f:
            r7 = 0
        L_0x0110:
            if (r7 != 0) goto L_0x011e
            java.lang.Object r7 = r10.b
            l11 r7 = (defpackage.l11) r7
            java.lang.Object r9 = r10.X
            k11 r9 = (defpackage.k11) r9
            y11 r7 = r7.a(r9)
        L_0x011e:
            r20 = r7
            java.lang.Object r7 = r10.c
            zw3 r7 = (defpackage.zw3) r7
            boolean r9 = r7.h
            java.lang.Object r11 = r10.o
            bka r11 = (defpackage.bka) r11
            java.util.Map r11 = r11.c
            int r11 = r11.size()
            r13 = 1
            if (r11 <= r13) goto L_0x013c
            java.lang.Object r11 = r10.o
            bka r11 = (defpackage.bka) r11
            le1 r11 = r11.d
            r30 = r11
            goto L_0x013e
        L_0x013c:
            r30 = 0
        L_0x013e:
            java.lang.Object r11 = r10.o
            bka r11 = (defpackage.bka) r11
            java.util.Map r11 = r11.c
            boolean r29 = r11.isEmpty()
            java.lang.Object r11 = r10.c
            zw3 r11 = (defpackage.zw3) r11
            boolean r11 = r11.e
            if (r11 != 0) goto L_0x0156
            if (r29 != 0) goto L_0x0153
            goto L_0x0156
        L_0x0153:
            r26 = r23
            goto L_0x0158
        L_0x0156:
            r26 = r13
        L_0x0158:
            boolean r11 = r0.a()
            hy7 r17 = defpackage.hy7.c
            hy7 r18 = defpackage.hy7.a
            hy7 r19 = defpackage.hy7.b
            hy7 r21 = defpackage.hy7.X
            java.lang.Object r13 = r10.a
            fna r13 = (defpackage.fna) r13
            if (r11 == 0) goto L_0x0171
            r38 = r3
        L_0x016c:
            r39 = r4
            r31 = r17
            goto L_0x01a6
        L_0x0171:
            java.lang.Object r11 = r10.Z
            ea r11 = (defpackage.ea) r11
            r38 = r3
            boolean r3 = r11.a
            if (r3 != 0) goto L_0x0180
            boolean r3 = r11.b
            if (r3 != 0) goto L_0x0180
            goto L_0x016c
        L_0x0180:
            java.lang.Object r3 = r10.o
            bka r3 = (defpackage.bka) r3
            qja r3 = r3.a
            ne1 r3 = r3.a
            boolean r3 = r3.a()
            qna r11 = r13.a()
            r39 = r4
            java.lang.String[] r4 = qna.l
            boolean r4 = r11.b(r4)
            if (r4 != 0) goto L_0x019d
            r3 = r21
            goto L_0x01a4
        L_0x019d:
            if (r3 == 0) goto L_0x01a2
            r3 = r19
            goto L_0x01a4
        L_0x01a2:
            r3 = r18
        L_0x01a4:
            r31 = r3
        L_0x01a6:
            java.lang.Object r3 = r10.Z
            ea r3 = (defpackage.ea) r3
            boolean r4 = r3.a
            if (r4 != 0) goto L_0x01b5
            boolean r3 = r3.c
            if (r3 != 0) goto L_0x01b5
            r32 = r17
            goto L_0x01d6
        L_0x01b5:
            java.lang.Object r3 = r10.o
            bka r3 = (defpackage.bka) r3
            qja r3 = r3.a
            ne1 r3 = r3.a
            boolean r3 = r3.b()
            qna r4 = r13.a()
            java.lang.String[] r11 = qna.h
            boolean r4 = r4.b(r11)
            if (r4 != 0) goto L_0x01d0
            r18 = r21
            goto L_0x01d4
        L_0x01d0:
            if (r3 == 0) goto L_0x01d4
            r18 = r19
        L_0x01d4:
            r32 = r18
        L_0x01d6:
            java.lang.Object r3 = r10.c
            zw3 r3 = (defpackage.zw3) r3
            o3b r3 = r3.i
            if (r3 == 0) goto L_0x01e3
            ete r3 = r3.b
            r17 = r3
            goto L_0x01e5
        L_0x01e3:
            r17 = 0
        L_0x01e5:
            if (r9 == 0) goto L_0x01f0
            boolean r3 = r14.m()
            if (r3 == 0) goto L_0x01f0
            r28 = 1
            goto L_0x01f2
        L_0x01f0:
            r28 = r23
        L_0x01f2:
            boolean r3 = r2 instanceof defpackage.v55
            if (r3 != 0) goto L_0x0207
            boolean r3 = r2 instanceof defpackage.u55
            if (r3 != 0) goto L_0x0207
            boolean r3 = r2 instanceof defpackage.w55
            if (r3 == 0) goto L_0x01ff
            goto L_0x0207
        L_0x01ff:
            if (r16 != 0) goto L_0x0204
            if (r3 == 0) goto L_0x0204
            goto L_0x0207
        L_0x0204:
            r33 = r23
            goto L_0x0209
        L_0x0207:
            r33 = 1
        L_0x0209:
            java.lang.Object r3 = r10.c
            zw3 r3 = (defpackage.zw3) r3
            boolean r3 = r3.g
            java.lang.Object r4 = r10.o
            bka r4 = (defpackage.bka) r4
            boolean r4 = r4.h
            u81 r10 = new u81
            r14 = r10
            java.lang.String r7 = r7.d
            r25 = r7
            r7 = r15
            r15 = r1
            r18 = r3
            r19 = r2
            r21 = r9
            r22 = r7
            r23 = r0
            r27 = r12
            r34 = r4
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            goto L_0x0240
        L_0x0230:
            v55 r11 = defpackage.v55.b
            r15 = 0
            r17 = 1048559(0xfffef, float:1.469344E-39)
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            u81 r10 = defpackage.u81.a(r9, r10, r11, r12, r13, r14, r15, r16, r17)
        L_0x0240:
            boolean r0 = r6.b(r8, r10)
            if (r0 == 0) goto L_0x0249
            jue r0 = defpackage.jue.a
            return r0
        L_0x0249:
            r0 = r35
            r1 = r36
            r2 = r37
            r3 = r38
            r4 = r39
            r7 = 0
            goto L_0x0023
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ki1.o(java.lang.Object):java.lang.Object");
    }
}
