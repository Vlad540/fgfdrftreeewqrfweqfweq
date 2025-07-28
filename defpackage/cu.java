package defpackage;

/* renamed from: cu  reason: default package */
public final /* synthetic */ class cu implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vc2 b;

    public /* synthetic */ cu(vc2 vc2, int i) {
        this.a = i;
        this.b = vc2;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                hu huVar = this.b.Z;
                return;
            default:
                hu huVar2 = this.b.Z;
                if (huVar2 != null) {
                    ((gf2) huVar2).k();
                    return;
                }
                return;
        }
    }
}
