package defpackage;

import android.net.Uri;
import java.io.EOFException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: zh6  reason: default package */
public final class zh6 extends x18 {
    public static final AtomicInteger a1 = new AtomicInteger();
    public final int A0;
    public final Uri B0;
    public final boolean C0;
    public final int D0;
    public final oz3 E0;
    public final xz3 F0;
    public final it4 G0;
    public final boolean H0;
    public final boolean I0;
    public final bke J0;
    public final wh6 K0;
    public final List L0;
    public final wn4 M0;
    public final vo6 N0;
    public final yze O0;
    public final boolean P0;
    public final boolean Q0;
    public it4 R0;
    public oj6 S0;
    public int T0;
    public boolean U0;
    public volatile boolean V0;
    public boolean W0;
    public ws6 X0;
    public boolean Y0;
    public boolean Z0;
    public final int z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zh6(wh6 wh6, oz3 oz3, xz3 xz3, vu5 vu5, boolean z, oz3 oz32, xz3 xz32, boolean z2, Uri uri, List list, int i, Object obj, long j, long j2, long j3, int i2, boolean z3, int i3, boolean z4, boolean z5, bke bke, wn4 wn4, it4 it4, vo6 vo6, yze yze, boolean z6, bza bza) {
        super(oz3, xz3, vu5, i, obj, j, j2, j3);
        xz3 xz33 = xz32;
        this.P0 = z;
        this.D0 = i2;
        this.Z0 = z3;
        this.A0 = i3;
        this.F0 = xz33;
        this.E0 = oz32;
        this.U0 = xz33 != null;
        this.Q0 = z2;
        this.B0 = uri;
        this.H0 = z5;
        this.J0 = bke;
        this.I0 = z4;
        this.K0 = wh6;
        this.L0 = list;
        this.M0 = wn4;
        this.G0 = it4;
        this.N0 = vo6;
        this.O0 = yze;
        this.C0 = z6;
        po5 po5 = ws6.b;
        this.X0 = e8c.X;
        this.z0 = a1.getAndIncrement();
    }

