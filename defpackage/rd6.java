package defpackage;

/* renamed from: rd6  reason: default package */
public final /* synthetic */ class rd6 implements aj4 {
    public final /* synthetic */ sd6 a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ rd6(sd6 sd6, Runnable runnable) {
        this.a = sd6;
        this.b = runnable;
    }

    public final void dispose() {
        this.a.a.removeCallbacks(this.b);
    }
}
