package defpackage;

/* renamed from: y9e  reason: default package */
public final /* synthetic */ class y9e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z9e b;

    public /* synthetic */ y9e(z9e z9e, int i) {
        this.a = i;
        this.b = z9e;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                z9e z9e = this.b;
                z9e.o = null;
                z9e.c();
                return;
            default:
                this.b.c();
                return;
        }
    }
}
