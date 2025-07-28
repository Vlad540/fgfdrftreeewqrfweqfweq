package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: vi2  reason: default package */
public final class vi2 extends l6c {
    public final /* synthetic */ int a;
    public final int b;
    public final int c;

    public vi2(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = a24.X(((float) 24) * dh4.c().getDisplayMetrics().density);
                this.c = a24.X(((float) 16) * dh4.c().getDisplayMetrics().density);
                return;
            default:
                this.b = a24.X(((float) 24) * dh4.c().getDisplayMetrics().density);
                this.c = a24.X(((float) 16) * dh4.c().getDisplayMetrics().density);
                return;
        }
    }

    public final void f(Rect rect, View view, RecyclerView recyclerView, x6c x6c) {
        switch (this.a) {
            case 0:
                recyclerView.getClass();
                int R = RecyclerView.R(view);
                g7d adapter = recyclerView.getAdapter();
                g7d g7d = adapter instanceof g7d ? adapter : null;
                if (g7d != null && R >= 0 && R < g7d.j()) {
                    e7d e7d = (e7d) ((pg7) g7d.C(R));
                    e7d e7d2 = (e7d) g7d.G(R + 1);
                    int i = 0;
                    rect.top = R == 0 ? this.b : 0;
                    if (e7d2 == null || e7d.u() != e7d2.u()) {
                        i = this.c;
                    }
                    rect.bottom = i;
                    return;
                }
                return;
            case 1:
                recyclerView.getClass();
                int R2 = RecyclerView.R(view);
                g7d adapter2 = recyclerView.getAdapter();
                g7d g7d2 = adapter2 instanceof g7d ? adapter2 : null;
                if (g7d2 != null && R2 >= 0 && R2 < g7d2.j()) {
                    rect.top = R2 == 0 ? this.b : this.c;
                    return;
                }
                return;
            case 2:
                int i2 = this.b;
                rect.top = i2;
                rect.bottom = i2;
                if (x6c.b() == 1) {
                    rect.left = i2;
                    rect.right = i2;
                    return;
                }
                recyclerView.getClass();
                int R3 = RecyclerView.R(view);
                int b2 = x6c.b() - 1;
                int i3 = this.c;
                if (R3 == b2) {
                    rect.left = i3 / 2;
                    rect.right = i2;
                    return;
                } else if (RecyclerView.R(view) == 0) {
                    rect.left = i2;
                    rect.right = i3 / 2;
                    return;
                } else {
                    int i4 = i3 / 2;
                    rect.left = i4;
                    rect.right = i4;
                    return;
                }
            case 3:
                recyclerView.getClass();
                int R4 = RecyclerView.R(view);
                int i5 = this.b;
                int max = R4 % ((int) Math.max(1.0d, (double) i5));
                int max2 = (int) Math.max(1.0d, (double) i5);
                int i6 = this.c;
                rect.left = (max * i6) / max2;
                rect.right = i6 - (((max + 1) * i6) / max2);
                if (R4 >= max2) {
                    rect.top = i6;
                    return;
                }
                return;
            case 4:
                int i7 = this.c;
                rect.left = i7;
                rect.right = i7;
                rect.top = this.b;
                return;
            case 5:
                recyclerView.getClass();
                int R5 = RecyclerView.R(view);
                int i8 = this.b;
                if (R5 == 0) {
                    rect.right = i8 / 2;
                } else if (R5 == x6c.b() - 1) {
                    rect.left = i8 / 2;
                } else {
                    int i9 = i8 / 2;
                    rect.left = i9;
                    rect.right = i9;
                }
                int i10 = this.c;
                rect.top = i10;
                rect.bottom = i10;
                return;
            default:
                recyclerView.getClass();
                int R6 = RecyclerView.R(view);
                int b3 = x6c.b() - 1;
                int i11 = this.c;
                int i12 = this.b;
                if (R6 == b3) {
                    rect.top = i12;
                    rect.bottom = i11;
                    return;
                } else if (RecyclerView.R(view) == 0) {
                    rect.top = i11;
                    rect.bottom = i12;
                    return;
                } else {
                    rect.top = i12;
                    rect.bottom = i12;
                    return;
                }
        }
    }

    public /* synthetic */ vi2(int i, int i2, int i3) {
        this.a = i3;
        this.b = i;
        this.c = i2;
    }
}
