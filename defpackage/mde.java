package defpackage;

import bolts.Task;

/* renamed from: mde  reason: default package */
public final class mde implements dr3 {
    public final Object a(Task task) {
        return task.isCancelled() ? Task.cancelled() : task.isFaulted() ? Task.forError(task.getError()) : Task.forResult(null);
    }
}
