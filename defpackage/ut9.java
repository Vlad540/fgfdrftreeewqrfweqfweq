package defpackage;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ut9  reason: default package */
public final class ut9 extends AtomicInteger implements xi4, bw9 {
    public static final tt9[] E0 = new tt9[0];
    public static final tt9[] F0 = new tt9[0];
    public long A0;
    public int B0;
    public final ArrayDeque C0;
    public int D0;
    public final int X;
    public volatile vgd Y;
    public volatile boolean Z;
    public final bw9 a;
    public final j26 b;
    public final boolean c;
    public final int o;
    public final ey w0 = new AtomicReference();
    public volatile boolean x0;
    public final AtomicReference y0;
    public xi4 z0;

    /* JADX WARNING: type inference failed for: r0v0, types: [ey, java.util.concurrent.atomic.AtomicReference] */
    public ut9(bw9 bw9, j26 j26, int i, int i2) {
        this.a = bw9;
        this.b = j26;
        this.c = false;
        this.o = i;
        this.X = i2;
        if (i != Integer.MAX_VALUE) {
            this.C0 = new ArrayDeque(i);
        }
        this.y0 = new AtomicReference(E0);
    }

    public final boolean a() {
        if (this.x0) {
            return true;
        }
        Throwable th = (Throwable) this.w0.get();
        if (this.c || th == null) {
            return false;
        }
        e();
        this.w0.d(this.a);
        return true;
    }

    public final void b() {
        if (!this.Z) {
            this.Z = true;
            g();
        }
    }

