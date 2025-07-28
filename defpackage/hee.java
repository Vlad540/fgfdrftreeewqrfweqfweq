package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;

/* renamed from: hee  reason: default package */
public final class hee {
    public boolean a;
    public rde b;
    public final ArrayList c = new ArrayList();
    public boolean d;
    public final kee e;
    public final String f;

    public hee(kee kee, String str) {
        this.e = kee;
        this.f = str;
    }

    public final void a() {
        byte[] bArr = nze.a;
        synchronized (this.e) {
            if (b()) {
                this.e.e(this);
            }
        }
    }

    public final boolean b() {
        rde rde = this.b;
        if (rde != null && rde.d) {
            this.d = true;
        }
        ArrayList arrayList = this.c;
        boolean z = false;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((rde) arrayList.get(size)).d) {
                rde rde2 = (rde) arrayList.get(size);
                if (kee.i.isLoggable(Level.FINE)) {
                    xie.d(rde2, this, "canceled");
                }
                arrayList.remove(size);
                z = true;
            }
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0045, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(defpackage.rde r3, long r4) {
        /*
            r2 = this;
            kee r0 = r2.e
            monitor-enter(r0)
            boolean r1 = r2.a     // Catch:{ all -> 0x001d }
            if (r1 == 0) goto L_0x0038
            boolean r4 = r3.d     // Catch:{ all -> 0x001d }
            if (r4 == 0) goto L_0x0021
            kee r4 = defpackage.kee.h     // Catch:{ all -> 0x001d }
            java.util.logging.Logger r4 = defpackage.kee.i     // Catch:{ all -> 0x001d }
            java.util.logging.Level r5 = java.util.logging.Level.FINE     // Catch:{ all -> 0x001d }
            boolean r4 = r4.isLoggable(r5)     // Catch:{ all -> 0x001d }
            if (r4 == 0) goto L_0x001f
            java.lang.String r4 = "schedule canceled (queue is shutdown)"
            defpackage.xie.d(r3, r2, r4)     // Catch:{ all -> 0x001d }
            goto L_0x001f
        L_0x001d:
            r2 = move-exception
            goto L_0x0046
        L_0x001f:
            monitor-exit(r0)
            return
        L_0x0021:
            kee r4 = defpackage.kee.h     // Catch:{ all -> 0x001d }
            java.util.logging.Logger r4 = defpackage.kee.i     // Catch:{ all -> 0x001d }
            java.util.logging.Level r5 = java.util.logging.Level.FINE     // Catch:{ all -> 0x001d }
            boolean r4 = r4.isLoggable(r5)     // Catch:{ all -> 0x001d }
            if (r4 == 0) goto L_0x0032
            java.lang.String r4 = "schedule failed (queue is shutdown)"
            defpackage.xie.d(r3, r2, r4)     // Catch:{ all -> 0x001d }
        L_0x0032:
            java.util.concurrent.RejectedExecutionException r2 = new java.util.concurrent.RejectedExecutionException     // Catch:{ all -> 0x001d }
            r2.<init>()     // Catch:{ all -> 0x001d }
            throw r2     // Catch:{ all -> 0x001d }
        L_0x0038:
            r1 = 0
            boolean r3 = r2.d(r3, r4, r1)     // Catch:{ all -> 0x001d }
            if (r3 == 0) goto L_0x0044
            kee r3 = r2.e     // Catch:{ all -> 0x001d }
            r3.e(r2)     // Catch:{ all -> 0x001d }
        L_0x0044:
            monitor-exit(r0)
            return
        L_0x0046:
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hee.c(rde, long):void");
    }

    public final boolean d(rde rde, long j, boolean z) {
        hee hee = rde.a;
        if (hee != this) {
            if (hee == null) {
                rde.a = this;
            } else {
                throw new IllegalStateException("task is in multiple queues".toString());
            }
        }
        this.e.g.getClass();
        long nanoTime = System.nanoTime();
        long j2 = nanoTime + j;
        ArrayList arrayList = this.c;
        int indexOf = arrayList.indexOf(rde);
        if (indexOf != -1) {
            if (rde.b <= j2) {
                if (kee.i.isLoggable(Level.FINE)) {
                    xie.d(rde, this, "already scheduled");
                }
                return false;
            }
            arrayList.remove(indexOf);
        }
        rde.b = j2;
        if (kee.i.isLoggable(Level.FINE)) {
            xie.d(rde, this, z ? "run again after ".concat(xie.q(j2 - nanoTime)) : "scheduled after ".concat(xie.q(j2 - nanoTime)));
        }
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (((rde) it.next()).b - nanoTime > j) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            i = arrayList.size();
        }
        arrayList.add(i, rde);
        return i == 0;
    }

    public final void e() {
        byte[] bArr = nze.a;
        synchronized (this.e) {
            this.a = true;
            if (b()) {
                this.e.e(this);
            }
        }
    }

    public final String toString() {
        return this.f;
    }
}
