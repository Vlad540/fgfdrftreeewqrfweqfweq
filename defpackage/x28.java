package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.media3.decoder.DecoderInputBuffer$InsufficientCapacityException;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$DecoderInitializationException;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* renamed from: x28  reason: default package */
public abstract class x28 extends qi0 {
    public static final byte[] T1 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public boolean A1;
    public boolean B1;
    public int C1;
    public int D1;
    public int E1;
    public boolean F1;
    public final h28 G0;
    public boolean G1;
    public final pv0 H0;
    public boolean H1;
    public final boolean I0 = false;
    public long I1;
    public final float J0;
    public long J1;
    public final n24 K0;
    public boolean K1;
    public final n24 L0;
    public boolean L1;
    public final n24 M0;
    public boolean M1;
    public final zj0 N0;
    public boolean N1;
    public final MediaCodec.BufferInfo O0;
    public ExoPlaybackException O1;
    public final ArrayDeque P0;
    public l24 P1;
    public final hw9 Q0;
    public v28 Q1;
    public xu5 R0;
    public long R1;
    public xu5 S0;
    public boolean S1;
    public zn4 T0;
    public zn4 U0;
    public p45 V0;
    public MediaCrypto W0;
    public final long X0;
    public float Y0;
    public float Z0;
    public j28 a1;
    public xu5 b1;
    public MediaFormat c1;
    public boolean d1;
    public float e1;
    public ArrayDeque f1;
    public MediaCodecRenderer$DecoderInitializationException g1;
    public p28 h1;
    public int i1;
    public boolean j1;
    public boolean k1;
    public boolean l1;
    public boolean m1;
    public boolean n1;
    public boolean o1;
    public boolean p1;
    public boolean q1;
    public boolean r1;
    public long s1;
    public int t1;
    public int u1;
    public ByteBuffer v1;
    public boolean w1;
    public boolean x1;
    public boolean y1;
    public boolean z1;

