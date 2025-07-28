package defpackage;

import bolts.Task;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: nde  reason: default package */
public final class nde implements dr3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AtomicBoolean b;
    public final /* synthetic */ wde c;

    public /* synthetic */ nde(AtomicBoolean atomicBoolean, wde wde, int i) {
        this.a = i;
        this.b = atomicBoolean;
        this.c = wde;
    }

    public final Object a(Task task) {
        switch (this.a) {
            case 0:
                if (this.b.compareAndSet(false, true)) {
                    this.c.c(task);
                    return null;
                }
                task.getError();
                return null;
            default:
                if (this.b.compareAndSet(false, true)) {
                    this.c.c(task);
                    return null;
                }
                task.getError();
                return null;
        }
    }
}
