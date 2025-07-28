package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* renamed from: sx4  reason: default package */
public final /* synthetic */ class sx4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tx4 b;
    public final /* synthetic */ ch7 c;

    public /* synthetic */ sx4(tx4 tx4, ch7 ch7, int i) {
        this.a = i;
        this.b = tx4;
        this.c = ch7;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                tx4 tx4 = this.b;
                tx4.getClass();
                ch7 ch7 = this.c;
                if (!ch7.cancel(true)) {
                    e07.p((String) null, ch7.isDone());
                    try {
                        ((bx6) ch7.get()).a();
                        return;
                    } catch (InterruptedException | CancellationException | ExecutionException e) {
                        String str = tx4.o.a;
                        e.toString();
                        return;
                    }
                } else {
                    return;
                }
            default:
                this.b.c.remove(this.c);
                return;
        }
    }
}
