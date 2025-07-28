package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.RectF;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

/* renamed from: rj4  reason: default package */
public final class rj4 extends FrameLayout {
    public tg a;
    public final AppCompatTextView b;
    public final ShapeDrawable c;
    public final fs o;
    public qe4 w0;

    /* JADX WARNING: type inference failed for: r13v0, types: [android.graphics.drawable.AnimationDrawable, fs] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rj4(Context context, int i) {
        super(context);
        int i2 = i;
        zg4 b2 = zg4.b();
        Resources resources = context.getResources();
        ? animationDrawable = new AnimationDrawable();
        animationDrawable.addFrame(resources.getDrawable(zhc.z0), 50);
        animationDrawable.addFrame(resources.getDrawable(zhc.G0), 50);
        animationDrawable.addFrame(resources.getDrawable(zhc.H0), 50);
        animationDrawable.addFrame(resources.getDrawable(zhc.I0), 50);
        animationDrawable.addFrame(resources.getDrawable(zhc.J0), 50);
        animationDrawable.addFrame(resources.getDrawable(zhc.K0), 50);
        animationDrawable.addFrame(resources.getDrawable(zhc.L0), 50);
        animationDrawable.addFrame(resources.getDrawable(zhc.M0), 50);
        animationDrawable.addFrame(resources.getDrawable(zhc.N0), 50);
        animationDrawable.addFrame(resources.getDrawable(zhc.A0), 50);
        animationDrawable.addFrame(resources.getDrawable(zhc.B0), 50);
        animationDrawable.addFrame(resources.getDrawable(zhc.C0), 50);
        animationDrawable.addFrame(resources.getDrawable(zhc.D0), 50);
        animationDrawable.addFrame(resources.getDrawable(zhc.E0), 50);
        animationDrawable.addFrame(resources.getDrawable(zhc.F0), 50);
        this.o = animationDrawable;
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext(), (AttributeSet) null);
        appCompatImageView.setImageDrawable(this.o);
        int i3 = b2.t;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i3);
        layoutParams.gravity = 17;
        layoutParams.bottomMargin = b2.i;
        if (i2 == 1) {
            appCompatImageView.setRotationY(180.0f);
        }
        addView(appCompatImageView, layoutParams);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), (AttributeSet) null);
        this.b = appCompatTextView;
        appCompatTextView.setTextColor(-1);
        this.b.setTextSize(b2.F);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        layoutParams2.topMargin = b2.i;
        addView(this.b, layoutParams2);
        int parseColor = Color.parseColor("#40FFFFFF");
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        this.c = shapeDrawable;
        shapeDrawable.getPaint().setColor(parseColor);
        setBackground(this.c);
        int b3 = dh4.b((int) 180.0f);
        if (i2 == 1) {
            float f = (float) b3;
            setCorners(new float[]{0.0f, 0.0f, f, f, f, f, 0.0f, 0.0f});
            return;
        }
        float f2 = (float) b3;
        setCorners(new float[]{f2, f2, 0.0f, 0.0f, 0.0f, 0.0f, f2, f2});
    }

    private void setCorners(float[] fArr) {
        this.c.setShape(new RoundRectShape(fArr, (RectF) null, (float[]) null));
    }

    public final void a() {
        if (getVisibility() != 8) {
            if (this.a == null) {
                setVisibility(8);
                return;
            }
            qe4 qe4 = this.w0;
            if (qe4 != null) {
                qe4.r();
            }
            this.o.stop();
            this.w0 = this.a.g(this);
        }
    }

    public final void b() {
        if (getVisibility() != 0) {
            if (this.a == null) {
                setVisibility(0);
            } else if (!this.o.isRunning()) {
                qe4 qe4 = this.w0;
                if (qe4 != null) {
                    qe4.r();
                }
                this.o.start();
                this.w0 = this.a.j(this);
            }
        }
    }

    public final void c(int i) {
        if (i == 0) {
            this.b.setText("");
        } else {
            this.b.setText(getResources().getString(cic.v2, new Object[]{Integer.valueOf(i)}));
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.o.stop();
        qe4 qe4 = this.w0;
        if (qe4 != null) {
            qe4.r();
        }
    }

    public void setAnimations(tg tgVar) {
        this.a = tgVar;
    }
}
