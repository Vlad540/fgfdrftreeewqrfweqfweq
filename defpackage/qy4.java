package defpackage;

import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* renamed from: qy4  reason: default package */
public final class qy4 implements Runnable {
    public final /* synthetic */ ry4 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public qy4(ry4 ry4, int i, int i2) {
        this.a = ry4;
        this.b = i;
        this.c = i2;
    }

    public final void run() {
        ry4 ry4 = this.a;
        ny4 ny4 = ry4.a;
        if (!(this.b == 0 && this.c == 0)) {
            ny4.getClass();
        }
        EndlessRecyclerView2 endlessRecyclerView2 = ry4.d;
        int Y0 = endlessRecyclerView2.getLinearLayoutManager().Y0();
        f6c adapter = endlessRecyclerView2.getAdapter();
        if ((adapter != null ? adapter.j() : 0) - Y0 <= ry4.b && ((endlessRecyclerView2.getIgnoreRefreshingFlagsForScrollEvent() || !endlessRecyclerView2.f2) && ny4.m())) {
            endlessRecyclerView2.setRefreshingNext(true);
            ny4.l();
        }
        int W0 = endlessRecyclerView2.getLinearLayoutManager().W0();
        if (W0 >= 0 && W0 <= ry4.b) {
            if ((endlessRecyclerView2.getIgnoreRefreshingFlagsForScrollEvent() || !endlessRecyclerView2.g2) && ny4.c()) {
                endlessRecyclerView2.setRefreshingPrev(true);
                ny4.i();
            }
        }
    }
}
