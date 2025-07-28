package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: oi8  reason: default package */
public final class oi8 extends l6c implements mhe {
    public final /* synthetic */ int a;
    public final Paint b;
    public final Rect c;
    public final Object o;

    public oi8(int i, pda pda) {
        this.a = i;
        switch (i) {
            case 1:
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setStyle(Paint.Style.FILL);
                this.b = paint;
                this.o = new RectF();
                this.c = new Rect();
                onThemeChanged(pda);
                return;
            default:
                Paint paint2 = new Paint();
                paint2.setStrokeWidth(dh4.c().getDisplayMetrics().density * 0.5f);
                this.b = paint2;
                this.c = new Rect();
                this.o = new x3a(16);
                onThemeChanged(pda);
                return;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: di8} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean i(androidx.recyclerview.widget.RecyclerView r6, android.view.View r7) {
        /*
            f6c r6 = r6.getAdapter()
            boolean r0 = r6 instanceof defpackage.jgd
            r1 = 0
            if (r0 == 0) goto L_0x000c
            jgd r6 = (defpackage.jgd) r6
            goto L_0x000d
        L_0x000c:
            r6 = r1
        L_0x000d:
            r0 = 0
            if (r6 != 0) goto L_0x0011
            return r0
        L_0x0011:
            int r7 = androidx.recyclerview.widget.RecyclerView.R(r7)
            int r2 = r7 + -1
            if (r7 > 0) goto L_0x001a
            return r0
        L_0x001a:
            int r3 = r6.l(r7)
            int r4 = r6.l(r2)
            mu r6 = r6.o
            java.util.List r5 = r6.f
            java.lang.Object r7 = o23.Y(r7, r5)
            boolean r5 = r7 instanceof defpackage.di8
            if (r5 == 0) goto L_0x0031
            di8 r7 = (defpackage.di8) r7
            goto L_0x0032
        L_0x0031:
            r7 = r1
        L_0x0032:
            r5 = 1
            if (r7 == 0) goto L_0x003b
            boolean r7 = r7.x0
            if (r7 != 0) goto L_0x003b
            r7 = r5
            goto L_0x003c
        L_0x003b:
            r7 = r0
        L_0x003c:
            java.util.List r6 = r6.f
            java.lang.Object r6 = o23.Y(r2, r6)
            boolean r2 = r6 instanceof defpackage.di8
            if (r2 == 0) goto L_0x0049
            r1 = r6
            di8 r1 = (defpackage.di8) r1
        L_0x0049:
            if (r1 == 0) goto L_0x0051
            boolean r6 = r1.x0
            if (r6 != r5) goto L_0x0051
            r6 = r5
            goto L_0x0052
        L_0x0051:
            r6 = r0
        L_0x0052:
            int r1 = defpackage.a7a.F
            if (r3 != r1) goto L_0x005a
            int r1 = defpackage.a7a.D
            if (r4 == r1) goto L_0x005e
        L_0x005a:
            if (r7 == 0) goto L_0x005f
            if (r6 == 0) goto L_0x005f
        L_0x005e:
            r0 = r5
        L_0x005f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oi8.i(androidx.recyclerview.widget.RecyclerView, android.view.View):boolean");
    }

    public final void f(Rect rect, View view, RecyclerView recyclerView, x6c x6c) {
        int R;
        switch (this.a) {
            case 0:
                oi8.super.f(rect, view, recyclerView, x6c);
                if (i(recyclerView, view)) {
                    rect.top = (int) (((float) (a24.X(((float) 10) * dh4.c().getDisplayMetrics().density) * 2)) + 0.5f);
                }
                ((x3a) this.o).E(rect, view, recyclerView);
                return;
            default:
                pp2 T = recyclerView.T(view);
                if (T != null && (T instanceof pp2) && (R = RecyclerView.R(view)) != -1) {
                    Boolean valueOf = Boolean.valueOf(T.Y == qp2.b);
                    if (x6c.b == null) {
                        x6c.b = new SparseArray();
                    }
                    x6c.b.put(R, valueOf);
                    return;
                }
                return;
        }
    }

    public void g(Canvas canvas, RecyclerView recyclerView, x6c x6c) {
        switch (this.a) {
            case 1:
                RectF rectF = (RectF) this.o;
                rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
                int childCount = recyclerView.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = recyclerView.getChildAt(i);
                    int R = RecyclerView.R(childAt);
                    if (recyclerView.T(childAt) instanceof pp2) {
                        SparseArray sparseArray = x6c.b;
                        boolean f = hhd.f(sparseArray == null ? null : sparseArray.get(R), Boolean.TRUE);
                        if (f) {
                            Rect rect = this.c;
                            RecyclerView.V(rect, childAt);
                            if (rectF.height() == 0.0f) {
                                rectF.set(rect);
                            } else {
                                rectF.left = Math.min(rectF.left, (float) rect.left);
                                rectF.top = Math.min(rectF.top, (float) rect.top);
                                rectF.right = Math.max(rectF.right, (float) rect.right);
                                rectF.bottom = Math.max(rectF.bottom, (float) rect.bottom);
                            }
                        }
                        if ((!f || i == recyclerView.getChildCount() - 1) && rectF.height() != 0.0f) {
                            canvas.drawRect(rectF, this.b);
                            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                    }
                }
                return;
            default:
                return;
        }
    }

    public void h(Canvas canvas, RecyclerView recyclerView) {
        switch (this.a) {
            case 0:
                int i = 0;
                while (true) {
                    if (i < recyclerView.getChildCount()) {
                        int i2 = i + 1;
                        View childAt = recyclerView.getChildAt(i);
                        if (childAt != null) {
                            if (i(recyclerView, childAt)) {
                                int R = RecyclerView.R(childAt);
                                Rect rect = this.c;
                                ((x3a) this.o).x(rect, childAt, R);
                                canvas.drawLine((float) rect.left, (float) rect.centerY(), (float) rect.right, (float) rect.centerY(), this.b);
                            }
                            i = i2;
                        } else {
                            throw new IndexOutOfBoundsException();
                        }
                    } else {
                        return;
                    }
                }
            default:
                return;
        }
    }

    public final void onThemeChanged(pda pda) {
        switch (this.a) {
            case 0:
                this.b.setColor(pda.h().j);
                return;
            default:
                this.b.setColor(pda.b().k);
                return;
        }
    }
}
