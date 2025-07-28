package defpackage;

/* renamed from: jj6  reason: default package */
public final /* synthetic */ class jj6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pj6 b;

    public /* synthetic */ jj6(pj6 pj6, int i) {
        this.a = i;
        this.b = pj6;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.z();
                return;
            default:
                pj6 pj6 = this.b;
                pj6.R0 = true;
                pj6.z();
                return;
        }
    }
}
