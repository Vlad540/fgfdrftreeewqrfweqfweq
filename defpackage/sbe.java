package defpackage;

/* renamed from: sbe  reason: default package */
public final /* synthetic */ class sbe implements Runnable {
    public final /* synthetic */ ybe a;
    public final /* synthetic */ ol b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int o;

    public /* synthetic */ sbe(ybe ybe, ol olVar, long j, int i) {
        this.a = ybe;
        this.b = olVar;
        this.c = j;
        this.o = i;
    }

    public final void run() {
        ybe ybe = this.a;
        ybe.getClass();
        udd.n(ybe.F0, "persistable task execution started, force connection");
        ((j2b) ((g2b) ybe.Y.getValue())).a.w(true);
        ((jee) ybe.X.getValue()).g((tna) this.b, this.c, this.o);
        o1d.y((luf) ybe.z0.getValue());
        ((gee) ybe.A0.getValue()).a();
    }
}
