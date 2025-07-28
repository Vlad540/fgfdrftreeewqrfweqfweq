package defpackage;

/* renamed from: ffd  reason: default package */
public final class ffd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jfd b;

    public /* synthetic */ ffd(jfd jfd, int i) {
        this.a = i;
        this.b = jfd;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.requestLayout();
                return;
            default:
                jfd jfd = this.b;
                jfd.t1 = false;
                jfd.b();
                return;
        }
    }
}
