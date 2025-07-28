package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.recyclerview.widget.a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import one.me.sdk.lists.widgets.EmptyRecyclerView;

/* renamed from: ty4  reason: default package */
public class ty4 extends EmptyRecyclerView {
    public final LinkedHashSet d2 = new LinkedHashSet();
    public final LinkedHashSet e2 = new LinkedHashSet();
    public ly4 f2;
    public jy4 g2;
    public boolean h2;
    public boolean i2;
    public int j2 = 1;
    public Integer k2;
    public rf3 l2;
    public boolean m2;

    public ty4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        ty4.super.setOnScrollListener(new my4(0, this));
    }

    /* access modifiers changed from: private */
    public static final void setRefreshingNext$lambda$3(ty4 ty4) {
        jy4 jy4 = ty4.g2;
        if (jy4 != null) {
            if (ty4.h2) {
                jy4.a.e(jy4.j() - 1, 1);
                return;
            }
            jy4.m();
        }
    }

    public final void G0(f6c f6c) {
        this.g2 = f6c instanceof jy4 ? (jy4) f6c : null;
        F0();
    }

    public final f6c N0(f6c f6c) {
        if (f6c instanceof jy4) {
            return f6c;
        }
        if (f6c != null) {
            return new jy4(this, f6c);
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.view.View, java.lang.Object, androidx.recyclerview.widget.RecyclerView, ty4] */
    public final void P0(int i) {
        if (Z()) {
            if (i <= 5) {
                post(new n30(i, 9, this));
            }
        } else if (this.i2) {
            jy4 jy4 = this.g2;
            if (jy4 != null) {
                jy4.a.e(0, 1);
            }
        } else {
            jy4 jy42 = this.g2;
            if (jy42 != null) {
                jy42.a.f(0, 1);
            }
        }
    }

    public f6c getAdapter() {
        return this.g2;
    }

    public final boolean getIgnoreRefreshingFlagsForScrollEvent() {
        return this.m2;
    }

    public final LinearLayoutManager getLinearLayoutManager() {
        LinearLayoutManager layoutManager = ty4.super.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return layoutManager;
        }
        return null;
    }

    public final o7c getRefreshingNextDelegate() {
        return null;
    }

    public final void h0() {
        Iterator it = this.e2.iterator();
        if (it.hasNext()) {
            hr1.r(it.next());
            throw null;
        }
    }

    public final void m(r6c r6c) {
        this.d2.add(r6c);
    }

    public void onLayout(boolean z, int i, int i3, int i4, int i5) {
        try {
            ty4.super.onLayout(z, i, i3, i4, i5);
        } catch (Exception e) {
            udd.s("EndlessRecyclerView", "onLayout", e);
        }
        ly4 ly4 = this.f2;
        if (ly4 != null) {
            ly4.b(this, 0, 0);
        }
    }

    public final void s0(r6c r6c) {
        this.d2.remove(r6c);
    }

    public final void setIgnoreRefreshingFlagsForScrollEvent(boolean z) {
        this.m2 = z;
    }

    public void setLayoutManager(a aVar) {
        if ((aVar instanceof LinearLayoutManager) || (aVar instanceof StaggeredGridLayoutManager)) {
            ty4.super.setLayoutManager(aVar);
            return;
        }
        throw new IllegalArgumentException("layout manager must be an instance of LinearLayoutManager or StaggeredGridLayoutManager");
    }

    public void setOnScrollListener(r6c r6c) {
        throw new UnsupportedOperationException("use addOnScrollListener(OnScrollListener) and removeOnScrollListener(OnScrollListener) instead");
    }

    public final void setPager(ny4 ny4) {
        if (ny4 != null) {
            ly4 ly4 = new ly4(this, ny4);
            int i = this.j2;
            if (i > 0) {
                ly4.b = i;
                m(ly4);
                this.f2 = ly4;
                return;
            }
            throw new IllegalArgumentException(wn6.h(i, "illegal threshold: ").toString());
        }
        ly4 ly42 = this.f2;
        if (ly42 != null) {
            s0(ly42);
            this.f2 = null;
        }
    }

    public final void setProgressView(int i) {
        this.k2 = Integer.valueOf(i);
        this.l2 = null;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void setRefreshingNext(boolean z) {
        if (this.h2 != z) {
            if (z && this.k2 == null) {
                z = false;
            }
            this.h2 = z;
            z3d.L(this, new oc4(13, this));
        }
    }

    public final void setRefreshingNextDelegate(o7c o7c) {
    }

    public final void setRefreshingPrev(boolean z) {
        if (this.i2 != z) {
            if (!z || this.k2 != null) {
                this.i2 = z;
            } else {
                this.i2 = false;
            }
            P0(0);
        }
    }

    public final void setThreshold(int i) {
        this.j2 = i;
        ly4 ly4 = this.f2;
        if (ly4 == null) {
            return;
        }
        if (i > 0) {
            ly4.b = i;
            return;
        }
        throw new IllegalArgumentException(wn6.h(i, "illegal threshold: ").toString());
    }
}
