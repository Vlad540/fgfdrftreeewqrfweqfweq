package defpackage;

import android.graphics.Bitmap;

/* renamed from: sp4  reason: default package */
public final class sp4 implements cn0 {
    public final void g(Object obj) {
        ((Bitmap) obj).recycle();
    }

    public final Object get(int i) {
        return Bitmap.createBitmap(1, (int) Math.ceil(((double) i) / 2.0d), Bitmap.Config.RGB_565);
    }
}
