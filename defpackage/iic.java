package defpackage;

import android.os.SystemClock;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: iic  reason: default package */
public abstract class iic implements RunnableFuture {
    public Object X;
    public Thread Y;
    public boolean Z;
    public final ga3 a = new ga3(1, false);
    public final ga3 b = new ga3(1, false);
    public final Object c = new Object();
    public Exception o;

    public final void a() {
        this.b.b();
    }

    public void b() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002d, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002f, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean cancel(boolean r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.c
            monitor-enter(r0)
            boolean r1 = r3.Z     // Catch:{ all -> 0x0020 }
            if (r1 != 0) goto L_0x002e
            ga3 r1 = r3.b     // Catch:{ all -> 0x0020 }
            boolean r1 = r1.e()     // Catch:{ all -> 0x0020 }
            if (r1 == 0) goto L_0x0010
            goto L_0x002e
        L_0x0010:
            r1 = 1
            r3.Z = r1     // Catch:{ all -> 0x0020 }
            r3.b()     // Catch:{ all -> 0x0020 }
            java.lang.Thread r2 = r3.Y     // Catch:{ all -> 0x0020 }
            if (r2 == 0) goto L_0x0022
            if (r4 == 0) goto L_0x002c
            r2.interrupt()     // Catch:{ all -> 0x0020 }
            goto L_0x002c
        L_0x0020:
            r3 = move-exception
            goto L_0x0031
        L_0x0022:
            ga3 r4 = r3.a     // Catch:{ all -> 0x0020 }
            r4.g()     // Catch:{ all -> 0x0020 }
            ga3 r3 = r3.b     // Catch:{ all -> 0x0020 }
            r3.g()     // Catch:{ all -> 0x0020 }
        L_0x002c:
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            return r1
        L_0x002e:
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            r3 = 0
            return r3
        L_0x0031:
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iic.cancel(boolean):boolean");
    }

    public abstract Object d();

    public final Object get() {
        this.b.a();
        if (this.Z) {
            throw new CancellationException();
        } else if (this.o == null) {
            return this.X;
        } else {
            throw new ExecutionException(this.o);
        }
    }

    public final boolean isCancelled() {
        return this.Z;
    }

    public final boolean isDone() {
        return this.b.e();
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.c
            monitor-enter(r0)
            boolean r1 = r4.Z     // Catch:{ all -> 0x0009 }
            if (r1 == 0) goto L_0x000b
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            return
        L_0x0009:
            r4 = move-exception
            goto L_0x0059
        L_0x000b:
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0009 }
            r4.Y = r1     // Catch:{ all -> 0x0009 }
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            ga3 r0 = r4.a
            r0.g()
            r0 = 0
            java.lang.Object r1 = r4.d()     // Catch:{ Exception -> 0x0032 }
            r4.X = r1     // Catch:{ Exception -> 0x0032 }
            java.lang.Object r1 = r4.c
            monitor-enter(r1)
            ga3 r2 = r4.b     // Catch:{ all -> 0x002d }
            r2.g()     // Catch:{ all -> 0x002d }
            r4.Y = r0     // Catch:{ all -> 0x002d }
            java.lang.Thread.interrupted()     // Catch:{ all -> 0x002d }
            monitor-exit(r1)     // Catch:{ all -> 0x002d }
            goto L_0x0043
        L_0x002d:
            r4 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x002d }
            throw r4
        L_0x0030:
            r1 = move-exception
            goto L_0x0047
        L_0x0032:
            r1 = move-exception
            r4.o = r1     // Catch:{ all -> 0x0030 }
            java.lang.Object r1 = r4.c
            monitor-enter(r1)
            ga3 r2 = r4.b     // Catch:{ all -> 0x0044 }
            r2.g()     // Catch:{ all -> 0x0044 }
            r4.Y = r0     // Catch:{ all -> 0x0044 }
            java.lang.Thread.interrupted()     // Catch:{ all -> 0x0044 }
            monitor-exit(r1)     // Catch:{ all -> 0x0044 }
        L_0x0043:
            return
        L_0x0044:
            r4 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0044 }
            throw r4
        L_0x0047:
            java.lang.Object r2 = r4.c
            monitor-enter(r2)
            ga3 r3 = r4.b     // Catch:{ all -> 0x0056 }
            r3.g()     // Catch:{ all -> 0x0056 }
            r4.Y = r0     // Catch:{ all -> 0x0056 }
            java.lang.Thread.interrupted()     // Catch:{ all -> 0x0056 }
            monitor-exit(r2)     // Catch:{ all -> 0x0056 }
            throw r1
        L_0x0056:
            r4 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0056 }
            throw r4
        L_0x0059:
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iic.run():void");
    }

    public final Object get(long j, TimeUnit timeUnit) {
        boolean z;
        long convert = TimeUnit.MILLISECONDS.convert(j, timeUnit);
        ga3 ga3 = this.b;
        synchronized (ga3) {
            if (convert <= 0) {
                z = ga3.b;
            } else {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j2 = convert + elapsedRealtime;
                if (j2 < elapsedRealtime) {
                    ga3.a();
                } else {
                    while (!ga3.b && elapsedRealtime < j2) {
                        ga3.wait(j2 - elapsedRealtime);
                        elapsedRealtime = SystemClock.elapsedRealtime();
                    }
                }
                z = ga3.b;
            }
        }
        if (!z) {
            throw new TimeoutException();
        } else if (this.Z) {
            throw new CancellationException();
        } else if (this.o == null) {
            return this.X;
        } else {
            throw new ExecutionException(this.o);
        }
    }
}
