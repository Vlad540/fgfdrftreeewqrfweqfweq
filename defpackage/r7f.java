package defpackage;

import android.content.Context;
import android.view.View;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* renamed from: r7f  reason: default package */
public final class r7f extends OneMeDraweeView {
    public final int[] G0 = new int[2];
    public q1f H0;

    public r7f(Context context) {
        super(context);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [r7f, on4, android.view.View] */
    public final void onMeasure(int i, int i2) {
        q1f q1f = this.H0;
        if (q1f == null || View.MeasureSpec.getMode(i2) == 1073741824) {
            r7f.super.onMeasure(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = q1f.c;
        int i4 = q1f.d;
        int[] iArr = this.G0;
        oyb.B(size, size2, i3, i4, iArr);
        setMeasuredDimension(iArr[0], iArr[1]);
    }
}
