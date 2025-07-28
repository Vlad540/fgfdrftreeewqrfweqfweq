package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.ProgressBar;
import java.util.Arrays;
import java.util.WeakHashMap;

/* renamed from: ni0  reason: default package */
public abstract class ni0 extends ProgressBar {
    public static final int D0 = kvb.Widget_MaterialComponents_ProgressIndicator;
    public final li0 A0 = new li0(this, 1);
    public final mi0 B0 = new mi0(this, 0);
    public final mi0 C0 = new mi0(this, 1);
    public final oi0 a;
    public int b;
    public final boolean c;
    public final int o;
    public dh w0;
    public boolean x0 = false;
    public int y0 = 4;
    public final li0 z0 = new li0(this, 0);

    /* JADX WARNING: type inference failed for: r9v4, types: [dh, java.lang.Object] */
    public ni0(Context context, AttributeSet attributeSet, int i, int i2) {
        super(tw7.a(context, attributeSet, i, D0), attributeSet, i);
        Context context2 = getContext();
        this.a = a(context2, attributeSet);
        TypedArray d = she.d(context2, attributeSet, xvb.BaseProgressIndicator, i, i2, new int[0]);
        d.getInt(xvb.BaseProgressIndicator_showDelay, -1);
        this.o = Math.min(d.getInt(xvb.BaseProgressIndicator_minHideDelay, -1), 1000);
        d.recycle();
        this.w0 = new Object();
        this.c = true;
    }

