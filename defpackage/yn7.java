package defpackage;

import android.content.Context;
import java.io.File;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: yn7  reason: default package */
public final class yn7 {
    public final Context a;
    public final Object b;
    public volatile int c;
    public lr d;
    public int e;
    public File f;
    public int g;
    public final ConcurrentLinkedQueue h;
    public final long i;

    public yn7(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            this.a = applicationContext;
            this.b = new Object();
            this.c = 1;
            this.e = 1;
            this.h = new ConcurrentLinkedQueue();
            this.i = System.currentTimeMillis();
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:47|48|49|50|58) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x0124 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r10) {
        /*
            r9 = this;
            int r0 = r9.c
            int r0 = hr1.b(r0, r10)
            if (r0 < 0) goto L_0x0009
            return
        L_0x0009:
            java.lang.Object r0 = r9.b
            monitor-enter(r0)
            int r1 = r9.c     // Catch:{ all -> 0x008e }
            int r2 = hr1.b(r1, r10)     // Catch:{ all -> 0x008e }
            if (r2 < 0) goto L_0x0016
            monitor-exit(r0)
            return
        L_0x0016:
            android.content.Context r2 = r9.a     // Catch:{ all -> 0x008e }
            java.lang.String r3 = xs7.B()     // Catch:{ all -> 0x008e }
            java.lang.String r4 = r2.getPackageName()     // Catch:{ all -> 0x008e }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x008e }
            if (r4 == 0) goto L_0x0029
            java.lang.String r3 = "tracer"
            goto L_0x0043
        L_0x0029:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x008e }
            java.lang.String r5 = "tracer-"
            r4.<init>(r5)     // Catch:{ all -> 0x008e }
            r5 = 45
            r6 = 58
            java.lang.String r3 = r3.replace(r6, r5)     // Catch:{ all -> 0x008e }
            java.lang.String r3 = android.net.Uri.encode(r3)     // Catch:{ all -> 0x008e }
            r4.append(r3)     // Catch:{ all -> 0x008e }
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x008e }
        L_0x0043:
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x008e }
            java.io.File r2 = r2.getCacheDir()     // Catch:{ all -> 0x008e }
            r4.<init>(r2, r3)     // Catch:{ all -> 0x008e }
            java.lang.String r2 = "logs"
            java.io.File r2 = ng5.N(r4, r2)     // Catch:{ all -> 0x008e }
            java.lang.String r3 = "a.log"
            java.io.File r3 = ng5.N(r2, r3)     // Catch:{ all -> 0x008e }
            java.lang.String r4 = "b.log"
            java.io.File r4 = ng5.N(r2, r4)     // Catch:{ all -> 0x008e }
            java.lang.String r5 = "stash-a.log"
            java.io.File r5 = ng5.N(r2, r5)     // Catch:{ all -> 0x008e }
            java.lang.String r6 = "stash-b.log"
            java.io.File r2 = ng5.N(r2, r6)     // Catch:{ all -> 0x008e }
            int r1 = hr1.t(r1)     // Catch:{ all -> 0x008e }
            r6 = 1
            r7 = 3
            r8 = 2
            if (r1 == 0) goto L_0x00c4
            if (r1 == r6) goto L_0x0099
            if (r1 != r8) goto L_0x0091
            int[] r1 = defpackage.xn7.$EnumSwitchMapping$1     // Catch:{ all -> 0x008e }
            int r2 = hr1.t(r10)     // Catch:{ all -> 0x008e }
            r1 = r1[r2]     // Catch:{ all -> 0x008e }
            if (r1 != r7) goto L_0x0086
            r1 = 0
            r9.d = r1     // Catch:{ all -> 0x008e }
            goto L_0x012d
        L_0x0086:
            java.lang.AssertionError r9 = new java.lang.AssertionError     // Catch:{ all -> 0x008e }
            java.lang.String r10 = "Unreachable code"
            r9.<init>(r10)     // Catch:{ all -> 0x008e }
            throw r9     // Catch:{ all -> 0x008e }
        L_0x008e:
            r9 = move-exception
            goto L_0x0131
        L_0x0091:
            java.lang.AssertionError r9 = new java.lang.AssertionError     // Catch:{ all -> 0x008e }
            java.lang.String r10 = "Unreachable code"
            r9.<init>(r10)     // Catch:{ all -> 0x008e }
            throw r9     // Catch:{ all -> 0x008e }
        L_0x0099:
            int r1 = hr1.t(r10)     // Catch:{ all -> 0x008e }
            if (r1 == r8) goto L_0x00b2
            if (r1 != r7) goto L_0x00aa
            java.io.File[] r1 = new java.io.File[]{r5, r2}     // Catch:{ all -> 0x008e }
            defpackage.dr9.a(r1)     // Catch:{ all -> 0x008e }
            goto L_0x012d
        L_0x00aa:
            java.lang.AssertionError r9 = new java.lang.AssertionError     // Catch:{ all -> 0x008e }
            java.lang.String r10 = "Unreachable code"
            r9.<init>(r10)     // Catch:{ all -> 0x008e }
            throw r9     // Catch:{ all -> 0x008e }
        L_0x00b2:
            java.io.File[] r1 = new java.io.File[]{r5, r2}     // Catch:{ all -> 0x008e }
            lr r1 = defpackage.dr9.c(r1)     // Catch:{ all -> 0x008e }
            r9.d = r1     // Catch:{ all -> 0x008e }
            java.io.File[] r1 = new java.io.File[]{r5, r2}     // Catch:{ all -> 0x008e }
            defpackage.dr9.a(r1)     // Catch:{ all -> 0x008e }
            goto L_0x012d
        L_0x00c4:
            int r1 = hr1.t(r10)     // Catch:{ all -> 0x008e }
            if (r1 == r6) goto L_0x00f7
            if (r1 == r8) goto L_0x00e5
            if (r1 != r7) goto L_0x00dd
            java.io.File[] r1 = new java.io.File[]{r5, r2}     // Catch:{ all -> 0x008e }
            defpackage.dr9.a(r1)     // Catch:{ all -> 0x008e }
            java.io.File[] r1 = new java.io.File[]{r3, r4}     // Catch:{ all -> 0x008e }
            defpackage.dr9.a(r1)     // Catch:{ all -> 0x008e }
            goto L_0x012d
        L_0x00dd:
            java.lang.AssertionError r9 = new java.lang.AssertionError     // Catch:{ all -> 0x008e }
            java.lang.String r10 = "Unreachable code"
            r9.<init>(r10)     // Catch:{ all -> 0x008e }
            throw r9     // Catch:{ all -> 0x008e }
        L_0x00e5:
            java.io.File[] r1 = new java.io.File[]{r3, r4}     // Catch:{ all -> 0x008e }
            lr r1 = defpackage.dr9.c(r1)     // Catch:{ all -> 0x008e }
            r9.d = r1     // Catch:{ all -> 0x008e }
            java.io.File[] r1 = new java.io.File[]{r3, r4}     // Catch:{ all -> 0x008e }
            defpackage.dr9.a(r1)     // Catch:{ all -> 0x008e }
            goto L_0x012d
        L_0x00f7:
            java.io.File[] r1 = new java.io.File[]{r5, r2}     // Catch:{ all -> 0x008e }
            defpackage.dr9.a(r1)     // Catch:{ all -> 0x008e }
            wia r1 = new wia     // Catch:{ all -> 0x008e }
            r1.<init>(r3, r5)     // Catch:{ all -> 0x008e }
            wia r3 = new wia     // Catch:{ all -> 0x008e }
            r3.<init>(r4, r2)     // Catch:{ all -> 0x008e }
            wia[] r1 = new wia[]{r1, r3}     // Catch:{ all -> 0x008e }
            r2 = 0
        L_0x010d:
            if (r2 >= r8) goto L_0x012d
            r3 = r1[r2]     // Catch:{ all -> 0x008e }
            java.lang.Object r4 = r3.a     // Catch:{ all -> 0x008e }
            java.io.File r4 = (java.io.File) r4     // Catch:{ all -> 0x008e }
            java.lang.Object r3 = r3.b     // Catch:{ all -> 0x008e }
            java.io.File r3 = (java.io.File) r3     // Catch:{ all -> 0x008e }
            boolean r5 = r4.exists()     // Catch:{ all -> 0x008e }
            if (r5 != 0) goto L_0x0120
            goto L_0x012a
        L_0x0120:
            r4.renameTo(r3)     // Catch:{ IOException -> 0x0124 }
            goto L_0x012a
        L_0x0124:
            r4.toString()     // Catch:{ all -> 0x008e }
            java.util.Objects.toString(r3)     // Catch:{ all -> 0x008e }
        L_0x012a:
            int r2 = r2 + 1
            goto L_0x010d
        L_0x012d:
            r9.c = r10     // Catch:{ all -> 0x008e }
            monitor-exit(r0)
            return
        L_0x0131:
            monitor-exit(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yn7.a(int):void");
    }
}
