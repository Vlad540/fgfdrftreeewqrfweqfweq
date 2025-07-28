package defpackage;

import android.content.Context;
import android.graphics.Bitmap;

/* renamed from: km0  reason: default package */
public abstract class km0 {
    public static Context a(Context context, int i) {
        return context.createDeviceContext(i);
    }

    public static int b(Context context) {
        return context.getDeviceId();
    }

    public static int c(Context context) {
        return context.getDeviceId();
    }

    public static boolean d(Bitmap bitmap) {
        return bitmap.hasGainmap();
    }
}
