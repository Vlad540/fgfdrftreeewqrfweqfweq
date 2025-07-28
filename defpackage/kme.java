package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: kme  reason: default package */
public final class kme extends ibe {
    public final ga3 o;

    public kme(ga3 ga3) {
        this.o = ga3;
    }

    public static final void h0(kme kme, RecyclerView recyclerView) {
        kme.getClass();
        LinearLayoutManager layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? layoutManager : null;
        if (linearLayoutManager == null) {
            if (recyclerView.canScrollVertically(-1)) {
                return;
            }
        } else if (linearLayoutManager.W0() > 0) {
            return;
        }
        if (kme.o.b) {
            recyclerView.B0(0);
        } else {
            recyclerView.x0(0);
        }
    }

    public final h6c W(RecyclerView recyclerView, f6c f6c) {
        return new pyd(this, recyclerView, 1);
    }
}
