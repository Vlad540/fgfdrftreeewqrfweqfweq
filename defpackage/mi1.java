package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* renamed from: mi1  reason: default package */
public final class mi1 extends l5e implements m26 {
    public final /* synthetic */ int X;
    public /* synthetic */ Object Y;
    public /* synthetic */ Object Z;
    public /* synthetic */ Object w0;
    public final /* synthetic */ taf x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mi1(taf taf, Continuation continuation, int i) {
        super(4, continuation);
        this.X = i;
        this.x0 = taf;
    }

    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.X) {
            case 0:
                mi1 mi1 = new mi1(this.x0, (Continuation) obj4, 0);
                mi1.Y = (u81) obj;
                mi1.Z = (lm1) obj2;
                mi1.w0 = (Map) obj3;
                jue jue = jue.a;
                mi1.o(jue);
                return jue;
            case 1:
                mi1 mi12 = new mi1(this.x0, (Continuation) obj4, 1);
                mi12.Y = (u81) obj;
                mi12.Z = (raf) obj2;
                mi12.w0 = (gme) obj3;
                return mi12.o(jue.a);
            default:
                mi1 mi13 = new mi1(this.x0, (Continuation) obj4, 2);
                mi13.Y = (List) obj;
                mi13.Z = (List) obj2;
                mi13.w0 = (bi8) obj3;
                return mi13.o(jue.a);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:120:0x02fb  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x03af  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x03b2  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0416  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x041b  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x043e A[LOOP:3: B:67:0x0177->B:190:0x043e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x043b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01fa  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0209  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r37) {
        /*
            r36 = this;
            r0 = r36
            taf r2 = r0.x0
            r4 = 1
            int r5 = r0.X
            switch(r5) {
                case 0: goto L_0x0164;
                case 1: goto L_0x00e3;
                default: goto L_0x000a;
            }
        L_0x000a:
            defpackage.wx3.H(r37)
            java.lang.Object r1 = r0.Y
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r5 = r0.Z
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r0 = r0.w0
            bi8 r0 = (bi8) r0
            if (r5 == 0) goto L_0x001d
            r10 = r4
            goto L_0x001e
        L_0x001d:
            r10 = 0
        L_0x001e:
            r3 = 10
            uj8 r2 = (uj8) r2
            if (r10 == 0) goto L_0x005d
            if (r5 == 0) goto L_0x0051
            java.util.ArrayList r1 = new java.util.ArrayList
            int r4 = defpackage.q23.H(r5, r3)
            r1.<init>(r4)
            java.util.Iterator r4 = r5.iterator()
        L_0x0033:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x004f
            java.lang.Object r5 = r4.next()
            tf3 r5 = (tf3) r5
            r7e r6 = r2.A0
            java.lang.Object r6 = r6.getValue()
            o94 r6 = (o94) r6
            ei8 r5 = r6.f(r5)
            r1.add(r5)
            goto L_0x0033
        L_0x004f:
            r7 = r1
            goto L_0x006e
        L_0x0051:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Required value was null."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x005d:
            java.lang.Integer r4 = r2.o
            if (r4 == 0) goto L_0x0069
            int r4 = r4.intValue()
            java.util.List r1 = defpackage.o23.n0(r1, r4)
        L_0x0069:
            java.util.List r1 = defpackage.o23.s0(r1)
            goto L_0x004f
        L_0x006e:
            java.util.List r1 = r0.a
            java.util.ArrayList r8 = new java.util.ArrayList
            int r4 = defpackage.q23.H(r1, r3)
            r8.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        L_0x007d:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x009f
            java.lang.Object r4 = r1.next()
            xh8 r4 = (xh8) r4
            yh8 r5 = new yh8
            int r12 = r4.a
            java.lang.Integer r15 = r4.o
            b7d r6 = r4.X
            mge r13 = r4.b
            d7d r14 = r4.c
            r11 = r5
            r16 = r6
            r11.<init>(r12, r13, r14, r15, r16)
            r8.add(r5)
            goto L_0x007d
        L_0x009f:
            java.util.ArrayList r9 = new java.util.ArrayList
            java.util.List r0 = r0.b
            int r1 = defpackage.q23.H(r0, r3)
            r9.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L_0x00ae:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00d0
            java.lang.Object r1 = r0.next()
            xh8 r1 = (xh8) r1
            yh8 r3 = new yh8
            int r12 = r1.a
            java.lang.Integer r15 = r1.o
            b7d r4 = r1.X
            mge r13 = r1.b
            d7d r14 = r1.c
            r11 = r3
            r16 = r4
            r11.<init>(r12, r13, r14, r15, r16)
            r9.add(r3)
            goto L_0x00ae
        L_0x00d0:
            t97 r0 = r2.w0
            java.lang.Object r0 = r0.getValue()
            ck8 r0 = (ck8) r0
            boolean r11 = r0.c()
            mj8 r0 = new mj8
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11)
            return r0
        L_0x00e3:
            defpackage.wx3.H(r37)
            java.lang.Object r5 = r0.Y
            u81 r5 = (defpackage.u81) r5
            java.lang.Object r6 = r0.Z
            raf r6 = (defpackage.raf) r6
            java.lang.Object r0 = r0.w0
            r16 = r0
            gme r16 = (defpackage.gme) r16
            boolean r8 = r5.g
            boolean r0 = r5.m
            if (r8 != 0) goto L_0x0103
            boolean r7 = r5.t
            if (r7 == 0) goto L_0x0101
            if (r0 == 0) goto L_0x0101
            goto L_0x0103
        L_0x0101:
            r9 = 0
            goto L_0x0104
        L_0x0103:
            r9 = r4
        L_0x0104:
            if (r8 != 0) goto L_0x0108
            r10 = 0
            goto L_0x0109
        L_0x0108:
            r10 = r6
        L_0x0109:
            boolean r1 = r5.s
            r11 = r1 ^ 1
            if (r8 == 0) goto L_0x0138
            boolean r1 = r5.l
            if (r1 != 0) goto L_0x0138
            ml1 r2 = (defpackage.ml1) r2
            aj1 r1 = r2.b
            r7e r1 = r1.D0
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x0138
            aj1 r1 = r2.b
            r7e r1 = r1.F0
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0136
            goto L_0x0138
        L_0x0136:
            r12 = 0
            goto L_0x0139
        L_0x0138:
            r12 = r4
        L_0x0139:
            yh1 r1 = r5.j
            boolean r13 = r1.c
            b65 r1 = r5.e
            boolean r2 = r1 instanceof defpackage.a65
            boolean r5 = r5.g
            if (r2 != 0) goto L_0x0150
            boolean r6 = r1 instanceof defpackage.x55
            if (r6 == 0) goto L_0x014a
            goto L_0x0150
        L_0x014a:
            if (r5 == 0) goto L_0x014e
            r14 = r4
            goto L_0x0151
        L_0x014e:
            r14 = r0
            goto L_0x0151
        L_0x0150:
            r14 = 0
        L_0x0151:
            if (r2 != 0) goto L_0x015c
            boolean r0 = r1 instanceof defpackage.x55
            if (r0 == 0) goto L_0x0158
            goto L_0x015c
        L_0x0158:
            if (r5 == 0) goto L_0x015c
            r15 = r4
            goto L_0x015d
        L_0x015c:
            r15 = 0
        L_0x015d:
            ome r0 = new ome
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r0
        L_0x0164:
            defpackage.wx3.H(r37)
            java.lang.Object r5 = r0.Y
            u81 r5 = (defpackage.u81) r5
            java.lang.Object r6 = r0.Z
            lm1 r6 = (defpackage.lm1) r6
            java.lang.Object r0 = r0.w0
            java.util.Map r0 = (java.util.Map) r0
            aj1 r2 = (defpackage.aj1) r2
            grd r7 = r2.I0
        L_0x0177:
            java.lang.Object r8 = r7.getValue()
            r9 = r8
            u21 r9 = (defpackage.u21) r9
            tz0 r10 = r2.o
            r10.e = r5
            raf r11 = r6.e
            r10.f = r11
            le1 r11 = r6.b
            r10.g = r11
            le1 r12 = r6.a
            r10.h = r12
            r10.i = r0
            boolean r12 = r6.d
            r10.a = r12
            b65 r12 = r5.e
            boolean r12 = r12 instanceof defpackage.v55
            if (r12 == 0) goto L_0x01a9
            t21 r9 = defpackage.t21.a
        L_0x019c:
            r36 = r0
            r37 = r2
            r3 = r4
            r23 = r5
            r24 = r6
            r0 = r7
            r1 = r8
            goto L_0x0435
        L_0x01a9:
            boolean r12 = r9 instanceof defpackage.s21
            if (r12 == 0) goto L_0x019c
            s21 r9 = (defpackage.s21) r9
            hy7 r12 = defpackage.hy7.b
            hy7 r13 = r5.q
            if (r13 != r12) goto L_0x01b7
            r13 = r4
            goto L_0x01b8
        L_0x01b7:
            r13 = 0
        L_0x01b8:
            if (r13 != 0) goto L_0x01bc
        L_0x01ba:
            r11 = 0
            goto L_0x01de
        L_0x01bc:
            boolean r13 = r5.g
            if (r13 == 0) goto L_0x01c1
            goto L_0x01ba
        L_0x01c1:
            if (r11 == 0) goto L_0x01d0
            le1 r13 = defpackage.le1.c
            boolean r11 = r11.equals(r13)
            if (r11 != 0) goto L_0x01d0
            java.lang.Object r11 = r10.g
            le1 r11 = (defpackage.le1) r11
            goto L_0x01de
        L_0x01d0:
            java.lang.Object r11 = r10.e
            u81 r11 = (defpackage.u81) r11
            qja r11 = r11.h
            if (r11 == 0) goto L_0x01ba
            ne1 r11 = r11.a
            le1 r11 = r11.getId()
        L_0x01de:
            java.lang.Object r13 = r10.f
            raf r13 = (defpackage.raf) r13
            java.lang.Object r14 = r10.i
            java.util.Map r14 = (java.util.Map) r14
            ws7 r13 = r10.c(r13, r14, r11)
            s21 r14 = new s21
            java.lang.Object r15 = r10.f
            raf r15 = (defpackage.raf) r15
            java.lang.Object r1 = r10.e
            u81 r1 = (defpackage.u81) r1
            boolean r4 = r1.s
            raf r3 = defpackage.raf.a
            if (r4 == 0) goto L_0x0209
            hw4 r1 = defpackage.hw4.a
            r36 = r0
            r18 = r1
        L_0x0200:
            r37 = r2
            r23 = r5
            r24 = r6
            r4 = 0
            goto L_0x02e0
        L_0x0209:
            ai1 r1 = r1.i
            boolean r1 = r1.a()
            if (r1 == 0) goto L_0x024e
            xb1 r1 = new xb1
            int r4 = defpackage.r1a.Z
            java.lang.Object r11 = r10.i
            java.util.Map r11 = (java.util.Map) r11
            r36 = r0
            java.lang.Object r0 = r10.e
            u81 r0 = (defpackage.u81) r0
            ai1 r0 = r0.i
            le1 r0 = r0.c
            java.lang.Object r0 = r11.get(r0)
            s91 r0 = (defpackage.s91) r0
            if (r0 == 0) goto L_0x022f
            java.lang.String r0 = r0.b
            if (r0 != 0) goto L_0x0231
        L_0x022f:
            java.lang.String r0 = ""
        L_0x0231:
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            jge r11 = new jge
            java.util.List r0 = defpackage.cs.g0(r0)
            r11.<init>(r4, r0)
            java.lang.Object r0 = r10.e
            u81 r0 = (defpackage.u81) r0
            ai1 r0 = r0.i
            r1.<init>(r11, r0)
            java.util.List r0 = java.util.Collections.singletonList(r1)
            r18 = r0
            goto L_0x0200
        L_0x024e:
            r36 = r0
            java.lang.Object r0 = r10.e
            u81 r0 = (defpackage.u81) r0
            boolean r1 = r0.g
            if (r1 == 0) goto L_0x02bb
            vb1 r1 = new vb1
            raf r4 = defpackage.raf.c
            r37 = r2
            java.lang.Object r2 = r10.i
            java.util.Map r2 = (java.util.Map) r2
            java.util.Collection r2 = r2.values()
            java.util.List r0 = r10.a(r2, r4, r0)
            java.lang.Object r2 = r10.e
            u81 r2 = (defpackage.u81) r2
            boolean r4 = r2.s
            if (r4 == 0) goto L_0x0274
            r4 = 0
            goto L_0x0279
        L_0x0274:
            hc6 r4 = new hc6
            r4.<init>(r0)
        L_0x0279:
            r1.<init>(r4)
            boolean r0 = r2.l
            if (r0 == 0) goto L_0x02a6
            zb1 r0 = new zb1
            java.lang.Object r2 = r10.i
            java.util.Map r2 = (java.util.Map) r2
            ws7 r4 = r10.c(r3, r2, r11)
            r23 = r5
            java.lang.Object r5 = r10.e
            u81 r5 = (defpackage.u81) r5
            r24 = r6
            java.lang.Object r6 = r10.i
            java.util.Map r6 = (java.util.Map) r6
            java.util.Collection r6 = r6.values()
            java.util.List r5 = r10.a(r6, r3, r5)
            hmd r2 = r10.b(r2, r4, r5, r11)
            r0.<init>(r2)
            goto L_0x02ab
        L_0x02a6:
            r23 = r5
            r24 = r6
            r0 = 0
        L_0x02ab:
            r2 = 2
            ac1[] r2 = new defpackage.ac1[r2]
            r4 = 0
            r2[r4] = r0
            r0 = 1
            r2[r0] = r1
            java.util.ArrayList r0 = defpackage.cs.X(r2)
        L_0x02b8:
            r18 = r0
            goto L_0x02e0
        L_0x02bb:
            r37 = r2
            r23 = r5
            r24 = r6
            r4 = 0
            java.lang.Object r1 = r10.i
            java.util.Map r1 = (java.util.Map) r1
            java.util.Collection r1 = r1.values()
            java.util.List r0 = r10.a(r1, r15, r0)
            zb1 r1 = new zb1
            java.lang.Object r2 = r10.i
            java.util.Map r2 = (java.util.Map) r2
            hmd r0 = r10.b(r2, r13, r0, r11)
            r1.<init>(r0)
            java.util.List r0 = java.util.Collections.singletonList(r1)
            goto L_0x02b8
        L_0x02e0:
            java.lang.Object r0 = r10.c
            t97 r0 = (defpackage.t97) r0
            if (r13 == 0) goto L_0x02f4
            java.lang.Object r1 = r10.f
            raf r1 = (defpackage.raf) r1
            if (r1 != r3) goto L_0x02f4
            java.lang.Object r1 = r10.e
            u81 r1 = (defpackage.u81) r1
            boolean r2 = r1.s
            if (r2 == 0) goto L_0x02fb
        L_0x02f4:
            r34 = r7
            r35 = r8
            r3 = 1
            goto L_0x03a5
        L_0x02fb:
            a97 r2 = new a97
            boolean r3 = r1.g
            hze r5 = r13.h
            if (r3 != 0) goto L_0x030f
            boolean r1 = r1.t
            if (r1 == 0) goto L_0x0308
            goto L_0x030f
        L_0x0308:
            r34 = r7
            r35 = r8
            r27 = 0
            goto L_0x034a
        L_0x030f:
            java.lang.Object r1 = r0.getValue()
            r25 = r1
            xk1 r25 = (defpackage.xk1) r25
            java.lang.Object r1 = r10.e
            u81 r1 = (defpackage.u81) r1
            boolean r3 = r1.g
            if (r5 == 0) goto L_0x0324
            boolean r6 = r5.g
            r32 = r6
            goto L_0x0326
        L_0x0324:
            r32 = r4
        L_0x0326:
            boolean r6 = r1.m
            b65 r1 = r1.e
            boolean r11 = r13.i
            int r4 = r13.k
            r34 = r7
            java.lang.CharSequence r7 = r13.b
            r35 = r8
            boolean r8 = r13.g
            r26 = r11
            r27 = r4
            r28 = r7
            r29 = r3
            r30 = r8
            r31 = r6
            r33 = r1
            android.text.SpannableStringBuilder r1 = r25.f(r26, r27, r28, r29, r30, r31, r32, r33)
            r27 = r1
        L_0x034a:
            java.lang.Object r1 = r10.h
            le1 r1 = (defpackage.le1) r1
            le1 r3 = r13.c
            boolean r1 = defpackage.hhd.f(r3, r1)
            if (r1 == 0) goto L_0x0361
            java.lang.Object r1 = r10.e
            u81 r1 = (defpackage.u81) r1
            boolean r1 = r1.g
            if (r1 == 0) goto L_0x0361
            r28 = 1
            goto L_0x0363
        L_0x0361:
            r28 = 0
        L_0x0363:
            boolean r1 = r13.i
            if (r1 == 0) goto L_0x037b
            java.lang.Object r1 = r10.e
            u81 r1 = (defpackage.u81) r1
            boolean r1 = r1.g
            if (r1 != 0) goto L_0x037b
            if (r5 == 0) goto L_0x037b
            boolean r1 = r5.c
            r3 = 1
            if (r1 != r3) goto L_0x037b
            ize r1 = defpackage.ize.b
        L_0x0378:
            r30 = r1
            goto L_0x0389
        L_0x037b:
            java.lang.Object r1 = r10.e
            u81 r1 = (defpackage.u81) r1
            boolean r1 = r1.g
            if (r1 == 0) goto L_0x0386
            ize r1 = defpackage.ize.a
            goto L_0x0378
        L_0x0386:
            ize r1 = defpackage.ize.o
            goto L_0x0378
        L_0x0389:
            le1 r1 = r13.c
            boolean r3 = r13.d
            r25 = r2
            r26 = r1
            r29 = r3
            r25.<init>(r26, r27, r28, r29, r30)
            a97 r1 = defpackage.a97.f
            boolean r1 = r2.equals(r1)
            r3 = 1
            r1 = r1 ^ r3
            if (r1 == 0) goto L_0x03a1
            goto L_0x03a2
        L_0x03a1:
            r2 = 0
        L_0x03a2:
            r20 = r2
            goto L_0x03a7
        L_0x03a5:
            r20 = 0
        L_0x03a7:
            java.lang.Object r1 = r10.e
            u81 r1 = (defpackage.u81) r1
            boolean r2 = r1.s
            if (r2 != 0) goto L_0x03b2
            r19 = 0
            goto L_0x040e
        L_0x03b2:
            bue r2 = new bue
            y11 r1 = r1.f
            if (r1 == 0) goto L_0x03bd
            java.lang.CharSequence r1 = r1.b
            r26 = r1
            goto L_0x03bf
        L_0x03bd:
            r26 = 0
        L_0x03bf:
            java.lang.Object r0 = r0.getValue()
            xk1 r0 = (defpackage.xk1) r0
            java.lang.Object r1 = r10.e
            u81 r1 = (defpackage.u81) r1
            boolean r4 = r1.d
            boolean r5 = r1.g
            boolean r6 = r1.m
            b65 r1 = r1.e
            java.lang.String r27 = r0.e(r5, r4, r6, r1)
            java.lang.Object r0 = r10.e
            u81 r0 = (defpackage.u81) r0
            y11 r1 = r0.f
            ete r4 = r0.c
            if (r4 == 0) goto L_0x03e2
            r29 = r3
            goto L_0x03e4
        L_0x03e2:
            r29 = 0
        L_0x03e4:
            hy7 r4 = r0.q
            if (r4 != r12) goto L_0x03eb
            r30 = r3
            goto L_0x03ed
        L_0x03eb:
            r30 = 0
        L_0x03ed:
            b65 r0 = r0.e
            boolean r4 = r0 instanceof defpackage.u55
            if (r4 == 0) goto L_0x03f6
            u55 r0 = (defpackage.u55) r0
            goto L_0x03f7
        L_0x03f6:
            r0 = 0
        L_0x03f7:
            if (r0 == 0) goto L_0x03fc
            int r0 = r0.b
            goto L_0x03fd
        L_0x03fc:
            r0 = 0
        L_0x03fd:
            r4 = 3
            if (r0 != r4) goto L_0x0403
            r31 = r3
            goto L_0x0405
        L_0x0403:
            r31 = 0
        L_0x0405:
            r25 = r2
            r28 = r1
            r25.<init>(r26, r27, r28, r29, r30, r31)
            r19 = r2
        L_0x040e:
            java.lang.Object r0 = r10.e
            u81 r0 = (defpackage.u81) r0
            boolean r0 = r0.g
            if (r13 == 0) goto L_0x041b
            mc0 r1 = r13.a
            r22 = r1
            goto L_0x041d
        L_0x041b:
            r22 = 0
        L_0x041d:
            bn1 r1 = r9.a
            r1.getClass()
            bn1 r1 = new bn1
            r16 = r1
            r17 = r15
            r21 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r14.<init>(r1)
            r9 = r14
            r0 = r34
            r1 = r35
        L_0x0435:
            boolean r1 = r0.b(r1, r9)
            if (r1 == 0) goto L_0x043e
            jue r0 = defpackage.jue.a
            return r0
        L_0x043e:
            r2 = r37
            r7 = r0
            r4 = r3
            r5 = r23
            r6 = r24
            r0 = r36
            goto L_0x0177
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mi1.o(java.lang.Object):java.lang.Object");
    }
}
