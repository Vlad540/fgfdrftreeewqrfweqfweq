package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.net.Uri;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.facebook.drawee.view.SimpleDraweeView;

/* renamed from: mj5  reason: default package */
public final class mj5 extends FrameLayout {
    public int a;
    public int b;
    public float c;
    public float o;
    public final WindowManager.LayoutParams w0 = new WindowManager.LayoutParams(-1, -1, 0, 0, 2038, 16779016, -3);
    public final SimpleDraweeView x0;
    public lj5 y0;
    public ValueAnimator z0;

    public mj5(Context context) {
        super(context);
        if (getContext().getResources().getConfiguration().orientation == 1) {
            this.w0.layoutInDisplayCutoutMode = 1;
        }
        SimpleDraweeView simpleDraweeView = new SimpleDraweeView(getContext());
        this.x0 = simpleDraweeView;
        addView(simpleDraweeView, new FrameLayout.LayoutParams(0, 0));
    }

    public final void a(int i, int i2, int i3, int i4) {
        ValueAnimator valueAnimator = this.z0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.z0 = ofFloat;
        ofFloat.setDuration(300);
        this.z0.setInterpolator(vl.b().c().a.p());
        this.z0.setStartDelay((long) 0);
        this.z0.addUpdateListener(new kj5(this, i3, i4, i, i2));
        this.z0.addListener(new l6(5, this));
        this.z0.start();
    }

    public final void b(Uri uri, int i, int i2, int i3, int i4) {
        ywa a2 = a06.a.a();
        a2.e = tr6.a(uri);
        a2.l = this.x0.getController();
        this.x0.setController(a2.a());
        float f = (float) i;
        this.c = f;
        float f2 = (float) i2;
        this.o = f2;
        this.a = i3;
        this.b = i4;
        this.x0.setLayoutParams(new FrameLayout.LayoutParams(this.a, this.b));
        this.x0.setTranslationX(f);
        this.x0.setTranslationY(f2);
        invalidate();
    }

    public WindowManager.LayoutParams getWindowLayoutParams() {
        return this.w0;
    }

    public void setListener(lj5 lj5) {
        this.y0 = lj5;
    }
}
