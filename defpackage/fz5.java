package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;

/* renamed from: fz5  reason: default package */
public final class fz5 extends ii0 {
    public final v2f c;
    public final long d;
    public final String e = fz5.class.getName();

    public fz5(v2f v2f, long j) {
        this.c = v2f;
        this.d = j;
    }

    public final e13 a(Bitmap bitmap, mxa mxa) {
        v2f v2f = this.c;
        xx b = v2f.b();
        if (b == null) {
            udd.T(this.e, "No video collage", new Object[0]);
            mxa.getClass();
            return mxa.b(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), (Matrix) null);
        }
        int c2 = (int) v2f.c();
        int i = b.X;
        int width = bitmap.getWidth();
        int i2 = b.o;
        int i3 = width / i2;
        int i4 = ((int) this.d) / (c2 / i);
        int i5 = i - 1;
        int i6 = b.c;
        return mxa.b(bitmap, (Math.min(i4, i5) % i3) * i2, (Math.min(i4, i5) / i3) * i6, b.o, i6, (Matrix) null);
    }

    public final ov0 b() {
        StringBuilder k = hr1.k(this.c.e(), "videoId=", ", millis=");
        k.append(this.d);
        return new ngd(k.toString());
    }

    public final String getName() {
        return fz5.class.getSimpleName();
    }
}
