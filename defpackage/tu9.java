package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: tu9  reason: default package */
public final class tu9 extends AtomicBoolean implements bw9, xi4 {
    public final bw9 a;
    public final uu9 b;
    public final su9 c;
    public xi4 o;

    public tu9(bw9 bw9, uu9 uu9, su9 su9) {
        this.a = bw9;
        this.b = uu9;
        this.c = su9;
    }

    public final void b() {
        if (compareAndSet(false, true)) {
            this.b.x(this.c);
            this.a.b();
        }
    }

    public final void c(Object obj) {
        this.a.c(obj);
    }

    public final void d(xi4 xi4) {
        if (bj4.g(this.o, xi4)) {
            this.o = xi4;
            this.a.d(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f() {
        /*
            r5 = this;
            xi4 r0 = r5.o
            r0.f()
            r0 = 0
            r1 = 1
            boolean r0 = r5.compareAndSet(r0, r1)
            if (r0 == 0) goto L_0x0038
            uu9 r0 = r5.b
            su9 r5 = r5.c
            monitor-enter(r0)
            su9 r1 = r0.c     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x0034
            if (r1 == r5) goto L_0x0019
            goto L_0x0034
        L_0x0019:
            long r1 = r5.b     // Catch:{ all -> 0x0030 }
            r3 = 1
            long r1 = r1 - r3
            r5.b = r1     // Catch:{ all -> 0x0030 }
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x0032
            boolean r1 = r5.c     // Catch:{ all -> 0x0030 }
            if (r1 != 0) goto L_0x002b
            goto L_0x0032
        L_0x002b:
            r0.y(r5)     // Catch:{ all -> 0x0030 }
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            goto L_0x0038
        L_0x0030:
            r5 = move-exception
            goto L_0x0036
        L_0x0032:
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            goto L_0x0038
        L_0x0034:
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            goto L_0x0038
        L_0x0036:
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            throw r5
        L_0x0038:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tu9.f():void");
    }

    public final boolean h() {
        return this.o.h();
    }

    public final void onError(Throwable th) {
        if (compareAndSet(false, true)) {
            this.b.x(this.c);
            this.a.onError(th);
            return;
        }
        xs7.F(th);
    }
}
