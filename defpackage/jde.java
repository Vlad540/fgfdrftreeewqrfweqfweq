package defpackage;

import bolts.Task;
import java.util.concurrent.CancellationException;

/* renamed from: jde  reason: default package */
public final class jde implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wde b;
    public final /* synthetic */ dr3 c;
    public final /* synthetic */ Task o;

    public /* synthetic */ jde(wde wde, dr3 dr3, Task task, int i) {
        this.a = i;
        this.b = wde;
        this.c = dr3;
        this.o = task;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                wde wde = this.b;
                try {
                    wde.c(this.c.a(this.o));
                    return;
                } catch (CancellationException unused) {
                    wde.a();
                    return;
                } catch (Exception e) {
                    wde.b(e);
                    return;
                }
            default:
                wde wde2 = this.b;
                try {
                    Task task = (Task) this.c.a(this.o);
                    if (task == null) {
                        wde2.c((Object) null);
                        return;
                    } else {
                        task.continueWith(new kde(0, this));
                        return;
                    }
                } catch (CancellationException unused2) {
                    wde2.a();
                    return;
                } catch (Exception e2) {
                    wde2.b(e2);
                    return;
                }
        }
    }
}
