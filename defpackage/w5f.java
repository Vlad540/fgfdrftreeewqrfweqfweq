package defpackage;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;

/* renamed from: w5f  reason: default package */
public final class w5f extends LayerDrawable {
    public w5f() {
        super(new Drawable[0]);
    }

    public final void a() {
        Paint paint;
        Drawable drawable = getDrawable(0);
        ShapeDrawable shapeDrawable = drawable instanceof ShapeDrawable ? (ShapeDrawable) drawable : null;
        if (!(shapeDrawable == null || (paint = shapeDrawable.getPaint()) == null)) {
            paint.setColor(1543503872);
        }
        Drawable drawable2 = getDrawable(1);
        if (drawable2 != null) {
            drawable2.setTint(-1);
        }
    }

    public final void b(int i, Integer num) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        addLayer(shapeDrawable);
        Paint paint = shapeDrawable.getPaint();
        if (paint != null) {
            paint.setColor(i);
        }
        if (num != null) {
            setLayerSize(0, num.intValue(), num.intValue());
            setLayerGravity(0, 17);
        }
    }
}
