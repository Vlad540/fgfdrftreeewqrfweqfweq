package one.me.sdk.concurrent.watchdog;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lone/me/sdk/concurrent/watchdog/ThreadExecutorStuckException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "tamtam-concurrent"}, k = 1, mv = {2, 0, 0})
public final class ThreadExecutorStuckException extends Exception {
    public static final /* synthetic */ int a = 0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ThreadExecutorStuckException(java.lang.Iterable r12) {
        /*
            r11 = this;
            int r0 = zp4.o
            long r0 = java.lang.System.nanoTime()
            eq4 r2 = eq4.b
            long r0 = mt0.Q(r0, r2)
            yu7 r2 = new yu7
            r3 = 1
            r2.<init>(r0, r3)
            java.util.List r4 = o23.m0(r12, r2)
            boolean r2 = r12 instanceof java.util.Collection
            r10 = 0
            if (r2 == 0) goto L_0x0023
            r2 = r12
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
            goto L_0x003a
        L_0x0023:
            java.util.Iterator r2 = r12.iterator()
            r5 = 0
        L_0x0028:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x0039
            r2.next()
            int r5 = r5 + r3
            if (r5 < 0) goto L_0x0035
            goto L_0x0028
        L_0x0035:
            p23.F()
            throw r10
        L_0x0039:
            r2 = r5
        L_0x003a:
            java.lang.String r3 = "Tasks in queue: "
            java.lang.String r5 = "\n"
            java.lang.String r6 = defpackage.rf0.f(r2, r3, r5)
            je2 r8 = new je2
            r2 = 7
            r8.<init>(r0, r2)
            r5 = 0
            r7 = 0
            r9 = 29
            java.lang.String r0 = o23.c0(r4, r5, r6, r7, r8, r9)
            r11.<init>(r0)
            int r0 = zp4.o
            long r0 = java.lang.System.nanoTime()
            eq4 r2 = eq4.b
            long r0 = mt0.Q(r0, r2)
            java.util.Iterator r12 = r12.iterator()
            boolean r2 = r12.hasNext()
            if (r2 != 0) goto L_0x006a
            goto L_0x009f
        L_0x006a:
            java.lang.Object r10 = r12.next()
            boolean r2 = r12.hasNext()
            if (r2 != 0) goto L_0x0075
            goto L_0x009f
        L_0x0075:
            r2 = r10
            pef r2 = (defpackage.pef) r2
            long r2 = r2.b(r0)
            zp4 r4 = new zp4
            r4.<init>(r2)
        L_0x0081:
            java.lang.Object r2 = r12.next()
            r3 = r2
            pef r3 = (defpackage.pef) r3
            long r5 = r3.b(r0)
            zp4 r3 = new zp4
            r3.<init>(r5)
            int r5 = r4.compareTo(r3)
            if (r5 >= 0) goto L_0x0099
            r10 = r2
            r4 = r3
        L_0x0099:
            boolean r2 = r12.hasNext()
            if (r2 != 0) goto L_0x0081
        L_0x009f:
            pef r10 = (defpackage.pef) r10
            if (r10 == 0) goto L_0x00b0
            java.lang.Thread r12 = r10.d
            if (r12 == 0) goto L_0x00b0
            java.lang.StackTraceElement[] r12 = r12.getStackTrace()
            if (r12 == 0) goto L_0x00b0
            r11.setStackTrace(r12)
        L_0x00b0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.sdk.concurrent.watchdog.ThreadExecutorStuckException.<init>(java.lang.Iterable):void");
    }
}
