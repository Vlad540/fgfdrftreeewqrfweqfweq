package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: t4b  reason: default package */
public final class t4b implements p15, ju5 {
    public static final String B0 = a24.e0("Processor");
    public final Object A0;
    public final WorkDatabase X;
    public final HashMap Y = new HashMap();
    public final HashMap Z = new HashMap();
    public PowerManager.WakeLock a;
    public final Context b;
    public final sa3 c;
    public final bee o;
    public final HashMap w0;
    public final List x0;
    public final HashSet y0;
    public final ArrayList z0;

    public t4b(Context context, sa3 sa3, duf duf, WorkDatabase workDatabase, List list) {
        this.b = context;
        this.c = sa3;
        this.o = duf;
        this.X = workDatabase;
        this.x0 = list;
        this.y0 = new HashSet();
        this.z0 = new ArrayList();
        this.a = null;
        this.A0 = new Object();
        this.w0 = new HashMap();
    }

    public static boolean c(String str, nuf nuf) {
        if (nuf != null) {
            nuf.G0 = true;
            nuf.h();
            nuf.F0.cancel(true);
            if (nuf.Y == null || !(nuf.F0.a instanceof r0)) {
                a24.B().t(nuf.H0, "WorkSpec " + nuf.X + " is already done. Not interrupting.");
            } else {
                nuf.Y.stop();
            }
            a24 B = a24.B();
            String str2 = B0;
            B.t(str2, "WorkerWrapper interrupted for " + str);
            return true;
        }
        a24 B2 = a24.B();
        String str3 = B0;
        B2.t(str3, "WorkerWrapper could not be found for " + str);
        return false;
    }

    public final void a(p15 p15) {
        synchronized (this.A0) {
            this.z0.add(p15);
        }
    }

