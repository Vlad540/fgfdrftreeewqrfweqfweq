package defpackage;

import java.util.concurrent.ScheduledFuture;

/* renamed from: yo5  reason: default package */
public final /* synthetic */ class yo5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bp5 b;
    public final /* synthetic */ long c;

    public /* synthetic */ yo5(int i, long j, bp5 bp5) {
        this.a = i;
        this.b = bp5;
        this.c = j;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                bp5 bp5 = this.b;
                bp5.getClass();
                bp5.b.execute(new yo5(3, this.c, bp5));
                return;
            case 1:
                bp5 bp52 = this.b;
                bp52.getClass();
                bp52.b.execute(new yo5(2, this.c, bp52));
                return;
            case 2:
                bp5 bp53 = this.b;
                if (this.c == bp53.k) {
                    bp53.b();
                    return;
                }
                return;
            default:
                bp5 bp54 = this.b;
                if (this.c == bp54.k) {
                    bp54.m = false;
                    ScheduledFuture scheduledFuture = bp54.j;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(true);
                        bp54.j = null;
                    }
                    sn1 sn1 = bp54.t;
                    if (sn1 != null) {
                        sn1.b(new cp5(false));
                        bp54.t = null;
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
