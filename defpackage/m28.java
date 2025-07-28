package defpackage;

import android.content.Context;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.media3.exoplayer.audio.AudioSink$ConfigurationException;
import androidx.media3.exoplayer.audio.AudioSink$InitializationException;
import androidx.media3.exoplayer.audio.AudioSink$WriteException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* renamed from: m28  reason: default package */
public final class m28 extends x28 implements d28 {
    public final Context U1;
    public final qe4 V1;
    public final a60 W1;
    public int X1;
    public boolean Y1;
    public boolean Z1;
    public xu5 a2;
    public xu5 b2;
    public long c2;
    public boolean d2;
    public boolean e2;
    public boolean f2;
    public int g2 = -1000;

    public m28(Context context, h28 h28, Handler handler, h45 h45, c54 c54) {
        super(1, h28, 44100.0f);
        this.U1 = context.getApplicationContext();
        this.W1 = c54;
        this.V1 = new qe4((Object) handler, 5, (Object) h45);
        c54.s = new lhd(20, this);
    }

    public final int A0(p28 p28, xu5 xu5) {
        int i;
        if (!"OMX.google.raw.decoder".equals(p28.a) || (i = oze.a) >= 24 || (i == 23 && oze.P(this.U1))) {
            return xu5.o;
        }
        return -1;
    }

    public final void B0() {
        long j;
        ArrayDeque arrayDeque;
        long j2;
        long j3;
        boolean n = n();
        c54 c54 = (c54) this.W1;
        if (!c54.l() || c54.N) {
            j = Long.MIN_VALUE;
        } else {
            long min = Math.min(c54.i.a(n), oze.Y(c54.u.e, c54.h()));
            while (true) {
                arrayDeque = c54.j;
                if (arrayDeque.isEmpty() || min < ((u44) arrayDeque.getFirst()).c) {
                    long j4 = min - c54.C.c;
                    boolean isEmpty = arrayDeque.isEmpty();
                    it4 it4 = c54.b;
                } else {
                    c54.C = (u44) arrayDeque.remove();
                }
            }
            long j42 = min - c54.C.c;
            boolean isEmpty2 = arrayDeque.isEmpty();
            it4 it42 = c54.b;
            if (isEmpty2) {
                qld qld = (qld) it42.c;
                if (qld.isActive()) {
                    if (qld.o >= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
                        long j5 = qld.n;
                        old old = qld.j;
                        old.getClass();
                        long j6 = j5 - ((long) ((old.l * old.c) * 2));
                        int i = qld.h.a;
                        int i2 = qld.g.a;
                        j3 = i == i2 ? oze.a0(j42, j6, qld.o, RoundingMode.FLOOR) : oze.a0(j42, j6 * ((long) i), qld.o * ((long) i2), RoundingMode.FLOOR);
                    } else {
                        j3 = (long) (((double) qld.c) * ((double) j42));
                    }
                    j42 = j3;
                }
                j2 = c54.C.b + j42;
            } else {
                u44 u44 = (u44) arrayDeque.getFirst();
                j2 = u44.b - oze.A(c54.C.a.a, u44.c - min);
            }
            long j7 = ((ggd) it42.b).q;
            j = oze.Y(c54.u.e, j7) + j2;
            long j8 = c54.j0;
            if (j7 > j8) {
                long Y = oze.Y(c54.u.e, j7 - j8);
                c54.j0 = j7;
                c54.k0 += Y;
                if (c54.l0 == null) {
                    c54.l0 = new Handler(Looper.myLooper());
                }
                c54.l0.removeCallbacksAndMessages((Object) null);
                c54.l0.postDelayed(new ds1(22, c54), 100);
            }
        }
        if (j != Long.MIN_VALUE) {
            if (!this.d2) {
                j = Math.max(this.c2, j);
            }
            this.c2 = j;
            this.d2 = false;
        }
    }

