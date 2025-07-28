package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;

/* renamed from: qoc  reason: default package */
public final class qoc extends FrameLayout implements mhe {
    public final AppCompatImageView a;
    public final t3a b;

    public qoc(Context context) {
        super(context);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, (AttributeSet) null);
        float f = (float) 44;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density));
        layoutParams.gravity = 83;
        appCompatImageView.setLayoutParams(layoutParams);
        int X = a24.X(((float) 12) * dh4.c().getDisplayMetrics().density);
        appCompatImageView.setPadding(X, X, X, X);
        appCompatImageView.setOutlineProvider(new eu3(dh4.c().getDisplayMetrics().density * 48.0f));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        appCompatImageView.setBackground(gradientDrawable);
        this.a = appCompatImageView;
        t3a t3a = new t3a(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 53;
        t3a.setVisibility(8);
        t3a.setLayoutParams(layoutParams2);
        this.b = t3a;
        float f2 = (float) 46;
        setLayoutParams(new FrameLayout.LayoutParams(a24.X(dh4.c().getDisplayMetrics().density * f2), a24.X(f2 * dh4.c().getDisplayMetrics().density)));
        addView(appCompatImageView);
        addView(t3a);
        onThemeChanged(km4.y0.r(this));
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onThemeChanged(defpackage.pda r6) {
        /*
            r5 = this;
            androidx.appcompat.widget.AppCompatImageView r0 = r5.a
            android.graphics.drawable.Drawable r1 = r0.getBackground()
            boolean r2 = r1 instanceof android.graphics.drawable.GradientDrawable
            r3 = 0
            if (r2 == 0) goto L_0x000e
            android.graphics.drawable.GradientDrawable r1 = (android.graphics.drawable.GradientDrawable) r1
            goto L_0x000f
        L_0x000e:
            r1 = r3
        L_0x000f:
            if (r1 == 0) goto L_0x001b
            r0e r2 = r6.h()
            int r2 = r2.k
            r4 = 2
            r1.setStroke(r4, r2)
        L_0x001b:
            android.graphics.drawable.Drawable r1 = r0.getBackground()
            boolean r2 = r1 instanceof android.graphics.drawable.GradientDrawable
            if (r2 == 0) goto L_0x0026
            r3 = r1
            android.graphics.drawable.GradientDrawable r3 = (android.graphics.drawable.GradientDrawable) r3
        L_0x0026:
            if (r3 == 0) goto L_0x003d
            s59 r1 = km4.y0
            pda r1 = r1.r(r5)
            jo2 r1 = r1.a()
            j53 r1 = r1.o()
            b43 r1 = r1.a
            int r1 = r1.h
            r3.setColor(r1)
        L_0x003d:
            yn6 r1 = r6.getIcon()
            int r1 = r1.f
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.setImageTintList(r1)
            t3a r5 = r5.b
            r5.f(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qoc.onThemeChanged(pda):void");
    }

    public final void setCounter(int i) {
        int i2 = i > 0 ? 0 : 8;
        t3a t3a = this.b;
        t3a.setVisibility(i2);
        t3a.g(i, true);
    }

    public final void setImageDrawable(Drawable drawable) {
        this.a.setImageDrawable(drawable);
    }
}
