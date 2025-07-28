package defpackage;

import android.media.MediaCodec;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.transformer.ExportException;

/* renamed from: n8f  reason: default package */
public final class n8f extends qjc {
    public final ydc e;
    public final m8f f;
    public final n24 g;
    public final long h;
    public volatile long i = -9223372036854775807L;
    public boolean j;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public n8f(android.content.Context r14, defpackage.xu5 r15, defpackage.iqe r16, defpackage.lk9 r17, java.util.List r18, defpackage.k4f r19, defpackage.l13 r20, defpackage.ad9 r21, xle r22, defpackage.s39 r23, defpackage.pv0 r24, long r25, boolean r27) {
        /*
            r13 = this;
            r0 = r13
            r1 = r15
            r2 = r21
            r13.<init>(r15, r2)
            r3 = r25
            r0.h = r3
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.i = r3
            z23 r3 = r1.A
            r3.getClass()
            int r4 = r3.c
            r5 = 2
            if (r4 != r5) goto L_0x0036
            java.lang.String r4 = r1.n
            java.lang.String r6 = "image/jpeg_r"
            boolean r4 = java.util.Objects.equals(r4, r6)
            if (r4 == 0) goto L_0x0033
            z23 r4 = new z23
            r12 = 0
            r11 = -1
            r7 = 6
            r8 = 1
            r9 = 7
            r6 = r4
            r10 = r11
            r6.<init>(r7, r8, r9, r10, r11, r12)
            goto L_0x0037
        L_0x0033:
            z23 r4 = defpackage.z23.h
            goto L_0x0037
        L_0x0036:
            r4 = r3
        L_0x0037:
            m8f r12 = new m8f
            uu5 r1 = r15.a()
            r1.z = r4
            xu5 r8 = new xu5
            r8.<init>(r1)
            vc9 r1 = r2.b
            ws6 r9 = r1.b(r5)
            r6 = r12
            r7 = r20
            r10 = r16
            r11 = r23
            r6.<init>(r7, r8, r9, r10, r11)
            r0.f = r12
            n24 r1 = new n24
            r2 = 0
            r1.<init>(r2)
            r0.g = r1
            int r1 = r12.g
            if (r1 != r5) goto L_0x006c
            boolean r1 = defpackage.z23.g(r3)
            if (r1 == 0) goto L_0x006c
            z23 r1 = defpackage.z23.h
            r5 = r1
            goto L_0x006d
        L_0x006c:
            r5 = r4
        L_0x006d:
            ydc r10 = new ydc     // Catch:{ VideoFrameProcessingException -> 0x007a }
            if (r27 == 0) goto L_0x007c
            gk9 r1 = new gk9     // Catch:{ VideoFrameProcessingException -> 0x007a }
            r2 = 18
            r1.<init>((int) r2)     // Catch:{ VideoFrameProcessingException -> 0x007a }
        L_0x0078:
            r4 = r1
            goto L_0x0084
        L_0x007a:
            r0 = move-exception
            goto L_0x0098
        L_0x007c:
            qqe r1 = new qqe     // Catch:{ VideoFrameProcessingException -> 0x007a }
            r2 = r19
            r1.<init>(r2)     // Catch:{ VideoFrameProcessingException -> 0x007a }
            goto L_0x0078
        L_0x0084:
            r1 = r10
            r2 = r13
            r3 = r14
            r6 = r22
            r7 = r24
            r8 = r17
            r9 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ VideoFrameProcessingException -> 0x007a }
            r0.e = r10     // Catch:{ VideoFrameProcessingException -> 0x007a }
            r10.a()     // Catch:{ VideoFrameProcessingException -> 0x007a }
            return
        L_0x0098:
            androidx.media3.transformer.ExportException r1 = new androidx.media3.transformer.ExportException
            java.lang.String r2 = "Video frame processing error"
            r3 = 5001(0x1389, float:7.008E-42)
            r1.<init>(r2, r0, r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n8f.<init>(android.content.Context, xu5, iqe, lk9, java.util.List, k4f, l13, ad9, xle, s39, pv0, long, boolean):void");
    }

    public final ob6 j(gs4 gs4, xu5 xu5, int i2) {
        try {
            return ((tqe) this.e.b).h(i2);
        } catch (VideoFrameProcessingException e2) {
            throw new ExportException("Video frame processing error", e2, 5001);
        }
    }

    public final n24 k() {
        n24 n24 = this.g;
        m8f m8f = this.f;
        MediaCodec.BufferInfo bufferInfo = null;
        n24.X = m8f.i != null ? m8f.i.c() : null;
        if (this.g.X == null) {
            return null;
        }
        m8f m8f2 = this.f;
        if (m8f2.i != null) {
            w54 w54 = m8f2.i;
            if (w54.f(false)) {
                bufferInfo = w54.a;
            }
        }
        bufferInfo.getClass();
        if (bufferInfo.presentationTimeUs == 0) {
            if (((tqe) this.e.b).k() != this.j || this.i == -9223372036854775807L || bufferInfo.size <= 0) {
                this.j = true;
            } else {
                bufferInfo.presentationTimeUs = this.i;
            }
        }
        n24 n242 = this.g;
        n242.Z = bufferInfo.presentationTimeUs;
        n242.b = bufferInfo.flags;
        return n242;
    }

    public final xu5 l() {
        m8f m8f = this.f;
        if (m8f.i == null) {
            return null;
        }
        w54 w54 = m8f.i;
        w54.f(false);
        xu5 xu5 = w54.j;
        if (xu5 == null || m8f.j == 0) {
            return xu5;
        }
        uu5 a = xu5.a();
        a.v = m8f.j;
        return new xu5(a);
    }

    public final boolean m() {
        m8f m8f = this.f;
        return m8f.i != null && m8f.i.d();
    }

    public final void o() {
        this.e.release();
        m8f m8f = this.f;
        if (m8f.i != null) {
            m8f.i.h();
        }
        m8f.k = true;
    }

    public final void p() {
        m8f m8f = this.f;
        if (m8f.i != null) {
            m8f.i.i();
        }
    }
}
