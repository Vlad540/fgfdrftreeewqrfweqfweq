package defpackage;

import android.graphics.Rect;
import android.util.Size;

/* renamed from: c4d  reason: default package */
public final class c4d extends qw5 {
    public final pq6 X;
    public final int Y;
    public final int Z;
    public final Object o = new Object();

    public c4d(lr6 lr6, Size size, pq6 pq6) {
        super(lr6);
        if (size == null) {
            this.Y = this.b.getWidth();
            this.Z = this.b.getHeight();
        } else {
            this.Y = size.getWidth();
            this.Z = size.getHeight();
        }
        this.X = pq6;
    }

    public final void d(Rect rect) {
        if (rect != null) {
            Rect rect2 = new Rect(rect);
            if (!rect2.intersect(0, 0, this.Y, this.Z)) {
                rect2.setEmpty();
            }
        }
        synchronized (this.o) {
        }
    }

    public final int getHeight() {
        return this.Z;
    }

    public final pq6 getImageInfo() {
        return this.X;
    }

    public final int getWidth() {
        return this.Y;
    }
}
