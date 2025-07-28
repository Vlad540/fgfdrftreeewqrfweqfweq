package defpackage;

import java.nio.ByteBuffer;

/* renamed from: pu1  reason: default package */
public final class pu1 extends qi0 {
    public final n24 G0 = new n24(1);
    public final ija H0 = new ija();
    public long I0;
    public j45 J0;
    public long K0;

    public pu1() {
        super(6);
    }

    public final int D(xu5 xu5) {
        return "application/x-camera-motion".equals(xu5.n) ? qi0.b(4, 0, 0, 0) : qi0.b(0, 0, 0, 0);
    }

    public final void a(int i, Object obj) {
        if (i == 8) {
            this.J0 = (j45) obj;
        }
    }

    public final String l() {
        return "CameraMotionRenderer";
    }

    public final boolean n() {
        return m();
    }

    public final boolean p() {
        return true;
    }

    public final void q() {
        j45 j45 = this.J0;
        if (j45 != null) {
            j45.c();
        }
    }

    public final void s(long j, boolean z) {
        this.K0 = Long.MIN_VALUE;
        j45 j45 = this.J0;
        if (j45 != null) {
            j45.c();
        }
    }

    public final void x(xu5[] xu5Arr, long j, long j2) {
        this.I0 = j2;
    }

    public final void z(long j, long j2) {
        float[] fArr;
        while (!m() && this.K0 < 100000 + j) {
            n24 n24 = this.G0;
            n24.v();
            qe4 qe4 = this.c;
            qe4.t();
            if (y(qe4, n24, 0) == -4 && !n24.f(4)) {
                long j3 = n24.Z;
                this.K0 = j3;
                boolean z = j3 < this.A0;
                if (this.J0 != null && !z) {
                    n24.y();
                    ByteBuffer byteBuffer = n24.X;
                    int i = oze.a;
                    if (byteBuffer.remaining() != 16) {
                        fArr = null;
                    } else {
                        byte[] array = byteBuffer.array();
                        int limit = byteBuffer.limit();
                        ija ija = this.H0;
                        ija.E(limit, array);
                        ija.G(byteBuffer.arrayOffset() + 4);
                        float[] fArr2 = new float[3];
                        for (int i2 = 0; i2 < 3; i2++) {
                            fArr2[i2] = Float.intBitsToFloat(ija.i());
                        }
                        fArr = fArr2;
                    }
                    if (fArr != null) {
                        this.J0.b(this.K0 - this.I0, fArr);
                    }
                }
            } else {
                return;
            }
        }
    }
}
