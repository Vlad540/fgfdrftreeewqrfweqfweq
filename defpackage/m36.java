package defpackage;

import java.util.concurrent.ScheduledFuture;

/* renamed from: m36  reason: default package */
public final /* synthetic */ class m36 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ScheduledFuture b;

    public /* synthetic */ m36(ScheduledFuture scheduledFuture, int i) {
        this.a = i;
        this.b = scheduledFuture;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.cancel(true);
                return;
            default:
                this.b.cancel(true);
                return;
        }
    }
}
