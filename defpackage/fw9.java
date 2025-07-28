package defpackage;

import com.google.android.exoplayer2.ParserException;

/* renamed from: fw9  reason: default package */
public final class fw9 implements d75 {
    public h75 a;
    public lzd b;
    public boolean c;

    public final boolean a(q74 q74) {
        boolean z;
        jw9 jw9 = new jw9(0);
        if (jw9.a(q74, true) && (jw9.a & 2) == 2) {
            int min = Math.min(jw9.e, 8);
            yze yze = new yze(min);
            q74.r(yze.a, 0, min, false);
            yze.H(0);
            if (yze.c() >= 5 && yze.v() == 127 && yze.w() == 1179402563) {
                this.b = new lzd(0);
            } else {
                yze.H(0);
                try {
                    z = r1g.F(1, yze, true);
                } catch (ParserException unused) {
                    z = false;
                }
                if (z) {
                    this.b = new lzd(0);
                } else {
                    yze.H(0);
                    if (iga.g(yze, iga.o)) {
                        this.b = new lzd(0);
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void d(long j, long j2) {
        lzd lzd = this.b;
        if (lzd != null) {
            iw9 iw9 = (iw9) lzd.j;
            jw9 jw9 = (jw9) iw9.e;
            jw9.a = 0;
            jw9.b = 0;
            jw9.c = 0;
            jw9.d = 0;
            jw9.e = 0;
            ((yze) iw9.f).E(0);
            iw9.b = -1;
            iw9.d = false;
            if (j == 0) {
                lzd.f(!lzd.h);
            } else if (lzd.e != 0) {
                long j3 = (((long) lzd.f) * j2) / 1000000;
                lzd.b = j3;
                int i = mze.a;
                ((kw9) lzd.m).c(j3);
                lzd.e = 2;
            }
        }
    }

    public final void g(h75 h75) {
        this.a = h75;
    }

    public final boolean h(f75 f75) {
        try {
            return a((q74) f75);
        } catch (ParserException unused) {
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x0198  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int i(defpackage.f75 r19, le4 r20) {
        /*
            r18 = this;
            r0 = r18
            h75 r1 = r0.a
            swb.i(r1)
            lzd r1 = r0.b
            r2 = 0
            if (r1 != 0) goto L_0x0021
            r1 = r19
            q74 r1 = (defpackage.q74) r1
            boolean r3 = r0.a(r1)
            if (r3 == 0) goto L_0x0019
            r1.Y = r2
            goto L_0x0021
        L_0x0019:
            java.lang.String r0 = "Failed to determine bitstream type"
            r1 = 0
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.a(r1, r0)
            throw r0
        L_0x0021:
            boolean r1 = r0.c
            r3 = 1
            if (r1 != 0) goto L_0x003e
            h75 r1 = r0.a
            ape r1 = r1.B(r2, r3)
            h75 r4 = r0.a
            r4.w()
            lzd r4 = r0.b
            h75 r5 = r0.a
            r4.l = r5
            r4.k = r1
            r4.f(r3)
            r0.c = r3
        L_0x003e:
            lzd r0 = r0.b
            java.lang.Object r1 = r0.k
            ape r1 = (defpackage.ape) r1
            swb.i(r1)
            int r1 = defpackage.mze.a
            int r1 = r0.e
            java.lang.Object r4 = r0.j
            iw9 r4 = (defpackage.iw9) r4
            r5 = -1
            r7 = -1
            r8 = 3
            r14 = 2
            if (r1 == 0) goto L_0x0101
            if (r1 == r3) goto L_0x00f3
            if (r1 == r14) goto L_0x0065
            if (r1 != r8) goto L_0x005f
        L_0x005c:
            r2 = r7
            goto L_0x01a8
        L_0x005f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x0065:
            java.lang.Object r1 = r0.m
            kw9 r1 = (defpackage.kw9) r1
            r9 = r19
            q74 r9 = (defpackage.q74) r9
            long r10 = r1.d(r9)
            r12 = 0
            int r1 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r1 < 0) goto L_0x007e
            r1 = r20
            r1.a = r10
            r2 = r3
            goto L_0x01a8
        L_0x007e:
            int r1 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r1 >= 0) goto L_0x0089
            r14 = 2
            long r10 = r10 + r14
            long r10 = -r10
            r0.a(r10)
        L_0x0089:
            boolean r1 = r0.h
            if (r1 != 0) goto L_0x00a1
            java.lang.Object r1 = r0.m
            kw9 r1 = (defpackage.kw9) r1
            utc r1 = r1.b()
            swb.i(r1)
            java.lang.Object r10 = r0.l
            h75 r10 = (defpackage.h75) r10
            r10.K(r1)
            r0.h = r3
        L_0x00a1:
            long r10 = r0.g
            int r1 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r1 > 0) goto L_0x00b1
            boolean r1 = r4.b(r9)
            if (r1 == 0) goto L_0x00ae
            goto L_0x00b1
        L_0x00ae:
            r0.e = r8
            goto L_0x005c
        L_0x00b1:
            r0.g = r12
            java.lang.Object r1 = r4.f
            yze r1 = (defpackage.yze) r1
            long r3 = r0.c(r1)
            int r7 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r7 < 0) goto L_0x00ec
            long r7 = r0.d
            long r9 = r7 + r3
            long r11 = r0.b
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 < 0) goto L_0x00ec
            r9 = 1000000(0xf4240, double:4.940656E-318)
            long r7 = r7 * r9
            int r9 = r0.f
            long r9 = (long) r9
            long r12 = r7 / r9
            java.lang.Object r7 = r0.k
            ape r7 = (defpackage.ape) r7
            int r8 = r1.c
            r7.c(r8, r1)
            java.lang.Object r7 = r0.k
            r11 = r7
            ape r11 = (defpackage.ape) r11
            int r15 = r1.c
            r16 = 0
            r17 = 0
            r14 = 1
            r11.b(r12, r14, r15, r16, r17)
            r0.b = r5
        L_0x00ec:
            long r5 = r0.d
            long r5 = r5 + r3
            r0.d = r5
            goto L_0x01a8
        L_0x00f3:
            long r3 = r0.c
            int r1 = (int) r3
            r3 = r19
            q74 r3 = (defpackage.q74) r3
            r3.z(r1)
            r0.e = r14
            goto L_0x01a8
        L_0x0101:
            r1 = r19
            q74 r1 = (defpackage.q74) r1
            boolean r9 = r4.b(r1)
            if (r9 != 0) goto L_0x010f
            r0.e = r8
            goto L_0x005c
        L_0x010f:
            long r9 = r1.o
            long r11 = r0.c
            long r9 = r9 - r11
            r0.g = r9
            java.lang.Object r1 = r0.n
            v2b r1 = (v2b) r1
            java.lang.Object r9 = r4.f
            r15 = r9
            yze r15 = (defpackage.yze) r15
            boolean r1 = r0.e(r15, r11, r1)
            if (r1 == 0) goto L_0x012e
            r1 = r19
            q74 r1 = (defpackage.q74) r1
            long r9 = r1.o
            r0.c = r9
            goto L_0x0101
        L_0x012e:
            java.lang.Object r1 = r0.n
            v2b r1 = (v2b) r1
            java.lang.Object r1 = r1.b
            vu5 r1 = (defpackage.vu5) r1
            int r7 = r1.O0
            r0.f = r7
            boolean r7 = r0.i
            if (r7 != 0) goto L_0x0147
            java.lang.Object r7 = r0.k
            ape r7 = (defpackage.ape) r7
            r7.d(r1)
            r0.i = r3
        L_0x0147:
            java.lang.Object r1 = r0.n
            v2b r1 = (v2b) r1
            java.lang.Object r1 = r1.c
            tx r1 = (defpackage.tx) r1
            if (r1 == 0) goto L_0x0156
            r0.m = r1
        L_0x0153:
            r1 = r14
            r2 = r15
            goto L_0x018d
        L_0x0156:
            r1 = r19
            q74 r1 = (defpackage.q74) r1
            long r10 = r1.c
            int r1 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0168
            lu7 r1 = new lu7
            r1.<init>()
            r0.m = r1
            goto L_0x0153
        L_0x0168:
            java.lang.Object r1 = r4.e
            jw9 r1 = (defpackage.jw9) r1
            int r4 = r1.a
            r4 = r4 & 4
            if (r4 == 0) goto L_0x0175
            r16 = r3
            goto L_0x0177
        L_0x0175:
            r16 = r2
        L_0x0177:
            u94 r3 = new u94
            long r8 = r0.c
            int r4 = r1.d
            int r5 = r1.e
            int r4 = r4 + r5
            long r12 = (long) r4
            long r4 = r1.b
            r6 = r3
            r7 = r0
            r1 = r14
            r2 = r15
            r14 = r4
            r6.<init>(r7, r8, r10, r12, r14, r16)
            r0.m = r3
        L_0x018d:
            r0.e = r1
            byte[] r0 = r2.a
            int r1 = r0.length
            r3 = 65025(0xfe01, float:9.112E-41)
            if (r1 != r3) goto L_0x0198
            goto L_0x01a7
        L_0x0198:
            int r1 = r2.c
            int r1 = java.lang.Math.max(r3, r1)
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            int r1 = r2.c
            r2.F(r1, r0)
        L_0x01a7:
            r2 = 0
        L_0x01a8:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fw9.i(f75, le4):int");
    }

    public final void release() {
    }
}
