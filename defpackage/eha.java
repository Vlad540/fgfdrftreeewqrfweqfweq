package defpackage;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingDeque;

/* renamed from: eha  reason: default package */
public final class eha {
    public static final ConcurrentHashMap b = new ConcurrentHashMap();
    public static final ConcurrentHashMap c = new ConcurrentHashMap();
    public final nj4 a;

    public eha(nj4 nj4) {
        this.a = nj4;
    }

    public static void a(long j) {
        ConcurrentHashMap concurrentHashMap = b;
        cha cha = (cha) concurrentHashMap.get(Long.valueOf(j));
        if (cha != null) {
            xi4 xi4 = cha.b;
            if (xi4 != null && !xi4.h()) {
                xi4.f();
            }
            concurrentHashMap.remove(Long.valueOf(j));
        }
        c.remove(Long.valueOf(j));
    }

    public static void b(long j, long j2) {
        cha cha;
        if (j != 0 && (cha = (cha) b.get(Long.valueOf(j))) != null) {
            Iterator it = cha.a.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((bha) it.next()).b == j2) {
                        it.remove();
                        break;
                    }
                } else {
                    break;
                }
            }
            if (cha.a.isEmpty()) {
                xi4 xi4 = cha.b;
                if (xi4 != null && !xi4.h()) {
                    xi4.f();
                }
                b.remove(Long.valueOf(j));
            }
        }
    }

    public static cha c(long j) {
        ConcurrentHashMap concurrentHashMap = b;
        cha cha = (cha) concurrentHashMap.get(Long.valueOf(j));
        if (cha != null) {
            return cha;
        }
        cha cha2 = new cha();
        concurrentHashMap.put(Long.valueOf(j), cha2);
        return cha2;
    }

    public final void d(long j, e00 e00) {
        if (j != 0) {
            long nanoTime = System.nanoTime();
            ConcurrentHashMap concurrentHashMap = c;
            dha dha = (dha) concurrentHashMap.get(Long.valueOf(j));
            if (dha != null) {
                if (e00 != dha.b) {
                    concurrentHashMap.remove(Long.valueOf(j));
                } else if (Math.abs(nanoTime - dha.a) < 5000000000L) {
                    return;
                }
            }
            concurrentHashMap.put(Long.valueOf(j), new dha(nanoTime, e00));
            gy9 gy9 = (gy9) ((pk) this.a.get());
            gy9.v(gy9, new sm3(2, ((j2b) gy9.z()).a.n(), j, e00));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0055, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void e(long r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            r0 = 0
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0009
            monitor-exit(r7)
            return
        L_0x0009:
            cha r0 = c(r8)     // Catch:{ all -> 0x0018 }
            xi4 r1 = r0.b     // Catch:{ all -> 0x0018 }
            if (r1 == 0) goto L_0x001a
            boolean r1 = r1.h()     // Catch:{ all -> 0x0018 }
            if (r1 == 0) goto L_0x0054
            goto L_0x001a
        L_0x0018:
            r8 = move-exception
            goto L_0x0056
        L_0x001a:
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x0018 }
            qmc r6 = cnc.a()     // Catch:{ all -> 0x0018 }
            r1 = 0
            r3 = 6
            ku9 r1 = ms9.k(r1, r3, r5, r6)     // Catch:{ all -> 0x0018 }
            qmc r2 = cnc.b()     // Catch:{ all -> 0x0018 }
            nu9 r1 = r1.n(r2)     // Catch:{ all -> 0x0018 }
            aha r2 = new aha     // Catch:{ all -> 0x0018 }
            r2.<init>(r7, r8)     // Catch:{ all -> 0x0018 }
            r3 = 2147483647(0x7fffffff, float:NaN)
            ms9 r1 = r1.i(r2, r3)     // Catch:{ all -> 0x0018 }
            dd9 r2 = new dd9     // Catch:{ all -> 0x0018 }
            r3 = 27
            r2.<init>((int) r3)     // Catch:{ all -> 0x0018 }
            aha r3 = new aha     // Catch:{ all -> 0x0018 }
            r3.<init>(r7, r8)     // Catch:{ all -> 0x0018 }
            z26 r8 = z3d.i     // Catch:{ all -> 0x0018 }
            c97 r9 = new c97     // Catch:{ all -> 0x0018 }
            r9.<init>(r2, r3, r8)     // Catch:{ all -> 0x0018 }
            r1.a(r9)     // Catch:{ all -> 0x0018 }
            r0.b = r9     // Catch:{ all -> 0x0018 }
        L_0x0054:
            monitor-exit(r7)
            return
        L_0x0056:
            monitor-exit(r7)     // Catch:{ all -> 0x0018 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eha.e(long):void");
    }

    public final void f(long j, e00 e00, long j2) {
        if (j != 0) {
            if (e00 == e00.AUDIO || e00 == e00.VIDEO || e00 == e00.VIDEO_MSG || e00 == e00.FILE) {
                LinkedBlockingDeque linkedBlockingDeque = c(j).a;
                Iterator it = linkedBlockingDeque.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((bha) it.next()).b == j2) {
                            break;
                        }
                    } else {
                        linkedBlockingDeque.push(new bha(j2, e00));
                        break;
                    }
                }
                e(j);
                return;
            }
            cha cha = (cha) b.get(Long.valueOf(j));
            if (cha == null || cha.a.isEmpty() || cha.b == null || cha.b.h()) {
                d(j, e00);
            }
        }
    }
}
