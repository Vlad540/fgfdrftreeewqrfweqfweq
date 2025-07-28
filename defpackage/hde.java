package defpackage;

import bolts.Task;
import java.util.concurrent.Executor;

/* renamed from: hde  reason: default package */
public final class hde implements dr3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wde b;
    public final /* synthetic */ dr3 c;
    public final /* synthetic */ Executor d;

    public /* synthetic */ hde(wde wde, dr3 dr3, Executor executor, int i) {
        this.a = i;
        this.b = wde;
        this.c = dr3;
        this.d = executor;
    }

    public final Object a(Task task) {
        switch (this.a) {
            case 0:
                Task.completeImmediately(this.b, this.c, task, this.d, (gw1) null);
                return null;
            default:
                Task.completeAfterTask(this.b, this.c, task, this.d, (gw1) null);
                return null;
        }
    }
}
