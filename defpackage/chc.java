package defpackage;

/* renamed from: chc  reason: default package */
public final /* synthetic */ class chc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dhc b;
    public final /* synthetic */ long c;

    public /* synthetic */ chc(dhc dhc, long j, int i) {
        this.a = i;
        this.b = dhc;
        this.c = j;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                dhc dhc = this.b;
                dhc.m.offer(Long.valueOf(this.c));
                dhc.b();
                return;
            default:
                dhc dhc2 = this.b;
                dhc2.getClass();
                dhc2.f.post(new chc(dhc2, this.c, 0));
                return;
        }
    }
}
