package defpackage;

/* renamed from: dba  reason: default package */
public final /* synthetic */ class dba implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ eba b;

    public /* synthetic */ dba(eba eba, int i) {
        this.a = i;
        this.b = eba;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b();
                return;
            default:
                this.b.b();
                return;
        }
    }
}
