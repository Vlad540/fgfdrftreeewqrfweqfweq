package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: b7c  reason: default package */
public abstract class b7c {
    public static final List I0 = Collections.emptyList();
    public List A0 = null;
    public int B0 = 0;
    public t6c C0 = null;
    public boolean D0 = false;
    public int E0 = 0;
    public int F0 = -1;
    public RecyclerView G0;
    public f6c H0;
    public long X = -1;
    public int Y = -1;
    public int Z = -1;
    public final View a;
    public WeakReference b;
    public int c = -1;
    public int o = -1;
    public b7c w0 = null;
    public b7c x0 = null;
    public int y0;
    public ArrayList z0 = null;

    public b7c(View view) {
        if (view != null) {
            this.a = view;
            return;
        }
        throw new IllegalArgumentException("itemView may not be null");
    }

    public final void f(int i) {
        this.y0 = i | this.y0;
    }

    public final int g() {
        RecyclerView recyclerView = this.G0;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.P(this);
    }

    public final int h() {
        RecyclerView recyclerView;
        f6c adapter;
        int P;
        if (this.H0 == null || (recyclerView = this.G0) == null || (adapter = recyclerView.getAdapter()) == null || (P = this.G0.P(this)) == -1) {
            return -1;
        }
        return adapter.i(this.H0, this, P);
    }

    public final int i() {
        int i = this.Z;
        return i == -1 ? this.c : i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r2.z0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List j() {
        /*
            r2 = this;
            int r0 = r2.y0
            r0 = r0 & 1024(0x400, float:1.435E-42)
            java.util.List r1 = I0
            if (r0 != 0) goto L_0x0016
            java.util.ArrayList r0 = r2.z0
            if (r0 == 0) goto L_0x0016
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0013
            goto L_0x0016
        L_0x0013:
            java.util.List r2 = r2.A0
            return r2
        L_0x0016:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b7c.j():java.util.List");
    }

    public final boolean k(int i) {
        return (this.y0 & i) != 0;
    }

    public final boolean l() {
        View view = this.a;
        return (view.getParent() == null || view.getParent() == this.G0) ? false : true;
    }

    public final boolean m() {
        return (this.y0 & 1) != 0;
    }

    public final boolean n() {
        return (this.y0 & 4) != 0;
    }

    public final boolean o() {
        if ((this.y0 & 16) == 0) {
            WeakHashMap weakHashMap = eaf.a;
            if (!this.a.hasTransientState()) {
                return true;
            }
        }
        return false;
    }

    public final boolean p() {
        return (this.y0 & 8) != 0;
    }

    public final boolean q() {
        return this.C0 != null;
    }

    public final boolean r() {
        return (this.y0 & 256) != 0;
    }

    public final boolean s() {
        return (this.y0 & 2) != 0;
    }

    public final void t(int i, boolean z) {
        if (this.o == -1) {
            this.o = this.c;
        }
        if (this.Z == -1) {
            this.Z = this.c;
        }
        if (z) {
            this.Z += i;
        }
        this.c += i;
        View view = this.a;
        if (view.getLayoutParams() != null) {
            ((n6c) view.getLayoutParams()).c = true;
        }
    }

    public final String toString() {
        StringBuilder n = me4.n(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
        n.append(Integer.toHexString(hashCode()));
        n.append(" position=");
        n.append(this.c);
        n.append(" id=");
        n.append(this.X);
        n.append(", oldPos=");
        n.append(this.o);
        n.append(", pLpos:");
        n.append(this.Z);
        StringBuilder sb = new StringBuilder(n.toString());
        if (q()) {
            sb.append(" scrap ");
            sb.append(this.D0 ? "[changeScrap]" : "[attachedScrap]");
        }
        if (n()) {
            sb.append(" invalid");
        }
        if (!m()) {
            sb.append(" unbound");
        }
        if ((this.y0 & 2) != 0) {
            sb.append(" update");
        }
        if (p()) {
            sb.append(" removed");
        }
        if (w()) {
            sb.append(" ignored");
        }
        if (r()) {
            sb.append(" tmpDetached");
        }
        if (!o()) {
            sb.append(" not recyclable(" + this.B0 + ")");
        }
        if ((this.y0 & 512) != 0 || n()) {
            sb.append(" undefined adapter position");
        }
        if (this.a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }

    public final void u() {
        if (!RecyclerView.P1 || !r()) {
            this.y0 = 0;
            this.c = -1;
            this.o = -1;
            this.X = -1;
            this.Z = -1;
            this.B0 = 0;
            this.w0 = null;
            this.x0 = null;
            ArrayList arrayList = this.z0;
            if (arrayList != null) {
                arrayList.clear();
            }
            this.y0 &= -1025;
            this.E0 = 0;
            this.F0 = -1;
            RecyclerView.o(this);
            return;
        }
        throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
    }

    public final void v(boolean z) {
        int i = this.B0;
        int i2 = z ? i - 1 : i + 1;
        this.B0 = i2;
        if (i2 < 0) {
            this.B0 = 0;
            if (!RecyclerView.P1) {
                toString();
            } else {
                throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            }
        } else if (!z && i2 == 1) {
            this.y0 |= 16;
        } else if (z && i2 == 0) {
            this.y0 &= -17;
        }
        if (RecyclerView.Q1) {
            toString();
        }
    }

    public final boolean w() {
        return (this.y0 & 128) != 0;
    }

    public final boolean y() {
        return (this.y0 & 32) != 0;
    }
}
