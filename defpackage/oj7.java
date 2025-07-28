package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;

/* renamed from: oj7  reason: default package */
public final class oj7 extends Drawable implements Animatable {
    public final ObjectAnimator X;
    public final Context a;
    public final int b;
    public final t97 c;
    public final bg o;

    public oj7(int i, int i2, Context context) {
        this.a = context;
        this.b = i2;
        this.c = ez3.O(3, new z65(i, 1, this));
        bg bgVar = new bg("rotation", 0.0f);
        this.o = bgVar;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object) null, bgVar, new float[]{0.0f, 359.0f});
        ofFloat.setDuration(1200);
        ofFloat.setRepeatCount(-1);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new c00(11, this));
        this.X = ofFloat;
    }

    public final void draw(Canvas canvas) {
        canvas.save();
        canvas.rotate(this.o.a, (float) getBounds().centerX(), (float) getBounds().centerY());
        ((Drawable) this.c.getValue()).draw(canvas);
        canvas.restore();
    }

    public final int getIntrinsicHeight() {
        return getBounds().height();
    }

    public final int getIntrinsicWidth() {
        return getBounds().width();
    }

    public final int getOpacity() {
        return -3;
    }

    public final boolean isRunning() {
        return this.X.isRunning();
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        ((Drawable) this.c.getValue()).setBounds(rect);
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void start() {
        this.X.start();
    }

    public final void stop() {
        this.X.cancel();
    }
}
