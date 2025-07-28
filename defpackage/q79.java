package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* renamed from: q79  reason: default package */
public final class q79 implements e75, vtc {
    public int A0;
    public long B0;
    public int C0;
    public ija D0;
    public int E0;
    public int F0;
    public int G0;
    public int H0;
    public boolean I0;
    public i75 J0;
    public o79[] K0;
    public long[][] L0;
    public int M0;
    public long N0;
    public int O0;
    public p69 P0;
    public final ija X;
    public final ija Y;
    public final ArrayDeque Z;
    public final s1e a;
    public final int b;
    public final ija c;
    public final ija o;
    public final huc w0;
    public final ArrayList x0;
    public e8c y0 = e8c.X;
    public int z0;

    public q79(int i, s1e s1e) {
        this.a = s1e;
        this.b = i;
        po5 po5 = ws6.b;
        this.z0 = (i & 4) != 0 ? 3 : 0;
        this.w0 = new huc();
        this.x0 = new ArrayList();
        this.Y = new ija(16);
        this.Z = new ArrayDeque();
        this.c = new ija(pfa.b);
        this.o = new ija(4);
        this.X = new ija();
        this.E0 = -1;
        this.J0 = i75.v;
        this.K0 = new o79[0];
    }

    public final void S(i75 i75) {
        if ((this.b & 16) == 0) {
            i75 = new it4(i75, this.a);
        }
        this.J0 = i75;
    }

    public final boolean c() {
        return true;
    }

    public final void d(long j, long j2) {
        this.Z.clear();
        this.C0 = 0;
        this.E0 = -1;
        this.F0 = 0;
        this.G0 = 0;
        this.H0 = 0;
        if (j != 0) {
            for (o79 o79 : this.K0) {
                dpe dpe = o79.b;
                int f = oze.f(dpe.f, j2, false);
                while (true) {
                    if (f < 0) {
                        f = -1;
                        break;
                    } else if ((dpe.g[f] & 1) != 0) {
                        break;
                    } else {
                        f--;
                    }
                }
                if (f == -1) {
                    f = dpe.a(j2);
                }
                o79.e = f;
                fse fse = o79.d;
                if (fse != null) {
                    fse.b = false;
                    fse.c = 0;
                }
            }
        } else if (this.z0 != 3) {
            this.z0 = 0;
            this.C0 = 0;
        } else {
            huc huc = this.w0;
            huc.a.clear();
            huc.b = 0;
            this.x0.clear();
        }
    }

    public final ttc e(long j) {
        return i(-1, j);
    }

