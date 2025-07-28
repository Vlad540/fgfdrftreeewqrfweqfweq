package defpackage;

/* renamed from: ny3  reason: default package */
public final /* synthetic */ class ny3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ty3 b;

    public /* synthetic */ ny3(ty3 ty3, int i) {
        this.a = i;
        this.b = ty3;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.t();
                return;
            default:
                this.b.s(false);
                return;
        }
    }
}
