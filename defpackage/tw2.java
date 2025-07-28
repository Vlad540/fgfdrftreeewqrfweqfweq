package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: tw2  reason: default package */
public final class tw2 extends l6c implements mhe {
    public Drawable X;
    public final Rect Y = new Rect();
    public final Rect Z = new Rect();
    public final s16 a;
    public final u16 b;
    public final u16 c;
    public final u16 o;
    public final int[] w0 = {16842912};
    public final int[] x0 = {-16842912};

    public tw2(s16 s16, u16 u16, u16 u162, u16 u163) {
        this.a = s16;
        this.b = u16;
        this.c = u162;
        this.o = u163;
        this.X = (Drawable) s16.invoke();
    }

    public final void f(Rect rect, View view, RecyclerView recyclerView, x6c x6c) {
        recyclerView.getClass();
        if (((Boolean) this.c.invoke(Integer.valueOf(RecyclerView.R(view)))).booleanValue()) {
            rect.left = me4.c((float) 36, dh4.c().getDisplayMetrics().density, rect.left);
        }
    }

    public final void g(Canvas canvas, RecyclerView recyclerView, x6c x6c) {
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((Boolean) this.c.invoke(Integer.valueOf(i))).booleanValue()) {
                Drawable background = recyclerView.getChildAt(i).getBackground();
                RippleDrawable rippleDrawable = background instanceof RippleDrawable ? (RippleDrawable) background : null;
                if (rippleDrawable != null) {
                    d8.G(rippleDrawable, a24.X(((float) -36) * dh4.c().getDisplayMetrics().density), 0, 0, 14);
                }
            }
        }
    }

    public final void h(Canvas canvas, RecyclerView recyclerView) {
        int X2 = a24.X(((float) 12) * dh4.c().getDisplayMetrics().density);
        int X3 = a24.X(((float) 24) * dh4.c().getDisplayMetrics().density) / 2;
        int i = 0;
        while (true) {
            if (i < recyclerView.getChildCount()) {
                int i2 = i + 1;
                View childAt = recyclerView.getChildAt(i);
                if (childAt != null) {
                    recyclerView.getClass();
                    int R = RecyclerView.R(childAt);
                    if (((Boolean) this.o.invoke(Integer.valueOf(R))).booleanValue()) {
                        Rect rect = this.Y;
                        RecyclerView.V(rect, childAt);
                        Rect rect2 = this.Z;
                        childAt.getDrawingRect(rect2);
                        int height = (rect.height() - rect2.height()) / 2;
                        this.X.setAlpha(a24.X(childAt.getAlpha() * ((float) 255)));
                        if (((Boolean) this.b.invoke(Integer.valueOf(R))).booleanValue()) {
                            Drawable drawable = this.X;
                            drawable.setState(this.w0);
                            drawable.setBounds(rect.left + X2, (rect.centerY() - X3) + height, (X3 * 2) + rect.left + X2, rect.centerY() + X3 + height);
                            drawable.draw(canvas);
                        } else {
                            Drawable drawable2 = this.X;
                            drawable2.setState(this.x0);
                            drawable2.setBounds(rect.left + X2, (rect.centerY() - X3) + height, (X3 * 2) + rect.left + X2, rect.centerY() + X3 + height);
                            drawable2.draw(canvas);
                        }
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
        this.X = (Drawable) this.a.invoke();
    }
}
