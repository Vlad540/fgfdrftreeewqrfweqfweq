package defpackage;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;

/* renamed from: w39  reason: default package */
public final class w39 extends Drawable implements Animatable {
    public final ObjectAnimator X;
    public final bg Y;
    public final ObjectAnimator Z;
    public final Context a;
    public final t97 b = ez3.O(3, new qk8(5, this));
    public final t97 c = ez3.O(3, new m29(1));
    public final hg o;
    public final Path w0;
    public float x0;

    public w39(Context context) {
        this.a = context;
        hg hgVar = new hg("waveX", 0);
        this.o = hgVar;
        ObjectAnimator ofInt = ObjectAnimator.ofInt((Object) null, hgVar, new int[]{0, getBounds().width()});
        ofInt.setDuration(1000);
        ofInt.setRepeatCount(-1);
        ofInt.setInterpolator(new LinearInterpolator());
        ofInt.addUpdateListener(new v39(this, 0));
        this.X = ofInt;
        bg bgVar = new bg("volume", 0.0f);
        this.Y = bgVar;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object) null, bgVar, new float[]{0.0f, 0.7f});
        ofFloat.setDuration(150);
        ofFloat.setRepeatCount(0);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new v39(this, 1));
        this.Z = ofFloat;
        this.w0 = new Path();
        this.x0 = 0.7f;
    }

    public final void a(Path path) {
        float width = (float) getBounds().width();
        float height = (float) getBounds().height();
        float f = height - (this.Y.a * height);
        float f2 = (float) 4;
        float X2 = f + ((float) (a24.X(dh4.c().getDisplayMetrics().density * f2) / 2));
        path.rewind();
        path.moveTo(0.0f, X2);
        float f3 = width / 3.0f;
        float f4 = f3 * ((float) 2);
        path.cubicTo(f3, f + ((float) (a24.X(dh4.c().getDisplayMetrics().density * f2) / 2)), f4, f, width, f + ((float) (a24.X(f2 * dh4.c().getDisplayMetrics().density) / 2)));
        path.lineTo(width, height);
        path.lineTo(0.0f, height);
        path.lineTo(0.0f, X2);
    }

    public final void draw(Canvas canvas) {
        int saveLayer = canvas.saveLayer(new RectF(getBounds()), (Paint) null);
        t97 t97 = this.b;
        ((Drawable) t97.getValue()).draw(canvas);
        hg hgVar = this.o;
        canvas.translate(-((float) hgVar.a), 0.0f);
        Path path = this.w0;
        t97 t972 = this.c;
        canvas.drawPath(path, (Paint) t972.getValue());
        canvas.translate((float) ((Drawable) t97.getValue()).getIntrinsicWidth(), 0.0f);
        canvas.drawPath(path, (Paint) t972.getValue());
        canvas.translate(((float) hgVar.a) - ((float) ((Drawable) t97.getValue()).getIntrinsicWidth()), 0.0f);
        canvas.restoreToCount(saveLayer);
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
        return this.X.isRunning() || this.Z.isRunning();
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        ((Drawable) this.b.getValue()).setBounds(rect);
        hg hgVar = this.o;
        this.X.setValues(new PropertyValuesHolder[]{PropertyValuesHolder.ofInt(hgVar, new int[]{0, rect.width()})});
        a(this.w0);
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void start() {
        this.X.start();
        this.Z.start();
    }

    public final void stop() {
        this.X.cancel();
        this.Z.cancel();
    }
}
