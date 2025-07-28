package defpackage;

import android.graphics.RectF;
import java.lang.ref.WeakReference;

/* renamed from: mz6  reason: default package */
public final class mz6 implements Runnable {
    public final float X;
    public final float Y;
    public final float Z;
    public final WeakReference a;
    public final long b = 500;
    public final long c = System.currentTimeMillis();
    public final float o;
    public final float w0;
    public final float x0;
    public final boolean y0;

    public mz6(oz6 oz6, float f, float f2, float f3, float f4, float f5, float f6, boolean z) {
        this.a = new WeakReference(oz6);
        this.o = f;
        this.X = f2;
        this.Y = f3;
        this.Z = f4;
        this.w0 = f5;
        this.x0 = f6;
        this.y0 = z;
    }

    public final void run() {
        oz6 oz6 = (oz6) this.a.get();
        if (oz6 != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.c;
            long j = this.b;
            float min = (float) Math.min(j, currentTimeMillis);
            float f = (float) j;
            float f2 = (min / f) - 1.0f;
            float f3 = (f2 * f2 * f2) + 1.0f;
            float f4 = (this.Y * f3) + 0.0f;
            float f5 = (f3 * this.Z) + 0.0f;
            float h = js.h(min, this.x0, f);
            if (min < f) {
                float[] fArr = oz6.w0;
                oz6.g(f4 - (fArr[0] - this.o), f5 - (fArr[1] - this.X));
                if (!this.y0) {
                    RectF rectF = oz6.G0;
                    oz6.k(this.w0 + h, rectF.centerX(), rectF.centerY());
                }
                if (!oz6.j(oz6.o)) {
                    oz6.post(this);
                }
            }
        }
    }
}
