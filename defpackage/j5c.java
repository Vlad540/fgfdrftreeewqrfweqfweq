package defpackage;

import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.animation.LinearInterpolator;

/* renamed from: j5c  reason: default package */
public final class j5c extends Drawable implements Animatable {
    public final t97 X = ez3.O(3, new k6b(25));
    public final t97 Y = ez3.O(3, new k6b(26));
    public final hg a;
    public final ObjectAnimator b;
    public final hg c;
    public final ObjectAnimator o;

    public j5c() {
        hg hgVar = new hg("bgAlpha", 255);
        this.a = hgVar;
        ObjectAnimator ofInt = ObjectAnimator.ofInt((Object) null, hgVar, new int[]{255, 128, 255});
        ofInt.setDuration(2000);
        ofInt.setRepeatCount(-1);
        ofInt.setInterpolator(new LinearInterpolator());
        ofInt.addUpdateListener(new i5c(this, 0));
        this.b = ofInt;
        hg hgVar2 = new hg("indicatorAlpha", 255);
        this.c = hgVar2;
        ObjectAnimator ofInt2 = ObjectAnimator.ofInt((Object) null, hgVar2, new int[]{255, 0, 255});
        ofInt2.setDuration(2000);
        ofInt2.setRepeatCount(-1);
        ofInt2.setInterpolator(new LinearInterpolator());
        ofInt2.addUpdateListener(new i5c(this, 1));
        this.o = ofInt2;
    }

    public final void draw(Canvas canvas) {
        t97 t97 = this.X;
        ((ShapeDrawable) t97.getValue()).setAlpha(this.a.a);
        ((ShapeDrawable) t97.getValue()).draw(canvas);
        t97 t972 = this.Y;
        int save = canvas.save();
        canvas.translate((float) ((getBounds().width() / 2) - (((ShapeDrawable) t972.getValue()).getBounds().width() / 2)), (float) ((getBounds().height() / 2) - (((ShapeDrawable) t972.getValue()).getBounds().height() / 2)));
        try {
            ((ShapeDrawable) t972.getValue()).setAlpha(this.c.a);
            ((ShapeDrawable) t972.getValue()).draw(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
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
        return this.b.isRunning() || this.o.isRunning();
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        ((ShapeDrawable) this.X.getValue()).setBounds(0, 0, rect.width(), rect.height());
        int min = Math.min(rect.height(), rect.width()) / 3;
        ((ShapeDrawable) this.Y.getValue()).setBounds(0, 0, min, min);
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void start() {
        this.b.start();
        this.o.start();
    }

    public final void stop() {
        this.b.cancel();
        this.o.cancel();
    }
}
