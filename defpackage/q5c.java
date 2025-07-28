package defpackage;

/* renamed from: q5c  reason: default package */
public final /* synthetic */ class q5c implements Runnable {
    public final /* synthetic */ Throwable X;
    public final /* synthetic */ y5c a;
    public final /* synthetic */ na0 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int o;

    public /* synthetic */ q5c(y5c y5c, na0 na0, long j, int i, RuntimeException runtimeException) {
        this.a = y5c;
        this.b = na0;
        this.c = j;
        this.o = i;
        this.X = runtimeException;
    }

    public final void run() {
        this.a.F(this.b, this.c, this.o, (Exception) this.X);
    }
}
