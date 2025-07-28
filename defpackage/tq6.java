package defpackage;

/* renamed from: tq6  reason: default package */
public final /* synthetic */ class tq6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wq6 b;

    public /* synthetic */ tq6(wq6 wq6, int i) {
        this.a = i;
        this.b = wq6;
    }

    public final void run() {
        int i = this.a;
        wq6 wq6 = this.b;
        switch (i) {
            case 0:
                wq6.f();
                return;
            default:
                wq6.o();
                return;
        }
    }
}
