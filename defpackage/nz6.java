package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: nz6  reason: default package */
public final class nz6 implements Runnable {
    public final float X;
    public final float Y;
    public final float Z;
    public final WeakReference a;
    public final long b = 200;
    public final long c = System.currentTimeMillis();
    public final float o;

    public nz6(oz6 oz6, float f, float f2, float f3, float f4) {
        this.a = new WeakReference(oz6);
        this.o = f;
        this.X = f2;
        this.Y = f3;
        this.Z = f4;
    }

    public final void run() {
        oz6 oz6 = (oz6) this.a.get();
        if (oz6 != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.c;
            long j = this.b;
            float min = (float) Math.min(j, currentTimeMillis);
            float f = (float) j;
            float h = js.h(min, this.X, f);
            if (min < f) {
                oz6.k(this.o + h, this.Y, this.Z);
                oz6.post(this);
                return;
            }
            oz6.setImageToWrapCropBounds(true);
        }
    }
}
