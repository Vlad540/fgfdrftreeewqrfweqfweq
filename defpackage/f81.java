package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: f81  reason: default package */
public final class f81 extends Drawable implements Animatable {
    public static final /* synthetic */ k77[] w0;
    public final t97 X;
    public final idd Y;
    public final yj Z;
    public final Context a;
    public final Path b = new Path();
    public final hg c;
    public final ObjectAnimator o;

    static {
        hc9 hc9 = new hc9(f81.class, "backgroundColor", "getBackgroundColor$calls_ui_release()Lone/me/calls/ui/animation/CallIndicatorWaveDrawable$Companion$BackgroundColor;");
        m7c.a.getClass();
        w0 = new k77[]{hc9};
    }

    public f81(Context context) {
        this.a = context;
        hg hgVar = new hg("waveX", 0);
        this.c = hgVar;
        ObjectAnimator ofInt = ObjectAnimator.ofInt((Object) null, hgVar, new int[]{0, context.getResources().getDisplayMetrics().widthPixels});
        ofInt.setDuration(1200);
        ofInt.setRepeatCount(-1);
        ofInt.setInterpolator(new LinearInterpolator());
        ofInt.addUpdateListener(new c00(4, (Object) this));
        this.o = ofInt;
        this.X = ez3.O(3, new c6(23, this));
        idd a2 = a();
        this.Y = a2;
        this.Z = new yj(this);
        idd a3 = a();
        a2.getClass();
        k77 k77 = idd.E0[0];
        a3.b((fdd) a2.w0.b);
    }

    public final idd a() {
        return (idd) this.X.getValue();
    }

    public final void draw(Canvas canvas) {
        hg hgVar = this.c;
        int save = canvas.save();
        try {
            if (this.o.isRunning()) {
                canvas.translate(-((float) hgVar.a), 0.0f);
                Path path = this.b;
                canvas.clipOutPath(path);
                canvas.translate((float) getBounds().width(), 0.0f);
                canvas.clipOutPath(path);
                canvas.translate(((float) hgVar.a) - ((float) getBounds().width()), 0.0f);
                yj yjVar = this.Z;
                k77 k77 = w0[0];
                int ordinal = ((e81) yjVar.b).ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        canvas.drawColor(-15263716);
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
            a().draw(canvas);
            canvas.restoreToCount(save);
        } catch (Throwable th) {
            canvas.restoreToCount(save);
            throw th;
        }
    }

    public final int getIntrinsicHeight() {
        return -1;
    }

    public final int getIntrinsicWidth() {
        return -1;
    }

    public final int getOpacity() {
        return -3;
    }

    public final boolean isRunning() {
        return a().isRunning() || this.o.isRunning();
    }

    public final boolean isStateful() {
        return true;
    }

    public final void onBoundsChange(Rect rect) {
        float width = (float) rect.width();
        float height = (float) rect.height();
        int max = Math.max(rect.height(), rect.width());
        idd a2 = a();
        a2.C0.o1(a2, idd.E0[6], Integer.valueOf(max / 2));
        a().setBounds(new Rect(0, 0, rect.width(), max));
        float f = (float) 15;
        float f2 = (float) 2;
        float X2 = height - (((float) a24.X(dh4.c().getDisplayMetrics().density * f)) / f2);
        Path path = this.b;
        path.rewind();
        path.moveTo(0.0f, X2);
        float f3 = width / 3.0f;
        float f4 = f3 * f2;
        path.cubicTo(f3, height - ((float) a24.X(dh4.c().getDisplayMetrics().density * f)), f4, height, width, height - (((float) a24.X(f * dh4.c().getDisplayMetrics().density)) / f2));
        path.lineTo(width, height);
        path.lineTo(0.0f, height);
        path.lineTo(0.0f, X2);
    }

    public final void setAlpha(int i) {
        a().setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void start() {
        a().a(qda.a);
        a().start();
        this.o.start();
    }

    public final void stop() {
        a().a(qda.a);
        a().stop();
        this.o.cancel();
    }
}
