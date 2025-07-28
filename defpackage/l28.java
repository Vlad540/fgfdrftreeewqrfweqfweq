package defpackage;

import android.content.Context;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.os.Handler;
import com.google.android.exoplayer2.audio.AudioSink$ConfigurationException;
import com.google.android.exoplayer2.audio.AudioSink$InitializationException;
import com.google.android.exoplayer2.audio.AudioSink$WriteException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: l28  reason: default package */
public final class l28 extends w28 implements c28 {
    public final Context U1;
    public final otf V1;
    public final b54 W1;
    public int X1;
    public boolean Y1;
    public vu5 Z1;
    public long a2;
    public boolean b2;
    public boolean c2;
    public boolean d2;
    public o45 e2;

    public l28(Context context, g28 g28, pv0 pv0, Handler handler, g45 g45, b54 b54) {
        super(1, g28, pv0, 44100.0f);
        this.U1 = context.getApplicationContext();
        this.W1 = b54;
        this.V1 = new otf(handler, g45);
        b54.r = new wwc(16, this);
    }

    public static ws6 s0(pv0 pv0, vu5 vu5, boolean z, b54 b54) {
        String str = vu5.A0;
        if (str == null) {
            po5 po5 = ws6.b;
            return e8c.X;
        }
        if (b54.g(vu5) != 0) {
            List e = f38.e("audio/raw", false, false);
            o28 o28 = e.isEmpty() ? null : (o28) e.get(0);
            if (o28 != null) {
                return ws6.n(o28);
            }
        }
        pv0.getClass();
        List e3 = f38.e(str, z, false);
        String b = f38.b(vu5);
        if (b == null) {
            return ws6.j(e3);
        }
        List e4 = f38.e(b, z, false);
        ts6 i = ws6.i();
        i.e(e3);
        i.e(e4);
        return i.j();
    }

    public final p24 D(o28 o28, vu5 vu5, vu5 vu52) {
        p24 b = o28.b(vu5, vu52);
        int r0 = r0(o28, vu52);
        int i = this.X1;
        int i2 = b.e;
        if (r0 > i) {
            i2 |= 64;
        }
        int i3 = i2;
        return new p24(o28.a, vu5, vu52, i3 != 0 ? 0 : b.d, i3);
    }

