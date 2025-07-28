package defpackage;

/* renamed from: hg8  reason: default package */
public final /* synthetic */ class hg8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jg8 b;
    public final /* synthetic */ kqe c;

    public /* synthetic */ hg8(jg8 jg8, kqe kqe, int i) {
        this.a = i;
        this.b = jg8;
        this.c = kqe;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.j(this.c);
                return;
            case 1:
                this.b.j(this.c);
                return;
            default:
                this.b.e(this.c);
                return;
        }
    }
}
