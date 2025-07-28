package defpackage;

import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import one.me.calllist.ui.page.CallHistoryPageScreen;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* renamed from: q61  reason: default package */
public final /* synthetic */ class q61 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CallHistoryPageScreen b;

    public /* synthetic */ q61(CallHistoryPageScreen callHistoryPageScreen, int i) {
        this.a = i;
        this.b = callHistoryPageScreen;
    }

    /* JADX WARNING: type inference failed for: r0v14, types: [f6c, o61] */
    public final Object invoke() {
        Widget widget = this.b;
        switch (this.a) {
            case 0:
                kk9 kk9 = CallHistoryPageScreen.y0;
                return new w61(widget.requireActivity().getApplicationContext(), widget.l0(), (we1) widget.c.getValue());
            case 1:
                kk9 kk92 = CallHistoryPageScreen.y0;
                return new we1(new r7e(new q61(widget, 5)), new jrf(widget, 0));
            case 2:
                kk9 kk93 = CallHistoryPageScreen.y0;
                if (widget.l0() != g71.MISSING) {
                    return null;
                }
                p4a p4a = new p4a(widget.getContext(), (AttributeSet) null);
                p4a.setVisibility(8);
                p4a.setId(sob.call_history_page_empty);
                p4a.setIcon(phc.f0);
                p4a.setTitle(new hge(ctb.call_history_missed_calls_empty_state_title));
                return p4a;
            case 3:
                kk9 kk94 = CallHistoryPageScreen.y0;
                EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(widget.getContext(), (AttributeSet) null, 6);
                endlessRecyclerView2.setId(sob.call_history_list);
                endlessRecyclerView2.getContext();
                endlessRecyclerView2.setLayoutManager(new LinearLayoutManager());
                endlessRecyclerView2.setAdapter((o61) widget.Z.getValue());
                widget.o = gp0.l(endlessRecyclerView2);
                p4a p4a2 = (p4a) widget.X.getValue();
                if (p4a2 != null) {
                    endlessRecyclerView2.setEmptyView(p4a2);
                }
                endlessRecyclerView2.setPager(new t61(widget, 0));
                endlessRecyclerView2.setIgnoreRefreshingFlagsForScrollEvent(true);
                endlessRecyclerView2.setThreshold(10);
                endlessRecyclerView2.setClipToPadding(false);
                float f = (float) 0;
                float f2 = (float) 10;
                endlessRecyclerView2.setPadding(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(dh4.c().getDisplayMetrics().density * f2), a24.X(f * dh4.c().getDisplayMetrics().density), a24.X(f2 * dh4.c().getDisplayMetrics().density));
                return endlessRecyclerView2;
            case 4:
                kk9 kk95 = CallHistoryPageScreen.y0;
                return new o61(new mod(5, widget), nqc.a.p().b());
            default:
                kk9 kk96 = CallHistoryPageScreen.y0;
                return widget.getRouter();
        }
    }
}
