package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: y0c  reason: default package */
public final class y0c implements Cloneable {
    public boolean A0 = true;
    public volatile boolean B0;
    public volatile pd C0;
    public volatile c1c D0;
    public final qw9 E0;
    public final lac F0;
    public final boolean G0;
    public Object X;
    public n15 Y;
    public c1c Z;
    public final d1c a;
    public final j06 b;
    public final ml6 c;
    public final AtomicBoolean o = new AtomicBoolean();
    public boolean w0;
    public pd x0;
    public boolean y0;
    public boolean z0;

    public y0c(qw9 qw9, lac lac, boolean z) {
        this.E0 = qw9;
        this.F0 = lac;
        this.G0 = z;
        this.a = (d1c) qw9.b.b;
        this.b = (j06) qw9.X.a;
        ml6 ml6 = new ml6(1, this);
        ml6.g((long) qw9.L0, TimeUnit.MILLISECONDS);
        this.c = ml6;
    }

    public static final String a(y0c y0c) {
        StringBuilder sb = new StringBuilder();
        sb.append(y0c.B0 ? "canceled " : BuildConfig.FLAVOR);
        sb.append(y0c.G0 ? "web socket" : "call");
        sb.append(" to ");
        sb.append(y0c.F0.b.g());
        return sb.toString();
    }

