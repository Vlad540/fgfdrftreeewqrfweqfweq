package defpackage;

import android.content.Context;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: jc4  reason: default package */
public final class jc4 implements r96 {
    public final gvf a;
    public final q96 b;
    public final h96 c;
    public final lk9 d;
    public final w4g e;
    public final ew0 f;
    public final SparseArray g = new SparseArray();
    public boolean h;
    public final bq0 i;
    public final xx j;
    public final xx k;
    public z23 l;
    public EGLDisplay m;
    public EGLSurface n;
    public int o = -1;

    public jc4(Context context, h96 h96, lk9 lk9, ScheduledExecutorService scheduledExecutorService, gvf gvf, la9 la9) {
        ExecutorService executorService;
        this.a = gvf;
        this.b = la9;
        this.c = h96;
        this.d = lk9;
        this.e = new w4g(context, 6);
        boolean z = true;
        this.i = new bq0(false, 1);
        this.j = new xx(1);
        this.k = new xx(1);
        z = scheduledExecutorService != null ? false : z;
        if (z) {
            int i2 = oze.a;
            executorService = Executors.newSingleThreadExecutor(new v93(2, "Effect:DefaultVideoCompositor:GlThread"));
        } else {
            scheduledExecutorService.getClass();
            executorService = scheduledExecutorService;
        }
        ew0 ew0 = new ew0(executorService, z, (h4f) new r34(4, (Object) gvf));
        this.f = ew0;
        ew0.v(new ec4(this, 0));
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [ms6, ts6] */
    public final synchronized e8c a() {
        if (this.i.f() == 0) {
            po5 po5 = ws6.b;
            return e8c.X;
        }
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            if (((ic4) this.g.valueAt(i2)).a.isEmpty()) {
                po5 po52 = ws6.b;
                return e8c.X;
            }
        }
        ? ms6 = new ms6(4);
        hc4 hc4 = (hc4) ((ic4) this.g.get(this.o)).a.element();
        ms6.a(hc4);
        for (int i3 = 0; i3 < this.g.size(); i3++) {
            if (this.g.keyAt(i3) != this.o) {
                ic4 ic4 = (ic4) this.g.valueAt(i3);
                if (ic4.a.size() != 1 || ic4.b) {
                    Iterator it = ic4.a.iterator();
                    long j2 = Long.MAX_VALUE;
                    hc4 hc42 = null;
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        hc4 hc43 = (hc4) it.next();
                        long j3 = hc43.c;
                        long abs = Math.abs(j3 - hc4.c);
                        if (abs < j2) {
                            hc42 = hc43;
                            j2 = abs;
                        }
                        if (j3 > hc4.c || (!it.hasNext() && ic4.b)) {
                            hc42.getClass();
                            ms6.a(hc42);
                        }
                    }
                    hc42.getClass();
                    ms6.a(hc42);
                } else {
                    po5 po53 = ws6.b;
                    return e8c.X;
                }
            }
        }
        e8c j4 = ms6.j();
        if (j4.o == this.g.size()) {
            return j4;
        }
        return e8c.X;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0096, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void b() {
        /*
            r7 = this;
            monitor-enter(r7)
            e8c r0 = r7.a()     // Catch:{ all -> 0x0038 }
            boolean r1 = r0.isEmpty()     // Catch:{ all -> 0x0038 }
            if (r1 == 0) goto L_0x000d
            monitor-exit(r7)
            return
        L_0x000d:
            int r1 = r7.o     // Catch:{ all -> 0x0038 }
            java.lang.Object r1 = r0.get(r1)     // Catch:{ all -> 0x0038 }
            hc4 r1 = (defpackage.hc4) r1     // Catch:{ all -> 0x0038 }
            ts6 r2 = new ts6     // Catch:{ all -> 0x0038 }
            r2.<init>()     // Catch:{ all -> 0x0038 }
            r3 = 0
        L_0x001b:
            int r4 = r0.size()     // Catch:{ all -> 0x0038 }
            if (r3 >= r4) goto L_0x003a
            java.lang.Object r4 = r0.get(r3)     // Catch:{ all -> 0x0038 }
            hc4 r4 = (defpackage.hc4) r4     // Catch:{ all -> 0x0038 }
            p96 r4 = r4.b     // Catch:{ all -> 0x0038 }
            gjd r5 = new gjd     // Catch:{ all -> 0x0038 }
            int r6 = r4.c     // Catch:{ all -> 0x0038 }
            int r4 = r4.d     // Catch:{ all -> 0x0038 }
            r5.<init>(r6, r4)     // Catch:{ all -> 0x0038 }
            r2.d(r5)     // Catch:{ all -> 0x0038 }
            int r3 = r3 + 1
            goto L_0x001b
        L_0x0038:
            r0 = move-exception
            goto L_0x0097
        L_0x003a:
            lk9 r3 = r7.d     // Catch:{ all -> 0x0038 }
            e8c r2 = r2.j()     // Catch:{ all -> 0x0038 }
            gjd r2 = r3.i(r2)     // Catch:{ all -> 0x0038 }
            bq0 r3 = r7.i     // Catch:{ all -> 0x0038 }
            h96 r4 = r7.c     // Catch:{ all -> 0x0038 }
            int r5 = r2.b()     // Catch:{ all -> 0x0038 }
            int r2 = r2.a()     // Catch:{ all -> 0x0038 }
            r3.e(r4, r5, r2)     // Catch:{ all -> 0x0038 }
            bq0 r2 = r7.i     // Catch:{ all -> 0x0038 }
            p96 r2 = r2.h()     // Catch:{ all -> 0x0038 }
            long r3 = r1.c     // Catch:{ all -> 0x0038 }
            xx r1 = r7.j     // Catch:{ all -> 0x0038 }
            r1.e(r3)     // Catch:{ all -> 0x0038 }
            w4g r1 = r7.e     // Catch:{ all -> 0x0038 }
            r1.q(r0, r2)     // Catch:{ all -> 0x0038 }
            long r0 = defpackage.gt0.n()     // Catch:{ all -> 0x0038 }
            xx r5 = r7.k     // Catch:{ all -> 0x0038 }
            r5.e(r0)     // Catch:{ all -> 0x0038 }
            q96 r0 = r7.b     // Catch:{ all -> 0x0038 }
            r0.a(r7, r2, r3)     // Catch:{ all -> 0x0038 }
            android.util.SparseArray r0 = r7.g     // Catch:{ all -> 0x0038 }
            int r1 = r7.o     // Catch:{ all -> 0x0038 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x0038 }
            ic4 r0 = (defpackage.ic4) r0     // Catch:{ all -> 0x0038 }
            r1 = 1
            r7.f(r0, r1)     // Catch:{ all -> 0x0038 }
            r7.c()     // Catch:{ all -> 0x0038 }
            boolean r1 = r7.h     // Catch:{ all -> 0x0038 }
            if (r1 == 0) goto L_0x0095
            java.util.ArrayDeque r0 = r0.a     // Catch:{ all -> 0x0038 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0038 }
            if (r0 == 0) goto L_0x0095
            gvf r0 = r7.a     // Catch:{ all -> 0x0038 }
            r0.k()     // Catch:{ all -> 0x0038 }
        L_0x0095:
            monitor-exit(r7)
            return
        L_0x0097:
            monitor-exit(r7)     // Catch:{ all -> 0x0038 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jc4.b():void");
    }

    public final synchronized void c() {
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            if (this.g.keyAt(i2) != this.o) {
                e((ic4) this.g.valueAt(i2));
            }
        }
    }

    public final void d(long j2) {
        this.f.v(new fc4(this, j2, 0));
    }

    public final synchronized void e(ic4 ic4) {
        int i2;
        ic4 ic42 = (ic4) this.g.get(this.o);
        if (!ic42.a.isEmpty() || !ic42.b) {
            hc4 hc4 = (hc4) ic42.a.peek();
            long j2 = hc4 != null ? hc4.c : -9223372036854775807L;
            ArrayDeque arrayDeque = ic4.a;
            gc4 gc4 = new gc4(j2);
            arrayDeque.getClass();
            t27 t27 = new t27(arrayDeque, gc4);
            if (t27 instanceof Collection) {
                i2 = ((Collection) t27).size();
            } else {
                Iterator it = t27.iterator();
                long j3 = 0;
                while (true) {
                    p1 p1Var = (p1) it;
                    if (!p1Var.hasNext()) {
                        break;
                    }
                    p1Var.next();
                    j3++;
                }
                i2 = xie.F(j3);
            }
            f(ic4, Math.max(i2 - 1, 0));
            return;
        }
        f(ic4, ic4.a.size());
    }

    public final synchronized void f(ic4 ic4, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            hc4 hc4 = (hc4) ic4.a.remove();
            hc4.a.d(hc4.c);
        }
    }
}
