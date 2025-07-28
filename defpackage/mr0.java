package defpackage;

import android.graphics.Bitmap;

/* renamed from: mr0  reason: default package */
public final class mr0 extends hi0 implements cn0 {
    public mr0(lk9 lk9, h0b h0b, mk9 mk9) {
        super(lk9, h0b, mk9);
        this.y0 = false;
        lk9.getClass();
        mk9.getClass();
    }

    public final Object a(int i) {
        return Bitmap.createBitmap(1, (int) Math.ceil(((double) i) / 2.0d), Bitmap.Config.RGB_565);
    }

    public final void c(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        bitmap.getClass();
        bitmap.recycle();
    }

    public final int e(int i) {
        return i;
    }

    public final int f(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        bitmap.getClass();
        return bitmap.getAllocationByteCount();
    }

    public final int h(int i) {
        return i;
    }

    public final Object i(kr0 kr0) {
        Bitmap bitmap = (Bitmap) super.i(kr0);
        if (bitmap != null) {
            bitmap.eraseColor(0);
        }
        return bitmap;
    }

    public final boolean k(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        bitmap.getClass();
        return !bitmap.isRecycled() && bitmap.isMutable();
    }
}
