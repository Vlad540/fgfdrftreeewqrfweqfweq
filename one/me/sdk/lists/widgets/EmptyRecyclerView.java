package one.me.sdk.lists.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Metadata;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0002\b\u0003\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011R/\u0010\u0018\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000e8B@BX\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0011¨\u0006\u0019"}, d2 = {"Lone/me/sdk/lists/widgets/EmptyRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lf6c;", "adapter", "Ljue;", "setAdapter", "(Lf6c;)V", "Landroid/view/View;", "emptyView", "setEmptyView", "(Landroid/view/View;)V", "<set-?>", "Z1", "Lp0c;", "getMEmptyView", "()Landroid/view/View;", "setMEmptyView", "mEmptyView", "lists_release"}, k = 1, mv = {2, 0, 0})
public class EmptyRecyclerView extends RecyclerView {
    public static final /* synthetic */ k77[] c2;
    public final u2 Z1 = new kw4(this, 0);
    public h6c a2;
    public final LinkedHashSet b2 = new LinkedHashSet();

    static {
        k77 hc9 = new hc9(EmptyRecyclerView.class, "mEmptyView", "getMEmptyView()Landroid/view/View;");
        m7c.a.getClass();
        c2 = new k77[]{hc9};
    }

    public EmptyRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static void K0(f6c f6c, h6c h6c) {
        if (h6c != null) {
            try {
                f6c.z(h6c);
            } catch (Exception e) {
                udd.S(f6c.getClass().getName(), "fail to unregister data observer", e);
            }
        }
    }

    public static void L0(f6c f6c, h6c h6c) {
        if (h6c != null) {
            try {
                f6c.B(h6c);
            } catch (Exception e) {
                udd.S(f6c.getClass().getName(), "fail to unregister data observer", e);
            }
        }
    }

    private final View getMEmptyView() {
        k77 k77 = c2[0];
        return (View) this.Z1.b;
    }

    private final void setMEmptyView(View view) {
        this.Z1.o1(this, c2[0], view);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [android.view.View, androidx.recyclerview.widget.RecyclerView, one.me.sdk.lists.widgets.EmptyRecyclerView] */
    public final void F0() {
        if (getMEmptyView() != null && getAdapter() != null) {
            f6c adapter = getAdapter();
            int i = 0;
            boolean z = adapter != null && adapter.j() == 0;
            View mEmptyView = getMEmptyView();
            if (mEmptyView != null) {
                mEmptyView.setVisibility(z ? 0 : 8);
            }
            if (z) {
                i = 8;
            }
            setVisibility(i);
        }
    }

    public void G0(f6c f6c) {
    }

    public void H0(f6c f6c) {
    }

    public void I0() {
    }

    public void J0() {
    }

    public final void M0(f6c f6c, boolean z) {
        f6c adapter = getAdapter();
        if (adapter != null) {
            L0(adapter, this.a2);
        }
        J0();
        f6c N0 = N0(f6c);
        setLayoutFrozen(false);
        y0(N0, true, z);
        k0(true);
        requestLayout();
        if (N0 != null) {
            K0(N0, this.a2);
        }
        H0(N0);
    }

    public f6c N0(f6c f6c) {
        return f6c;
    }

    public final void setAdapter(f6c f6c) {
        h6c h6c;
        f6c adapter = getAdapter();
        if (!(adapter == null || (h6c = this.a2) == null)) {
            L0(adapter, h6c);
            this.a2 = null;
        }
        f6c N0 = N0(f6c);
        I0();
        EmptyRecyclerView.super.setAdapter(N0);
        if (!(N0 == null || getMEmptyView() == null)) {
            jw4 jw4 = new jw4(0, this);
            this.a2 = jw4;
            K0(N0, jw4);
        }
        G0(N0);
        F0();
    }

    public final void setEmptyView(View view) {
        if (!hhd.f(view, getMEmptyView())) {
            View mEmptyView = getMEmptyView();
            if (mEmptyView != null) {
                mEmptyView.setVisibility(8);
            }
            setMEmptyView(view);
            F0();
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.view.View, one.me.sdk.lists.widgets.EmptyRecyclerView] */
    public final void setPadding(int i, int i2, int i3, int i4) {
        EmptyRecyclerView.super.setPadding(i, i2, i3, i4);
        Iterator it = this.b2.iterator();
        if (it.hasNext()) {
            hr1.r(it.next());
            throw null;
        }
    }

    public EmptyRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