    private qn4 getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().A0;
        } else if (getProgressDrawable() == null) {
            return null;
        } else {
            return getProgressDrawable().A0;
        }
    }

    public abstract oi0 a(Context context, AttributeSet attributeSet);

    public void b(int i) {
        if (!isIndeterminate()) {
            super.setProgress(i);
            if (getProgressDrawable() != null) {
                getProgressDrawable().jumpToCurrentState();
            }
        } else if (getProgressDrawable() != null) {
            this.b = i;
            this.x0 = true;
            if (getIndeterminateDrawable().isVisible()) {
                dh dhVar = this.w0;
                ContentResolver contentResolver = getContext().getContentResolver();
                dhVar.getClass();
                if (Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) != 0.0f) {
                    getIndeterminateDrawable().B0.c0();
                    return;
                }
            }
            this.B0.a(getIndeterminateDrawable());
        }
    }

    public final boolean c() {
        WeakHashMap weakHashMap = eaf.a;
        if (isAttachedToWindow() && getWindowVisibility() == 0) {
            View view = this;
            while (true) {
                if (view.getVisibility() != 0) {
                    break;
                }
                ViewParent parent = view.getParent();
                if (parent == null) {
                    if (getWindowVisibility() == 0) {
                        return true;
                    }
                } else if (!(parent instanceof View)) {
                    break;
                } else {
                    view = (View) parent;
                }
            }
        }
        return false;
    }

    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.a.f;
    }

    public int[] getIndicatorColor() {
        return this.a.c;
    }

    public int getIndicatorTrackGapSize() {
        return this.a.g;
    }

    public int getShowAnimationBehavior() {
        return this.a.e;
    }

    public int getTrackColor() {
        return this.a.d;
    }

    public int getTrackCornerRadius() {
        return this.a.b;
    }

    public int getTrackThickness() {
        return this.a.a;
    }

    public final void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!(getProgressDrawable() == null || getIndeterminateDrawable() == null)) {
            getIndeterminateDrawable().B0.a0(this.B0);
        }
        df4 progressDrawable = getProgressDrawable();
        mi0 mi0 = this.C0;
        if (progressDrawable != null) {
            getProgressDrawable().c(mi0);
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().c(mi0);
        }
        if (c()) {
            if (this.o > 0) {
                SystemClock.uptimeMillis();
            }
            setVisibility(0);
        }
    }

    public final void onDetachedFromWindow() {
        removeCallbacks(this.A0);
        removeCallbacks(this.z0);
        ((dn4) getCurrentDrawable()).d(false, false, false);
        pv6 indeterminateDrawable = getIndeterminateDrawable();
        mi0 mi0 = this.C0;
        if (indeterminateDrawable != null) {
            getIndeterminateDrawable().f(mi0);
            getIndeterminateDrawable().B0.f0();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().f(mi0);
        }
        super.onDetachedFromWindow();
    }

    public final synchronized void onDraw(Canvas canvas) {
        try {
            int save = canvas.save();
            if (getPaddingLeft() == 0) {
                if (getPaddingTop() != 0) {
                }
                if (!(getPaddingRight() == 0 && getPaddingBottom() == 0)) {
                    canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
                }
                getCurrentDrawable().draw(canvas);
                canvas.restoreToCount(save);
            }
            canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
            getCurrentDrawable().draw(canvas);
            canvas.restoreToCount(save);
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final synchronized void onMeasure(int i, int i2) {
        try {
            qn4 currentDrawingDelegate = getCurrentDrawingDelegate();
            if (currentDrawingDelegate != null) {
                setMeasuredDimension(currentDrawingDelegate.f() < 0 ? View.getDefaultSize(getSuggestedMinimumWidth(), i) : currentDrawingDelegate.f() + getPaddingLeft() + getPaddingRight(), currentDrawingDelegate.e() < 0 ? View.getDefaultSize(getSuggestedMinimumHeight(), i2) : currentDrawingDelegate.e() + getPaddingTop() + getPaddingBottom());
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        boolean z = i == 0;
        if (this.c) {
            ((dn4) getCurrentDrawable()).d(c(), false, z);
        }
    }

    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (this.c) {
            ((dn4) getCurrentDrawable()).d(c(), false, false);
        }
    }

    public void setAnimatorDurationScaleProvider(dh dhVar) {
        this.w0 = dhVar;
        if (getProgressDrawable() != null) {
            getProgressDrawable().c = dhVar;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().c = dhVar;
        }
    }

    public void setHideAnimationBehavior(int i) {
        this.a.f = i;
        invalidate();
    }

    public synchronized void setIndeterminate(boolean z) {
        try {
            if (z != isIndeterminate()) {
                dn4 dn4 = (dn4) getCurrentDrawable();
                if (dn4 != null) {
                    dn4.d(false, false, false);
                }
                super.setIndeterminate(z);
                dn4 dn42 = (dn4) getCurrentDrawable();
                if (dn42 != null) {
                    dn42.d(c(), false, false);
                }
                if ((dn42 instanceof pv6) && c()) {
                    ((pv6) dn42).B0.e0();
                }
                this.x0 = false;
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable((Drawable) null);
        } else if (drawable instanceof pv6) {
            ((dn4) drawable).d(false, false, false);
            super.setIndeterminateDrawable(drawable);
        } else {
            throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{vx3.p(wlb.colorPrimary, -1, getContext())};
        }
        if (!Arrays.equals(getIndicatorColor(), iArr)) {
            this.a.c = iArr;
            getIndeterminateDrawable().B0.S();
            invalidate();
        }
    }

    public void setIndicatorTrackGapSize(int i) {
        oi0 oi0 = this.a;
        if (oi0.g != i) {
            oi0.g = i;
            oi0.a();
            invalidate();
        }
    }

    public synchronized void setProgress(int i) {
        if (!isIndeterminate()) {
            b(i);
        }
    }

    public void setProgressDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable((Drawable) null);
        } else if (drawable instanceof df4) {
            df4 df4 = (df4) drawable;
            df4.d(false, false, false);
            super.setProgressDrawable(df4);
            df4.setLevel((int) ((((float) getProgress()) / ((float) getMax())) * 10000.0f));
        } else {
            throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
        }
    }

    public void setShowAnimationBehavior(int i) {
        this.a.e = i;
        invalidate();
    }

    public void setTrackColor(int i) {
        oi0 oi0 = this.a;
        if (oi0.d != i) {
            oi0.d = i;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i) {
        oi0 oi0 = this.a;
        if (oi0.b != i) {
            oi0.b = Math.min(i, oi0.a / 2);
            invalidate();
        }
    }

    public void setTrackThickness(int i) {
        oi0 oi0 = this.a;
        if (oi0.a != i) {
            oi0.a = i;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i) {
        if (i == 0 || i == 4 || i == 8) {
            this.y0 = i;
            return;
        }
        throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
    }

    public pv6 getIndeterminateDrawable() {
        return (pv6) super.getIndeterminateDrawable();
    }

    public df4 getProgressDrawable() {
        return (df4) super.getProgressDrawable();
    }
}
