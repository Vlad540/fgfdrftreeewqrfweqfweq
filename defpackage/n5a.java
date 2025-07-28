package defpackage;

import android.os.Looper;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: n5a  reason: default package */
public final class n5a implements fn6 {
    public final ConcurrentLinkedQueue a = new ConcurrentLinkedQueue();

    public final boolean c() {
        return true;
    }

    public final void d(tn7 tn7, String str, String str2, Throwable th) {
        String valueOf;
        ConcurrentLinkedQueue concurrentLinkedQueue = this.a;
        Thread currentThread = Thread.currentThread();
        if (((Looper) aie.a.getValue()).isCurrentThread()) {
            valueOf = "ui";
        } else {
            String name = currentThread.getName();
            valueOf = (name == null || name.length() == 0) ? String.valueOf(currentThread.getId()) : currentThread.getName();
        }
        concurrentLinkedQueue.add(new nn7(tn7, str, str2, valueOf, th));
    }
}
