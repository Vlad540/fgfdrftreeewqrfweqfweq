package defpackage;

/* renamed from: qc1  reason: default package */
public final /* synthetic */ class qc1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u16 b;
    public final /* synthetic */ rc1 c;

    public /* synthetic */ qc1(u16 u16, rc1 rc1, int i) {
        this.a = i;
        this.b = u16;
        this.c = rc1;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.invoke(this.c);
                return;
            default:
                this.b.invoke(this.c);
                return;
        }
    }
}
