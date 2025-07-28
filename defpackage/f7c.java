package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: f7c  reason: default package */
public final /* synthetic */ class f7c implements Runnable {
    public final /* synthetic */ Runnable X;
    public final /* synthetic */ RecyclerView a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Runnable o;

    public /* synthetic */ f7c(RecyclerView recyclerView, int i, int i2, Runnable runnable, Runnable runnable2) {
        this.a = recyclerView;
        this.b = i;
        this.c = i2;
        this.o = runnable;
        this.X = runnable2;
    }

    public final void run() {
        z3d.g(this.a, this.b + 1, this.c, this.o, this.X);
    }
}
