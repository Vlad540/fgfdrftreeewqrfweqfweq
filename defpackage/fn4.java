package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* renamed from: fn4  reason: default package */
public final class fn4 extends ow5 {
    public final Drawable X;
    public final int Y;
    public final int Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fn4(Drawable drawable, Drawable drawable2) {
        super(drawable);
        int intrinsicWidth = drawable2.getIntrinsicWidth();
        int intrinsicHeight = drawable2.getIntrinsicHeight();
        this.X = drawable2;
        this.Y = intrinsicWidth;
        this.Z = intrinsicHeight;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [ow5, fn4, android.graphics.drawable.Drawable] */
    public final void draw(Canvas canvas) {
        fn4.super.draw(canvas);
        int centerX = getBounds().centerX();
        int i = this.Y;
        int centerY = getBounds().centerY();
        int i2 = this.Z;
        Drawable drawable = this.X;
        drawable.setBounds(centerX - (i / 2), centerY - (i2 / 2), (i / 2) + getBounds().centerX(), (i2 / 2) + getBounds().centerY());
        drawable.draw(canvas);
    }
}