    public static byte[] e(String str) {
        if (fja.A(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    public final void a() {
        this.V0 = true;
    }

    public final boolean c() {
        throw null;
    }

    public final void d(oz3 oz3, xz3 xz3, boolean z, boolean z2) {
        xz3 xz32;
        q74 g;
        long j;
        long j2;
        it4 it4;
        boolean z3 = false;
        if (z) {
            if (this.T0 != 0) {
                z3 = true;
            }
            xz32 = xz3;
        } else {
            xz32 = xz3.b((long) this.T0);
        }
        try {
            g = g(oz3, xz32, z2);
            if (z3) {
                g.z(this.T0);
            }
            do {
                if (!this.V0) {
                    it4 = this.R0;
                }
                break;
            } while (((d75) it4.a).i(g, it4.o) == 0);
            break;
            j = g.o;
            j2 = xz3.f;
        } catch (EOFException e) {
            if ((this.o.X & 16384) != 0) {
                ((d75) this.R0.a).d(0, 0);
                j = g.o;
                j2 = xz3.f;
            } else {
                throw e;
            }
        } catch (Throwable th) {
            bm3.f(oz3);
            throw th;
        }
        this.T0 = (int) (j - j2);
        bm3.f(oz3);
    }

    public final int f(int i) {
        swb.h(!this.C0);
        if (i >= this.X0.size()) {
            return 0;
        }
        return ((Integer) this.X0.get(i)).intValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:135:0x026d  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x026f  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0272  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0303  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0305  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0308  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x033c  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0159  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.q74 g(defpackage.oz3 r23, defpackage.xz3 r24, boolean r25) {
        /*
            r22 = this;
            r0 = r22
            r1 = r24
            long r6 = r23.N(r24)
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r10 = 0
            r11 = 1
            if (r25 == 0) goto L_0x0053
            bke r2 = r0.J0     // Catch:{ InterruptedException -> 0x004d }
            boolean r3 = r0.H0     // Catch:{ InterruptedException -> 0x004d }
            long r4 = r0.Z     // Catch:{ InterruptedException -> 0x004d }
            monitor-enter(r2)     // Catch:{ InterruptedException -> 0x004d }
            long r12 = r2.a     // Catch:{ all -> 0x003d }
            r14 = 9223372036854775806(0x7ffffffffffffffe, double:NaN)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 != 0) goto L_0x0025
            r12 = r11
            goto L_0x0026
        L_0x0025:
            r12 = r10
        L_0x0026:
            swb.h(r12)     // Catch:{ all -> 0x003d }
            long r12 = r2.b     // Catch:{ all -> 0x003d }
            int r12 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r12 == 0) goto L_0x0031
            monitor-exit(r2)     // Catch:{ InterruptedException -> 0x004d }
            goto L_0x0053
        L_0x0031:
            if (r3 == 0) goto L_0x003f
            java.lang.ThreadLocal r3 = r2.d     // Catch:{ all -> 0x003d }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x003d }
            r3.set(r4)     // Catch:{ all -> 0x003d }
            goto L_0x0049
        L_0x003d:
            r0 = move-exception
            goto L_0x004b
        L_0x003f:
            long r3 = r2.b     // Catch:{ all -> 0x003d }
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 != 0) goto L_0x0049
            r2.wait()     // Catch:{ all -> 0x003d }
            goto L_0x003f
        L_0x0049:
            monitor-exit(r2)     // Catch:{ InterruptedException -> 0x004d }
            goto L_0x0053
        L_0x004b:
            monitor-exit(r2)     // Catch:{ all -> 0x003d }
            throw r0     // Catch:{ InterruptedException -> 0x004d }
        L_0x004d:
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException
            r0.<init>()
            throw r0
        L_0x0053:
            q74 r12 = new q74
            long r4 = r1.f
            r2 = r12
            r3 = r23
            r2.<init>(r3, r4, r6)
            it4 r2 = r0.R0
            if (r2 != 0) goto L_0x0371
            yze r2 = r0.O0
            r12.Y = r10
            r3 = 10
            r4 = 8
            r2.E(r3)     // Catch:{ EOFException -> 0x007a }
            byte[] r5 = r2.a     // Catch:{ EOFException -> 0x007a }
            r12.r(r5, r10, r3, r10)     // Catch:{ EOFException -> 0x007a }
            int r5 = r2.x()
            r6 = 4801587(0x494433, float:6.728456E-39)
            if (r5 == r6) goto L_0x007c
        L_0x007a:
            r2 = r8
            goto L_0x00d6
        L_0x007c:
            r5 = 3
            r2.I(r5)
            int r5 = r2.u()
            int r6 = r5 + 10
            byte[] r7 = r2.a
            int r13 = r7.length
            if (r6 <= r13) goto L_0x0093
            r2.E(r6)
            byte[] r6 = r2.a
            java.lang.System.arraycopy(r7, r10, r6, r10, r3)
        L_0x0093:
            byte[] r6 = r2.a
            r12.r(r6, r3, r5, r10)
            byte[] r3 = r2.a
            vo6 r6 = r0.N0
            y29 r3 = r6.V(r5, r3)
            if (r3 != 0) goto L_0x00a3
            goto L_0x007a
        L_0x00a3:
            w29[] r3 = r3.a
            int r5 = r3.length
            r6 = r10
        L_0x00a7:
            if (r6 >= r5) goto L_0x007a
            r7 = r3[r6]
            boolean r13 = r7 instanceof defpackage.y3b
            if (r13 == 0) goto L_0x00d3
            y3b r7 = (defpackage.y3b) r7
            java.lang.String r13 = r7.b
            java.lang.String r14 = "com.apple.streaming.transportStreamTimestamp"
            boolean r13 = r14.equals(r13)
            if (r13 == 0) goto L_0x00d3
            byte[] r3 = r2.a
            byte[] r5 = r7.c
            java.lang.System.arraycopy(r5, r10, r3, r10, r4)
            r2.H(r10)
            r2.G(r4)
            long r2 = r2.p()
            r5 = 8589934591(0x1ffffffff, double:4.2439915814E-314)
            long r2 = r2 & r5
            goto L_0x00d6
        L_0x00d3:
            int r6 = r6 + 1
            goto L_0x00a7
        L_0x00d6:
            r12.Y = r10
            it4 r5 = r0.G0
            if (r5 == 0) goto L_0x0159
            java.lang.Object r1 = r5.a
            d75 r1 = (defpackage.d75) r1
            boolean r4 = r1 instanceof defpackage.lse
            if (r4 != 0) goto L_0x00eb
            boolean r1 = r1 instanceof defpackage.my5
            if (r1 == 0) goto L_0x00e9
            goto L_0x00eb
        L_0x00e9:
            r1 = r10
            goto L_0x00ec
        L_0x00eb:
            r1 = r11
        L_0x00ec:
            r1 = r1 ^ r11
            swb.h(r1)
            java.lang.Object r1 = r5.a
            d75 r1 = (defpackage.d75) r1
            boolean r4 = r1 instanceof defpackage.uqf
            java.lang.Object r13 = r5.c
            bke r13 = (defpackage.bke) r13
            java.lang.Object r5 = r5.b
            vu5 r5 = (defpackage.vu5) r5
            if (r4 == 0) goto L_0x0108
            uqf r1 = new uqf
            java.lang.String r4 = r5.c
            r1.<init>(r4, r13)
            goto L_0x012f
        L_0x0108:
            boolean r4 = r1 instanceof defpackage.ec
            if (r4 == 0) goto L_0x0112
            ec r1 = new ec
            r1.<init>()
            goto L_0x012f
        L_0x0112:
            boolean r4 = r1 instanceof defpackage.r3
            if (r4 == 0) goto L_0x011c
            r3 r1 = new r3
            r1.<init>()
            goto L_0x012f
        L_0x011c:
            boolean r4 = r1 instanceof defpackage.v3
            if (r4 == 0) goto L_0x0126
            v3 r1 = new v3
            r1.<init>()
            goto L_0x012f
        L_0x0126:
            boolean r4 = r1 instanceof defpackage.l79
            if (r4 == 0) goto L_0x0139
            l79 r1 = new l79
            r1.<init>()
        L_0x012f:
            it4 r4 = new it4
            r4.<init>(r1, r5, r13)
            r19 = r2
            r3 = r10
            goto L_0x02ec
        L_0x0139:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getSimpleName()
            int r2 = r1.length()
            java.lang.String r3 = "Unexpected extractor type for recreation: "
            if (r2 == 0) goto L_0x0150
            java.lang.String r1 = r3.concat(r1)
            goto L_0x0155
        L_0x0150:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r3)
        L_0x0155:
            r0.<init>(r1)
            throw r0
        L_0x0159:
            wh6 r5 = r0.K0
            android.net.Uri r1 = r1.a
            vu5 r13 = r0.o
            java.util.List r14 = r0.L0
            bke r15 = r0.J0
            java.util.Map r8 = r23.a()
            gf6 r5 = (defpackage.gf6) r5
            r5.getClass()
            java.lang.String r5 = r13.A0
            int r5 = defpackage.hwf.j(r5)
            java.lang.String r9 = "Content-Type"
            java.lang.Object r8 = r8.get(r9)
            java.util.List r8 = (java.util.List) r8
            if (r8 == 0) goto L_0x018a
            boolean r16 = r8.isEmpty()
            if (r16 == 0) goto L_0x0183
            goto L_0x018a
        L_0x0183:
            java.lang.Object r8 = r8.get(r10)
            java.lang.String r8 = (java.lang.String) r8
            goto L_0x018b
        L_0x018a:
            r8 = 0
        L_0x018b:
            int r8 = defpackage.hwf.j(r8)
            int r1 = defpackage.hwf.k(r1)
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = 7
            r6.<init>(r7)
            defpackage.gf6.g(r6, r5)
            defpackage.gf6.g(r6, r8)
            defpackage.gf6.g(r6, r1)
            int[] r17 = defpackage.gf6.c
            r9 = r10
        L_0x01a5:
            if (r9 >= r7) goto L_0x01b1
            r4 = r17[r9]
            defpackage.gf6.g(r6, r4)
            int r9 = r9 + 1
            r4 = 8
            goto L_0x01a5
        L_0x01b1:
            r12.Y = r10
            r4 = r10
            r9 = 0
        L_0x01b5:
            int r10 = r6.size()
            if (r4 >= r10) goto L_0x02e0
            java.lang.Object r10 = r6.get(r4)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r7 = 11
            if (r10 == 0) goto L_0x02a1
            if (r10 == r11) goto L_0x0296
            r11 = 2
            if (r10 == r11) goto L_0x028b
            r11 = 7
            if (r10 == r11) goto L_0x027e
            r11 = 8
            if (r10 == r11) goto L_0x0245
            if (r10 == r7) goto L_0x01f1
            r11 = 13
            if (r10 == r11) goto L_0x01e3
            r19 = r2
            r18 = r6
            r6 = 0
            r11 = 0
            goto L_0x02ab
        L_0x01e3:
            uqf r11 = new uqf
            java.lang.String r7 = r13.c
            r11.<init>(r7, r15)
            r19 = r2
            r18 = r6
        L_0x01ee:
            r6 = 0
            goto L_0x02ab
        L_0x01f1:
            if (r14 == 0) goto L_0x01f9
            r7 = 48
            r18 = r6
            r11 = r14
            goto L_0x0214
        L_0x01f9:
            tu5 r7 = new tu5
            r7.<init>()
            java.lang.String r11 = "application/cea-608"
            r7.k = r11
            vu5 r11 = new vu5
            r11.<init>(r7)
            java.util.List r7 = java.util.Collections.singletonList(r11)
            r11 = 16
            r18 = r6
            r21 = r11
            r11 = r7
            r7 = r21
        L_0x0214:
            java.lang.String r6 = r13.x0
            boolean r19 = android.text.TextUtils.isEmpty(r6)
            if (r19 != 0) goto L_0x0235
            r19 = r2
            java.lang.String r2 = "audio/mp4a-latm"
            java.lang.String r2 = defpackage.b49.a(r6, r2)
            if (r2 == 0) goto L_0x0227
            goto L_0x0229
        L_0x0227:
            r7 = r7 | 2
        L_0x0229:
            java.lang.String r2 = "video/avc"
            java.lang.String r2 = defpackage.b49.a(r6, r2)
            if (r2 == 0) goto L_0x0232
            goto L_0x0237
        L_0x0232:
            r7 = r7 | 4
            goto L_0x0237
        L_0x0235:
            r19 = r2
        L_0x0237:
            lse r2 = new lse
            cc4 r3 = new cc4
            r6 = 0
            r3.<init>(r11, r7, r6)
            r6 = 2
            r2.<init>(r6, r15, r3)
            r11 = r2
            goto L_0x01ee
        L_0x0245:
            r19 = r2
            r18 = r6
            my5 r11 = new my5
            y29 r2 = r13.y0
            if (r2 != 0) goto L_0x0251
        L_0x024f:
            r2 = 0
            goto L_0x026b
        L_0x0251:
            r3 = 0
        L_0x0252:
            w29[] r6 = r2.a
            int r7 = r6.length
            if (r3 >= r7) goto L_0x024f
            r6 = r6[r3]
            boolean r7 = r6 instanceof defpackage.sj6
            if (r7 == 0) goto L_0x0268
            sj6 r6 = (defpackage.sj6) r6
            java.util.List r2 = r6.c
            boolean r2 = r2.isEmpty()
            r3 = 1
            r2 = r2 ^ r3
            goto L_0x026b
        L_0x0268:
            int r3 = r3 + 1
            goto L_0x0252
        L_0x026b:
            if (r2 == 0) goto L_0x026f
            r2 = 4
            goto L_0x0270
        L_0x026f:
            r2 = 0
        L_0x0270:
            if (r14 == 0) goto L_0x0275
            r3 = r14
        L_0x0273:
            r6 = 0
            goto L_0x027a
        L_0x0275:
            java.util.List r3 = java.util.Collections.emptyList()
            goto L_0x0273
        L_0x027a:
            r11.<init>(r2, r15, r3, r6)
            goto L_0x02ab
        L_0x027e:
            r19 = r2
            r18 = r6
            r6 = 0
            l79 r11 = new l79
            r2 = 0
            r11.<init>(r2)
            goto L_0x02ab
        L_0x028b:
            r19 = r2
            r18 = r6
            r6 = 0
            ec r11 = new ec
            r11.<init>()
            goto L_0x02ab
        L_0x0296:
            r19 = r2
            r18 = r6
            r6 = 0
            v3 r11 = new v3
            r11.<init>()
            goto L_0x02ab
        L_0x02a1:
            r19 = r2
            r18 = r6
            r6 = 0
            r3 r11 = new r3
            r11.<init>()
        L_0x02ab:
            r11.getClass()
            boolean r2 = r11.h(r12)     // Catch:{ EOFException -> 0x02bc, all -> 0x02b6 }
            r3 = 0
            r12.Y = r3
            goto L_0x02c0
        L_0x02b6:
            r0 = move-exception
            r3 = 0
            r1 = r0
            r12.Y = r3
            throw r1
        L_0x02bc:
            r3 = 0
            r12.Y = r3
            r2 = r3
        L_0x02c0:
            if (r2 == 0) goto L_0x02c9
            it4 r1 = new it4
            r1.<init>(r11, r13, r15)
        L_0x02c7:
            r4 = r1
            goto L_0x02ec
        L_0x02c9:
            if (r9 != 0) goto L_0x02d6
            if (r10 == r5) goto L_0x02d5
            if (r10 == r8) goto L_0x02d5
            if (r10 == r1) goto L_0x02d5
            r2 = 11
            if (r10 != r2) goto L_0x02d6
        L_0x02d5:
            r9 = r11
        L_0x02d6:
            int r4 = r4 + 1
            r6 = r18
            r2 = r19
            r7 = 7
            r11 = 1
            goto L_0x01b5
        L_0x02e0:
            r19 = r2
            r3 = 0
            it4 r1 = new it4
            r9.getClass()
            r1.<init>(r9, r13, r15)
            goto L_0x02c7
        L_0x02ec:
            r0.R0 = r4
            java.lang.Object r1 = r4.a
            d75 r1 = (defpackage.d75) r1
            boolean r2 = r1 instanceof defpackage.ec
            if (r2 != 0) goto L_0x0305
            boolean r2 = r1 instanceof defpackage.r3
            if (r2 != 0) goto L_0x0305
            boolean r2 = r1 instanceof defpackage.v3
            if (r2 != 0) goto L_0x0305
            boolean r1 = r1 instanceof defpackage.l79
            if (r1 == 0) goto L_0x0303
            goto L_0x0305
        L_0x0303:
            r1 = r3
            goto L_0x0306
        L_0x0305:
            r1 = 1
        L_0x0306:
            if (r1 == 0) goto L_0x033c
            oj6 r1 = r0.S0
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r19 > r4 ? 1 : (r19 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x031c
            bke r2 = r0.J0
            r8 = r19
            long r4 = r2.b(r8)
            goto L_0x031e
        L_0x031c:
            long r4 = r0.Z
        L_0x031e:
            long r6 = r1.k1
            int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x035e
            r1.k1 = r4
            mj6[] r1 = r1.K0
            int r2 = r1.length
            r6 = r3
        L_0x032a:
            if (r6 >= r2) goto L_0x035e
            r7 = r1[r6]
            long r8 = r7.F
            int r8 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r8 == 0) goto L_0x0339
            r7.F = r4
            r8 = 1
            r7.z = r8
        L_0x0339:
            int r6 = r6 + 1
            goto L_0x032a
        L_0x033c:
            oj6 r1 = r0.S0
            long r4 = r1.k1
            r6 = 0
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x035e
            r1.k1 = r6
            mj6[] r1 = r1.K0
            int r2 = r1.length
            r4 = r3
        L_0x034c:
            if (r4 >= r2) goto L_0x035e
            r5 = r1[r4]
            long r8 = r5.F
            int r8 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x035b
            r5.F = r6
            r8 = 1
            r5.z = r8
        L_0x035b:
            int r4 = r4 + 1
            goto L_0x034c
        L_0x035e:
            oj6 r1 = r0.S0
            java.util.HashSet r1 = r1.M0
            r1.clear()
            it4 r1 = r0.R0
            oj6 r2 = r0.S0
            java.lang.Object r1 = r1.a
            d75 r1 = (defpackage.d75) r1
            r1.g(r2)
            goto L_0x0372
        L_0x0371:
            r3 = r10
        L_0x0372:
            oj6 r1 = r0.S0
            wn4 r0 = r0.M0
            wn4 r2 = r1.l1
            boolean r2 = defpackage.mze.a(r2, r0)
            if (r2 != 0) goto L_0x0398
            r1.l1 = r0
            r10 = r3
        L_0x0381:
            mj6[] r2 = r1.K0
            int r3 = r2.length
            if (r10 >= r3) goto L_0x0398
            boolean[] r3 = r1.d1
            boolean r3 = r3[r10]
            if (r3 == 0) goto L_0x0394
            r2 = r2[r10]
            r2.I = r0
            r3 = 1
            r2.z = r3
            goto L_0x0395
        L_0x0394:
            r3 = 1
        L_0x0395:
            int r10 = r10 + 1
            goto L_0x0381
        L_0x0398:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zh6.g(oz3, xz3, boolean):q74");
    }

    public final void load() {
        it4 it4;
        this.S0.getClass();
        if (this.R0 == null && (it4 = this.G0) != null) {
            d75 d75 = (d75) it4.a;
            if ((d75 instanceof lse) || (d75 instanceof my5)) {
                this.R0 = it4;
                this.U0 = false;
            }
        }
        if (this.U0) {
            oz3 oz3 = this.E0;
            oz3.getClass();
            xz3 xz3 = this.F0;
            xz3.getClass();
            d(oz3, xz3, this.Q0, false);
            this.T0 = 0;
            this.U0 = false;
        }
        if (!this.V0) {
            if (!this.I0) {
                d(this.x0, this.b, this.P0, true);
            }
            this.W0 = !this.V0;
        }
    }
}
