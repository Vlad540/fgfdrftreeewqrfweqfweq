package defpackage;

/* renamed from: rw1  reason: default package */
public final /* synthetic */ class rw1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yic b;

    public /* synthetic */ rw1(yic yic, int i) {
        this.a = i;
        this.b = yic;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a();
                return;
            case 1:
                yic yic = this.b;
                if (yic != null) {
                    yic.a();
                    return;
                }
                return;
            default:
                this.b.a();
                return;
        }
    }
}
