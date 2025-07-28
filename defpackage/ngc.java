package defpackage;

import android.graphics.Canvas;

/* renamed from: ngc  reason: default package */
public final class ngc extends mgc {
    public final void draw(Canvas canvas) {
        n06.s();
        if (this.b || this.c || this.o > 0.0f) {
            f();
            d();
            canvas.clipPath(this.X);
            super.draw(canvas);
            n06.s();
            return;
        }
        super.draw(canvas);
        n06.s();
    }
}
