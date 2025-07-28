package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;

/* renamed from: q64  reason: default package */
public final class q64 implements wm4 {
    public final Resources a;
    public final wm4 b;
    public final wm4 c = null;

    public q64(Resources resources, h54 h54) {
        this.a = resources;
        this.b = h54;
    }

    /* JADX INFO: finally extract failed */
    public final Drawable a(b13 b13) {
        try {
            n06.s();
            if (b13 instanceof CloseableStaticBitmap) {
                CloseableStaticBitmap closeableStaticBitmap = (CloseableStaticBitmap) b13;
                BitmapDrawable bitmapDrawable = new BitmapDrawable(this.a, closeableStaticBitmap.getUnderlyingBitmap());
                if (closeableStaticBitmap.getRotationAngle() == 0 || closeableStaticBitmap.getRotationAngle() == -1) {
                    if (closeableStaticBitmap.getExifOrientation() == 1 || closeableStaticBitmap.getExifOrientation() == 0) {
                        n06.s();
                        return bitmapDrawable;
                    }
                }
                pga pga = new pga(bitmapDrawable, closeableStaticBitmap.getRotationAngle(), closeableStaticBitmap.getExifOrientation());
                n06.s();
                return pga;
            }
            wm4 wm4 = this.b;
            if (wm4 != null) {
                if (wm4.b(b13)) {
                    Drawable a2 = wm4.a(b13);
                    n06.s();
                    return a2;
                }
            }
            wm4 wm42 = this.c;
            if (wm42 != null) {
                if (wm42.b(b13)) {
                    Drawable a3 = wm42.a(b13);
                    n06.s();
                    return a3;
                }
            }
            n06.s();
            return null;
        } catch (Throwable th) {
            n06.s();
            throw th;
        }
    }

    public final boolean b(b13 b13) {
        return true;
    }
}
