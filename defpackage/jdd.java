package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

/* renamed from: jdd  reason: default package */
public final class jdd extends LayerDrawable implements Animatable, mhe {
    public int X = -1;
    public final boolean Y;
    public final int a;
    public final idd b;
    public final int c;
    public int o = a24.X(((float) 80) * dh4.c().getDisplayMetrics().density);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jdd(Context context) {
        super(new Drawable[0]);
        boolean z = false;
        idd idd = new idd(context);
        this.b = idd;
        this.Y = swb.D(context).compareTo(vf4.o) >= 0 ? true : z;
        ColorDrawable colorDrawable = new ColorDrawable();
        colorDrawable.setCallback(this);
        int addLayer = addLayer(colorDrawable);
        this.a = addLayer;
        setLayerGravity(addLayer, 119);
        int addLayer2 = addLayer(idd);
        this.c = addLayer2;
        idd.setCallback(this);
        setLayerGravity(addLayer2, 17);
        onThemeChanged(km4.y0.n(context).g());
    }

    public final void a(int i) {
        this.X = i;
        if (!getBounds().isEmpty()) {
            setLayerInsetBottom(this.c, getBounds().centerY() - i);
        }
    }

    public final boolean b(Drawable drawable) {
        if (drawable == this) {
            return true;
        }
        int numberOfLayers = getNumberOfLayers();
        for (int i = 0; i < numberOfLayers; i++) {
            if (getDrawable(i) == drawable) {
                return true;
            }
        }
        return false;
    }

    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(drawable);
        }
    }

    public final boolean isRunning() {
        return this.Y && this.b.isRunning();
    }

    public final void onBoundsChange(Rect rect) {
        int min = Math.min(rect.width() - (this.o * 2), rect.height() - (this.o * 2));
        int i = this.c;
        setLayerSize(i, min, min);
        int i2 = this.X;
        if (i2 > 0) {
            setLayerInsetBottom(i, rect.centerY() - i2);
        }
        super.onBoundsChange(rect);
    }

    public final void onThemeChanged(pda pda) {
        this.b.a(pda);
        ((ColorDrawable) getDrawable(this.a)).setColor(pda.b().i);
    }

    public final boolean setVisible(boolean z, boolean z2) {
        if (z) {
            start();
        } else {
            stop();
        }
        return super.setVisible(z, z2);
    }

    public final void start() {
        if (this.Y) {
            this.b.start();
        }
    }

    public final void stop() {
        if (this.Y) {
            this.b.stop();
        }
    }
}
