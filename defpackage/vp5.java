package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: vp5  reason: default package */
public final class vp5 extends l6c {
    public final /* synthetic */ int a = 1;
    public final int b;
    public final int c;
    public final Object o;

    public vp5(int i, py9 py9) {
        this.b = i;
        this.o = py9;
        this.c = a24.X(((float) 12) * dh4.c().getDisplayMetrics().density);
    }

    public final void f(Rect rect, View view, RecyclerView recyclerView, x6c x6c) {
        GridLayoutManager p;
        gc6 gc6;
        int R;
        switch (this.a) {
            case 0:
                recyclerView.getClass();
                int R2 = RecyclerView.R(view);
                f6c adapter = recyclerView.getAdapter();
                if (adapter != null && R2 >= 0 && R2 < adapter.j()) {
                    int i = this.c;
                    rect.left = i;
                    rect.right = i;
                    int i2 = ((otc) this.o).i(R2);
                    if (i2 == 0 || i2 == 1 || i2 == 4) {
                        rect.top = this.b;
                        return;
                    }
                    return;
                }
                return;
            default:
                f6c adapter2 = recyclerView.getAdapter();
                if (adapter2 != null && (p = gp0.p(recyclerView)) != null && (gc6 = p.K) != null && (R = RecyclerView.R(view)) >= 0 && R < adapter2.j()) {
                    int b2 = gc6.b(R, 8);
                    int a2 = gc6.a(R, 8);
                    int a3 = gc6.a(adapter2.j() - 1, 8);
                    int i3 = this.c / 2;
                    if (((Boolean) ((s16) this.o).invoke()).booleanValue()) {
                        if (a2 == 0) {
                            rect.bottom = i3;
                        } else if (a2 == a3) {
                            rect.top = i3;
                        } else {
                            rect.bottom = i3;
                            rect.top = i3;
                        }
                    }
                    int i4 = this.b;
                    rect.left = (b2 * i4) / 8;
                    rect.right = i4 - (((b2 + 1) * i4) / 8);
                    return;
                }
                return;
        }
    }

    public vp5(r34 r34) {
        this.o = r34;
        this.b = a24.X(((float) 16) * dh4.c().getDisplayMetrics().density);
        this.c = a24.X(((float) 12) * dh4.c().getDisplayMetrics().density);
    }
}
