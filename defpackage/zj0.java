package defpackage;

import java.nio.ByteBuffer;

/* renamed from: zj0  reason: default package */
public final class zj0 extends n24 {
    public int A0;
    public int B0;
    public long z0;

    public final boolean A() {
        return this.A0 > 0;
    }

    public final void v() {
        super.v();
        this.A0 = 0;
    }

    public final boolean z(n24 n24) {
        ByteBuffer byteBuffer;
        oyb.d(!n24.f(1073741824));
        oyb.d(!n24.f(268435456));
        oyb.d(!n24.f(4));
        if (A()) {
            if (this.A0 >= this.B0) {
                return false;
            }
            ByteBuffer byteBuffer2 = n24.X;
            if (!(byteBuffer2 == null || (byteBuffer = this.X) == null)) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i = this.A0;
        this.A0 = i + 1;
        if (i == 0) {
            this.Z = n24.Z;
            if (n24.f(1)) {
                this.b = 1;
            }
        }
        ByteBuffer byteBuffer3 = n24.X;
        if (byteBuffer3 != null) {
            x(byteBuffer3.remaining());
            this.X.put(byteBuffer3);
        }
        this.z0 = n24.Z;
        return true;
    }
}
