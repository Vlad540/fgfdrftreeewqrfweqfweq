package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.futuremind.recyclerviewfastscroll.FastScroller;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: ly4  reason: default package */
public final class ly4 extends r6c {
    public final /* synthetic */ int a;
    public int b;
    public final Object c;
    public final Object d;

    public ly4(ty4 ty4, ny4 ny4) {
        this.a = 0;
        this.d = ty4;
        this.c = ny4;
        this.b = 1;
    }

    public void a(RecyclerView recyclerView, int i) {
        switch (this.a) {
            case 1:
                FastScroller fastScroller = (FastScroller) this.c;
                if (i == 0 && this.b != 0) {
                    mpc viewProvider = fastScroller.getViewProvider();
                    viewProvider.getClass();
                    if (viewProvider.a() != null) {
                        viewProvider.a().getClass();
                    }
                } else if (i != 0 && this.b == 0) {
                    mpc viewProvider2 = fastScroller.getViewProvider();
                    viewProvider2.getClass();
                    if (viewProvider2.a() != null) {
                        viewProvider2.a().getClass();
                    }
                }
                this.b = i;
                return;
            default:
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.view.View, ty4] */
    public final void b(RecyclerView recyclerView, int i, int i2) {
        switch (this.a) {
            case 0:
                ? r0 = (ty4) this.d;
                r0.post(new ky4(i, i2, this, r0));
                return;
            default:
                FastScroller fastScroller = (FastScroller) this.c;
                if (fastScroller.o != null && !fastScroller.D0 && fastScroller.b.getChildCount() > 0) {
                    c(recyclerView);
                    return;
                }
                return;
        }
    }

    public void c(RecyclerView recyclerView) {
        int computeHorizontalScrollOffset;
        int computeHorizontalScrollExtent;
        int computeHorizontalScrollRange;
        FastScroller fastScroller = (FastScroller) this.c;
        if (fastScroller.c()) {
            computeHorizontalScrollOffset = recyclerView.computeVerticalScrollOffset();
            computeHorizontalScrollExtent = recyclerView.computeVerticalScrollExtent();
            computeHorizontalScrollRange = recyclerView.computeVerticalScrollRange();
        } else {
            computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
            computeHorizontalScrollExtent = recyclerView.computeHorizontalScrollExtent();
            computeHorizontalScrollRange = recyclerView.computeHorizontalScrollRange();
        }
        fastScroller.setScrollerPosition(((float) computeHorizontalScrollOffset) / ((float) (computeHorizontalScrollRange - computeHorizontalScrollExtent)));
        Iterator it = ((ArrayList) this.d).iterator();
        if (it.hasNext()) {
            hr1.r(it.next());
            throw null;
        }
    }

    public ly4(FastScroller fastScroller) {
        this.a = 1;
        this.d = new ArrayList();
        this.b = 0;
        this.c = fastScroller;
    }
}
