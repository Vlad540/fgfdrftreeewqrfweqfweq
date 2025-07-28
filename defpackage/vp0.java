package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: vp0  reason: default package */
public final class vp0 extends ibe {
    public final int X = 1;
    public final String Y = vp0.class.getName();
    public final boolean o = true;

    public static final boolean h0(vp0 vp0, RecyclerView recyclerView, int i) {
        vp0.getClass();
        int i2 = i - 1;
        View childAt = recyclerView.getChildAt(recyclerView.getChildCount() - 1);
        if (childAt != null && RecyclerView.R(childAt) == i2) {
            int k = gp0.k(recyclerView, 1.0f);
            View childAt2 = recyclerView.getChildAt(recyclerView.getChildCount() - 1);
            if (childAt2 != null && RecyclerView.R(childAt2) == k) {
                return true;
            }
        }
        return false;
    }

    public static final void i0(vp0 vp0, RecyclerView recyclerView, f6c f6c, int i) {
        if (!vp0.o || i != f6c.j() - 1) {
            recyclerView.x0(f6c.j() - 1);
        } else {
            recyclerView.B0(f6c.j() - 1);
        }
    }

    public final h6c W(RecyclerView recyclerView, f6c f6c) {
        return new sy4(this, recyclerView, f6c);
    }
}
