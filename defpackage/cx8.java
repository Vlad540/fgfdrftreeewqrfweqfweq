package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* renamed from: cx8  reason: default package */
public final class cx8 implements o6c {
    public final RecyclerView a;
    public final s16 b;

    public cx8(EndlessRecyclerView2 endlessRecyclerView2, a09 a09) {
        this.a = endlessRecyclerView2;
        this.b = a09;
    }

    public final void b(View view) {
    }

    public final void d(View view) {
        RecyclerView recyclerView = this.a;
        View I = recyclerView.I(view);
        if ((I == null ? null : recyclerView.T(I)) instanceof gt8) {
            afa.a(view, new vp6(15, view, this));
        }
    }
}