    public final q24 G(p28 p28, xu5 xu5, xu5 xu52) {
        q24 b = p28.b(xu5, xu52);
        int i = 0;
        boolean z = this.U0 == null && u0(xu52);
        int i2 = b.e;
        if (z) {
            i2 |= 32768;
        }
        if (A0(p28, xu52) > this.X1) {
            i2 |= 64;
        }
        int i3 = i2;
        if (i3 == 0) {
            i = b.d;
        }
        return new q24(p28.a, xu5, xu52, i, i3);
    }

    public final boolean I() {
        boolean z = this.f2;
        this.f2 = false;
        return z;
    }

    public final float S(float f, xu5[] xu5Arr) {
        int i = -1;
        for (xu5 xu5 : xu5Arr) {
            int i2 = xu5.C;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return ((float) i) * f;
    }

    public final ArrayList T(pv0 pv0, xu5 xu5, boolean z) {
        e8c e8c;
        if (xu5.n == null) {
            e8c = e8c.X;
        } else {
            if (((c54) this.W1).f(xu5) != 0) {
                List e = g38.e("audio/raw", false, false);
                p28 p28 = e.isEmpty() ? null : (p28) e.get(0);
                if (p28 != null) {
                    e8c = ws6.n(p28);
                }
            }
            e8c = g38.g(pv0, xu5, z, false);
        }
        return g38.h(xu5, e8c);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d0, code lost:
        if ("AXON 7 mini".equals(r2) == false) goto L_0x00d3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0143  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.f28 U(defpackage.p28 r12, defpackage.xu5 r13, android.media.MediaCrypto r14, float r15) {
        /*
            r11 = this;
            xu5[] r0 = r11.y0
            r0.getClass()
            int r1 = r11.A0(r12, r13)
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
            q24 r7 = r12.b(r13, r6)
            int r7 = r7.d
            if (r7 == 0) goto L_0x0025
            int r6 = r11.A0(r12, r6)
            int r1 = java.lang.Math.max(r1, r6)
        L_0x0025:
            int r5 = r5 + 1
            goto L_0x0011
        L_0x0028:
            r11.X1 = r1
            int r0 = defpackage.oze.a
            r1 = 24
            java.lang.String r2 = r12.a
            if (r0 >= r1) goto L_0x0060
            java.lang.String r5 = "OMX.SEC.aac.dec"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x0060
            java.lang.String r5 = "samsung"
            java.lang.String r6 = defpackage.oze.c
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0060
            java.lang.String r5 = defpackage.oze.b
            java.lang.String r6 = "zeroflte"
            boolean r6 = r5.startsWith(r6)
            if (r6 != 0) goto L_0x005e
            java.lang.String r6 = "herolte"
            boolean r6 = r5.startsWith(r6)
            if (r6 != 0) goto L_0x005e
            java.lang.String r6 = "heroqlte"
            boolean r5 = r5.startsWith(r6)
            if (r5 == 0) goto L_0x0060
        L_0x005e:
            r5 = r3
            goto L_0x0061
        L_0x0060:
            r5 = r4
        L_0x0061:
            r11.Y1 = r5
            java.lang.String r5 = "OMX.google.opus.decoder"
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L_0x0086
            java.lang.String r5 = "c2.android.opus.decoder"
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L_0x0086
            java.lang.String r5 = "OMX.google.vorbis.decoder"
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L_0x0086
            java.lang.String r5 = "c2.android.vorbis.decoder"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x0084
            goto L_0x0086
        L_0x0084:
            r2 = r4
            goto L_0x0087
        L_0x0086:
            r2 = r3
        L_0x0087:
            r11.Z1 = r2
            int r2 = r11.X1
            android.media.MediaFormat r7 = new android.media.MediaFormat
            r7.<init>()
            java.lang.String r5 = "mime"
            java.lang.String r6 = r12.c
            r7.setString(r5, r6)
            int r5 = r13.B
            java.lang.String r6 = "channel-count"
            r7.setInteger(r6, r5)
            java.lang.String r5 = "sample-rate"
            int r6 = r13.C
            r7.setInteger(r5, r6)
            java.util.List r5 = r13.q
            defpackage.iu7.X(r7, r5)
            java.lang.String r5 = "max-input-size"
            defpackage.iu7.I(r7, r5, r2)
            r2 = 23
            if (r0 < r2) goto L_0x00d8
            java.lang.String r5 = "priority"
            r7.setInteger(r5, r4)
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r5 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
            if (r5 == 0) goto L_0x00d8
            if (r0 != r2) goto L_0x00d3
            java.lang.String r2 = defpackage.oze.d
            java.lang.String r5 = "ZTE B2017G"
            boolean r5 = r5.equals(r2)
            if (r5 != 0) goto L_0x00d8
            java.lang.String r5 = "AXON 7 mini"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x00d3
            goto L_0x00d8
        L_0x00d3:
            java.lang.String r2 = "operating-rate"
            r7.setFloat(r2, r15)
        L_0x00d8:
            r15 = 28
            java.lang.String r2 = r13.n
            if (r0 > r15) goto L_0x00eb
            java.lang.String r15 = "audio/ac4"
            boolean r15 = r15.equals(r2)
            if (r15 == 0) goto L_0x00eb
            java.lang.String r15 = "ac4-is-sync"
            r7.setInteger(r15, r3)
        L_0x00eb:
            java.lang.String r15 = "audio/raw"
            if (r0 < r1) goto L_0x0118
            uu5 r1 = new uu5
            r1.<init>()
            java.lang.String r3 = defpackage.c49.l(r15)
            r1.m = r3
            int r3 = r13.B
            r1.A = r3
            r1.B = r6
            r3 = 4
            r1.C = r3
            xu5 r5 = new xu5
            r5.<init>(r1)
            a60 r1 = r11.W1
            c54 r1 = (defpackage.c54) r1
            int r1 = r1.f(r5)
            r5 = 2
            if (r1 != r5) goto L_0x0118
            java.lang.String r1 = "pcm-encoding"
            r7.setInteger(r1, r3)
        L_0x0118:
            r1 = 32
            if (r0 < r1) goto L_0x0123
            java.lang.String r1 = "max-output-channel-count"
            r3 = 99
            r7.setInteger(r1, r3)
        L_0x0123:
            r1 = 35
            if (r0 < r1) goto L_0x0133
            int r0 = r11.g2
            int r0 = -r0
            int r0 = java.lang.Math.max(r4, r0)
            java.lang.String r1 = "importance"
            r7.setInteger(r1, r0)
        L_0x0133:
            java.lang.String r0 = r12.b
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x0143
            boolean r15 = r15.equals(r2)
            if (r15 != 0) goto L_0x0143
            r15 = r13
            goto L_0x0144
        L_0x0143:
            r15 = 0
        L_0x0144:
            r11.b2 = r15
            f28 r11 = new f28
            r9 = 0
            r5 = r11
            r6 = r12
            r8 = r13
            r10 = r14
            r5.<init>(r6, r7, r8, r9, r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m28.U(p28, xu5, android.media.MediaCrypto, float):f28");
    }

    public final void V(n24 n24) {
        xu5 xu5;
        s44 s44;
        if (oze.a >= 29 && (xu5 = n24.c) != null && Objects.equals(xu5.n, "audio/opus") && this.y1) {
            ByteBuffer byteBuffer = n24.w0;
            byteBuffer.getClass();
            xu5 xu52 = n24.c;
            xu52.getClass();
            if (byteBuffer.remaining() == 8) {
                int i = (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000);
                c54 c54 = (c54) this.W1;
                AudioTrack audioTrack = c54.w;
                if (audioTrack != null && c54.m(audioTrack) && (s44 = c54.u) != null && s44.k) {
                    c54.w.setOffloadDelayPadding(xu52.E, i);
                }
            }
        }
    }

    public final void a(int i, Object obj) {
        a60 a60 = this.W1;
        if (i == 2) {
            obj.getClass();
            float floatValue = ((Float) obj).floatValue();
            c54 c54 = (c54) a60;
            if (c54.P != floatValue) {
                c54.P = floatValue;
                if (c54.l()) {
                    if (oze.a >= 21) {
                        c54.w.setVolume(c54.P);
                        return;
                    }
                    AudioTrack audioTrack = c54.w;
                    float f = c54.P;
                    audioTrack.setStereoVolume(f, f);
                }
            }
        } else if (i == 3) {
            k20 k20 = (k20) obj;
            k20.getClass();
            c54 c542 = (c54) a60;
            if (!c542.A.equals(k20)) {
                c542.A = k20;
                if (!c542.d0) {
                    a30 a30 = c542.y;
                    if (a30 != null) {
                        a30.y0 = k20;
                        a30.g(w20.b((Context) a30.b, k20, (i30) a30.x0));
                    }
                    c542.d();
                }
            }
        } else if (i == 6) {
            qb0 qb0 = (qb0) obj;
            qb0.getClass();
            c54 c543 = (c54) a60;
            if (!c543.b0.equals(qb0)) {
                if (c543.w != null) {
                    c543.b0.getClass();
                }
                c543.b0 = qb0;
            }
        } else if (i != 12) {
            boolean z = false;
            if (i == 16) {
                obj.getClass();
                this.g2 = ((Integer) obj).intValue();
                j28 j28 = this.a1;
                if (j28 != null && oze.a >= 35) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("importance", Math.max(0, -this.g2));
                    j28.setParameters(bundle);
                }
            } else if (i == 9) {
                obj.getClass();
                c54 c544 = (c54) a60;
                c544.E = ((Boolean) obj).booleanValue();
                u44 u44 = new u44(c544.t() ? wxa.d : c544.D, -9223372036854775807L, -9223372036854775807L);
                if (c544.l()) {
                    c544.B = u44;
                } else {
                    c544.C = u44;
                }
            } else if (i == 10) {
                obj.getClass();
                int intValue = ((Integer) obj).intValue();
                c54 c545 = (c54) a60;
                if (c545.a0 != intValue) {
                    c545.a0 = intValue;
                    if (intValue != 0) {
                        z = true;
                    }
                    c545.Z = z;
                    c545.d();
                }
            } else if (i == 11) {
                this.V0 = (p45) obj;
            }
        } else if (oze.a >= 23) {
            k28.a(a60, obj);
        }
    }

    public final void a0(Exception exc) {
        ez3.B("Audio codec error", exc);
        qe4 qe4 = this.V1;
        Handler handler = (Handler) qe4.b;
        if (handler != null) {
            handler.post(new v50(qe4, exc, 0));
        }
    }

    public final void b0(long j, String str, long j2) {
        qe4 qe4 = this.V1;
        Handler handler = (Handler) qe4.b;
        if (handler != null) {
            handler.post(new u50(qe4, str, j, j2, 1));
        }
    }

    public final void c0(String str) {
        qe4 qe4 = this.V1;
        Handler handler = (Handler) qe4.b;
        if (handler != null) {
            handler.post(new c(qe4, 7, str));
        }
    }

    public final wxa d() {
        return ((c54) this.W1).D;
    }

    public final q24 d0(qe4 qe4) {
        xu5 xu5 = (xu5) qe4.c;
        xu5.getClass();
        this.a2 = xu5;
        q24 d0 = super.d0(qe4);
        qe4 qe42 = this.V1;
        Handler handler = (Handler) qe42.b;
        if (handler != null) {
            handler.post(new g5(qe42, xu5, d0, 1));
        }
        return d0;
    }

    public final long e() {
        if (this.w0 == 2) {
            B0();
        }
        return this.c2;
    }

    public final void e0(xu5 xu5, MediaFormat mediaFormat) {
        int i;
        xu5 xu52 = this.b2;
        boolean z = true;
        int[] iArr = null;
        if (xu52 != null) {
            xu5 = xu52;
        } else if (this.a1 != null) {
            mediaFormat.getClass();
            int C = "audio/raw".equals(xu5.n) ? xu5.D : (oze.a < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? oze.C(mediaFormat.getInteger("v-bits-per-sample")) : 2 : mediaFormat.getInteger("pcm-encoding");
            uu5 uu5 = new uu5();
            uu5.m = c49.l("audio/raw");
            uu5.C = C;
            uu5.D = xu5.E;
            uu5.E = xu5.F;
            uu5.j = xu5.k;
            uu5.k = xu5.l;
            uu5.a = xu5.a;
            uu5.b = xu5.b;
            uu5.c = ws6.j(xu5.c);
            uu5.d = xu5.d;
            uu5.e = xu5.e;
            uu5.f = xu5.f;
            uu5.A = mediaFormat.getInteger("channel-count");
            uu5.B = mediaFormat.getInteger("sample-rate");
            xu5 xu53 = new xu5(uu5);
            boolean z2 = this.Y1;
            int i2 = xu53.B;
            if (z2 && i2 == 6 && (i = xu5.B) < 6) {
                iArr = new int[i];
                for (int i3 = 0; i3 < i; i3++) {
                    iArr[i3] = i3;
                }
            } else if (this.Z1) {
                if (i2 == 3) {
                    iArr = new int[]{0, 2, 1};
                } else if (i2 == 5) {
                    iArr = new int[]{0, 2, 1, 3, 4};
                } else if (i2 == 6) {
                    iArr = new int[]{0, 2, 1, 5, 3, 4};
                } else if (i2 == 7) {
                    iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                } else if (i2 == 8) {
                    iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                }
            }
            xu5 = xu53;
        }
        try {
            int i4 = oze.a;
            a60 a60 = this.W1;
            if (i4 >= 29) {
                if (this.y1) {
                    j9c j9c = this.o;
                    j9c.getClass();
                    if (j9c.a != 0) {
                        j9c j9c2 = this.o;
                        j9c2.getClass();
                        int i5 = j9c2.a;
                        c54 c54 = (c54) a60;
                        c54.getClass();
                        if (i4 < 29) {
                            z = false;
                        }
                        oyb.k(z);
                        c54.l = i5;
                    }
                }
                c54 c542 = (c54) a60;
                c542.getClass();
                if (i4 < 29) {
                    z = false;
                }
                oyb.k(z);
                c542.l = 0;
            }
            ((c54) a60).b(xu5, iArr);
        } catch (AudioSink$ConfigurationException e) {
            throw g(e, e.a, false, 5001);
        }
    }

    public final void f(wxa wxa) {
        c54 c54 = (c54) this.W1;
        c54.getClass();
        c54.D = new wxa(oze.i(wxa.a, 0.1f, 8.0f), oze.i(wxa.b, 0.1f, 8.0f));
        if (c54.t()) {
            c54.s();
            return;
        }
        u44 u44 = new u44(wxa, -9223372036854775807L, -9223372036854775807L);
        if (c54.l()) {
            c54.B = u44;
        } else {
            c54.C = u44;
        }
    }

    public final void f0() {
        this.W1.getClass();
    }

    public final void h0() {
        ((c54) this.W1).M = true;
    }

    public final d28 k() {
        return this;
    }

    public final String l() {
        return "MediaCodecAudioRenderer";
    }

    public final boolean l0(long j, long j2, j28 j28, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, xu5 xu5) {
        int i4;
        int i5;
        byteBuffer.getClass();
        if (this.b2 == null || (i2 & 2) == 0) {
            a60 a60 = this.W1;
            if (z) {
                if (j28 != null) {
                    j28.releaseOutputBuffer(i, false);
                }
                this.P1.g += i3;
                ((c54) a60).M = true;
                return true;
            }
            try {
                if (!((c54) a60).i(byteBuffer, j3, i3)) {
                    return false;
                }
                if (j28 != null) {
                    j28.releaseOutputBuffer(i, false);
                }
                this.P1.f += i3;
                return true;
            } catch (AudioSink$InitializationException e) {
                xu5 xu52 = this.a2;
                if (this.y1) {
                    j9c j9c = this.o;
                    j9c.getClass();
                    if (j9c.a != 0) {
                        i4 = 5004;
                        throw g(e, xu52, e.b, i4);
                    }
                }
                i4 = 5001;
                throw g(e, xu52, e.b, i4);
            } catch (AudioSink$WriteException e3) {
                if (this.y1) {
                    j9c j9c2 = this.o;
                    j9c2.getClass();
                    if (j9c2.a != 0) {
                        i5 = 5003;
                        throw g(e3, xu5, e3.b, i5);
                    }
                }
                i5 = 5002;
                throw g(e3, xu5, e3.b, i5);
            }
        } else {
            j28.getClass();
            j28.releaseOutputBuffer(i, false);
            return true;
        }
    }

    public final boolean n() {
        if (this.L1) {
            c54 c54 = (c54) this.W1;
            if (!c54.l() || (c54.V && !c54.j())) {
                return true;
            }
        }
        return false;
    }

    public final void o0() {
        try {
            c54 c54 = (c54) this.W1;
            if (!c54.V && c54.l() && c54.c()) {
                c54.p();
                c54.V = true;
            }
        } catch (AudioSink$WriteException e) {
            throw g(e, e.c, e.b, this.y1 ? 5003 : 5002);
        }
    }

    public final boolean p() {
        return ((c54) this.W1).j() || super.p();
    }

    public final void q() {
        qe4 qe4 = this.V1;
        this.e2 = true;
        this.a2 = null;
        try {
            ((c54) this.W1).d();
            try {
                super.q();
            } finally {
                qe4.v(this.P1);
            }
        } catch (Throwable th) {
            super.q();
            throw th;
        } finally {
            qe4.v(this.P1);
        }
    }

    public final void r(boolean z, boolean z2) {
        l24 l24 = new l24(1);
        this.P1 = l24;
        qe4 qe4 = this.V1;
        Handler handler = (Handler) qe4.b;
        if (handler != null) {
            handler.post(new p50(qe4, l24, 0));
        }
        j9c j9c = this.o;
        j9c.getClass();
        boolean z3 = j9c.b;
        boolean z4 = false;
        a60 a60 = this.W1;
        if (z3) {
            c54 c54 = (c54) a60;
            c54.getClass();
            if (oze.a >= 21) {
                z4 = true;
            }
            oyb.k(z4);
            oyb.k(c54.Z);
            if (!c54.d0) {
                c54.d0 = true;
                c54.d();
            }
        } else {
            c54 c542 = (c54) a60;
            if (c542.d0) {
                c542.d0 = false;
                c542.d();
            }
        }
        cza cza = this.Y;
        cza.getClass();
        c54 c543 = (c54) a60;
        c543.r = cza;
        z7e z7e = this.Z;
        z7e.getClass();
        c543.i.J = z7e;
    }

    public final void s(long j, boolean z) {
        super.s(j, z);
        ((c54) this.W1).d();
        this.c2 = j;
        this.f2 = false;
        this.d2 = true;
    }

    public final void t() {
        y20 y20;
        a30 a30 = ((c54) this.W1).y;
        if (a30 != null && a30.a) {
            a30.w0 = null;
            int i = oze.a;
            Context context = (Context) a30.b;
            if (i >= 23 && (y20 = (y20) a30.X) != null) {
                x20.b(context, y20);
            }
            an anVar = (an) a30.Y;
            if (anVar != null) {
                context.unregisterReceiver(anVar);
            }
            z20 z20 = (z20) a30.Z;
            if (z20 != null) {
                z20.a.unregisterContentObserver(z20);
            }
            a30.a = false;
        }
    }

    public final void u() {
        a60 a60 = this.W1;
        this.f2 = false;
        try {
            J();
            n0();
            zn4 zn4 = this.U0;
            if (zn4 != null) {
                zn4.f((fo4) null);
            }
            this.U0 = null;
            if (this.e2) {
                this.e2 = false;
                ((c54) a60).r();
            }
        } catch (Throwable th) {
            if (this.e2) {
                this.e2 = false;
                ((c54) a60).r();
            }
            throw th;
        }
    }

    public final boolean u0(xu5 xu5) {
        j9c j9c = this.o;
        j9c.getClass();
        if (j9c.a != 0) {
            int z0 = z0(xu5);
            if ((z0 & 512) != 0) {
                j9c j9c2 = this.o;
                j9c2.getClass();
                if (j9c2.a == 2 || (z0 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 || (xu5.E == 0 && xu5.F == 0)) {
                    return true;
                }
            }
        }
        return ((c54) this.W1).f(xu5) != 0;
    }

    public final void v() {
        ((c54) this.W1).o();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: p28} */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0047, code lost:
        if ((r4.isEmpty() ? null : (defpackage.p28) r4.get(0)) != null) goto L_0x0049;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0073  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int v0(defpackage.pv0 r14, defpackage.xu5 r15) {
        /*
            r13 = this;
            java.lang.String r0 = r15.n
            boolean r0 = defpackage.c49.h(r0)
            r1 = 0
            if (r0 != 0) goto L_0x000e
            int r13 = defpackage.qi0.b(r1, r1, r1, r1)
            return r13
        L_0x000e:
            int r0 = defpackage.oze.a
            r2 = 21
            if (r0 < r2) goto L_0x0017
            r0 = 32
            goto L_0x0018
        L_0x0017:
            r0 = r1
        L_0x0018:
            r2 = 1
            int r3 = r15.K
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
            r6 = 0
            java.lang.String r7 = "audio/raw"
            r8 = 8
            r9 = 4
            a60 r10 = r13.W1
            if (r3 == 0) goto L_0x005b
            if (r4 == 0) goto L_0x0049
            java.util.List r4 = defpackage.g38.e(r7, r1, r1)
            boolean r11 = r4.isEmpty()
            if (r11 == 0) goto L_0x0041
            r4 = r6
            goto L_0x0047
        L_0x0041:
            java.lang.Object r4 = r4.get(r1)
            p28 r4 = (defpackage.p28) r4
        L_0x0047:
            if (r4 == 0) goto L_0x005b
        L_0x0049:
            int r13 = r13.z0(r15)
            r4 = r10
            c54 r4 = (defpackage.c54) r4
            int r4 = r4.f(r15)
            if (r4 == 0) goto L_0x005c
            int r13 = defpackage.qi0.b(r9, r8, r0, r13)
            return r13
        L_0x005b:
            r13 = r1
        L_0x005c:
            java.lang.String r4 = r15.n
            boolean r11 = r7.equals(r4)
            if (r11 == 0) goto L_0x0073
            r11 = r10
            c54 r11 = (defpackage.c54) r11
            int r11 = r11.f(r15)
            if (r11 == 0) goto L_0x006e
            goto L_0x0073
        L_0x006e:
            int r13 = defpackage.qi0.b(r2, r1, r1, r1)
            return r13
        L_0x0073:
            uu5 r11 = new uu5
            r11.<init>()
            java.lang.String r12 = defpackage.c49.l(r7)
            r11.m = r12
            int r12 = r15.B
            r11.A = r12
            int r12 = r15.C
            r11.B = r12
            r11.C = r5
            xu5 r12 = new xu5
            r12.<init>(r11)
            c54 r10 = (defpackage.c54) r10
            int r11 = r10.f(r12)
            if (r11 == 0) goto L_0x0115
            if (r4 != 0) goto L_0x009a
            e8c r14 = defpackage.e8c.X
            goto L_0x00bd
        L_0x009a:
            int r4 = r10.f(r15)
            if (r4 == 0) goto L_0x00b9
            java.util.List r4 = defpackage.g38.e(r7, r1, r1)
            boolean r7 = r4.isEmpty()
            if (r7 == 0) goto L_0x00ab
            goto L_0x00b2
        L_0x00ab:
            java.lang.Object r4 = r4.get(r1)
            r6 = r4
            p28 r6 = (defpackage.p28) r6
        L_0x00b2:
            if (r6 == 0) goto L_0x00b9
            e8c r14 = defpackage.ws6.n(r6)
            goto L_0x00bd
        L_0x00b9:
            e8c r14 = defpackage.g38.g(r14, r15, r1, r1)
        L_0x00bd:
            boolean r4 = r14.isEmpty()
            if (r4 == 0) goto L_0x00c8
            int r13 = defpackage.qi0.b(r2, r1, r1, r1)
            return r13
        L_0x00c8:
            if (r3 != 0) goto L_0x00cf
            int r13 = defpackage.qi0.b(r5, r1, r1, r1)
            return r13
        L_0x00cf:
            java.lang.Object r3 = r14.get(r1)
            p28 r3 = (defpackage.p28) r3
            boolean r4 = r3.d(r15)
            if (r4 != 0) goto L_0x00f2
            r5 = r2
        L_0x00dc:
            int r6 = r14.o
            if (r5 >= r6) goto L_0x00f2
            java.lang.Object r6 = r14.get(r5)
            p28 r6 = (defpackage.p28) r6
            boolean r7 = r6.d(r15)
            if (r7 == 0) goto L_0x00ef
            r14 = r1
            r3 = r6
            goto L_0x00f4
        L_0x00ef:
            int r5 = r5 + 1
            goto L_0x00dc
        L_0x00f2:
            r14 = r2
            r2 = r4
        L_0x00f4:
            if (r2 == 0) goto L_0x00f7
            goto L_0x00f8
        L_0x00f7:
            r9 = 3
        L_0x00f8:
            if (r2 == 0) goto L_0x0102
            boolean r15 = r3.e(r15)
            if (r15 == 0) goto L_0x0102
            r8 = 16
        L_0x0102:
            boolean r15 = r3.g
            if (r15 == 0) goto L_0x0109
            r15 = 64
            goto L_0x010a
        L_0x0109:
            r15 = r1
        L_0x010a:
            if (r14 == 0) goto L_0x010e
            r1 = 128(0x80, float:1.794E-43)
        L_0x010e:
            r14 = r9 | r8
            r14 = r14 | r0
            r14 = r14 | r15
            r14 = r14 | r1
            r13 = r13 | r14
            return r13
        L_0x0115:
            int r13 = defpackage.qi0.b(r2, r1, r1, r1)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m28.v0(pv0, xu5):int");
    }

    public final void w() {
        B0();
        c54 c54 = (c54) this.W1;
        c54.Y = false;
        if (c54.l()) {
            n60 n60 = c54.i;
            n60.d();
            if (n60.y == -9223372036854775807L) {
                l60 l60 = n60.f;
                l60.getClass();
                l60.a();
            } else {
                n60.A = n60.b();
                if (!c54.m(c54.w)) {
                    return;
                }
            }
            c54.w.pause();
        }
    }

    public final int z0(xu5 xu5) {
        a50 e = ((c54) this.W1).e(xu5);
        if (!e.a) {
            return 0;
        }
        int i = e.b ? 1536 : 512;
        return e.c ? i | 2048 : i;
    }
}
