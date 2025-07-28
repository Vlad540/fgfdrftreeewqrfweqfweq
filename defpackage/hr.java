package defpackage;

import android.os.Handler;
import android.os.Looper;

/* renamed from: hr  reason: default package */
public final class hr extends urd {
    public static volatile hr k;
    public static final gr l = new gr(0);
    public final cb4 j = new cb4();

    public static hr U() {
        if (k != null) {
            return k;
        }
        synchronized (hr.class) {
            try {
                if (k == null) {
                    k = new hr();
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return k;
    }

    public final boolean V() {
        this.j.getClass();
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public final void W(Runnable runnable) {
        cb4 cb4 = this.j;
        if (cb4.l == null) {
            synchronized (cb4.j) {
                try {
                    if (cb4.l == null) {
                        cb4.l = Handler.createAsync(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        cb4.l.post(runnable);
    }
}
