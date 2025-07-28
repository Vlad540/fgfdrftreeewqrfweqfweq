package defpackage;

import java.util.concurrent.Executor;

/* renamed from: qp6  reason: default package */
public final class qp6 extends lp6 {
    public final Executor C0;
    public final Object D0 = new Object();
    public lr6 E0;
    public pp6 F0;

    public qp6(Executor executor) {
        this.C0 = executor;
    }

    public final lr6 a(nr6 nr6) {
        return nr6.c();
    }

    public final void c() {
        synchronized (this.D0) {
            try {
                lr6 lr6 = this.E0;
                if (lr6 != null) {
                    lr6.close();
                    this.E0 = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0038, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(defpackage.lr6 r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.D0
            monitor-enter(r0)
            boolean r1 = r5.B0     // Catch:{ all -> 0x000c }
            if (r1 != 0) goto L_0x000e
            r6.close()     // Catch:{ all -> 0x000c }
            monitor-exit(r0)     // Catch:{ all -> 0x000c }
            return
        L_0x000c:
            r5 = move-exception
            goto L_0x0054
        L_0x000e:
            pp6 r1 = r5.F0     // Catch:{ all -> 0x000c }
            if (r1 == 0) goto L_0x0039
            pq6 r1 = r6.getImageInfo()     // Catch:{ all -> 0x000c }
            long r1 = r1.getTimestamp()     // Catch:{ all -> 0x000c }
            pp6 r3 = r5.F0     // Catch:{ all -> 0x000c }
            lr6 r3 = r3.b     // Catch:{ all -> 0x000c }
            pq6 r3 = r3.getImageInfo()     // Catch:{ all -> 0x000c }
            long r3 = r3.getTimestamp()     // Catch:{ all -> 0x000c }
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x002e
            r6.close()     // Catch:{ all -> 0x000c }
            goto L_0x0037
        L_0x002e:
            lr6 r1 = r5.E0     // Catch:{ all -> 0x000c }
            if (r1 == 0) goto L_0x0035
            r1.close()     // Catch:{ all -> 0x000c }
        L_0x0035:
            r5.E0 = r6     // Catch:{ all -> 0x000c }
        L_0x0037:
            monitor-exit(r0)     // Catch:{ all -> 0x000c }
            return
        L_0x0039:
            pp6 r1 = new pp6     // Catch:{ all -> 0x000c }
            r1.<init>(r6, r5)     // Catch:{ all -> 0x000c }
            r5.F0 = r1     // Catch:{ all -> 0x000c }
            ch7 r5 = r5.b(r1)     // Catch:{ all -> 0x000c }
            lhd r6 = new lhd     // Catch:{ all -> 0x000c }
            r2 = 17
            r6.<init>(r2, r1)     // Catch:{ all -> 0x000c }
            mh4 r1 = pa2.j()     // Catch:{ all -> 0x000c }
            ct0.a(r5, r6, r1)     // Catch:{ all -> 0x000c }
            monitor-exit(r0)     // Catch:{ all -> 0x000c }
            return
        L_0x0054:
            monitor-exit(r0)     // Catch:{ all -> 0x000c }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qp6.e(lr6):void");
    }
}
