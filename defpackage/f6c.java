package defpackage;

import android.database.Observable;
import android.os.Trace;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: f6c  reason: default package */
public abstract class f6c {
    public final g6c a = new Observable();
    public boolean b = false;
    public int c = 1;

    public void A(boolean z) {
        if (!this.a.a()) {
            this.b = z;
            return;
        }
        throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
    }

    public void B(h6c h6c) {
        this.a.unregisterObserver(h6c);
    }

    public final void h(b7c b7c, int i) {
        boolean z = b7c.H0 == null;
        if (z) {
            b7c.c = i;
            if (this.b) {
                b7c.X = k(i);
            }
            b7c.y0 = (b7c.y0 & -520) | 1;
            Trace.beginSection("RV OnBindView");
        }
        b7c.H0 = this;
        boolean z2 = RecyclerView.P1;
        View view = b7c.a;
        if (z2) {
            if (view.getParent() == null) {
                WeakHashMap weakHashMap = eaf.a;
                if (view.isAttachedToWindow() != b7c.r()) {
                    throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + b7c.r() + ", attached to window: " + view.isAttachedToWindow() + ", holder: " + b7c);
                }
            }
            if (view.getParent() == null) {
                WeakHashMap weakHashMap2 = eaf.a;
                if (view.isAttachedToWindow()) {
                    throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + b7c);
                }
            }
        }
        s(b7c, i, b7c.j());
        if (z) {
            ArrayList arrayList = b7c.z0;
            if (arrayList != null) {
                arrayList.clear();
            }
            b7c.y0 &= -1025;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof n6c) {
                ((n6c) layoutParams).c = true;
            }
            Trace.endSection();
        }
    }

    public int i(f6c f6c, b7c b7c, int i) {
        if (f6c == this) {
            return i;
        }
        return -1;
    }

    public abstract int j();

    public long k(int i) {
        return -1;
    }

    public int l(int i) {
        return 0;
    }

    public final void m() {
        this.a.b();
    }

    public final void n(int i, int i2) {
        this.a.c(i, i2);
    }

    public final void o(int i, int i2, Object obj) {
        this.a.d(i, i2, obj);
    }

    public final void p(int i, int i2) {
        this.a.e(i, i2);
    }

    public void q(RecyclerView recyclerView) {
    }

    public abstract void r(b7c b7c, int i);

    public void s(b7c b7c, int i, List list) {
        r(b7c, i);
    }

    public abstract b7c t(ViewGroup viewGroup, int i);

    public void u(RecyclerView recyclerView) {
    }

    public boolean v(b7c b7c) {
        return false;
    }

    public void w(b7c b7c) {
    }

    public void x(b7c b7c) {
    }

    public void y(b7c b7c) {
    }

    public void z(h6c h6c) {
        this.a.registerObserver(h6c);
    }
}
