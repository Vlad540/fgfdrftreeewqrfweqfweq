package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: g9d  reason: default package */
public final class g9d extends l6c implements mhe {
    public final float a = 0.5f;
    public final Rect b = new Rect();
    public final Paint c;

    public g9d(Context context) {
        Paint paint = new Paint();
        paint.setColor(km4.y0.n(context).g().h().j);
        this.c = paint;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000b, code lost:
        r4 = androidx.recyclerview.widget.RecyclerView.U(r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(android.graphics.Rect r3, android.view.View r4, androidx.recyclerview.widget.RecyclerView r5, x6c r6) {
        /*
            r2 = this;
            f6c r5 = r5.E0
            r0 = -1
            if (r5 == 0) goto L_0x0014
            boolean r5 = r5.b
            if (r5 != 0) goto L_0x000b
            goto L_0x0014
        L_0x000b:
            b7c r4 = androidx.recyclerview.widget.RecyclerView.U(r4)
            if (r4 == 0) goto L_0x0014
            long r4 = r4.X
            goto L_0x0015
        L_0x0014:
            r4 = r0
        L_0x0015:
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 != 0) goto L_0x001a
            return
        L_0x001a:
            long r0 = defpackage.waa.g
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 != 0) goto L_0x0034
            int r4 = r3.bottom
            android.content.res.Resources r5 = defpackage.dh4.c()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            float r2 = r2.a
            int r2 = defpackage.me4.c(r2, r5, r4)
            r3.bottom = r2
        L_0x0034:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g9d.f(android.graphics.Rect, android.view.View, androidx.recyclerview.widget.RecyclerView, x6c):void");
    }

    public final void h(Canvas canvas, RecyclerView recyclerView) {
        b7c U;
        int i = 0;
        while (true) {
            if (i < recyclerView.getChildCount()) {
                int i2 = i + 1;
                View childAt = recyclerView.getChildAt(i);
                if (childAt != null) {
                    f6c f6c = recyclerView.E0;
                    long j = -1;
                    if (!(f6c == null || !f6c.b || (U = RecyclerView.U(childAt)) == null)) {
                        j = U.X;
                    }
                    if (j == waa.g) {
                        int left = childAt.getLeft();
                        Rect rect = this.b;
                        rect.left = left;
                        rect.top = childAt.getBottom();
                        rect.bottom = me4.c(this.a, dh4.c().getDisplayMetrics().density, childAt.getBottom());
                        rect.right = childAt.getRight();
                        canvas.drawRect(rect, this.c);
                        return;
                    }
                    i = i2;
                } else {
                    throw new IndexOutOfBoundsException();
                }
            } else {
                return;
            }
        }
    }

    public final void onThemeChanged(pda pda) {
        this.c.setColor(pda.h().j);
    }
}
