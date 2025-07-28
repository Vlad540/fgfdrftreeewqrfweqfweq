package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;

/* renamed from: p79  reason: default package */
public final class p79 implements d75, utc {
    public final yze a = new yze(kjd.l);
    public final yze b = new yze(4);
    public final yze c = new yze(3, false);
    public final yze d = new yze(16);
    public final ArrayDeque e = new ArrayDeque();
    public final guc f = new guc();
    public final ArrayList g = new ArrayList();
    public int h = 0;
    public int i;
    public long j;
    public int k;
    public yze l;
    public int m = -1;
    public int n;
    public int o;
    public int p;
    public h75 q;
    public n79[] r;
    public long[][] s;
    public int t;
    public long u;
    public int v;

    public final boolean c() {
        return true;
    }

    public final void d(long j2, long j3) {
        this.e.clear();
        this.k = 0;
        this.m = -1;
        this.n = 0;
        this.o = 0;
        this.p = 0;
        if (j2 != 0) {
            n79[] n79Arr = this.r;
            if (n79Arr != null) {
                for (n79 n79 : n79Arr) {
                    cpe cpe = n79.b;
                    int f2 = mze.f(cpe.f, j3, false);
                    while (true) {
                        if (f2 < 0) {
                            f2 = -1;
                            break;
                        } else if ((cpe.g[f2] & 1) != 0) {
                            break;
                        } else {
                            f2--;
                        }
                    }
                    if (f2 == -1) {
                        f2 = cpe.a(j3);
                    }
                    n79.e = f2;
                    fse fse = n79.d;
                    if (fse != null) {
                        fse.b = false;
                        fse.c = 0;
                    }
                }
            }
        } else if (this.h != 3) {
            this.h = 0;
            this.k = 0;
        } else {
            guc guc = this.f;
            guc.a.clear();
            guc.b = 0;
            this.g.clear();
        }
    }

    public final stc e(long j2) {
        long j3;
        long j4;
        long j5;
        long j6;
        boolean z;
        int[] iArr;
        long j7;
        int a2;
        p79 p79 = this;
        long j8 = j2;
        n79[] n79Arr = p79.r;
        n79Arr.getClass();
        int length = n79Arr.length;
        ytc ytc = ytc.c;
        if (length == 0) {
            return new stc(ytc, ytc);
        }
        int i2 = p79.t;
        boolean z2 = false;
        if (i2 != -1) {
            cpe cpe = p79.r[i2].b;
            int f2 = mze.f(cpe.f, j8, false);
            while (true) {
                if (f2 < 0) {
                    f2 = -1;
                    break;
                } else if ((cpe.g[f2] & 1) != 0) {
                    break;
                } else {
                    f2--;
                }
            }
            if (f2 == -1) {
                f2 = cpe.a(j8);
            }
            if (f2 == -1) {
                return new stc(ytc, ytc);
            }
            long[] jArr = cpe.f;
            long j9 = jArr[f2];
            long[] jArr2 = cpe.c;
            j3 = jArr2[f2];
            if (j9 >= j8 || f2 >= cpe.b - 1 || (a2 = cpe.a(j8)) == -1 || a2 == f2) {
                j7 = -9223372036854775807L;
                j4 = -1;
            } else {
                j7 = jArr[a2];
                j4 = jArr2[a2];
            }
            j5 = j7;
            j8 = j9;
        } else {
            j3 = Long.MAX_VALUE;
            j5 = -9223372036854775807L;
            j4 = -1;
        }
        int i3 = 0;
        long j10 = j3;
        while (true) {
            n79[] n79Arr2 = p79.r;
            if (i3 >= n79Arr2.length) {
                break;
            }
            if (i3 != p79.t) {
                cpe cpe2 = n79Arr2[i3].b;
                int f3 = mze.f(cpe2.f, j8, z2);
                while (true) {
                    iArr = cpe2.g;
                    if (f3 < 0) {
                        f3 = -1;
                        break;
                    } else if ((iArr[f3] & 1) != 0) {
                        break;
                    } else {
                        f3--;
                    }
                }
                if (f3 == -1) {
                    f3 = cpe2.a(j8);
                }
                long[] jArr3 = cpe2.c;
                if (f3 == -1) {
                    j6 = j8;
                } else {
                    j6 = j8;
                    j10 = Math.min(jArr3[f3], j10);
                }
                if (j5 != -9223372036854775807L) {
                    z = false;
                    int f4 = mze.f(cpe2.f, j5, false);
                    while (true) {
                        if (f4 < 0) {
                            f4 = -1;
                            break;
                        } else if ((iArr[f4] & 1) != 0) {
                            break;
                        } else {
                            f4--;
                        }
                    }
                    if (f4 == -1) {
                        f4 = cpe2.a(j5);
                    }
                    if (f4 != -1) {
                        j4 = Math.min(jArr3[f4], j4);
                    }
                } else {
                    z = false;
                }
            } else {
                j6 = j8;
                z = z2;
            }
            i3++;
            p79 = this;
            z2 = z;
            j8 = j6;
        }
        long j11 = j8;
        ytc ytc2 = new ytc(j8, j10);
        return j5 == -9223372036854775807L ? new stc(ytc2, ytc2) : new stc(ytc2, new ytc(j5, j4));
    }

    public final long f() {
        return this.u;
    }

    public final void g(h75 h75) {
        this.q = h75;
    }

