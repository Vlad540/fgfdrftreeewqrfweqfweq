package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* renamed from: ry4  reason: default package */
public final class ry4 extends r6c {
    public final ny4 a;
    public int b = 1;
    public qy4 c;
    public final /* synthetic */ EndlessRecyclerView2 d;

    public ry4(EndlessRecyclerView2 endlessRecyclerView2, ny4 ny4) {
        this.d = endlessRecyclerView2;
        this.a = ny4;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [one.me.sdk.lists.widgets.EndlessRecyclerView2, android.view.View] */
    public final void b(RecyclerView recyclerView, int i, int i2) {
        qy4 qy4 = this.c;
        ? r0 = this.d;
        if (qy4 != null) {
            r0.removeCallbacks(qy4);
        }
        qy4 qy42 = new qy4(this, i, i2);
        this.c = qy42;
        r0.post(qy42);
    }
}
