package defpackage;

import android.net.Uri;
import java.util.Map;

/* renamed from: ko6  reason: default package */
public final class ko6 implements oz3 {
    public int X;
    public final oz3 a;
    public final int b;
    public final rgb c;
    public final byte[] o;

    public ko6(oz3 oz3, int i, rgb rgb) {
        swb.e(i > 0);
        this.a = oz3;
        this.b = i;
        this.c = rgb;
        this.o = new byte[1];
        this.X = i;
    }

    public final long N(xz3 xz3) {
        throw new UnsupportedOperationException();
    }

    public final void O(bqe bqe) {
        bqe.getClass();
        this.a.O(bqe);
    }

    public final Map a() {
        return this.a.a();
    }

    public final void close() {
        throw new UnsupportedOperationException();
    }

    public final Uri getUri() {
        return this.a.getUri();
    }

    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.X;
        oz3 oz3 = this.a;
        if (i3 == 0) {
            byte[] bArr2 = this.o;
            int i4 = 0;
            if (oz3.read(bArr2, 0, 1) != -1) {
                int i5 = (bArr2[0] & 255) << 4;
                if (i5 != 0) {
                    byte[] bArr3 = new byte[i5];
                    int i6 = i5;
                    while (i6 > 0) {
                        int read = oz3.read(bArr3, i4, i6);
                        if (read != -1) {
                            i4 += read;
                            i6 -= read;
                        }
                    }
                    while (i5 > 0 && bArr3[i5 - 1] == 0) {
                        i5--;
                    }
                    if (i5 > 0) {
                        yze yze = new yze(i5, bArr3);
                        rgb rgb = this.c;
                        long max = !rgb.C0 ? rgb.y0 : Math.max(rgb.D0.h(), rgb.y0);
                        int c2 = yze.c();
                        vjc vjc = rgb.B0;
                        vjc.getClass();
                        vjc.c(c2, yze);
                        vjc.b(max, 1, c2, 0, (yoe) null);
                        rgb.C0 = true;
                    }
                }
                this.X = this.b;
            }
            return -1;
        }
        int read2 = oz3.read(bArr, i, Math.min(this.X, i2));
        if (read2 != -1) {
            this.X -= read2;
        }
        return read2;
    }
}