    public final boolean h(f75 f75) {
        return pa2.K(f75, false, false);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0466, code lost:
        r3 = r10;
        r6 = r18;
        r9 = r0.k;
        r10 = r0.d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x046e, code lost:
        if (r9 != 0) goto L_0x048e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0477, code lost:
        if (r1.i(r10.a, 0, 8, r3) != false) goto L_0x047b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0479, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x047b, code lost:
        r0.k = 8;
        r10.H(0);
        r0.j = r10.w();
        r0.i = r10.h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x048f, code lost:
        r13 = r0.j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0495, code lost:
        if (r13 != 1) goto L_0x04a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0497, code lost:
        r1.readFully(r10.a, 8, 8);
        r0.k += 8;
        r0.j = r10.z();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x04ac, code lost:
        if (r13 != 0) goto L_0x04cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x04ae, code lost:
        r13 = r37.x();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x04b4, code lost:
        if (r13 != -1) goto L_0x04c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x04b6, code lost:
        r9 = (defpackage.nx) r12.peek();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x04bc, code lost:
        if (r9 == null) goto L_0x04c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x04be, code lost:
        r13 = r9.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x04c2, code lost:
        if (r13 == -1) goto L_0x04cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x04c4, code lost:
        r0.j = (r13 - r37.g()) + ((long) r0.k);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x04cf, code lost:
        r3 = r0.j;
        r9 = r0.k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x04d6, code lost:
        if (r3 < ((long) r9)) goto L_0x0614;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x04d8, code lost:
        r3 = r0.i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x04e3, code lost:
        if (r3 == 1836019574) goto L_0x0500;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x04e8, code lost:
        if (r3 == 1953653099) goto L_0x0500;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x04ed, code lost:
        if (r3 == 1835297121) goto L_0x0500;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x04f2, code lost:
        if (r3 == 1835626086) goto L_0x0500;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x04f7, code lost:
        if (r3 == 1937007212) goto L_0x0500;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x04fc, code lost:
        if (r3 == 1701082227) goto L_0x0500;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x04fe, code lost:
        if (r3 != 1835365473) goto L_0x0503;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x0506, code lost:
        if (r3 == 1835296868) goto L_0x0587;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x050b, code lost:
        if (r3 == 1836476516) goto L_0x0587;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x050d, code lost:
        if (r3 == 1751411826) goto L_0x0587;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x0512, code lost:
        if (r3 == 1937011556) goto L_0x0587;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x0517, code lost:
        if (r3 == 1937011827) goto L_0x0587;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x051c, code lost:
        if (r3 == 1937011571) goto L_0x0587;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0521, code lost:
        if (r3 == 1668576371) goto L_0x0587;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x0526, code lost:
        if (r3 == 1701606260) goto L_0x0587;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x052b, code lost:
        if (r3 == 1937011555) goto L_0x0587;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x0530, code lost:
        if (r3 == 1937011578) goto L_0x0587;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x0535, code lost:
        if (r3 == 1937013298) goto L_0x0587;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x053a, code lost:
        if (r3 == 1937007471) goto L_0x0587;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x053f, code lost:
        if (r3 == 1668232756) goto L_0x0587;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x0544, code lost:
        if (r3 == 1953196132) goto L_0x0587;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x0549, code lost:
        if (r3 == 1718909296) goto L_0x0587;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x054e, code lost:
        if (r3 == 1969517665) goto L_0x0587;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x0553, code lost:
        if (r3 == 1801812339) goto L_0x0587;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x0558, code lost:
        if (r3 != 1768715124) goto L_0x055b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x055b, code lost:
        r3 = r37.g();
        r9 = (long) r0.k;
        r28 = r3 - r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x0569, code lost:
        if (r0.i != 1836086884) goto L_0x057d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x056b, code lost:
        new defpackage.o69(0, r28, -9223372036854775807L, r28 + r9, r0.j - r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x057d, code lost:
        r0.l = null;
        r0.h = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x0583, code lost:
        r3 = 0;
        r4 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0587, code lost:
        if (r9 != 8) goto L_0x058b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x0589, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x058b, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x058c, code lost:
        swb.h(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x0596, code lost:
        if (r0.j > 2147483647L) goto L_0x059a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x0598, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x059a, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x059b, code lost:
        swb.h(r3);
        r3 = new defpackage.yze((int) r0.j);
        java.lang.System.arraycopy(r10.a, 0, r3.a, 0, 8);
        r0.l = r3;
        r0.h = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x05b4, code lost:
        r9 = r37.g();
        r15 = r12;
        r11 = r0.j;
        r4 = (long) r0.k;
        r9 = (r9 + r11) - r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x05c2, code lost:
        if (r11 == r4) goto L_0x05ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x05c6, code lost:
        if (r0.i != 1835365473) goto L_0x05ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x05c8, code lost:
        r6.E(8);
        r1.m(0, r6.a, 8);
        r3 = defpackage.yx.a;
        r3 = r6.b;
        r4 = 4;
        r6.I(4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x05e0, code lost:
        if (r6.h() == 1751411826) goto L_0x05e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x05e2, code lost:
        r3 = r3 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x05e3, code lost:
        r6.H(r3);
        r1.z(r6.b);
        r37.y();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x05ef, code lost:
        r4 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x05f0, code lost:
        r15.push(new defpackage.nx(r0.i, r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x0602, code lost:
        if (r0.j != ((long) r0.k)) goto L_0x0609;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x0604, code lost:
        j(r9);
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x0609, code lost:
        r3 = 0;
        r0.h = 0;
        r0.k = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x061a, code lost:
        throw com.google.android.exoplayer2.ParserException.c("Atom size less than header length (unsupported).");
     */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x0456  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x045f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int i(defpackage.f75 r37, le4 r38) {
        /*
            r36 = this;
            r0 = r36
            r1 = r37
            r2 = r38
            r4 = 3
            r5 = 2
            r7 = 0
            r8 = 8
            r9 = 4
        L_0x000c:
            r10 = 1
        L_0x000d:
            int r11 = r0.h
            java.util.ArrayDeque r12 = r0.e
            yze r14 = r0.c
            r15 = -1
            r18 = r14
            if (r11 == 0) goto L_0x0466
            r19 = 262144(0x40000, double:1.295163E-318)
            if (r11 == r10) goto L_0x03d0
            r21 = 8
            if (r11 == r5) goto L_0x0239
            if (r11 != r4) goto L_0x0233
            java.util.ArrayList r3 = r0.g
            guc r11 = r0.f
            int r12 = r11.b
            if (r12 == 0) goto L_0x020e
            if (r12 == r10) goto L_0x01dc
            java.util.ArrayList r15 = r11.a
            r6 = 2817(0xb01, float:3.947E-42)
            r14 = 2816(0xb00, float:3.946E-42)
            r13 = 2192(0x890, float:3.072E-42)
            if (r12 == r5) goto L_0x016b
            if (r12 != r4) goto L_0x0165
            long r17 = r37.g()
            long r19 = r37.x()
            long r21 = r37.g()
            long r19 = r19 - r21
            int r11 = r11.c
            long r11 = (long) r11
            long r11 = r19 - r11
            int r11 = (int) r11
            yze r12 = new yze
            r12.<init>((int) r11)
            byte[] r5 = r12.a
            r1.readFully(r5, r7, r11)
            r1 = r7
        L_0x0059:
            int r5 = r15.size()
            if (r1 >= r5) goto L_0x015e
            java.lang.Object r5 = r15.get(r1)
            euc r5 = (defpackage.euc) r5
            long r10 = r5.a
            long r10 = r10 - r17
            int r10 = (int) r10
            r12.H(r10)
            r12.I(r9)
            int r10 = r12.j()
            java.nio.charset.Charset r11 = defpackage.f22.c
            java.lang.String r9 = r12.t(r10, r11)
            int r20 = r9.hashCode()
            switch(r20) {
                case -1711564334: goto L_0x00af;
                case -1332107749: goto L_0x00a4;
                case -1251387154: goto L_0x0099;
                case -830665521: goto L_0x008e;
                case 1760745220: goto L_0x0083;
                default: goto L_0x0081;
            }
        L_0x0081:
            r7 = -1
            goto L_0x00b9
        L_0x0083:
            java.lang.String r7 = "Super_SlowMotion_BGM"
            boolean r7 = r9.equals(r7)
            if (r7 != 0) goto L_0x008c
            goto L_0x0081
        L_0x008c:
            r7 = 4
            goto L_0x00b9
        L_0x008e:
            java.lang.String r7 = "Super_SlowMotion_Deflickering_On"
            boolean r7 = r9.equals(r7)
            if (r7 != 0) goto L_0x0097
            goto L_0x0081
        L_0x0097:
            r7 = r4
            goto L_0x00b9
        L_0x0099:
            java.lang.String r7 = "Super_SlowMotion_Data"
            boolean r7 = r9.equals(r7)
            if (r7 != 0) goto L_0x00a2
            goto L_0x0081
        L_0x00a2:
            r7 = 2
            goto L_0x00b9
        L_0x00a4:
            java.lang.String r7 = "Super_SlowMotion_Edit_Data"
            boolean r7 = r9.equals(r7)
            if (r7 != 0) goto L_0x00ad
            goto L_0x0081
        L_0x00ad:
            r7 = 1
            goto L_0x00b9
        L_0x00af:
            java.lang.String r7 = "SlowMotion_Data"
            boolean r7 = r9.equals(r7)
            if (r7 != 0) goto L_0x00b8
            goto L_0x0081
        L_0x00b8:
            r7 = 0
        L_0x00b9:
            switch(r7) {
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
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.a(r1, r0)
            throw r0
        L_0x00c4:
            r7 = r6
            goto L_0x00cf
        L_0x00c6:
            r7 = 2820(0xb04, float:3.952E-42)
            goto L_0x00cf
        L_0x00c9:
            r7 = r14
            goto L_0x00cf
        L_0x00cb:
            r7 = 2819(0xb03, float:3.95E-42)
            goto L_0x00cf
        L_0x00ce:
            r7 = r13
        L_0x00cf:
            int r10 = r10 + r8
            int r5 = r5.b
            int r5 = r5 - r10
            if (r7 == r13) goto L_0x00ea
            if (r7 == r14) goto L_0x00e8
            if (r7 == r6) goto L_0x00e8
            r5 = 2819(0xb03, float:3.95E-42)
            if (r7 == r5) goto L_0x00e8
            r5 = 2820(0xb04, float:3.952E-42)
            if (r7 != r5) goto L_0x00e2
            goto L_0x00e8
        L_0x00e2:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x00e8:
            r5 = 1
            goto L_0x0159
        L_0x00ea:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.lang.String r5 = r12.t(r5, r11)
            jn r9 = defpackage.guc.e
            java.util.List r5 = r9.O(r5)
            r9 = 0
        L_0x00fa:
            int r10 = r5.size()
            if (r9 >= r10) goto L_0x0150
            java.lang.Object r10 = r5.get(r9)
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            jn r11 = defpackage.guc.d
            java.util.List r10 = r11.O(r10)
            int r11 = r10.size()
            if (r11 != r4) goto L_0x014a
            r11 = 0
            java.lang.Object r20 = r10.get(r11)     // Catch:{ NumberFormatException -> 0x0143 }
            java.lang.String r20 = (java.lang.String) r20     // Catch:{ NumberFormatException -> 0x0143 }
            long r26 = java.lang.Long.parseLong(r20)     // Catch:{ NumberFormatException -> 0x0143 }
            r11 = 1
            java.lang.Object r20 = r10.get(r11)     // Catch:{ NumberFormatException -> 0x0143 }
            java.lang.String r20 = (java.lang.String) r20     // Catch:{ NumberFormatException -> 0x0143 }
            long r28 = java.lang.Long.parseLong(r20)     // Catch:{ NumberFormatException -> 0x0143 }
            r11 = 2
            java.lang.Object r10 = r10.get(r11)     // Catch:{ NumberFormatException -> 0x0143 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ NumberFormatException -> 0x0143 }
            int r10 = java.lang.Integer.parseInt(r10)     // Catch:{ NumberFormatException -> 0x0143 }
            r11 = 1
            int r10 = r10 - r11
            int r30 = r11 << r10
            zjd r10 = new zjd     // Catch:{ NumberFormatException -> 0x0143 }
            r25 = r10
            r25.<init>(r26, r28, r30)     // Catch:{ NumberFormatException -> 0x0143 }
            r7.add(r10)     // Catch:{ NumberFormatException -> 0x0143 }
            int r9 = r9 + r11
            goto L_0x00fa
        L_0x0143:
            r0 = move-exception
            r1 = 0
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.a(r0, r1)
            throw r0
        L_0x014a:
            r1 = 0
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.a(r1, r1)
            throw r0
        L_0x0150:
            bkd r5 = new bkd
            r5.<init>(r7)
            r3.add(r5)
            goto L_0x00e8
        L_0x0159:
            int r1 = r1 + r5
            r7 = 0
            r9 = 4
            goto L_0x0059
        L_0x015e:
            r9 = 0
            r2.a = r9
        L_0x0162:
            r1 = 1
            goto L_0x0225
        L_0x0165:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x016b:
            long r9 = r37.x()
            int r3 = r11.c
            int r3 = r3 + -20
            yze r5 = new yze
            r5.<init>((int) r3)
            byte[] r7 = r5.a
            r12 = 0
            r1.readFully(r7, r12, r3)
            r1 = 0
        L_0x017f:
            int r7 = r3 / 12
            if (r1 >= r7) goto L_0x01c2
            r7 = 2
            r5.I(r7)
            short r7 = r5.l()
            if (r7 == r13) goto L_0x019e
            if (r7 == r14) goto L_0x019e
            if (r7 == r6) goto L_0x019e
            r12 = 2819(0xb03, float:3.95E-42)
            r6 = 2820(0xb04, float:3.952E-42)
            if (r7 == r12) goto L_0x01a2
            if (r7 == r6) goto L_0x01a2
            r5.I(r8)
        L_0x019c:
            r6 = 1
            goto L_0x01ba
        L_0x019e:
            r6 = 2820(0xb04, float:3.952E-42)
            r12 = 2819(0xb03, float:3.95E-42)
        L_0x01a2:
            int r7 = r11.c
            long r6 = (long) r7
            long r6 = r9 - r6
            int r12 = r5.j()
            long r13 = (long) r12
            long r6 = r6 - r13
            int r12 = r5.j()
            euc r13 = new euc
            r13.<init>(r6, r12)
            r15.add(r13)
            goto L_0x019c
        L_0x01ba:
            int r1 = r1 + r6
            r6 = 2817(0xb01, float:3.947E-42)
            r13 = 2192(0x890, float:3.072E-42)
            r14 = 2816(0xb00, float:3.946E-42)
            goto L_0x017f
        L_0x01c2:
            boolean r1 = r15.isEmpty()
            if (r1 == 0) goto L_0x01ce
            r5 = 0
            r2.a = r5
            r3 = 0
            goto L_0x0162
        L_0x01ce:
            r11.b = r4
            r3 = 0
            java.lang.Object r1 = r15.get(r3)
            euc r1 = (defpackage.euc) r1
            long r4 = r1.a
            r2.a = r4
            goto L_0x0162
        L_0x01dc:
            r3 = r7
            yze r4 = new yze
            r4.<init>((int) r8)
            byte[] r5 = r4.a
            r1.readFully(r5, r3, r8)
            int r3 = r4.j()
            int r3 = r3 + r8
            r11.c = r3
            int r3 = r4.h()
            r4 = 1397048916(0x53454654, float:8.4728847E11)
            if (r3 == r4) goto L_0x01fd
            r3 = 0
            r2.a = r3
            goto L_0x0162
        L_0x01fd:
            long r3 = r37.g()
            int r1 = r11.c
            int r1 = r1 + -12
            long r5 = (long) r1
            long r3 = r3 - r5
            r2.a = r3
            r1 = 2
            r11.b = r1
            goto L_0x0162
        L_0x020e:
            long r3 = r37.x()
            int r1 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r1 == 0) goto L_0x021e
            int r1 = (r3 > r21 ? 1 : (r3 == r21 ? 0 : -1))
            if (r1 >= 0) goto L_0x021b
            goto L_0x021e
        L_0x021b:
            long r3 = r3 - r21
            goto L_0x0220
        L_0x021e:
            r3 = 0
        L_0x0220:
            r2.a = r3
            r1 = 1
            r11.b = r1
        L_0x0225:
            long r2 = r2.a
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x0232
            r2 = 0
            r0.h = r2
            r0.k = r2
        L_0x0232:
            return r1
        L_0x0233:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x0239:
            long r4 = r37.g()
            int r6 = r0.m
            r7 = -1
            if (r6 != r7) goto L_0x02b8
            r8 = -1
            r9 = -1
            r10 = 1
            r11 = 1
            r12 = 0
            r13 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r15 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r25 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x0256:
            n79[] r3 = r0.r
            int r17 = defpackage.mze.a
            int r6 = r3.length
            if (r12 >= r6) goto L_0x029c
            r3 = r3[r12]
            int r6 = r3.e
            cpe r3 = r3.b
            int r7 = r3.b
            if (r6 != r7) goto L_0x0269
        L_0x0267:
            r3 = 1
            goto L_0x029a
        L_0x0269:
            long[] r3 = r3.c
            r30 = r3[r6]
            long[][] r3 = r0.s
            r3 = r3[r12]
            r6 = r3[r6]
            long r30 = r30 - r4
            r23 = 0
            int r3 = (r30 > r23 ? 1 : (r30 == r23 ? 0 : -1))
            if (r3 < 0) goto L_0x0282
            int r3 = (r30 > r19 ? 1 : (r30 == r19 ? 0 : -1))
            if (r3 < 0) goto L_0x0280
            goto L_0x0282
        L_0x0280:
            r3 = 0
            goto L_0x0283
        L_0x0282:
            r3 = 1
        L_0x0283:
            if (r3 != 0) goto L_0x0287
            if (r11 != 0) goto L_0x028d
        L_0x0287:
            if (r3 != r11) goto L_0x0292
            int r17 = (r30 > r25 ? 1 : (r30 == r25 ? 0 : -1))
            if (r17 >= 0) goto L_0x0292
        L_0x028d:
            r11 = r3
            r15 = r6
            r9 = r12
            r25 = r30
        L_0x0292:
            int r17 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r17 >= 0) goto L_0x0267
            r10 = r3
            r13 = r6
            r8 = r12
            goto L_0x0267
        L_0x029a:
            int r12 = r12 + r3
            goto L_0x0256
        L_0x029c:
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r3 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r3 == 0) goto L_0x02af
            if (r10 == 0) goto L_0x02af
            r6 = 10485760(0xa00000, double:5.180654E-317)
            long r13 = r13 + r6
            int r3 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r3 >= 0) goto L_0x02b0
        L_0x02af:
            r8 = r9
        L_0x02b0:
            r0.m = r8
            r3 = -1
            if (r8 != r3) goto L_0x02b8
            r6 = -1
            goto L_0x03cf
        L_0x02b8:
            n79[] r3 = r0.r
            int r6 = defpackage.mze.a
            int r6 = r0.m
            r3 = r3[r6]
            ape r14 = r3.c
            int r15 = r3.e
            cpe r13 = r3.b
            long[] r6 = r13.c
            r6 = r6[r15]
            int[] r8 = r13.d
            r8 = r8[r15]
            long r4 = r6 - r4
            int r9 = r0.n
            long r9 = (long) r9
            long r4 = r4 + r9
            r9 = 0
            int r9 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r9 < 0) goto L_0x03cc
            int r9 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r9 < 0) goto L_0x02e0
            goto L_0x03cc
        L_0x02e0:
            moe r2 = r3.a
            int r6 = r2.g
            r7 = 1
            if (r6 != r7) goto L_0x02eb
            long r4 = r4 + r21
            int r8 = r8 + -8
        L_0x02eb:
            int r4 = (int) r4
            r1.z(r4)
            int r4 = r2.j
            fse r5 = r3.d
            if (r4 == 0) goto L_0x034f
            yze r2 = r0.b
            byte[] r6 = r2.a
            r7 = 0
            r6[r7] = r7
            r9 = 1
            r6[r9] = r7
            r9 = 2
            r6[r9] = r7
            r9 = 4
            int r10 = 4 - r4
        L_0x0305:
            int r9 = r0.o
            if (r9 >= r8) goto L_0x034d
            int r9 = r0.p
            if (r9 != 0) goto L_0x0339
            r1.readFully(r6, r10, r4)
            int r9 = r0.n
            int r9 = r9 + r4
            r0.n = r9
            r2.H(r7)
            int r9 = r2.h()
            if (r9 < 0) goto L_0x0331
            r0.p = r9
            yze r9 = r0.a
            r9.H(r7)
            r7 = 4
            r14.c(r7, r9)
            int r9 = r0.o
            int r9 = r9 + r7
            r0.o = r9
            int r8 = r8 + r10
        L_0x032f:
            r7 = 0
            goto L_0x0305
        L_0x0331:
            java.lang.String r0 = "Invalid NAL length"
            r1 = 0
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.a(r1, r0)
            throw r0
        L_0x0339:
            int r9 = r14.a(r1, r9, r7)
            int r7 = r0.n
            int r7 = r7 + r9
            r0.n = r7
            int r7 = r0.o
            int r7 = r7 + r9
            r0.o = r7
            int r7 = r0.p
            int r7 = r7 - r9
            r0.p = r7
            goto L_0x032f
        L_0x034d:
            r1 = r8
            goto L_0x0391
        L_0x034f:
            vu5 r2 = r2.f
            java.lang.String r2 = r2.A0
            java.lang.String r4 = "audio/ac4"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x0371
            int r2 = r0.o
            if (r2 != 0) goto L_0x036e
            r6 = r18
            ct0.l(r8, r6)
            r7 = 7
            r14.c(r7, r6)
            int r2 = r0.o
            int r2 = r2 + r7
            r0.o = r2
            goto L_0x036f
        L_0x036e:
            r7 = 7
        L_0x036f:
            int r8 = r8 + r7
            goto L_0x0376
        L_0x0371:
            if (r5 == 0) goto L_0x0376
            r5.e(r1)
        L_0x0376:
            int r2 = r0.o
            if (r2 >= r8) goto L_0x034d
            int r2 = r8 - r2
            r4 = 0
            int r2 = r14.a(r1, r2, r4)
            int r4 = r0.n
            int r4 = r4 + r2
            r0.n = r4
            int r4 = r0.o
            int r4 = r4 + r2
            r0.o = r4
            int r4 = r0.p
            int r4 = r4 - r2
            r0.p = r4
            goto L_0x0376
        L_0x0391:
            long[] r2 = r13.f
            r8 = r2[r15]
            int[] r2 = r13.g
            r2 = r2[r15]
            if (r5 == 0) goto L_0x03b1
            r12 = 0
            r4 = 0
            r6 = r5
            r7 = r14
            r10 = r2
            r11 = r1
            r1 = r13
            r13 = r4
            r6.c(r7, r8, r10, r11, r12, r13)
            r2 = 1
            int r15 = r15 + r2
            int r1 = r1.b
            if (r15 != r1) goto L_0x03ba
            r1 = 0
            r5.a(r14, r1)
            goto L_0x03ba
        L_0x03b1:
            r11 = 0
            r12 = 0
            r6 = r14
            r7 = r8
            r9 = r2
            r10 = r1
            r6.b(r7, r9, r10, r11, r12)
        L_0x03ba:
            int r1 = r3.e
            r2 = 1
            int r1 = r1 + r2
            r3.e = r1
            r1 = -1
            r0.m = r1
            r1 = 0
            r0.n = r1
            r0.o = r1
            r0.p = r1
            r6 = 0
            goto L_0x03cf
        L_0x03cc:
            r2.a = r6
            r6 = 1
        L_0x03cf:
            return r6
        L_0x03d0:
            r7 = 7
            long r5 = r0.j
            int r3 = r0.k
            long r9 = (long) r3
            long r5 = r5 - r9
            long r9 = r37.g()
            long r9 = r9 + r5
            yze r3 = r0.l
            if (r3 == 0) goto L_0x043f
            byte[] r11 = r3.a
            int r13 = r0.k
            int r5 = (int) r5
            r1.readFully(r11, r13, r5)
            int r5 = r0.i
            r6 = 1718909296(0x66747970, float:2.8862439E23)
            if (r5 != r6) goto L_0x0426
            r3.H(r8)
            int r5 = r3.h()
            r6 = 1903435808(0x71742020, float:1.2088509E30)
            r11 = 1751476579(0x68656963, float:4.333464E24)
            if (r5 == r11) goto L_0x0404
            if (r5 == r6) goto L_0x0402
            r5 = 0
            goto L_0x0405
        L_0x0402:
            r5 = 1
            goto L_0x0405
        L_0x0404:
            r5 = 2
        L_0x0405:
            if (r5 == 0) goto L_0x0408
            goto L_0x0423
        L_0x0408:
            r5 = 4
            r3.I(r5)
        L_0x040c:
            int r5 = r3.c()
            if (r5 <= 0) goto L_0x0422
            int r5 = r3.h()
            if (r5 == r11) goto L_0x041e
            if (r5 == r6) goto L_0x041c
            r5 = 0
            goto L_0x041f
        L_0x041c:
            r5 = 1
            goto L_0x041f
        L_0x041e:
            r5 = 2
        L_0x041f:
            if (r5 == 0) goto L_0x040c
            goto L_0x0423
        L_0x0422:
            r5 = 0
        L_0x0423:
            r0.v = r5
            goto L_0x0447
        L_0x0426:
            boolean r5 = r12.isEmpty()
            if (r5 != 0) goto L_0x0447
            java.lang.Object r5 = r12.peek()
            nx r5 = (defpackage.nx) r5
            px r6 = new px
            int r11 = r0.i
            r6.<init>(r11, r3)
            java.util.ArrayList r3 = r5.o
            r3.add(r6)
            goto L_0x0447
        L_0x043f:
            int r3 = (r5 > r19 ? 1 : (r5 == r19 ? 0 : -1))
            if (r3 >= 0) goto L_0x0449
            int r3 = (int) r5
            r1.z(r3)
        L_0x0447:
            r3 = 0
            goto L_0x0451
        L_0x0449:
            long r11 = r37.g()
            long r11 = r11 + r5
            r2.a = r11
            r3 = 1
        L_0x0451:
            r0.j(r9)
            if (r3 == 0) goto L_0x045f
            int r3 = r0.h
            r5 = 2
            if (r3 == r5) goto L_0x045d
            r3 = 1
            return r3
        L_0x045d:
            r3 = 1
            goto L_0x0461
        L_0x045f:
            r3 = 1
            r5 = 2
        L_0x0461:
            r10 = r3
            r7 = 0
            r9 = 4
            goto L_0x000d
        L_0x0466:
            r3 = r10
            r6 = r18
            r7 = 7
            int r9 = r0.k
            yze r10 = r0.d
            if (r9 != 0) goto L_0x048e
            byte[] r9 = r10.a
            r11 = 0
            boolean r9 = r1.i(r9, r11, r8, r3)
            if (r9 != 0) goto L_0x047b
            r3 = -1
            return r3
        L_0x047b:
            r3 = -1
            r0.k = r8
            r10.H(r11)
            long r13 = r10.w()
            r0.j = r13
            int r9 = r10.h()
            r0.i = r9
            goto L_0x048f
        L_0x048e:
            r3 = -1
        L_0x048f:
            long r13 = r0.j
            r19 = 1
            int r9 = (r13 > r19 ? 1 : (r13 == r19 ? 0 : -1))
            if (r9 != 0) goto L_0x04a8
            byte[] r9 = r10.a
            r1.readFully(r9, r8, r8)
            int r9 = r0.k
            int r9 = r9 + r8
            r0.k = r9
            long r13 = r10.z()
            r0.j = r13
            goto L_0x04cf
        L_0x04a8:
            r19 = 0
            int r9 = (r13 > r19 ? 1 : (r13 == r19 ? 0 : -1))
            if (r9 != 0) goto L_0x04cf
            long r13 = r37.x()
            int r9 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r9 != 0) goto L_0x04c0
            java.lang.Object r9 = r12.peek()
            nx r9 = (defpackage.nx) r9
            if (r9 == 0) goto L_0x04c0
            long r13 = r9.c
        L_0x04c0:
            int r9 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r9 == 0) goto L_0x04cf
            long r15 = r37.g()
            long r13 = r13 - r15
            int r9 = r0.k
            long r3 = (long) r9
            long r13 = r13 + r3
            r0.j = r13
        L_0x04cf:
            long r3 = r0.j
            int r9 = r0.k
            long r13 = (long) r9
            int r3 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r3 < 0) goto L_0x0614
            int r3 = r0.i
            r4 = 1751411826(0x68646c72, float:4.3148E24)
            r13 = 1836019574(0x6d6f6f76, float:4.631354E27)
            r14 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r3 == r13) goto L_0x0500
            r13 = 1953653099(0x7472616b, float:7.681346E31)
            if (r3 == r13) goto L_0x0500
            r13 = 1835297121(0x6d646961, float:4.4181236E27)
            if (r3 == r13) goto L_0x0500
            r13 = 1835626086(0x6d696e66, float:4.515217E27)
            if (r3 == r13) goto L_0x0500
            r13 = 1937007212(0x7374626c, float:1.9362132E31)
            if (r3 == r13) goto L_0x0500
            r13 = 1701082227(0x65647473, float:6.742798E22)
            if (r3 == r13) goto L_0x0500
            if (r3 != r14) goto L_0x0503
        L_0x0500:
            r3 = 1
            goto L_0x05b4
        L_0x0503:
            r6 = 1835296868(0x6d646864, float:4.418049E27)
            if (r3 == r6) goto L_0x0587
            r6 = 1836476516(0x6d766864, float:4.7662196E27)
            if (r3 == r6) goto L_0x0587
            if (r3 == r4) goto L_0x0587
            r4 = 1937011556(0x73747364, float:1.9367383E31)
            if (r3 == r4) goto L_0x0587
            r4 = 1937011827(0x73747473, float:1.9367711E31)
            if (r3 == r4) goto L_0x0587
            r4 = 1937011571(0x73747373, float:1.9367401E31)
            if (r3 == r4) goto L_0x0587
            r4 = 1668576371(0x63747473, float:4.5093966E21)
            if (r3 == r4) goto L_0x0587
            r4 = 1701606260(0x656c7374, float:6.9788014E22)
            if (r3 == r4) goto L_0x0587
            r4 = 1937011555(0x73747363, float:1.9367382E31)
            if (r3 == r4) goto L_0x0587
            r4 = 1937011578(0x7374737a, float:1.936741E31)
            if (r3 == r4) goto L_0x0587
            r4 = 1937013298(0x73747a32, float:1.9369489E31)
            if (r3 == r4) goto L_0x0587
            r4 = 1937007471(0x7374636f, float:1.9362445E31)
            if (r3 == r4) goto L_0x0587
            r4 = 1668232756(0x636f3634, float:4.4126776E21)
            if (r3 == r4) goto L_0x0587
            r4 = 1953196132(0x746b6864, float:7.46037E31)
            if (r3 == r4) goto L_0x0587
            r4 = 1718909296(0x66747970, float:2.8862439E23)
            if (r3 == r4) goto L_0x0587
            r4 = 1969517665(0x75647461, float:2.8960062E32)
            if (r3 == r4) goto L_0x0587
            r4 = 1801812339(0x6b657973, float:2.7741754E26)
            if (r3 == r4) goto L_0x0587
            r4 = 1768715124(0x696c7374, float:1.7865732E25)
            if (r3 != r4) goto L_0x055b
            goto L_0x0587
        L_0x055b:
            long r3 = r37.g()
            int r6 = r0.k
            long r9 = (long) r6
            long r28 = r3 - r9
            int r3 = r0.i
            r4 = 1836086884(0x6d707664, float:4.6512205E27)
            if (r3 != r4) goto L_0x057d
            o69 r25 = new o69
            long r32 = r28 + r9
            long r3 = r0.j
            long r34 = r3 - r9
            r26 = 0
            r30 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r25.<init>(r26, r28, r30, r32, r34)
        L_0x057d:
            r3 = 0
            r0.l = r3
            r3 = 1
            r0.h = r3
        L_0x0583:
            r3 = 0
            r4 = 4
            goto L_0x060e
        L_0x0587:
            if (r9 != r8) goto L_0x058b
            r3 = 1
            goto L_0x058c
        L_0x058b:
            r3 = 0
        L_0x058c:
            swb.h(r3)
            long r3 = r0.j
            r12 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r3 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r3 > 0) goto L_0x059a
            r3 = 1
            goto L_0x059b
        L_0x059a:
            r3 = 0
        L_0x059b:
            swb.h(r3)
            yze r3 = new yze
            long r12 = r0.j
            int r4 = (int) r12
            r3.<init>((int) r4)
            byte[] r4 = r10.a
            byte[] r6 = r3.a
            r9 = 0
            java.lang.System.arraycopy(r4, r9, r6, r9, r8)
            r0.l = r3
            r3 = 1
            r0.h = r3
            goto L_0x0583
        L_0x05b4:
            long r9 = r37.g()
            r15 = r12
            long r11 = r0.j
            long r9 = r9 + r11
            int r3 = r0.k
            long r4 = (long) r3
            long r9 = r9 - r4
            int r3 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x05ef
            int r3 = r0.i
            if (r3 != r14) goto L_0x05ef
            r6.E(r8)
            byte[] r3 = r6.a
            r4 = 0
            r1.m(r4, r3, r8)
            byte[] r3 = defpackage.yx.a
            int r3 = r6.b
            r4 = 4
            r6.I(r4)
            int r5 = r6.h()
            r11 = 1751411826(0x68646c72, float:4.3148E24)
            if (r5 == r11) goto L_0x05e3
            int r3 = r3 + r4
        L_0x05e3:
            r6.H(r3)
            int r3 = r6.b
            r1.z(r3)
            r37.y()
            goto L_0x05f0
        L_0x05ef:
            r4 = 4
        L_0x05f0:
            nx r3 = new nx
            int r5 = r0.i
            r3.<init>(r5, r9)
            r5 = r15
            r5.push(r3)
            long r5 = r0.j
            int r3 = r0.k
            long r11 = (long) r3
            int r3 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r3 != 0) goto L_0x0609
            r0.j(r9)
            r3 = 0
            goto L_0x060e
        L_0x0609:
            r3 = 0
            r0.h = r3
            r0.k = r3
        L_0x060e:
            r7 = r3
            r9 = r4
            r4 = 3
            r5 = 2
            goto L_0x000c
        L_0x0614:
            java.lang.String r0 = "Atom size less than header length (unsupported)."
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.c(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p79.i(f75, le4):int");
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v34, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: y29} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v20, resolved type: nfe} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v22, resolved type: nfe} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v66, resolved type: nfe} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0330 A[Catch:{ all -> 0x010d }] */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x034a  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x0540  */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x05d6  */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x05d8  */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x05ec  */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x05f5  */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x062f  */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x0667  */
    /* JADX WARNING: Removed duplicated region for block: B:330:0x0676  */
    /* JADX WARNING: Removed duplicated region for block: B:333:0x0680  */
    /* JADX WARNING: Removed duplicated region for block: B:340:0x06bc A[LOOP:12: B:338:0x06b9->B:340:0x06bc, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:344:0x06d9  */
    /* JADX WARNING: Removed duplicated region for block: B:381:0x034d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:400:0x0660 A[EDGE_INSN: B:400:0x0660->B:325:0x0660 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j(long r31) {
        /*
            r30 = this;
            r0 = r30
            r1 = 24
            r2 = 4
            r6 = 1
        L_0x0006:
            java.util.ArrayDeque r7 = r0.e
            boolean r8 = r7.isEmpty()
            if (r8 != 0) goto L_0x0748
            java.lang.Object r8 = r7.peek()
            nx r8 = (defpackage.nx) r8
            long r10 = r8.c
            int r8 = (r10 > r31 ? 1 : (r10 == r31 ? 0 : -1))
            if (r8 != 0) goto L_0x0748
            java.lang.Object r8 = r7.pop()
            r10 = r8
            nx r10 = (defpackage.nx) r10
            int r8 = r10.b
            r11 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r8 != r11) goto L_0x072c
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            int r11 = r0.v
            if (r11 != r6) goto L_0x0034
            r16 = r6
            goto L_0x0036
        L_0x0034:
            r16 = 0
        L_0x0036:
            q66 r15 = new q66
            r15.<init>()
            r11 = 1969517665(0x75647461, float:2.8960062E32)
            px r11 = r10.w(r11)
            r12 = 1751411826(0x68646c72, float:4.3148E24)
            r13 = 8
            r14 = 1684108385(0x64617461, float:1.6635614E22)
            r9 = 1768715124(0x696c7374, float:1.7865732E25)
            r5 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r11 == 0) goto L_0x041e
            byte[] r17 = defpackage.yx.a
            yze r11 = r11.c
            r11.H(r13)
            r20 = 0
            r21 = 0
        L_0x005d:
            int r3 = r11.c()
            if (r3 < r13) goto L_0x0404
            int r3 = r11.b
            int r17 = r11.h()
            int r4 = r11.h()
            if (r4 != r5) goto L_0x0388
            r11.H(r3)
            int r4 = r3 + r17
            r11.I(r13)
            int r5 = r11.b
            r11.I(r2)
            int r6 = r11.h()
            if (r6 == r12) goto L_0x0083
            int r5 = r5 + r2
        L_0x0083:
            r11.H(r5)
        L_0x0086:
            int r5 = r11.b
            if (r5 >= r4) goto L_0x0385
            int r6 = r11.h()
            int r12 = r11.h()
            if (r12 != r9) goto L_0x0371
            r11.H(r5)
            int r5 = r5 + r6
            r11.I(r13)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L_0x00a0:
            int r6 = r11.b
            if (r6 >= r5) goto L_0x0360
            int r12 = r11.h()
            int r12 = r12 + r6
            int r6 = r11.h()
            int r9 = r6 >> 24
            r9 = r9 & 255(0xff, float:3.57E-43)
            r1 = 169(0xa9, float:2.37E-43)
            r20 = 16777215(0xffffff, float:2.3509886E-38)
            java.lang.String r13 = "TCON"
            if (r9 == r1) goto L_0x00be
            r1 = 253(0xfd, float:3.55E-43)
            if (r9 != r1) goto L_0x00c2
        L_0x00be:
            r29 = r5
            goto L_0x0275
        L_0x00c2:
            r1 = 1735291493(0x676e7265, float:1.1260334E24)
            if (r6 != r1) goto L_0x00fb
            r11.I(r2)     // Catch:{ all -> 0x010d }
            int r1 = r11.h()     // Catch:{ all -> 0x010d }
            if (r1 != r14) goto L_0x00da
            r1 = 8
            r11.I(r1)     // Catch:{ all -> 0x010d }
            int r1 = r11.v()     // Catch:{ all -> 0x010d }
            goto L_0x00db
        L_0x00da:
            r1 = -1
        L_0x00db:
            if (r1 <= 0) goto L_0x00e8
            r6 = 192(0xc0, float:2.69E-43)
            if (r1 > r6) goto L_0x00e8
            java.lang.String[] r6 = defpackage.xs7.w     // Catch:{ all -> 0x010d }
            r9 = 1
            int r1 = r1 - r9
            r1 = r6[r1]     // Catch:{ all -> 0x010d }
            goto L_0x00e9
        L_0x00e8:
            r1 = 0
        L_0x00e9:
            if (r1 == 0) goto L_0x00f2
            nfe r6 = new nfe     // Catch:{ all -> 0x010d }
            r9 = 0
            r6.<init>(r13, r9, r1)     // Catch:{ all -> 0x010d }
            goto L_0x00f3
        L_0x00f2:
            r6 = 0
        L_0x00f3:
            r11.H(r12)
            r29 = r5
            r9 = r6
            goto L_0x0348
        L_0x00fb:
            r1 = 1684632427(0x6469736b, float:1.7225632E22)
            if (r6 != r1) goto L_0x0110
            java.lang.String r1 = "TPOS"
            nfe r9 = defpackage.xs7.I(r6, r11, r1)     // Catch:{ all -> 0x010d }
        L_0x0106:
            r11.H(r12)
        L_0x0109:
            r29 = r5
            goto L_0x0348
        L_0x010d:
            r0 = move-exception
            goto L_0x035c
        L_0x0110:
            r1 = 1953655662(0x74726b6e, float:7.6825853E31)
            if (r6 != r1) goto L_0x011c
            java.lang.String r1 = "TRCK"
            nfe r9 = defpackage.xs7.I(r6, r11, r1)     // Catch:{ all -> 0x010d }
            goto L_0x0106
        L_0x011c:
            r1 = 1953329263(0x746d706f, float:7.5247484E31)
            if (r6 != r1) goto L_0x012e
            java.lang.String r1 = "TBPM"
            r9 = 1
            r13 = 0
            xo6 r1 = defpackage.xs7.K(r6, r1, r11, r9, r13)     // Catch:{ all -> 0x010d }
        L_0x0129:
            r11.H(r12)
            r9 = r1
            goto L_0x0109
        L_0x012e:
            r1 = 1668311404(0x6370696c, float:4.434815E21)
            if (r6 != r1) goto L_0x013b
            java.lang.String r1 = "TCMP"
            r9 = 1
            xo6 r1 = defpackage.xs7.K(r6, r1, r11, r9, r9)     // Catch:{ all -> 0x010d }
            goto L_0x0129
        L_0x013b:
            r1 = 1668249202(0x636f7672, float:4.4173067E21)
            if (r6 != r1) goto L_0x017c
            int r1 = r11.h()     // Catch:{ all -> 0x010d }
            int r6 = r11.h()     // Catch:{ all -> 0x010d }
            if (r6 != r14) goto L_0x0179
            int r6 = r11.h()     // Catch:{ all -> 0x010d }
            r6 = r6 & r20
            r9 = 13
            if (r6 != r9) goto L_0x0157
            java.lang.String r9 = "image/jpeg"
            goto L_0x015f
        L_0x0157:
            r9 = 14
            if (r6 != r9) goto L_0x015e
            java.lang.String r9 = "image/png"
            goto L_0x015f
        L_0x015e:
            r9 = 0
        L_0x015f:
            if (r9 != 0) goto L_0x0164
            r9 = 0
            r14 = 0
            goto L_0x0106
        L_0x0164:
            r11.I(r2)     // Catch:{ all -> 0x010d }
            r6 = 16
            int r1 = r1 - r6
            byte[] r6 = new byte[r1]     // Catch:{ all -> 0x010d }
            r13 = 0
            r11.g(r13, r6, r1)     // Catch:{ all -> 0x010d }
            tl r1 = new tl     // Catch:{ all -> 0x010d }
            r13 = 3
            r14 = 0
            r1.<init>(r9, r14, r13, r6)     // Catch:{ all -> 0x010d }
            r9 = r1
            goto L_0x0106
        L_0x0179:
            r14 = 0
            r9 = r14
            goto L_0x0106
        L_0x017c:
            r14 = 0
            r1 = 1631670868(0x61415254, float:2.2288462E20)
            if (r6 != r1) goto L_0x018a
            java.lang.String r1 = "TPE2"
            nfe r9 = defpackage.xs7.J(r6, r11, r1)     // Catch:{ all -> 0x010d }
            goto L_0x0106
        L_0x018a:
            r1 = 1936682605(0x736f6e6d, float:1.8969706E31)
            if (r6 != r1) goto L_0x0197
            java.lang.String r1 = "TSOT"
            nfe r9 = defpackage.xs7.J(r6, r11, r1)     // Catch:{ all -> 0x010d }
            goto L_0x0106
        L_0x0197:
            r1 = 1936679276(0x736f616c, float:1.8965681E31)
            if (r6 != r1) goto L_0x01a4
            java.lang.String r1 = "TSO2"
            nfe r9 = defpackage.xs7.J(r6, r11, r1)     // Catch:{ all -> 0x010d }
            goto L_0x0106
        L_0x01a4:
            r1 = 1936679282(0x736f6172, float:1.8965689E31)
            if (r6 != r1) goto L_0x01b1
            java.lang.String r1 = "TSOA"
            nfe r9 = defpackage.xs7.J(r6, r11, r1)     // Catch:{ all -> 0x010d }
            goto L_0x0106
        L_0x01b1:
            r1 = 1936679265(0x736f6161, float:1.8965668E31)
            if (r6 != r1) goto L_0x01be
            java.lang.String r1 = "TSOP"
            nfe r9 = defpackage.xs7.J(r6, r11, r1)     // Catch:{ all -> 0x010d }
            goto L_0x0106
        L_0x01be:
            r1 = 1936679791(0x736f636f, float:1.8966304E31)
            if (r6 != r1) goto L_0x01cb
            java.lang.String r1 = "TSOC"
            nfe r9 = defpackage.xs7.J(r6, r11, r1)     // Catch:{ all -> 0x010d }
            goto L_0x0106
        L_0x01cb:
            r1 = 1920233063(0x72746e67, float:4.84146E30)
            if (r6 != r1) goto L_0x01d9
            java.lang.String r1 = "ITUNESADVISORY"
            r9 = 0
            xo6 r1 = defpackage.xs7.K(r6, r1, r11, r9, r9)     // Catch:{ all -> 0x010d }
            goto L_0x0129
        L_0x01d9:
            r1 = 1885823344(0x70676170, float:2.8643533E29)
            if (r6 != r1) goto L_0x01e8
            java.lang.String r1 = "ITUNESGAPLESS"
            r9 = 1
            r13 = 0
            xo6 r1 = defpackage.xs7.K(r6, r1, r11, r13, r9)     // Catch:{ all -> 0x010d }
            goto L_0x0129
        L_0x01e8:
            r1 = 1936683886(0x736f736e, float:1.8971255E31)
            if (r6 != r1) goto L_0x01f5
            java.lang.String r1 = "TVSHOWSORT"
            nfe r9 = defpackage.xs7.J(r6, r11, r1)     // Catch:{ all -> 0x010d }
            goto L_0x0106
        L_0x01f5:
            r1 = 1953919848(0x74767368, float:7.810338E31)
            if (r6 != r1) goto L_0x0202
            java.lang.String r1 = "TVSHOW"
            nfe r9 = defpackage.xs7.J(r6, r11, r1)     // Catch:{ all -> 0x010d }
            goto L_0x0106
        L_0x0202:
            r1 = 757935405(0x2d2d2d2d, float:9.8439425E-12)
            if (r6 != r1) goto L_0x0271
            r1 = r14
            r9 = r1
            r6 = -1
            r13 = -1
        L_0x020b:
            int r14 = r11.b     // Catch:{ all -> 0x010d }
            if (r14 >= r12) goto L_0x024d
            int r20 = r11.h()     // Catch:{ all -> 0x010d }
            r29 = r5
            int r5 = r11.h()     // Catch:{ all -> 0x010d }
            r11.I(r2)     // Catch:{ all -> 0x010d }
            r2 = 1835360622(0x6d65616e, float:4.4368658E27)
            if (r5 != r2) goto L_0x022b
            r2 = 12
            int r5 = r20 + -12
            java.lang.String r5 = r11.r(r5)     // Catch:{ all -> 0x010d }
            r9 = r5
            goto L_0x0249
        L_0x022b:
            r18 = r14
            r2 = 12
            r14 = 1851878757(0x6e616d65, float:1.7441594E28)
            if (r5 != r14) goto L_0x023b
            int r1 = r20 + -12
            java.lang.String r1 = r11.r(r1)     // Catch:{ all -> 0x010d }
            goto L_0x0249
        L_0x023b:
            r14 = 1684108385(0x64617461, float:1.6635614E22)
            if (r5 != r14) goto L_0x0244
            r6 = r18
            r13 = r20
        L_0x0244:
            int r5 = r20 + -12
            r11.I(r5)     // Catch:{ all -> 0x010d }
        L_0x0249:
            r5 = r29
            r2 = 4
            goto L_0x020b
        L_0x024d:
            r29 = r5
            if (r9 == 0) goto L_0x026b
            if (r1 == 0) goto L_0x026b
            r2 = -1
            if (r6 != r2) goto L_0x0257
            goto L_0x026b
        L_0x0257:
            r11.H(r6)     // Catch:{ all -> 0x010d }
            r2 = 16
            r11.I(r2)     // Catch:{ all -> 0x010d }
            int r13 = r13 - r2
            java.lang.String r2 = r11.r(r13)     // Catch:{ all -> 0x010d }
            pz6 r5 = new pz6     // Catch:{ all -> 0x010d }
            r5.<init>(r9, r1, r2)     // Catch:{ all -> 0x010d }
            r9 = r5
            goto L_0x026c
        L_0x026b:
            r9 = 0
        L_0x026c:
            r11.H(r12)
            goto L_0x0348
        L_0x0271:
            r29 = r5
            goto L_0x0320
        L_0x0275:
            r1 = r6 & r20
            r2 = 6516084(0x636d74, float:9.130979E-39)
            if (r1 != r2) goto L_0x02b1
            int r1 = r11.h()     // Catch:{ all -> 0x010d }
            int r2 = r11.h()     // Catch:{ all -> 0x010d }
            r5 = 1684108385(0x64617461, float:1.6635614E22)
            if (r2 != r5) goto L_0x029d
            r2 = 8
            r11.I(r2)     // Catch:{ all -> 0x010d }
            r2 = 16
            int r1 = r1 - r2
            java.lang.String r1 = r11.r(r1)     // Catch:{ all -> 0x010d }
            x33 r9 = new x33     // Catch:{ all -> 0x010d }
            java.lang.String r2 = "und"
            r9.<init>(r2, r1, r1)     // Catch:{ all -> 0x010d }
            goto L_0x026c
        L_0x029d:
            java.lang.String r1 = defpackage.rx.d(r6)     // Catch:{ all -> 0x010d }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x010d }
            int r2 = r1.length()     // Catch:{ all -> 0x010d }
            if (r2 == 0) goto L_0x026b
            java.lang.String r2 = "Failed to parse comment attribute: "
            r2.concat(r1)     // Catch:{ all -> 0x010d }
            goto L_0x026b
        L_0x02b1:
            r2 = 7233901(0x6e616d, float:1.0136854E-38)
            if (r1 == r2) goto L_0x0340
            r2 = 7631467(0x74726b, float:1.0693963E-38)
            if (r1 != r2) goto L_0x02bd
            goto L_0x0340
        L_0x02bd:
            r2 = 6516589(0x636f6d, float:9.131686E-39)
            if (r1 == r2) goto L_0x0338
            r2 = 7828084(0x777274, float:1.0969482E-38)
            if (r1 != r2) goto L_0x02c9
            goto L_0x0338
        L_0x02c9:
            r2 = 6578553(0x646179, float:9.218516E-39)
            if (r1 != r2) goto L_0x02d5
            java.lang.String r1 = "TDRC"
            nfe r9 = defpackage.xs7.J(r6, r11, r1)     // Catch:{ all -> 0x010d }
            goto L_0x026c
        L_0x02d5:
            r2 = 4280916(0x415254, float:5.998841E-39)
            if (r1 != r2) goto L_0x02e1
            java.lang.String r1 = "TPE1"
            nfe r9 = defpackage.xs7.J(r6, r11, r1)     // Catch:{ all -> 0x010d }
            goto L_0x026c
        L_0x02e1:
            r2 = 7630703(0x746f6f, float:1.0692892E-38)
            if (r1 != r2) goto L_0x02ee
            java.lang.String r1 = "TSSE"
            nfe r9 = defpackage.xs7.J(r6, r11, r1)     // Catch:{ all -> 0x010d }
            goto L_0x026c
        L_0x02ee:
            r2 = 6384738(0x616c62, float:8.946924E-39)
            if (r1 != r2) goto L_0x02fb
            java.lang.String r1 = "TALB"
            nfe r9 = defpackage.xs7.J(r6, r11, r1)     // Catch:{ all -> 0x010d }
            goto L_0x026c
        L_0x02fb:
            r2 = 7108978(0x6c7972, float:9.9618E-39)
            if (r1 != r2) goto L_0x0308
            java.lang.String r1 = "USLT"
            nfe r9 = defpackage.xs7.J(r6, r11, r1)     // Catch:{ all -> 0x010d }
            goto L_0x026c
        L_0x0308:
            r2 = 6776174(0x67656e, float:9.495442E-39)
            if (r1 != r2) goto L_0x0313
            nfe r9 = defpackage.xs7.J(r6, r11, r13)     // Catch:{ all -> 0x010d }
            goto L_0x026c
        L_0x0313:
            r2 = 6779504(0x677270, float:9.500109E-39)
            if (r1 != r2) goto L_0x0320
            java.lang.String r1 = "TIT1"
            nfe r9 = defpackage.xs7.J(r6, r11, r1)     // Catch:{ all -> 0x010d }
            goto L_0x026c
        L_0x0320:
            java.lang.String r1 = "Skipped unknown metadata entry: "
            java.lang.String r2 = defpackage.rx.d(r6)     // Catch:{ all -> 0x010d }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x010d }
            int r5 = r2.length()     // Catch:{ all -> 0x010d }
            if (r5 == 0) goto L_0x0333
            r1.concat(r2)     // Catch:{ all -> 0x010d }
        L_0x0333:
            r11.H(r12)
            r9 = 0
            goto L_0x0348
        L_0x0338:
            java.lang.String r1 = "TCOM"
            nfe r9 = defpackage.xs7.J(r6, r11, r1)     // Catch:{ all -> 0x010d }
            goto L_0x026c
        L_0x0340:
            java.lang.String r1 = "TIT2"
            nfe r9 = defpackage.xs7.J(r6, r11, r1)     // Catch:{ all -> 0x010d }
            goto L_0x026c
        L_0x0348:
            if (r9 == 0) goto L_0x034d
            r4.add(r9)
        L_0x034d:
            r5 = r29
            r1 = 24
            r2 = 4
            r9 = 1768715124(0x696c7374, float:1.7865732E25)
            r13 = 8
            r14 = 1684108385(0x64617461, float:1.6635614E22)
            goto L_0x00a0
        L_0x035c:
            r11.H(r12)
            throw r0
        L_0x0360:
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto L_0x0368
            r9 = 0
            goto L_0x036d
        L_0x0368:
            y29 r9 = new y29
            r9.<init>((java.util.List) r4)
        L_0x036d:
            r20 = r9
            goto L_0x03eb
        L_0x0371:
            int r5 = r5 + r6
            r11.H(r5)
            r1 = 24
            r2 = 4
            r9 = 1768715124(0x696c7374, float:1.7865732E25)
            r12 = 1751411826(0x68646c72, float:4.3148E24)
            r13 = 8
            r14 = 1684108385(0x64617461, float:1.6635614E22)
            goto L_0x0086
        L_0x0385:
            r20 = 0
            goto L_0x03eb
        L_0x0388:
            r1 = 1936553057(0x736d7461, float:1.8813092E31)
            if (r4 != r1) goto L_0x03eb
            r11.H(r3)
            int r1 = r3 + r17
            r2 = 12
            r11.I(r2)
        L_0x0397:
            int r2 = r11.b
            if (r2 >= r1) goto L_0x03ac
            int r4 = r11.h()
            int r5 = r11.h()
            r6 = 1935766900(0x73617574, float:1.7862687E31)
            if (r5 != r6) goto L_0x03e2
            r5 = 14
            if (r4 >= r5) goto L_0x03af
        L_0x03ac:
            r21 = 0
            goto L_0x03eb
        L_0x03af:
            r1 = 5
            r11.I(r1)
            int r1 = r11.v()
            r2 = 12
            if (r1 == r2) goto L_0x03c0
            r6 = 13
            if (r1 == r6) goto L_0x03c0
            goto L_0x03ac
        L_0x03c0:
            if (r1 != r2) goto L_0x03c6
            r1 = 1131413504(0x43700000, float:240.0)
        L_0x03c4:
            r2 = 1
            goto L_0x03c9
        L_0x03c6:
            r1 = 1123024896(0x42f00000, float:120.0)
            goto L_0x03c4
        L_0x03c9:
            r11.I(r2)
            int r4 = r11.v()
            y29 r5 = new y29
            ykd r6 = new ykd
            r6.<init>(r4, r1)
            w29[] r1 = new defpackage.w29[r2]
            r2 = 0
            r1[r2] = r6
            r5.<init>((defpackage.w29[]) r1)
            r21 = r5
            goto L_0x03eb
        L_0x03e2:
            r5 = 14
            r6 = 13
            int r2 = r2 + r4
            r11.H(r2)
            goto L_0x0397
        L_0x03eb:
            int r3 = r3 + r17
            r11.H(r3)
            r1 = 24
            r2 = 4
            r5 = 1835365473(0x6d657461, float:4.4382975E27)
            r6 = 1
            r9 = 1768715124(0x696c7374, float:1.7865732E25)
            r12 = 1751411826(0x68646c72, float:4.3148E24)
            r13 = 8
            r14 = 1684108385(0x64617461, float:1.6635614E22)
            goto L_0x005d
        L_0x0404:
            r4 = r20
            r1 = r21
            android.util.Pair r1 = android.util.Pair.create(r4, r1)
            java.lang.Object r2 = r1.first
            r9 = r2
            y29 r9 = (defpackage.y29) r9
            java.lang.Object r1 = r1.second
            y29 r1 = (defpackage.y29) r1
            if (r9 == 0) goto L_0x041a
            r15.b(r9)
        L_0x041a:
            r2 = 1835365473(0x6d657461, float:4.4382975E27)
            goto L_0x0421
        L_0x041e:
            r2 = r5
            r1 = 0
            r9 = 0
        L_0x0421:
            nx r2 = r10.v(r2)
            if (r2 == 0) goto L_0x0512
            byte[] r3 = defpackage.yx.a
            r3 = 1751411826(0x68646c72, float:4.3148E24)
            px r3 = r2.w(r3)
            r4 = 1801812339(0x6b657973, float:2.7741754E26)
            px r4 = r2.w(r4)
            r5 = 1768715124(0x696c7374, float:1.7865732E25)
            px r2 = r2.w(r5)
            if (r3 == 0) goto L_0x0512
            if (r4 == 0) goto L_0x0512
            if (r2 == 0) goto L_0x0512
            yze r3 = r3.c
            r5 = 16
            r3.H(r5)
            int r3 = r3.h()
            r5 = 1835299937(0x6d647461, float:4.4189547E27)
            if (r3 == r5) goto L_0x0456
            goto L_0x0512
        L_0x0456:
            yze r3 = r4.c
            r4 = 12
            r3.H(r4)
            int r5 = r3.h()
            java.lang.String[] r6 = new java.lang.String[r5]
            r11 = 0
        L_0x0464:
            if (r11 >= r5) goto L_0x047e
            int r12 = r3.h()
            r14 = 4
            r3.I(r14)
            r13 = 8
            int r12 = r12 - r13
            java.nio.charset.Charset r4 = defpackage.f22.c
            java.lang.String r4 = r3.t(r12, r4)
            r6[r11] = r4
            r4 = 1
            int r11 = r11 + r4
            r4 = 12
            goto L_0x0464
        L_0x047e:
            r13 = 8
            r14 = 4
            yze r2 = r2.c
            r2.H(r13)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L_0x048b:
            int r4 = r2.c()
            if (r4 <= r13) goto L_0x0503
            int r4 = r2.b
            int r11 = r2.h()
            int r12 = r2.h()
            r17 = 1
            int r12 = r12 + -1
            if (r12 < 0) goto L_0x04ef
            if (r12 >= r5) goto L_0x04ef
            r12 = r6[r12]
            int r13 = r4 + r11
        L_0x04a7:
            int r14 = r2.b
            if (r14 >= r13) goto L_0x04e2
            int r17 = r2.h()
            r20 = r5
            int r5 = r2.h()
            r21 = r6
            r6 = 1684108385(0x64617461, float:1.6635614E22)
            if (r5 != r6) goto L_0x04d6
            int r5 = r2.h()
            int r13 = r2.h()
            r14 = 16
            int r6 = r17 + -16
            byte[] r14 = new byte[r6]
            r22 = r7
            r7 = 0
            r2.g(r7, r14, r6)
            ey7 r6 = new ey7
            r6.<init>(r14, r13, r5, r12)
            goto L_0x04e9
        L_0x04d6:
            r22 = r7
            int r14 = r14 + r17
            r2.H(r14)
            r5 = r20
            r6 = r21
            goto L_0x04a7
        L_0x04e2:
            r20 = r5
            r21 = r6
            r22 = r7
            r6 = 0
        L_0x04e9:
            if (r6 == 0) goto L_0x04f5
            r3.add(r6)
            goto L_0x04f5
        L_0x04ef:
            r20 = r5
            r21 = r6
            r22 = r7
        L_0x04f5:
            int r4 = r4 + r11
            r2.H(r4)
            r5 = r20
            r6 = r21
            r7 = r22
            r13 = 8
            r14 = 4
            goto L_0x048b
        L_0x0503:
            r22 = r7
            boolean r2 = r3.isEmpty()
            if (r2 == 0) goto L_0x050c
            goto L_0x0514
        L_0x050c:
            y29 r2 = new y29
            r2.<init>((java.util.List) r3)
            goto L_0x0515
        L_0x0512:
            r22 = r7
        L_0x0514:
            r2 = 0
        L_0x0515:
            be8 r3 = new be8
            r4 = 24
            r3.<init>(r4)
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r14 = 0
            r5 = 0
            r11 = r15
            r6 = 0
            r7 = 4
            r4 = r15
            r15 = r5
            r17 = r3
            java.util.ArrayList r3 = defpackage.yx.e(r10, r11, r12, r14, r15, r16, r17)
            h75 r5 = r0.q
            r5.getClass()
            int r10 = r3.size()
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r13 = -1
            r14 = 0
        L_0x053e:
            if (r14 >= r10) goto L_0x0697
            java.lang.Object r17 = r3.get(r14)
            r15 = r17
            cpe r15 = (defpackage.cpe) r15
            int r11 = r15.b
            if (r11 != 0) goto L_0x0561
            r20 = r1
            r21 = r2
            r24 = r3
            r28 = r4
            r27 = r10
            r1 = 1
            r2 = -1
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r19 = 16
            goto L_0x068a
        L_0x0561:
            moe r11 = r15.a
            r23 = r13
            long r12 = r11.e
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r24 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r24 == 0) goto L_0x0571
            goto L_0x0573
        L_0x0571:
            long r12 = r15.h
        L_0x0573:
            long r6 = java.lang.Math.max(r6, r12)
            r24 = r3
            n79 r3 = new n79
            r25 = r6
            int r6 = r11.b
            ape r7 = r5.B(r14, r6)
            r3.<init>(r11, r15, r7)
            vu5 r7 = r11.f
            java.lang.String r11 = r7.A0
            r27 = r10
            java.lang.String r10 = "audio/true-hd"
            boolean r10 = r10.equals(r11)
            int r11 = r15.e
            if (r10 == 0) goto L_0x059b
            r19 = 16
            int r11 = r11 * 16
            goto L_0x059f
        L_0x059b:
            r19 = 16
            int r11 = r11 + 30
        L_0x059f:
            tu5 r7 = r7.a()
            r7.l = r11
            r10 = 2
            if (r6 != r10) goto L_0x05bc
            r10 = 0
            int r10 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r10 <= 0) goto L_0x05bc
            int r10 = r15.b
            r11 = 1
            if (r10 <= r11) goto L_0x05be
            float r10 = (float) r10
            float r11 = (float) r12
            r12 = 1232348160(0x49742400, float:1000000.0)
            float r11 = r11 / r12
            float r10 = r10 / r11
            r7.r = r10
        L_0x05bc:
            r10 = 1
            goto L_0x05bf
        L_0x05be:
            r10 = r11
        L_0x05bf:
            if (r6 != r10) goto L_0x05ce
            int r10 = r4.a
            r11 = -1
            if (r10 == r11) goto L_0x05ce
            int r12 = r4.b
            if (r12 == r11) goto L_0x05ce
            r7.A = r10
            r7.B = r12
        L_0x05ce:
            java.util.ArrayList r10 = r0.g
            boolean r11 = r10.isEmpty()
            if (r11 == 0) goto L_0x05d8
            r11 = 0
            goto L_0x05dd
        L_0x05d8:
            y29 r11 = new y29
            r11.<init>((java.util.List) r10)
        L_0x05dd:
            y29[] r10 = new defpackage.y29[]{r1, r11}
            y29 r11 = new y29
            r12 = 0
            w29[] r13 = new defpackage.w29[r12]
            r11.<init>((defpackage.w29[]) r13)
            r12 = 1
            if (r6 != r12) goto L_0x05f5
            if (r9 == 0) goto L_0x05f2
            r20 = r1
            r11 = r9
            goto L_0x0629
        L_0x05f2:
            r20 = r1
            goto L_0x0629
        L_0x05f5:
            r12 = 2
            if (r6 != r12) goto L_0x05f2
            if (r2 == 0) goto L_0x05f2
            r12 = 0
        L_0x05fb:
            w29[] r13 = r2.a
            int r15 = r13.length
            if (r12 >= r15) goto L_0x05f2
            r13 = r13[r12]
            boolean r15 = r13 instanceof defpackage.ey7
            if (r15 == 0) goto L_0x0622
            ey7 r13 = (defpackage.ey7) r13
            java.lang.String r15 = r13.a
            r20 = r1
            java.lang.String r1 = "com.android.capture.fps"
            boolean r1 = r1.equals(r15)
            if (r1 == 0) goto L_0x0620
            y29 r11 = new y29
            r1 = 1
            w29[] r12 = new defpackage.w29[r1]
            r15 = 0
            r12[r15] = r13
            r11.<init>((defpackage.w29[]) r12)
            goto L_0x0629
        L_0x0620:
            r1 = 1
            goto L_0x0625
        L_0x0622:
            r20 = r1
            goto L_0x0620
        L_0x0625:
            int r12 = r12 + r1
            r1 = r20
            goto L_0x05fb
        L_0x0629:
            r1 = 0
        L_0x062a:
            w29[] r12 = r11.a
            r13 = 2
            if (r1 >= r13) goto L_0x0660
            r13 = r10[r1]
            if (r13 != 0) goto L_0x0639
        L_0x0633:
            r21 = r2
            r28 = r4
        L_0x0637:
            r2 = 1
            goto L_0x065a
        L_0x0639:
            w29[] r13 = r13.a
            int r15 = r13.length
            if (r15 != 0) goto L_0x063f
            goto L_0x0633
        L_0x063f:
            y29 r11 = new y29
            int r15 = defpackage.mze.a
            int r15 = r12.length
            r21 = r2
            int r2 = r13.length
            int r15 = r15 + r2
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r12, r15)
            int r12 = r12.length
            int r15 = r13.length
            r28 = r4
            r4 = 0
            java.lang.System.arraycopy(r13, r4, r2, r12, r15)
            w29[] r2 = (defpackage.w29[]) r2
            r11.<init>((defpackage.w29[]) r2)
            goto L_0x0637
        L_0x065a:
            int r1 = r1 + r2
            r2 = r21
            r4 = r28
            goto L_0x062a
        L_0x0660:
            r21 = r2
            r28 = r4
            int r1 = r12.length
            if (r1 <= 0) goto L_0x0669
            r7.i = r11
        L_0x0669:
            vu5 r1 = new vu5
            r1.<init>(r7)
            ape r2 = r3.c
            r2.d(r1)
            r1 = 2
            if (r6 != r1) goto L_0x0680
            r1 = r23
            r2 = -1
            if (r1 != r2) goto L_0x0683
            int r13 = r8.size()
            goto L_0x0684
        L_0x0680:
            r1 = r23
            r2 = -1
        L_0x0683:
            r13 = r1
        L_0x0684:
            r8.add(r3)
            r6 = r25
            r1 = 1
        L_0x068a:
            int r14 = r14 + r1
            r1 = r20
            r2 = r21
            r3 = r24
            r10 = r27
            r4 = r28
            goto L_0x053e
        L_0x0697:
            r1 = r13
            r2 = -1
            r10 = 0
            r19 = 16
            r0.t = r1
            r0.u = r6
            r1 = 0
            n79[] r3 = new defpackage.n79[r1]
            java.lang.Object[] r1 = r8.toArray(r3)
            n79[] r1 = (defpackage.n79[]) r1
            r0.r = r1
            int r3 = r1.length
            long[][] r3 = new long[r3][]
            int r4 = r1.length
            int[] r4 = new int[r4]
            int r6 = r1.length
            long[] r6 = new long[r6]
            int r7 = r1.length
            boolean[] r7 = new boolean[r7]
            r13 = 0
        L_0x06b9:
            int r8 = r1.length
            if (r13 >= r8) goto L_0x06d4
            r8 = r1[r13]
            cpe r8 = r8.b
            int r8 = r8.b
            long[] r8 = new long[r8]
            r3[r13] = r8
            r8 = r1[r13]
            cpe r8 = r8.b
            long[] r8 = r8.f
            r9 = 0
            r14 = r8[r9]
            r6[r13] = r14
            r8 = 1
            int r13 = r13 + r8
            goto L_0x06b9
        L_0x06d4:
            r15 = r10
            r13 = 0
        L_0x06d6:
            int r8 = r1.length
            if (r13 >= r8) goto L_0x071b
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r9 = r8
            r11 = 0
            r8 = r2
        L_0x06e1:
            int r12 = r1.length
            if (r11 >= r12) goto L_0x06f4
            boolean r12 = r7[r11]
            if (r12 != 0) goto L_0x06f1
            r20 = r6[r11]
            int r12 = (r20 > r9 ? 1 : (r20 == r9 ? 0 : -1))
            if (r12 > 0) goto L_0x06f1
            r8 = r11
            r9 = r20
        L_0x06f1:
            r12 = 1
            int r11 = r11 + r12
            goto L_0x06e1
        L_0x06f4:
            r12 = 1
            r9 = r4[r8]
            r10 = r3[r8]
            r10[r9] = r15
            r11 = r1[r8]
            cpe r11 = r11.b
            int[] r14 = r11.d
            r14 = r14[r9]
            r17 = r3
            long r2 = (long) r14
            long r15 = r15 + r2
            int r9 = r9 + r12
            r4[r8] = r9
            int r2 = r10.length
            if (r9 >= r2) goto L_0x0714
            long[] r2 = r11.f
            r2 = r2[r9]
            r6[r8] = r2
            goto L_0x0717
        L_0x0714:
            r7[r8] = r12
            int r13 = r13 + r12
        L_0x0717:
            r3 = r17
            r2 = -1
            goto L_0x06d6
        L_0x071b:
            r2 = r3
            r12 = 1
            r0.s = r2
            r5.w()
            r5.K(r0)
            r22.clear()
            r1 = 2
            r0.h = r1
            goto L_0x0742
        L_0x072c:
            r12 = r6
            r22 = r7
            r19 = 16
            boolean r1 = r22.isEmpty()
            if (r1 != 0) goto L_0x0742
            java.lang.Object r1 = r22.peek()
            nx r1 = (defpackage.nx) r1
            java.util.ArrayList r1 = r1.X
            r1.add(r10)
        L_0x0742:
            r6 = r12
            r1 = 24
            r2 = 4
            goto L_0x0006
        L_0x0748:
            int r1 = r0.h
            r2 = 2
            if (r1 == r2) goto L_0x0752
            r1 = 0
            r0.h = r1
            r0.k = r1
        L_0x0752:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p79.j(long):void");
    }

    public final void release() {
    }
}
