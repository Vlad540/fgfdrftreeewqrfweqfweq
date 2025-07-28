package defpackage;

/* renamed from: tbe  reason: default package */
public final /* synthetic */ class tbe implements Runnable {
    public final /* synthetic */ ol X;
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ it4 b;
    public final /* synthetic */ qce c;
    public final /* synthetic */ lbe o;

    public /* synthetic */ tbe(it4 it4, ol olVar, qce qce, lbe lbe) {
        this.b = it4;
        this.X = olVar;
        this.c = qce;
        this.o = lbe;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                it4 it4 = this.b;
                it4.getClass();
                ol olVar = this.X;
                ibe s = olVar.s();
                if (s != null) {
                    ((ybe) it4.c).a.remove(s.getClass().getName());
                }
                qce qce = this.c;
                qce.b().a(new tbe(it4, qce, this.o, olVar));
                return;
            default:
                qce qce2 = this.c;
                lbe lbe = this.o;
                ol olVar2 = this.X;
                it4 it42 = this.b;
                it42.getClass();
                try {
                    qce2.c(lbe);
                    ybe.a((ybe) it42.c, olVar2);
                    return;
                } catch (Exception e) {
                    udd.u(ybe.F0, e, "failure to run task %s", new Object[]{olVar2});
                    qce2.d(new uae("app.exception", e.getMessage(), (String) null));
                    return;
                }
        }
    }

    public /* synthetic */ tbe(it4 it4, qce qce, lbe lbe, ol olVar) {
        this.b = it4;
        this.c = qce;
        this.o = lbe;
        this.X = olVar;
    }
}
