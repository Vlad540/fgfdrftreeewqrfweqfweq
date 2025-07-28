package defpackage;

import bolts.Task;

/* renamed from: ide  reason: default package */
public final class ide implements dr3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dr3 b;

    public /* synthetic */ ide(dr3 dr3, int i) {
        this.a = i;
        this.b = dr3;
    }

    public final Object a(Task task) {
        switch (this.a) {
            case 0:
                return task.isFaulted() ? Task.forError(task.getError()) : task.isCancelled() ? Task.cancelled() : task.continueWith(this.b);
            default:
                return task.isFaulted() ? Task.forError(task.getError()) : task.isCancelled() ? Task.cancelled() : task.continueWithTask(this.b);
        }
    }
}
