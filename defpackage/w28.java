package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer$InsufficientCapacityException;
import com.google.android.exoplayer2.drm.DrmSession$DrmSessionException;
import com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil$DecoderQueryException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* renamed from: w28  reason: default package */
public abstract class w28 extends pi0 {
    public static final byte[] T1 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public boolean A1;
    public final g28 B0;
    public boolean B1;
    public final pv0 C0;
    public int C1;
    public final boolean D0 = false;
    public int D1;
    public final float E0;
    public int E1;
    public final m24 F0;
    public boolean F1;
    public final m24 G0;
    public boolean G1;
    public final m24 H0;
    public boolean H1;
    public final yj0 I0;
    public long I1;
    public final mje J0;
    public long J1;
    public final ArrayList K0;
    public boolean K1;
    public final MediaCodec.BufferInfo L0;
    public boolean L1;
    public final long[] M0;
    public boolean M1;
    public final long[] N0;
    public boolean N1;
    public final long[] O0;
    public ExoPlaybackException O1;
    public vu5 P0;
    public l24 P1;
    public vu5 Q0;
    public long Q1;
    public yn4 R0;
    public long R1;
    public yn4 S0;
    public int S1;
    public MediaCrypto T0;
    public boolean U0;
    public final long V0;
    public float W0;
    public float X0;
    public i28 Y0;
    public vu5 Z0;
    public MediaFormat a1;
    public boolean b1;
    public float c1;
    public ArrayDeque d1;
    public MediaCodecRenderer$DecoderInitializationException e1;
    public o28 f1;
    public int g1;
    public boolean h1;
    public boolean i1;
    public boolean j1;
    public boolean k1;
    public boolean l1;
    public boolean m1;
    public boolean n1;
    public boolean o1;
    public boolean p1;
    public boolean q1;
    public xu0 r1;
    public long s1;
    public int t1;
    public int u1;
    public ByteBuffer v1;
    public boolean w1;
    public boolean x1;
    public boolean y1;
    public boolean z1;

    /* JADX WARNING: type inference failed for: r4v4, types: [m24, yj0] */
    public w28(int i, g28 g28, pv0 pv0, float f) {
        super(i);
        this.B0 = g28;
        pv0.getClass();
        this.C0 = pv0;
        this.E0 = f;
        this.F0 = new m24(0);
        this.G0 = new m24(0);
        this.H0 = new m24(2);
        ? m24 = new m24(2);
        m24.A0 = 32;
        this.I0 = m24;
        this.J0 = new mje(0);
        this.K0 = new ArrayList();
        this.L0 = new MediaCodec.BufferInfo();
        this.W0 = 1.0f;
        this.X0 = 1.0f;
        this.V0 = -9223372036854775807L;
        this.M0 = new long[10];
        this.N0 = new long[10];
        this.O0 = new long[10];
        this.Q1 = -9223372036854775807L;
        this.R1 = -9223372036854775807L;
        m24.x(0);
        m24.o.order(ByteOrder.nativeOrder());
        this.c1 = -1.0f;
        this.g1 = 0;
        this.C1 = 0;
        this.t1 = -1;
        this.u1 = -1;
        this.s1 = -9223372036854775807L;
        this.I1 = -9223372036854775807L;
        this.J1 = -9223372036854775807L;
        this.D1 = 0;
        this.E1 = 0;
    }

    public final int A(vu5 vu5) {
        try {
            return n0(this.C0, vu5);
        } catch (MediaCodecUtil$DecoderQueryException e) {
            throw c(e, vu5);
        }
    }

    public final int B() {
        return 8;
    }

    public final boolean C(long j, long j2) {
        boolean z;
        yj0 yj0;
        swb.h(!this.L1);
        yj0 yj02 = this.I0;
        int i = yj02.z0;
        if (i > 0) {
            yj0 yj03 = yj02;
            if (!e0(j, j2, (i28) null, yj02.o, this.u1, 0, i, yj02.Y, yj02.f(Integer.MIN_VALUE), yj02.f(4), this.Q0)) {
                return false;
            }
            yj0 = yj03;
            a0(yj0.y0);
            yj0.v();
            z = false;
        } else {
            z = false;
            yj0 = yj02;
        }
        if (this.K1) {
            this.L1 = true;
            return z;
        }
        boolean z2 = this.z1;
        m24 m24 = this.H0;
        if (z2) {
            swb.h(yj0.z(m24));
            this.z1 = z;
        }
        if (this.A1) {
            if (yj0.z0 > 0) {
                return true;
            }
            F();
            this.A1 = z;
            T();
            if (!this.y1) {
                return z;
            }
        }
        swb.h(!this.K1);
        otf otf = this.b;
        otf.w();
        m24.v();
        while (true) {
            m24.v();
            int v = v(otf, m24, z ? 1 : 0);
            if (v != -5) {
                if (v == -4) {
                    if (!m24.f(4)) {
                        if (this.M1) {
                            vu5 vu5 = this.P0;
                            vu5.getClass();
                            this.Q0 = vu5;
                            Z(vu5, (MediaFormat) null);
                            this.M1 = z;
                        }
                        m24.y();
                        if (!yj0.z(m24)) {
                            this.z1 = true;
                            break;
                        }
                    } else {
                        this.K1 = true;
                        break;
                    }
                } else if (v != -3) {
                    throw new IllegalStateException();
                }
            } else {
                Y(otf);
                break;
            }
        }
        if (yj0.z0 > 0) {
            yj0.y();
        }
        if (yj0.z0 <= 0 && !this.K1 && !this.A1) {
            return z;
        }
        return true;
    }

    public abstract p24 D(o28 o28, vu5 vu5, vu5 vu52);

    public MediaCodecDecoderException E(IllegalStateException illegalStateException, o28 o28) {
        return new MediaCodecDecoderException(illegalStateException, o28);
    }

    public final void F() {
        this.A1 = false;
        this.I0.v();
        this.H0.v();
        this.z1 = false;
        this.y1 = false;
    }

