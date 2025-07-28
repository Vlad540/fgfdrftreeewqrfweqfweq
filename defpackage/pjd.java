package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.SeekBar;

/* renamed from: pjd  reason: default package */
public abstract class pjd extends xi0 {
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    public int getActiveThumbIndex() {
        return this.l1;
    }

    public int getFocusedThumbIndex() {
        return this.m1;
    }

    public int getHaloRadius() {
        return this.Y0;
    }

    public ColorStateList getHaloTintList() {
        return this.v1;
    }

    public int getLabelBehavior() {
        return this.T0;
    }

    public float getStepSize() {
        return this.n1;
    }

    public float getThumbElevation() {
        return this.D1.a.n;
    }

    public int getThumbHeight() {
        return this.X0;
    }

    public int getThumbRadius() {
        return this.W0 / 2;
    }

    public ColorStateList getThumbStrokeColor() {
        return this.D1.a.d;
    }

    public float getThumbStrokeWidth() {
        return this.D1.a.k;
    }

    public ColorStateList getThumbTintList() {
        return this.D1.a.c;
    }

    public int getThumbTrackGapSize() {
        return this.Z0;
    }

    public int getThumbWidth() {
        return this.W0;
    }

    public int getTickActiveRadius() {
        return this.q1;
    }

    public ColorStateList getTickActiveTintList() {
        return this.w1;
    }

    public int getTickInactiveRadius() {
        return this.r1;
    }

    public ColorStateList getTickInactiveTintList() {
        return this.x1;
    }

