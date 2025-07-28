package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: to0  reason: default package */
public final class to0 {
    public static final to0 d = new to0();
    public final ExecutorService a;
    public final ScheduledExecutorService b;
    public final m30 c;

    /* JADX WARNING: type inference failed for: r0v8, types: [java.util.concurrent.ExecutorService] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public to0() {
        /*
            r8 = this;
            r8.<init>()
            java.lang.String r0 = "java.runtime.name"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            if (r0 != 0) goto L_0x000d
            r0 = 0
            goto L_0x0019
        L_0x000d:
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r0 = r0.toLowerCase(r1)
            java.lang.String r1 = "android"
            boolean r0 = r0.contains(r1)
        L_0x0019:
            if (r0 != 0) goto L_0x0020
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newCachedThreadPool()
            goto L_0x0039
        L_0x0020:
            md r0 = defpackage.md.b
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingQueue r7 = new java.util.concurrent.LinkedBlockingQueue
            r7.<init>()
            int r2 = defpackage.md.c
            int r3 = defpackage.md.d
            r4 = 1
            r1 = r0
            r1.<init>(r2, r3, r4, r6, r7)
            r1 = 1
            r0.allowCoreThreadTimeOut(r1)
        L_0x0039:
            r8.a = r0
            java.util.concurrent.ScheduledExecutorService r0 = java.util.concurrent.Executors.newSingleThreadScheduledExecutor()
            r8.b = r0
            m30 r0 = new m30
            r1 = 2
            r0.<init>((int) r1)
            java.lang.ThreadLocal r1 = new java.lang.ThreadLocal
            r1.<init>()
            r0.b = r1
            r8.c = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.to0.<init>():void");
    }
}
