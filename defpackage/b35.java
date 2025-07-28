package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* renamed from: b35  reason: default package */
public final class b35 extends c35 {
    public final k13 T0;
    public boolean U0;

    public b35(jg8 jg8, xw2 xw2, zs zsVar) {
        super(1, xw2, zsVar);
        this.T0 = jg8;
    }

    public final boolean G() {
        n24 d = this.I0.d();
        if (d == null) {
            return false;
        }
        if (!this.U0) {
            if (this.J0.d()) {
                ByteBuffer byteBuffer = d.X;
                byteBuffer.getClass();
                byteBuffer.limit(0);
                d.a(4);
                this.K0 = this.I0.f();
                return false;
            }
            ByteBuffer c = this.J0.c();
            if (c == null) {
                return false;
            }
            d.x(c.limit());
            d.X.put(c).flip();
            w54 w54 = this.J0;
            MediaCodec.BufferInfo bufferInfo = w54.f(false) ? w54.a : null;
            bufferInfo.getClass();
            d.Z = bufferInfo.presentationTimeUs;
            d.b = bufferInfo.flags;
            this.J0.i();
            this.U0 = true;
        }
        if (!this.I0.f()) {
            return false;
        }
        this.U0 = false;
        return true;
    }

    public final void H(xu5 xu5) {
        this.J0 = this.T0.d(xu5);
    }

    public final boolean P(n24 n24) {
        if (n24.f(4)) {
            return false;
        }
        long j = n24.Z - this.G0;
        n24.Z = j;
        if (this.J0 == null || j >= 0) {
            return false;
        }
        n24.v();
        return true;
    }

    public final String l() {
        return "ExoAssetLoaderAudioRenderer";
    }
}
