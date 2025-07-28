package defpackage;

/* renamed from: ij6  reason: default package */
public final /* synthetic */ class ij6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ oj6 b;

    public /* synthetic */ ij6(oj6 oj6, int i) {
        this.a = i;
        this.b = oj6;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.t();
                return;
            default:
                oj6 oj6 = this.b;
                oj6.R0 = true;
                oj6.t();
                return;
        }
    }
}
