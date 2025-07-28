package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.animation.LinearInterpolator;

/* renamed from: hxb  reason: default package */
public final class hxb extends Drawable implements Animatable {
    public final bg X;
    public final ObjectAnimator Y;
    public final Drawable a;
    public final ShapeDrawable b;
    public final bg c;
    public final ObjectAnimator o;

    public hxb(Context context) {
        Drawable b2 = gq3.b(context, n1a.M);
        b2.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        this.a = b2;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        Paint paint = shapeDrawable.getPaint();
        qda.c.a.getClass();
        paint.setColor(-16745729);
        this.b = shapeDrawable;
        bg bgVar = new bg("rotateAnimation", 90.0f);
        this.c = bgVar;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object) null, bgVar, new float[]{90.0f, 0.0f});
        ofFloat.setDuration(150);
        ofFloat.setRepeatCount(0);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new gxb(this, 0));
        this.o = ofFloat;
        bg bgVar2 = new bg("scaleAnimation", 0.5f);
        this.X = bgVar2;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((Object) null, bgVar2, new float[]{0.5f, 1.0f});
        ofFloat2.setDuration(150);
        ofFloat2.setRepeatCount(0);
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.addUpdateListener(new gxb(this, 1));
        this.Y = ofFloat2;
    }

    public static int a(int i) {
        return i >= a24.X(((float) 40) * dh4.c().getDisplayMetrics().density) ? a24.X(((float) 16) * dh4.c().getDisplayMetrics().density) : i >= a24.X(((float) 26) * dh4.c().getDisplayMetrics().density) ? a24.X(((float) 8) * dh4.c().getDisplayMetrics().density) : a24.X(((float) 4) * dh4.c().getDisplayMetrics().density);
    }

    public final void draw(Canvas canvas) {
        Drawable drawable = this.a;
        this.b.draw(canvas);
        int save = canvas.save();
        try {
            float centerX = (float) getBounds().centerX();
            float centerY = (float) getBounds().centerY();
            canvas.rotate(this.c.a, centerX, centerY);
            float f = this.X.a;
            canvas.scale(f, f, centerX, centerY);
            canvas.translate(centerX - ((float) drawable.getBounds().centerX()), centerY - ((float) drawable.getBounds().centerY()));
            drawable.draw(canvas);
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
        return this.o.isRunning() || this.Y.isRunning();
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.b.setBounds(rect);
        int a2 = a(rect.width());
        int a3 = a(rect.height());
        this.a.setBounds(0, 0, rect.width() - a2, rect.height() - a3);
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void start() {
        this.o.start();
        this.Y.start();
    }

    public final void stop() {
        this.o.cancel();
        this.Y.cancel();
    }
}
