package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: qic  reason: default package */
public final class qic extends AtomicLong implements ThreadFactory {
    public final String a;
    public final int b;
    public final boolean c;

    public qic(String str) {
        this(str, 5, false);
    }

    public final Thread newThread(Runnable runnable) {
        String str = this.a + '-' + incrementAndGet();
        Thread xwVar = this.c ? new xw(str, runnable) : new Thread(runnable, str);
        xwVar.setPriority(this.b);
        xwVar.setDaemon(true);
        return xwVar;
    }

    public final String toString() {
        return wn6.l(new StringBuilder("RxThreadFactory["), this.a, "]");
    }

    public qic(String str, int i, boolean z) {
        this.a = str;
        this.b = i;
        this.c = z;
    }
}
