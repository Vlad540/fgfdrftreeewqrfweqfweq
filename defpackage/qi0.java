package defpackage;

import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException;

/* renamed from: qi0  reason: default package */
public abstract class qi0 implements jza {
    public long A0;
    public long B0;
    public boolean C0;
    public boolean D0;
    public vje E0;
    public h9c F0;
    public int X;
    public cza Y;
    public z7e Z;
    public final Object a = new Object();
    public final int b;
    public final qe4 c;
    public j9c o;
    public int w0;
    public yjc x0;
    public xu5[] y0;
    public long z0;

    public qi0(int i) {
        this.b = i;
        this.c = new qe4(19);
        this.B0 = Long.MIN_VALUE;
        this.E0 = vje.a;
    }

    public static int b(int i, int i2, int i3, int i4) {
        return i | i2 | i3 | 128 | i4;
    }

    public static int i(int i) {
        return i & 384;
    }

    public static int j(int i) {
        return i & 64;
    }

    public static boolean o(int i, boolean z) {
        int i2 = i & 7;
        return i2 == 4 || (z && i2 == 3);
    }

    public final void A(xu5[] xu5Arr, yjc yjc, long j, long j2, se8 se8) {
        oyb.k(!this.C0);
        this.x0 = yjc;
        if (this.B0 == Long.MIN_VALUE) {
            this.B0 = j;
        }
        this.y0 = xu5Arr;
        this.z0 = j2;
        x(xu5Arr, j, j2);
    }

    public final void B() {
        oyb.k(this.w0 == 0);
        this.c.t();
        u();
    }

    public void C(float f, float f2) {
    }

    public abstract int D(xu5 xu5);

    public int E() {
        return 0;
    }

    public void a(int i, Object obj) {
    }

    public final ExoPlaybackException c(MediaCodecUtil$DecoderQueryException mediaCodecUtil$DecoderQueryException, xu5 xu5) {
        return g(mediaCodecUtil$DecoderQueryException, xu5, false, 4002);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.media3.exoplayer.ExoPlaybackException g(java.lang.Throwable r12, defpackage.xu5 r13, boolean r14, int r15) {
        /*
            r11 = this;
            r2 = 4
            if (r13 == 0) goto L_0x001b
            boolean r3 = r11.D0
            if (r3 != 0) goto L_0x001b
            r3 = 1
            r11.D0 = r3
            r3 = 0
            int r4 = r11.D(r13)     // Catch:{ ExoPlaybackException -> 0x0019, all -> 0x0014 }
            r4 = r4 & 7
            r11.D0 = r3
            goto L_0x001c
        L_0x0014:
            r0 = move-exception
            r2 = r0
            r11.D0 = r3
            throw r2
        L_0x0019:
            r11.D0 = r3
        L_0x001b:
            r4 = r2
        L_0x001c:
            java.lang.String r5 = r11.l()
            int r6 = r11.X
            androidx.media3.exoplayer.ExoPlaybackException r10 = new androidx.media3.exoplayer.ExoPlaybackException
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qi0.g(java.lang.Throwable, xu5, boolean, int):androidx.media3.exoplayer.ExoPlaybackException");
    }

    public void h() {
    }

    public d28 k() {
        return null;
    }

    public abstract String l();

    public final boolean m() {
        return this.B0 == Long.MIN_VALUE;
    }

    public abstract boolean n();

    public abstract boolean p();

    public void q() {
    }

    public void r(boolean z, boolean z2) {
    }

    public void s(long j, boolean z) {
    }

    public void t() {
    }

    public void u() {
    }

    public void v() {
    }

    public void w() {
    }

    public abstract void x(xu5[] xu5Arr, long j, long j2);

    public final int y(qe4 qe4, n24 n24, int i) {
        yjc yjc = this.x0;
        yjc.getClass();
        int j = yjc.j(qe4, n24, i);
        if (j == -4) {
            if (n24.f(4)) {
                this.B0 = Long.MIN_VALUE;
                return this.C0 ? -4 : -3;
            }
            long j2 = n24.Z + this.z0;
            n24.Z = j2;
            this.B0 = Math.max(this.B0, j2);
        } else if (j == -5) {
            xu5 xu5 = (xu5) qe4.c;
            xu5.getClass();
            long j3 = xu5.s;
            if (j3 != Long.MAX_VALUE) {
                uu5 a2 = xu5.a();
                a2.r = j3 + this.z0;
                qe4.c = a2.a();
            }
        }
        return j;
    }

    public abstract void z(long j, long j2);
}
