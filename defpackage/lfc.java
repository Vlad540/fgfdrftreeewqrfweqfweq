package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* renamed from: lfc  reason: default package */
public final class lfc extends ow5 implements gdf {
    public Drawable X;
    public hdf Y;

    public final void draw(Canvas canvas) {
        if (isVisible()) {
            hdf hdf = this.Y;
            if (hdf != null) {
                hdf.onDraw();
            }
            super.draw(canvas);
            Drawable drawable = this.X;
            if (drawable != null) {
                drawable.setBounds(getBounds());
                this.X.draw(canvas);
            }
        }
    }

    public final int getIntrinsicHeight() {
        return -1;
    }

    public final int getIntrinsicWidth() {
        return -1;
    }

    public final boolean setVisible(boolean z, boolean z2) {
        hdf hdf = this.Y;
        if (hdf != null) {
            hdf.a(z);
        }
        return super.setVisible(z, z2);
    }
}