    public final void b(c1c c1c) {
        byte[] bArr = nze.a;
        if (this.Z == null) {
            this.Z = c1c;
            c1c.o.add(new x0c(this, this.X));
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final IOException c(IOException iOException) {
        IOException iOException2;
        Socket k;
        byte[] bArr = nze.a;
        c1c c1c = this.Z;
        if (c1c != null) {
            synchronized (c1c) {
                k = k();
            }
            if (this.Z == null) {
                if (k != null) {
                    nze.d(k);
                }
                this.b.getClass();
            } else if (k != null) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        if (!this.w0 && this.c.j()) {
            iOException2 = new InterruptedIOException("timeout");
            if (iOException != null) {
                iOException2.initCause(iOException);
            }
        } else {
            iOException2 = iOException;
        }
        if (iOException != null) {
            this.b.getClass();
        } else {
            this.b.getClass();
        }
        return iOException2;
    }

    public final Object clone() {
        return new y0c(this.E0, this.F0, this.G0);
    }

    public final void d() {
        Socket socket;
        if (!this.B0) {
            this.B0 = true;
            pd pdVar = this.C0;
            if (pdVar != null) {
                ((m15) pdVar.Y).cancel();
            }
            c1c c1c = this.D0;
            if (!(c1c == null || (socket = c1c.b) == null)) {
                nze.d(socket);
            }
            this.b.getClass();
        }
    }

    public final void e(nn1 nn1) {
        w0c w0c;
        if (this.o.compareAndSet(false, true)) {
            kxa kxa = kxa.a;
            this.X = kxa.a.g();
            this.b.getClass();
            stf stf = this.E0.a;
            w0c w0c2 = new w0c(this, nn1);
            synchronized (stf) {
                ((ArrayDeque) stf.b).add(w0c2);
                if (!this.G0) {
                    String str = this.F0.b.e;
                    Iterator it = ((ArrayDeque) stf.c).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            Iterator it2 = ((ArrayDeque) stf.b).iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    w0c = null;
                                    break;
                                }
                                w0c = (w0c) it2.next();
                                if (hhd.f(w0c.c.F0.b.e, str)) {
                                    break;
                                }
                            }
                        } else {
                            w0c = (w0c) it.next();
                            if (hhd.f(w0c.c.F0.b.e, str)) {
                                break;
                            }
                        }
                    }
                    if (w0c != null) {
                        w0c2.a = w0c.a;
                    }
                }
            }
            stf.H();
            return;
        }
        throw new IllegalStateException("Already Executed".toString());
    }

    public final xbc f() {
        if (this.o.compareAndSet(false, true)) {
            this.c.i();
            kxa kxa = kxa.a;
            this.X = kxa.a.g();
            this.b.getClass();
            try {
                stf stf = this.E0.a;
                synchronized (stf) {
                    ((ArrayDeque) stf.o).add(this);
                }
                xbc h = h();
                stf stf2 = this.E0.a;
                stf2.o((ArrayDeque) stf2.o, this);
                return h;
            } catch (Throwable th) {
                stf stf3 = this.E0.a;
                stf3.o((ArrayDeque) stf3.o, this);
                throw th;
            }
        } else {
            throw new IllegalStateException("Already Executed".toString());
        }
    }

    public final void g(boolean z) {
        pd pdVar;
        synchronized (this) {
            if (!this.A0) {
                throw new IllegalStateException("released".toString());
            }
        }
        if (z && (pdVar = this.C0) != null) {
            ((m15) pdVar.Y).cancel();
            ((y0c) pdVar.c).i(pdVar, true, true, (IOException) null);
        }
        this.x0 = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0093  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.xbc h() {
        /*
            r12 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            qw9 r0 = r12.E0
            java.util.List r0 = r0.c
            defpackage.u23.K(r0, r2)
            qq0 r0 = new qq0
            qw9 r1 = r12.E0
            r3 = 2
            r0.<init>(r3, r1)
            r2.add(r0)
            qq0 r0 = new qq0
            qw9 r1 = r12.E0
            oa2 r1 = r1.y0
            r3 = 0
            r0.<init>(r3, r1)
            r2.add(r0)
            nv0 r0 = new nv0
            qw9 r1 = r12.E0
            r1.getClass()
            r1 = 0
            r0.<init>(r1)
            r2.add(r0)
            nv0 r0 = defpackage.nv0.b
            r2.add(r0)
            boolean r0 = r12.G0
            if (r0 != 0) goto L_0x0042
            qw9 r0 = r12.E0
            java.util.List r0 = r0.o
            defpackage.u23.K(r0, r2)
        L_0x0042:
            bj1 r0 = new bj1
            boolean r1 = r12.G0
            r0.<init>(r1)
            r2.add(r0)
            e1c r9 = new e1c
            lac r10 = r12.F0
            qw9 r0 = r12.E0
            int r6 = r0.M0
            int r7 = r0.N0
            int r8 = r0.O0
            r3 = 0
            r4 = 0
            r0 = r9
            r1 = r12
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            r1 = 0
            xbc r2 = r9.d(r10)     // Catch:{ IOException -> 0x007b, all -> 0x0079 }
            boolean r3 = r12.B0     // Catch:{ IOException -> 0x007b, all -> 0x0079 }
            if (r3 != 0) goto L_0x006e
            r12.j(r0)
            return r2
        L_0x006e:
            defpackage.nze.c(r2)     // Catch:{ IOException -> 0x007b, all -> 0x0079 }
            java.io.IOException r2 = new java.io.IOException     // Catch:{ IOException -> 0x007b, all -> 0x0079 }
            java.lang.String r3 = "Canceled"
            r2.<init>(r3)     // Catch:{ IOException -> 0x007b, all -> 0x0079 }
            throw r2     // Catch:{ IOException -> 0x007b, all -> 0x0079 }
        L_0x0079:
            r2 = move-exception
            goto L_0x0091
        L_0x007b:
            r1 = move-exception
            r2 = 1
            java.io.IOException r1 = r12.j(r1)     // Catch:{ all -> 0x008b }
            if (r1 != 0) goto L_0x0090
            java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch:{ all -> 0x008b }
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Throwable"
            r1.<init>(r3)     // Catch:{ all -> 0x008b }
            throw r1     // Catch:{ all -> 0x008b }
        L_0x008b:
            r1 = move-exception
            r11 = r2
            r2 = r1
            r1 = r11
            goto L_0x0091
        L_0x0090:
            throw r1     // Catch:{ all -> 0x008b }
        L_0x0091:
            if (r1 != 0) goto L_0x0096
            r12.j(r0)
        L_0x0096:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y0c.h():xbc");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x001e A[Catch:{ all -> 0x0014 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0022 A[Catch:{ all -> 0x0014 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x002c A[Catch:{ all -> 0x0014 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x002e A[Catch:{ all -> 0x0014 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.IOException i(pd r3, boolean r4, boolean r5, java.io.IOException r6) {
        /*
            r2 = this;
            pd r0 = r2.C0
            boolean r3 = r3.equals(r0)
            r0 = 1
            r3 = r3 ^ r0
            if (r3 == 0) goto L_0x000b
            return r6
        L_0x000b:
            monitor-enter(r2)
            r3 = 0
            if (r4 == 0) goto L_0x0016
            boolean r1 = r2.y0     // Catch:{ all -> 0x0014 }
            if (r1 != 0) goto L_0x001c
            goto L_0x0016
        L_0x0014:
            r3 = move-exception
            goto L_0x003d
        L_0x0016:
            if (r5 == 0) goto L_0x003f
            boolean r1 = r2.z0     // Catch:{ all -> 0x0014 }
            if (r1 == 0) goto L_0x003f
        L_0x001c:
            if (r4 == 0) goto L_0x0020
            r2.y0 = r3     // Catch:{ all -> 0x0014 }
        L_0x0020:
            if (r5 == 0) goto L_0x0024
            r2.z0 = r3     // Catch:{ all -> 0x0014 }
        L_0x0024:
            boolean r4 = r2.y0     // Catch:{ all -> 0x0014 }
            if (r4 != 0) goto L_0x002e
            boolean r5 = r2.z0     // Catch:{ all -> 0x0014 }
            if (r5 != 0) goto L_0x002e
            r5 = r0
            goto L_0x002f
        L_0x002e:
            r5 = r3
        L_0x002f:
            if (r4 != 0) goto L_0x003a
            boolean r4 = r2.z0     // Catch:{ all -> 0x0014 }
            if (r4 != 0) goto L_0x003a
            boolean r4 = r2.A0     // Catch:{ all -> 0x0014 }
            if (r4 != 0) goto L_0x003a
            r3 = r0
        L_0x003a:
            r4 = r3
            r3 = r5
            goto L_0x0040
        L_0x003d:
            monitor-exit(r2)
            throw r3
        L_0x003f:
            r4 = r3
        L_0x0040:
            monitor-exit(r2)
            if (r3 == 0) goto L_0x0055
            r3 = 0
            r2.C0 = r3
            c1c r3 = r2.Z
            if (r3 == 0) goto L_0x0055
            monitor-enter(r3)
            int r5 = r3.l     // Catch:{ all -> 0x0052 }
            int r5 = r5 + r0
            r3.l = r5     // Catch:{ all -> 0x0052 }
            monitor-exit(r3)
            goto L_0x0055
        L_0x0052:
            r2 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0052 }
            throw r2
        L_0x0055:
            if (r4 == 0) goto L_0x005c
            java.io.IOException r2 = r2.c(r6)
            return r2
        L_0x005c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y0c.i(pd, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    public final IOException j(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.A0) {
                this.A0 = false;
                if (!this.y0 && !this.z0) {
                    z = true;
                }
            }
        }
        return z ? c(iOException) : iOException;
    }

    public final Socket k() {
        c1c c1c = this.Z;
        byte[] bArr = nze.a;
        ArrayList arrayList = c1c.o;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (hhd.f((y0c) ((Reference) it.next()).get(), this)) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            arrayList.remove(i);
            this.Z = null;
            if (arrayList.isEmpty()) {
                c1c.p = System.nanoTime();
                d1c d1c = this.a;
                d1c.getClass();
                byte[] bArr2 = nze.a;
                boolean z = c1c.i;
                hee hee = (hee) d1c.c;
                if (z || d1c.b == 0) {
                    c1c.i = true;
                    ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) d1c.e;
                    concurrentLinkedQueue.remove(c1c);
                    if (concurrentLinkedQueue.isEmpty()) {
                        hee.a();
                    }
                    return c1c.c;
                }
                hee.c((el6) d1c.d, 0);
            }
            return null;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
