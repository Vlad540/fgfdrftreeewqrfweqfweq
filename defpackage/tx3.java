package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: tx3  reason: default package */
public final class tx3 extends kw7 {
    public final RectF v;

    public tx3(ead ead, RectF rectF) {
        super(ead);
        this.v = rectF;
    }

    public final Drawable newDrawable() {
        ux3 ux3 = new ux3(this);
        ux3.invalidateSelf();
        return ux3;
    }

    public tx3(tx3 tx3) {
        super((kw7) tx3);
        this.v = tx3.v;
    }
}
