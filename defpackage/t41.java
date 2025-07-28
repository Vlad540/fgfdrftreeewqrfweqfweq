package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: t41  reason: default package */
public final class t41 extends w84 {
    public final /* synthetic */ u41 t;

    public t41(u41 u41) {
        this.t = u41;
        this.d = 300;
        this.c = 300;
        this.f = 300;
        this.e = 300;
    }

    public final void l() {
        RecyclerView recyclerView = this.t.a;
        if (recyclerView != null) {
            ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = -2;
                recyclerView.setLayoutParams(layoutParams);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
    }
}
