package defpackage;

import java.nio.ByteBuffer;

/* renamed from: ou1  reason: default package */
public final class ou1 extends pi0 {
    public final m24 B0 = new m24(1);
    public final yze C0 = new yze(3, false);
    public long D0;
    public nu1 E0;
    public long F0;

    public ou1() {
        super(6);
    }

    public final int A(vu5 vu5) {
        return "application/x-camera-motion".equals(vu5.A0) ? pi0.b(4, 0, 0) : pi0.b(0, 0, 0);
    }

    public final void a(int i, Object obj) {
        if (i == 8) {
            this.E0 = (nu1) obj;
        }
    }

    public final String k() {
        return "CameraMotionRenderer";
    }

    public final boolean m() {
        return l();
    }

    public final boolean n() {
        return true;
    }

    public final void o() {
        nu1 nu1 = this.E0;
        if (nu1 != null) {
            nu1.c();
        }
    }

    public final void q(long j, boolean z) {
        this.F0 = Long.MIN_VALUE;
        nu1 nu1 = this.E0;
        if (nu1 != null) {
            nu1.c();
        }
    }

    public final void u(vu5[] vu5Arr, long j, long j2) {
        this.D0 = j2;
    }

    public final void w(long j, long j2) {
        float[] fArr;
        while (!l() && this.F0 < 100000 + j) {
            m24 m24 = this.B0;
            m24.v();
            otf otf = this.b;
            otf.w();
            if (v(otf, m24, 0) == -4 && !m24.f(4)) {
                this.F0 = m24.Y;
                if (this.E0 != null && !m24.f(Integer.MIN_VALUE)) {
                    m24.y();
                    ByteBuffer byteBuffer = m24.o;
                    int i = mze.a;
                    if (byteBuffer.remaining() != 16) {
                        fArr = null;
                    } else {
                        byte[] array = byteBuffer.array();
                        int limit = byteBuffer.limit();
                        yze yze = this.C0;
                        yze.F(limit, array);
                        yze.H(byteBuffer.arrayOffset() + 4);
                        float[] fArr2 = new float[3];
                        for (int i2 = 0; i2 < 3; i2++) {
                            fArr2[i2] = Float.intBitsToFloat(yze.j());
                        }
                        fArr = fArr2;
                    }
                    if (fArr != null) {
                        this.E0.b(this.F0 - this.D0, fArr);
                    }
                }
            } else {
                return;
            }
        }
    }
}
