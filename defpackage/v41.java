package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.calls.ui.ui.call.panels.CallEventsWidget;

/* renamed from: v41  reason: default package */
public final class v41 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallEventsWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v41(Continuation continuation, CallEventsWidget callEventsWidget) {
        super(2, continuation);
        this.Y = callEventsWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((v41) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        v41 v41 = new v41(continuation, this.Y);
        v41.X = obj;
        return v41;
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [i41, ig7] */
    public final Object o(Object obj) {
        f6c adapter;
        wx3.H(obj);
        List list = (List) this.X;
        CallEventsWidget callEventsWidget = this.Y;
        u41 u41 = callEventsWidget.o;
        int size = list.size();
        RecyclerView recyclerView = u41.a;
        if (!(recyclerView == null || (adapter = recyclerView.getAdapter()) == null || adapter.j() <= size)) {
            int height = recyclerView.getHeight();
            RecyclerView recyclerView2 = u41.a;
            if (recyclerView2 != null) {
                ViewGroup.LayoutParams layoutParams = recyclerView2.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = height;
                    recyclerView2.setLayoutParams(layoutParams);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
        }
        callEventsWidget.a.E(list);
        return jue.a;
    }
}
