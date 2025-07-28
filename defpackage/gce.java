package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.renderscript.RenderScript;

/* renamed from: gce  reason: default package */
public final class gce implements ko0 {
    public final Paint a;
    public final t97 b;

    public gce(Context context) {
        Paint paint = new Paint();
        paint.setDither(true);
        paint.setAntiAlias(true);
        this.a = paint;
        this.b = ez3.O(2, new shd(context, 8));
    }

    public final void a(int i) {
        this.a.setAlpha(i);
    }

    public final void b() {
        r7e r7e = ((yp6) this.b.getValue()).a;
        if (r7e.a()) {
            ((RenderScript) r7e.getValue()).destroy();
        }
    }

    public final void c(Canvas canvas, Bitmap bitmap) {
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.a);
    }

    public final void d(Bitmap bitmap, float f) {
        ((yp6) this.b.getValue()).a(bitmap, a24.X(f));
    }
}