    public final float N(float f, vu5[] vu5Arr) {
        int i = -1;
        for (vu5 vu5 : vu5Arr) {
            int i2 = vu5.O0;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return ((float) i) * f;
    }

    public final ArrayList O(pv0 pv0, vu5 vu5, boolean z) {
        ws6 s0 = s0(pv0, vu5, z, this.W1);
        Pattern pattern = f38.a;
        ArrayList arrayList = new ArrayList(s0);
        Collections.sort(arrayList, new i63(3, new hy5(17, vu5)));
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00aa, code lost:
        if ("AXON 7 mini".equals(r2) == false) goto L_0x00ad;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0107  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.e28 Q(defpackage.o28 r12, defpackage.vu5 r13, android.media.MediaCrypto r14, float r15) {
        /*
            r11 = this;
            vu5[] r0 = r11.w0
            r0.getClass()
            int r1 = r11.r0(r12, r13)
            int r2 = r0.length
            r3 = 1
            r4 = 0
            if (r2 != r3) goto L_0x000f
            goto L_0x0028
        L_0x000f:
            int r2 = r0.length
            r5 = r4
        L_0x0011:
            if (r5 >= r2) goto L_0x0028
            r6 = r0[r5]
            p24 r7 = r12.b(r13, r6)
            int r7 = r7.d
            if (r7 == 0) goto L_0x0025
            int r6 = r11.r0(r12, r6)
            int r1 = java.lang.Math.max(r1, r6)
        L_0x0025:
            int r5 = r5 + 1
            goto L_0x0011
        L_0x0028:
            r11.X1 = r1
            int r0 = defpackage.mze.a
            r1 = 24
            if (r0 >= r1) goto L_0x0060
            java.lang.String r2 = "OMX.SEC.aac.dec"
            java.lang.String r5 = r12.a
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x0060
            java.lang.String r2 = "samsung"
            java.lang.String r5 = defpackage.mze.c
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x0060
            java.lang.String r2 = defpackage.mze.b
            java.lang.String r5 = "zeroflte"
            boolean r5 = r2.startsWith(r5)
            if (r5 != 0) goto L_0x005e
            java.lang.String r5 = "herolte"
            boolean r5 = r2.startsWith(r5)
            if (r5 != 0) goto L_0x005e
            java.lang.String r5 = "heroqlte"
            boolean r2 = r2.startsWith(r5)
            if (r2 == 0) goto L_0x0060
        L_0x005e:
            r2 = r3
            goto L_0x0061
        L_0x0060:
            r2 = r4
        L_0x0061:
            r11.Y1 = r2
            int r2 = r11.X1
            android.media.MediaFormat r7 = new android.media.MediaFormat
            r7.<init>()
            java.lang.String r5 = "mime"
            java.lang.String r6 = r12.c
            r7.setString(r5, r6)
            int r5 = r13.N0
            java.lang.String r6 = "channel-count"
            r7.setInteger(r6, r5)
            java.lang.String r5 = "sample-rate"
            int r6 = r13.O0
            r7.setInteger(r5, r6)
            java.util.List r5 = r13.C0
            defpackage.at7.R(r7, r5)
            java.lang.String r5 = "max-input-size"
            defpackage.at7.E(r7, r5, r2)
            r2 = 23
            if (r0 < r2) goto L_0x00b2
            java.lang.String r5 = "priority"
            r7.setInteger(r5, r4)
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r4 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r4 == 0) goto L_0x00b2
            if (r0 != r2) goto L_0x00ad
            java.lang.String r2 = defpackage.mze.d
            java.lang.String r4 = "ZTE B2017G"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L_0x00b2
            java.lang.String r4 = "AXON 7 mini"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x00ad
            goto L_0x00b2
        L_0x00ad:
            java.lang.String r2 = "operating-rate"
            r7.setFloat(r2, r15)
        L_0x00b2:
            r15 = 28
            java.lang.String r2 = r13.A0
            if (r0 > r15) goto L_0x00c5
            java.lang.String r15 = "audio/ac4"
            boolean r15 = r15.equals(r2)
            if (r15 == 0) goto L_0x00c5
            java.lang.String r15 = "ac4-is-sync"
            r7.setInteger(r15, r3)
        L_0x00c5:
            java.lang.String r15 = "audio/raw"
            if (r0 < r1) goto L_0x00ec
            tu5 r1 = new tu5
            r1.<init>()
            r1.k = r15
            int r3 = r13.N0
            r1.x = r3
            r1.y = r6
            r3 = 4
            r1.z = r3
            vu5 r4 = new vu5
            r4.<init>(r1)
            b54 r1 = r11.W1
            int r1 = r1.g(r4)
            r4 = 2
            if (r1 != r4) goto L_0x00ec
            java.lang.String r1 = "pcm-encoding"
            r7.setInteger(r1, r3)
        L_0x00ec:
            r1 = 32
            if (r0 < r1) goto L_0x00f7
            java.lang.String r0 = "max-output-channel-count"
            r1 = 99
            r7.setInteger(r0, r1)
        L_0x00f7:
            java.lang.String r0 = r12.b
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x0107
            boolean r15 = r15.equals(r2)
            if (r15 != 0) goto L_0x0107
            r15 = r13
            goto L_0x0108
        L_0x0107:
            r15 = 0
        L_0x0108:
            r11.Z1 = r15
            e28 r11 = new e28
            r9 = 0
            r5 = r11
            r6 = r12
            r8 = r13
            r10 = r14
            r5.<init>(r6, r7, r8, r9, r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l28.Q(o28, vu5, android.media.MediaCrypto, float):e28");
    }

    public final void V(Exception exc) {
        oyb.b("Audio codec error", exc);
        otf otf = this.V1;
        Handler handler = (Handler) otf.a;
        if (handler != null) {
            handler.post(new w50(otf, exc, 0));
        }
    }

    public final void W(long j, String str, long j2) {
        otf otf = this.V1;
        Handler handler = (Handler) otf.a;
        if (handler != null) {
            handler.post(new u50(otf, str, j, j2, 0));
        }
    }

    public final void X(String str) {
        otf otf = this.V1;
        Handler handler = (Handler) otf.a;
        if (handler != null) {
            handler.post(new c(otf, 6, str));
        }
    }

    public final p24 Y(otf otf) {
        p24 Y = super.Y(otf);
        vu5 vu5 = (vu5) otf.b;
        otf otf2 = this.V1;
        Handler handler = (Handler) otf2.a;
        if (handler != null) {
            handler.post(new g5(otf2, vu5, Y, 2));
        }
        return Y;
    }

    public final void Z(vu5 vu5, MediaFormat mediaFormat) {
        int i;
        vu5 vu52 = this.Z1;
        int[] iArr = null;
        if (vu52 != null) {
            vu5 = vu52;
        } else if (this.Y0 != null) {
            int u = "audio/raw".equals(vu5.A0) ? vu5.P0 : (mze.a < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? mze.u(mediaFormat.getInteger("v-bits-per-sample")) : 2 : mediaFormat.getInteger("pcm-encoding");
            tu5 tu5 = new tu5();
            tu5.k = "audio/raw";
            tu5.z = u;
            tu5.A = vu5.Q0;
            tu5.B = vu5.R0;
            tu5.x = mediaFormat.getInteger("channel-count");
            tu5.y = mediaFormat.getInteger("sample-rate");
            vu5 vu53 = new vu5(tu5);
            if (this.Y1 && vu53.N0 == 6 && (i = vu5.N0) < 6) {
                iArr = new int[i];
                for (int i2 = 0; i2 < i; i2++) {
                    iArr[i2] = i2;
                }
            }
            vu5 = vu53;
        }
        try {
            this.W1.b(vu5, iArr);
        } catch (AudioSink$ConfigurationException e) {
            throw f(e, e.a, false, 5001);
        }
    }

    public final void a(int i, Object obj) {
        b54 b54 = this.W1;
        if (i == 2) {
            float floatValue = ((Float) obj).floatValue();
            if (b54.J != floatValue) {
                b54.J = floatValue;
                if (b54.n()) {
                    if (mze.a >= 21) {
                        b54.u.setVolume(b54.J);
                        return;
                    }
                    AudioTrack audioTrack = b54.u;
                    float f = b54.J;
                    audioTrack.setStereoVolume(f, f);
                }
            }
        } else if (i == 3) {
            j20 j20 = (j20) obj;
            if (!b54.v.equals(j20)) {
                b54.v = j20;
                if (!b54.Y) {
                    b54.d();
                }
            }
        } else if (i != 6) {
            switch (i) {
                case 9:
                    b54.s(b54.h().a, ((Boolean) obj).booleanValue());
                    return;
                case 10:
                    int intValue = ((Integer) obj).intValue();
                    if (b54.W != intValue) {
                        b54.W = intValue;
                        b54.V = intValue != 0;
                        b54.d();
                        return;
                    }
                    return;
                case 11:
                    this.e2 = (o45) obj;
                    return;
                default:
                    return;
            }
        } else {
            pb0 pb0 = (pb0) obj;
            if (!b54.X.equals(pb0)) {
                pb0.getClass();
                if (b54.u != null) {
                    b54.X.getClass();
                }
                b54.X = pb0;
            }
        }
    }

    public final void b0() {
        this.W1.G = true;
    }

    public final void c0(m24 m24) {
        if (this.b2 && !m24.f(Integer.MIN_VALUE)) {
            if (Math.abs(m24.Y - this.a2) > 500000) {
                this.a2 = m24.Y;
            }
            this.b2 = false;
        }
    }

    public final vxa d() {
        b54 b54 = this.W1;
        return b54.k ? b54.y : b54.h().a;
    }

    public final long e() {
        if (this.Y == 2) {
            t0();
        }
        return this.a2;
    }

    public final boolean e0(long j, long j2, i28 i28, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, vu5 vu5) {
        byteBuffer.getClass();
        if (this.Z1 == null || (i2 & 2) == 0) {
            b54 b54 = this.W1;
            if (z) {
                if (i28 != null) {
                    i28.releaseOutputBuffer(i, false);
                }
                this.P1.g += i3;
                b54.G = true;
                return true;
            }
            try {
                if (!b54.k(byteBuffer, j3, i3)) {
                    return false;
                }
                if (i28 != null) {
                    i28.releaseOutputBuffer(i, false);
                }
                this.P1.f += i3;
                return true;
            } catch (AudioSink$InitializationException e) {
                throw f(e, e.b, e.a, 5001);
            } catch (AudioSink$WriteException e3) {
                throw f(e3, vu5, e3.a, 5002);
            }
        } else {
            i28.getClass();
            i28.releaseOutputBuffer(i, false);
            return true;
        }
    }

    public final void g(vxa vxa) {
        b54 b54 = this.W1;
        b54.getClass();
        vxa vxa2 = new vxa(mze.i(vxa.a, 0.1f, 8.0f), mze.i(vxa.b, 0.1f, 8.0f));
        if (!b54.k || mze.a < 23) {
            b54.s(vxa2, b54.h().b);
        } else {
            b54.t(vxa2);
        }
    }

    public final void h0() {
        try {
            b54 b54 = this.W1;
            if (!b54.S && b54.n() && b54.c()) {
                b54.p();
                b54.S = true;
            }
        } catch (AudioSink$WriteException e) {
            throw f(e, e.b, e.a, 5002);
        }
    }

    public final c28 j() {
        return this;
    }

    public final String k() {
        return "MediaCodecAudioRenderer";
    }

    public final boolean m() {
        if (this.L1) {
            b54 b54 = this.W1;
            if (!b54.n() || (b54.S && !b54.l())) {
                return true;
            }
        }
        return false;
    }

    public final boolean m0(vu5 vu5) {
        return this.W1.g(vu5) != 0;
    }

    public final boolean n() {
        return this.W1.l() || super.n();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004c, code lost:
        if ((r4.isEmpty() ? null : (defpackage.o28) r4.get(0)) != null) goto L_0x004e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int n0(defpackage.pv0 r11, defpackage.vu5 r12) {
        /*
            r10 = this;
            java.lang.String r0 = r12.A0
            boolean r0 = defpackage.b49.h(r0)
            r1 = 0
            if (r0 != 0) goto L_0x000e
            int r10 = defpackage.pi0.b(r1, r1, r1)
            return r10
        L_0x000e:
            int r0 = defpackage.mze.a
            r2 = 21
            if (r0 < r2) goto L_0x0017
            r0 = 32
            goto L_0x0018
        L_0x0017:
            r0 = r1
        L_0x0018:
            r2 = 1
            int r3 = r12.T0
            if (r3 == 0) goto L_0x001f
            r4 = r2
            goto L_0x0020
        L_0x001f:
            r4 = r1
        L_0x0020:
            r5 = 2
            if (r3 == 0) goto L_0x0028
            if (r3 != r5) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r3 = r1
            goto L_0x0029
        L_0x0028:
            r3 = r2
        L_0x0029:
            java.lang.String r6 = "audio/raw"
            r7 = 8
            r8 = 4
            b54 r10 = r10.W1
            if (r3 == 0) goto L_0x0053
            int r9 = r10.g(r12)
            if (r9 == 0) goto L_0x0053
            if (r4 == 0) goto L_0x004e
            java.util.List r4 = defpackage.f38.e(r6, r1, r1)
            boolean r9 = r4.isEmpty()
            if (r9 == 0) goto L_0x0046
            r4 = 0
            goto L_0x004c
        L_0x0046:
            java.lang.Object r4 = r4.get(r1)
            o28 r4 = (defpackage.o28) r4
        L_0x004c:
            if (r4 == 0) goto L_0x0053
        L_0x004e:
            int r10 = defpackage.pi0.b(r8, r7, r0)
            return r10
        L_0x0053:
            java.lang.String r4 = r12.A0
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L_0x0067
            int r4 = r10.g(r12)
            if (r4 == 0) goto L_0x0062
            goto L_0x0067
        L_0x0062:
            int r10 = defpackage.pi0.b(r2, r1, r1)
            return r10
        L_0x0067:
            tu5 r4 = new tu5
            r4.<init>()
            r4.k = r6
            int r6 = r12.N0
            r4.x = r6
            int r6 = r12.O0
            r4.y = r6
            r4.z = r5
            vu5 r6 = new vu5
            r6.<init>(r4)
            int r4 = r10.g(r6)
            if (r4 == 0) goto L_0x00e0
            ws6 r10 = s0(r11, r12, r1, r10)
            boolean r11 = r10.isEmpty()
            if (r11 == 0) goto L_0x0092
            int r10 = defpackage.pi0.b(r2, r1, r1)
            return r10
        L_0x0092:
            if (r3 != 0) goto L_0x0099
            int r10 = defpackage.pi0.b(r5, r1, r1)
            return r10
        L_0x0099:
            java.lang.Object r11 = r10.get(r1)
            o28 r11 = (defpackage.o28) r11
            boolean r3 = r11.c(r12)
            if (r3 != 0) goto L_0x00be
            r4 = r2
        L_0x00a6:
            int r5 = r10.size()
            if (r4 >= r5) goto L_0x00be
            java.lang.Object r5 = r10.get(r4)
            o28 r5 = (defpackage.o28) r5
            boolean r6 = r5.c(r12)
            if (r6 == 0) goto L_0x00bb
            r10 = r1
            r11 = r5
            goto L_0x00c0
        L_0x00bb:
            int r4 = r4 + 1
            goto L_0x00a6
        L_0x00be:
            r10 = r2
            r2 = r3
        L_0x00c0:
            if (r2 == 0) goto L_0x00c3
            goto L_0x00c4
        L_0x00c3:
            r8 = 3
        L_0x00c4:
            if (r2 == 0) goto L_0x00ce
            boolean r12 = r11.d(r12)
            if (r12 == 0) goto L_0x00ce
            r7 = 16
        L_0x00ce:
            boolean r11 = r11.g
            if (r11 == 0) goto L_0x00d5
            r11 = 64
            goto L_0x00d6
        L_0x00d5:
            r11 = r1
        L_0x00d6:
            if (r10 == 0) goto L_0x00da
            r1 = 128(0x80, float:1.794E-43)
        L_0x00da:
            r10 = r8 | r7
            r10 = r10 | r0
            r10 = r10 | r11
            r10 = r10 | r1
            return r10
        L_0x00e0:
            int r10 = defpackage.pi0.b(r2, r1, r1)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l28.n0(pv0, vu5):int");
    }

    public final void o() {
        otf otf = this.V1;
        this.d2 = true;
        try {
            this.W1.d();
            try {
                this.P0 = null;
                this.Q1 = -9223372036854775807L;
                this.R1 = -9223372036854775807L;
                this.S1 = 0;
                K();
            } finally {
                otf.z(this.P1);
            }
        } catch (Throwable th) {
            this.P0 = null;
            this.Q1 = -9223372036854775807L;
            this.R1 = -9223372036854775807L;
            this.S1 = 0;
            K();
            throw th;
        } finally {
            otf.z(this.P1);
        }
    }

    public final void p(boolean z, boolean z2) {
        l24 l24 = new l24(0);
        this.P1 = l24;
        otf otf = this.V1;
        Handler handler = (Handler) otf.a;
        if (handler != null) {
            handler.post(new x50(otf, l24, 0));
        }
        i9c i9c = this.c;
        i9c.getClass();
        boolean z3 = i9c.a;
        boolean z4 = false;
        b54 b54 = this.W1;
        if (z3) {
            b54.getClass();
            if (mze.a >= 21) {
                z4 = true;
            }
            swb.h(z4);
            swb.h(b54.V);
            if (!b54.Y) {
                b54.Y = true;
                b54.d();
            }
        } else if (b54.Y) {
            b54.Y = false;
            b54.d();
        }
        bza bza = this.X;
        bza.getClass();
        b54.q = bza;
    }

    public final void q(long j, boolean z) {
        super.q(j, z);
        this.W1.d();
        this.a2 = j;
        this.b2 = true;
        this.c2 = true;
    }

    public final void r() {
        b54 b54 = this.W1;
        try {
            F();
            g0();
            yn4 yn4 = this.S0;
            if (yn4 != null) {
                yn4.f((eo4) null);
            }
            this.S0 = null;
            if (this.d2) {
                this.d2 = false;
                b54.r();
            }
        } catch (Throwable th) {
            if (this.d2) {
                this.d2 = false;
                b54.r();
            }
            throw th;
        }
    }

    public final int r0(o28 o28, vu5 vu5) {
        int i;
        if (!"OMX.google.raw.decoder".equals(o28.a) || (i = mze.a) >= 24 || (i == 23 && mze.C(this.U1))) {
            return vu5.B0;
        }
        return -1;
    }

    public final void s() {
        b54 b54 = this.W1;
        b54.U = true;
        if (b54.n()) {
            l60 l60 = b54.i.f;
            l60.getClass();
            l60.a();
            b54.u.play();
        }
    }

    public final void t() {
        t0();
        b54 b54 = this.W1;
        b54.U = false;
        if (b54.n()) {
            m60 m60 = b54.i;
            m60.l = 0;
            m60.w = 0;
            m60.v = 0;
            m60.m = 0;
            m60.C = 0;
            m60.F = 0;
            m60.k = false;
            if (m60.x == -9223372036854775807L) {
                l60 l60 = m60.f;
                l60.getClass();
                l60.a();
                b54.u.pause();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x0217  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x023c  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x024f  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0269  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x02d0 A[LOOP:1: B:130:0x02bc->B:134:0x02d0, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x02d9 A[EDGE_INSN: B:158:0x02d9->B:135:0x02d9 ?: BREAK  
    EDGE_INSN: B:159:0x02d9->B:135:0x02d9 ?: BREAK  ] */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x02eb  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x02f1  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01c3 A[Catch:{ Exception -> 0x01c9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01e1  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01e6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void t0() {
        /*
            r32 = this;
            r0 = r32
            r1 = 1
            boolean r2 = r32.m()
            b54 r3 = r0.W1
            boolean r4 = r3.n()
            if (r4 == 0) goto L_0x0368
            boolean r4 = r3.H
            if (r4 == 0) goto L_0x0015
            goto L_0x0368
        L_0x0015:
            m60 r4 = r3.i
            android.media.AudioTrack r8 = r4.c
            r8.getClass()
            int r8 = r8.getPlayState()
            r13 = 1000(0x3e8, double:4.94E-321)
            r15 = 1000000(0xf4240, double:4.940656E-318)
            gvf r10 = r4.a
            r11 = 0
            r7 = 3
            if (r8 != r7) goto L_0x01ce
            long r21 = r4.a()
            long r21 = r21 * r15
            int r8 = r4.g
            long r5 = (long) r8
            long r21 = r21 / r5
            int r5 = (r21 > r11 ? 1 : (r21 == r11 ? 0 : -1))
            if (r5 != 0) goto L_0x003d
            goto L_0x01ce
        L_0x003d:
            long r5 = java.lang.System.nanoTime()
            long r5 = r5 / r13
            long r13 = r4.m
            long r13 = r5 - r13
            r25 = 30000(0x7530, double:1.4822E-319)
            int r8 = (r13 > r25 ? 1 : (r13 == r25 ? 0 : -1))
            if (r8 < 0) goto L_0x0079
            int r8 = r4.v
            long r13 = r21 - r5
            long[] r15 = r4.b
            r15[r8] = r13
            int r8 = r8 + r1
            r13 = 10
            int r8 = r8 % r13
            r4.v = r8
            int r8 = r4.w
            if (r8 >= r13) goto L_0x0061
            int r8 = r8 + r1
            r4.w = r8
        L_0x0061:
            r4.m = r5
            r4.l = r11
            r8 = 0
        L_0x0066:
            int r13 = r4.w
            if (r8 >= r13) goto L_0x0079
            long r11 = r4.l
            r27 = r15[r8]
            long r13 = (long) r13
            long r27 = r27 / r13
            long r11 = r27 + r11
            r4.l = r11
            int r8 = r8 + r1
            r11 = 0
            goto L_0x0066
        L_0x0079:
            boolean r8 = r4.h
            if (r8 == 0) goto L_0x007f
            goto L_0x01ce
        L_0x007f:
            l60 r8 = r4.f
            r8.getClass()
            java.lang.Object r11 = r8.g
            j60 r11 = (defpackage.j60) r11
            if (r11 == 0) goto L_0x0094
            long r12 = r8.e
            long r12 = r5 - r12
            long r14 = r8.d
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 >= 0) goto L_0x0098
        L_0x0094:
            r29 = r10
            goto L_0x0120
        L_0x0098:
            r8.e = r5
            java.lang.Object r12 = r11.o
            android.media.AudioTrack r12 = (android.media.AudioTrack) r12
            java.lang.Object r13 = r11.X
            android.media.AudioTimestamp r13 = (android.media.AudioTimestamp) r13
            boolean r12 = r12.getTimestamp(r13)
            if (r12 == 0) goto L_0x00c6
            long r14 = r13.framePosition
            r29 = r10
            long r9 = r11.b
            int r9 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r9 <= 0) goto L_0x00ba
            long r9 = r11.a
            r30 = 1
            long r9 = r9 + r30
            r11.a = r9
        L_0x00ba:
            r11.b = r14
            long r9 = r11.a
            r16 = 32
            long r9 = r9 << r16
            long r14 = r14 + r9
            r11.c = r14
            goto L_0x00c8
        L_0x00c6:
            r29 = r10
        L_0x00c8:
            int r9 = r8.b
            if (r9 == 0) goto L_0x00fc
            if (r9 == r1) goto L_0x00e9
            r10 = 2
            if (r9 == r10) goto L_0x00e3
            if (r9 == r7) goto L_0x00dd
            r7 = 4
            if (r9 != r7) goto L_0x00d7
            goto L_0x0121
        L_0x00d7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x00dd:
            if (r12 == 0) goto L_0x0121
            r8.a()
            goto L_0x0121
        L_0x00e3:
            if (r12 != 0) goto L_0x0121
            r8.a()
            goto L_0x0121
        L_0x00e9:
            if (r12 == 0) goto L_0x00f8
            long r9 = r11.c
            long r13 = r8.f
            int r7 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r7 <= 0) goto L_0x0121
            r7 = 2
            r8.b(r7)
            goto L_0x0121
        L_0x00f8:
            r8.a()
            goto L_0x0121
        L_0x00fc:
            if (r12 == 0) goto L_0x0111
            long r9 = r13.nanoTime
            r13 = 1000(0x3e8, double:4.94E-321)
            long r9 = r9 / r13
            long r13 = r8.c
            int r7 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r7 < 0) goto L_0x0120
            long r9 = r11.c
            r8.f = r9
            r8.b(r1)
            goto L_0x0121
        L_0x0111:
            long r9 = r8.c
            long r9 = r5 - r9
            r13 = 500000(0x7a120, double:2.47033E-318)
            int r9 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r9 <= 0) goto L_0x0121
            r8.b(r7)
            goto L_0x0121
        L_0x0120:
            r12 = 0
        L_0x0121:
            r9 = 5000000(0x4c4b40, double:2.470328E-317)
            if (r12 != 0) goto L_0x012a
            r14 = r2
            r11 = r29
            goto L_0x0189
        L_0x012a:
            if (r11 == 0) goto L_0x0137
            java.lang.Object r7 = r11.X
            android.media.AudioTimestamp r7 = (android.media.AudioTimestamp) r7
            long r12 = r7.nanoTime
            r23 = 1000(0x3e8, double:4.94E-321)
            long r12 = r12 / r23
            goto L_0x013c
        L_0x0137:
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x013c:
            r14 = r2
            if (r11 == 0) goto L_0x0142
            long r1 = r11.c
            goto L_0x0144
        L_0x0142:
            r1 = -1
        L_0x0144:
            long r12 = r12 - r5
            long r11 = java.lang.Math.abs(r12)
            int r11 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r11 <= 0) goto L_0x015e
            r11 = r29
            java.lang.Object r1 = r11.b
            b54 r1 = (defpackage.b54) r1
            r1.i()
            r1.j()
            r1 = 4
            r8.b(r1)
            goto L_0x0189
        L_0x015e:
            r11 = r29
            r12 = 1000000(0xf4240, double:4.940656E-318)
            long r1 = r1 * r12
            int r12 = r4.g
            long r12 = (long) r12
            long r1 = r1 / r12
            long r1 = r1 - r21
            long r1 = java.lang.Math.abs(r1)
            int r1 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r1 <= 0) goto L_0x0181
            java.lang.Object r1 = r11.b
            b54 r1 = (defpackage.b54) r1
            r1.i()
            r1.j()
            r1 = 4
            r8.b(r1)
            goto L_0x0189
        L_0x0181:
            r1 = 4
            int r2 = r8.b
            if (r2 != r1) goto L_0x0189
            r8.a()
        L_0x0189:
            boolean r1 = r4.q
            if (r1 == 0) goto L_0x01d0
            java.lang.reflect.Method r1 = r4.n
            if (r1 == 0) goto L_0x01d0
            long r12 = r4.r
            long r12 = r5 - r12
            r15 = 500000(0x7a120, double:2.47033E-318)
            int r2 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r2 < 0) goto L_0x01d0
            r2 = 0
            android.media.AudioTrack r8 = r4.c     // Catch:{ Exception -> 0x01c9 }
            r8.getClass()     // Catch:{ Exception -> 0x01c9 }
            java.lang.Object r1 = r1.invoke(r8, r2)     // Catch:{ Exception -> 0x01c9 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ Exception -> 0x01c9 }
            int r8 = defpackage.mze.a     // Catch:{ Exception -> 0x01c9 }
            int r1 = r1.intValue()     // Catch:{ Exception -> 0x01c9 }
            long r12 = (long) r1     // Catch:{ Exception -> 0x01c9 }
            r15 = 1000(0x3e8, double:4.94E-321)
            long r12 = r12 * r15
            long r7 = r4.i     // Catch:{ Exception -> 0x01c9 }
            long r12 = r12 - r7
            r4.o = r12     // Catch:{ Exception -> 0x01c9 }
            r7 = 0
            long r12 = java.lang.Math.max(r12, r7)     // Catch:{ Exception -> 0x01c9 }
            r4.o = r12     // Catch:{ Exception -> 0x01c9 }
            int r9 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r9 <= 0) goto L_0x01cb
            r11.getClass()     // Catch:{ Exception -> 0x01c9 }
            r4.o = r7     // Catch:{ Exception -> 0x01c9 }
            goto L_0x01cb
        L_0x01c9:
            r4.n = r2
        L_0x01cb:
            r4.r = r5
            goto L_0x01d0
        L_0x01ce:
            r14 = r2
            r11 = r10
        L_0x01d0:
            long r5 = java.lang.System.nanoTime()
            r7 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 / r7
            l60 r2 = r4.f
            r2.getClass()
            int r7 = r2.b
            r8 = 2
            if (r7 != r8) goto L_0x01e3
            r8 = 1
            goto L_0x01e4
        L_0x01e3:
            r8 = 0
        L_0x01e4:
            if (r8 == 0) goto L_0x0217
            java.lang.Object r2 = r2.g
            j60 r2 = (defpackage.j60) r2
            if (r2 == 0) goto L_0x01f2
            long r9 = r2.c
        L_0x01ee:
            r12 = 1000000(0xf4240, double:4.940656E-318)
            goto L_0x01f5
        L_0x01f2:
            r9 = -1
            goto L_0x01ee
        L_0x01f5:
            long r9 = r9 * r12
            int r7 = r4.g
            long r12 = (long) r7
            long r9 = r9 / r12
            if (r2 == 0) goto L_0x0208
            java.lang.Object r2 = r2.X
            android.media.AudioTimestamp r2 = (android.media.AudioTimestamp) r2
            long r12 = r2.nanoTime
            r14 = 1000(0x3e8, double:4.94E-321)
            long r12 = r12 / r14
            r19 = r12
            goto L_0x020d
        L_0x0208:
            r19 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x020d:
            long r12 = r5 - r19
            float r2 = r4.j
            long r12 = defpackage.mze.s(r2, r12)
            long r12 = r12 + r9
            goto L_0x0238
        L_0x0217:
            int r2 = r4.w
            if (r2 != 0) goto L_0x0229
            long r9 = r4.a()
            r12 = 1000000(0xf4240, double:4.940656E-318)
            long r9 = r9 * r12
            int r2 = r4.g
            long r12 = (long) r2
            long r9 = r9 / r12
        L_0x0227:
            r12 = r9
            goto L_0x022d
        L_0x0229:
            long r9 = r4.l
            long r9 = r9 + r5
            goto L_0x0227
        L_0x022d:
            if (r14 != 0) goto L_0x0238
            long r9 = r4.o
            long r12 = r12 - r9
            r9 = 0
            long r12 = java.lang.Math.max(r9, r12)
        L_0x0238:
            boolean r2 = r4.D
            if (r2 == r8) goto L_0x0244
            long r9 = r4.C
            r4.F = r9
            long r9 = r4.B
            r4.E = r9
        L_0x0244:
            long r9 = r4.F
            long r9 = r5 - r9
            r14 = 1000000(0xf4240, double:4.940656E-318)
            int r2 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r2 >= 0) goto L_0x0265
            long r1 = r4.E
            float r7 = r4.j
            long r17 = defpackage.mze.s(r7, r9)
            long r17 = r17 + r1
            r1 = 1000(0x3e8, double:4.94E-321)
            long r9 = r9 * r1
            long r9 = r9 / r14
            long r12 = r12 * r9
            long r9 = r1 - r9
            long r9 = r9 * r17
            long r9 = r9 + r12
            long r12 = r9 / r1
        L_0x0265:
            boolean r1 = r4.k
            if (r1 != 0) goto L_0x02a4
            long r1 = r4.B
            int r7 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r7 <= 0) goto L_0x02a4
            r7 = 1
            r4.k = r7
            long r1 = r12 - r1
            long r1 = defpackage.mze.M(r1)
            float r9 = r4.j
            long r1 = defpackage.mze.w(r9, r1)
            long r9 = java.lang.System.currentTimeMillis()
            long r1 = defpackage.mze.M(r1)
            long r9 = r9 - r1
            java.lang.Object r1 = r11.b
            b54 r1 = (defpackage.b54) r1
            wwc r1 = r1.r
            if (r1 == 0) goto L_0x02a4
            java.lang.Object r1 = r1.b
            l28 r1 = (defpackage.l28) r1
            otf r1 = r1.V1
            java.lang.Object r2 = r1.a
            android.os.Handler r2 = (android.os.Handler) r2
            if (r2 == 0) goto L_0x02a4
            q50 r11 = new q50
            r7 = 1
            r11.<init>(r1, r9, r7)
            r2.post(r11)
        L_0x02a4:
            r4.C = r5
            r4.B = r12
            r4.D = r8
            r44 r1 = r3.t
            long r4 = r3.j()
            r6 = 1000000(0xf4240, double:4.940656E-318)
            long r4 = r4 * r6
            int r1 = r1.e
            long r1 = (long) r1
            long r4 = r4 / r1
            long r1 = java.lang.Math.min(r12, r4)
        L_0x02bc:
            java.util.ArrayDeque r4 = r3.j
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L_0x02d9
            java.lang.Object r5 = r4.getFirst()
            t44 r5 = (defpackage.t44) r5
            long r5 = r5.d
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 < 0) goto L_0x02d9
            java.lang.Object r4 = r4.remove()
            t44 r4 = (defpackage.t44) r4
            r3.x = r4
            goto L_0x02bc
        L_0x02d9:
            t44 r5 = r3.x
            long r6 = r5.d
            long r8 = r1 - r6
            vxa r5 = r5.a
            vxa r6 = defpackage.vxa.o
            boolean r5 = r5.equals(r6)
            jj7 r6 = r3.b
            if (r5 == 0) goto L_0x02f1
            t44 r1 = r3.x
            long r1 = r1.c
            long r1 = r1 + r8
            goto L_0x0354
        L_0x02f1:
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L_0x033d
            java.lang.Object r1 = r6.c
            pld r1 = (defpackage.pld) r1
            long r4 = r1.o
            r10 = 1024(0x400, double:5.06E-321)
            int r2 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r2 < 0) goto L_0x0331
            long r4 = r1.n
            old r2 = r1.j
            r2.getClass()
            int r7 = r2.l
            int r2 = r2.c
            int r7 = r7 * r2
            r2 = 2
            int r7 = r7 * r2
            long r10 = (long) r7
            long r10 = r4 - r10
            g50 r2 = r1.h
            int r2 = r2.a
            g50 r4 = r1.g
            int r4 = r4.a
            if (r2 != r4) goto L_0x0325
            long r12 = r1.o
            long r1 = defpackage.mze.J(r8, r10, r12)
            goto L_0x0337
        L_0x0325:
            long r12 = (long) r2
            long r10 = r10 * r12
            long r1 = r1.o
            long r4 = (long) r4
            long r12 = r1 * r4
            long r1 = defpackage.mze.J(r8, r10, r12)
            goto L_0x0337
        L_0x0331:
            float r1 = r1.c
            double r1 = (double) r1
            double r4 = (double) r8
            double r1 = r1 * r4
            long r1 = (long) r1
        L_0x0337:
            t44 r4 = r3.x
            long r4 = r4.c
            long r1 = r1 + r4
            goto L_0x0354
        L_0x033d:
            java.lang.Object r4 = r4.getFirst()
            t44 r4 = (defpackage.t44) r4
            long r7 = r4.d
            long r7 = r7 - r1
            t44 r1 = r3.x
            vxa r1 = r1.a
            float r1 = r1.a
            long r1 = defpackage.mze.s(r1, r7)
            long r4 = r4.c
            long r1 = r4 - r1
        L_0x0354:
            r44 r3 = r3.t
            java.lang.Object r4 = r6.b
            fgd r4 = (defpackage.fgd) r4
            long r4 = r4.t
            r6 = 1000000(0xf4240, double:4.940656E-318)
            long r4 = r4 * r6
            int r3 = r3.e
            long r6 = (long) r3
            long r4 = r4 / r6
            long r4 = r4 + r1
            r1 = -9223372036854775808
            goto L_0x036c
        L_0x0368:
            r1 = -9223372036854775808
            r4 = -9223372036854775808
        L_0x036c:
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x0380
            boolean r1 = r0.c2
            if (r1 == 0) goto L_0x0375
            goto L_0x037b
        L_0x0375:
            long r1 = r0.a2
            long r4 = java.lang.Math.max(r1, r4)
        L_0x037b:
            r0.a2 = r4
            r1 = 0
            r0.c2 = r1
        L_0x0380:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l28.t0():void");
    }
}
