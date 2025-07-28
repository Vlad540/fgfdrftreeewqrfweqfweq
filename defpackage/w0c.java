package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: w0c  reason: default package */
public final class w0c implements Runnable {
    public volatile AtomicInteger a = new AtomicInteger(0);
    public final nn1 b;
    public final /* synthetic */ y0c c;

    public w0c(y0c y0c, nn1 nn1) {
        this.c = y0c;
        this.b = nn1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x005b A[Catch:{ all -> 0x0077, all -> 0x0047 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007c A[Catch:{ all -> 0x0077, all -> 0x0047 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009a A[Catch:{ all -> 0x0077, all -> 0x0047 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            java.lang.String r0 = "Callback failure for "
            java.lang.String r1 = "canceled due to "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "OkHttp "
            r2.<init>(r3)
            y0c r3 = r8.c
            lac r3 = r3.F0
            sm6 r3 = r3.b
            java.lang.String r3 = r3.g()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.String r4 = r3.getName()
            r3.setName(r2)
            y0c r2 = r8.c     // Catch:{ all -> 0x0047 }
            ml6 r2 = r2.c     // Catch:{ all -> 0x0047 }
            r2.i()     // Catch:{ all -> 0x0047 }
            r2 = 0
            y0c r5 = r8.c     // Catch:{ IOException -> 0x0052, all -> 0x0050 }
            xbc r2 = r5.h()     // Catch:{ IOException -> 0x0052, all -> 0x0050 }
            r5 = 1
            nn1 r6 = r8.b     // Catch:{ IOException -> 0x004d, all -> 0x004a }
            y0c r7 = r8.c     // Catch:{ IOException -> 0x004d, all -> 0x004a }
            r6.j(r7, r2)     // Catch:{ IOException -> 0x004d, all -> 0x004a }
            y0c r0 = r8.c     // Catch:{ all -> 0x0047 }
            qw9 r0 = r0.E0     // Catch:{ all -> 0x0047 }
            stf r0 = r0.a     // Catch:{ all -> 0x0047 }
        L_0x0043:
            r0.p(r8)     // Catch:{ all -> 0x0047 }
            goto L_0x00a8
        L_0x0047:
            r8 = move-exception
            goto L_0x00b6
        L_0x004a:
            r0 = move-exception
            r2 = r5
            goto L_0x0054
        L_0x004d:
            r1 = move-exception
            r2 = r5
            goto L_0x007a
        L_0x0050:
            r0 = move-exception
            goto L_0x0054
        L_0x0052:
            r1 = move-exception
            goto L_0x007a
        L_0x0054:
            y0c r5 = r8.c     // Catch:{ all -> 0x0077 }
            r5.d()     // Catch:{ all -> 0x0077 }
            if (r2 != 0) goto L_0x0079
            java.io.IOException r2 = new java.io.IOException     // Catch:{ all -> 0x0077 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0077 }
            r5.<init>(r1)     // Catch:{ all -> 0x0077 }
            r5.append(r0)     // Catch:{ all -> 0x0077 }
            java.lang.String r1 = r5.toString()     // Catch:{ all -> 0x0077 }
            r2.<init>(r1)     // Catch:{ all -> 0x0077 }
            defpackage.jjd.d(r2, r0)     // Catch:{ all -> 0x0077 }
            nn1 r1 = r8.b     // Catch:{ all -> 0x0077 }
            y0c r5 = r8.c     // Catch:{ all -> 0x0077 }
            r1.r(r5, r2)     // Catch:{ all -> 0x0077 }
            goto L_0x0079
        L_0x0077:
            r0 = move-exception
            goto L_0x00ac
        L_0x0079:
            throw r0     // Catch:{ all -> 0x0077 }
        L_0x007a:
            if (r2 == 0) goto L_0x009a
            kxa r2 = defpackage.kxa.a     // Catch:{ all -> 0x0077 }
            kxa r2 = defpackage.kxa.a     // Catch:{ all -> 0x0077 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0077 }
            r5.<init>(r0)     // Catch:{ all -> 0x0077 }
            y0c r0 = r8.c     // Catch:{ all -> 0x0077 }
            java.lang.String r0 = defpackage.y0c.a(r0)     // Catch:{ all -> 0x0077 }
            r5.append(r0)     // Catch:{ all -> 0x0077 }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x0077 }
            r2.getClass()     // Catch:{ all -> 0x0077 }
            r2 = 4
            defpackage.kxa.i(r2, r0, r1)     // Catch:{ all -> 0x0077 }
            goto L_0x00a1
        L_0x009a:
            nn1 r0 = r8.b     // Catch:{ all -> 0x0077 }
            y0c r2 = r8.c     // Catch:{ all -> 0x0077 }
            r0.r(r2, r1)     // Catch:{ all -> 0x0077 }
        L_0x00a1:
            y0c r0 = r8.c     // Catch:{ all -> 0x0047 }
            qw9 r0 = r0.E0     // Catch:{ all -> 0x0047 }
            stf r0 = r0.a     // Catch:{ all -> 0x0047 }
            goto L_0x0043
        L_0x00a8:
            r3.setName(r4)
            return
        L_0x00ac:
            y0c r1 = r8.c     // Catch:{ all -> 0x0047 }
            qw9 r1 = r1.E0     // Catch:{ all -> 0x0047 }
            stf r1 = r1.a     // Catch:{ all -> 0x0047 }
            r1.p(r8)     // Catch:{ all -> 0x0047 }
            throw r0     // Catch:{ all -> 0x0047 }
        L_0x00b6:
            r3.setName(r4)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w0c.run():void");
    }
}
