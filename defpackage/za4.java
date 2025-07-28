package defpackage;

/* renamed from: za4  reason: default package */
public final /* synthetic */ class za4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y4e b;

    public /* synthetic */ za4(y4e y4e, int i) {
        this.a = i;
        this.b = y4e;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.d();
                return;
            default:
                this.b.g.cancel(true);
                return;
        }
    }
}