    public final void c(Object obj) {
        if (!this.Z) {
            try {
                Object apply = this.b.apply(obj);
                Objects.requireNonNull(apply, "The mapper returned a null ObservableSource");
                nv9 nv9 = (nv9) apply;
                if (this.o != Integer.MAX_VALUE) {
                    synchronized (this) {
                        try {
                            int i = this.D0;
                            if (i == this.o) {
                                this.C0.offer(nv9);
                                return;
                            }
                            this.D0 = i + 1;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                k(nv9);
            } catch (Throwable th2) {
                ek8.a0(th2);
                this.z0.f();
                onError(th2);
            }
        }
    }

    public final void d(xi4 xi4) {
        if (bj4.g(this.z0, xi4)) {
            this.z0 = xi4;
            this.a.d(this);
        }
    }

    public final boolean e() {
        this.z0.f();
        AtomicReference atomicReference = this.y0;
        tt9[] tt9Arr = F0;
        tt9[] tt9Arr2 = (tt9[]) atomicReference.getAndSet(tt9Arr);
        if (tt9Arr2 == tt9Arr) {
            return false;
        }
        for (tt9 tt9 : tt9Arr2) {
            tt9.getClass();
            bj4.a(tt9);
        }
        return true;
    }

    public final void f() {
        this.x0 = true;
        if (e()) {
            this.w0.b();
        }
    }

    public final void g() {
        if (getAndIncrement() == 0) {
            i();
        }
    }

    public final boolean h() {
        return this.x0;
    }

    public final void i() {
        int i;
        bw9 bw9 = this.a;
        int i2 = 1;
        while (!a()) {
            vgd vgd = this.Y;
            int i3 = 0;
            if (vgd != null) {
                while (!a()) {
                    Object poll = vgd.poll();
                    if (poll != null) {
                        bw9.c(poll);
                        i3++;
                    }
                }
                return;
            }
            if (i3 == 0) {
                boolean z = this.Z;
                vgd vgd2 = this.Y;
                tt9[] tt9Arr = (tt9[]) this.y0.get();
                int length = tt9Arr.length;
                if (this.o != Integer.MAX_VALUE) {
                    synchronized (this) {
                        i = this.C0.size();
                    }
                } else {
                    i = 0;
                }
                if (!z || !((vgd2 == null || vgd2.isEmpty()) && length == 0 && i == 0)) {
                    if (length != 0) {
                        int min = Math.min(length - 1, this.B0);
                        int i4 = 0;
                        while (i4 < length) {
                            if (!a()) {
                                tt9 tt9 = tt9Arr[min];
                                xgd xgd = tt9.c;
                                if (xgd != null) {
                                    while (true) {
                                        try {
                                            Object poll2 = xgd.poll();
                                            if (poll2 == null) {
                                                break;
                                            }
                                            bw9.c(poll2);
                                            if (a()) {
                                                return;
                                            }
                                        } catch (Throwable th) {
                                            ek8.a0(th);
                                            bj4.a(tt9);
                                            this.w0.a(th);
                                            if (!a()) {
                                                j(tt9);
                                                i3++;
                                                min++;
                                                if (min != length) {
                                                }
                                            } else {
                                                return;
                                            }
                                        }
                                    }
                                }
                                boolean z2 = tt9.b;
                                xgd xgd2 = tt9.c;
                                if (z2 && (xgd2 == null || xgd2.isEmpty())) {
                                    j(tt9);
                                    i3++;
                                }
                                min++;
                                if (min != length) {
                                    i4++;
                                }
                                min = 0;
                                i4++;
                            } else {
                                return;
                            }
                        }
                        this.B0 = min;
                    }
                    if (i3 == 0) {
                        i2 = addAndGet(-i2);
                        if (i2 == 0) {
                            return;
                        }
                    } else if (this.o != Integer.MAX_VALUE) {
                        l(i3);
                    }
                } else {
                    this.w0.d(this.a);
                    return;
                }
            } else if (this.o != Integer.MAX_VALUE) {
                l(i3);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: tt9[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: tt9} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j(defpackage.tt9 r8) {
        /*
            r7 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReference r0 = r7.y0
            java.lang.Object r1 = r0.get()
            tt9[] r1 = (defpackage.tt9[]) r1
            int r2 = r1.length
            r3 = 0
            r4 = r3
        L_0x000b:
            if (r4 >= r2) goto L_0x0015
            r5 = r1[r4]
            if (r5 != r8) goto L_0x0012
            goto L_0x0016
        L_0x0012:
            int r4 = r4 + 1
            goto L_0x000b
        L_0x0015:
            r4 = -1
        L_0x0016:
            if (r4 >= 0) goto L_0x0019
            return
        L_0x0019:
            r5 = 1
            if (r2 != r5) goto L_0x001f
            tt9[] r2 = E0
            goto L_0x002e
        L_0x001f:
            int r6 = r2 + -1
            tt9[] r6 = new defpackage.tt9[r6]
            java.lang.System.arraycopy(r1, r3, r6, r3, r4)
            int r3 = r4 + 1
            int r2 = r2 - r4
            int r2 = r2 - r5
            java.lang.System.arraycopy(r1, r3, r6, r4, r2)
            r2 = r6
        L_0x002e:
            boolean r3 = r0.compareAndSet(r1, r2)
            if (r3 == 0) goto L_0x0035
            return
        L_0x0035:
            java.lang.Object r3 = r0.get()
            if (r3 == r1) goto L_0x002e
            goto L_0x0000
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ut9.j(tt9):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: tt9[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.Object} */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        if (decrementAndGet() == 0) goto L_0x005d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void k(defpackage.nv9 r7) {
        /*
            r6 = this;
        L_0x0000:
            boolean r0 = r7 instanceof defpackage.q3e
            r1 = 0
            if (r0 == 0) goto L_0x007e
            q3e r7 = (defpackage.q3e) r7
            r0 = 1
            r2 = 2147483647(0x7fffffff, float:NaN)
            java.lang.Object r7 = r7.get()     // Catch:{ all -> 0x0051 }
            if (r7 != 0) goto L_0x0012
            goto L_0x005d
        L_0x0012:
            int r3 = r6.get()
            if (r3 != 0) goto L_0x002a
            boolean r3 = r6.compareAndSet(r1, r0)
            if (r3 == 0) goto L_0x002a
            bw9 r3 = r6.a
            r3.c(r7)
            int r7 = r6.decrementAndGet()
            if (r7 != 0) goto L_0x004d
            goto L_0x005d
        L_0x002a:
            vgd r3 = r6.Y
            if (r3 != 0) goto L_0x0043
            int r3 = r6.o
            if (r3 != r2) goto L_0x003a
            knd r3 = new knd
            int r4 = r6.X
            r3.<init>(r4)
            goto L_0x0041
        L_0x003a:
            jnd r3 = new jnd
            int r4 = r6.o
            r3.<init>(r4)
        L_0x0041:
            r6.Y = r3
        L_0x0043:
            r3.offer(r7)
            int r7 = r6.getAndIncrement()
            if (r7 == 0) goto L_0x004d
            goto L_0x00ad
        L_0x004d:
            r6.i()
            goto L_0x005d
        L_0x0051:
            r7 = move-exception
            ek8.a0(r7)
            ey r3 = r6.w0
            r3.a(r7)
            r6.g()
        L_0x005d:
            int r7 = r6.o
            if (r7 == r2) goto L_0x00ad
            monitor-enter(r6)
            java.util.ArrayDeque r7 = r6.C0     // Catch:{ all -> 0x0073 }
            java.lang.Object r7 = r7.poll()     // Catch:{ all -> 0x0073 }
            nv9 r7 = (defpackage.nv9) r7     // Catch:{ all -> 0x0073 }
            if (r7 != 0) goto L_0x0075
            int r1 = r6.D0     // Catch:{ all -> 0x0073 }
            int r1 = r1 - r0
            r6.D0 = r1     // Catch:{ all -> 0x0073 }
            r1 = r0
            goto L_0x0075
        L_0x0073:
            r7 = move-exception
            goto L_0x007c
        L_0x0075:
            monitor-exit(r6)     // Catch:{ all -> 0x0073 }
            if (r1 == 0) goto L_0x0000
            r6.g()
            goto L_0x00ad
        L_0x007c:
            monitor-exit(r6)     // Catch:{ all -> 0x0073 }
            throw r7
        L_0x007e:
            tt9 r0 = new tt9
            long r2 = r6.A0
            r4 = 1
            long r2 = r2 + r4
            r6.A0 = r2
            r0.<init>(r6)
        L_0x008a:
            java.util.concurrent.atomic.AtomicReference r2 = r6.y0
            java.lang.Object r3 = r2.get()
            tt9[] r3 = (defpackage.tt9[]) r3
            tt9[] r4 = F0
            if (r3 != r4) goto L_0x009a
            defpackage.bj4.a(r0)
            goto L_0x00ad
        L_0x009a:
            int r4 = r3.length
            int r5 = r4 + 1
            tt9[] r5 = new defpackage.tt9[r5]
            java.lang.System.arraycopy(r3, r1, r5, r1, r4)
            r5[r4] = r0
        L_0x00a4:
            boolean r4 = r2.compareAndSet(r3, r5)
            if (r4 == 0) goto L_0x00ae
            r7.a(r0)
        L_0x00ad:
            return
        L_0x00ae:
            java.lang.Object r4 = r2.get()
            if (r4 == r3) goto L_0x00a4
            goto L_0x008a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ut9.k(nv9):void");
    }

    public final void l(int i) {
        while (true) {
            int i2 = i - 1;
            if (i != 0) {
                synchronized (this) {
                    try {
                        nv9 nv9 = (nv9) this.C0.poll();
                        if (nv9 == null) {
                            this.D0--;
                        } else {
                            k(nv9);
                        }
                    } finally {
                        while (true) {
                        }
                    }
                }
                i = i2;
            } else {
                return;
            }
        }
    }

    public final void onError(Throwable th) {
        if (this.Z) {
            xs7.F(th);
        } else if (this.w0.a(th)) {
            this.Z = true;
            g();
        }
    }
}
