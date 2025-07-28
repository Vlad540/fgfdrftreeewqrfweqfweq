package defpackage;

import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil$DecoderQueryException;

/* renamed from: pi0  reason: default package */
public abstract class pi0 implements iza {
    public boolean A0;
    public bza X;
    public int Y;
    public xjc Z;
    public final int a;
    public final otf b = new Object();
    public i9c c;
    public int o;
    public vu5[] w0;
    public long x0;
    public long y0 = Long.MIN_VALUE;
    public boolean z0;

    /* JADX WARNING: type inference failed for: r3v1, types: [otf, java.lang.Object] */
    public pi0(int i) {
        this.a = i;
    }

    public static int b(int i, int i2, int i3) {
        return i | i2 | i3 | 128;
    }

    public static int h(int i) {
        return i & 128;
    }

    public static int i(int i) {
        return i & 64;
    }

    public abstract int A(vu5 vu5);

    public int B() {
        return 0;
    }

    public void a(int i, Object obj) {
    }

    public final ExoPlaybackException c(MediaCodecUtil$DecoderQueryException mediaCodecUtil$DecoderQueryException, vu5 vu5) {
        return f(mediaCodecUtil$DecoderQueryException, vu5, false, 4002);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.exoplayer2.ExoPlaybackException f(java.lang.Exception r12, defpackage.vu5 r13, boolean r14, int r15) {
        /*
            r11 = this;
            r2 = 4
            if (r13 == 0) goto L_0x001b
            boolean r3 = r11.A0
            if (r3 != 0) goto L_0x001b
            r3 = 1
            r11.A0 = r3
            r3 = 0
            int r4 = r11.A(r13)     // Catch:{ ExoPlaybackException -> 0x0019, all -> 0x0014 }
            r4 = r4 & 7
            r11.A0 = r3
            goto L_0x001c
        L_0x0014:
            r0 = move-exception
            r2 = r0
            r11.A0 = r3
            throw r2
        L_0x0019:
            r11.A0 = r3
        L_0x001b:
            r4 = r2
        L_0x001c:
            java.lang.String r5 = r11.k()
            int r6 = r11.o
            com.google.android.exoplayer2.ExoPlaybackException r10 = new com.google.android.exoplayer2.ExoPlaybackException
            if (r13 != 0) goto L_0x0028
            r8 = r2
            goto L_0x0029
        L_0x0028:
            r8 = r4
        L_0x0029:
            r2 = 1
            r1 = r10
            r3 = r12
            r4 = r15
            r7 = r13
            r9 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pi0.f(java.lang.Exception, vu5, boolean, int):com.google.android.exoplayer2.ExoPlaybackException");
    }

    public c28 j() {
        return null;
    }

    public abstract String k();

    public final boolean l() {
        return this.y0 == Long.MIN_VALUE;
    }

    public abstract boolean m();

    public abstract boolean n();

    public abstract void o();

    public void p(boolean z, boolean z2) {
    }

    public abstract void q(long j, boolean z);

    public void r() {
    }

    public void s() {
    }

    public void t() {
    }

    public abstract void u(vu5[] vu5Arr, long j, long j2);

    public final int v(otf otf, m24 m24, int i) {
        xjc xjc = this.Z;
        xjc.getClass();
        int h = xjc.h(otf, m24, i);
        if (h == -4) {
            if (m24.f(4)) {
                this.y0 = Long.MIN_VALUE;
                return this.z0 ? -4 : -3;
            }
            long j = m24.Y + this.x0;
            m24.Y = j;
            this.y0 = Math.max(this.y0, j);
        } else if (h == -5) {
            vu5 vu5 = (vu5) otf.b;
            vu5.getClass();
            long j2 = vu5.E0;
            if (j2 != Long.MAX_VALUE) {
                tu5 a2 = vu5.a();
                a2.o = j2 + this.x0;
                otf.b = a2.a();
            }
        }
        return h;
    }

    public abstract void w(long j, long j2);

    public final void x(vu5[] vu5Arr, xjc xjc, long j, long j2) {
        swb.h(!this.z0);
        this.Z = xjc;
        if (this.y0 == Long.MIN_VALUE) {
            this.y0 = j;
        }
        this.w0 = vu5Arr;
        this.x0 = j2;
        u(vu5Arr, j, j2);
    }

    public final void y() {
        swb.h(this.Y == 0);
        this.b.w();
        r();
    }

    public void z(float f, float f2) {
    }
}
