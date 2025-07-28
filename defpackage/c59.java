package defpackage;

import android.animation.ValueAnimator;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;

/* renamed from: c59  reason: default package */
public final class c59 extends Drawable implements ValueAnimator.AnimatorUpdateListener, Animatable, mhe {
    public static final int[] x0 = {-16724737, -16767233, -5963578};
    public static final int[] y0 = {-16724737, -16767233, -5963578};
    public static final int[] z0 = {-2500135, 14277081};
    public final int[] X;
    public final Path Y;
    public final Paint Z;
    public final Paint a = new Paint();
    public final Paint b;
    public final Matrix c;
    public LinearGradient o;
    public final t97 w0;

    public c59() {
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        this.b = paint;
        this.c = new Matrix();
        this.X = x0;
        this.Y = new Path();
        Paint paint2 = new Paint();
        paint2.setAlpha(255);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setMaskFilter(new BlurMaskFilter(128.0f, BlurMaskFilter.Blur.NORMAL));
        this.Z = paint2;
        this.w0 = ez3.O(3, new qk8(7, this));
    }

    public final void a(int[] iArr) {
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, (float) getBounds().width(), 0.0f, iArr, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.MIRROR);
        this.o = linearGradient;
        this.a.setShader(linearGradient);
    }

    public final void draw(Canvas canvas) {
        int saveLayer = canvas.saveLayer(new RectF(getBounds()), (Paint) null);
        canvas.drawRect(getBounds(), this.a);
        canvas.drawRect(getBounds(), this.b);
        canvas.drawPath(this.Y, this.Z);
        canvas.restoreToCount(saveLayer);
    }

    public final int getOpacity() {
        return -3;
    }

    public final boolean isRunning() {
        return ((ValueAnimator) this.w0.getValue()).isRunning();
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        Matrix matrix = this.c;
        matrix.setTranslate(floatValue, 0.0f);
        LinearGradient linearGradient = this.o;
        if (linearGradient != null) {
            linearGradient.setLocalMatrix(matrix);
        }
        invalidateSelf();
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        a(this.X);
        this.b.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, (float) getBounds().height(), z0, (float[]) null, Shader.TileMode.CLAMP));
        ((ValueAnimator) this.w0.getValue()).setFloatValues(new float[]{((float) getBounds().width()) * 2.0f, 0.0f});
        int height = getBounds().height();
        Path path = this.Y;
        path.reset();
        float width = ((float) getBounds().width()) / 2.0f;
        float f = dh4.c().getDisplayMetrics().density * 24.0f;
        float f2 = (float) height;
        path.addOval(0.0f - width, (f2 - (dh4.c().getDisplayMetrics().density * 187.0f)) + f, ((float) getBounds().width()) + width, f2 + f, Path.Direction.CW);
    }

    public final void onThemeChanged(pda pda) {
        a(pda instanceof qda ? y0 : x0);
        this.Z.setColor(pda.b().i);
        invalidateSelf();
    }

    public final void setAlpha(int i) {
        this.a.setAlpha(i);
        this.Z.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
        this.Z.setColorFilter(colorFilter);
    }

    public final void start() {
        t97 t97 = this.w0;
        if (!((ValueAnimator) t97.getValue()).isRunning()) {
            ((ValueAnimator) t97.getValue()).start();
        }
    }

    public final void stop() {
        ((ValueAnimator) this.w0.getValue()).cancel();
    }
}
