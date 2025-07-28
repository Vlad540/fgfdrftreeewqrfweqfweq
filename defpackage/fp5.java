package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;

/* renamed from: fp5  reason: default package */
public final class fp5 extends chd {
    public static final ShapeDrawable J0;

    static {
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        float f = dh4.c().getDisplayMetrics().density * 16.0f;
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = f;
        }
        shapeDrawable.setShape(new RoundRectShape(fArr, (RectF) null, (float[]) null));
        J0 = shapeDrawable;
    }

    public final void A(pg7 pg7) {
    }
}
