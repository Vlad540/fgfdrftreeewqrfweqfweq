package defpackage;

/* renamed from: xw  reason: default package */
public final class xw extends Thread {
    public final /* synthetic */ int a = 0;

    public /* synthetic */ xw(String str) {
        super(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x002c, code lost:
        if (r0 == null) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x002e, code lost:
        r0.l();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0015 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r2 = this;
            int r0 = r2.a
            switch(r0) {
                case 0: goto L_0x0019;
                case 1: goto L_0x0005;
                case 2: goto L_0x0009;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.run()
            return
        L_0x0009:
            r0 = 19
            android.os.Process.setThreadPriority(r0)
            monitor-enter(r2)
        L_0x000f:
            r2.wait()     // Catch:{ InterruptedException -> 0x0015 }
            goto L_0x000f
        L_0x0013:
            r0 = move-exception
            goto L_0x0017
        L_0x0015:
            monitor-exit(r2)     // Catch:{ all -> 0x0013 }
            return
        L_0x0017:
            monitor-exit(r2)     // Catch:{ all -> 0x0013 }
            throw r0
        L_0x0019:
            java.lang.Class<ax> r2 = defpackage.ax.class
            monitor-enter(r2)     // Catch:{ InterruptedException -> 0x0019 }
            ax r0 = defpackage.ax.j     // Catch:{ all -> 0x0032 }
            ax r0 = defpackage.udd.f()     // Catch:{ all -> 0x0032 }
            ax r1 = defpackage.ax.j     // Catch:{ all -> 0x0032 }
            if (r0 != r1) goto L_0x002b
            r0 = 0
            defpackage.ax.j = r0     // Catch:{ all -> 0x0032 }
            monitor-exit(r2)     // Catch:{ InterruptedException -> 0x0019 }
            return
        L_0x002b:
            monitor-exit(r2)     // Catch:{ InterruptedException -> 0x0019 }
            if (r0 == 0) goto L_0x0019
            r0.l()     // Catch:{ InterruptedException -> 0x0019 }
            goto L_0x0019
        L_0x0032:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ InterruptedException -> 0x0019 }
            throw r0     // Catch:{ InterruptedException -> 0x0019 }
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xw.run():void");
    }

    public /* synthetic */ xw(String str, Runnable runnable) {
        super(runnable, str);
    }

    public /* synthetic */ xw(ThreadGroup threadGroup, String str) {
        super(threadGroup, str);
    }
}
