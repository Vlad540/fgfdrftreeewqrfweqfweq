package defpackage;

import android.graphics.Bitmap;

/* renamed from: gs  reason: default package */
public final class gs extends mxa {
    public final cn0 a;
    public final lv1 b;

    public gs(cn0 cn0, lv1 lv1) {
        this.a = cn0;
        this.b = lv1;
    }

    public final e13 c(int i, int i2, Bitmap.Config config) {
        int c = mn0.c(i, i2, config);
        cn0 cn0 = this.a;
        Bitmap bitmap = (Bitmap) cn0.get(c);
        if (bitmap.getAllocationByteCount() >= mn0.b(config) * i * i2) {
            bitmap.reconfigure(i, i2, config);
            return e13.p0(bitmap, cn0, (nfc) this.b.b);
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
