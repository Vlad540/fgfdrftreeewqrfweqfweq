package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;

/* renamed from: po0  reason: default package */
public final class po0 extends ii0 {
    public static final /* synthetic */ int f = 0;
    public final yp6 c;
    public final int d;
    public final int e;

    public po0(yp6 yp6, int i, int i2) {
        this.c = yp6;
        this.d = i;
        this.e = i2;
    }

    public static void e(Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            try {
                bitmap.recycle();
            } catch (Exception unused) {
            }
        }
    }

    public final ov0 b() {
        return new ngd("radius=" + this.d + ",sampling=" + this.e);
    }

    public final void d(Bitmap bitmap, Bitmap bitmap2) {
        Bitmap bitmap3;
        int i = this.e;
        Bitmap bitmap4 = null;
        try {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap2.getWidth() / i, bitmap2.getHeight() / i, Bitmap.Config.ARGB_8888);
            try {
                Canvas canvas = new Canvas(createBitmap);
                float f2 = 1.0f / ((float) i);
                canvas.scale(f2, f2);
                Paint paint = new Paint();
                paint.setFlags(2);
                canvas.drawBitmap(bitmap2, 0.0f, 0.0f, paint);
                Bitmap a = this.c.a(createBitmap, this.d);
                try {
                    bitmap4 = Bitmap.createScaledBitmap(a, bitmap.getWidth(), bitmap.getHeight(), true);
                    a.recycle();
                    po0.super.d(bitmap, bitmap4);
                    e(a);
                    e(bitmap4);
                } catch (Throwable th) {
                    th = th;
                    bitmap3 = bitmap4;
                    bitmap4 = a;
                    try {
                        udd.s("po0", "process: failed to process blur", th);
                        throw th;
                    } catch (Throwable th2) {
                        e(bitmap4);
                        e(bitmap3);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                bitmap3 = null;
                bitmap4 = createBitmap;
                udd.s("po0", "process: failed to process blur", th);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            bitmap3 = null;
            udd.s("po0", "process: failed to process blur", th);
            throw th;
        }
    }

    public final String getName() {
        return po0.class.getSimpleName();
    }
}
