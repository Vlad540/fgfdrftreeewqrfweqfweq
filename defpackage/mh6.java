package defpackage;

import java.util.Arrays;

/* renamed from: mh6  reason: default package */
public final class mh6 extends xx2 {
    public byte[] A0;
    public byte[] y0;
    public volatile boolean z0;

    public final void a() {
        this.z0 = true;
    }

    public final void load() {
        try {
            this.x0.N(this.b);
            int i = 0;
            int i2 = 0;
            while (i != -1 && !this.z0) {
                byte[] bArr = this.y0;
                if (bArr.length < i2 + 16384) {
                    this.y0 = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i = this.x0.read(this.y0, i2, 16384);
                if (i != -1) {
                    i2 += i;
                }
            }
            if (!this.z0) {
                this.A0 = Arrays.copyOf(this.y0, i2);
            }
            bm3.f(this.x0);
        } catch (Throwable th) {
            bm3.f(this.x0);
            throw th;
        }
    }
}
