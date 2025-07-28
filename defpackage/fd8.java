package defpackage;

/* renamed from: fd8  reason: default package */
public final /* synthetic */ class fd8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ md8 b;
    public final /* synthetic */ qza c;

    public /* synthetic */ fd8(md8 md8, qza qza, int i) {
        this.a = i;
        this.b = md8;
        this.c = qza;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                md8 md8 = this.b;
                md8.getClass();
                qza qza = this.c;
                md8.j.c(qza.j());
                md8.h.F(qza.s().a(17) ? qza.x0() : vje.a);
                return;
            default:
                md8 md82 = this.b;
                md82.getClass();
                md82.j.c(this.c.j());
                return;
        }
    }
}
