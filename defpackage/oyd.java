package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: oyd  reason: default package */
public final /* synthetic */ class oyd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ryd b;

    public /* synthetic */ oyd(ryd ryd, int i) {
        this.a = i;
        this.b = ryd;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                RecyclerView recyclerView = this.b.X;
                if (!recyclerView.Z()) {
                    recyclerView.Y();
                    return;
                }
                return;
            default:
                this.b.z0.set(true);
                return;
        }
    }
}
