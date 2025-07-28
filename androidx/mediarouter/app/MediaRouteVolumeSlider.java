package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;

class MediaRouteVolumeSlider extends qn {
    public final float b;
    public boolean c;
    public Drawable o;
    public int w0;
    public int x0;

    public MediaRouteVolumeSlider(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, ylb.seekBarStyle);
        this.b = fc8.d(context);
    }

    public final void a(int i, int i2) {
        if (this.w0 != i) {
            if (Color.alpha(i) != 255) {
                Integer.toHexString(i);
            }
            this.w0 = i;
        }
        if (this.x0 != i2) {
            if (Color.alpha(i2) != 255) {
                Integer.toHexString(i2);
            }
            this.x0 = i2;
        }
    }

    public final void b(boolean z) {
        if (this.c != z) {
            this.c = z;
            super.setThumb(z ? null : this.o);
        }
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int i = isEnabled() ? 255 : (int) (this.b * 255.0f);
        Drawable drawable = this.o;
        int i2 = this.w0;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        drawable.setColorFilter(i2, mode);
        this.o.setAlpha(i);
        Drawable progressDrawable = getProgressDrawable();
        if (progressDrawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) getProgressDrawable();
            Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908301);
            layerDrawable.findDrawableByLayerId(16908288).setColorFilter(this.x0, mode);
            progressDrawable = findDrawableByLayerId;
        }
        progressDrawable.setColorFilter(this.w0, mode);
        progressDrawable.setAlpha(i);
    }

    public final void setThumb(Drawable drawable) {
        this.o = drawable;
        if (this.c) {
            drawable = null;
        }
        super.setThumb(drawable);
    }
}
