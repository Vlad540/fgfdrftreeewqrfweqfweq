package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: ux3  reason: default package */
public final class ux3 extends lw7 {
    public static final /* synthetic */ int O0 = 0;
    public tx3 N0;

    public ux3(tx3 tx3) {
        super((kw7) tx3);
        this.N0 = tx3;
    }

    public final void g(Canvas canvas) {
        if (this.N0.v.isEmpty()) {
            super.g(canvas);
            return;
        }
        canvas.save();
        canvas.clipOutRect(this.N0.v);
        super.g(canvas);
        canvas.restore();
    }

    public final Drawable mutate() {
        this.N0 = new tx3(this.N0);
        return this;
    }

    public final void r(float f, float f2, float f3, float f4) {
        RectF rectF = this.N0.v;
        if (f != rectF.left || f2 != rectF.top || f3 != rectF.right || f4 != rectF.bottom) {
            rectF.set(f, f2, f3, f4);
            invalidateSelf();
        }
    }
}
