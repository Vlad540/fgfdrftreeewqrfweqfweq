package defpackage;

/* renamed from: k4e  reason: default package */
public final /* synthetic */ class k4e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o4e b;

    public /* synthetic */ k4e(o4e o4e, int i) {
        this.a = i;
        this.b = o4e;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                o4e o4e = this.b;
                o4e.getClass();
                pa2.A().execute(new k4e(o4e, 1));
                return;
            default:
                o4e o4e2 = this.b;
                if (!o4e2.n) {
                    o4e2.e();
                    return;
                }
                return;
        }
    }
}
