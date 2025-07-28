package defpackage;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: ij9  reason: default package */
public final class ij9 extends r6c {
    public final mr5 a;
    public final u16 b;
    public boolean c;

    public ij9(mr5 mr5, h87 h87) {
        this.a = mr5;
        this.b = h87;
    }

    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0) {
            this.c = false;
        }
    }

    public final void b(RecyclerView recyclerView, int i, int i2) {
        if (!this.c) {
            GridLayoutManager layoutManager = recyclerView.getLayoutManager();
            GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? layoutManager : null;
            if (gridLayoutManager != null) {
                int T0 = gridLayoutManager.T0();
                int X0 = gridLayoutManager.X0();
                mr5 mr5 = this.a;
                int j = mr5.j();
                if (T0 != -1) {
                    this.b.invoke(X0 == j + -1 ? mr5.J(X0) : mr5.J(T0));
                }
            }
        }
    }
}
