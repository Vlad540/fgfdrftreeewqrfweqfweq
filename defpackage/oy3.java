package defpackage;

/* renamed from: oy3  reason: default package */
public final /* synthetic */ class oy3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ uy3 b;

    public /* synthetic */ oy3(uy3 uy3, int i) {
        this.a = i;
        this.b = uy3;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.z();
                return;
            default:
                this.b.y(false);
                return;
        }
    }
}
