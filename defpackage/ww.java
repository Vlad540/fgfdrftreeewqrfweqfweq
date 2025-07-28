package defpackage;

import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ww  reason: default package */
public final class ww implements Runnable {
    public static final ThreadPoolExecutor w0;
    public static z59 x0;
    public final AtomicBoolean X = new AtomicBoolean();
    public final CountDownLatch Y;
    public final /* synthetic */ l2g Z;
    public final uh a;
    public final x59 b;
    public volatile int c = 1;
    public final AtomicBoolean o = new AtomicBoolean();

    static {
        l30 l30 = new l30(4);
        w0 = new ThreadPoolExecutor(5, 128, 1, TimeUnit.SECONDS, new LinkedBlockingQueue(10), l30);
    }

    public ww(l2g l2g) {
        this.Z = l2g;
        uh uhVar = new uh(this);
        this.a = uhVar;
        this.b = new x59(this, uhVar);
        this.Y = new CountDownLatch(1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r5 = this;
            l2g r0 = r5.Z     // Catch:{ OperationCanceledException -> 0x0030 }
            java.util.Set r1 = r0.k     // Catch:{ OperationCanceledException -> 0x0030 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ OperationCanceledException -> 0x0030 }
            boolean r2 = r1.hasNext()     // Catch:{ OperationCanceledException -> 0x0030 }
            if (r2 != 0) goto L_0x0021
            java.util.concurrent.Semaphore r0 = r0.j     // Catch:{ InterruptedException -> 0x0019 }
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x0019 }
            r2 = 0
            r3 = 5
            r0.tryAcquire(r2, r3, r1)     // Catch:{ InterruptedException -> 0x0019 }
            goto L_0x0039
        L_0x0019:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ OperationCanceledException -> 0x0030 }
            r0.interrupt()     // Catch:{ OperationCanceledException -> 0x0030 }
            goto L_0x0039
        L_0x0021:
            java.lang.Object r0 = r1.next()     // Catch:{ OperationCanceledException -> 0x0030 }
            fzf r0 = (defpackage.fzf) r0     // Catch:{ OperationCanceledException -> 0x0030 }
            r0.getClass()     // Catch:{ OperationCanceledException -> 0x0030 }
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException     // Catch:{ OperationCanceledException -> 0x0030 }
            r0.<init>()     // Catch:{ OperationCanceledException -> 0x0030 }
            throw r0     // Catch:{ OperationCanceledException -> 0x0030 }
        L_0x0030:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicBoolean r5 = r5.o
            boolean r5 = r5.get()
            if (r5 == 0) goto L_0x003a
        L_0x0039:
            return
        L_0x003a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ww.a():void");
    }

    public final void b(Object obj) {
        z59 z59;
        synchronized (ww.class) {
            try {
                if (x0 == null) {
                    x0 = new z59(Looper.getMainLooper(), 0, false);
                }
                z59 = x0;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        z59.obtainMessage(1, new y59(this, obj)).sendToTarget();
    }

    public final void run() {
        this.Z.b();
    }
}
