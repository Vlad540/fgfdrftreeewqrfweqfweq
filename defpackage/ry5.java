package defpackage;

/* renamed from: ry5  reason: default package */
public final /* synthetic */ class ry5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ty5 b;
    public final /* synthetic */ hz5 c;

    public /* synthetic */ ry5(ty5 ty5, hz5 hz5, int i) {
        this.a = i;
        this.b = ty5;
        this.c = hz5;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.Z = this.c;
                return;
            default:
                this.b.w0 = this.c;
                return;
        }
    }
}
