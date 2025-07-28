package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.WeakHashMap;

/* renamed from: cj0  reason: default package */
public abstract class cj0 extends FrameLayout {
    public static final w6f A0 = new w6f(1);
    public final ead a;
    public int b;
    public final float c;
    public final float o;
    public final int w0;
    public final int x0;
    public ColorStateList y0;
    public PorterDuff.Mode z0;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: android.graphics.drawable.GradientDrawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: android.graphics.drawable.GradientDrawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: lw7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: android.graphics.drawable.GradientDrawable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public cj0(android.content.Context r5, android.util.AttributeSet r6) {
        /*
            r4 = this;
            r0 = 0
            android.content.Context r5 = defpackage.tw7.a(r5, r6, r0, r0)
            r4.<init>(r5, r6)
            android.content.Context r5 = r4.getContext()
            int[] r1 = defpackage.xvb.SnackbarLayout
            android.content.res.TypedArray r1 = r5.obtainStyledAttributes(r6, r1)
            int r2 = defpackage.xvb.SnackbarLayout_elevation
            boolean r2 = r1.hasValue(r2)
            if (r2 == 0) goto L_0x0026
            int r2 = defpackage.xvb.SnackbarLayout_elevation
            int r2 = r1.getDimensionPixelSize(r2, r0)
            float r2 = (float) r2
            java.util.WeakHashMap r3 = defpackage.eaf.a
            defpackage.t9f.s(r4, r2)
        L_0x0026:
            int r2 = defpackage.xvb.SnackbarLayout_animationMode
            int r2 = r1.getInt(r2, r0)
            r4.b = r2
            int r2 = defpackage.xvb.SnackbarLayout_shapeAppearance
            boolean r2 = r1.hasValue(r2)
            if (r2 != 0) goto L_0x003e
            int r2 = defpackage.xvb.SnackbarLayout_shapeAppearanceOverlay
            boolean r2 = r1.hasValue(r2)
            if (r2 == 0) goto L_0x0048
        L_0x003e:
            buf r6 = defpackage.ead.b(r5, r6, r0, r0)
            ead r6 = r6.c()
            r4.a = r6
        L_0x0048:
            int r6 = defpackage.xvb.SnackbarLayout_backgroundOverlayColorAlpha
            r2 = 1065353216(0x3f800000, float:1.0)
            float r6 = r1.getFloat(r6, r2)
            r4.c = r6
            int r6 = defpackage.xvb.SnackbarLayout_backgroundTint
            android.content.res.ColorStateList r5 = defpackage.wx3.i(r5, r1, r6)
            r4.setBackgroundTintList(r5)
            int r5 = defpackage.xvb.SnackbarLayout_backgroundTintMode
            r6 = -1
            int r5 = r1.getInt(r5, r6)
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r5 = defpackage.gwf.F(r5, r3)
            r4.setBackgroundTintMode(r5)
            int r5 = defpackage.xvb.SnackbarLayout_actionTextColorAlpha
            float r5 = r1.getFloat(r5, r2)
            r4.o = r5
            int r5 = defpackage.xvb.SnackbarLayout_android_maxWidth
            int r5 = r1.getDimensionPixelSize(r5, r6)
            r4.w0 = r5
            int r5 = defpackage.xvb.SnackbarLayout_maxActionInlineWidth
            int r5 = r1.getDimensionPixelSize(r5, r6)
            r4.x0 = r5
            r1.recycle()
            w6f r5 = A0
            r4.setOnTouchListener(r5)
            r5 = 1
            r4.setFocusable(r5)
            android.graphics.drawable.Drawable r5 = r4.getBackground()
            if (r5 != 0) goto L_0x00e3
            int r5 = defpackage.wlb.colorSurface
            int r6 = defpackage.wlb.colorOnSurface
            float r1 = r4.getBackgroundOverlayColorAlpha()
            int r5 = defpackage.vx3.r(r4, r5)
            int r6 = defpackage.vx3.r(r4, r6)
            int r5 = defpackage.vx3.C(r5, r1, r6)
            ead r6 = r4.a
            if (r6 == 0) goto L_0x00bc
            int r0 = defpackage.dj0.a
            lw7 r0 = new lw7
            r0.<init>((defpackage.ead) r6)
            android.content.res.ColorStateList r5 = android.content.res.ColorStateList.valueOf(r5)
            r0.l(r5)
            goto L_0x00d7
        L_0x00bc:
            android.content.res.Resources r6 = r4.getResources()
            int r1 = defpackage.dj0.a
            int r1 = defpackage.vmb.mtrl_snackbar_background_corner_radius
            float r6 = r6.getDimension(r1)
            android.graphics.drawable.GradientDrawable r1 = new android.graphics.drawable.GradientDrawable
            r1.<init>()
            r1.setShape(r0)
            r1.setCornerRadius(r6)
            r1.setColor(r5)
            r0 = r1
        L_0x00d7:
            android.content.res.ColorStateList r5 = r4.y0
            if (r5 == 0) goto L_0x00de
            defpackage.um4.h(r0, r5)
        L_0x00de:
            java.util.WeakHashMap r5 = defpackage.eaf.a
            r4.setBackground(r0)
        L_0x00e3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cj0.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private void setBaseTransientBottomBar(dj0 dj0) {
    }

    public float getActionTextColorAlpha() {
        return this.o;
    }

    public int getAnimationMode() {
        return this.b;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.c;
    }

    public int getMaxInlineActionWidth() {
        return this.x0;
    }

    public int getMaxWidth() {
        return this.w0;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        WeakHashMap weakHashMap = eaf.a;
        r9f.c(this);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.w0;
        if (i3 > 0 && getMeasuredWidth() > i3) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
        }
    }

    public void setAnimationMode(int i) {
        this.b = i;
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (!(drawable == null || this.y0 == null)) {
            drawable = drawable.mutate();
            um4.h(drawable, this.y0);
            um4.i(drawable, this.z0);
        }
        super.setBackgroundDrawable(drawable);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.y0 = colorStateList;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            um4.h(mutate, colorStateList);
            um4.i(mutate, this.z0);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.z0 = mode;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            um4.i(mutate, mode);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : A0);
        super.setOnClickListener(onClickListener);
    }
}
