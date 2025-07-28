package defpackage;

import android.graphics.Bitmap;

/* renamed from: mm0  reason: default package */
public final class mm0 {
    public int a;
    public long b;
    public final int c;
    public final int d;
    public final wwc e;

    public mm0(int i, int i2) {
        boolean z = false;
        if (i > 0) {
            if (i2 > 0 ? true : z) {
                this.c = i;
                this.d = i2;
                this.e = new wwc(3, this);
                return;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    public final synchronized void a(Bitmap bitmap) {
        int d2 = mn0.d(bitmap);
        boolean z = false;
        ez3.k("No bitmaps registered.", this.a > 0);
        long j = (long) d2;
        if (j <= this.b) {
            z = true;
        }
        ez3.l(z, "Bitmap size bigger than the total registered size: %d, %d", Integer.valueOf(d2), Long.valueOf(this.b));
        this.b -= j;
        this.a--;
    }

    public final synchronized int b() {
        return this.d;
    }
}
