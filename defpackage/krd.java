package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: krd  reason: default package */
public final class krd implements Runnable {
    public static final Object w0 = new Object();
    public Object X = w0;
    public int Y = -1;
    public boolean Z = false;
    public final Executor a;
    public final ls9 b;
    public final AtomicBoolean c = new AtomicBoolean(true);
    public final AtomicReference o;

    public krd(AtomicReference atomicReference, Executor executor, ls9 ls9) {
        this.o = atomicReference;
        this.a = executor;
        this.b = ls9;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.c     // Catch:{ all -> 0x000b }
            boolean r0 = r0.get()     // Catch:{ all -> 0x000b }
            if (r0 != 0) goto L_0x000d
            monitor-exit(r1)     // Catch:{ all -> 0x000b }
            return
        L_0x000b:
            r2 = move-exception
            goto L_0x002e
        L_0x000d:
            int r0 = r1.Y     // Catch:{ all -> 0x000b }
            if (r2 > r0) goto L_0x0013
            monitor-exit(r1)     // Catch:{ all -> 0x000b }
            return
        L_0x0013:
            r1.Y = r2     // Catch:{ all -> 0x000b }
            boolean r2 = r1.Z     // Catch:{ all -> 0x000b }
            if (r2 == 0) goto L_0x001b
            monitor-exit(r1)     // Catch:{ all -> 0x000b }
            return
        L_0x001b:
            r2 = 1
            r1.Z = r2     // Catch:{ all -> 0x000b }
            monitor-exit(r1)     // Catch:{ all -> 0x000b }
            java.util.concurrent.Executor r2 = r1.a     // Catch:{ all -> 0x0025 }
            r2.execute(r1)     // Catch:{ all -> 0x0025 }
            goto L_0x002a
        L_0x0025:
            monitor-enter(r1)
            r2 = 0
            r1.Z = r2     // Catch:{ all -> 0x002b }
            monitor-exit(r1)     // Catch:{ all -> 0x002b }
        L_0x002a:
            return
        L_0x002b:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x002b }
            throw r2
        L_0x002e:
            monitor-exit(r1)     // Catch:{ all -> 0x000b }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.krd.a(int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        if (java.util.Objects.equals(r4.X, r0) != false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
        r4.X = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        if ((r0 instanceof defpackage.ta0) == false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
        r4.b.onError(((defpackage.ta0) r0).a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0031, code lost:
        r4.b.a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0036, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0039, code lost:
        if (r2 == r4.Y) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0041, code lost:
        if (r4.c.get() != false) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0044, code lost:
        r0 = r4.o.get();
        r2 = r4.Y;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004c, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0050, code lost:
        r4.Z = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0052, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0053, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0055, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.c     // Catch:{ all -> 0x000e }
            boolean r0 = r0.get()     // Catch:{ all -> 0x000e }
            r1 = 0
            if (r0 != 0) goto L_0x0010
            r4.Z = r1     // Catch:{ all -> 0x000e }
            monitor-exit(r4)     // Catch:{ all -> 0x000e }
            return
        L_0x000e:
            r0 = move-exception
            goto L_0x0056
        L_0x0010:
            java.util.concurrent.atomic.AtomicReference r0 = r4.o     // Catch:{ all -> 0x000e }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x000e }
            int r2 = r4.Y     // Catch:{ all -> 0x000e }
            monitor-exit(r4)     // Catch:{ all -> 0x000e }
        L_0x0019:
            java.lang.Object r3 = r4.X
            boolean r3 = java.util.Objects.equals(r3, r0)
            if (r3 != 0) goto L_0x0036
            r4.X = r0
            boolean r3 = r0 instanceof defpackage.ta0
            if (r3 == 0) goto L_0x0031
            ls9 r3 = r4.b
            ta0 r0 = (defpackage.ta0) r0
            java.lang.Throwable r0 = r0.a
            r3.onError(r0)
            goto L_0x0036
        L_0x0031:
            ls9 r3 = r4.b
            r3.a(r0)
        L_0x0036:
            monitor-enter(r4)
            int r0 = r4.Y     // Catch:{ all -> 0x004e }
            if (r2 == r0) goto L_0x0050
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.c     // Catch:{ all -> 0x004e }
            boolean r0 = r0.get()     // Catch:{ all -> 0x004e }
            if (r0 != 0) goto L_0x0044
            goto L_0x0050
        L_0x0044:
            java.util.concurrent.atomic.AtomicReference r0 = r4.o     // Catch:{ all -> 0x004e }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x004e }
            int r2 = r4.Y     // Catch:{ all -> 0x004e }
            monitor-exit(r4)     // Catch:{ all -> 0x004e }
            goto L_0x0019
        L_0x004e:
            r0 = move-exception
            goto L_0x0054
        L_0x0050:
            r4.Z = r1     // Catch:{ all -> 0x004e }
            monitor-exit(r4)     // Catch:{ all -> 0x004e }
            return
        L_0x0054:
            monitor-exit(r4)     // Catch:{ all -> 0x004e }
            throw r0
        L_0x0056:
            monitor-exit(r4)     // Catch:{ all -> 0x000e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.krd.run():void");
    }
}
