package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: cld  reason: default package */
public final class cld extends r6c {
    public boolean a = false;
    public final /* synthetic */ e04 b;

    public cld(e04 e04) {
        this.b = e04;
    }

    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0 && this.a) {
            this.a = false;
            this.b.o();
        }
    }

    public final void b(RecyclerView recyclerView, int i, int i2) {
        if (i != 0 || i2 != 0) {
            this.a = true;
        }
    }
}
