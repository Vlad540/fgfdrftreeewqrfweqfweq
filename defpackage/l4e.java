package defpackage;

/* renamed from: l4e  reason: default package */
public final /* synthetic */ class l4e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n4e b;

    public /* synthetic */ l4e(n4e n4e, int i) {
        this.a = i;
        this.b = n4e;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a();
                return;
            case 1:
                this.b.b();
                return;
            default:
                n4e n4e = this.b;
                q4e q4e = n4e.q;
                if (q4e != null) {
                    q4e.m();
                }
                if (n4e.p == null) {
                    n4e.o.c();
                    return;
                }
                return;
        }
    }
}
