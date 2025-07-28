package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Locale;

/* renamed from: es5  reason: default package */
public final class es5 extends l6c implements mhe {
    public final Object X;
    public final /* synthetic */ int a = 1;
    public final Parcelable b;
    public final x3a c;
    public final Object o;

    public es5(jj7 jj7) {
        this.o = jj7;
        this.b = new Rect();
        TextPaint textPaint = new TextPaint();
        jj7.H(textPaint);
        this.X = textPaint;
        this.c = new x3a(16);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
        r1 = r3.l(r4);
        r2 = defpackage.d5a.l;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean i(androidx.recyclerview.widget.RecyclerView r3, int r4) {
        /*
            f6c r3 = r3.getAdapter()
            r0 = 0
            if (r3 != 0) goto L_0x0008
            return r0
        L_0x0008:
            r1 = -1
            if (r4 == r1) goto L_0x001e
            if (r4 == 0) goto L_0x001e
            int r1 = r3.l(r4)
            int r2 = defpackage.d5a.l
            if (r1 != r2) goto L_0x001e
            r1 = 1
            int r4 = r4 - r1
            int r3 = r3.l(r4)
            if (r3 == r2) goto L_0x001e
            r0 = r1
        L_0x001e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.es5.i(androidx.recyclerview.widget.RecyclerView, int):boolean");
    }

    public final void f(Rect rect, View view, RecyclerView recyclerView, x6c x6c) {
        int R;
        switch (this.a) {
            case 0:
                super.f(rect, view, recyclerView, x6c);
                f6c adapter = recyclerView.getAdapter();
                if (adapter != null && (R = RecyclerView.R(view)) > 0 && adapter.l(R) == d5a.i) {
                    rect.top = (int) (((float) (a24.X(((float) 6) * dh4.c().getDisplayMetrics().density) * 2)) + 0.5f);
                }
                this.c.E(rect, view, recyclerView);
                return;
            case 1:
                super.f(rect, view, recyclerView, x6c);
                recyclerView.getClass();
                if (i(recyclerView, RecyclerView.R(view))) {
                    rect.top = a24.X(((float) 48) * dh4.c().getDisplayMetrics().density);
                }
                this.c.E(rect, view, recyclerView);
                return;
            case 2:
                int X2 = a24.X(((float) 6) * dh4.c().getDisplayMetrics().density);
                rect.set(X2, X2, X2, X2);
                this.c.E(rect, view, recyclerView);
                return;
            case 3:
                super.f(rect, view, recyclerView, x6c);
                if (j(recyclerView, view)) {
                    rect.top = (int) (((float) (a24.X(((float) 10) * dh4.c().getDisplayMetrics().density) * 2)) + 0.5f);
                }
                this.c.E(rect, view, recyclerView);
                return;
            default:
                super.f(rect, view, recyclerView, x6c);
                recyclerView.getClass();
                if (((jj7) this.o).D(RecyclerView.R(view))) {
                    int i = rect.top;
                    TextPaint textPaint = (TextPaint) this.X;
                    rect.top = (a24.X(((float) 6) * dh4.c().getDisplayMetrics().density) * 2) + ((int) (textPaint.descent() - textPaint.ascent())) + i;
                }
                this.c.E(rect, view, recyclerView);
                return;
        }
    }

    public void g(Canvas canvas, RecyclerView recyclerView, x6c x6c) {
        int R;
        switch (this.a) {
            case 0:
                int i = 0;
                while (true) {
                    if (i < recyclerView.getChildCount()) {
                        int i2 = i + 1;
                        View childAt = recyclerView.getChildAt(i);
                        if (childAt != null) {
                            f6c adapter = recyclerView.getAdapter();
                            if (adapter != null && (R = RecyclerView.R(childAt)) > 0 && adapter.l(R) == d5a.i) {
                                int R2 = RecyclerView.R(childAt);
                                x3a x3a = this.c;
                                Rect rect = (Rect) this.b;
                                x3a.x(rect, childAt, R2);
                                float f = (float) 12;
                                Canvas canvas2 = canvas;
                                canvas2.drawRect((float) me4.c(f, dh4.c().getDisplayMetrics().density, rect.left), (float) rect.top, (float) me4.p(f, dh4.c().getDisplayMetrics().density, rect.right), (float) rect.bottom, (Paint) this.X);
                                float f2 = (float) 24;
                                canvas2.drawLine((float) me4.c(f2, dh4.c().getDisplayMetrics().density, rect.left), (float) rect.centerY(), (float) me4.p(f2, dh4.c().getDisplayMetrics().density, rect.right), (float) rect.centerY(), (Paint) this.o);
                            }
                            i = i2;
                        } else {
                            throw new IndexOutOfBoundsException();
                        }
                    } else {
                        return;
                    }
                }
            case 1:
                int i3 = 0;
                while (true) {
                    if (i3 < recyclerView.getChildCount()) {
                        int i4 = i3 + 1;
                        View childAt2 = recyclerView.getChildAt(i3);
                        if (childAt2 != null) {
                            recyclerView.getClass();
                            int R3 = RecyclerView.R(childAt2);
                            if (i(recyclerView, R3)) {
                                String upperCase = ((Context) this.o).getString(f5a.b).toUpperCase(Locale.ROOT);
                                x3a x3a2 = this.c;
                                Rect rect2 = (Rect) this.b;
                                x3a2.x(rect2, childAt2, R3);
                                canvas.drawText(upperCase, ((float) rect2.left) + ((float) a24.X(((float) 28) * dh4.c().getDisplayMetrics().density)), ((float) rect2.bottom) - ((float) a24.X(((float) 10) * dh4.c().getDisplayMetrics().density)), (TextPaint) this.X);
                            }
                            i3 = i4;
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

    public void h(Canvas canvas, RecyclerView recyclerView) {
        switch (this.a) {
            case 2:
                int childCount = recyclerView.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = recyclerView.getChildAt(i);
                    int R = RecyclerView.R(childAt);
                    if (R != -1) {
                        if (((Boolean) ((u16) this.X).invoke(Integer.valueOf(R))).booleanValue()) {
                            int X2 = a24.X(((float) 6) * dh4.c().getDisplayMetrics().density);
                            RectF rectF = (RectF) this.b;
                            rectF.set((float) (childAt.getLeft() - X2), (float) (childAt.getTop() - X2), (float) (childAt.getRight() + X2), (float) (childAt.getBottom() + X2));
                            float f = (float) 2;
                            canvas.drawRoundRect(rectF, rectF.width() / f, rectF.width() / f, (Paint) this.o);
                        }
                    }
                }
                return;
            case 3:
                int i2 = 0;
                while (true) {
                    if (i2 < recyclerView.getChildCount()) {
                        int i3 = i2 + 1;
                        View childAt2 = recyclerView.getChildAt(i2);
                        if (childAt2 != null) {
                            if (j(recyclerView, childAt2)) {
                                int X3 = a24.X(((float) 12) * dh4.c().getDisplayMetrics().density);
                                int X4 = a24.X(((float) 18) * dh4.c().getDisplayMetrics().density);
                                int R2 = RecyclerView.R(childAt2);
                                x3a x3a = this.c;
                                Rect rect = (Rect) this.b;
                                x3a.x(rect, childAt2, R2);
                                canvas.drawLine((float) (rect.left + X3), (float) rect.centerY(), (float) (rect.right - X4), (float) rect.centerY(), (Paint) this.o);
                            }
                            i2 = i3;
                        } else {
                            throw new IndexOutOfBoundsException();
                        }
                    } else {
                        return;
                    }
                }
            case 4:
                int i4 = 0;
                while (true) {
                    if (i4 < recyclerView.getChildCount()) {
                        int i5 = i4 + 1;
                        View childAt3 = recyclerView.getChildAt(i4);
                        if (childAt3 != null) {
                            recyclerView.getClass();
                            int R3 = RecyclerView.R(childAt3);
                            if (R3 != -1) {
                                jj7 jj7 = (jj7) this.o;
                                if (jj7.D(R3)) {
                                    x3a x3a2 = this.c;
                                    Rect rect2 = (Rect) this.b;
                                    x3a2.x(rect2, childAt3, R3);
                                    float X5 = ((float) rect2.left) + ((float) a24.X(((float) 16) * dh4.c().getDisplayMetrics().density));
                                    TextPaint textPaint = (TextPaint) this.X;
                                    canvas.drawText((String) jj7.b, X5, textPaint.descent() + ((float) rect2.centerY()), textPaint);
                                }
                            }
                            i4 = i5;
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

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        r2 = r3.l((r4 = androidx.recyclerview.widget.RecyclerView.R(r4)));
        r1 = defpackage.p2a.s;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean j(androidx.recyclerview.widget.RecyclerView r3, android.view.View r4) {
        /*
            r2 = this;
            f6c r3 = r3.getAdapter()
            r0 = 0
            if (r3 != 0) goto L_0x0008
            return r0
        L_0x0008:
            int r4 = androidx.recyclerview.widget.RecyclerView.R(r4)
            if (r4 <= 0) goto L_0x002a
            java.lang.Object r2 = r2.X
            gk3 r2 = (defpackage.gk3) r2
            boolean r2 = r2.c(r4)
            if (r2 == 0) goto L_0x0019
            goto L_0x002a
        L_0x0019:
            int r2 = r3.l(r4)
            int r1 = defpackage.p2a.s
            if (r2 != r1) goto L_0x002a
            r2 = 1
            int r4 = r4 - r2
            int r3 = r3.l(r4)
            if (r3 == r1) goto L_0x002a
            r0 = r2
        L_0x002a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.es5.j(androidx.recyclerview.widget.RecyclerView, android.view.View):boolean");
    }

    public final void onThemeChanged(pda pda) {
        switch (this.a) {
            case 0:
                ((Paint) this.o).setColor(pda.h().j);
                ((Paint) this.X).setColor(pda.b().f);
                return;
            case 1:
                nge nge = nte.q;
                DisplayMetrics displayMetrics = ((Context) this.o).getResources().getDisplayMetrics();
                TextPaint textPaint = (TextPaint) this.X;
                nge.c(nge, textPaint, displayMetrics);
                textPaint.setColor(pda.getText().f);
                return;
            case 2:
                pda.b().a.getClass();
                ((Paint) this.o).setColor(-16745729);
                return;
            case 3:
                ((Paint) this.o).setColor(pda.h().j);
                return;
            default:
                ((jj7) this.o).H((TextPaint) this.X);
                return;
        }
    }

    public es5(ui9 ui9, Context context) {
        this.X = ui9;
        this.c = new x3a(16);
        Paint paint = new Paint(1);
        paint.setStrokeWidth(dh4.c().getDisplayMetrics().density * 3.0f);
        paint.setStyle(Paint.Style.STROKE);
        this.o = paint;
        this.b = new RectF();
        onThemeChanged(km4.y0.n(context).g());
    }

    public es5(pda pda) {
        Paint paint = new Paint();
        paint.setStrokeWidth(dh4.c().getDisplayMetrics().density * 0.5f);
        this.o = paint;
        this.X = new Paint();
        this.b = new Rect();
        this.c = new x3a(16);
        onThemeChanged(pda);
    }

    public es5(pda pda, qpd qpd) {
        this.X = qpd;
        Paint paint = new Paint();
        paint.setStrokeWidth(dh4.c().getDisplayMetrics().density * 0.5f);
        this.o = paint;
        this.b = new Rect();
        this.c = new x3a(16);
        onThemeChanged(pda);
    }

    public es5(Context context) {
        this.o = context;
        this.b = new Rect();
        this.X = new TextPaint();
        onThemeChanged(km4.y0.n(context).g());
        this.c = new x3a(16);
    }
}