    public final boolean G() {
        if (this.F1) {
            this.D1 = 1;
            if (this.i1 || this.k1) {
                this.E1 = 3;
                return false;
            }
            this.E1 = 2;
        } else {
            p0();
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:90:0x0140  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean H(long r22, long r24) {
        /*
            r21 = this;
            r15 = r21
            int r0 = r15.u1
            r14 = 0
            r13 = 1
            if (r0 < 0) goto L_0x000a
            r0 = r13
            goto L_0x000b
        L_0x000a:
            r0 = r14
        L_0x000b:
            android.media.MediaCodec$BufferInfo r12 = r15.L0
            if (r0 != 0) goto L_0x00fc
            boolean r0 = r15.l1
            if (r0 == 0) goto L_0x0029
            boolean r0 = r15.G1
            if (r0 == 0) goto L_0x0029
            i28 r0 = r15.Y0     // Catch:{ IllegalStateException -> 0x001e }
            int r0 = r0.g(r12)     // Catch:{ IllegalStateException -> 0x001e }
            goto L_0x002f
        L_0x001e:
            r21.d0()
            boolean r0 = r15.L1
            if (r0 == 0) goto L_0x0028
            r21.g0()
        L_0x0028:
            return r14
        L_0x0029:
            i28 r0 = r15.Y0
            int r0 = r0.g(r12)
        L_0x002f:
            if (r0 >= 0) goto L_0x0074
            r1 = -2
            if (r0 != r1) goto L_0x0063
            r15.H1 = r13
            i28 r0 = r15.Y0
            android.media.MediaFormat r0 = r0.getOutputFormat()
            int r1 = r15.g1
            if (r1 == 0) goto L_0x0055
            java.lang.String r1 = "width"
            int r1 = r0.getInteger(r1)
            r2 = 32
            if (r1 != r2) goto L_0x0055
            java.lang.String r1 = "height"
            int r1 = r0.getInteger(r1)
            if (r1 != r2) goto L_0x0055
            r15.p1 = r13
            goto L_0x0062
        L_0x0055:
            boolean r1 = r15.n1
            if (r1 == 0) goto L_0x005e
            java.lang.String r1 = "channel-count"
            r0.setInteger(r1, r13)
        L_0x005e:
            r15.a1 = r0
            r15.b1 = r13
        L_0x0062:
            return r13
        L_0x0063:
            boolean r0 = r15.q1
            if (r0 == 0) goto L_0x0073
            boolean r0 = r15.K1
            if (r0 != 0) goto L_0x0070
            int r0 = r15.D1
            r1 = 2
            if (r0 != r1) goto L_0x0073
        L_0x0070:
            r21.d0()
        L_0x0073:
            return r14
        L_0x0074:
            boolean r1 = r15.p1
            if (r1 == 0) goto L_0x0080
            r15.p1 = r14
            i28 r1 = r15.Y0
            r1.releaseOutputBuffer(r0, r14)
            return r13
        L_0x0080:
            int r1 = r12.size
            if (r1 != 0) goto L_0x008e
            int r1 = r12.flags
            r1 = r1 & 4
            if (r1 == 0) goto L_0x008e
            r21.d0()
            return r14
        L_0x008e:
            r15.u1 = r0
            i28 r1 = r15.Y0
            java.nio.ByteBuffer r0 = r1.getOutputBuffer(r0)
            r15.v1 = r0
            if (r0 == 0) goto L_0x00a9
            int r1 = r12.offset
            r0.position(r1)
            java.nio.ByteBuffer r0 = r15.v1
            int r1 = r12.offset
            int r2 = r12.size
            int r1 = r1 + r2
            r0.limit(r1)
        L_0x00a9:
            boolean r0 = r15.m1
            if (r0 == 0) goto L_0x00c8
            long r0 = r12.presentationTimeUs
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x00c8
            int r0 = r12.flags
            r0 = r0 & 4
            if (r0 == 0) goto L_0x00c8
            long r0 = r15.I1
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x00c8
            r12.presentationTimeUs = r0
        L_0x00c8:
            long r0 = r12.presentationTimeUs
            java.util.ArrayList r2 = r15.K0
            int r3 = r2.size()
            r4 = r14
        L_0x00d1:
            if (r4 >= r3) goto L_0x00e9
            java.lang.Object r5 = r2.get(r4)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 != 0) goto L_0x00e6
            r2.remove(r4)
            r0 = r13
            goto L_0x00ea
        L_0x00e6:
            int r4 = r4 + 1
            goto L_0x00d1
        L_0x00e9:
            r0 = r14
        L_0x00ea:
            r15.w1 = r0
            long r0 = r15.J1
            long r2 = r12.presentationTimeUs
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x00f6
            r0 = r13
            goto L_0x00f7
        L_0x00f6:
            r0 = r14
        L_0x00f7:
            r15.x1 = r0
            r15.q0(r2)
        L_0x00fc:
            boolean r0 = r15.l1
            if (r0 == 0) goto L_0x0144
            boolean r0 = r15.G1
            if (r0 == 0) goto L_0x0144
            i28 r5 = r15.Y0     // Catch:{ IllegalStateException -> 0x0137 }
            java.nio.ByteBuffer r6 = r15.v1     // Catch:{ IllegalStateException -> 0x0137 }
            int r7 = r15.u1     // Catch:{ IllegalStateException -> 0x0137 }
            int r8 = r12.flags     // Catch:{ IllegalStateException -> 0x0137 }
            long r10 = r12.presentationTimeUs     // Catch:{ IllegalStateException -> 0x0137 }
            boolean r9 = r15.w1     // Catch:{ IllegalStateException -> 0x0137 }
            boolean r3 = r15.x1     // Catch:{ IllegalStateException -> 0x0137 }
            vu5 r4 = r15.Q0     // Catch:{ IllegalStateException -> 0x0137 }
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
            boolean r0 = r0.e0(r1, r3, r5, r6, r7, r8, r9, r10, r12, r13, r14)     // Catch:{ IllegalStateException -> 0x0139 }
            r15 = r20
            goto L_0x016f
        L_0x0137:
            r17 = r14
        L_0x0139:
            r21.d0()
            boolean r0 = r15.L1
            if (r0 == 0) goto L_0x0143
            r21.g0()
        L_0x0143:
            return r17
        L_0x0144:
            r20 = r12
            r16 = r13
            r17 = r14
            i28 r5 = r15.Y0
            java.nio.ByteBuffer r6 = r15.v1
            int r7 = r15.u1
            r14 = r20
            int r8 = r14.flags
            long r10 = r14.presentationTimeUs
            boolean r12 = r15.w1
            boolean r13 = r15.x1
            vu5 r9 = r15.Q0
            r18 = 1
            r0 = r21
            r1 = r22
            r3 = r24
            r19 = r9
            r9 = r18
            r15 = r14
            r14 = r19
            boolean r0 = r0.e0(r1, r3, r5, r6, r7, r8, r9, r10, r12, r13, r14)
        L_0x016f:
            if (r0 == 0) goto L_0x0190
            long r0 = r15.presentationTimeUs
            r2 = r21
            r3 = r15
            r2.a0(r0)
            int r0 = r3.flags
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0182
            r14 = r16
            goto L_0x0184
        L_0x0182:
            r14 = r17
        L_0x0184:
            r0 = -1
            r2.u1 = r0
            r0 = 0
            r2.v1 = r0
            if (r14 != 0) goto L_0x018d
            return r16
        L_0x018d:
            r21.d0()
        L_0x0190:
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w28.H(long, long):boolean");
    }

    public final boolean I() {
        boolean z;
        nw3 nw3;
        i28 i28 = this.Y0;
        if (i28 == null || this.D1 == 2 || this.K1) {
            return false;
        }
        int i = this.t1;
        m24 m24 = this.G0;
        if (i < 0) {
            int f = i28.f();
            this.t1 = f;
            if (f < 0) {
                return false;
            }
            m24.o = this.Y0.getInputBuffer(f);
            m24.v();
        }
        if (this.D1 == 1) {
            if (!this.q1) {
                this.G1 = true;
                this.Y0.b(0, this.t1, 0, 4);
                this.t1 = -1;
                m24.o = null;
            }
            this.D1 = 2;
            return false;
        } else if (this.o1) {
            this.o1 = false;
            m24.o.put(T1);
            this.Y0.b(0, this.t1, 38, 0);
            this.t1 = -1;
            m24.o = null;
            this.F1 = true;
            return true;
        } else {
            if (this.C1 == 1) {
                for (int i2 = 0; i2 < this.Z0.C0.size(); i2++) {
                    m24.o.put((byte[]) this.Z0.C0.get(i2));
                }
                this.C1 = 2;
            }
            int position = m24.o.position();
            otf otf = this.b;
            otf.w();
            try {
                int v = v(otf, m24, 0);
                if (l()) {
                    this.J1 = this.I1;
                }
                if (v == -3) {
                    return false;
                }
                if (v == -5) {
                    if (this.C1 == 2) {
                        m24.v();
                        this.C1 = 1;
                    }
                    Y(otf);
                    return true;
                }
                if (m24.f(4)) {
                    if (this.C1 == 2) {
                        m24.v();
                        this.C1 = 1;
                    }
                    this.K1 = true;
                    if (!this.F1) {
                        d0();
                        return false;
                    }
                    try {
                        if (!this.q1) {
                            this.G1 = true;
                            this.Y0.b(0, this.t1, 0, 4);
                            this.t1 = -1;
                            m24.o = null;
                        }
                        return false;
                    } catch (MediaCodec.CryptoException e) {
                        throw f(e, this.P0, false, mze.r(e.getErrorCode()));
                    }
                } else if (this.F1 || m24.f(1)) {
                    boolean f2 = m24.f(1073741824);
                    nw3 nw32 = m24.c;
                    if (f2) {
                        if (position == 0) {
                            nw32.getClass();
                        } else {
                            if (((int[]) nw32.d) == null) {
                                int[] iArr = new int[1];
                                nw32.d = iArr;
                                ((MediaCodec.CryptoInfo) nw32.i).numBytesOfClearData = iArr;
                            }
                            int[] iArr2 = (int[]) nw32.d;
                            iArr2[0] = iArr2[0] + position;
                        }
                    }
                    if (this.h1 && !f2) {
                        ByteBuffer byteBuffer = m24.o;
                        int position2 = byteBuffer.position();
                        int i3 = 0;
                        int i4 = 0;
                        while (true) {
                            int i5 = i3 + 1;
                            if (i5 >= position2) {
                                byteBuffer.clear();
                                break;
                            }
                            byte b = byteBuffer.get(i3) & 255;
                            if (i4 == 3) {
                                if (b == 1 && (byteBuffer.get(i5) & 31) == 7) {
                                    ByteBuffer duplicate = byteBuffer.duplicate();
                                    duplicate.position(i3 - 3);
                                    duplicate.limit(position2);
                                    byteBuffer.position(0);
                                    byteBuffer.put(duplicate);
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
                        if (m24.o.position() == 0) {
                            return true;
                        }
                        this.h1 = false;
                    }
                    long j = m24.Y;
                    xu0 xu0 = this.r1;
                    if (xu0 != null) {
                        vu5 vu5 = this.P0;
                        if (xu0.c == 0) {
                            xu0.b = j;
                        }
                        if (!xu0.a) {
                            ByteBuffer byteBuffer2 = m24.o;
                            byteBuffer2.getClass();
                            int i6 = 0;
                            byte b2 = 0;
                            for (int i7 = 4; i6 < i7; i7 = 4) {
                                b2 = (b2 << 8) | (byteBuffer2.get(i6) & 255);
                                i6++;
                            }
                            int N = iu7.N(b2);
                            if (N == -1) {
                                xu0.a = true;
                                xu0.c = 0;
                                j = m24.Y;
                                xu0.b = j;
                            } else {
                                z = f2;
                                j = Math.max(0, ((xu0.c - 529) * 1000000) / ((long) vu5.O0)) + xu0.b;
                                xu0.c += (long) N;
                                long j2 = this.I1;
                                xu0 xu02 = this.r1;
                                vu5 vu52 = this.P0;
                                xu02.getClass();
                                nw3 = nw32;
                                this.I1 = Math.max(j2, Math.max(0, ((xu02.c - 529) * 1000000) / ((long) vu52.O0)) + xu02.b);
                            }
                        }
                        z = f2;
                        long j22 = this.I1;
                        xu0 xu022 = this.r1;
                        vu5 vu522 = this.P0;
                        xu022.getClass();
                        nw3 = nw32;
                        this.I1 = Math.max(j22, Math.max(0, ((xu022.c - 529) * 1000000) / ((long) vu522.O0)) + xu022.b);
                    } else {
                        z = f2;
                        nw3 = nw32;
                    }
                    if (m24.f(Integer.MIN_VALUE)) {
                        this.K0.add(Long.valueOf(j));
                    }
                    if (this.M1) {
                        this.J0.a(j, this.P0);
                        this.M1 = false;
                    }
                    this.I1 = Math.max(this.I1, j);
                    m24.y();
                    if (m24.f(268435456)) {
                        R(m24);
                    }
                    c0(m24);
                    if (z) {
                        try {
                            this.Y0.l(this.t1, nw3, j);
                        } catch (MediaCodec.CryptoException e2) {
                            throw f(e2, this.P0, false, mze.r(e2.getErrorCode()));
                        }
                    } else {
                        this.Y0.b(j, this.t1, m24.o.limit(), 0);
                    }
                    this.t1 = -1;
                    m24.o = null;
                    this.F1 = true;
                    this.C1 = 0;
                    this.P1.d++;
                    return true;
                } else {
                    m24.v();
                    if (this.C1 == 2) {
                        this.C1 = 1;
                    }
                    return true;
                }
            } catch (DecoderInputBuffer$InsufficientCapacityException e3) {
                V(e3);
                f0(0);
                J();
                return true;
            }
        }
    }

    public final void J() {
        try {
            this.Y0.flush();
        } finally {
            i0();
        }
    }

    public final boolean K() {
        if (this.Y0 == null) {
            return false;
        }
        if (this.E1 == 3 || this.i1 || ((this.j1 && !this.H1) || (this.k1 && this.G1))) {
            g0();
            return true;
        }
        J();
        return false;
    }

    public final List L(boolean z) {
        vu5 vu5 = this.P0;
        pv0 pv0 = this.C0;
        ArrayList O = O(pv0, vu5, z);
        if (O.isEmpty() && z) {
            O = O(pv0, this.P0, false);
            if (!O.isEmpty()) {
                String str = this.P0.A0;
                String valueOf = String.valueOf(O);
                new StringBuilder(valueOf.length() + me4.e(99, str));
            }
        }
        return O;
    }

    public boolean M() {
        return false;
    }

    public abstract float N(float f, vu5[] vu5Arr);

    public abstract ArrayList O(pv0 pv0, vu5 vu5, boolean z);

    public final iz5 P(yn4 yn4) {
        lw3 e = yn4.e();
        if (e == null || (e instanceof iz5)) {
            return (iz5) e;
        }
        String valueOf = String.valueOf(e);
        StringBuilder sb = new StringBuilder(valueOf.length() + 43);
        sb.append("Expecting FrameworkCryptoConfig but found: ");
        sb.append(valueOf);
        throw f(new IllegalArgumentException(sb.toString()), this.P0, false, 6001);
    }

    public abstract e28 Q(o28 o28, vu5 vu5, MediaCrypto mediaCrypto, float f);

    public void R(m24 m24) {
    }

    /* JADX WARNING: type inference failed for: r1v9, types: [xu0, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x015b, code lost:
        if ("stvm8".equals(r5) == false) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x016b, code lost:
        if ("OMX.amlogic.avc.decoder.awesome.secure".equals(r4) == false) goto L_0x016f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x01de  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x023e  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x024a  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00fc A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x017e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void S(defpackage.o28 r17, android.media.MediaCrypto r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            java.lang.String r4 = r1.a
            int r2 = defpackage.mze.a
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r5 = 23
            if (r2 >= r5) goto L_0x0010
            r6 = r3
            goto L_0x001b
        L_0x0010:
            float r6 = r0.X0
            vu5[] r7 = r0.w0
            r7.getClass()
            float r6 = r0.N(r6, r7)
        L_0x001b:
            float r7 = r0.E0
            int r7 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r7 > 0) goto L_0x0022
            goto L_0x0023
        L_0x0022:
            r3 = r6
        L_0x0023:
            long r6 = android.os.SystemClock.elapsedRealtime()
            vu5 r8 = r0.P0
            r9 = r18
            e28 r8 = r0.Q(r1, r8, r9, r3)
            r9 = 31
            if (r2 < r9) goto L_0x003b
            bza r9 = r0.X
            r9.getClass()
            defpackage.s28.a(r8, r9)
        L_0x003b:
            java.lang.String r9 = "createCodec:"
            java.lang.String r10 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x004c }
            int r11 = r10.length()     // Catch:{ all -> 0x004c }
            if (r11 == 0) goto L_0x004f
            java.lang.String r9 = r9.concat(r10)     // Catch:{ all -> 0x004c }
            goto L_0x0055
        L_0x004c:
            r0 = move-exception
            goto L_0x0263
        L_0x004f:
            java.lang.String r10 = new java.lang.String     // Catch:{ all -> 0x004c }
            r10.<init>(r9)     // Catch:{ all -> 0x004c }
            r9 = r10
        L_0x0055:
            defpackage.xs7.e(r9)     // Catch:{ all -> 0x004c }
            g28 r9 = r0.B0     // Catch:{ all -> 0x004c }
            i28 r8 = r9.g(r8)     // Catch:{ all -> 0x004c }
            r0.Y0 = r8     // Catch:{ all -> 0x004c }
            defpackage.xs7.l()
            long r8 = android.os.SystemClock.elapsedRealtime()
            r0.f1 = r1
            r0.c1 = r3
            vu5 r3 = r0.P0
            r0.Z0 = r3
            java.lang.String r10 = "OMX.Exynos.avc.dec.secure"
            r11 = 25
            r13 = 1
            if (r2 > r11) goto L_0x00a0
            boolean r14 = r10.equals(r4)
            if (r14 == 0) goto L_0x00a0
            java.lang.String r14 = defpackage.mze.d
            java.lang.String r15 = "SM-T585"
            boolean r15 = r14.startsWith(r15)
            if (r15 != 0) goto L_0x009e
            java.lang.String r15 = "SM-A510"
            boolean r15 = r14.startsWith(r15)
            if (r15 != 0) goto L_0x009e
            java.lang.String r15 = "SM-A520"
            boolean r15 = r14.startsWith(r15)
            if (r15 != 0) goto L_0x009e
            java.lang.String r15 = "SM-J700"
            boolean r14 = r14.startsWith(r15)
            if (r14 == 0) goto L_0x00a0
        L_0x009e:
            r14 = 2
            goto L_0x00d9
        L_0x00a0:
            r14 = 24
            if (r2 >= r14) goto L_0x00d8
            java.lang.String r14 = "OMX.Nvidia.h264.decode"
            boolean r14 = r14.equals(r4)
            if (r14 != 0) goto L_0x00b4
            java.lang.String r14 = "OMX.Nvidia.h264.decode.secure"
            boolean r14 = r14.equals(r4)
            if (r14 == 0) goto L_0x00d8
        L_0x00b4:
            java.lang.String r14 = defpackage.mze.b
            java.lang.String r15 = "flounder"
            boolean r15 = r15.equals(r14)
            if (r15 != 0) goto L_0x00d6
            java.lang.String r15 = "flounder_lte"
            boolean r15 = r15.equals(r14)
            if (r15 != 0) goto L_0x00d6
            java.lang.String r15 = "grouper"
            boolean r15 = r15.equals(r14)
            if (r15 != 0) goto L_0x00d6
            java.lang.String r15 = "tilapia"
            boolean r14 = r15.equals(r14)
            if (r14 == 0) goto L_0x00d8
        L_0x00d6:
            r14 = r13
            goto L_0x00d9
        L_0x00d8:
            r14 = 0
        L_0x00d9:
            r0.g1 = r14
            vu5 r14 = r0.Z0
            r15 = 21
            if (r2 >= r15) goto L_0x00f3
            java.util.List r14 = r14.C0
            boolean r14 = r14.isEmpty()
            if (r14 == 0) goto L_0x00f3
            java.lang.String r14 = "OMX.MTK.VIDEO.DECODER.AVC"
            boolean r14 = r14.equals(r4)
            if (r14 == 0) goto L_0x00f3
            r14 = r13
            goto L_0x00f4
        L_0x00f3:
            r14 = 0
        L_0x00f4:
            r0.h1 = r14
            r14 = 19
            r12 = 18
            if (r2 < r12) goto L_0x012b
            if (r2 != r12) goto L_0x010e
            java.lang.String r3 = "OMX.SEC.avc.dec"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x012b
            java.lang.String r3 = "OMX.SEC.avc.dec.secure"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x012b
        L_0x010e:
            if (r2 != r14) goto L_0x0129
            java.lang.String r3 = defpackage.mze.d
            java.lang.String r11 = "SM-G800"
            boolean r3 = r3.startsWith(r11)
            if (r3 == 0) goto L_0x0129
            java.lang.String r3 = "OMX.Exynos.avc.dec"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x012b
            boolean r3 = r10.equals(r4)
            if (r3 == 0) goto L_0x0129
            goto L_0x012b
        L_0x0129:
            r3 = 0
            goto L_0x012c
        L_0x012b:
            r3 = r13
        L_0x012c:
            r0.i1 = r3
            r3 = 29
            if (r2 != r3) goto L_0x013c
            java.lang.String r10 = "c2.android.aac.decoder"
            boolean r10 = r10.equals(r4)
            if (r10 == 0) goto L_0x013c
            r10 = r13
            goto L_0x013d
        L_0x013c:
            r10 = 0
        L_0x013d:
            r0.j1 = r10
            if (r2 > r5) goto L_0x0149
            java.lang.String r5 = "OMX.google.vorbis.decoder"
            boolean r5 = r5.equals(r4)
            if (r5 != 0) goto L_0x016d
        L_0x0149:
            if (r2 > r14) goto L_0x016f
            java.lang.String r5 = defpackage.mze.b
            java.lang.String r10 = "hb2000"
            boolean r10 = r10.equals(r5)
            if (r10 != 0) goto L_0x015d
            java.lang.String r10 = "stvm8"
            boolean r5 = r10.equals(r5)
            if (r5 == 0) goto L_0x016f
        L_0x015d:
            java.lang.String r5 = "OMX.amlogic.avc.decoder.awesome"
            boolean r5 = r5.equals(r4)
            if (r5 != 0) goto L_0x016d
            java.lang.String r5 = "OMX.amlogic.avc.decoder.awesome.secure"
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L_0x016f
        L_0x016d:
            r5 = r13
            goto L_0x0170
        L_0x016f:
            r5 = 0
        L_0x0170:
            r0.k1 = r5
            if (r2 != r15) goto L_0x017e
            java.lang.String r5 = "OMX.google.aac.decoder"
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L_0x017e
            r5 = r13
            goto L_0x017f
        L_0x017e:
            r5 = 0
        L_0x017f:
            r0.l1 = r5
            if (r2 >= r15) goto L_0x01c9
            java.lang.String r5 = "OMX.SEC.mp3.dec"
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L_0x01c9
            java.lang.String r5 = "samsung"
            java.lang.String r10 = defpackage.mze.c
            boolean r5 = r5.equals(r10)
            if (r5 == 0) goto L_0x01c9
            java.lang.String r5 = defpackage.mze.b
            java.lang.String r10 = "baffin"
            boolean r10 = r5.startsWith(r10)
            if (r10 != 0) goto L_0x01c7
            java.lang.String r10 = "grand"
            boolean r10 = r5.startsWith(r10)
            if (r10 != 0) goto L_0x01c7
            java.lang.String r10 = "fortuna"
            boolean r10 = r5.startsWith(r10)
            if (r10 != 0) goto L_0x01c7
            java.lang.String r10 = "gprimelte"
            boolean r10 = r5.startsWith(r10)
            if (r10 != 0) goto L_0x01c7
            java.lang.String r10 = "j2y18lte"
            boolean r10 = r5.startsWith(r10)
            if (r10 != 0) goto L_0x01c7
            java.lang.String r10 = "ms01"
            boolean r5 = r5.startsWith(r10)
            if (r5 == 0) goto L_0x01c9
        L_0x01c7:
            r5 = r13
            goto L_0x01ca
        L_0x01c9:
            r5 = 0
        L_0x01ca:
            r0.m1 = r5
            vu5 r5 = r0.Z0
            if (r2 > r12) goto L_0x01de
            int r5 = r5.N0
            if (r5 != r13) goto L_0x01de
            java.lang.String r5 = "OMX.MTK.AUDIO.DECODER.MP3"
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L_0x01de
            r5 = r13
            goto L_0x01df
        L_0x01de:
            r5 = 0
        L_0x01df:
            r0.n1 = r5
            java.lang.String r5 = r1.a
            r10 = 25
            if (r2 > r10) goto L_0x01ef
            java.lang.String r10 = "OMX.rk.video_decoder.avc"
            boolean r10 = r10.equals(r5)
            if (r10 != 0) goto L_0x022c
        L_0x01ef:
            r10 = 17
            if (r2 > r10) goto L_0x01fb
            java.lang.String r10 = "OMX.allwinner.video.decoder.avc"
            boolean r10 = r10.equals(r5)
            if (r10 != 0) goto L_0x022c
        L_0x01fb:
            if (r2 > r3) goto L_0x020d
            java.lang.String r2 = "OMX.broadcom.video_decoder.tunnel"
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L_0x022c
            java.lang.String r2 = "OMX.broadcom.video_decoder.tunnel.secure"
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L_0x022c
        L_0x020d:
            java.lang.String r2 = "Amazon"
            java.lang.String r3 = defpackage.mze.c
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0226
            java.lang.String r2 = "AFTS"
            java.lang.String r3 = defpackage.mze.d
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0226
            boolean r1 = r1.f
            if (r1 == 0) goto L_0x0226
            goto L_0x022c
        L_0x0226:
            boolean r1 = r16.M()
            if (r1 == 0) goto L_0x022e
        L_0x022c:
            r12 = r13
            goto L_0x022f
        L_0x022e:
            r12 = 0
        L_0x022f:
            r0.q1 = r12
            i28 r1 = r0.Y0
            r1.getClass()
            java.lang.String r1 = "c2.android.mp3.decoder"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x0245
            xu0 r1 = new xu0
            r1.<init>()
            r0.r1 = r1
        L_0x0245:
            int r1 = r0.Y
            r2 = 2
            if (r1 != r2) goto L_0x0253
            long r1 = android.os.SystemClock.elapsedRealtime()
            r10 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 + r10
            r0.s1 = r1
        L_0x0253:
            l24 r1 = r0.P1
            int r2 = r1.b
            int r2 = r2 + r13
            r1.b = r2
            long r5 = r8 - r6
            r1 = r16
            r2 = r8
            r1.W(r2, r4, r5)
            return
        L_0x0263:
            defpackage.xs7.l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w28.S(o28, android.media.MediaCrypto):void");
    }

    public final void T() {
        vu5 vu5;
        if (this.Y0 == null && !this.y1 && (vu5 = this.P0) != null) {
            if (this.S0 != null || !m0(vu5)) {
                k0(this.S0);
                String str = this.P0.A0;
                yn4 yn4 = this.R0;
                if (yn4 != null) {
                    if (this.T0 == null) {
                        iz5 P = P(yn4);
                        if (P != null) {
                            try {
                                MediaCrypto mediaCrypto = new MediaCrypto(P.a, P.b);
                                this.T0 = mediaCrypto;
                                this.U0 = !P.c && mediaCrypto.requiresSecureDecoderComponent(str);
                            } catch (MediaCryptoException e) {
                                throw f(e, this.P0, false, 6006);
                            }
                        } else if (this.R0.d() == null) {
                            return;
                        }
                    }
                    if (iz5.d) {
                        int state = this.R0.getState();
                        if (state == 1) {
                            DrmSession$DrmSessionException d = this.R0.d();
                            d.getClass();
                            throw f(d, this.P0, false, d.a);
                        } else if (state != 4) {
                            return;
                        }
                    }
                }
                try {
                    U(this.T0, this.U0);
                } catch (MediaCodecRenderer$DecoderInitializationException e2) {
                    throw f(e2, this.P0, false, 4001);
                }
            } else {
                vu5 vu52 = this.P0;
                F();
                String str2 = vu52.A0;
                boolean equals = "audio/mp4a-latm".equals(str2);
                yj0 yj0 = this.I0;
                if (equals || "audio/mpeg".equals(str2) || "audio/opus".equals(str2)) {
                    yj0.getClass();
                    yj0.A0 = 32;
                } else {
                    yj0.getClass();
                    yj0.A0 = 1;
                }
                this.y1 = true;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: o28} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void U(android.media.MediaCrypto r12, boolean r13) {
        /*
            r11 = this;
            java.util.ArrayDeque r0 = r11.d1
            r1 = 0
            if (r0 != 0) goto L_0x003a
            java.util.List r0 = r11.L(r13)     // Catch:{ MediaCodecUtil$DecoderQueryException -> 0x0018 }
            java.util.ArrayDeque r2 = new java.util.ArrayDeque     // Catch:{ MediaCodecUtil$DecoderQueryException -> 0x0018 }
            r2.<init>()     // Catch:{ MediaCodecUtil$DecoderQueryException -> 0x0018 }
            r11.d1 = r2     // Catch:{ MediaCodecUtil$DecoderQueryException -> 0x0018 }
            boolean r3 = r11.D0     // Catch:{ MediaCodecUtil$DecoderQueryException -> 0x0018 }
            if (r3 == 0) goto L_0x001a
            r2.addAll(r0)     // Catch:{ MediaCodecUtil$DecoderQueryException -> 0x0018 }
            goto L_0x002c
        L_0x0018:
            r12 = move-exception
            goto L_0x002f
        L_0x001a:
            boolean r2 = r0.isEmpty()     // Catch:{ MediaCodecUtil$DecoderQueryException -> 0x0018 }
            if (r2 != 0) goto L_0x002c
            java.util.ArrayDeque r2 = r11.d1     // Catch:{ MediaCodecUtil$DecoderQueryException -> 0x0018 }
            r3 = 0
            java.lang.Object r0 = r0.get(r3)     // Catch:{ MediaCodecUtil$DecoderQueryException -> 0x0018 }
            o28 r0 = (defpackage.o28) r0     // Catch:{ MediaCodecUtil$DecoderQueryException -> 0x0018 }
            r2.add(r0)     // Catch:{ MediaCodecUtil$DecoderQueryException -> 0x0018 }
        L_0x002c:
            r11.e1 = r1     // Catch:{ MediaCodecUtil$DecoderQueryException -> 0x0018 }
            goto L_0x003a
        L_0x002f:
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException r0 = new com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException
            vu5 r11 = r11.P0
            r1 = -49998(0xffffffffffff3cb2, float:NaN)
            r0.<init>(r11, r12, r13, r1)
            throw r0
        L_0x003a:
            java.util.ArrayDeque r0 = r11.d1
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0112
            java.util.ArrayDeque r0 = r11.d1
            java.lang.Object r0 = r0.peekFirst()
            o28 r0 = (defpackage.o28) r0
        L_0x004a:
            i28 r2 = r11.Y0
            if (r2 != 0) goto L_0x010f
            java.util.ArrayDeque r2 = r11.d1
            java.lang.Object r2 = r2.peekFirst()
            r8 = r2
            o28 r8 = (defpackage.o28) r8
            boolean r2 = r11.l0(r8)
            if (r2 != 0) goto L_0x005e
            return
        L_0x005e:
            r11.S(r8, r12)     // Catch:{ Exception -> 0x0062 }
            goto L_0x004a
        L_0x0062:
            r2 = move-exception
            if (r8 != r0) goto L_0x0071
            r2 = 50
            java.lang.Thread.sleep(r2)     // Catch:{ Exception -> 0x006e }
            r11.S(r8, r12)     // Catch:{ Exception -> 0x006e }
            goto L_0x004a
        L_0x006e:
            r2 = move-exception
            r5 = r2
            goto L_0x0072
        L_0x0071:
            throw r2     // Catch:{ Exception -> 0x006e }
        L_0x0072:
            java.lang.String r2 = java.lang.String.valueOf(r8)
            int r3 = r2.length()
            int r3 = r3 + 30
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            java.lang.String r3 = "Failed to initialize decoder: "
            r4.append(r3)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            defpackage.oyb.b(r2, r5)
            java.util.ArrayDeque r2 = r11.d1
            r2.removeFirst()
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException r2 = new com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException
            vu5 r3 = r11.P0
            java.lang.String r4 = r8.a
            java.lang.String r6 = java.lang.String.valueOf(r3)
            r7 = 23
            int r7 = me4.e(r7, r4)
            int r9 = r6.length()
            int r9 = r9 + r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r9)
            java.lang.String r9 = "Decoder init failed: "
            r7.append(r9)
            r7.append(r4)
            java.lang.String r4 = ", "
            r7.append(r4)
            r7.append(r6)
            java.lang.String r4 = r7.toString()
            java.lang.String r6 = r3.A0
            int r3 = defpackage.mze.a
            r7 = 21
            if (r3 < r7) goto L_0x00da
            boolean r3 = r5 instanceof android.media.MediaCodec.CodecException
            if (r3 == 0) goto L_0x00d7
            r3 = r5
            android.media.MediaCodec$CodecException r3 = (android.media.MediaCodec.CodecException) r3
            java.lang.String r3 = r3.getDiagnosticInfo()
            goto L_0x00d8
        L_0x00d7:
            r3 = r1
        L_0x00d8:
            r9 = r3
            goto L_0x00db
        L_0x00da:
            r9 = r1
        L_0x00db:
            r3 = r2
            r7 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r11.V(r2)
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException r3 = r11.e1
            if (r3 != 0) goto L_0x00ea
            r11.e1 = r2
            goto L_0x0102
        L_0x00ea:
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException r2 = new com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException
            java.lang.String r5 = r3.getMessage()
            java.lang.Throwable r6 = r3.getCause()
            java.lang.String r7 = r3.a
            boolean r8 = r3.b
            o28 r9 = r3.c
            java.lang.String r10 = r3.o
            r4 = r2
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r11.e1 = r2
        L_0x0102:
            java.util.ArrayDeque r2 = r11.d1
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x010c
            goto L_0x004a
        L_0x010c:
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException r11 = r11.e1
            throw r11
        L_0x010f:
            r11.d1 = r1
            return
        L_0x0112:
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException r12 = new com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException
            vu5 r11 = r11.P0
            r0 = -49999(0xffffffffffff3cb1, float:NaN)
            r12.<init>(r11, r1, r13, r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w28.U(android.media.MediaCrypto, boolean):void");
    }

    public abstract void V(Exception exc);

    public abstract void W(long j, String str, long j2);

    public abstract void X(String str);

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007f, code lost:
        if (r13 != false) goto L_0x0140;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00bb, code lost:
        if (G() == false) goto L_0x0128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00ee, code lost:
        if (G() == false) goto L_0x0128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0100, code lost:
        if (G() == false) goto L_0x0128;
     */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x013f A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.p24 Y(defpackage.otf r13) {
        /*
            r12 = this;
            r0 = 1
            r12.M1 = r0
            java.lang.Object r1 = r13.b
            r5 = r1
            vu5 r5 = (defpackage.vu5) r5
            r5.getClass()
            r1 = 0
            java.lang.String r2 = r5.A0
            if (r2 == 0) goto L_0x015d
            java.lang.Object r13 = r13.a
            yn4 r13 = (defpackage.yn4) r13
            yn4 r3 = r12.S0
            r4 = 0
            if (r3 != r13) goto L_0x001a
            goto L_0x0024
        L_0x001a:
            if (r13 == 0) goto L_0x001f
            r13.g(r4)
        L_0x001f:
            if (r3 == 0) goto L_0x0024
            r3.f(r4)
        L_0x0024:
            r12.S0 = r13
            r12.P0 = r5
            boolean r3 = r12.y1
            if (r3 == 0) goto L_0x002f
            r12.A1 = r0
            return r4
        L_0x002f:
            i28 r3 = r12.Y0
            if (r3 != 0) goto L_0x0039
            r12.d1 = r4
            r12.T()
            return r4
        L_0x0039:
            o28 r4 = r12.f1
            vu5 r6 = r12.Z0
            yn4 r7 = r12.R0
            r8 = 3
            r9 = 23
            if (r7 != r13) goto L_0x0045
            goto L_0x0083
        L_0x0045:
            if (r13 == 0) goto L_0x0140
            if (r7 != 0) goto L_0x004b
            goto L_0x0140
        L_0x004b:
            int r10 = defpackage.mze.a
            if (r10 >= r9) goto L_0x0051
            goto L_0x0140
        L_0x0051:
            java.util.UUID r10 = defpackage.vu0.e
            java.util.UUID r7 = r7.a()
            boolean r7 = r10.equals(r7)
            if (r7 != 0) goto L_0x0140
            java.util.UUID r7 = r13.a()
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L_0x0069
            goto L_0x0140
        L_0x0069:
            iz5 r7 = r12.P(r13)
            if (r7 != 0) goto L_0x0071
            goto L_0x0140
        L_0x0071:
            boolean r7 = r7.c
            if (r7 == 0) goto L_0x0077
            r13 = r1
            goto L_0x007b
        L_0x0077:
            boolean r13 = r13.c(r2)
        L_0x007b:
            boolean r2 = r4.f
            if (r2 != 0) goto L_0x0083
            if (r13 == 0) goto L_0x0083
            goto L_0x0140
        L_0x0083:
            yn4 r13 = r12.S0
            yn4 r2 = r12.R0
            if (r13 == r2) goto L_0x008b
            r13 = r0
            goto L_0x008c
        L_0x008b:
            r13 = r1
        L_0x008c:
            if (r13 == 0) goto L_0x0095
            int r2 = defpackage.mze.a
            if (r2 < r9) goto L_0x0093
            goto L_0x0095
        L_0x0093:
            r2 = r1
            goto L_0x0096
        L_0x0095:
            r2 = r0
        L_0x0096:
            swb.h(r2)
            p24 r2 = r12.D(r4, r6, r5)
            int r7 = r2.d
            if (r7 == 0) goto L_0x0118
            r9 = 16
            r10 = 2
            if (r7 == r0) goto L_0x00f1
            if (r7 == r10) goto L_0x00c5
            if (r7 != r8) goto L_0x00bf
            boolean r0 = r12.o0(r5)
            if (r0 != 0) goto L_0x00b3
        L_0x00b0:
            r10 = r9
            goto L_0x0128
        L_0x00b3:
            r12.Z0 = r5
            if (r13 == 0) goto L_0x0127
            boolean r13 = r12.G()
            if (r13 != 0) goto L_0x0127
            goto L_0x0128
        L_0x00bf:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            r12.<init>()
            throw r12
        L_0x00c5:
            boolean r11 = r12.o0(r5)
            if (r11 != 0) goto L_0x00cc
            goto L_0x00b0
        L_0x00cc:
            r12.B1 = r0
            r12.C1 = r0
            int r9 = r12.g1
            if (r9 == r10) goto L_0x00e4
            if (r9 != r0) goto L_0x00e3
            int r9 = r6.F0
            int r11 = r5.F0
            if (r11 != r9) goto L_0x00e3
            int r9 = r5.G0
            int r11 = r6.G0
            if (r9 != r11) goto L_0x00e3
            goto L_0x00e4
        L_0x00e3:
            r0 = r1
        L_0x00e4:
            r12.o1 = r0
            r12.Z0 = r5
            if (r13 == 0) goto L_0x0127
            boolean r13 = r12.G()
            if (r13 != 0) goto L_0x0127
            goto L_0x0128
        L_0x00f1:
            boolean r11 = r12.o0(r5)
            if (r11 != 0) goto L_0x00f8
            goto L_0x00b0
        L_0x00f8:
            r12.Z0 = r5
            if (r13 == 0) goto L_0x0103
            boolean r13 = r12.G()
            if (r13 != 0) goto L_0x0127
            goto L_0x0128
        L_0x0103:
            boolean r13 = r12.F1
            if (r13 == 0) goto L_0x0127
            r12.D1 = r0
            boolean r13 = r12.i1
            if (r13 != 0) goto L_0x0115
            boolean r13 = r12.k1
            if (r13 == 0) goto L_0x0112
            goto L_0x0115
        L_0x0112:
            r12.E1 = r0
            goto L_0x0127
        L_0x0115:
            r12.E1 = r8
            goto L_0x0128
        L_0x0118:
            boolean r13 = r12.F1
            if (r13 == 0) goto L_0x0121
            r12.D1 = r0
            r12.E1 = r8
            goto L_0x0127
        L_0x0121:
            r12.g0()
            r12.T()
        L_0x0127:
            r10 = r1
        L_0x0128:
            if (r7 == 0) goto L_0x013f
            i28 r13 = r12.Y0
            if (r13 != r3) goto L_0x0132
            int r12 = r12.E1
            if (r12 != r8) goto L_0x013f
        L_0x0132:
            p24 r12 = new p24
            java.lang.String r3 = r4.a
            r13 = 0
            r2 = r12
            r4 = r6
            r6 = r13
            r7 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            return r12
        L_0x013f:
            return r2
        L_0x0140:
            boolean r13 = r12.F1
            if (r13 == 0) goto L_0x0149
            r12.D1 = r0
            r12.E1 = r8
            goto L_0x014f
        L_0x0149:
            r12.g0()
            r12.T()
        L_0x014f:
            p24 r12 = new p24
            java.lang.String r3 = r4.a
            r13 = 0
            r7 = 128(0x80, float:1.794E-43)
            r2 = r12
            r4 = r6
            r6 = r13
            r2.<init>(r3, r4, r5, r6, r7)
            return r12
        L_0x015d:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>()
            r0 = 4005(0xfa5, float:5.612E-42)
            com.google.android.exoplayer2.ExoPlaybackException r12 = r12.f(r13, r5, r1, r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w28.Y(otf):p24");
    }

    public abstract void Z(vu5 vu5, MediaFormat mediaFormat);

    public void a0(long j) {
        while (true) {
            int i = this.S1;
            if (i != 0) {
                long[] jArr = this.O0;
                if (j >= jArr[0]) {
                    long[] jArr2 = this.M0;
                    this.Q1 = jArr2[0];
                    long[] jArr3 = this.N0;
                    this.R1 = jArr3[0];
                    int i2 = i - 1;
                    this.S1 = i2;
                    System.arraycopy(jArr2, 1, jArr2, 0, i2);
                    System.arraycopy(jArr3, 1, jArr3, 0, this.S1);
                    System.arraycopy(jArr, 1, jArr, 0, this.S1);
                    b0();
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public abstract void b0();

    public abstract void c0(m24 m24);

    public final void d0() {
        int i = this.E1;
        if (i == 1) {
            J();
        } else if (i == 2) {
            J();
            p0();
        } else if (i != 3) {
            this.L1 = true;
            h0();
        } else {
            g0();
            T();
        }
    }

    public abstract boolean e0(long j, long j2, i28 i28, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, vu5 vu5);

    public final boolean f0(int i) {
        otf otf = this.b;
        otf.w();
        m24 m24 = this.F0;
        m24.v();
        int v = v(otf, m24, i | 4);
        if (v == -5) {
            Y(otf);
            return true;
        } else if (v != -4 || !m24.f(4)) {
            return false;
        } else {
            this.K1 = true;
            d0();
            return false;
        }
    }

    public final void g0() {
        try {
            i28 i28 = this.Y0;
            if (i28 != null) {
                i28.release();
                this.P1.c++;
                X(this.f1.a);
            }
            this.Y0 = null;
            try {
                MediaCrypto mediaCrypto = this.T0;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
                this.T0 = null;
                k0((yn4) null);
                j0();
            }
        } catch (Throwable th) {
            this.Y0 = null;
            MediaCrypto mediaCrypto2 = this.T0;
            if (mediaCrypto2 != null) {
                mediaCrypto2.release();
            }
            throw th;
        } finally {
            this.T0 = null;
            k0((yn4) null);
            j0();
        }
    }

    public void h0() {
    }

    public void i0() {
        this.t1 = -1;
        this.G0.o = null;
        this.u1 = -1;
        this.v1 = null;
        this.s1 = -9223372036854775807L;
        this.G1 = false;
        this.F1 = false;
        this.o1 = false;
        this.p1 = false;
        this.w1 = false;
        this.x1 = false;
        this.K0.clear();
        this.I1 = -9223372036854775807L;
        this.J1 = -9223372036854775807L;
        xu0 xu0 = this.r1;
        if (xu0 != null) {
            xu0.b = 0;
            xu0.c = 0;
            xu0.a = false;
        }
        this.D1 = 0;
        this.E1 = 0;
        this.C1 = this.B1 ? 1 : 0;
    }

    public final void j0() {
        i0();
        this.O1 = null;
        this.r1 = null;
        this.d1 = null;
        this.f1 = null;
        this.Z0 = null;
        this.a1 = null;
        this.b1 = false;
        this.H1 = false;
        this.c1 = -1.0f;
        this.g1 = 0;
        this.h1 = false;
        this.i1 = false;
        this.j1 = false;
        this.k1 = false;
        this.l1 = false;
        this.m1 = false;
        this.n1 = false;
        this.q1 = false;
        this.B1 = false;
        this.C1 = 0;
        this.U0 = false;
    }

    public final void k0(yn4 yn4) {
        yn4 yn42 = this.R0;
        if (yn42 != yn4) {
            if (yn4 != null) {
                yn4.g((eo4) null);
            }
            if (yn42 != null) {
                yn42.f((eo4) null);
            }
        }
        this.R0 = yn4;
    }

    public boolean l0(o28 o28) {
        return true;
    }

    public boolean m() {
        return this.L1;
    }

    public boolean m0(vu5 vu5) {
        return false;
    }

    public boolean n() {
        boolean z;
        if (this.P0 == null) {
            return false;
        }
        if (l()) {
            z = this.z0;
        } else {
            xjc xjc = this.Z;
            xjc.getClass();
            z = xjc.d();
        }
        if (!z) {
            if (!(this.u1 >= 0) && (this.s1 == -9223372036854775807L || SystemClock.elapsedRealtime() >= this.s1)) {
                return false;
            }
        }
        return true;
    }

    public abstract int n0(pv0 pv0, vu5 vu5);

    public final boolean o0(vu5 vu5) {
        if (!(mze.a < 23 || this.Y0 == null || this.E1 == 3 || this.Y == 0)) {
            float f = this.X0;
            vu5[] vu5Arr = this.w0;
            vu5Arr.getClass();
            float N = N(f, vu5Arr);
            float f2 = this.c1;
            if (f2 == N) {
                return true;
            }
            if (N == -1.0f) {
                if (this.F1) {
                    this.D1 = 1;
                    this.E1 = 3;
                    return false;
                }
                g0();
                T();
                return false;
            } else if (f2 == -1.0f && N <= this.E0) {
                return true;
            } else {
                Bundle bundle = new Bundle();
                bundle.putFloat("operating-rate", N);
                this.Y0.setParameters(bundle);
                this.c1 = N;
            }
        }
        return true;
    }

    public final void p0() {
        try {
            this.T0.setMediaDrmSession(P(this.S0).b);
            k0(this.S0);
            this.D1 = 0;
            this.E1 = 0;
        } catch (MediaCryptoException e) {
            throw f(e, this.P0, false, 6006);
        }
    }

    public void q(long j, boolean z) {
        int i;
        this.K1 = false;
        this.L1 = false;
        this.N1 = false;
        if (this.y1) {
            this.I0.v();
            this.H0.v();
            this.z1 = false;
        } else if (K()) {
            T();
        }
        mje mje = this.J0;
        synchronized (mje) {
            i = mje.e;
        }
        if (i > 0) {
            this.M1 = true;
        }
        this.J0.b();
        int i2 = this.S1;
        if (i2 != 0) {
            int i3 = i2 - 1;
            this.R1 = this.N0[i3];
            this.Q1 = this.M0[i3];
            this.S1 = 0;
        }
    }

    public final void q0(long j) {
        Object d;
        Object g;
        mje mje = this.J0;
        synchronized (mje) {
            d = mje.d(j, true);
        }
        vu5 vu5 = (vu5) d;
        if (vu5 == null && this.b1) {
            mje mje2 = this.J0;
            synchronized (mje2) {
                g = mje2.e == 0 ? null : mje2.g();
            }
            vu5 = (vu5) g;
        }
        if (vu5 != null) {
            this.Q0 = vu5;
        } else if (!this.b1 || this.Q0 == null) {
            return;
        }
        Z(this.Q0, this.a1);
        this.b1 = false;
    }

    public final void u(vu5[] vu5Arr, long j, long j2) {
        boolean z = true;
        if (this.R1 == -9223372036854775807L) {
            if (this.Q1 != -9223372036854775807L) {
                z = false;
            }
            swb.h(z);
            this.Q1 = j;
            this.R1 = j2;
            return;
        }
        int i = this.S1;
        long[] jArr = this.N0;
        if (i == jArr.length) {
            long j3 = jArr[i - 1];
        } else {
            this.S1 = i + 1;
        }
        int i2 = this.S1 - 1;
        this.M0[i2] = j;
        jArr[i2] = j2;
        this.O0[i2] = this.I1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x006b A[Catch:{ IllegalStateException -> 0x0017 }, LOOP:1: B:28:0x004b->B:38:0x006b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0087 A[Catch:{ IllegalStateException -> 0x0017 }, LOOP:2: B:39:0x006c->B:49:0x0087, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x006c A[EDGE_INSN: B:81:0x006c->B:84:0x006c ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0088 A[EDGE_INSN: B:83:0x0088->B:50:0x0088 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void w(long r12, long r14) {
        /*
            r11 = this;
            boolean r0 = r11.N1
            r1 = 0
            if (r0 == 0) goto L_0x000a
            r11.N1 = r1
            r11.d0()
        L_0x000a:
            com.google.android.exoplayer2.ExoPlaybackException r0 = r11.O1
            if (r0 != 0) goto L_0x00f1
            r0 = 1
            boolean r2 = r11.L1     // Catch:{ IllegalStateException -> 0x0017 }
            if (r2 == 0) goto L_0x001a
            r11.h0()     // Catch:{ IllegalStateException -> 0x0017 }
            return
        L_0x0017:
            r12 = move-exception
            goto L_0x00a7
        L_0x001a:
            vu5 r2 = r11.P0     // Catch:{ IllegalStateException -> 0x0017 }
            if (r2 != 0) goto L_0x0026
            r2 = 2
            boolean r2 = r11.f0(r2)     // Catch:{ IllegalStateException -> 0x0017 }
            if (r2 != 0) goto L_0x0026
            return
        L_0x0026:
            r11.T()     // Catch:{ IllegalStateException -> 0x0017 }
            boolean r2 = r11.y1     // Catch:{ IllegalStateException -> 0x0017 }
            if (r2 == 0) goto L_0x003e
            java.lang.String r2 = "bypassRender"
            defpackage.xs7.e(r2)     // Catch:{ IllegalStateException -> 0x0017 }
        L_0x0032:
            boolean r2 = r11.C(r12, r14)     // Catch:{ IllegalStateException -> 0x0017 }
            if (r2 == 0) goto L_0x0039
            goto L_0x0032
        L_0x0039:
            defpackage.xs7.l()     // Catch:{ IllegalStateException -> 0x0017 }
            goto L_0x00a2
        L_0x003e:
            i28 r2 = r11.Y0     // Catch:{ IllegalStateException -> 0x0017 }
            if (r2 == 0) goto L_0x008c
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IllegalStateException -> 0x0017 }
            java.lang.String r4 = "drainAndFeed"
            defpackage.xs7.e(r4)     // Catch:{ IllegalStateException -> 0x0017 }
        L_0x004b:
            boolean r4 = r11.H(r12, r14)     // Catch:{ IllegalStateException -> 0x0017 }
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 == 0) goto L_0x006c
            long r7 = r11.V0     // Catch:{ IllegalStateException -> 0x0017 }
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 == 0) goto L_0x0068
            long r9 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IllegalStateException -> 0x0017 }
            long r9 = r9 - r2
            int r4 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r4 >= 0) goto L_0x0066
            goto L_0x0068
        L_0x0066:
            r4 = r1
            goto L_0x0069
        L_0x0068:
            r4 = r0
        L_0x0069:
            if (r4 == 0) goto L_0x006c
            goto L_0x004b
        L_0x006c:
            boolean r12 = r11.I()     // Catch:{ IllegalStateException -> 0x0017 }
            if (r12 == 0) goto L_0x0088
            long r12 = r11.V0     // Catch:{ IllegalStateException -> 0x0017 }
            int r14 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r14 == 0) goto L_0x0084
            long r14 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IllegalStateException -> 0x0017 }
            long r14 = r14 - r2
            int r12 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r12 >= 0) goto L_0x0082
            goto L_0x0084
        L_0x0082:
            r12 = r1
            goto L_0x0085
        L_0x0084:
            r12 = r0
        L_0x0085:
            if (r12 == 0) goto L_0x0088
            goto L_0x006c
        L_0x0088:
            defpackage.xs7.l()     // Catch:{ IllegalStateException -> 0x0017 }
            goto L_0x00a2
        L_0x008c:
            l24 r14 = r11.P1     // Catch:{ IllegalStateException -> 0x0017 }
            int r15 = r14.e     // Catch:{ IllegalStateException -> 0x0017 }
            xjc r2 = r11.Z     // Catch:{ IllegalStateException -> 0x0017 }
            r2.getClass()     // Catch:{ IllegalStateException -> 0x0017 }
            long r3 = r11.x0     // Catch:{ IllegalStateException -> 0x0017 }
            long r12 = r12 - r3
            int r12 = r2.e(r12)     // Catch:{ IllegalStateException -> 0x0017 }
            int r15 = r15 + r12
            r14.e = r15     // Catch:{ IllegalStateException -> 0x0017 }
            r11.f0(r0)     // Catch:{ IllegalStateException -> 0x0017 }
        L_0x00a2:
            l24 r12 = r11.P1     // Catch:{ IllegalStateException -> 0x0017 }
            monitor-enter(r12)     // Catch:{ IllegalStateException -> 0x0017 }
            monitor-exit(r12)     // Catch:{ IllegalStateException -> 0x0017 }
            return
        L_0x00a7:
            int r13 = defpackage.mze.a
            r14 = 21
            if (r13 < r14) goto L_0x00b2
            boolean r15 = r12 instanceof android.media.MediaCodec.CodecException
            if (r15 == 0) goto L_0x00b2
            goto L_0x00c7
        L_0x00b2:
            java.lang.StackTraceElement[] r15 = r12.getStackTrace()
            int r2 = r15.length
            if (r2 <= 0) goto L_0x00f0
            r15 = r15[r1]
            java.lang.String r15 = r15.getClassName()
            java.lang.String r2 = "android.media.MediaCodec"
            boolean r15 = r15.equals(r2)
            if (r15 == 0) goto L_0x00f0
        L_0x00c7:
            r11.V(r12)
            if (r13 < r14) goto L_0x00dc
            boolean r13 = r12 instanceof android.media.MediaCodec.CodecException
            if (r13 == 0) goto L_0x00d8
            r13 = r12
            android.media.MediaCodec$CodecException r13 = (android.media.MediaCodec.CodecException) r13
            boolean r13 = r13.isRecoverable()
            goto L_0x00d9
        L_0x00d8:
            r13 = r1
        L_0x00d9:
            if (r13 == 0) goto L_0x00dc
            r1 = r0
        L_0x00dc:
            if (r1 == 0) goto L_0x00e1
            r11.g0()
        L_0x00e1:
            o28 r13 = r11.f1
            com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException r12 = r11.E(r12, r13)
            vu5 r13 = r11.P0
            r14 = 4003(0xfa3, float:5.61E-42)
            com.google.android.exoplayer2.ExoPlaybackException r11 = r11.f(r12, r13, r1, r14)
            throw r11
        L_0x00f0:
            throw r12
        L_0x00f1:
            r12 = 0
            r11.O1 = r12
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w28.w(long, long):void");
    }

    public void z(float f, float f2) {
        this.W0 = f;
        this.X0 = f2;
        o0(this.Z0);
    }
}