    public final void b(btf btf, boolean z) {
        synchronized (this.A0) {
            try {
                nuf nuf = (nuf) this.Z.get(btf.a);
                if (nuf != null && btf.equals(vx3.o(nuf.X))) {
                    this.Z.remove(btf.a);
                }
                a24 B = a24.B();
                String str = B0;
                B.t(str, t4b.class.getSimpleName() + " " + btf.a + " executed; reschedule = " + z);
                Iterator it = this.z0.iterator();
                while (it.hasNext()) {
                    ((p15) it.next()).b(btf, z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d(String str) {
        boolean z;
        synchronized (this.A0) {
            try {
                if (!this.Z.containsKey(str)) {
                    if (!this.Y.containsKey(str)) {
                        z = false;
                    }
                }
                z = true;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public final void e(p15 p15) {
        synchronized (this.A0) {
            this.z0.remove(p15);
        }
    }

    public final void f(btf btf) {
        ((m30) ((duf) this.o).c).execute(new vr2(this, btf));
    }

    public final void g(String str, hu5 hu5) {
        synchronized (this.A0) {
            try {
                a24 B = a24.B();
                String str2 = B0;
                B.P(str2, "Moving WorkSpec (" + str + ") to the foreground");
                nuf nuf = (nuf) this.Z.remove(str);
                if (nuf != null) {
                    if (this.a == null) {
                        PowerManager.WakeLock a2 = lef.a(this.b, "ProcessorForegroundLck");
                        this.a = a2;
                        a2.acquire();
                    }
                    this.Y.put(str, nuf);
                    jq3.b(this.b, b8e.d(this.b, vx3.o(nuf.X), hu5));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [km4, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007f, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean h(defpackage.nqd r13, defpackage.w4g r14) {
        /*
            r12 = this;
            java.lang.String r0 = "Work "
            btf r1 = r13.a
            java.lang.String r2 = r1.a
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            androidx.work.impl.WorkDatabase r4 = r12.X
            xs0 r5 = new xs0
            r6 = 2
            r5.<init>(r12, r3, r2, r6)
            java.lang.Object r4 = r4.p(r5)
            ztf r4 = (defpackage.ztf) r4
            r5 = 0
            if (r4 != 0) goto L_0x0037
            a24 r13 = defpackage.a24.B()
            java.lang.String r14 = B0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Didn't find WorkSpec for id "
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r13.k0(r14, r0)
            r12.f(r1)
            return r5
        L_0x0037:
            java.lang.Object r6 = r12.A0
            monitor-enter(r6)
            boolean r7 = r12.d(r2)     // Catch:{ all -> 0x0078 }
            if (r7 == 0) goto L_0x0080
            java.util.HashMap r14 = r12.w0     // Catch:{ all -> 0x0078 }
            java.lang.Object r14 = r14.get(r2)     // Catch:{ all -> 0x0078 }
            java.util.Set r14 = (java.util.Set) r14     // Catch:{ all -> 0x0078 }
            java.util.Iterator r2 = r14.iterator()     // Catch:{ all -> 0x0078 }
            java.lang.Object r2 = r2.next()     // Catch:{ all -> 0x0078 }
            nqd r2 = (defpackage.nqd) r2     // Catch:{ all -> 0x0078 }
            btf r2 = r2.a     // Catch:{ all -> 0x0078 }
            int r2 = r2.b     // Catch:{ all -> 0x0078 }
            int r3 = r1.b     // Catch:{ all -> 0x0078 }
            if (r2 != r3) goto L_0x007b
            r14.add(r13)     // Catch:{ all -> 0x0078 }
            a24 r12 = defpackage.a24.B()     // Catch:{ all -> 0x0078 }
            java.lang.String r13 = B0     // Catch:{ all -> 0x0078 }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x0078 }
            r14.<init>(r0)     // Catch:{ all -> 0x0078 }
            r14.append(r1)     // Catch:{ all -> 0x0078 }
            java.lang.String r0 = " is already enqueued for processing"
            r14.append(r0)     // Catch:{ all -> 0x0078 }
            java.lang.String r14 = r14.toString()     // Catch:{ all -> 0x0078 }
            r12.t(r13, r14)     // Catch:{ all -> 0x0078 }
            goto L_0x007e
        L_0x0078:
            r12 = move-exception
            goto L_0x0118
        L_0x007b:
            r12.f(r1)     // Catch:{ all -> 0x0078 }
        L_0x007e:
            monitor-exit(r6)     // Catch:{ all -> 0x0078 }
            return r5
        L_0x0080:
            int r0 = r4.t     // Catch:{ all -> 0x0078 }
            int r7 = r1.b     // Catch:{ all -> 0x0078 }
            if (r0 == r7) goto L_0x008b
            r12.f(r1)     // Catch:{ all -> 0x0078 }
            monitor-exit(r6)     // Catch:{ all -> 0x0078 }
            return r5
        L_0x008b:
            km4 r0 = new km4     // Catch:{ all -> 0x0078 }
            android.content.Context r5 = r12.b     // Catch:{ all -> 0x0078 }
            sa3 r7 = r12.c     // Catch:{ all -> 0x0078 }
            bee r8 = r12.o     // Catch:{ all -> 0x0078 }
            androidx.work.impl.WorkDatabase r9 = r12.X     // Catch:{ all -> 0x0078 }
            r0.<init>()     // Catch:{ all -> 0x0078 }
            w4g r10 = new w4g     // Catch:{ all -> 0x0078 }
            r11 = 18
            r10.<init>((int) r11)     // Catch:{ all -> 0x0078 }
            r0.x0 = r10     // Catch:{ all -> 0x0078 }
            android.content.Context r5 = r5.getApplicationContext()     // Catch:{ all -> 0x0078 }
            r0.b = r5     // Catch:{ all -> 0x0078 }
            r0.a = r8     // Catch:{ all -> 0x0078 }
            r0.c = r12     // Catch:{ all -> 0x0078 }
            r0.o = r7     // Catch:{ all -> 0x0078 }
            r0.X = r9     // Catch:{ all -> 0x0078 }
            r0.Y = r4     // Catch:{ all -> 0x0078 }
            r0.w0 = r3     // Catch:{ all -> 0x0078 }
            java.util.List r3 = r12.x0     // Catch:{ all -> 0x0078 }
            r0.Z = r3     // Catch:{ all -> 0x0078 }
            if (r14 == 0) goto L_0x00bb
            r0.x0 = r14     // Catch:{ all -> 0x0078 }
        L_0x00bb:
            nuf r14 = new nuf     // Catch:{ all -> 0x0078 }
            r14.<init>(r0)     // Catch:{ all -> 0x0078 }
            b4d r0 = r14.E0     // Catch:{ all -> 0x0078 }
            ue3 r3 = new ue3     // Catch:{ all -> 0x0078 }
            btf r4 = r13.a     // Catch:{ all -> 0x0078 }
            r5 = 5
            r3.<init>(r12, r4, r0, r5)     // Catch:{ all -> 0x0078 }
            bee r4 = r12.o     // Catch:{ all -> 0x0078 }
            duf r4 = (defpackage.duf) r4     // Catch:{ all -> 0x0078 }
            java.lang.Object r4 = r4.c     // Catch:{ all -> 0x0078 }
            m30 r4 = (defpackage.m30) r4     // Catch:{ all -> 0x0078 }
            r0.c(r3, r4)     // Catch:{ all -> 0x0078 }
            java.util.HashMap r0 = r12.Z     // Catch:{ all -> 0x0078 }
            r0.put(r2, r14)     // Catch:{ all -> 0x0078 }
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ all -> 0x0078 }
            r0.<init>()     // Catch:{ all -> 0x0078 }
            r0.add(r13)     // Catch:{ all -> 0x0078 }
            java.util.HashMap r13 = r12.w0     // Catch:{ all -> 0x0078 }
            r13.put(r2, r0)     // Catch:{ all -> 0x0078 }
            monitor-exit(r6)     // Catch:{ all -> 0x0078 }
            bee r12 = r12.o
            duf r12 = (defpackage.duf) r12
            java.lang.Object r12 = r12.a
            qm r12 = (defpackage.qm) r12
            r12.execute(r14)
            a24 r12 = defpackage.a24.B()
            java.lang.String r13 = B0
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.Class<t4b> r0 = defpackage.t4b.class
            java.lang.String r0 = r0.getSimpleName()
            r14.append(r0)
            java.lang.String r0 = ": processing "
            r14.append(r0)
            r14.append(r1)
            java.lang.String r14 = r14.toString()
            r12.t(r13, r14)
            r12 = 1
            return r12
        L_0x0118:
            monitor-exit(r6)     // Catch:{ all -> 0x0078 }
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t4b.h(nqd, w4g):boolean");
    }

    public final void i() {
        synchronized (this.A0) {
            try {
                if (!(!this.Y.isEmpty())) {
                    Context context = this.b;
                    String str = b8e.y0;
                    Intent intent = new Intent(context, SystemForegroundService.class);
                    intent.setAction("ACTION_STOP_FOREGROUND");
                    this.b.startService(intent);
                    PowerManager.WakeLock wakeLock = this.a;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.a = null;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
