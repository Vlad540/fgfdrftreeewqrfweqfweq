package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import java.util.WeakHashMap;

/* renamed from: rn  reason: default package */
public final class rn extends mn {
    public final SeekBar X;
    public Drawable Y;
    public ColorStateList Z = null;
    public PorterDuff.Mode w0 = null;
    public boolean x0 = false;
    public boolean y0 = false;

    public rn(SeekBar seekBar) {
        super(0, (Object) seekBar);
        this.X = seekBar;
    }

    public final void Q(AttributeSet attributeSet, int i) {
        super.Q(attributeSet, i);
        SeekBar seekBar = this.X;
        ydc D = ydc.D(seekBar.getContext(), attributeSet, nwb.AppCompatSeekBar, i, 0);
        SeekBar seekBar2 = this.X;
        Context context = seekBar2.getContext();
        int[] iArr = nwb.AppCompatSeekBar;
        WeakHashMap weakHashMap = eaf.a;
        z9f.d(seekBar2, context, iArr, attributeSet, (TypedArray) D.c, i, 0);
        Drawable z = D.z(nwb.AppCompatSeekBar_android_thumb);
        if (z != null) {
            seekBar.setThumb(z);
        }
        Drawable y = D.y(nwb.AppCompatSeekBar_tickMark);
        Drawable drawable = this.Y;
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
        this.Y = y;
        if (y != null) {
            y.setCallback(seekBar);
            vm4.b(y, seekBar.getLayoutDirection());
            if (y.isStateful()) {
                y.setState(seekBar.getDrawableState());
            }
            X();
        }
        seekBar.invalidate();
        int i2 = nwb.AppCompatSeekBar_tickMarkTintMode;
        TypedArray typedArray = (TypedArray) D.c;
        if (typedArray.hasValue(i2)) {
            this.w0 = bn4.c(typedArray.getInt(nwb.AppCompatSeekBar_tickMarkTintMode, -1), this.w0);
            this.y0 = true;
        }
        if (typedArray.hasValue(nwb.AppCompatSeekBar_tickMarkTint)) {
            this.Z = D.w(nwb.AppCompatSeekBar_tickMarkTint);
            this.x0 = true;
        }
        D.E();
        X();
    }

    public final void X() {
        Drawable drawable = this.Y;
        if (drawable == null) {
            return;
        }
        if (this.x0 || this.y0) {
            Drawable mutate = drawable.mutate();
            this.Y = mutate;
            if (this.x0) {
                um4.h(mutate, this.Z);
            }
            if (this.y0) {
                um4.i(this.Y, this.w0);
            }
            if (this.Y.isStateful()) {
                this.Y.setState(this.X.getDrawableState());
            }
        }
    }

    public final void Y(Canvas canvas) {
        if (this.Y != null) {
            SeekBar seekBar = this.X;
            int max = seekBar.getMax();
            int i = 1;
            if (max > 1) {
                int intrinsicWidth = this.Y.getIntrinsicWidth();
                int intrinsicHeight = this.Y.getIntrinsicHeight();
                int i2 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                if (intrinsicHeight >= 0) {
                    i = intrinsicHeight / 2;
                }
                this.Y.setBounds(-i2, -i, i2, i);
                float width = ((float) ((seekBar.getWidth() - seekBar.getPaddingLeft()) - seekBar.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) seekBar.getPaddingLeft(), (float) (seekBar.getHeight() / 2));
                for (int i3 = 0; i3 <= max; i3++) {
                    this.Y.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
