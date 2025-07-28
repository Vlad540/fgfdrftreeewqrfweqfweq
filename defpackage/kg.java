package defpackage;

/* renamed from: kg  reason: default package */
public final /* synthetic */ class kg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gt0 b;

    public /* synthetic */ kg(gt0 gt0, int i) {
        this.a = i;
        this.b = gt0;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.E();
                return;
            default:
                this.b.D();
                return;
        }
    }
}
