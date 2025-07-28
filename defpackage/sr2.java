package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* renamed from: sr2  reason: default package */
public final class sr2 implements o6c {
    public final RecyclerView a;
    public final s16 b;

    public sr2(EndlessRecyclerView2 endlessRecyclerView2, gu2 gu2) {
        this.a = endlessRecyclerView2;
        this.b = gu2;
    }

    public final void b(View view) {
    }

    public final void d(View view) {
        RecyclerView recyclerView = this.a;
        View I = recyclerView.I(view);
        b7c T = I == null ? null : recyclerView.T(I);
        if ((T instanceof a85) || (T instanceof w75)) {
            afa.a(view, new rr2(view, this, 0));
        } else if (T instanceof pp2) {
            afa.a(view, new rr2(view, this, 1));
        }
    }
}
