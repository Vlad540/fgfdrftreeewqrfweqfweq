package defpackage;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.RatingBar;

/* renamed from: on  reason: default package */
public final class on extends RatingBar {
    public final mn a;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public on(android.content.Context r3, android.util.AttributeSet r4) {
        /*
            r2 = this;
            int r0 = defpackage.ylb.ratingBarStyle
            r2.<init>(r3, r4, r0)
            android.content.Context r3 = r2.getContext()
            defpackage.vhe.a(r3, r2)
            mn r3 = new mn
            r1 = 0
            r3.<init>((int) r1, (java.lang.Object) r2)
            r2.a = r3
            r3.Q(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.on.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = (Bitmap) this.a.c;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
