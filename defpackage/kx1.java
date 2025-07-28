package defpackage;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: kx1  reason: default package */
public final class kx1 extends r6c {
    public final jgd a;
    public final u16 b;

    public kx1(jgd jgd, u16 u16) {
        this.a = jgd;
        this.b = u16;
    }

    public final void b(RecyclerView recyclerView, int i, int i2) {
        int T0;
        GridLayoutManager p = gp0.p(recyclerView);
        if (p != null && (T0 = p.T0()) != -1) {
            this.b.invoke((pg7) o23.Y(T0, this.a.o.f));
        }
    }
}