    public final long f() {
        return this.N0;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x0477  */
    /* JADX WARNING: Removed duplicated region for block: B:338:0x0475 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int g(defpackage.g75 r39, le4 r40) {
        /*
            r38 = this;
            r0 = r38
            r1 = r39
            r2 = r40
            r4 = 3
            r6 = 2
            r7 = 8
            r8 = 0
            r9 = 4
            r10 = 1
        L_0x000d:
            int r11 = r0.z0
            java.util.ArrayDeque r12 = r0.Z
            ija r14 = r0.X
            r15 = -1
            r18 = r14
            if (r11 == 0) goto L_0x0480
            r20 = 262144(0x40000, double:1.295163E-318)
            if (r11 == r10) goto L_0x03d7
            r22 = 8
            if (r11 == r6) goto L_0x0241
            if (r11 != r4) goto L_0x023b
            java.util.ArrayList r3 = r0.x0
            huc r11 = r0.w0
            int r12 = r11.b
            if (r12 == 0) goto L_0x0216
            if (r12 == r10) goto L_0x01e2
            java.util.ArrayList r15 = r11.a
            r5 = 2817(0xb01, float:3.947E-42)
            r14 = 2816(0xb00, float:3.946E-42)
            r13 = 2192(0x890, float:3.072E-42)
            if (r12 == r6) goto L_0x016b
            if (r12 != r4) goto L_0x0165
            long r17 = r39.g()
            long r20 = r39.x()
            long r22 = r39.g()
            long r20 = r20 - r22
            int r11 = r11.c
            long r11 = (long) r11
            long r11 = r20 - r11
            int r11 = (int) r11
            ija r12 = new ija
            r12.<init>((int) r11)
            byte[] r6 = r12.a
            r1.readFully(r6, r8, r11)
            r1 = r8
        L_0x0059:
            int r6 = r15.size()
            if (r1 >= r6) goto L_0x015e
            java.lang.Object r6 = r15.get(r1)
            fuc r6 = (defpackage.fuc) r6
            long r10 = r6.a
            long r10 = r10 - r17
            int r10 = (int) r10
            r12.G(r10)
            r12.H(r9)
            int r10 = r12.i()
            java.nio.charset.Charset r11 = defpackage.f22.c
            java.lang.String r9 = r12.s(r10, r11)
            int r21 = r9.hashCode()
            switch(r21) {
                case -1711564334: goto L_0x00af;
                case -1332107749: goto L_0x00a4;
                case -1251387154: goto L_0x0099;
                case -830665521: goto L_0x008e;
                case 1760745220: goto L_0x0083;
                default: goto L_0x0081;
            }
        L_0x0081:
            r8 = -1
            goto L_0x00b9
        L_0x0083:
            java.lang.String r8 = "Super_SlowMotion_BGM"
            boolean r8 = r9.equals(r8)
            if (r8 != 0) goto L_0x008c
            goto L_0x0081
        L_0x008c:
            r8 = 4
            goto L_0x00b9
        L_0x008e:
            java.lang.String r8 = "Super_SlowMotion_Deflickering_On"
            boolean r8 = r9.equals(r8)
            if (r8 != 0) goto L_0x0097
            goto L_0x0081
        L_0x0097:
            r8 = r4
            goto L_0x00b9
        L_0x0099:
            java.lang.String r8 = "Super_SlowMotion_Data"
            boolean r8 = r9.equals(r8)
            if (r8 != 0) goto L_0x00a2
            goto L_0x0081
        L_0x00a2:
            r8 = 2
            goto L_0x00b9
        L_0x00a4:
            java.lang.String r8 = "Super_SlowMotion_Edit_Data"
            boolean r8 = r9.equals(r8)
            if (r8 != 0) goto L_0x00ad
            goto L_0x0081
        L_0x00ad:
            r8 = 1
            goto L_0x00b9
        L_0x00af:
            java.lang.String r8 = "SlowMotion_Data"
            boolean r8 = r9.equals(r8)
            if (r8 != 0) goto L_0x00b8
            goto L_0x0081
        L_0x00b8:
            r8 = 0
        L_0x00b9:
            switch(r8) {
                case 0: goto L_0x00ce;
                case 1: goto L_0x00cb;
                case 2: goto L_0x00c9;
                case 3: goto L_0x00c6;
                case 4: goto L_0x00c4;
                default: goto L_0x00bc;
            }
        L_0x00bc:
            java.lang.String r0 = "Invalid SEF name"
            r1 = 0
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r1, r0)
            throw r0
        L_0x00c4:
            r8 = r5
            goto L_0x00cf
        L_0x00c6:
            r8 = 2820(0xb04, float:3.952E-42)
            goto L_0x00cf
        L_0x00c9:
            r8 = r14
            goto L_0x00cf
        L_0x00cb:
            r8 = 2819(0xb03, float:3.95E-42)
            goto L_0x00cf
        L_0x00ce:
            r8 = r13
        L_0x00cf:
            int r10 = r10 + r7
            int r6 = r6.b
            int r6 = r6 - r10
            if (r8 == r13) goto L_0x00ea
            if (r8 == r14) goto L_0x00e8
            if (r8 == r5) goto L_0x00e8
            r6 = 2819(0xb03, float:3.95E-42)
            if (r8 == r6) goto L_0x00e8
            r6 = 2820(0xb04, float:3.952E-42)
            if (r8 != r6) goto L_0x00e2
            goto L_0x00e8
        L_0x00e2:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x00e8:
            r6 = 1
            goto L_0x0159
        L_0x00ea:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.lang.String r6 = r12.s(r6, r11)
            jn r9 = defpackage.huc.e
            java.util.List r6 = r9.O(r6)
            r9 = 0
        L_0x00fa:
            int r10 = r6.size()
            if (r9 >= r10) goto L_0x0150
            java.lang.Object r10 = r6.get(r9)
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            jn r11 = defpackage.huc.d
            java.util.List r10 = r11.O(r10)
            int r11 = r10.size()
            if (r11 != r4) goto L_0x014a
            r11 = 0
            java.lang.Object r21 = r10.get(r11)     // Catch:{ NumberFormatException -> 0x0143 }
            java.lang.String r21 = (java.lang.String) r21     // Catch:{ NumberFormatException -> 0x0143 }
            long r27 = java.lang.Long.parseLong(r21)     // Catch:{ NumberFormatException -> 0x0143 }
            r11 = 1
            java.lang.Object r21 = r10.get(r11)     // Catch:{ NumberFormatException -> 0x0143 }
            java.lang.String r21 = (java.lang.String) r21     // Catch:{ NumberFormatException -> 0x0143 }
            long r29 = java.lang.Long.parseLong(r21)     // Catch:{ NumberFormatException -> 0x0143 }
            r11 = 2
            java.lang.Object r10 = r10.get(r11)     // Catch:{ NumberFormatException -> 0x0143 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ NumberFormatException -> 0x0143 }
            int r10 = java.lang.Integer.parseInt(r10)     // Catch:{ NumberFormatException -> 0x0143 }
            r11 = 1
            int r10 = r10 - r11
            int r31 = r11 << r10
            akd r10 = new akd     // Catch:{ NumberFormatException -> 0x0143 }
            r26 = r10
            r26.<init>(r27, r29, r31)     // Catch:{ NumberFormatException -> 0x0143 }
            r8.add(r10)     // Catch:{ NumberFormatException -> 0x0143 }
            int r9 = r9 + r11
            goto L_0x00fa
        L_0x0143:
            r0 = move-exception
            r1 = 0
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r0, r1)
            throw r0
        L_0x014a:
            r1 = 0
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r1, r1)
            throw r0
        L_0x0150:
            ckd r6 = new ckd
            r6.<init>(r8)
            r3.add(r6)
            goto L_0x00e8
        L_0x0159:
            int r1 = r1 + r6
            r8 = 0
            r9 = 4
            goto L_0x0059
        L_0x015e:
            r8 = 0
            r2.a = r8
        L_0x0162:
            r1 = 1
            goto L_0x022d
        L_0x0165:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x016b:
            long r8 = r39.x()
            int r3 = r11.c
            int r3 = r3 + -20
            ija r6 = new ija
            r6.<init>((int) r3)
            byte[] r10 = r6.a
            r12 = 0
            r1.readFully(r10, r12, r3)
            r1 = 0
        L_0x017f:
            int r10 = r3 / 12
            if (r1 >= r10) goto L_0x01c8
            r10 = 2
            r6.H(r10)
            short r10 = r6.k()
            if (r10 == r13) goto L_0x01a0
            if (r10 == r14) goto L_0x01a0
            if (r10 == r5) goto L_0x01a0
            r12 = 2819(0xb03, float:3.95E-42)
            r5 = 2820(0xb04, float:3.952E-42)
            if (r10 == r12) goto L_0x01a4
            if (r10 == r5) goto L_0x01a4
            r6.H(r7)
            r18 = r8
        L_0x019e:
            r7 = 1
            goto L_0x01be
        L_0x01a0:
            r5 = 2820(0xb04, float:3.952E-42)
            r12 = 2819(0xb03, float:3.95E-42)
        L_0x01a4:
            int r10 = r11.c
            long r12 = (long) r10
            long r12 = r8 - r12
            int r10 = r6.i()
            r18 = r8
            long r7 = (long) r10
            long r12 = r12 - r7
            int r7 = r6.i()
            fuc r8 = new fuc
            r8.<init>(r12, r7)
            r15.add(r8)
            goto L_0x019e
        L_0x01be:
            int r1 = r1 + r7
            r8 = r18
            r5 = 2817(0xb01, float:3.947E-42)
            r7 = 8
            r13 = 2192(0x890, float:3.072E-42)
            goto L_0x017f
        L_0x01c8:
            boolean r1 = r15.isEmpty()
            if (r1 == 0) goto L_0x01d4
            r5 = 0
            r2.a = r5
            r3 = 0
            goto L_0x0162
        L_0x01d4:
            r11.b = r4
            r3 = 0
            java.lang.Object r1 = r15.get(r3)
            fuc r1 = (defpackage.fuc) r1
            long r4 = r1.a
            r2.a = r4
            goto L_0x0162
        L_0x01e2:
            r3 = r8
            ija r4 = new ija
            r5 = 8
            r4.<init>((int) r5)
            byte[] r6 = r4.a
            r1.readFully(r6, r3, r5)
            int r3 = r4.i()
            int r3 = r3 + r5
            r11.c = r3
            int r3 = r4.g()
            r4 = 1397048916(0x53454654, float:8.4728847E11)
            if (r3 == r4) goto L_0x0205
            r3 = 0
            r2.a = r3
            goto L_0x0162
        L_0x0205:
            long r3 = r39.g()
            int r1 = r11.c
            int r1 = r1 + -12
            long r5 = (long) r1
            long r3 = r3 - r5
            r2.a = r3
            r1 = 2
            r11.b = r1
            goto L_0x0162
        L_0x0216:
            long r3 = r39.x()
            int r1 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r1 == 0) goto L_0x0226
            int r1 = (r3 > r22 ? 1 : (r3 == r22 ? 0 : -1))
            if (r1 >= 0) goto L_0x0223
            goto L_0x0226
        L_0x0223:
            long r3 = r3 - r22
            goto L_0x0228
        L_0x0226:
            r3 = 0
        L_0x0228:
            r2.a = r3
            r1 = 1
            r11.b = r1
        L_0x022d:
            long r2 = r2.a
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x023a
            r2 = 0
            r0.z0 = r2
            r0.C0 = r2
        L_0x023a:
            return r1
        L_0x023b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x0241:
            long r4 = r39.g()
            int r6 = r0.E0
            r7 = -1
            if (r6 != r7) goto L_0x02c0
            r8 = -1
            r9 = -1
            r10 = 1
            r11 = 1
            r12 = 0
            r13 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r15 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r26 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x025e:
            o79[] r3 = r0.K0
            int r6 = r3.length
            if (r12 >= r6) goto L_0x02a4
            r3 = r3[r12]
            int r6 = r3.e
            dpe r3 = r3.b
            int r7 = r3.b
            if (r6 != r7) goto L_0x026f
        L_0x026d:
            r3 = 1
            goto L_0x02a2
        L_0x026f:
            long[] r3 = r3.c
            r31 = r3[r6]
            long[][] r3 = r0.L0
            int r7 = defpackage.oze.a
            r3 = r3[r12]
            r6 = r3[r6]
            long r31 = r31 - r4
            r24 = 0
            int r3 = (r31 > r24 ? 1 : (r31 == r24 ? 0 : -1))
            if (r3 < 0) goto L_0x028a
            int r3 = (r31 > r20 ? 1 : (r31 == r20 ? 0 : -1))
            if (r3 < 0) goto L_0x0288
            goto L_0x028a
        L_0x0288:
            r3 = 0
            goto L_0x028b
        L_0x028a:
            r3 = 1
        L_0x028b:
            if (r3 != 0) goto L_0x028f
            if (r11 != 0) goto L_0x0295
        L_0x028f:
            if (r3 != r11) goto L_0x029a
            int r17 = (r31 > r26 ? 1 : (r31 == r26 ? 0 : -1))
            if (r17 >= 0) goto L_0x029a
        L_0x0295:
            r11 = r3
            r15 = r6
            r9 = r12
            r26 = r31
        L_0x029a:
            int r17 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r17 >= 0) goto L_0x026d
            r10 = r3
            r13 = r6
            r8 = r12
            goto L_0x026d
        L_0x02a2:
            int r12 = r12 + r3
            goto L_0x025e
        L_0x02a4:
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r3 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r3 == 0) goto L_0x02b7
            if (r10 == 0) goto L_0x02b7
            r6 = 10485760(0xa00000, double:5.180654E-317)
            long r13 = r13 + r6
            int r3 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r3 >= 0) goto L_0x02b8
        L_0x02b7:
            r8 = r9
        L_0x02b8:
            r0.E0 = r8
            r3 = -1
            if (r8 != r3) goto L_0x02c0
            r5 = -1
            goto L_0x03d6
        L_0x02c0:
            o79[] r3 = r0.K0
            int r6 = r0.E0
            r3 = r3[r6]
            bpe r14 = r3.c
            int r15 = r3.e
            dpe r13 = r3.b
            long[] r6 = r13.c
            r6 = r6[r15]
            int[] r8 = r13.d
            r8 = r8[r15]
            long r4 = r6 - r4
            int r9 = r0.F0
            long r9 = (long) r9
            long r4 = r4 + r9
            r9 = 0
            int r9 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r9 < 0) goto L_0x03d3
            int r9 = (r4 > r20 ? 1 : (r4 == r20 ? 0 : -1))
            if (r9 < 0) goto L_0x02e6
            goto L_0x03d3
        L_0x02e6:
            noe r2 = r3.a
            int r6 = r2.g
            r7 = 1
            if (r6 != r7) goto L_0x02f1
            long r4 = r4 + r22
            int r8 = r8 + -8
        L_0x02f1:
            int r4 = (int) r4
            r1.z(r4)
            int r4 = r2.j
            fse r5 = r3.d
            if (r4 == 0) goto L_0x0355
            ija r2 = r0.o
            byte[] r6 = r2.a
            r7 = 0
            r6[r7] = r7
            r9 = 1
            r6[r9] = r7
            r9 = 2
            r6[r9] = r7
            r9 = 4
            int r10 = 4 - r4
        L_0x030b:
            int r9 = r0.G0
            if (r9 >= r8) goto L_0x0353
            int r9 = r0.H0
            if (r9 != 0) goto L_0x033e
            r1.readFully(r6, r10, r4)
            int r9 = r0.F0
            int r9 = r9 + r4
            r0.F0 = r9
            r2.G(r7)
            int r9 = r2.g()
            if (r9 < 0) goto L_0x0336
            r0.H0 = r9
            ija r9 = r0.c
            r9.G(r7)
            r11 = 4
            r14.b(r9, r11, r7)
            int r9 = r0.G0
            int r9 = r9 + r11
            r0.G0 = r9
            int r8 = r8 + r10
            goto L_0x030b
        L_0x0336:
            java.lang.String r0 = "Invalid NAL length"
            r1 = 0
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r1, r0)
            throw r0
        L_0x033e:
            int r9 = r14.c(r1, r9, r7)
            int r7 = r0.F0
            int r7 = r7 + r9
            r0.F0 = r7
            int r7 = r0.G0
            int r7 = r7 + r9
            r0.G0 = r7
            int r7 = r0.H0
            int r7 = r7 - r9
            r0.H0 = r7
            r7 = 0
            goto L_0x030b
        L_0x0353:
            r1 = r8
            goto L_0x0398
        L_0x0355:
            xu5 r2 = r2.f
            java.lang.String r2 = r2.n
            java.lang.String r4 = "audio/ac4"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x0378
            int r2 = r0.G0
            if (r2 != 0) goto L_0x0375
            r6 = r18
            defpackage.gt0.w(r8, r6)
            r2 = 0
            r7 = 7
            r14.b(r6, r7, r2)
            int r2 = r0.G0
            int r2 = r2 + r7
            r0.G0 = r2
            goto L_0x0376
        L_0x0375:
            r7 = 7
        L_0x0376:
            int r8 = r8 + r7
            goto L_0x037d
        L_0x0378:
            if (r5 == 0) goto L_0x037d
            r5.f(r1)
        L_0x037d:
            int r2 = r0.G0
            if (r2 >= r8) goto L_0x0353
            int r2 = r8 - r2
            r4 = 0
            int r2 = r14.c(r1, r2, r4)
            int r4 = r0.F0
            int r4 = r4 + r2
            r0.F0 = r4
            int r4 = r0.G0
            int r4 = r4 + r2
            r0.G0 = r4
            int r4 = r0.H0
            int r4 = r4 - r2
            r0.H0 = r4
            goto L_0x037d
        L_0x0398:
            long[] r2 = r13.f
            r8 = r2[r15]
            int[] r2 = r13.g
            r2 = r2[r15]
            if (r5 == 0) goto L_0x03b8
            r12 = 0
            r4 = 0
            r6 = r5
            r7 = r14
            r10 = r2
            r11 = r1
            r1 = r13
            r13 = r4
            r6.d(r7, r8, r10, r11, r12, r13)
            r2 = 1
            int r15 = r15 + r2
            int r1 = r1.b
            if (r15 != r1) goto L_0x03c1
            r1 = 0
            r5.b(r14, r1)
            goto L_0x03c1
        L_0x03b8:
            r11 = 0
            r12 = 0
            r6 = r14
            r7 = r8
            r9 = r2
            r10 = r1
            r6.a(r7, r9, r10, r11, r12)
        L_0x03c1:
            int r1 = r3.e
            r2 = 1
            int r1 = r1 + r2
            r3.e = r1
            r1 = -1
            r0.E0 = r1
            r1 = 0
            r0.F0 = r1
            r0.G0 = r1
            r0.H0 = r1
            r5 = 0
            goto L_0x03d6
        L_0x03d3:
            r2.a = r6
            r5 = 1
        L_0x03d6:
            return r5
        L_0x03d7:
            r7 = 7
            long r5 = r0.B0
            int r3 = r0.C0
            long r8 = (long) r3
            long r5 = r5 - r8
            long r8 = r39.g()
            long r8 = r8 + r5
            ija r3 = r0.D0
            if (r3 == 0) goto L_0x044b
            byte[] r10 = r3.a
            int r11 = r0.C0
            int r5 = (int) r5
            r1.readFully(r10, r11, r5)
            int r5 = r0.A0
            r6 = 1718909296(0x66747970, float:2.8862439E23)
            if (r5 != r6) goto L_0x0432
            r5 = 1
            r0.I0 = r5
            r5 = 8
            r3.G(r5)
            int r5 = r3.g()
            r6 = 1903435808(0x71742020, float:1.2088509E30)
            r10 = 1751476579(0x68656963, float:4.333464E24)
            if (r5 == r10) goto L_0x0410
            if (r5 == r6) goto L_0x040e
            r5 = 0
            goto L_0x0411
        L_0x040e:
            r5 = 1
            goto L_0x0411
        L_0x0410:
            r5 = 2
        L_0x0411:
            if (r5 == 0) goto L_0x0414
            goto L_0x042f
        L_0x0414:
            r5 = 4
            r3.H(r5)
        L_0x0418:
            int r5 = r3.a()
            if (r5 <= 0) goto L_0x042e
            int r5 = r3.g()
            if (r5 == r10) goto L_0x042a
            if (r5 == r6) goto L_0x0428
            r5 = 0
            goto L_0x042b
        L_0x0428:
            r5 = 1
            goto L_0x042b
        L_0x042a:
            r5 = 2
        L_0x042b:
            if (r5 == 0) goto L_0x0418
            goto L_0x042f
        L_0x042e:
            r5 = 0
        L_0x042f:
            r0.O0 = r5
            goto L_0x0461
        L_0x0432:
            boolean r5 = r12.isEmpty()
            if (r5 != 0) goto L_0x0461
            java.lang.Object r5 = r12.peek()
            ox r5 = (defpackage.ox) r5
            qx r6 = new qx
            int r10 = r0.A0
            r6.<init>(r10, r3)
            java.util.ArrayList r3 = r5.o
            r3.add(r6)
            goto L_0x0461
        L_0x044b:
            boolean r3 = r0.I0
            if (r3 != 0) goto L_0x0459
            int r3 = r0.A0
            r10 = 1835295092(0x6d646174, float:4.4175247E27)
            if (r3 != r10) goto L_0x0459
            r3 = 1
            r0.O0 = r3
        L_0x0459:
            int r3 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1))
            if (r3 >= 0) goto L_0x0463
            int r3 = (int) r5
            r1.z(r3)
        L_0x0461:
            r3 = 0
            goto L_0x046b
        L_0x0463:
            long r10 = r39.g()
            long r10 = r10 + r5
            r2.a = r10
            r3 = 1
        L_0x046b:
            r0.j(r8)
            if (r3 == 0) goto L_0x0477
            int r3 = r0.z0
            r5 = 2
            if (r3 == r5) goto L_0x0477
            r3 = 1
            return r3
        L_0x0477:
            r3 = 1
            r10 = r3
            r6 = 2
            r7 = 8
            r8 = 0
            r9 = 4
            goto L_0x000d
        L_0x0480:
            r3 = r10
            r6 = r18
            r7 = 7
            int r5 = r0.C0
            ija r8 = r0.Y
            if (r5 != 0) goto L_0x04f2
            byte[] r5 = r8.a
            r9 = 0
            r10 = 8
            boolean r5 = r1.i(r5, r9, r10, r3)
            if (r5 != 0) goto L_0x04db
            int r1 = r0.O0
            r3 = 2
            if (r1 != r3) goto L_0x04d9
            int r1 = r0.b
            r1 = r1 & r3
            if (r1 == 0) goto L_0x04d9
            i75 r1 = r0.J0
            r2 = 4
            bpe r1 = r1.B(r9, r2)
            p69 r2 = r0.P0
            if (r2 != 0) goto L_0x04ac
            r13 = 0
            goto L_0x04b6
        L_0x04ac:
            a39 r13 = new a39
            r3 = 1
            x29[] r3 = new defpackage.x29[r3]
            r3[r9] = r2
            r13.<init>((defpackage.x29[]) r3)
        L_0x04b6:
            uu5 r2 = new uu5
            r2.<init>()
            r2.j = r13
            xu5 r3 = new xu5
            r3.<init>(r2)
            r1.e(r3)
            i75 r1 = r0.J0
            r1.w()
            i75 r0 = r0.J0
            wc0 r1 = new wc0
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1.<init>(r2)
            r0.M(r1)
        L_0x04d9:
            r5 = -1
            return r5
        L_0x04db:
            r3 = 2
            r5 = -1
            r9 = 8
            r0.C0 = r9
            r9 = 0
            r8.G(r9)
            long r9 = r8.w()
            r0.B0 = r9
            int r9 = r8.g()
            r0.A0 = r9
            goto L_0x04f4
        L_0x04f2:
            r3 = 2
            r5 = -1
        L_0x04f4:
            long r9 = r0.B0
            r13 = 1
            int r11 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r11 != 0) goto L_0x050f
            byte[] r9 = r8.a
            r10 = 8
            r1.readFully(r9, r10, r10)
            int r9 = r0.C0
            int r9 = r9 + r10
            r0.C0 = r9
            long r9 = r8.z()
            r0.B0 = r9
            goto L_0x0536
        L_0x050f:
            r13 = 0
            int r9 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r9 != 0) goto L_0x0536
            long r9 = r39.x()
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 != 0) goto L_0x0527
            java.lang.Object r11 = r12.peek()
            ox r11 = (defpackage.ox) r11
            if (r11 == 0) goto L_0x0527
            long r9 = r11.c
        L_0x0527:
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L_0x0536
            long r13 = r39.g()
            long r9 = r9 - r13
            int r11 = r0.C0
            long r13 = (long) r11
            long r9 = r9 + r13
            r0.B0 = r9
        L_0x0536:
            long r9 = r0.B0
            int r11 = r0.C0
            long r13 = (long) r11
            int r9 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r9 < 0) goto L_0x068a
            int r9 = r0.A0
            r10 = 1751411826(0x68646c72, float:4.3148E24)
            r13 = 1836019574(0x6d6f6f76, float:4.631354E27)
            r14 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r9 == r13) goto L_0x0567
            r13 = 1953653099(0x7472616b, float:7.681346E31)
            if (r9 == r13) goto L_0x0567
            r13 = 1835297121(0x6d646961, float:4.4181236E27)
            if (r9 == r13) goto L_0x0567
            r13 = 1835626086(0x6d696e66, float:4.515217E27)
            if (r9 == r13) goto L_0x0567
            r13 = 1937007212(0x7374626c, float:1.9362132E31)
            if (r9 == r13) goto L_0x0567
            r13 = 1701082227(0x65647473, float:6.742798E22)
            if (r9 == r13) goto L_0x0567
            if (r9 != r14) goto L_0x056a
        L_0x0567:
            r8 = 1
            goto L_0x0625
        L_0x056a:
            r6 = 1835296868(0x6d646864, float:4.418049E27)
            if (r9 == r6) goto L_0x05c1
            r6 = 1836476516(0x6d766864, float:4.7662196E27)
            if (r9 == r6) goto L_0x05c1
            if (r9 == r10) goto L_0x05c1
            r6 = 1937011556(0x73747364, float:1.9367383E31)
            if (r9 == r6) goto L_0x05c1
            r6 = 1937011827(0x73747473, float:1.9367711E31)
            if (r9 == r6) goto L_0x05c1
            r6 = 1937011571(0x73747373, float:1.9367401E31)
            if (r9 == r6) goto L_0x05c1
            r6 = 1668576371(0x63747473, float:4.5093966E21)
            if (r9 == r6) goto L_0x05c1
            r6 = 1701606260(0x656c7374, float:6.9788014E22)
            if (r9 == r6) goto L_0x05c1
            r6 = 1937011555(0x73747363, float:1.9367382E31)
            if (r9 == r6) goto L_0x05c1
            r6 = 1937011578(0x7374737a, float:1.936741E31)
            if (r9 == r6) goto L_0x05c1
            r6 = 1937013298(0x73747a32, float:1.9369489E31)
            if (r9 == r6) goto L_0x05c1
            r6 = 1937007471(0x7374636f, float:1.9362445E31)
            if (r9 == r6) goto L_0x05c1
            r6 = 1668232756(0x636f3634, float:4.4126776E21)
            if (r9 == r6) goto L_0x05c1
            r6 = 1953196132(0x746b6864, float:7.46037E31)
            if (r9 == r6) goto L_0x05c1
            r6 = 1718909296(0x66747970, float:2.8862439E23)
            if (r9 == r6) goto L_0x05c1
            r6 = 1969517665(0x75647461, float:2.8960062E32)
            if (r9 == r6) goto L_0x05c1
            r6 = 1801812339(0x6b657973, float:2.7741754E26)
            if (r9 == r6) goto L_0x05c1
            r6 = 1768715124(0x696c7374, float:1.7865732E25)
            if (r9 != r6) goto L_0x05c4
        L_0x05c1:
            r6 = 8
            goto L_0x05f6
        L_0x05c4:
            long r8 = r39.g()
            int r6 = r0.C0
            long r10 = (long) r6
            long r30 = r8 - r10
            int r6 = r0.A0
            r8 = 1836086884(0x6d707664, float:4.6512205E27)
            if (r6 != r8) goto L_0x05ea
            p69 r6 = new p69
            long r34 = r30 + r10
            long r8 = r0.B0
            long r36 = r8 - r10
            r28 = 0
            r32 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r27 = r6
            r27.<init>(r28, r30, r32, r34, r36)
            r0.P0 = r6
        L_0x05ea:
            r6 = 0
            r0.D0 = r6
            r6 = 1
            r0.z0 = r6
        L_0x05f0:
            r3 = 8
            r4 = 0
            r7 = 4
            goto L_0x0682
        L_0x05f6:
            if (r11 != r6) goto L_0x05fa
            r6 = 1
            goto L_0x05fb
        L_0x05fa:
            r6 = 0
        L_0x05fb:
            defpackage.oyb.k(r6)
            long r9 = r0.B0
            r11 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r6 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r6 > 0) goto L_0x0609
            r6 = 1
            goto L_0x060a
        L_0x0609:
            r6 = 0
        L_0x060a:
            defpackage.oyb.k(r6)
            ija r6 = new ija
            long r9 = r0.B0
            int r9 = (int) r9
            r6.<init>((int) r9)
            byte[] r8 = r8.a
            byte[] r9 = r6.a
            r10 = 0
            r11 = 8
            java.lang.System.arraycopy(r8, r10, r9, r10, r11)
            r0.D0 = r6
            r8 = 1
            r0.z0 = r8
            goto L_0x05f0
        L_0x0625:
            long r15 = r39.g()
            long r3 = r0.B0
            long r15 = r15 + r3
            int r11 = r0.C0
            long r7 = (long) r11
            long r9 = r15 - r7
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x0662
            int r3 = r0.A0
            if (r3 != r14) goto L_0x0662
            r3 = 8
            r6.D(r3)
            byte[] r4 = r6.a
            r7 = 0
            r1.m(r7, r4, r3)
            byte[] r4 = defpackage.zx.a
            int r4 = r6.b
            r7 = 4
            r6.H(r7)
            int r8 = r6.g()
            r11 = 1751411826(0x68646c72, float:4.3148E24)
            if (r8 == r11) goto L_0x0656
            int r4 = r4 + r7
        L_0x0656:
            r6.G(r4)
            int r4 = r6.b
            r1.z(r4)
            r39.y()
            goto L_0x0665
        L_0x0662:
            r3 = 8
            r7 = 4
        L_0x0665:
            ox r4 = new ox
            int r6 = r0.A0
            r4.<init>(r6, r9)
            r12.push(r4)
            long r11 = r0.B0
            int r4 = r0.C0
            long r14 = (long) r4
            int r4 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r4 != 0) goto L_0x067d
            r0.j(r9)
            r4 = 0
            goto L_0x0682
        L_0x067d:
            r4 = 0
            r0.z0 = r4
            r0.C0 = r4
        L_0x0682:
            r8 = r4
            r9 = r7
            r4 = 3
            r6 = 2
            r10 = 1
            r7 = r3
            goto L_0x000d
        L_0x068a:
            java.lang.String r0 = "Atom size less than header length (unsupported)."
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.c(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q79.g(g75, le4):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0102  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.ttc i(int r21, long r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            o79[] r4 = r0.K0
            int r5 = r4.length
            ztc r6 = defpackage.ztc.c
            if (r5 != 0) goto L_0x0013
            ttc r0 = new ttc
            r0.<init>(r6, r6)
            return r0
        L_0x0013:
            r5 = -1
            if (r1 == r5) goto L_0x0018
            r7 = r1
            goto L_0x001a
        L_0x0018:
            int r7 = r0.M0
        L_0x001a:
            r8 = 0
            if (r7 == r5) goto L_0x0063
            r4 = r4[r7]
            dpe r4 = r4.b
            long[] r7 = r4.f
            int r7 = defpackage.oze.f(r7, r2, r8)
        L_0x0027:
            if (r7 < 0) goto L_0x0035
            int[] r13 = r4.g
            r13 = r13[r7]
            r13 = r13 & 1
            if (r13 == 0) goto L_0x0032
            goto L_0x0036
        L_0x0032:
            int r7 = r7 + -1
            goto L_0x0027
        L_0x0035:
            r7 = r5
        L_0x0036:
            if (r7 != r5) goto L_0x003c
            int r7 = r4.a(r2)
        L_0x003c:
            if (r7 != r5) goto L_0x0044
            ttc r0 = new ttc
            r0.<init>(r6, r6)
            return r0
        L_0x0044:
            long[] r6 = r4.f
            r13 = r6[r7]
            long[] r15 = r4.c
            r16 = r15[r7]
            int r18 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r18 >= 0) goto L_0x0069
            int r11 = r4.b
            int r11 = r11 + -1
            if (r7 >= r11) goto L_0x0069
            int r2 = r4.a(r2)
            if (r2 == r5) goto L_0x0069
            if (r2 == r7) goto L_0x0069
            r3 = r6[r2]
            r11 = r15[r2]
            goto L_0x0070
        L_0x0063:
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r13 = r2
        L_0x0069:
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r11 = -1
        L_0x0070:
            if (r1 != r5) goto L_0x00ec
            r6 = r8
            r1 = r16
        L_0x0075:
            o79[] r7 = r0.K0
            int r15 = r7.length
            if (r6 >= r15) goto L_0x00ee
            int r15 = r0.M0
            if (r6 == r15) goto L_0x00df
            r7 = r7[r6]
            dpe r7 = r7.b
            long[] r15 = r7.f
            int r15 = defpackage.oze.f(r15, r13, r8)
        L_0x0088:
            int[] r8 = r7.g
            if (r15 < 0) goto L_0x0096
            r16 = r8[r15]
            r16 = r16 & 1
            if (r16 == 0) goto L_0x0093
            goto L_0x0097
        L_0x0093:
            int r15 = r15 + -1
            goto L_0x0088
        L_0x0096:
            r15 = r5
        L_0x0097:
            if (r15 != r5) goto L_0x009d
            int r15 = r7.a(r13)
        L_0x009d:
            long[] r9 = r7.c
            if (r15 != r5) goto L_0x00a9
            r16 = r6
        L_0x00a3:
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x00b2
        L_0x00a9:
            r16 = r6
            r5 = r9[r15]
            long r1 = java.lang.Math.min(r5, r1)
            goto L_0x00a3
        L_0x00b2:
            int r15 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r15 == 0) goto L_0x00dc
            long[] r5 = r7.f
            r6 = 0
            int r5 = defpackage.oze.f(r5, r3, r6)
        L_0x00bd:
            if (r5 < 0) goto L_0x00ca
            r15 = r8[r5]
            r15 = r15 & 1
            if (r15 == 0) goto L_0x00c7
        L_0x00c5:
            r8 = -1
            goto L_0x00cc
        L_0x00c7:
            int r5 = r5 + -1
            goto L_0x00bd
        L_0x00ca:
            r5 = -1
            goto L_0x00c5
        L_0x00cc:
            if (r5 != r8) goto L_0x00d2
            int r5 = r7.a(r3)
        L_0x00d2:
            if (r5 != r8) goto L_0x00d5
            goto L_0x00e3
        L_0x00d5:
            r9 = r9[r5]
            long r11 = java.lang.Math.min(r9, r11)
            goto L_0x00e3
        L_0x00dc:
            r6 = 0
            r8 = -1
            goto L_0x00e3
        L_0x00df:
            r16 = r6
            r6 = r8
            r8 = r5
        L_0x00e3:
            int r5 = r16 + 1
            r19 = r6
            r6 = r5
            r5 = r8
            r8 = r19
            goto L_0x0075
        L_0x00ec:
            r1 = r16
        L_0x00ee:
            ztc r0 = new ztc
            r0.<init>(r13, r1)
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0102
            ttc r1 = new ttc
            r1.<init>(r0, r0)
            return r1
        L_0x0102:
            ztc r1 = new ztc
            r1.<init>(r3, r11)
            ttc r2 = new ttc
            r2.<init>(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q79.i(int, long):ttc");
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v67, resolved type: ofe} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v5, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x02d8  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x0538  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x053a  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x0566  */
    /* JADX WARNING: Removed duplicated region for block: B:340:0x06c0 A[LOOP:13: B:338:0x06bd->B:340:0x06c0, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:344:0x06dc  */
    /* JADX WARNING: Removed duplicated region for block: B:377:0x02db A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:395:0x069e A[EDGE_INSN: B:395:0x069e->B:337:0x069e ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j(long r35) {
        /*
            r34 = this;
            r0 = r34
            r1 = 4
            r2 = 8
            r5 = 0
            r6 = 1
        L_0x0007:
            java.util.ArrayDeque r7 = r0.Z
            boolean r8 = r7.isEmpty()
            if (r8 != 0) goto L_0x074c
            java.lang.Object r8 = r7.peek()
            ox r8 = (defpackage.ox) r8
            long r10 = r8.c
            int r8 = (r10 > r35 ? 1 : (r10 == r35 ? 0 : -1))
            if (r8 != 0) goto L_0x074c
            java.lang.Object r8 = r7.pop()
            r10 = r8
            ox r10 = (defpackage.ox) r10
            int r8 = r10.b
            r11 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r8 != r11) goto L_0x072c
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            int r11 = r0.O0
            if (r11 != r6) goto L_0x0035
            r16 = r6
            goto L_0x0037
        L_0x0035:
            r16 = r5
        L_0x0037:
            r66 r15 = new r66
            r15.<init>()
            r11 = 1969517665(0x75647461, float:2.8960062E32)
            qx r11 = r10.w(r11)
            r12 = 1751411826(0x68646c72, float:4.3148E24)
            r9 = 1768715124(0x696c7374, float:1.7865732E25)
            r3 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r11 == 0) goto L_0x0430
            byte[] r19 = defpackage.zx.a
            ija r11 = r11.c
            r11.G(r2)
            a39 r13 = new a39
            x29[] r4 = new defpackage.x29[r5]
            r13.<init>((defpackage.x29[]) r4)
        L_0x005c:
            int r4 = r11.a()
            if (r4 < r2) goto L_0x0425
            int r4 = r11.b
            int r21 = r11.g()
            int r5 = r11.g()
            if (r5 != r3) goto L_0x031a
            r11.G(r4)
            int r5 = r4 + r21
            r11.H(r2)
            int r3 = r11.b
            r11.H(r1)
            int r14 = r11.g()
            if (r14 == r12) goto L_0x0082
            int r3 = r3 + r1
        L_0x0082:
            r11.G(r3)
        L_0x0085:
            int r3 = r11.b
            if (r3 >= r5) goto L_0x030f
            int r14 = r11.g()
            int r12 = r11.g()
            if (r12 != r9) goto L_0x02fc
            r11.G(r3)
            int r3 = r3 + r14
            r11.H(r2)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L_0x009f:
            int r12 = r11.b
            if (r12 >= r3) goto L_0x02ec
            java.lang.String r14 = "Skipped unknown metadata entry: "
            int r25 = r11.g()
            int r12 = r25 + r12
            int r9 = r11.g()
            int r2 = r9 >> 24
            r2 = r2 & 255(0xff, float:3.57E-43)
            r1 = 169(0xa9, float:2.37E-43)
            java.lang.String r6 = "TCON"
            if (r2 == r1) goto L_0x00bd
            r1 = 253(0xfd, float:3.55E-43)
            if (r2 != r1) goto L_0x00c4
        L_0x00bd:
            r30 = r3
            r31 = r7
            r1 = -1
            goto L_0x0235
        L_0x00c4:
            r1 = 1735291493(0x676e7265, float:1.1260334E24)
            if (r9 != r1) goto L_0x00f2
            int r1 = defpackage.lp.H(r11)     // Catch:{ all -> 0x0102 }
            r2 = 1
            int r1 = r1 - r2
            java.lang.String r1 = defpackage.zo6.a(r1)     // Catch:{ all -> 0x0102 }
            if (r1 == 0) goto L_0x00e0
            ofe r2 = new ofe     // Catch:{ all -> 0x0102 }
            e8c r1 = defpackage.ws6.n(r1)     // Catch:{ all -> 0x0102 }
            r9 = 0
            r2.<init>(r6, r9, r1)     // Catch:{ all -> 0x0102 }
            goto L_0x00e7
        L_0x00e0:
            r9 = 0
            java.lang.String r1 = "Failed to parse standard genre code"
            defpackage.ez3.j0(r1)     // Catch:{ all -> 0x0102 }
            r2 = r9
        L_0x00e7:
            r11.G(r12)
            r9 = r2
        L_0x00eb:
            r30 = r3
            r31 = r7
            r1 = -1
            goto L_0x02d6
        L_0x00f2:
            r1 = 0
            r2 = 1684632427(0x6469736b, float:1.7225632E22)
            if (r9 != r2) goto L_0x0105
            java.lang.String r2 = "TPOS"
            ofe r9 = defpackage.lp.G(r9, r11, r2)     // Catch:{ all -> 0x0102 }
        L_0x00fe:
            r11.G(r12)
            goto L_0x00eb
        L_0x0102:
            r0 = move-exception
            goto L_0x02e8
        L_0x0105:
            r2 = 1953655662(0x74726b6e, float:7.6825853E31)
            if (r9 != r2) goto L_0x0111
            java.lang.String r2 = "TRCK"
            ofe r9 = defpackage.lp.G(r9, r11, r2)     // Catch:{ all -> 0x0102 }
            goto L_0x00fe
        L_0x0111:
            r2 = 1953329263(0x746d706f, float:7.5247484E31)
            if (r9 != r2) goto L_0x011f
            java.lang.String r2 = "TBPM"
            r6 = 1
            r14 = 0
            yo6 r9 = defpackage.lp.I(r9, r2, r11, r6, r14)     // Catch:{ all -> 0x0102 }
            goto L_0x00fe
        L_0x011f:
            r2 = 1668311404(0x6370696c, float:4.434815E21)
            if (r9 != r2) goto L_0x012c
            java.lang.String r2 = "TCMP"
            r6 = 1
            yo6 r9 = defpackage.lp.I(r9, r2, r11, r6, r6)     // Catch:{ all -> 0x0102 }
            goto L_0x00fe
        L_0x012c:
            r2 = 1668249202(0x636f7672, float:4.4173067E21)
            if (r9 != r2) goto L_0x0136
            ul r9 = defpackage.lp.F(r11)     // Catch:{ all -> 0x0102 }
            goto L_0x00fe
        L_0x0136:
            r2 = 1631670868(0x61415254, float:2.2288462E20)
            if (r9 != r2) goto L_0x0142
            java.lang.String r2 = "TPE2"
            ofe r9 = defpackage.lp.J(r9, r11, r2)     // Catch:{ all -> 0x0102 }
            goto L_0x00fe
        L_0x0142:
            r2 = 1936682605(0x736f6e6d, float:1.8969706E31)
            if (r9 != r2) goto L_0x014e
            java.lang.String r2 = "TSOT"
            ofe r9 = defpackage.lp.J(r9, r11, r2)     // Catch:{ all -> 0x0102 }
            goto L_0x00fe
        L_0x014e:
            r2 = 1936679276(0x736f616c, float:1.8965681E31)
            if (r9 != r2) goto L_0x015a
            java.lang.String r2 = "TSOA"
            ofe r9 = defpackage.lp.J(r9, r11, r2)     // Catch:{ all -> 0x0102 }
            goto L_0x00fe
        L_0x015a:
            r2 = 1936679282(0x736f6172, float:1.8965689E31)
            if (r9 != r2) goto L_0x0166
            java.lang.String r2 = "TSOP"
            ofe r9 = defpackage.lp.J(r9, r11, r2)     // Catch:{ all -> 0x0102 }
            goto L_0x00fe
        L_0x0166:
            r2 = 1936679265(0x736f6161, float:1.8965668E31)
            if (r9 != r2) goto L_0x0172
            java.lang.String r2 = "TSO2"
            ofe r9 = defpackage.lp.J(r9, r11, r2)     // Catch:{ all -> 0x0102 }
            goto L_0x00fe
        L_0x0172:
            r2 = 1936679791(0x736f636f, float:1.8966304E31)
            if (r9 != r2) goto L_0x017e
            java.lang.String r2 = "TSOC"
            ofe r9 = defpackage.lp.J(r9, r11, r2)     // Catch:{ all -> 0x0102 }
            goto L_0x00fe
        L_0x017e:
            r2 = 1920233063(0x72746e67, float:4.84146E30)
            if (r9 != r2) goto L_0x018c
            java.lang.String r2 = "ITUNESADVISORY"
            r6 = 0
            yo6 r9 = defpackage.lp.I(r9, r2, r11, r6, r6)     // Catch:{ all -> 0x0102 }
            goto L_0x00fe
        L_0x018c:
            r2 = 1885823344(0x70676170, float:2.8643533E29)
            if (r9 != r2) goto L_0x019b
            java.lang.String r2 = "ITUNESGAPLESS"
            r6 = 1
            r14 = 0
            yo6 r9 = defpackage.lp.I(r9, r2, r11, r14, r6)     // Catch:{ all -> 0x0102 }
            goto L_0x00fe
        L_0x019b:
            r2 = 1936683886(0x736f736e, float:1.8971255E31)
            if (r9 != r2) goto L_0x01a8
            java.lang.String r2 = "TVSHOWSORT"
            ofe r9 = defpackage.lp.J(r9, r11, r2)     // Catch:{ all -> 0x0102 }
            goto L_0x00fe
        L_0x01a8:
            r2 = 1953919848(0x74767368, float:7.810338E31)
            if (r9 != r2) goto L_0x01b5
            java.lang.String r2 = "TVSHOW"
            ofe r9 = defpackage.lp.J(r9, r11, r2)     // Catch:{ all -> 0x0102 }
            goto L_0x00fe
        L_0x01b5:
            r2 = 757935405(0x2d2d2d2d, float:9.8439425E-12)
            if (r9 != r2) goto L_0x022e
            r2 = r1
            r9 = r2
            r6 = -1
            r14 = -1
        L_0x01be:
            int r1 = r11.b     // Catch:{ all -> 0x0102 }
            if (r1 >= r12) goto L_0x0207
            int r28 = r11.g()     // Catch:{ all -> 0x0102 }
            r29 = r1
            int r1 = r11.g()     // Catch:{ all -> 0x0102 }
            r30 = r3
            r3 = 4
            r11.H(r3)     // Catch:{ all -> 0x0102 }
            r3 = 1835360622(0x6d65616e, float:4.4368658E27)
            if (r1 != r3) goto L_0x01e3
            r3 = 12
            int r1 = r28 + -12
            java.lang.String r1 = r11.q(r1)     // Catch:{ all -> 0x0102 }
            r9 = r1
            r31 = r7
            goto L_0x0202
        L_0x01e3:
            r31 = r7
            r3 = 12
            r7 = 1851878757(0x6e616d65, float:1.7441594E28)
            if (r1 != r7) goto L_0x01f4
            int r1 = r28 + -12
            java.lang.String r1 = r11.q(r1)     // Catch:{ all -> 0x0102 }
            r2 = r1
            goto L_0x0202
        L_0x01f4:
            r7 = 1684108385(0x64617461, float:1.6635614E22)
            if (r1 != r7) goto L_0x01fd
            r14 = r28
            r6 = r29
        L_0x01fd:
            int r1 = r28 + -12
            r11.H(r1)     // Catch:{ all -> 0x0102 }
        L_0x0202:
            r3 = r30
            r7 = r31
            goto L_0x01be
        L_0x0207:
            r30 = r3
            r31 = r7
            if (r9 == 0) goto L_0x0227
            if (r2 == 0) goto L_0x0227
            r1 = -1
            if (r6 != r1) goto L_0x0213
            goto L_0x0228
        L_0x0213:
            r11.G(r6)     // Catch:{ all -> 0x0102 }
            r3 = 16
            r11.H(r3)     // Catch:{ all -> 0x0102 }
            int r14 = r14 - r3
            java.lang.String r3 = r11.q(r14)     // Catch:{ all -> 0x0102 }
            qz6 r6 = new qz6     // Catch:{ all -> 0x0102 }
            r6.<init>(r9, r2, r3)     // Catch:{ all -> 0x0102 }
            r9 = r6
            goto L_0x0229
        L_0x0227:
            r1 = -1
        L_0x0228:
            r9 = 0
        L_0x0229:
            r11.G(r12)
            goto L_0x02d6
        L_0x022e:
            r30 = r3
            r31 = r7
            r1 = -1
            goto L_0x02ae
        L_0x0235:
            r2 = 16777215(0xffffff, float:2.3509886E-38)
            r2 = r2 & r9
            r3 = 6516084(0x636d74, float:9.130979E-39)
            if (r2 != r3) goto L_0x0243
            y33 r9 = defpackage.lp.E(r9, r11)     // Catch:{ all -> 0x0102 }
            goto L_0x0229
        L_0x0243:
            r3 = 7233901(0x6e616d, float:1.0136854E-38)
            if (r2 == r3) goto L_0x02ce
            r3 = 7631467(0x74726b, float:1.0693963E-38)
            if (r2 != r3) goto L_0x024f
            goto L_0x02ce
        L_0x024f:
            r3 = 6516589(0x636f6d, float:9.131686E-39)
            if (r2 == r3) goto L_0x02c6
            r3 = 7828084(0x777274, float:1.0969482E-38)
            if (r2 != r3) goto L_0x025b
            goto L_0x02c6
        L_0x025b:
            r3 = 6578553(0x646179, float:9.218516E-39)
            if (r2 != r3) goto L_0x0267
            java.lang.String r2 = "TDRC"
            ofe r9 = defpackage.lp.J(r9, r11, r2)     // Catch:{ all -> 0x0102 }
            goto L_0x0229
        L_0x0267:
            r3 = 4280916(0x415254, float:5.998841E-39)
            if (r2 != r3) goto L_0x0273
            java.lang.String r2 = "TPE1"
            ofe r9 = defpackage.lp.J(r9, r11, r2)     // Catch:{ all -> 0x0102 }
            goto L_0x0229
        L_0x0273:
            r3 = 7630703(0x746f6f, float:1.0692892E-38)
            if (r2 != r3) goto L_0x027f
            java.lang.String r2 = "TSSE"
            ofe r9 = defpackage.lp.J(r9, r11, r2)     // Catch:{ all -> 0x0102 }
            goto L_0x0229
        L_0x027f:
            r3 = 6384738(0x616c62, float:8.946924E-39)
            if (r2 != r3) goto L_0x028b
            java.lang.String r2 = "TALB"
            ofe r9 = defpackage.lp.J(r9, r11, r2)     // Catch:{ all -> 0x0102 }
            goto L_0x0229
        L_0x028b:
            r3 = 7108978(0x6c7972, float:9.9618E-39)
            if (r2 != r3) goto L_0x0297
            java.lang.String r2 = "USLT"
            ofe r9 = defpackage.lp.J(r9, r11, r2)     // Catch:{ all -> 0x0102 }
            goto L_0x0229
        L_0x0297:
            r3 = 6776174(0x67656e, float:9.495442E-39)
            if (r2 != r3) goto L_0x02a1
            ofe r9 = defpackage.lp.J(r9, r11, r6)     // Catch:{ all -> 0x0102 }
            goto L_0x0229
        L_0x02a1:
            r3 = 6779504(0x677270, float:9.500109E-39)
            if (r2 != r3) goto L_0x02ae
            java.lang.String r2 = "TIT1"
            ofe r9 = defpackage.lp.J(r9, r11, r2)     // Catch:{ all -> 0x0102 }
            goto L_0x0229
        L_0x02ae:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0102 }
            r2.<init>(r14)     // Catch:{ all -> 0x0102 }
            java.lang.String r3 = defpackage.rx.e(r9)     // Catch:{ all -> 0x0102 }
            r2.append(r3)     // Catch:{ all -> 0x0102 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0102 }
            defpackage.ez3.v(r2)     // Catch:{ all -> 0x0102 }
            r11.G(r12)
            r9 = 0
            goto L_0x02d6
        L_0x02c6:
            java.lang.String r2 = "TCOM"
            ofe r9 = defpackage.lp.J(r9, r11, r2)     // Catch:{ all -> 0x0102 }
            goto L_0x0229
        L_0x02ce:
            java.lang.String r2 = "TIT2"
            ofe r9 = defpackage.lp.J(r9, r11, r2)     // Catch:{ all -> 0x0102 }
            goto L_0x0229
        L_0x02d6:
            if (r9 == 0) goto L_0x02db
            r5.add(r9)
        L_0x02db:
            r3 = r30
            r7 = r31
            r1 = 4
            r2 = 8
            r6 = 1
            r9 = 1768715124(0x696c7374, float:1.7865732E25)
            goto L_0x009f
        L_0x02e8:
            r11.G(r12)
            throw r0
        L_0x02ec:
            r31 = r7
            r1 = -1
            boolean r2 = r5.isEmpty()
            if (r2 == 0) goto L_0x02f6
            goto L_0x0312
        L_0x02f6:
            a39 r9 = new a39
            r9.<init>((java.util.List) r5)
            goto L_0x0313
        L_0x02fc:
            r31 = r7
            r1 = -1
            int r3 = r3 + r14
            r11.G(r3)
            r1 = 4
            r2 = 8
            r6 = 1
            r9 = 1768715124(0x696c7374, float:1.7865732E25)
            r12 = 1751411826(0x68646c72, float:4.3148E24)
            goto L_0x0085
        L_0x030f:
            r31 = r7
            r1 = -1
        L_0x0312:
            r9 = 0
        L_0x0313:
            a39 r2 = r13.b(r9)
        L_0x0317:
            r13 = r2
            goto L_0x040e
        L_0x031a:
            r31 = r7
            r1 = -1
            r2 = 1936553057(0x736d7461, float:1.8813092E31)
            if (r5 != r2) goto L_0x03bd
            r11.G(r4)
            int r2 = r4 + r21
            r3 = 12
            r11.H(r3)
        L_0x032c:
            int r3 = r11.b
            if (r3 >= r2) goto L_0x0341
            int r5 = r11.g()
            int r6 = r11.g()
            r7 = 1935766900(0x73617574, float:1.7862687E31)
            if (r6 != r7) goto L_0x03b1
            r6 = 16
            if (r5 >= r6) goto L_0x0344
        L_0x0341:
            r9 = 0
            goto L_0x03b7
        L_0x0344:
            r3 = 4
            r11.H(r3)
            r7 = r1
            r3 = 0
            r5 = 0
        L_0x034b:
            r6 = 2
            if (r3 >= r6) goto L_0x0361
            int r6 = r11.u()
            int r9 = r11.u()
            if (r6 != 0) goto L_0x035b
            r7 = r9
            r12 = 1
            goto L_0x035f
        L_0x035b:
            r12 = 1
            if (r6 != r12) goto L_0x035f
            r5 = r9
        L_0x035f:
            int r3 = r3 + r12
            goto L_0x034b
        L_0x0361:
            r3 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            r6 = 12
            if (r7 != r6) goto L_0x036b
            r2 = 240(0xf0, float:3.36E-43)
            goto L_0x039c
        L_0x036b:
            r6 = 13
            if (r7 != r6) goto L_0x0372
            r2 = 120(0x78, float:1.68E-43)
            goto L_0x039c
        L_0x0372:
            r6 = 21
            if (r7 == r6) goto L_0x0378
        L_0x0376:
            r2 = r3
            goto L_0x039c
        L_0x0378:
            int r6 = r11.a()
            r7 = 8
            if (r6 < r7) goto L_0x0376
            int r6 = r11.b
            int r6 = r6 + r7
            if (r6 <= r2) goto L_0x0386
            goto L_0x0376
        L_0x0386:
            int r2 = r11.g()
            int r6 = r11.g()
            r7 = 12
            if (r2 < r7) goto L_0x0376
            r2 = 1936877170(0x73726672, float:1.9204921E31)
            if (r6 == r2) goto L_0x0398
            goto L_0x0376
        L_0x0398:
            int r2 = r11.v()
        L_0x039c:
            if (r2 != r3) goto L_0x039f
            goto L_0x0341
        L_0x039f:
            a39 r9 = new a39
            zkd r3 = new zkd
            float r2 = (float) r2
            r3.<init>(r5, r2)
            r2 = 1
            x29[] r5 = new defpackage.x29[r2]
            r2 = 0
            r5[r2] = r3
            r9.<init>((defpackage.x29[]) r5)
            goto L_0x03b7
        L_0x03b1:
            int r3 = r3 + r5
            r11.G(r3)
            goto L_0x032c
        L_0x03b7:
            a39 r2 = r13.b(r9)
            goto L_0x0317
        L_0x03bd:
            r2 = -1451722374(0xffffffffa978797a, float:-5.5172426E-14)
            if (r5 != r2) goto L_0x040e
            short r2 = r11.r()
            r3 = 2
            r11.H(r3)
            java.nio.charset.Charset r3 = defpackage.f22.c
            java.lang.String r2 = r11.s(r2, r3)
            r3 = 43
            int r3 = r2.lastIndexOf(r3)
            r5 = 45
            int r5 = r2.lastIndexOf(r5)
            int r3 = java.lang.Math.max(r3, r5)
            r5 = 0
            java.lang.String r6 = r2.substring(r5, r3)     // Catch:{ IndexOutOfBoundsException | NumberFormatException -> 0x0407 }
            float r5 = java.lang.Float.parseFloat(r6)     // Catch:{ IndexOutOfBoundsException | NumberFormatException -> 0x0407 }
            int r6 = r2.length()     // Catch:{ IndexOutOfBoundsException | NumberFormatException -> 0x0407 }
            r7 = 1
            int r6 = r6 - r7
            java.lang.String r2 = r2.substring(r3, r6)     // Catch:{ IndexOutOfBoundsException | NumberFormatException -> 0x0407 }
            float r2 = java.lang.Float.parseFloat(r2)     // Catch:{ IndexOutOfBoundsException | NumberFormatException -> 0x0407 }
            a39 r9 = new a39     // Catch:{ IndexOutOfBoundsException | NumberFormatException -> 0x0407 }
            u79 r3 = new u79     // Catch:{ IndexOutOfBoundsException | NumberFormatException -> 0x0407 }
            r3.<init>(r5, r2)     // Catch:{ IndexOutOfBoundsException | NumberFormatException -> 0x0407 }
            x29[] r2 = new defpackage.x29[r7]     // Catch:{ IndexOutOfBoundsException | NumberFormatException -> 0x0407 }
            r5 = 0
            r2[r5] = r3     // Catch:{ IndexOutOfBoundsException | NumberFormatException -> 0x0407 }
            r9.<init>((defpackage.x29[]) r2)     // Catch:{ IndexOutOfBoundsException | NumberFormatException -> 0x0407 }
            goto L_0x0408
        L_0x0407:
            r9 = 0
        L_0x0408:
            a39 r2 = r13.b(r9)
            goto L_0x0317
        L_0x040e:
            int r4 = r4 + r21
            r11.G(r4)
            r7 = r31
            r1 = 4
            r2 = 8
            r3 = 1835365473(0x6d657461, float:4.4382975E27)
            r5 = 0
            r6 = 1
            r9 = 1768715124(0x696c7374, float:1.7865732E25)
            r12 = 1751411826(0x68646c72, float:4.3148E24)
            goto L_0x005c
        L_0x0425:
            r31 = r7
            r1 = -1
            r15.b(r13)
            r2 = r13
            r3 = 1835365473(0x6d657461, float:4.4382975E27)
            goto L_0x0434
        L_0x0430:
            r31 = r7
            r1 = -1
            r2 = 0
        L_0x0434:
            ox r3 = r10.v(r3)
            if (r3 == 0) goto L_0x0516
            byte[] r4 = defpackage.zx.a
            r4 = 1751411826(0x68646c72, float:4.3148E24)
            qx r4 = r3.w(r4)
            r5 = 1801812339(0x6b657973, float:2.7741754E26)
            qx r5 = r3.w(r5)
            r6 = 1768715124(0x696c7374, float:1.7865732E25)
            qx r3 = r3.w(r6)
            if (r4 == 0) goto L_0x0516
            if (r5 == 0) goto L_0x0516
            if (r3 == 0) goto L_0x0516
            ija r4 = r4.c
            r6 = 16
            r4.G(r6)
            int r4 = r4.g()
            r6 = 1835299937(0x6d647461, float:4.4189547E27)
            if (r4 == r6) goto L_0x0469
            goto L_0x0516
        L_0x0469:
            ija r4 = r5.c
            r5 = 12
            r4.G(r5)
            int r6 = r4.g()
            java.lang.String[] r7 = new java.lang.String[r6]
            r9 = 0
        L_0x0477:
            if (r9 >= r6) goto L_0x048f
            int r11 = r4.g()
            r14 = 4
            r4.H(r14)
            r12 = 8
            int r11 = r11 - r12
            java.nio.charset.Charset r13 = defpackage.f22.c
            java.lang.String r11 = r4.s(r11, r13)
            r7[r9] = r11
            r11 = 1
            int r9 = r9 + r11
            goto L_0x0477
        L_0x048f:
            r12 = 8
            r14 = 4
            ija r3 = r3.c
            r3.G(r12)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L_0x049c:
            int r9 = r3.a()
            if (r9 <= r12) goto L_0x0509
            int r9 = r3.b
            int r11 = r3.g()
            int r12 = r3.g()
            r13 = 1
            int r12 = r12 - r13
            if (r12 < 0) goto L_0x04f5
            if (r12 >= r6) goto L_0x04f5
            r12 = r7[r12]
            int r13 = r9 + r11
        L_0x04b6:
            int r1 = r3.b
            if (r1 >= r13) goto L_0x04ec
            int r20 = r3.g()
            int r5 = r3.g()
            r14 = 1684108385(0x64617461, float:1.6635614E22)
            if (r5 != r14) goto L_0x04e1
            int r1 = r3.g()
            int r5 = r3.g()
            r13 = 16
            int r14 = r20 + -16
            byte[] r13 = new byte[r14]
            r23 = r6
            r6 = 0
            r3.e(r6, r13, r14)
            fy7 r6 = new fy7
            r6.<init>(r13, r5, r1, r12)
            goto L_0x04ef
        L_0x04e1:
            r23 = r6
            int r1 = r1 + r20
            r3.G(r1)
            r5 = 12
            r14 = 4
            goto L_0x04b6
        L_0x04ec:
            r23 = r6
            r6 = 0
        L_0x04ef:
            if (r6 == 0) goto L_0x04fc
            r4.add(r6)
            goto L_0x04fc
        L_0x04f5:
            r23 = r6
            java.lang.String r1 = "Skipped metadata with unknown key index: "
            us8.l(r12, r1)
        L_0x04fc:
            int r9 = r9 + r11
            r3.G(r9)
            r6 = r23
            r1 = -1
            r5 = 12
            r12 = 8
            r14 = 4
            goto L_0x049c
        L_0x0509:
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto L_0x0510
            goto L_0x0516
        L_0x0510:
            a39 r9 = new a39
            r9.<init>((java.util.List) r4)
            goto L_0x0517
        L_0x0516:
            r9 = 0
        L_0x0517:
            a39 r1 = new a39
            r3 = 1836476516(0x6d766864, float:4.7662196E27)
            qx r3 = r10.w(r3)
            r3.getClass()
            ija r3 = r3.c
            v79 r3 = defpackage.zx.c(r3)
            r4 = 1
            x29[] r5 = new defpackage.x29[r4]
            r6 = 0
            r5[r6] = r3
            r1.<init>((defpackage.x29[]) r5)
            int r3 = r0.b
            r5 = r3 & 1
            if (r5 == 0) goto L_0x053a
            r4 = 1
            goto L_0x053b
        L_0x053a:
            r4 = 0
        L_0x053b:
            be8 r5 = new be8
            r6 = 25
            r5.<init>(r6)
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r14 = 0
            r11 = r15
            r6 = -1
            r7 = 0
            r19 = 4
            r7 = r15
            r15 = r4
            r17 = r5
            java.util.ArrayList r4 = defpackage.zx.f(r10, r11, r12, r14, r15, r16, r17)
            r14 = r6
            r13 = r7
            r5 = 0
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r12 = 0
        L_0x055e:
            int r15 = r4.size()
            r24 = 0
            if (r5 >= r15) goto L_0x069e
            java.lang.Object r15 = r4.get(r5)
            dpe r15 = (defpackage.dpe) r15
            int r10 = r15.b
            if (r10 != 0) goto L_0x0582
            r27 = r1
            r20 = r4
            r16 = r5
            r4 = r13
            r1 = -1
            r5 = 1
            r18 = 16
            r28 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0694
        L_0x0582:
            noe r10 = r15.a
            r11 = r4
            r16 = r5
            long r4 = r10.e
            r28 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r20 = (r4 > r28 ? 1 : (r4 == r28 ? 0 : -1))
            if (r20 == 0) goto L_0x0593
            goto L_0x0595
        L_0x0593:
            long r4 = r15.h
        L_0x0595:
            long r6 = java.lang.Math.max(r6, r4)
            r32 = r6
            o79 r6 = new o79
            i75 r7 = r0.J0
            r20 = 1
            int r23 = r12 + 1
            r20 = r11
            int r11 = r10.b
            bpe r7 = r7.B(r12, r11)
            r6.<init>(r10, r15, r7)
            xu5 r7 = r10.f
            java.lang.String r10 = r7.n
            java.lang.String r12 = "audio/true-hd"
            boolean r10 = r12.equals(r10)
            int r12 = r15.e
            if (r10 == 0) goto L_0x05c1
            r18 = 16
            int r12 = r12 * 16
            goto L_0x05c5
        L_0x05c1:
            r18 = 16
            int r12 = r12 + 30
        L_0x05c5:
            uu5 r10 = r7.a()
            r10.n = r12
            r12 = 2
            if (r11 != r12) goto L_0x05f0
            r12 = 8
            r26 = r3 & 8
            if (r26 == 0) goto L_0x05df
            r12 = -1
            if (r14 != r12) goto L_0x05d9
            r12 = 1
            goto L_0x05da
        L_0x05d9:
            r12 = 2
        L_0x05da:
            int r7 = r7.f
            r7 = r7 | r12
            r10.f = r7
        L_0x05df:
            int r7 = (r4 > r24 ? 1 : (r4 == r24 ? 0 : -1))
            if (r7 <= 0) goto L_0x05f0
            int r7 = r15.b
            if (r7 <= 0) goto L_0x05f0
            float r7 = (float) r7
            float r4 = (float) r4
            r5 = 1232348160(0x49742400, float:1000000.0)
            float r4 = r4 / r5
            float r7 = r7 / r4
            r10.u = r7
        L_0x05f0:
            r4 = 1
            if (r11 != r4) goto L_0x0602
            r4 = r13
            int r5 = r4.a
            r7 = -1
            if (r5 == r7) goto L_0x0603
            int r12 = r4.b
            if (r12 == r7) goto L_0x0603
            r10.D = r5
            r10.E = r12
            goto L_0x0603
        L_0x0602:
            r4 = r13
        L_0x0603:
            java.util.ArrayList r5 = r0.x0
            boolean r7 = r5.isEmpty()
            if (r7 == 0) goto L_0x060d
            r7 = 0
            goto L_0x0612
        L_0x060d:
            a39 r7 = new a39
            r7.<init>((java.util.List) r5)
        L_0x0612:
            a39[] r5 = new defpackage.a39[]{r7, r2, r1}
            a39 r7 = new a39
            r12 = 0
            x29[] r13 = new defpackage.x29[r12]
            r7.<init>((defpackage.x29[]) r13)
            if (r9 == 0) goto L_0x0660
            r12 = 0
        L_0x0621:
            x29[] r13 = r9.a
            int r15 = r13.length
            if (r12 >= r15) goto L_0x0660
            r13 = r13[r12]
            boolean r15 = r13 instanceof defpackage.fy7
            if (r15 == 0) goto L_0x0659
            fy7 r13 = (defpackage.fy7) r13
            java.lang.String r15 = r13.a
            r27 = r1
            java.lang.String r1 = "com.android.capture.fps"
            boolean r1 = r15.equals(r1)
            if (r1 == 0) goto L_0x064d
            r1 = 2
            if (r11 != r1) goto L_0x0649
            r1 = 1
            x29[] r15 = new defpackage.x29[r1]
            r22 = 0
            r15[r22] = r13
            a39 r7 = r7.a(r15)
            goto L_0x065c
        L_0x0649:
            r1 = 1
            r22 = 0
            goto L_0x065c
        L_0x064d:
            r1 = 1
            r22 = 0
            x29[] r15 = new defpackage.x29[r1]
            r15[r22] = r13
            a39 r7 = r7.a(r15)
            goto L_0x065c
        L_0x0659:
            r27 = r1
            r1 = 1
        L_0x065c:
            int r12 = r12 + r1
            r1 = r27
            goto L_0x0621
        L_0x0660:
            r27 = r1
            r1 = 1
            r12 = 0
        L_0x0664:
            r13 = 3
            if (r12 >= r13) goto L_0x066f
            r13 = r5[r12]
            a39 r7 = r7.b(r13)
            int r12 = r12 + r1
            goto L_0x0664
        L_0x066f:
            x29[] r1 = r7.a
            int r1 = r1.length
            if (r1 <= 0) goto L_0x0676
            r10.j = r7
        L_0x0676:
            xu5 r1 = new xu5
            r1.<init>(r10)
            bpe r5 = r6.c
            r5.e(r1)
            r1 = 2
            if (r11 != r1) goto L_0x068b
            r1 = -1
            if (r14 != r1) goto L_0x068c
            int r14 = r8.size()
            goto L_0x068c
        L_0x068b:
            r1 = -1
        L_0x068c:
            r8.add(r6)
            r12 = r23
            r6 = r32
            r5 = 1
        L_0x0694:
            int r10 = r16 + 1
            r13 = r4
            r5 = r10
            r4 = r20
            r1 = r27
            goto L_0x055e
        L_0x069e:
            r1 = -1
            r18 = 16
            r0.M0 = r14
            r0.N0 = r6
            r2 = 0
            o79[] r3 = new defpackage.o79[r2]
            java.lang.Object[] r2 = r8.toArray(r3)
            o79[] r2 = (defpackage.o79[]) r2
            r0.K0 = r2
            int r3 = r2.length
            long[][] r3 = new long[r3][]
            int r4 = r2.length
            int[] r4 = new int[r4]
            int r5 = r2.length
            long[] r5 = new long[r5]
            int r6 = r2.length
            boolean[] r6 = new boolean[r6]
            r14 = 0
        L_0x06bd:
            int r7 = r2.length
            if (r14 >= r7) goto L_0x06d8
            r7 = r2[r14]
            dpe r7 = r7.b
            int r7 = r7.b
            long[] r7 = new long[r7]
            r3[r14] = r7
            r7 = r2[r14]
            dpe r7 = r7.b
            long[] r7 = r7.f
            r8 = 0
            r9 = r7[r8]
            r5[r14] = r9
            r7 = 1
            int r14 = r14 + r7
            goto L_0x06bd
        L_0x06d8:
            r14 = 0
        L_0x06d9:
            int r7 = r2.length
            if (r14 >= r7) goto L_0x0718
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r10 = r1
            r9 = 0
        L_0x06e3:
            int r11 = r2.length
            if (r9 >= r11) goto L_0x06f5
            boolean r11 = r6[r9]
            if (r11 != 0) goto L_0x06f2
            r11 = r5[r9]
            int r13 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r13 > 0) goto L_0x06f2
            r10 = r9
            r7 = r11
        L_0x06f2:
            r11 = 1
            int r9 = r9 + r11
            goto L_0x06e3
        L_0x06f5:
            r11 = 1
            r7 = r4[r10]
            r8 = r3[r10]
            r8[r7] = r24
            r9 = r2[r10]
            dpe r9 = r9.b
            int[] r12 = r9.d
            r12 = r12[r7]
            long r12 = (long) r12
            long r24 = r24 + r12
            int r7 = r7 + r11
            r4[r10] = r7
            int r8 = r8.length
            if (r7 >= r8) goto L_0x0714
            long[] r8 = r9.f
            r7 = r8[r7]
            r5[r10] = r7
            goto L_0x06d9
        L_0x0714:
            r6[r10] = r11
            int r14 = r14 + r11
            goto L_0x06d9
        L_0x0718:
            r11 = 1
            r0.L0 = r3
            i75 r1 = r0.J0
            r1.w()
            i75 r1 = r0.J0
            r1.M(r0)
            r31.clear()
            r1 = 2
            r0.z0 = r1
            goto L_0x0744
        L_0x072c:
            r19 = r1
            r11 = r6
            r31 = r7
            r18 = 16
            boolean r1 = r31.isEmpty()
            if (r1 != 0) goto L_0x0744
            java.lang.Object r1 = r31.peek()
            ox r1 = (defpackage.ox) r1
            java.util.ArrayList r1 = r1.X
            r1.add(r10)
        L_0x0744:
            r6 = r11
            r1 = r19
            r2 = 8
            r5 = 0
            goto L_0x0007
        L_0x074c:
            int r1 = r0.z0
            r2 = 2
            if (r1 == r2) goto L_0x0756
            r1 = 0
            r0.z0 = r1
            r0.C0 = r1
        L_0x0756:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q79.j(long):void");
    }

    public final boolean n(g75 g75) {
        e8c e8c;
        dld N = mt0.N(g75, false, (this.b & 2) != 0);
        if (N != null) {
            e8c = ws6.n(N);
        } else {
            po5 po5 = ws6.b;
            e8c = e8c.X;
        }
        this.y0 = e8c;
        return N == null;
    }

    public final List o() {
        return this.y0;
    }

    public final void release() {
    }
}
