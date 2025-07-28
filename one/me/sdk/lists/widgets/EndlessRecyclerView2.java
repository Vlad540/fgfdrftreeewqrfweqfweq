package one.me.sdk.lists.widgets;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.a;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u00070J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010 \u001a\u00020\u000e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010\u0011R\u001b\u0010&\u001a\u00020!8BX\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001b\u0010+\u001a\u00020'8BX\u0002¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b)\u0010*R\u0011\u0010/\u001a\u00020,8F¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00061"}, d2 = {"Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", "Lone/me/sdk/lists/widgets/EmptyRecyclerView;", "Lo7c;", "delegate", "Ljue;", "setRefreshingNextDelegate", "(Lo7c;)V", "Lpy4;", "setDelegate", "(Lpy4;)V", "Landroidx/recyclerview/widget/a;", "layout", "setLayoutManager", "(Landroidx/recyclerview/widget/a;)V", "", "value", "setRefreshingNext", "(Z)V", "setRefreshingPrev", "Lny4;", "pager", "setPager", "(Lny4;)V", "", "threshold", "setThreshold", "(I)V", "h2", "Z", "getIgnoreRefreshingFlagsForScrollEvent", "()Z", "setIgnoreRefreshingFlagsForScrollEvent", "ignoreRefreshingFlagsForScrollEvent", "", "k2", "Lt97;", "getFrameIntervalNanos", "()J", "frameIntervalNanos", "", "l2", "getTag", "()Ljava/lang/String;", "tag", "Landroidx/recyclerview/widget/LinearLayoutManager;", "getLinearLayoutManager", "()Landroidx/recyclerview/widget/LinearLayoutManager;", "linearLayoutManager", "ry4", "lists_release"}, k = 1, mv = {2, 0, 0})
public final class EndlessRecyclerView2 extends EmptyRecyclerView {
    public static final /* synthetic */ int m2 = 0;
    public ry4 d2;
    public int e2;
    public boolean f2;
    public boolean g2;
    public boolean h2;
    public py4 i2;
    public final sy4 j2;
    public final t97 k2;
    public final t97 l2;

    public EndlessRecyclerView2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    private final long getFrameIntervalNanos() {
        return ((Number) this.k2.getValue()).longValue();
    }

    private final String getTag() {
        return (String) this.l2.getValue();
    }

    public final void G0(f6c f6c) {
        if (f6c != null) {
            EmptyRecyclerView.K0(f6c, this.j2);
        }
    }

    public final void H0(f6c f6c) {
        if (f6c != null) {
            EmptyRecyclerView.K0(f6c, this.j2);
        }
    }

    public final void I0() {
        f6c adapter = getAdapter();
        if (adapter != null) {
            EmptyRecyclerView.L0(adapter, this.j2);
        }
    }

    public final void J0() {
        f6c adapter = getAdapter();
        if (adapter != null) {
            EmptyRecyclerView.L0(adapter, this.j2);
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [one.me.sdk.lists.widgets.EndlessRecyclerView2, android.view.View, android.view.ViewGroup] */
    public final boolean O0() {
        return getChildCount() != 0 && getChildAt(0).getTop() <= getTop() && getChildAt(getChildCount() - 1).getBottom() >= getBottom();
    }

    public final boolean getIgnoreRefreshingFlagsForScrollEvent() {
        return this.h2;
    }

    public final LinearLayoutManager getLinearLayoutManager() {
        return getLayoutManager();
    }

    public final void onLayout(boolean z, int i, int i3, int i4, int i5) {
        try {
            EndlessRecyclerView2.super.onLayout(z, i, i3, i4, i5);
        } catch (Exception e) {
            udd.s("EndlessRecyclerView2", "onLayout", e);
        }
        ry4 ry4 = this.d2;
        if (ry4 != null) {
            ry4.b(this, 0, 0);
        }
    }

    public final void setDelegate(py4 py4) {
        this.i2 = py4;
    }

    public final void setIgnoreRefreshingFlagsForScrollEvent(boolean z) {
        this.h2 = z;
    }

    public void setLayoutManager(a aVar) {
        if (aVar instanceof LinearLayoutManager) {
            EndlessRecyclerView2.super.setLayoutManager(aVar);
            return;
        }
        throw new IllegalArgumentException("layout manager must be an instance of LinearLayoutManager or StaggeredGridLayoutManager");
    }

    public final void setPager(ny4 ny4) {
        if (ny4 != null) {
            ry4 ry4 = new ry4(this, ny4);
            int i = this.e2;
            if (i > 0) {
                ry4.b = i;
            }
            m(ry4);
            this.d2 = ry4;
            return;
        }
        ry4 ry42 = this.d2;
        if (ry42 != null) {
            s0(ry42);
            this.d2 = null;
        }
    }

    public final void setRefreshingNext(boolean z) {
        if (this.f2 != z) {
            if (z) {
                py4 py4 = this.i2;
                if (py4 != null) {
                    py4.d();
                }
            } else {
                py4 py42 = this.i2;
                if (py42 != null) {
                    py42.g();
                }
            }
            this.f2 = z;
        }
    }

    public final void setRefreshingNextDelegate(o7c o7c) {
    }

    public final void setRefreshingPrev(boolean z) {
        if (this.g2 != z) {
            this.g2 = z;
        }
    }

    public final void setThreshold(int i) {
        this.e2 = i;
        ry4 ry4 = this.d2;
        if (ry4 != null && i > 0) {
            ry4.b = i;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EndlessRecyclerView2(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.e2 = 1;
        this.j2 = new sy4(this);
        this.k2 = ez3.O(3, new cc3(context, 4));
        this.l2 = ez3.O(3, new oy4(this, 0));
    }
}
