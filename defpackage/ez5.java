package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import java.util.Locale;

/* renamed from: ez5  reason: default package */
public final class ez5 extends ii0 {
    public final u2f c;
    public final long d;

    public ez5(u2f u2f, long j) {
        this.c = u2f;
        this.d = j;
    }

    public final e13 a(Bitmap bitmap, mxa mxa) {
        jj0 jj0 = (jj0) this.c;
        xx xxVar = jj0.f;
        if (xxVar == null) {
            udd.s("ez5", "No video collage", (Throwable) null);
            mxa.getClass();
            return mxa.b(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), (Matrix) null);
        }
        int i = (int) jj0.a;
        int i2 = xxVar.X;
        int width = bitmap.getWidth();
        int i3 = xxVar.o;
        int i4 = width / i3;
        int i5 = ((int) this.d) / (i / i2);
        int i6 = i2 - 1;
        int i7 = xxVar.c;
        return mxa.b(bitmap, (Math.min(i5, i6) % i4) * i3, (Math.min(i5, i6) / i4) * i7, xxVar.o, i7, (Matrix) null);
    }

    public final ov0 b() {
        Locale locale = Locale.ENGLISH;
        StringBuilder k = hr1.k(((jj0) this.c).e, "videoId=", ", millis=");
        k.append(this.d);
        return new ngd(k.toString());
    }

    public final String getName() {
        return ez5.class.getSimpleName();
    }
}
