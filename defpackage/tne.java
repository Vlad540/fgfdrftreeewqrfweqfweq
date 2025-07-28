package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: tne  reason: default package */
public final class tne {
    public static final ConcurrentHashMap i = new ConcurrentHashMap();
    public final zne a;
    public final lu7 b;
    public final x3a c = new x3a(17);
    public final v2b d;
    public final duf e;
    public volatile boolean f;
    public final t97 g;
    public final AtomicInteger h;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, lu7] */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0038, code lost:
        r1 = new java.util.concurrent.atomic.AtomicInteger();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public tne(defpackage.zne r3) {
        /*
            r2 = this;
            lu7 r0 = new lu7
            r0.<init>()
            r2.<init>()
            r2.a = r3
            r2.b = r0
            x3a r0 = new x3a
            r1 = 17
            r0.<init>(r1)
            r2.c = r0
            v2b r0 = r3.k
            r2.d = r0
            duf r1 = new duf
            r1.<init>(r3, r0)
            r2.e = r1
            ke r0 = new ke
            r1 = 10
            r0.<init>(r1, r2)
            r1 = 2
            t97 r0 = ez3.O(r1, r0)
            r2.g = r0
            java.util.concurrent.ConcurrentHashMap r0 = i
            java.lang.String r3 = r3.a
            java.lang.Object r1 = r0.get(r3)
            if (r1 != 0) goto L_0x0045
            java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
            r1.<init>()
            java.lang.Object r3 = r0.putIfAbsent(r3, r1)
            if (r3 != 0) goto L_0x0044
            goto L_0x0045
        L_0x0044:
            r1 = r3
        L_0x0045:
            java.util.concurrent.atomic.AtomicInteger r1 = (java.util.concurrent.atomic.AtomicInteger) r1
            r2.h = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tne.<init>(zne):void");
    }

    public final void a(String str, Throwable th) {
        if (!this.f && ((Boolean) this.g.getValue()).booleanValue()) {
            v2b v2b = this.d;
            v2b.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis >= v2b.l().getLong("system.shutdown.until.ts", Long.MIN_VALUE) && currentTimeMillis >= v2b.l().getLong("system.CRASH_REPORT.shutdown.until.ts", Long.MIN_VALUE)) {
                int incrementAndGet = this.h.incrementAndGet();
                if (incrementAndGet <= 8) {
                    ((Executor) this.a.j.a).execute(new wc3(this, th, str));
                } else if (incrementAndGet - 8 == 1) {
                    ((Executor) this.a.j.a).execute(new pfe(2, this));
                }
            }
        }
    }
}