    public ColorStateList getTickTintList() {
        if (this.x1.equals(this.w1)) {
            return this.w1;
        }
        throw new IllegalStateException("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
    }

    public ColorStateList getTrackActiveTintList() {
        return this.y1;
    }

    public int getTrackHeight() {
        return this.U0;
    }

    public ColorStateList getTrackInactiveTintList() {
        return this.z1;
    }

    public int getTrackInsideCornerSize() {
        return this.d1;
    }

    public int getTrackSidePadding() {
        return this.V0;
    }

    public int getTrackStopIndicatorSize() {
        return this.c1;
    }

    public ColorStateList getTrackTintList() {
        if (this.z1.equals(this.y1)) {
            return this.y1;
        }
        throw new IllegalStateException("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
    }

    public int getTrackWidth() {
        return this.s1;
    }

    public float getValue() {
        return getValues().get(0).floatValue();
    }

    public float getValueFrom() {
        return this.i1;
    }

    public float getValueTo() {
        return this.j1;
    }

    public void setCustomThumbDrawable(int i) {
        setCustomThumbDrawable(getResources().getDrawable(i));
    }

    public /* bridge */ /* synthetic */ void setEnabled(boolean z) {
        super.setEnabled(z);
    }

    public void setFocusedThumbIndex(int i) {
        if (i < 0 || i >= this.k1.size()) {
            throw new IllegalArgumentException("index out of range");
        }
        this.m1 = i;
        this.z0.w(i);
        postInvalidate();
    }

    public void setHaloRadius(int i) {
        if (i != this.Y0) {
            this.Y0 = i;
            Drawable background = getBackground();
            if ((!(getBackground() instanceof RippleDrawable)) || !(background instanceof RippleDrawable)) {
                postInvalidate();
            } else {
                ((RippleDrawable) background).setRadius(this.Y0);
            }
        }
    }

    public void setHaloRadiusResource(int i) {
        setHaloRadius(getResources().getDimensionPixelSize(i));
    }

    public void setHaloTintList(ColorStateList colorStateList) {
        if (!colorStateList.equals(this.v1)) {
            this.v1 = colorStateList;
            Drawable background = getBackground();
            if ((!(getBackground() instanceof RippleDrawable)) || !(background instanceof RippleDrawable)) {
                Paint paint = this.o;
                paint.setColor(h(colorStateList));
                paint.setAlpha(63);
                invalidate();
                return;
            }
            ((RippleDrawable) background).setColor(colorStateList);
        }
    }

    public void setLabelBehavior(int i) {
        if (this.T0 != i) {
            this.T0 = i;
            requestLayout();
        }
    }

    public /* bridge */ /* synthetic */ void setLabelFormatter(z87 z87) {
    }

    public void setStepSize(float f) {
        if (f < 0.0f) {
            float f2 = this.i1;
            float f3 = this.j1;
            throw new IllegalArgumentException("The stepSize(" + f + ") must be 0, or a factor of the valueFrom(" + f2 + ")-valueTo(" + f3 + ") range");
        } else if (this.n1 != f) {
            this.n1 = f;
            this.u1 = true;
            postInvalidate();
        }
    }

    public void setThumbElevation(float f) {
        this.D1.k(f);
    }

    public void setThumbElevationResource(int i) {
        setThumbElevation(getResources().getDimension(i));
    }

    public void setThumbHeight(int i) {
        if (i != this.X0) {
            this.X0 = i;
            this.D1.setBounds(0, 0, this.W0, i);
            Drawable drawable = this.E1;
            if (drawable != null) {
                a(drawable);
            }
            for (Drawable a : this.F1) {
                a(a);
            }
            y();
        }
    }

    public void setThumbHeightResource(int i) {
        setThumbHeight(getResources().getDimensionPixelSize(i));
    }

    public void setThumbRadius(int i) {
        int i2 = i * 2;
        setThumbWidth(i2);
        setThumbHeight(i2);
    }

    public void setThumbRadiusResource(int i) {
        setThumbRadius(getResources().getDimensionPixelSize(i));
    }

    public void setThumbStrokeColor(ColorStateList colorStateList) {
        this.D1.n(colorStateList);
        postInvalidate();
    }

    public void setThumbStrokeColorResource(int i) {
        if (i != 0) {
            setThumbStrokeColor(d8.r(getContext(), i));
        }
    }

    public void setThumbStrokeWidth(float f) {
        lw7 lw7 = this.D1;
        lw7.a.k = f;
        lw7.invalidateSelf();
        postInvalidate();
    }

    public void setThumbStrokeWidthResource(int i) {
        if (i != 0) {
            setThumbStrokeWidth(getResources().getDimension(i));
        }
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        lw7 lw7 = this.D1;
        if (!colorStateList.equals(lw7.a.c)) {
            lw7.l(colorStateList);
            invalidate();
        }
    }

    public void setThumbTrackGapSize(int i) {
        if (this.Z0 != i) {
            this.Z0 = i;
            invalidate();
        }
    }

    /* JADX WARNING: type inference failed for: r4v4, types: [ead, java.lang.Object] */
    public void setThumbWidth(int i) {
        if (i != this.W0) {
            this.W0 = i;
            lw7 lw7 = this.D1;
            qr4 qr4 = new qr4(0);
            qr4 qr42 = new qr4(0);
            qr4 qr43 = new qr4(0);
            qr4 qr44 = new qr4(0);
            float f = ((float) this.W0) / 2.0f;
            udd t = ez3.t(0);
            buf.d(t);
            buf.d(t);
            buf.d(t);
            buf.d(t);
            a0 a0Var = new a0(f);
            a0 a0Var2 = new a0(f);
            a0 a0Var3 = new a0(f);
            a0 a0Var4 = new a0(f);
            ? obj = new Object();
            obj.a = t;
            obj.b = t;
            obj.c = t;
            obj.d = t;
            obj.e = a0Var;
            obj.f = a0Var2;
            obj.g = a0Var3;
            obj.h = a0Var4;
            obj.i = qr4;
            obj.j = qr42;
            obj.k = qr43;
            obj.l = qr44;
            lw7.setShapeAppearanceModel(obj);
            lw7.setBounds(0, 0, this.W0, this.X0);
            Drawable drawable = this.E1;
            if (drawable != null) {
                a(drawable);
            }
            for (Drawable a : this.F1) {
                a(a);
            }
            y();
        }
    }

    public void setThumbWidthResource(int i) {
        setThumbWidth(getResources().getDimensionPixelSize(i));
    }

    public void setTickActiveRadius(int i) {
        if (this.q1 != i) {
            this.q1 = i;
            this.x0.setStrokeWidth((float) (i * 2));
            y();
        }
    }

    public void setTickActiveTintList(ColorStateList colorStateList) {
        if (!colorStateList.equals(this.w1)) {
            this.w1 = colorStateList;
            this.x0.setColor(h(colorStateList));
            invalidate();
        }
    }

    public void setTickInactiveRadius(int i) {
        if (this.r1 != i) {
            this.r1 = i;
            this.w0.setStrokeWidth((float) (i * 2));
            y();
        }
    }

    public void setTickInactiveTintList(ColorStateList colorStateList) {
        if (!colorStateList.equals(this.x1)) {
            this.x1 = colorStateList;
            this.w0.setColor(h(colorStateList));
            invalidate();
        }
    }

    public void setTickTintList(ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    public void setTickVisible(boolean z) {
        if (this.p1 != z) {
            this.p1 = z;
            postInvalidate();
        }
    }

    public void setTrackActiveTintList(ColorStateList colorStateList) {
        if (!colorStateList.equals(this.y1)) {
            this.y1 = colorStateList;
            this.b.setColor(h(colorStateList));
            this.y0.setColor(h(this.y1));
            invalidate();
        }
    }

    public void setTrackHeight(int i) {
        if (this.U0 != i) {
            this.U0 = i;
            this.a.setStrokeWidth((float) i);
            this.b.setStrokeWidth((float) this.U0);
            y();
        }
    }

    public void setTrackInactiveTintList(ColorStateList colorStateList) {
        if (!colorStateList.equals(this.z1)) {
            this.z1 = colorStateList;
            this.a.setColor(h(colorStateList));
            invalidate();
        }
    }

    public void setTrackInsideCornerSize(int i) {
        if (this.d1 != i) {
            this.d1 = i;
            invalidate();
        }
    }

    public void setTrackStopIndicatorSize(int i) {
        if (this.c1 != i) {
            this.c1 = i;
            this.y0.setStrokeWidth((float) i);
            invalidate();
        }
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    public void setValue(float f) {
        setValues(Float.valueOf(f));
    }

    public void setValueFrom(float f) {
        this.i1 = f;
        this.u1 = true;
        postInvalidate();
    }

    public void setValueTo(float f) {
        this.j1 = f;
        this.u1 = true;
        postInvalidate();
    }

    public void setCustomThumbDrawable(Drawable drawable) {
        Drawable newDrawable = drawable.mutate().getConstantState().newDrawable();
        a(newDrawable);
        this.E1 = newDrawable;
        this.F1.clear();
        postInvalidate();
    }
}
