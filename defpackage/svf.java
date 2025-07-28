package defpackage;

/* renamed from: svf  reason: default package */
public final /* synthetic */ class svf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pd b;
    public final /* synthetic */ sn1 c;
    public final /* synthetic */ yvf o;

    public /* synthetic */ svf(pd pdVar, sn1 sn1, yvf yvf, int i) {
        this.a = i;
        this.b = pdVar;
        this.c = sn1;
        this.o = yvf;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.f(this.c, this.o);
                return;
            default:
                this.b.f(this.c, this.o);
                return;
        }
    }
}
