package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: qb7  reason: default package */
public final class qb7 implements jc7, ms1 {
    public final Object a = new Object();
    public final nc7 b;
    public final ev1 c;
    public boolean o = false;

    public qb7(nc7 nc7, ev1 ev1) {
        this.b = nc7;
        this.c = ev1;
        if (nc7.R().d.a(ob7.o)) {
            ev1.e();
        } else {
            ev1.s();
        }
        nc7.R().a(this);
    }

    public final fu1 a() {
        return this.c.G0;
    }

    public final nc7 c() {
        nc7 nc7;
        synchronized (this.a) {
            nc7 = this.b;
        }
        return nc7;
    }

    public final List e() {
        List unmodifiableList;
        synchronized (this.a) {
            unmodifiableList = Collections.unmodifiableList(this.c.w());
        }
        return unmodifiableList;
    }

    public final void i() {
        synchronized (this.a) {
            try {
                if (!this.o) {
                    onStop(this.b);
                    this.o = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @lx9(nb7.ON_DESTROY)
    public void onDestroy(nc7 nc7) {
        synchronized (this.a) {
            ev1 ev1 = this.c;
            ev1.z((ArrayList) ev1.w());
        }
    }

    @lx9(nb7.ON_PAUSE)
    public void onPause(nc7 nc7) {
        this.c.a.j(false);
    }

    @lx9(nb7.ON_RESUME)
    public void onResume(nc7 nc7) {
        this.c.a.j(true);
    }

    @lx9(nb7.ON_START)
    public void onStart(nc7 nc7) {
        synchronized (this.a) {
            try {
                if (!this.o) {
                    this.c.e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @lx9(nb7.ON_STOP)
    public void onStop(nc7 nc7) {
        synchronized (this.a) {
            try {
                if (!this.o) {
                    this.c.s();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.a
            monitor-enter(r0)
            boolean r1 = r3.o     // Catch:{ all -> 0x0009 }
            if (r1 != 0) goto L_0x000b
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            return
        L_0x0009:
            r3 = move-exception
            goto L_0x0025
        L_0x000b:
            r1 = 0
            r3.o = r1     // Catch:{ all -> 0x0009 }
            nc7 r1 = r3.b     // Catch:{ all -> 0x0009 }
            pc7 r1 = r1.R()     // Catch:{ all -> 0x0009 }
            ob7 r1 = r1.d     // Catch:{ all -> 0x0009 }
            ob7 r2 = defpackage.ob7.o     // Catch:{ all -> 0x0009 }
            boolean r1 = r1.a(r2)     // Catch:{ all -> 0x0009 }
            if (r1 == 0) goto L_0x0023
            nc7 r1 = r3.b     // Catch:{ all -> 0x0009 }
            r3.onStart(r1)     // Catch:{ all -> 0x0009 }
        L_0x0023:
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            return
        L_0x0025:
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qb7.q():void");
    }
}