    /* JADX WARNING: type inference failed for: r5v4, types: [n24, zj0] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x28(int i, h28 h28, float f) {
        super(i);
        pv0 pv0 = pv0.Z;
        this.G0 = h28;
        this.H0 = pv0;
        this.J0 = f;
        this.K0 = new n24(0);
        this.L0 = new n24(0);
        this.M0 = new n24(2);
        ? n24 = new n24(2);
        n24.B0 = 32;
        this.N0 = n24;
        this.O0 = new MediaCodec.BufferInfo();
        this.Y0 = 1.0f;
        this.Z0 = 1.0f;
        this.X0 = -9223372036854775807L;
        this.P0 = new ArrayDeque();
        this.Q1 = v28.e;
        n24.x(0);
        n24.X.order(ByteOrder.nativeOrder());
        hw9 hw9 = new hw9(0);
        hw9.o = k50.a;
        hw9.c = 0;
        hw9.b = 2;
        this.Q0 = hw9;
        this.e1 = -1.0f;
        this.i1 = 0;
        this.C1 = 0;
        this.t1 = -1;
        this.u1 = -1;
        this.s1 = -9223372036854775807L;
        this.I1 = -9223372036854775807L;
        this.J1 = -9223372036854775807L;
        this.R1 = -9223372036854775807L;
        this.D1 = 0;
        this.E1 = 0;
        this.P1 = new l24(1);
    }

    public void C(float f, float f2) {
        this.Y0 = f;
        this.Z0 = f2;
        w0(this.b1);
    }

    public final int D(xu5 xu5) {
        try {
            return v0(this.H0, xu5);
        } catch (MediaCodecUtil$DecoderQueryException e) {
            throw c(e, xu5);
        }
    }

    public final int E() {
        return 8;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: byte[]} */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x032a, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0330, code lost:
        r15.z1 = true;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0314  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x032c A[LOOP:0: B:23:0x0096->B:120:0x032c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x032a A[EDGE_INSN: B:137:0x032a->B:119:0x032a ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean F(long r27, long r29) {
        /*
            r26 = this;
            r15 = r26
            boolean r0 = r15.L1
            r14 = 1
            r0 = r0 ^ r14
            defpackage.oyb.k(r0)
            zj0 r13 = r15.N0
            boolean r0 = r13.A()
            r12 = 0
            if (r0 == 0) goto L_0x0056
            java.nio.ByteBuffer r6 = r13.X
            int r7 = r15.u1
            int r9 = r13.A0
            long r3 = r13.Z
            long r0 = r15.A0
            long r10 = r13.z0
            boolean r17 = r15.X(r0, r10)
            r10 = 4
            boolean r16 = r13.f(r10)
            xu5 r11 = r15.S0
            r11.getClass()
            r5 = 0
            r8 = 0
            r0 = r26
            r1 = r27
            r18 = r3
            r3 = r29
            r20 = r11
            r10 = r18
            r12 = r17
            r22 = r13
            r13 = r16
            r14 = r20
            boolean r0 = r0.l0(r1, r3, r5, r6, r7, r8, r9, r10, r12, r13, r14)
            if (r0 == 0) goto L_0x0054
            r0 = r22
            long r1 = r0.z0
            r15.g0(r1)
            r0.v()
            r1 = 0
            goto L_0x0058
        L_0x0054:
            r1 = 0
            return r1
        L_0x0056:
            r1 = r12
            r0 = r13
        L_0x0058:
            boolean r2 = r15.K1
            if (r2 == 0) goto L_0x0060
            r2 = 1
            r15.L1 = r2
            return r1
        L_0x0060:
            r2 = 1
            boolean r3 = r15.z1
            n24 r4 = r15.M0
            if (r3 == 0) goto L_0x0070
            boolean r3 = r0.z(r4)
            defpackage.oyb.k(r3)
            r15.z1 = r1
        L_0x0070:
            boolean r3 = r15.A1
            if (r3 == 0) goto L_0x0088
            boolean r3 = r0.A()
            if (r3 == 0) goto L_0x007b
            return r2
        L_0x007b:
            r26.J()
            r15.A1 = r1
            r26.Y()
            boolean r3 = r15.y1
            if (r3 != 0) goto L_0x0088
            return r1
        L_0x0088:
            boolean r3 = r15.K1
            r3 = r3 ^ r2
            defpackage.oyb.k(r3)
            qe4 r3 = r15.c
            r3.t()
            r4.v()
        L_0x0096:
            r4.v()
            int r5 = r15.y(r3, r4, r1)
            r6 = -5
            if (r5 == r6) goto L_0x0333
            r6 = -4
            if (r5 == r6) goto L_0x00ba
            r3 = -3
            if (r5 != r3) goto L_0x00b4
            boolean r3 = r26.m()
            if (r3 == 0) goto L_0x00b0
            long r3 = r15.I1
            r15.J1 = r3
        L_0x00b0:
            r7 = r1
            r1 = r2
            goto L_0x0338
        L_0x00b4:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x00ba:
            r5 = 4
            boolean r6 = r4.f(r5)
            if (r6 == 0) goto L_0x00c8
            r15.K1 = r2
            long r3 = r15.I1
            r15.J1 = r3
            goto L_0x00b0
        L_0x00c8:
            long r6 = r15.I1
            long r8 = r4.Z
            long r6 = java.lang.Math.max(r6, r8)
            r15.I1 = r6
            boolean r6 = r26.m()
            if (r6 != 0) goto L_0x00e2
            n24 r6 = r15.L0
            r7 = 536870912(0x20000000, float:1.0842022E-19)
            boolean r6 = r6.f(r7)
            if (r6 == 0) goto L_0x00e6
        L_0x00e2:
            long r6 = r15.I1
            r15.J1 = r6
        L_0x00e6:
            boolean r6 = r15.M1
            r7 = 8
            r8 = 255(0xff, float:3.57E-43)
            r9 = 0
            java.lang.String r10 = "audio/opus"
            if (r6 == 0) goto L_0x0139
            xu5 r6 = r15.R0
            r6.getClass()
            r15.S0 = r6
            java.lang.String r6 = r6.n
            boolean r6 = java.util.Objects.equals(r6, r10)
            if (r6 == 0) goto L_0x0132
            xu5 r6 = r15.S0
            java.util.List r6 = r6.q
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L_0x0132
            xu5 r6 = r15.S0
            java.util.List r6 = r6.q
            java.lang.Object r6 = r6.get(r1)
            byte[] r6 = (byte[]) r6
            r11 = 11
            byte r11 = r6[r11]
            r11 = r11 & r8
            int r11 = r11 << r7
            r12 = 10
            byte r6 = r6[r12]
            r6 = r6 & r8
            r6 = r6 | r11
            xu5 r11 = r15.S0
            r11.getClass()
            uu5 r11 = r11.a()
            r11.D = r6
            xu5 r6 = new xu5
            r6.<init>(r11)
            r15.S0 = r6
        L_0x0132:
            xu5 r6 = r15.S0
            r15.e0(r6, r9)
            r15.M1 = r1
        L_0x0139:
            r4.y()
            xu5 r6 = r15.S0
            if (r6 == 0) goto L_0x030c
            java.lang.String r6 = r6.n
            boolean r6 = java.util.Objects.equals(r6, r10)
            if (r6 == 0) goto L_0x030c
            r6 = 268435456(0x10000000, float:2.5243549E-29)
            boolean r6 = r4.f(r6)
            if (r6 == 0) goto L_0x0157
            xu5 r6 = r15.S0
            r4.c = r6
            r15.V(r4)
        L_0x0157:
            long r10 = r15.A0
            long r12 = r4.Z
            long r10 = r10 - r12
            r12 = 80000(0x13880, double:3.95253E-319)
            int r6 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r6 > 0) goto L_0x030c
            xu5 r6 = r15.S0
            r6.getClass()
            hw9 r10 = r15.Q0
            r10.getClass()
            java.nio.ByteBuffer r11 = r4.X
            r11.getClass()
            java.nio.ByteBuffer r11 = r4.X
            int r11 = r11.limit()
            java.nio.ByteBuffer r12 = r4.X
            int r12 = r12.position()
            int r11 = r11 - r12
            if (r11 != 0) goto L_0x0183
            goto L_0x030c
        L_0x0183:
            int r11 = r10.b
            r12 = 2
            if (r11 != r12) goto L_0x019e
            java.util.List r6 = r6.q
            int r11 = r6.size()
            if (r11 == r2) goto L_0x0197
            int r11 = r6.size()
            r13 = 3
            if (r11 != r13) goto L_0x019e
        L_0x0197:
            java.lang.Object r6 = r6.get(r1)
            r9 = r6
            byte[] r9 = (byte[]) r9
        L_0x019e:
            java.nio.ByteBuffer r6 = r4.X
            int r11 = r6.position()
            int r13 = r6.limit()
            int r14 = r13 - r11
            int r5 = r14 + 255
            int r5 = r5 / r8
            int r16 = r5 + 27
            int r16 = r16 + r14
            int r8 = r10.b
            if (r8 != r12) goto L_0x01c4
            if (r9 == 0) goto L_0x01bb
            int r8 = r9.length
            int r8 = r8 + 28
            goto L_0x01bd
        L_0x01bb:
            r8 = 47
        L_0x01bd:
            int r17 = r8 + 44
            int r16 = r17 + r16
        L_0x01c1:
            r2 = r16
            goto L_0x01c6
        L_0x01c4:
            r8 = r1
            goto L_0x01c1
        L_0x01c6:
            java.lang.Object r1 = r10.o
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            int r1 = r1.capacity()
            if (r1 >= r2) goto L_0x01dd
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r2)
            java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r1 = r1.order(r2)
            r10.o = r1
            goto L_0x01e4
        L_0x01dd:
            java.lang.Object r1 = r10.o
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            r1.clear()
        L_0x01e4:
            java.lang.Object r1 = r10.o
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            int r2 = r10.b
            if (r2 != r12) goto L_0x0243
            if (r9 == 0) goto L_0x0235
            r21 = 0
            r23 = 0
            r24 = 1
            r25 = 1
            r20 = r1
            defpackage.hw9.f(r20, r21, r23, r24, r25)
            int r2 = r9.length
            r17 = r13
            long r12 = (long) r2
            r2 = 8
            long r18 = r12 >> r2
            r20 = 0
            int r2 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r2 != 0) goto L_0x020b
            r2 = 1
            goto L_0x020c
        L_0x020b:
            r2 = 0
        L_0x020c:
            java.lang.String r7 = "out of range: %s"
            defpackage.a06.j(r12, r7, r2)
            int r2 = (int) r12
            byte r2 = (byte) r2
            r1.put(r2)
            r1.put(r9)
            byte[] r2 = r1.array()
            int r7 = r1.arrayOffset()
            int r12 = r9.length
            int r12 = r12 + 28
            r13 = 0
            int r2 = defpackage.oze.n(r7, r12, r13, r2)
            r7 = 22
            r1.putInt(r7, r2)
            int r2 = r9.length
            int r2 = r2 + 28
            r1.position(r2)
            goto L_0x023c
        L_0x0235:
            r17 = r13
            byte[] r2 = defpackage.hw9.X
            r1.put(r2)
        L_0x023c:
            byte[] r2 = defpackage.hw9.Y
            r1.put(r2)
        L_0x0241:
            r2 = 0
            goto L_0x0246
        L_0x0243:
            r17 = r13
            goto L_0x0241
        L_0x0246:
            byte r7 = r6.get(r2)
            int r2 = r6.limit()
            r9 = 1
            if (r2 <= r9) goto L_0x0256
            byte r12 = r6.get(r9)
            goto L_0x0257
        L_0x0256:
            r12 = 0
        L_0x0257:
            long r12 = defpackage.ete.D(r7, r12)
            r18 = 48000(0xbb80, double:2.3715E-319)
            long r12 = r12 * r18
            r18 = 1000000(0xf4240, double:4.940656E-318)
            long r12 = r12 / r18
            int r2 = (int) r12
            int r7 = r10.c
            int r7 = r7 + r2
            r10.c = r7
            long r12 = (long) r7
            int r2 = r10.b
            r25 = 0
            r20 = r1
            r21 = r12
            r23 = r2
            r24 = r5
            defpackage.hw9.f(r20, r21, r23, r24, r25)
            r12 = 0
        L_0x027c:
            if (r12 >= r5) goto L_0x0292
            r2 = 255(0xff, float:3.57E-43)
            if (r14 < r2) goto L_0x028a
            r7 = -1
            r1.put(r7)
            int r7 = r14 + -255
            r14 = r7
            goto L_0x028f
        L_0x028a:
            byte r7 = (byte) r14
            r1.put(r7)
            r14 = 0
        L_0x028f:
            int r12 = r12 + 1
            goto L_0x027c
        L_0x0292:
            r2 = r17
        L_0x0294:
            if (r11 >= r2) goto L_0x02a0
            byte r5 = r6.get(r11)
            r1.put(r5)
            int r11 = r11 + 1
            goto L_0x0294
        L_0x02a0:
            int r2 = r6.limit()
            r6.position(r2)
            r1.flip()
            int r2 = r10.b
            r5 = 2
            if (r2 != r5) goto L_0x02ce
            byte[] r2 = r1.array()
            int r5 = r1.arrayOffset()
            int r5 = r5 + r8
            int r5 = r5 + 44
            int r6 = r1.limit()
            int r7 = r1.position()
            int r6 = r6 - r7
            r7 = 0
            int r2 = defpackage.oze.n(r5, r6, r7, r2)
            int r8 = r8 + 66
            r1.putInt(r8, r2)
            goto L_0x02e9
        L_0x02ce:
            r7 = 0
            byte[] r2 = r1.array()
            int r5 = r1.arrayOffset()
            int r6 = r1.limit()
            int r8 = r1.position()
            int r6 = r6 - r8
            int r2 = defpackage.oze.n(r5, r6, r7, r2)
            r5 = 22
            r1.putInt(r5, r2)
        L_0x02e9:
            int r2 = r10.b
            r5 = 1
            int r2 = r2 + r5
            r10.b = r2
            r10.o = r1
            r4.v()
            java.lang.Object r1 = r10.o
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            int r1 = r1.remaining()
            r4.x(r1)
            java.nio.ByteBuffer r1 = r4.X
            java.lang.Object r2 = r10.o
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            r1.put(r2)
            r4.y()
            goto L_0x030d
        L_0x030c:
            r7 = r1
        L_0x030d:
            boolean r1 = r0.A()
            if (r1 != 0) goto L_0x0314
            goto L_0x0324
        L_0x0314:
            long r1 = r15.A0
            long r5 = r0.z0
            boolean r5 = r15.X(r1, r5)
            long r8 = r4.Z
            boolean r1 = r15.X(r1, r8)
            if (r5 != r1) goto L_0x032a
        L_0x0324:
            boolean r1 = r0.z(r4)
            if (r1 != 0) goto L_0x032c
        L_0x032a:
            r1 = 1
            goto L_0x0330
        L_0x032c:
            r1 = r7
            r2 = 1
            goto L_0x0096
        L_0x0330:
            r15.z1 = r1
            goto L_0x0338
        L_0x0333:
            r7 = r1
            r1 = r2
            r15.d0(r3)
        L_0x0338:
            boolean r2 = r0.A()
            if (r2 == 0) goto L_0x0341
            r0.y()
        L_0x0341:
            boolean r0 = r0.A()
            if (r0 != 0) goto L_0x0352
            boolean r0 = r15.K1
            if (r0 != 0) goto L_0x0352
            boolean r0 = r15.A1
            if (r0 == 0) goto L_0x0350
            goto L_0x0352
        L_0x0350:
            r14 = r7
            goto L_0x0353
        L_0x0352:
            r14 = r1
        L_0x0353:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x28.F(long, long):boolean");
    }

    public abstract q24 G(p28 p28, xu5 xu5, xu5 xu52);

    public MediaCodecDecoderException H(IllegalStateException illegalStateException, p28 p28) {
        return new MediaCodecDecoderException(illegalStateException, p28);
    }

    public final void J() {
        this.A1 = false;
        this.N0.v();
        this.M0.v();
        this.z1 = false;
        this.y1 = false;
        hw9 hw9 = this.Q0;
        hw9.getClass();
        hw9.o = k50.a;
        hw9.c = 0;
        hw9.b = 2;
    }

    public final boolean K() {
        if (this.F1) {
            this.D1 = 1;
            if (this.k1 || this.m1) {
                this.E1 = 3;
                return false;
            }
            this.E1 = 2;
        } else {
            x0();
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:86:0x0125  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean L(long r22, long r24) {
        /*
            r21 = this;
            r15 = r21
            j28 r5 = r15.a1
            r5.getClass()
            int r0 = r15.u1
            r14 = 0
            r13 = 1
            if (r0 < 0) goto L_0x000f
            r0 = r13
            goto L_0x0010
        L_0x000f:
            r0 = r14
        L_0x0010:
            android.media.MediaCodec$BufferInfo r12 = r15.O0
            if (r0 != 0) goto L_0x00e0
            boolean r0 = r15.n1
            if (r0 == 0) goto L_0x002c
            boolean r0 = r15.G1
            if (r0 == 0) goto L_0x002c
            int r0 = r5.g(r12)     // Catch:{ IllegalStateException -> 0x0021 }
            goto L_0x0030
        L_0x0021:
            r21.k0()
            boolean r0 = r15.L1
            if (r0 == 0) goto L_0x002b
            r21.n0()
        L_0x002b:
            return r14
        L_0x002c:
            int r0 = r5.g(r12)
        L_0x0030:
            if (r0 >= 0) goto L_0x006f
            r1 = -2
            if (r0 != r1) goto L_0x005e
            r15.H1 = r13
            j28 r0 = r15.a1
            r0.getClass()
            android.media.MediaFormat r0 = r0.getOutputFormat()
            int r1 = r15.i1
            if (r1 == 0) goto L_0x0059
            java.lang.String r1 = "width"
            int r1 = r0.getInteger(r1)
            r2 = 32
            if (r1 != r2) goto L_0x0059
            java.lang.String r1 = "height"
            int r1 = r0.getInteger(r1)
            if (r1 != r2) goto L_0x0059
            r15.q1 = r13
            goto L_0x005d
        L_0x0059:
            r15.c1 = r0
            r15.d1 = r13
        L_0x005d:
            return r13
        L_0x005e:
            boolean r0 = r15.r1
            if (r0 == 0) goto L_0x006e
            boolean r0 = r15.K1
            if (r0 != 0) goto L_0x006b
            int r0 = r15.D1
            r1 = 2
            if (r0 != r1) goto L_0x006e
        L_0x006b:
            r21.k0()
        L_0x006e:
            return r14
        L_0x006f:
            boolean r1 = r15.q1
            if (r1 == 0) goto L_0x0079
            r15.q1 = r14
            r5.releaseOutputBuffer(r0, r14)
            return r13
        L_0x0079:
            int r1 = r12.size
            if (r1 != 0) goto L_0x0087
            int r1 = r12.flags
            r1 = r1 & 4
            if (r1 == 0) goto L_0x0087
            r21.k0()
            return r14
        L_0x0087:
            r15.u1 = r0
            java.nio.ByteBuffer r0 = r5.getOutputBuffer(r0)
            r15.v1 = r0
            if (r0 == 0) goto L_0x00a0
            int r1 = r12.offset
            r0.position(r1)
            java.nio.ByteBuffer r0 = r15.v1
            int r1 = r12.offset
            int r2 = r12.size
            int r1 = r1 + r2
            r0.limit(r1)
        L_0x00a0:
            boolean r0 = r15.o1
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 == 0) goto L_0x00c1
            long r3 = r12.presentationTimeUs
            r6 = 0
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x00c1
            int r0 = r12.flags
            r0 = r0 & 4
            if (r0 == 0) goto L_0x00c1
            long r3 = r15.I1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00c1
            long r3 = r15.J1
            r12.presentationTimeUs = r3
        L_0x00c1:
            long r3 = r12.presentationTimeUs
            long r6 = r15.A0
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x00cb
            r0 = r13
            goto L_0x00cc
        L_0x00cb:
            r0 = r14
        L_0x00cc:
            r15.w1 = r0
            long r6 = r15.J1
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00da
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x00da
            r0 = r13
            goto L_0x00db
        L_0x00da:
            r0 = r14
        L_0x00db:
            r15.x1 = r0
            r15.y0(r3)
        L_0x00e0:
            boolean r0 = r15.n1
            if (r0 == 0) goto L_0x0129
            boolean r0 = r15.G1
            if (r0 == 0) goto L_0x0129
            java.nio.ByteBuffer r6 = r15.v1     // Catch:{ IllegalStateException -> 0x011c }
            int r7 = r15.u1     // Catch:{ IllegalStateException -> 0x011c }
            int r8 = r12.flags     // Catch:{ IllegalStateException -> 0x011c }
            long r10 = r12.presentationTimeUs     // Catch:{ IllegalStateException -> 0x011c }
            boolean r9 = r15.w1     // Catch:{ IllegalStateException -> 0x011c }
            boolean r3 = r15.x1     // Catch:{ IllegalStateException -> 0x011c }
            xu5 r4 = r15.S0     // Catch:{ IllegalStateException -> 0x011c }
            r4.getClass()     // Catch:{ IllegalStateException -> 0x011c }
            r16 = 1
            r0 = r21
            r1 = r22
            r17 = r3
            r18 = r4
            r3 = r24
            r19 = r9
            r9 = r16
            r20 = r12
            r12 = r19
            r16 = r13
            r13 = r17
            r17 = r14
            r14 = r18
            boolean r0 = r0.l0(r1, r3, r5, r6, r7, r8, r9, r10, r12, r13, r14)     // Catch:{ IllegalStateException -> 0x011e }
            r15 = r20
            goto L_0x0155
        L_0x011c:
            r17 = r14
        L_0x011e:
            r21.k0()
            boolean r0 = r15.L1
            if (r0 == 0) goto L_0x0128
            r21.n0()
        L_0x0128:
            return r17
        L_0x0129:
            r20 = r12
            r16 = r13
            r17 = r14
            java.nio.ByteBuffer r6 = r15.v1
            int r7 = r15.u1
            r14 = r20
            int r8 = r14.flags
            long r10 = r14.presentationTimeUs
            boolean r12 = r15.w1
            boolean r13 = r15.x1
            xu5 r9 = r15.S0
            r9.getClass()
            r18 = 1
            r0 = r21
            r1 = r22
            r3 = r24
            r19 = r9
            r9 = r18
            r15 = r14
            r14 = r19
            boolean r0 = r0.l0(r1, r3, r5, r6, r7, r8, r9, r10, r12, r13, r14)
        L_0x0155:
            if (r0 == 0) goto L_0x0176
            long r0 = r15.presentationTimeUs
            r2 = r21
            r3 = r15
            r2.g0(r0)
            int r0 = r3.flags
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0168
            r14 = r16
            goto L_0x016a
        L_0x0168:
            r14 = r17
        L_0x016a:
            r0 = -1
            r2.u1 = r0
            r0 = 0
            r2.v1 = r0
            if (r14 != 0) goto L_0x0173
            return r16
        L_0x0173:
            r21.k0()
        L_0x0176:
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x28.L(long, long):boolean");
    }

    public final boolean M() {
        j28 j28 = this.a1;
        if (j28 == null || this.D1 == 2 || this.K1) {
            return false;
        }
        int i = this.t1;
        n24 n24 = this.L0;
        if (i < 0) {
            int f = j28.f();
            this.t1 = f;
            if (f < 0) {
                return false;
            }
            n24.X = j28.getInputBuffer(f);
            n24.v();
        }
        if (this.D1 == 1) {
            if (!this.r1) {
                this.G1 = true;
                j28.b(0, this.t1, 0, 4);
                this.t1 = -1;
                n24.X = null;
            }
            this.D1 = 2;
            return false;
        } else if (this.p1) {
            this.p1 = false;
            ByteBuffer byteBuffer = n24.X;
            byteBuffer.getClass();
            byteBuffer.put(T1);
            j28.b(0, this.t1, 38, 0);
            this.t1 = -1;
            n24.X = null;
            this.F1 = true;
            return true;
        } else {
            if (this.C1 == 1) {
                int i2 = 0;
                while (true) {
                    xu5 xu5 = this.b1;
                    xu5.getClass();
                    if (i2 >= xu5.q.size()) {
                        break;
                    }
                    ByteBuffer byteBuffer2 = n24.X;
                    byteBuffer2.getClass();
                    byteBuffer2.put((byte[]) this.b1.q.get(i2));
                    i2++;
                }
                this.C1 = 2;
            }
            ByteBuffer byteBuffer3 = n24.X;
            byteBuffer3.getClass();
            int position = byteBuffer3.position();
            qe4 qe4 = this.c;
            qe4.t();
            try {
                int y = y(qe4, n24, 0);
                if (y == -3) {
                    if (m()) {
                        this.J1 = this.I1;
                    }
                    return false;
                } else if (y == -5) {
                    if (this.C1 == 2) {
                        n24.v();
                        this.C1 = 1;
                    }
                    d0(qe4);
                    return true;
                } else if (n24.f(4)) {
                    this.J1 = this.I1;
                    if (this.C1 == 2) {
                        n24.v();
                        this.C1 = 1;
                    }
                    this.K1 = true;
                    if (!this.F1) {
                        k0();
                        return false;
                    }
                    try {
                        if (!this.r1) {
                            this.G1 = true;
                            j28.b(0, this.t1, 0, 4);
                            this.t1 = -1;
                            n24.X = null;
                        }
                        return false;
                    } catch (MediaCodec.CryptoException e) {
                        throw g(e, this.R0, false, oze.x(e.getErrorCode()));
                    }
                } else if (this.F1 || n24.f(1)) {
                    boolean f2 = n24.f(1073741824);
                    if (f2) {
                        nw3 nw3 = n24.o;
                        if (position == 0) {
                            nw3.getClass();
                        } else {
                            if (((int[]) nw3.d) == null) {
                                int[] iArr = new int[1];
                                nw3.d = iArr;
                                ((MediaCodec.CryptoInfo) nw3.i).numBytesOfClearData = iArr;
                            }
                            int[] iArr2 = (int[]) nw3.d;
                            iArr2[0] = iArr2[0] + position;
                        }
                    }
                    if (this.j1 && !f2) {
                        ByteBuffer byteBuffer4 = n24.X;
                        byteBuffer4.getClass();
                        int position2 = byteBuffer4.position();
                        int i3 = 0;
                        int i4 = 0;
                        while (true) {
                            int i5 = i3 + 1;
                            if (i5 >= position2) {
                                byteBuffer4.clear();
                                break;
                            }
                            byte b = byteBuffer4.get(i3) & 255;
                            if (i4 == 3) {
                                if (b == 1 && (byteBuffer4.get(i5) & 31) == 7) {
                                    ByteBuffer duplicate = byteBuffer4.duplicate();
                                    duplicate.position(i3 - 3);
                                    duplicate.limit(position2);
                                    byteBuffer4.position(0);
                                    byteBuffer4.put(duplicate);
                                    break;
                                }
                            } else if (b == 0) {
                                i4++;
                            }
                            if (b != 0) {
                                i4 = 0;
                            }
                            i3 = i5;
                        }
                        ByteBuffer byteBuffer5 = n24.X;
                        byteBuffer5.getClass();
                        if (byteBuffer5.position() == 0) {
                            return true;
                        }
                        this.j1 = false;
                    }
                    long j = n24.Z;
                    if (this.M1) {
                        ArrayDeque arrayDeque = this.P0;
                        if (!arrayDeque.isEmpty()) {
                            mje mje = ((v28) arrayDeque.peekLast()).d;
                            xu5 xu52 = this.R0;
                            xu52.getClass();
                            mje.a(j, xu52);
                        } else {
                            mje mje2 = this.Q1.d;
                            xu5 xu53 = this.R0;
                            xu53.getClass();
                            mje2.a(j, xu53);
                        }
                        this.M1 = false;
                    }
                    this.I1 = Math.max(this.I1, j);
                    if (m() || n24.f(536870912)) {
                        this.J1 = this.I1;
                    }
                    n24.y();
                    if (n24.f(268435456)) {
                        V(n24);
                    }
                    i0(n24);
                    int Q = Q(n24);
                    if (f2) {
                        try {
                            j28.i(this.t1, n24.o, j, Q);
                        } catch (MediaCodec.CryptoException e2) {
                            throw g(e2, this.R0, false, oze.x(e2.getErrorCode()));
                        }
                    } else {
                        int i6 = this.t1;
                        ByteBuffer byteBuffer6 = n24.X;
                        byteBuffer6.getClass();
                        j28.b(j, i6, byteBuffer6.limit(), Q);
                    }
                    this.t1 = -1;
                    n24.X = null;
                    this.F1 = true;
                    this.C1 = 0;
                    this.P1.d++;
                    return true;
                } else {
                    n24.v();
                    if (this.C1 == 2) {
                        this.C1 = 1;
                    }
                    return true;
                }
            } catch (DecoderInputBuffer$InsufficientCapacityException e3) {
                a0(e3);
                m0(0);
                N();
                return true;
            }
        }
    }

    public final void N() {
        try {
            j28 j28 = this.a1;
            oyb.l(j28);
            j28.flush();
        } finally {
            p0();
        }
    }

    public final boolean O() {
        if (this.a1 == null) {
            return false;
        }
        int i = this.E1;
        if (i == 3 || this.k1 || ((this.l1 && !this.H1) || (this.m1 && this.G1))) {
            n0();
            return true;
        }
        if (i == 2) {
            int i2 = oze.a;
            oyb.k(i2 >= 23);
            if (i2 >= 23) {
                try {
                    x0();
                } catch (ExoPlaybackException e) {
                    ez3.k0("Failed to update the DRM session, releasing the codec instead.", e);
                    n0();
                    return true;
                }
            }
        }
        N();
        return false;
    }

    public final List P(boolean z) {
        xu5 xu5 = this.R0;
        xu5.getClass();
        pv0 pv0 = this.H0;
        ArrayList T = T(pv0, xu5, z);
        if (T.isEmpty() && z) {
            T = T(pv0, xu5, false);
            if (!T.isEmpty()) {
                ez3.j0("Drm session requires secure decoder for " + xu5.n + ", but no secure decoder available. Trying to proceed with " + T + ".");
            }
        }
        return T;
    }

    public int Q(n24 n24) {
        return 0;
    }

    public boolean R() {
        return false;
    }

    public abstract float S(float f, xu5[] xu5Arr);

    public abstract ArrayList T(pv0 pv0, xu5 xu5, boolean z);

    public abstract f28 U(p28 p28, xu5 xu5, MediaCrypto mediaCrypto, float f);

    public abstract void V(n24 n24);

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0182, code lost:
        if ("stvm8".equals(r7) == false) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0192, code lost:
        if ("OMX.amlogic.avc.decoder.awesome.secure".equals(r4) == false) goto L_0x0196;
     */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void W(defpackage.p28 r17, android.media.MediaCrypto r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            java.lang.String r2 = "createCodec:"
            xu5 r3 = r0.R0
            r3.getClass()
            java.lang.String r4 = r1.a
            int r5 = defpackage.oze.a
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r7 = 23
            if (r5 >= r7) goto L_0x0017
            r8 = r6
            goto L_0x0022
        L_0x0017:
            float r8 = r0.Z0
            xu5[] r9 = r0.y0
            r9.getClass()
            float r8 = r0.S(r8, r9)
        L_0x0022:
            float r9 = r0.J0
            int r9 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r9 > 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            r6 = r8
        L_0x002a:
            r0.j0(r3)
            z7e r8 = r0.Z
            r8.getClass()
            long r8 = android.os.SystemClock.elapsedRealtime()
            r10 = r18
            f28 r10 = r0.U(r1, r3, r10, r6)
            r11 = 31
            if (r5 < r11) goto L_0x0048
            cza r11 = r0.Y
            r11.getClass()
            defpackage.t28.a(r10, r11)
        L_0x0048:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x006d }
            r11.<init>(r2)     // Catch:{ all -> 0x006d }
            r11.append(r4)     // Catch:{ all -> 0x006d }
            java.lang.String r2 = r11.toString()     // Catch:{ all -> 0x006d }
            android.os.Trace.beginSection(r2)     // Catch:{ all -> 0x006d }
            h28 r2 = r0.G0     // Catch:{ all -> 0x006d }
            j28 r2 = r2.b(r10)     // Catch:{ all -> 0x006d }
            r0.a1 = r2     // Catch:{ all -> 0x006d }
            r10 = 21
            if (r5 < r10) goto L_0x0070
            u28 r13 = new u28     // Catch:{ all -> 0x006d }
            r13.<init>(r0)     // Catch:{ all -> 0x006d }
            boolean r2 = defpackage.r28.a(r2, r13)     // Catch:{ all -> 0x006d }
            goto L_0x0070
        L_0x006d:
            r0 = move-exception
            goto L_0x027d
        L_0x0070:
            android.os.Trace.endSection()
            z7e r2 = r0.Z
            r2.getClass()
            long r13 = android.os.SystemClock.elapsedRealtime()
            boolean r2 = r1.d(r3)
            if (r2 != 0) goto L_0x00a6
            java.lang.String r2 = defpackage.xu5.e(r3)
            java.util.Locale r15 = java.util.Locale.US
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r11 = "Format exceeds selected codec's capabilities ["
            r15.<init>(r11)
            r15.append(r2)
            java.lang.String r2 = ", "
            r15.append(r2)
            r15.append(r4)
            java.lang.String r2 = "]"
            r15.append(r2)
            java.lang.String r2 = r15.toString()
            defpackage.ez3.j0(r2)
        L_0x00a6:
            r0.h1 = r1
            r0.e1 = r6
            r0.b1 = r3
            r2 = 2
            java.lang.String r3 = "OMX.Exynos.avc.dec.secure"
            r6 = 25
            if (r5 > r6) goto L_0x00dd
            boolean r11 = r3.equals(r4)
            if (r11 == 0) goto L_0x00dd
            java.lang.String r11 = defpackage.oze.d
            java.lang.String r15 = "SM-T585"
            boolean r15 = r11.startsWith(r15)
            if (r15 != 0) goto L_0x00db
            java.lang.String r15 = "SM-A510"
            boolean r15 = r11.startsWith(r15)
            if (r15 != 0) goto L_0x00db
            java.lang.String r15 = "SM-A520"
            boolean r15 = r11.startsWith(r15)
            if (r15 != 0) goto L_0x00db
            java.lang.String r15 = "SM-J700"
            boolean r11 = r11.startsWith(r15)
            if (r11 == 0) goto L_0x00dd
        L_0x00db:
            r11 = r2
            goto L_0x0116
        L_0x00dd:
            r11 = 24
            if (r5 >= r11) goto L_0x0115
            java.lang.String r11 = "OMX.Nvidia.h264.decode"
            boolean r11 = r11.equals(r4)
            if (r11 != 0) goto L_0x00f1
            java.lang.String r11 = "OMX.Nvidia.h264.decode.secure"
            boolean r11 = r11.equals(r4)
            if (r11 == 0) goto L_0x0115
        L_0x00f1:
            java.lang.String r11 = defpackage.oze.b
            java.lang.String r15 = "flounder"
            boolean r15 = r15.equals(r11)
            if (r15 != 0) goto L_0x0113
            java.lang.String r15 = "flounder_lte"
            boolean r15 = r15.equals(r11)
            if (r15 != 0) goto L_0x0113
            java.lang.String r15 = "grouper"
            boolean r15 = r15.equals(r11)
            if (r15 != 0) goto L_0x0113
            java.lang.String r15 = "tilapia"
            boolean r11 = r15.equals(r11)
            if (r11 == 0) goto L_0x0115
        L_0x0113:
            r11 = 1
            goto L_0x0116
        L_0x0115:
            r11 = 0
        L_0x0116:
            r0.i1 = r11
            xu5 r11 = r0.b1
            r11.getClass()
            if (r5 >= r10) goto L_0x0131
            java.util.List r11 = r11.q
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto L_0x0131
            java.lang.String r11 = "OMX.MTK.VIDEO.DECODER.AVC"
            boolean r11 = r11.equals(r4)
            if (r11 == 0) goto L_0x0131
            r11 = 1
            goto L_0x0132
        L_0x0131:
            r11 = 0
        L_0x0132:
            r0.j1 = r11
            r11 = 19
            if (r5 != r11) goto L_0x0152
            java.lang.String r15 = defpackage.oze.d
            java.lang.String r12 = "SM-G800"
            boolean r12 = r15.startsWith(r12)
            if (r12 == 0) goto L_0x0152
            java.lang.String r12 = "OMX.Exynos.avc.dec"
            boolean r12 = r12.equals(r4)
            if (r12 != 0) goto L_0x0150
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0152
        L_0x0150:
            r3 = 1
            goto L_0x0153
        L_0x0152:
            r3 = 0
        L_0x0153:
            r0.k1 = r3
            r3 = 29
            if (r5 != r3) goto L_0x0163
            java.lang.String r12 = "c2.android.aac.decoder"
            boolean r12 = r12.equals(r4)
            if (r12 == 0) goto L_0x0163
            r12 = 1
            goto L_0x0164
        L_0x0163:
            r12 = 0
        L_0x0164:
            r0.l1 = r12
            if (r5 > r7) goto L_0x0170
            java.lang.String r7 = "OMX.google.vorbis.decoder"
            boolean r7 = r7.equals(r4)
            if (r7 != 0) goto L_0x0194
        L_0x0170:
            if (r5 != r11) goto L_0x0196
            java.lang.String r7 = defpackage.oze.b
            java.lang.String r11 = "hb2000"
            boolean r11 = r11.equals(r7)
            if (r11 != 0) goto L_0x0184
            java.lang.String r11 = "stvm8"
            boolean r7 = r11.equals(r7)
            if (r7 == 0) goto L_0x0196
        L_0x0184:
            java.lang.String r7 = "OMX.amlogic.avc.decoder.awesome"
            boolean r7 = r7.equals(r4)
            if (r7 != 0) goto L_0x0194
            java.lang.String r7 = "OMX.amlogic.avc.decoder.awesome.secure"
            boolean r7 = r7.equals(r4)
            if (r7 == 0) goto L_0x0196
        L_0x0194:
            r7 = 1
            goto L_0x0197
        L_0x0196:
            r7 = 0
        L_0x0197:
            r0.m1 = r7
            if (r5 != r10) goto L_0x01a5
            java.lang.String r7 = "OMX.google.aac.decoder"
            boolean r7 = r7.equals(r4)
            if (r7 == 0) goto L_0x01a5
            r7 = 1
            goto L_0x01a6
        L_0x01a5:
            r7 = 0
        L_0x01a6:
            r0.n1 = r7
            if (r5 >= r10) goto L_0x01f0
            java.lang.String r7 = "OMX.SEC.mp3.dec"
            boolean r7 = r7.equals(r4)
            if (r7 == 0) goto L_0x01f0
            java.lang.String r7 = "samsung"
            java.lang.String r10 = defpackage.oze.c
            boolean r7 = r7.equals(r10)
            if (r7 == 0) goto L_0x01f0
            java.lang.String r7 = defpackage.oze.b
            java.lang.String r10 = "baffin"
            boolean r10 = r7.startsWith(r10)
            if (r10 != 0) goto L_0x01ee
            java.lang.String r10 = "grand"
            boolean r10 = r7.startsWith(r10)
            if (r10 != 0) goto L_0x01ee
            java.lang.String r10 = "fortuna"
            boolean r10 = r7.startsWith(r10)
            if (r10 != 0) goto L_0x01ee
            java.lang.String r10 = "gprimelte"
            boolean r10 = r7.startsWith(r10)
            if (r10 != 0) goto L_0x01ee
            java.lang.String r10 = "j2y18lte"
            boolean r10 = r7.startsWith(r10)
            if (r10 != 0) goto L_0x01ee
            java.lang.String r10 = "ms01"
            boolean r7 = r7.startsWith(r10)
            if (r7 == 0) goto L_0x01f0
        L_0x01ee:
            r7 = 1
            goto L_0x01f1
        L_0x01f0:
            r7 = 0
        L_0x01f1:
            r0.o1 = r7
            java.lang.String r7 = r1.a
            if (r5 > r6) goto L_0x01ff
            java.lang.String r6 = "OMX.rk.video_decoder.avc"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x0250
        L_0x01ff:
            if (r5 > r3) goto L_0x0231
            java.lang.String r3 = "OMX.broadcom.video_decoder.tunnel"
            boolean r3 = r3.equals(r7)
            if (r3 != 0) goto L_0x0250
            java.lang.String r3 = "OMX.broadcom.video_decoder.tunnel.secure"
            boolean r3 = r3.equals(r7)
            if (r3 != 0) goto L_0x0250
            java.lang.String r3 = "OMX.bcm.vdec.avc.tunnel"
            boolean r3 = r3.equals(r7)
            if (r3 != 0) goto L_0x0250
            java.lang.String r3 = "OMX.bcm.vdec.avc.tunnel.secure"
            boolean r3 = r3.equals(r7)
            if (r3 != 0) goto L_0x0250
            java.lang.String r3 = "OMX.bcm.vdec.hevc.tunnel"
            boolean r3 = r3.equals(r7)
            if (r3 != 0) goto L_0x0250
            java.lang.String r3 = "OMX.bcm.vdec.hevc.tunnel.secure"
            boolean r3 = r3.equals(r7)
            if (r3 != 0) goto L_0x0250
        L_0x0231:
            java.lang.String r3 = "Amazon"
            java.lang.String r5 = defpackage.oze.c
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x024a
            java.lang.String r3 = "AFTS"
            java.lang.String r5 = defpackage.oze.d
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x024a
            boolean r1 = r1.f
            if (r1 == 0) goto L_0x024a
            goto L_0x0250
        L_0x024a:
            boolean r1 = r16.R()
            if (r1 == 0) goto L_0x0252
        L_0x0250:
            r11 = 1
            goto L_0x0253
        L_0x0252:
            r11 = 0
        L_0x0253:
            r0.r1 = r11
            j28 r1 = r0.a1
            r1.getClass()
            int r1 = r0.w0
            if (r1 != r2) goto L_0x026c
            z7e r1 = r0.Z
            r1.getClass()
            long r1 = android.os.SystemClock.elapsedRealtime()
            r5 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 + r5
            r0.s1 = r1
        L_0x026c:
            l24 r1 = r0.P1
            int r2 = r1.b
            r3 = 1
            int r2 = r2 + r3
            r1.b = r2
            long r5 = r13 - r8
            r1 = r16
            r2 = r13
            r1.b0(r2, r4, r5)
            return
        L_0x027d:
            android.os.Trace.endSection()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x28.W(p28, android.media.MediaCrypto):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r1.S0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean X(long r2, long r4) {
        /*
            r1 = this;
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x001d
            xu5 r1 = r1.S0
            if (r1 == 0) goto L_0x001b
            java.lang.String r1 = r1.n
            java.lang.String r0 = "audio/opus"
            boolean r1 = java.util.Objects.equals(r1, r0)
            if (r1 == 0) goto L_0x001b
            long r2 = r2 - r4
            r4 = 80000(0x13880, double:3.95253E-319)
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r1 > 0) goto L_0x001b
            goto L_0x001d
        L_0x001b:
            r1 = 1
            goto L_0x001e
        L_0x001d:
            r1 = 0
        L_0x001e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x28.X(long, long):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0076, code lost:
        if (r6 != 4) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x008f, code lost:
        if (r1.d() != null) goto L_0x00ae;
     */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Y() {
        /*
            r8 = this;
            j28 r0 = r8.a1
            if (r0 != 0) goto L_0x00da
            boolean r0 = r8.y1
            if (r0 != 0) goto L_0x00da
            xu5 r0 = r8.R0
            if (r0 != 0) goto L_0x000e
            goto L_0x00da
        L_0x000e:
            zn4 r1 = r8.U0
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x001c
            boolean r1 = r8.u0(r0)
            if (r1 == 0) goto L_0x001c
            r1 = r3
            goto L_0x001d
        L_0x001c:
            r1 = r2
        L_0x001d:
            java.lang.String r4 = r0.n
            if (r1 == 0) goto L_0x004e
            r8.J()
            java.lang.String r0 = "audio/mp4a-latm"
            boolean r0 = r0.equals(r4)
            zj0 r1 = r8.N0
            if (r0 != 0) goto L_0x0044
            java.lang.String r0 = "audio/mpeg"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0044
            java.lang.String r0 = "audio/opus"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0044
            r1.getClass()
            r1.B0 = r3
            goto L_0x004b
        L_0x0044:
            r1.getClass()
            r0 = 32
            r1.B0 = r0
        L_0x004b:
            r8.y1 = r3
            return
        L_0x004e:
            zn4 r1 = r8.U0
            r8.r0(r1)
            zn4 r1 = r8.T0
            if (r1 == 0) goto L_0x00ae
            android.media.MediaCrypto r1 = r8.W0
            if (r1 != 0) goto L_0x005d
            r1 = r3
            goto L_0x005e
        L_0x005d:
            r1 = r2
        L_0x005e:
            defpackage.oyb.k(r1)
            zn4 r1 = r8.T0
            mw3 r5 = r1.e()
            boolean r6 = defpackage.jz5.c
            if (r6 == 0) goto L_0x0089
            boolean r6 = r5 instanceof defpackage.jz5
            if (r6 == 0) goto L_0x0089
            int r6 = r1.getState()
            if (r6 == r3) goto L_0x0079
            r7 = 4
            if (r6 == r7) goto L_0x0089
            goto L_0x00c4
        L_0x0079:
            androidx.media3.exoplayer.drm.DrmSession$DrmSessionException r0 = r1.d()
            r0.getClass()
            xu5 r1 = r8.R0
            int r3 = r0.a
            androidx.media3.exoplayer.ExoPlaybackException r8 = r8.g(r0, r1, r2, r3)
            throw r8
        L_0x0089:
            if (r5 != 0) goto L_0x0092
            androidx.media3.exoplayer.drm.DrmSession$DrmSessionException r1 = r1.d()
            if (r1 == 0) goto L_0x00c4
            goto L_0x00ae
        L_0x0092:
            boolean r1 = r5 instanceof defpackage.jz5
            if (r1 == 0) goto L_0x00ae
            jz5 r5 = (defpackage.jz5) r5
            android.media.MediaCrypto r1 = new android.media.MediaCrypto     // Catch:{ MediaCryptoException -> 0x00a4 }
            java.util.UUID r6 = r5.a     // Catch:{ MediaCryptoException -> 0x00a4 }
            byte[] r5 = r5.b     // Catch:{ MediaCryptoException -> 0x00a4 }
            r1.<init>(r6, r5)     // Catch:{ MediaCryptoException -> 0x00a4 }
            r8.W0 = r1     // Catch:{ MediaCryptoException -> 0x00a4 }
            goto L_0x00ae
        L_0x00a4:
            r0 = move-exception
            xu5 r1 = r8.R0
            r3 = 6006(0x1776, float:8.416E-42)
            androidx.media3.exoplayer.ExoPlaybackException r8 = r8.g(r0, r1, r2, r3)
            throw r8
        L_0x00ae:
            zn4 r1 = r8.T0     // Catch:{ MediaCodecRenderer$DecoderInitializationException -> 0x00bc }
            if (r1 == 0) goto L_0x00be
            defpackage.oyb.l(r4)     // Catch:{ MediaCodecRenderer$DecoderInitializationException -> 0x00bc }
            boolean r1 = r1.c(r4)     // Catch:{ MediaCodecRenderer$DecoderInitializationException -> 0x00bc }
            if (r1 == 0) goto L_0x00be
            goto L_0x00bf
        L_0x00bc:
            r1 = move-exception
            goto L_0x00d3
        L_0x00be:
            r3 = r2
        L_0x00bf:
            android.media.MediaCrypto r1 = r8.W0     // Catch:{ MediaCodecRenderer$DecoderInitializationException -> 0x00bc }
            r8.Z(r1, r3)     // Catch:{ MediaCodecRenderer$DecoderInitializationException -> 0x00bc }
        L_0x00c4:
            android.media.MediaCrypto r0 = r8.W0
            if (r0 == 0) goto L_0x00d2
            j28 r1 = r8.a1
            if (r1 != 0) goto L_0x00d2
            r0.release()
            r0 = 0
            r8.W0 = r0
        L_0x00d2:
            return
        L_0x00d3:
            r3 = 4001(0xfa1, float:5.607E-42)
            androidx.media3.exoplayer.ExoPlaybackException r8 = r8.g(r1, r0, r2, r3)
            throw r8
        L_0x00da:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x28.Y():void");
    }

    public final void Z(MediaCrypto mediaCrypto, boolean z) {
        String str;
        xu5 xu5 = this.R0;
        xu5.getClass();
        if (this.f1 == null) {
            try {
                List P = P(z);
                ArrayDeque arrayDeque = new ArrayDeque();
                this.f1 = arrayDeque;
                if (this.I0) {
                    arrayDeque.addAll(P);
                } else if (!P.isEmpty()) {
                    this.f1.add((p28) P.get(0));
                }
                this.g1 = null;
            } catch (MediaCodecUtil$DecoderQueryException e) {
                throw new MediaCodecRenderer$DecoderInitializationException(xu5, e, z, -49998);
            }
        }
        if (!this.f1.isEmpty()) {
            ArrayDeque arrayDeque2 = this.f1;
            arrayDeque2.getClass();
            while (this.a1 == null) {
                p28 p28 = (p28) arrayDeque2.peekFirst();
                p28.getClass();
                if (t0(p28)) {
                    try {
                        W(p28, mediaCrypto);
                    } catch (Exception e2) {
                        ez3.k0("Failed to initialize decoder: " + p28, e2);
                        arrayDeque2.removeFirst();
                        String str2 = "Decoder init failed: " + p28.a + ", " + xu5;
                        if (oze.a >= 21) {
                            str = e2 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e2).getDiagnosticInfo() : null;
                        } else {
                            str = null;
                        }
                        MediaCodecRenderer$DecoderInitializationException mediaCodecRenderer$DecoderInitializationException = new MediaCodecRenderer$DecoderInitializationException(str2, e2, xu5.n, z, p28, str);
                        a0(mediaCodecRenderer$DecoderInitializationException);
                        MediaCodecRenderer$DecoderInitializationException mediaCodecRenderer$DecoderInitializationException2 = this.g1;
                        if (mediaCodecRenderer$DecoderInitializationException2 == null) {
                            this.g1 = mediaCodecRenderer$DecoderInitializationException;
                        } else {
                            this.g1 = new MediaCodecRenderer$DecoderInitializationException(mediaCodecRenderer$DecoderInitializationException2.getMessage(), mediaCodecRenderer$DecoderInitializationException2.getCause(), mediaCodecRenderer$DecoderInitializationException2.a, mediaCodecRenderer$DecoderInitializationException2.b, mediaCodecRenderer$DecoderInitializationException2.c, mediaCodecRenderer$DecoderInitializationException2.o);
                        }
                        if (arrayDeque2.isEmpty()) {
                            throw this.g1;
                        }
                    }
                } else {
                    return;
                }
            }
            this.f1 = null;
            return;
        }
        throw new MediaCodecRenderer$DecoderInitializationException(xu5, (MediaCodecUtil$DecoderQueryException) null, z, -49999);
    }

    public abstract void a0(Exception exc);

    public abstract void b0(long j, String str, long j2);

    public abstract void c0(String str);

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00cf, code lost:
        if (r4.c(r3) != false) goto L_0x018d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x010b, code lost:
        if (K() == false) goto L_0x0178;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x013e, code lost:
        if (K() == false) goto L_0x0178;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0150, code lost:
        if (K() == false) goto L_0x0178;
     */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x018c A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.q24 d0(defpackage.qe4 r13) {
        /*
            r12 = this;
            r0 = 1
            r12.M1 = r0
            java.lang.Object r1 = r13.c
            xu5 r1 = (defpackage.xu5) r1
            r1.getClass()
            r2 = 0
            java.lang.String r3 = r1.n
            if (r3 == 0) goto L_0x01a8
            java.lang.String r4 = "video/av01"
            boolean r3 = r3.equals(r4)
            r4 = 0
            if (r3 == 0) goto L_0x002d
            java.util.List r3 = r1.q
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x002d
            uu5 r1 = r1.a()
            r1.p = r4
            xu5 r3 = new xu5
            r3.<init>(r1)
            r8 = r3
            goto L_0x002e
        L_0x002d:
            r8 = r1
        L_0x002e:
            java.lang.Object r13 = r13.b
            zn4 r13 = (defpackage.zn4) r13
            zn4 r1 = r12.U0
            if (r1 != r13) goto L_0x0037
            goto L_0x0041
        L_0x0037:
            if (r13 == 0) goto L_0x003c
            r13.g(r4)
        L_0x003c:
            if (r1 == 0) goto L_0x0041
            r1.f(r4)
        L_0x0041:
            r12.U0 = r13
            r12.R0 = r8
            boolean r13 = r12.y1
            if (r13 == 0) goto L_0x004c
            r12.A1 = r0
            return r4
        L_0x004c:
            j28 r13 = r12.a1
            if (r13 != 0) goto L_0x0056
            r12.f1 = r4
            r12.Y()
            return r4
        L_0x0056:
            p28 r1 = r12.h1
            r1.getClass()
            xu5 r7 = r12.b1
            r7.getClass()
            zn4 r3 = r12.T0
            zn4 r4 = r12.U0
            r5 = 3
            r6 = 23
            if (r3 != r4) goto L_0x006b
            goto L_0x00d3
        L_0x006b:
            if (r4 == 0) goto L_0x018d
            if (r3 != 0) goto L_0x0071
            goto L_0x018d
        L_0x0071:
            mw3 r9 = r4.e()
            if (r9 != 0) goto L_0x0079
            goto L_0x018d
        L_0x0079:
            mw3 r10 = r3.e()
            if (r10 == 0) goto L_0x018d
            java.lang.Class r11 = r9.getClass()
            java.lang.Class r10 = r10.getClass()
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x008f
            goto L_0x018d
        L_0x008f:
            boolean r9 = r9 instanceof defpackage.jz5
            if (r9 != 0) goto L_0x0094
            goto L_0x00d3
        L_0x0094:
            java.util.UUID r9 = r4.a()
            java.util.UUID r10 = r3.a()
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x00a4
            goto L_0x018d
        L_0x00a4:
            int r9 = defpackage.oze.a
            if (r9 >= r6) goto L_0x00aa
            goto L_0x018d
        L_0x00aa:
            java.util.UUID r9 = defpackage.yu0.e
            java.util.UUID r3 = r3.a()
            boolean r3 = r9.equals(r3)
            if (r3 != 0) goto L_0x018d
            java.util.UUID r3 = r4.a()
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x00c2
            goto L_0x018d
        L_0x00c2:
            boolean r3 = r1.f
            if (r3 != 0) goto L_0x00d3
            java.lang.String r3 = r8.n
            r3.getClass()
            boolean r3 = r4.c(r3)
            if (r3 == 0) goto L_0x00d3
            goto L_0x018d
        L_0x00d3:
            zn4 r3 = r12.U0
            zn4 r4 = r12.T0
            if (r3 == r4) goto L_0x00db
            r3 = r0
            goto L_0x00dc
        L_0x00db:
            r3 = r2
        L_0x00dc:
            if (r3 == 0) goto L_0x00e5
            int r4 = defpackage.oze.a
            if (r4 < r6) goto L_0x00e3
            goto L_0x00e5
        L_0x00e3:
            r4 = r2
            goto L_0x00e6
        L_0x00e5:
            r4 = r0
        L_0x00e6:
            defpackage.oyb.k(r4)
            q24 r4 = r12.G(r1, r7, r8)
            int r6 = r4.d
            if (r6 == 0) goto L_0x0168
            r9 = 16
            r10 = 2
            if (r6 == r0) goto L_0x0141
            if (r6 == r10) goto L_0x0115
            if (r6 != r5) goto L_0x010f
            boolean r0 = r12.w0(r8)
            if (r0 != 0) goto L_0x0103
        L_0x0100:
            r10 = r9
            goto L_0x0178
        L_0x0103:
            r12.b1 = r8
            if (r3 == 0) goto L_0x0177
            boolean r0 = r12.K()
            if (r0 != 0) goto L_0x0177
            goto L_0x0178
        L_0x010f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            r12.<init>()
            throw r12
        L_0x0115:
            boolean r11 = r12.w0(r8)
            if (r11 != 0) goto L_0x011c
            goto L_0x0100
        L_0x011c:
            r12.B1 = r0
            r12.C1 = r0
            int r9 = r12.i1
            if (r9 == r10) goto L_0x0134
            if (r9 != r0) goto L_0x0133
            int r9 = r8.t
            int r11 = r7.t
            if (r9 != r11) goto L_0x0133
            int r9 = r8.u
            int r11 = r7.u
            if (r9 != r11) goto L_0x0133
            goto L_0x0134
        L_0x0133:
            r0 = r2
        L_0x0134:
            r12.p1 = r0
            r12.b1 = r8
            if (r3 == 0) goto L_0x0177
            boolean r0 = r12.K()
            if (r0 != 0) goto L_0x0177
            goto L_0x0178
        L_0x0141:
            boolean r11 = r12.w0(r8)
            if (r11 != 0) goto L_0x0148
            goto L_0x0100
        L_0x0148:
            r12.b1 = r8
            if (r3 == 0) goto L_0x0153
            boolean r0 = r12.K()
            if (r0 != 0) goto L_0x0177
            goto L_0x0178
        L_0x0153:
            boolean r3 = r12.F1
            if (r3 == 0) goto L_0x0177
            r12.D1 = r0
            boolean r3 = r12.k1
            if (r3 != 0) goto L_0x0165
            boolean r3 = r12.m1
            if (r3 == 0) goto L_0x0162
            goto L_0x0165
        L_0x0162:
            r12.E1 = r0
            goto L_0x0177
        L_0x0165:
            r12.E1 = r5
            goto L_0x0178
        L_0x0168:
            boolean r3 = r12.F1
            if (r3 == 0) goto L_0x0171
            r12.D1 = r0
            r12.E1 = r5
            goto L_0x0177
        L_0x0171:
            r12.n0()
            r12.Y()
        L_0x0177:
            r10 = r2
        L_0x0178:
            if (r6 == 0) goto L_0x018c
            j28 r0 = r12.a1
            if (r0 != r13) goto L_0x0182
            int r12 = r12.E1
            if (r12 != r5) goto L_0x018c
        L_0x0182:
            q24 r12 = new q24
            java.lang.String r6 = r1.a
            r9 = 0
            r5 = r12
            r5.<init>(r6, r7, r8, r9, r10)
            return r12
        L_0x018c:
            return r4
        L_0x018d:
            boolean r13 = r12.F1
            if (r13 == 0) goto L_0x0196
            r12.D1 = r0
            r12.E1 = r5
            goto L_0x019c
        L_0x0196:
            r12.n0()
            r12.Y()
        L_0x019c:
            q24 r12 = new q24
            r10 = 128(0x80, float:1.794E-43)
            java.lang.String r6 = r1.a
            r9 = 0
            r5 = r12
            r5.<init>(r6, r7, r8, r9, r10)
            return r12
        L_0x01a8:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Sample MIME type is null."
            r13.<init>(r0)
            r0 = 4005(0xfa5, float:5.612E-42)
            androidx.media3.exoplayer.ExoPlaybackException r12 = r12.g(r13, r1, r2, r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x28.d0(qe4):q24");
    }

    public abstract void e0(xu5 xu5, MediaFormat mediaFormat);

    public void f0() {
    }

    public void g0(long j) {
        this.R1 = j;
        while (true) {
            ArrayDeque arrayDeque = this.P0;
            if (!arrayDeque.isEmpty() && j >= ((v28) arrayDeque.peek()).a) {
                v28 v28 = (v28) arrayDeque.poll();
                v28.getClass();
                s0(v28);
                h0();
            } else {
                return;
            }
        }
    }

    public abstract void h0();

    public void i0(n24 n24) {
    }

    public void j0(xu5 xu5) {
    }

    public final void k0() {
        int i = this.E1;
        if (i == 1) {
            N();
        } else if (i == 2) {
            N();
            x0();
        } else if (i != 3) {
            this.L1 = true;
            o0();
        } else {
            n0();
            Y();
        }
    }

    public abstract boolean l0(long j, long j2, j28 j28, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, xu5 xu5);

    public final boolean m0(int i) {
        qe4 qe4 = this.c;
        qe4.t();
        n24 n24 = this.K0;
        n24.v();
        int y = y(qe4, n24, i | 4);
        if (y == -5) {
            d0(qe4);
            return true;
        } else if (y != -4 || !n24.f(4)) {
            return false;
        } else {
            this.K1 = true;
            k0();
            return false;
        }
    }

    public final void n0() {
        try {
            j28 j28 = this.a1;
            if (j28 != null) {
                j28.release();
                this.P1.c++;
                p28 p28 = this.h1;
                p28.getClass();
                c0(p28.a);
            }
            this.a1 = null;
            try {
                MediaCrypto mediaCrypto = this.W0;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
                this.W0 = null;
                r0((zn4) null);
                q0();
            }
        } catch (Throwable th) {
            this.a1 = null;
            MediaCrypto mediaCrypto2 = this.W0;
            if (mediaCrypto2 != null) {
                mediaCrypto2.release();
            }
            throw th;
        } finally {
            this.W0 = null;
            r0((zn4) null);
            q0();
        }
    }

    public void o0() {
    }

    public boolean p() {
        boolean z;
        if (this.R0 == null) {
            return false;
        }
        if (m()) {
            z = this.C0;
        } else {
            yjc yjc = this.x0;
            yjc.getClass();
            z = yjc.d();
        }
        if (!z) {
            if (!(this.u1 >= 0)) {
                if (this.s1 == -9223372036854775807L) {
                    return false;
                }
                this.Z.getClass();
                if (SystemClock.elapsedRealtime() >= this.s1) {
                    return false;
                }
            }
        }
        return true;
    }

    public void p0() {
        this.t1 = -1;
        this.L0.X = null;
        this.u1 = -1;
        this.v1 = null;
        this.s1 = -9223372036854775807L;
        this.G1 = false;
        this.F1 = false;
        this.p1 = false;
        this.q1 = false;
        this.w1 = false;
        this.x1 = false;
        this.I1 = -9223372036854775807L;
        this.J1 = -9223372036854775807L;
        this.R1 = -9223372036854775807L;
        this.D1 = 0;
        this.E1 = 0;
        this.C1 = this.B1 ? 1 : 0;
    }

    public void q() {
        this.R0 = null;
        s0(v28.e);
        this.P0.clear();
        O();
    }

    public final void q0() {
        p0();
        this.O1 = null;
        this.f1 = null;
        this.h1 = null;
        this.b1 = null;
        this.c1 = null;
        this.d1 = false;
        this.H1 = false;
        this.e1 = -1.0f;
        this.i1 = 0;
        this.j1 = false;
        this.k1 = false;
        this.l1 = false;
        this.m1 = false;
        this.n1 = false;
        this.o1 = false;
        this.r1 = false;
        this.B1 = false;
        this.C1 = 0;
    }

    public final void r0(zn4 zn4) {
        zn4 zn42 = this.T0;
        if (zn42 != zn4) {
            if (zn4 != null) {
                zn4.g((fo4) null);
            }
            if (zn42 != null) {
                zn42.f((fo4) null);
            }
        }
        this.T0 = zn4;
    }

    public void s(long j, boolean z) {
        this.K1 = false;
        this.L1 = false;
        this.N1 = false;
        if (this.y1) {
            this.N0.v();
            this.M0.v();
            this.z1 = false;
            hw9 hw9 = this.Q0;
            hw9.getClass();
            hw9.o = k50.a;
            hw9.c = 0;
            hw9.b = 2;
        } else if (O()) {
            Y();
        }
        if (this.Q1.d.h() > 0) {
            this.M1 = true;
        }
        this.Q1.d.b();
        this.P0.clear();
    }

    public final void s0(v28 v28) {
        this.Q1 = v28;
        if (v28.c != -9223372036854775807L) {
            this.S1 = true;
            f0();
        }
    }

    public boolean t0(p28 p28) {
        return true;
    }

    public boolean u0(xu5 xu5) {
        return false;
    }

    public abstract int v0(pv0 pv0, xu5 xu5);

    public final boolean w0(xu5 xu5) {
        if (!(oze.a < 23 || this.a1 == null || this.E1 == 3 || this.w0 == 0)) {
            float f = this.Z0;
            xu5.getClass();
            xu5[] xu5Arr = this.y0;
            xu5Arr.getClass();
            float S = S(f, xu5Arr);
            float f2 = this.e1;
            if (f2 == S) {
                return true;
            }
            if (S == -1.0f) {
                if (this.F1) {
                    this.D1 = 1;
                    this.E1 = 3;
                    return false;
                }
                n0();
                Y();
                return false;
            } else if (f2 == -1.0f && S <= this.J0) {
                return true;
            } else {
                Bundle bundle = new Bundle();
                bundle.putFloat("operating-rate", S);
                j28 j28 = this.a1;
                j28.getClass();
                j28.setParameters(bundle);
                this.e1 = S;
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0036, code lost:
        if (r7 >= r5) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void x(defpackage.xu5[] r13, long r14, long r16) {
        /*
            r12 = this;
            r0 = r12
            v28 r1 = r0.Q1
            long r1 = r1.c
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x0020
            v28 r1 = new v28
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.s0(r1)
            goto L_0x0063
        L_0x0020:
            java.util.ArrayDeque r1 = r0.P0
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x0055
            long r5 = r0.I1
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0038
            long r7 = r0.R1
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0055
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 < 0) goto L_0x0055
        L_0x0038:
            v28 r1 = new v28
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.s0(r1)
            v28 r1 = r0.Q1
            long r1 = r1.c
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x0063
            r12.h0()
            goto L_0x0063
        L_0x0055:
            v28 r9 = new v28
            long r3 = r0.I1
            r2 = r9
            r5 = r14
            r7 = r16
            r2.<init>(r3, r5, r7)
            r1.add(r9)
        L_0x0063:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x28.x(xu5[], long, long):void");
    }

    public final void x0() {
        zn4 zn4 = this.U0;
        zn4.getClass();
        mw3 e = zn4.e();
        if (e instanceof jz5) {
            try {
                MediaCrypto mediaCrypto = this.W0;
                mediaCrypto.getClass();
                mediaCrypto.setMediaDrmSession(((jz5) e).b);
            } catch (MediaCryptoException e2) {
                throw g(e2, this.R0, false, 6006);
            }
        }
        r0(this.U0);
        this.D1 = 0;
        this.E1 = 0;
    }

    public final void y0(long j) {
        xu5 xu5 = (xu5) this.Q1.d.f(j);
        if (xu5 == null && this.S1 && this.c1 != null) {
            xu5 = (xu5) this.Q1.d.e();
        }
        if (xu5 != null) {
            this.S0 = xu5;
        } else if (!this.d1 || this.S0 == null) {
            return;
        }
        xu5 xu52 = this.S0;
        xu52.getClass();
        e0(xu52, this.c1);
        this.d1 = false;
        this.S1 = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0075 A[Catch:{ IllegalStateException -> 0x0017 }, LOOP:1: B:28:0x0050->B:38:0x0075, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0096 A[Catch:{ IllegalStateException -> 0x0017 }, LOOP:2: B:39:0x0076->B:49:0x0096, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0076 A[EDGE_INSN: B:84:0x0076->B:88:0x0076 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0097 A[EDGE_INSN: B:86:0x0097->B:50:0x0097 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void z(long r12, long r14) {
        /*
            r11 = this;
            boolean r0 = r11.N1
            r1 = 0
            if (r0 == 0) goto L_0x000a
            r11.N1 = r1
            r11.k0()
        L_0x000a:
            androidx.media3.exoplayer.ExoPlaybackException r0 = r11.O1
            if (r0 != 0) goto L_0x0109
            r0 = 1
            boolean r2 = r11.L1     // Catch:{ IllegalStateException -> 0x0017 }
            if (r2 == 0) goto L_0x001a
            r11.o0()     // Catch:{ IllegalStateException -> 0x0017 }
            return
        L_0x0017:
            r12 = move-exception
            goto L_0x00b6
        L_0x001a:
            xu5 r2 = r11.R0     // Catch:{ IllegalStateException -> 0x0017 }
            if (r2 != 0) goto L_0x0026
            r2 = 2
            boolean r2 = r11.m0(r2)     // Catch:{ IllegalStateException -> 0x0017 }
            if (r2 != 0) goto L_0x0026
            return
        L_0x0026:
            r11.Y()     // Catch:{ IllegalStateException -> 0x0017 }
            boolean r2 = r11.y1     // Catch:{ IllegalStateException -> 0x0017 }
            if (r2 == 0) goto L_0x003e
            java.lang.String r2 = "bypassRender"
            android.os.Trace.beginSection(r2)     // Catch:{ IllegalStateException -> 0x0017 }
        L_0x0032:
            boolean r2 = r11.F(r12, r14)     // Catch:{ IllegalStateException -> 0x0017 }
            if (r2 == 0) goto L_0x0039
            goto L_0x0032
        L_0x0039:
            android.os.Trace.endSection()     // Catch:{ IllegalStateException -> 0x0017 }
            goto L_0x00b1
        L_0x003e:
            j28 r2 = r11.a1     // Catch:{ IllegalStateException -> 0x0017 }
            if (r2 == 0) goto L_0x009b
            z7e r2 = r11.Z     // Catch:{ IllegalStateException -> 0x0017 }
            r2.getClass()     // Catch:{ IllegalStateException -> 0x0017 }
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IllegalStateException -> 0x0017 }
            java.lang.String r4 = "drainAndFeed"
            android.os.Trace.beginSection(r4)     // Catch:{ IllegalStateException -> 0x0017 }
        L_0x0050:
            boolean r4 = r11.L(r12, r14)     // Catch:{ IllegalStateException -> 0x0017 }
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 == 0) goto L_0x0076
            long r7 = r11.X0     // Catch:{ IllegalStateException -> 0x0017 }
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 == 0) goto L_0x0072
            z7e r4 = r11.Z     // Catch:{ IllegalStateException -> 0x0017 }
            r4.getClass()     // Catch:{ IllegalStateException -> 0x0017 }
            long r9 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IllegalStateException -> 0x0017 }
            long r9 = r9 - r2
            int r4 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r4 >= 0) goto L_0x0070
            goto L_0x0072
        L_0x0070:
            r4 = r1
            goto L_0x0073
        L_0x0072:
            r4 = r0
        L_0x0073:
            if (r4 == 0) goto L_0x0076
            goto L_0x0050
        L_0x0076:
            boolean r12 = r11.M()     // Catch:{ IllegalStateException -> 0x0017 }
            if (r12 == 0) goto L_0x0097
            long r12 = r11.X0     // Catch:{ IllegalStateException -> 0x0017 }
            int r14 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r14 == 0) goto L_0x0093
            z7e r14 = r11.Z     // Catch:{ IllegalStateException -> 0x0017 }
            r14.getClass()     // Catch:{ IllegalStateException -> 0x0017 }
            long r14 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IllegalStateException -> 0x0017 }
            long r14 = r14 - r2
            int r12 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r12 >= 0) goto L_0x0091
            goto L_0x0093
        L_0x0091:
            r12 = r1
            goto L_0x0094
        L_0x0093:
            r12 = r0
        L_0x0094:
            if (r12 == 0) goto L_0x0097
            goto L_0x0076
        L_0x0097:
            android.os.Trace.endSection()     // Catch:{ IllegalStateException -> 0x0017 }
            goto L_0x00b1
        L_0x009b:
            l24 r14 = r11.P1     // Catch:{ IllegalStateException -> 0x0017 }
            int r15 = r14.e     // Catch:{ IllegalStateException -> 0x0017 }
            yjc r2 = r11.x0     // Catch:{ IllegalStateException -> 0x0017 }
            r2.getClass()     // Catch:{ IllegalStateException -> 0x0017 }
            long r3 = r11.z0     // Catch:{ IllegalStateException -> 0x0017 }
            long r12 = r12 - r3
            int r12 = r2.e(r12)     // Catch:{ IllegalStateException -> 0x0017 }
            int r15 = r15 + r12
            r14.e = r15     // Catch:{ IllegalStateException -> 0x0017 }
            r11.m0(r0)     // Catch:{ IllegalStateException -> 0x0017 }
        L_0x00b1:
            l24 r12 = r11.P1     // Catch:{ IllegalStateException -> 0x0017 }
            monitor-enter(r12)     // Catch:{ IllegalStateException -> 0x0017 }
            monitor-exit(r12)     // Catch:{ IllegalStateException -> 0x0017 }
            return
        L_0x00b6:
            int r13 = defpackage.oze.a
            r14 = 21
            if (r13 < r14) goto L_0x00c1
            boolean r15 = r12 instanceof android.media.MediaCodec.CodecException
            if (r15 == 0) goto L_0x00c1
            goto L_0x00d6
        L_0x00c1:
            java.lang.StackTraceElement[] r15 = r12.getStackTrace()
            int r2 = r15.length
            if (r2 <= 0) goto L_0x0108
            r15 = r15[r1]
            java.lang.String r15 = r15.getClassName()
            java.lang.String r2 = "android.media.MediaCodec"
            boolean r15 = r15.equals(r2)
            if (r15 == 0) goto L_0x0108
        L_0x00d6:
            r11.a0(r12)
            if (r13 < r14) goto L_0x00eb
            boolean r13 = r12 instanceof android.media.MediaCodec.CodecException
            if (r13 == 0) goto L_0x00e7
            r13 = r12
            android.media.MediaCodec$CodecException r13 = (android.media.MediaCodec.CodecException) r13
            boolean r13 = r13.isRecoverable()
            goto L_0x00e8
        L_0x00e7:
            r13 = r1
        L_0x00e8:
            if (r13 == 0) goto L_0x00eb
            r1 = r0
        L_0x00eb:
            if (r1 == 0) goto L_0x00f0
            r11.n0()
        L_0x00f0:
            p28 r13 = r11.h1
            androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException r12 = r11.H(r12, r13)
            int r13 = r12.a
            r14 = 1101(0x44d, float:1.543E-42)
            if (r13 != r14) goto L_0x00ff
            r13 = 4006(0xfa6, float:5.614E-42)
            goto L_0x0101
        L_0x00ff:
            r13 = 4003(0xfa3, float:5.61E-42)
        L_0x0101:
            xu5 r14 = r11.R0
            androidx.media3.exoplayer.ExoPlaybackException r11 = r11.g(r12, r14, r1, r13)
            throw r11
        L_0x0108:
            throw r12
        L_0x0109:
            r12 = 0
            r11.O1 = r12
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x28.z(long, long):void");
    }
}
