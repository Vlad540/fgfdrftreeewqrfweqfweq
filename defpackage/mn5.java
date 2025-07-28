package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: mn5  reason: default package */
public final class mn5 extends AtomicInteger implements ko5, d1e {
    public static final ln5[] G0 = new ln5[0];
    public static final ln5[] H0 = new ln5[0];
    public d1e A0;
    public long B0;
    public long C0;
    public int D0;
    public int E0;
    public final int F0;
    public final int X;
    public volatile vgd Y;
    public volatile boolean Z;
    public final b1e a;
    public final j26 b;
    public final boolean c;
    public final int o;
    public final ey w0 = new AtomicReference();
    public volatile boolean x0;
    public final AtomicReference y0;
    public final AtomicLong z0;

    /* JADX WARNING: type inference failed for: r0v0, types: [ey, java.util.concurrent.atomic.AtomicReference] */
    public mn5(b1e b1e, j26 j26, boolean z, int i, int i2) {
        AtomicReference atomicReference = new AtomicReference();
        this.y0 = atomicReference;
        this.z0 = new AtomicLong();
        this.a = b1e;
        this.b = j26;
        this.c = z;
        this.o = i;
        this.X = i2;
        this.F0 = Math.max(1, i >> 1);
        atomicReference.lazySet(G0);
    }

    public final boolean a() {
        if (this.x0) {
            vgd vgd = this.Y;
            if (vgd != null) {
                vgd.clear();
            }
            return true;
        } else if (this.c || this.w0.get() == null) {
            return false;
        } else {
            vgd vgd2 = this.Y;
            if (vgd2 != null) {
                vgd2.clear();
            }
            this.w0.e(this.a);
            return true;
        }
    }

    public final void b() {
        if (!this.Z) {
            this.Z = true;
            d();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: ln5[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Object} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(java.lang.Object r9) {
        /*
            r8 = this;
            boolean r0 = r8.Z
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            j26 r0 = r8.b     // Catch:{ all -> 0x010e }
            java.lang.Object r9 = r0.apply(r9)     // Catch:{ all -> 0x010e }
            java.lang.String r0 = "The mapper returned a null Publisher"
            java.util.Objects.requireNonNull(r9, r0)     // Catch:{ all -> 0x010e }
            bjb r9 = (bjb) r9     // Catch:{ all -> 0x010e }
            boolean r0 = r9 instanceof defpackage.q3e
            r1 = 0
            if (r0 == 0) goto L_0x00d3
            q3e r9 = (defpackage.q3e) r9     // Catch:{ all -> 0x00c6 }
            java.lang.Object r9 = r9.get()     // Catch:{ all -> 0x00c6 }
            r0 = 1
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r9 == 0) goto L_0x00ac
            int r3 = r8.get()
            if (r3 != 0) goto L_0x008e
            boolean r3 = r8.compareAndSet(r1, r0)
            if (r3 == 0) goto L_0x008e
            java.util.concurrent.atomic.AtomicLong r3 = r8.z0
            long r3 = r3.get()
            vgd r5 = r8.Y
            r6 = 0
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x0072
            if (r5 == 0) goto L_0x0045
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L_0x0072
        L_0x0045:
            b1e r5 = r8.a
            r5.c(r9)
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r9 == 0) goto L_0x0058
            java.util.concurrent.atomic.AtomicLong r9 = r8.z0
            r9.decrementAndGet()
        L_0x0058:
            int r9 = r8.o
            if (r9 == r2) goto L_0x0086
            boolean r9 = r8.x0
            if (r9 != 0) goto L_0x0086
            int r9 = r8.E0
            int r9 = r9 + r0
            r8.E0 = r9
            int r0 = r8.F0
            if (r9 != r0) goto L_0x0086
            r8.E0 = r1
            d1e r9 = r8.A0
            long r0 = (long) r0
            r9.i(r0)
            goto L_0x0086
        L_0x0072:
            if (r5 != 0) goto L_0x0078
            vgd r5 = r8.g()
        L_0x0078:
            boolean r9 = r5.offer(r9)
            if (r9 != 0) goto L_0x0086
            io.reactivex.rxjava3.exceptions.QueueOverflowException r9 = new io.reactivex.rxjava3.exceptions.QueueOverflowException
            r9.<init>()
            r8.onError(r9)
        L_0x0086:
            int r9 = r8.decrementAndGet()
            if (r9 != 0) goto L_0x00a8
            goto L_0x0106
        L_0x008e:
            vgd r0 = r8.g()
            boolean r9 = r0.offer(r9)
            if (r9 != 0) goto L_0x00a1
            io.reactivex.rxjava3.exceptions.QueueOverflowException r9 = new io.reactivex.rxjava3.exceptions.QueueOverflowException
            r9.<init>()
            r8.onError(r9)
            goto L_0x0106
        L_0x00a1:
            int r9 = r8.getAndIncrement()
            if (r9 == 0) goto L_0x00a8
            goto L_0x0106
        L_0x00a8:
            r8.f()
            goto L_0x0106
        L_0x00ac:
            int r9 = r8.o
            if (r9 == r2) goto L_0x0106
            boolean r9 = r8.x0
            if (r9 != 0) goto L_0x0106
            int r9 = r8.E0
            int r9 = r9 + r0
            r8.E0 = r9
            int r0 = r8.F0
            if (r9 != r0) goto L_0x0106
            r8.E0 = r1
            d1e r8 = r8.A0
            long r0 = (long) r0
            r8.i(r0)
            goto L_0x0106
        L_0x00c6:
            r9 = move-exception
            ek8.a0(r9)
            ey r0 = r8.w0
            r0.a(r9)
            r8.d()
            return
        L_0x00d3:
            ln5 r0 = new ln5
            int r2 = r8.X
            long r3 = r8.B0
            r5 = 1
            long r5 = r5 + r3
            r8.B0 = r5
            r0.<init>(r8, r2, r3)
        L_0x00e1:
            java.util.concurrent.atomic.AtomicReference r2 = r8.y0
            java.lang.Object r3 = r2.get()
            ln5[] r3 = (defpackage.ln5[]) r3
            ln5[] r4 = H0
            if (r3 != r4) goto L_0x00f1
            defpackage.f1e.a(r0)
            goto L_0x0106
        L_0x00f1:
            int r4 = r3.length
            int r5 = r4 + 1
            ln5[] r5 = new defpackage.ln5[r5]
            java.lang.System.arraycopy(r3, r1, r5, r1, r4)
            r5[r4] = r0
        L_0x00fb:
            boolean r4 = r2.compareAndSet(r3, r5)
            if (r4 == 0) goto L_0x0107
            an5 r9 = (defpackage.an5) r9
            r9.f(r0)
        L_0x0106:
            return
        L_0x0107:
            java.lang.Object r4 = r2.get()
            if (r4 == r3) goto L_0x00fb
            goto L_0x00e1
        L_0x010e:
            r9 = move-exception
            ek8.a0(r9)
            d1e r0 = r8.A0
            r0.cancel()
            r8.onError(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mn5.c(java.lang.Object):void");
    }

    public final void cancel() {
        vgd vgd;
        if (!this.x0) {
            this.x0 = true;
            this.A0.cancel();
            AtomicReference atomicReference = this.y0;
            ln5[] ln5Arr = H0;
            ln5[] ln5Arr2 = (ln5[]) atomicReference.getAndSet(ln5Arr);
            if (ln5Arr2 != ln5Arr) {
                for (ln5 ln5 : ln5Arr2) {
                    ln5.getClass();
                    f1e.a(ln5);
                }
                this.w0.b();
            }
            if (getAndIncrement() == 0 && (vgd = this.Y) != null) {
                vgd.clear();
            }
        }
    }

    public final void d() {
        if (getAndIncrement() == 0) {
            f();
        }
    }

    public final void e(d1e d1e) {
        if (f1e.e(this.A0, d1e)) {
            this.A0 = d1e;
            this.a.e(this);
            if (!this.x0) {
                int i = this.o;
                if (i == Integer.MAX_VALUE) {
                    d1e.i(Long.MAX_VALUE);
                } else {
                    d1e.i((long) i);
                }
            }
        }
    }

    public final void f() {
        long j;
        long j2;
        boolean z;
        long j3;
        long j4;
        int i;
        int i2;
        long j5;
        long j6;
        b1e b1e = this.a;
        int i3 = 1;
        while (!a()) {
            vgd vgd = this.Y;
            long j7 = this.z0.get();
            boolean z2 = j7 == Long.MAX_VALUE;
            long j8 = 0;
            if (vgd != null) {
                long j9 = 0;
                j = 0;
                while (j7 != 0) {
                    Object poll = vgd.poll();
                    if (!a()) {
                        if (poll == null) {
                            break;
                        }
                        b1e.c(poll);
                        j++;
                        j9++;
                        j7--;
                    } else {
                        return;
                    }
                }
                if (j9 != 0) {
                    j7 = z2 ? Long.MAX_VALUE : this.z0.addAndGet(-j9);
                }
            } else {
                j = 0;
            }
            boolean z3 = this.Z;
            vgd vgd2 = this.Y;
            ln5[] ln5Arr = (ln5[]) this.y0.get();
            int length = ln5Arr.length;
            if (!z3 || ((vgd2 != null && !vgd2.isEmpty()) || length != 0)) {
                int i4 = i3;
                if (length != 0) {
                    long j10 = this.C0;
                    int i5 = this.D0;
                    if (length <= i5 || ln5Arr[i5].a != j10) {
                        if (length <= i5) {
                            i5 = 0;
                        }
                        for (int i6 = 0; i6 < length && ln5Arr[i5].a != j10; i6++) {
                            i5++;
                            if (i5 == length) {
                                i5 = 0;
                            }
                        }
                        this.D0 = i5;
                        this.C0 = ln5Arr[i5].a;
                    }
                    int i7 = i5;
                    boolean z4 = false;
                    int i8 = 0;
                    while (true) {
                        if (i8 >= length) {
                            z = z4;
                            break;
                        } else if (!a()) {
                            ln5 ln5 = ln5Arr[i7];
                            Object obj = null;
                            while (true) {
                                xgd xgd = ln5.Y;
                                if (xgd != null) {
                                    i = length;
                                    Object obj2 = obj;
                                    long j11 = j8;
                                    while (true) {
                                        if (j2 == j8) {
                                            j5 = j8;
                                            break;
                                        } else if (!a()) {
                                            try {
                                                Object poll2 = xgd.poll();
                                                if (poll2 == null) {
                                                    obj2 = poll2;
                                                    j5 = 0;
                                                    break;
                                                }
                                                b1e.c(poll2);
                                                j2--;
                                                j11++;
                                                obj2 = poll2;
                                                j8 = 0;
                                            } catch (Throwable th) {
                                                Throwable th2 = th;
                                                ek8.a0(th2);
                                                f1e.a(ln5);
                                                this.w0.a(th2);
                                                if (!this.c) {
                                                    this.A0.cancel();
                                                }
                                                if (!a()) {
                                                    h(ln5);
                                                    i8++;
                                                    i2 = i;
                                                    z4 = true;
                                                } else {
                                                    return;
                                                }
                                            }
                                        } else {
                                            return;
                                        }
                                    }
                                    if (j11 != j5) {
                                        j2 = !z2 ? this.z0.addAndGet(-j11) : Long.MAX_VALUE;
                                        ln5.a(j11);
                                        j6 = 0;
                                    } else {
                                        j6 = j5;
                                    }
                                    if (j2 == j6 || obj2 == null) {
                                        break;
                                    }
                                    length = i;
                                    obj = obj2;
                                    j8 = 0;
                                } else {
                                    i = length;
                                    break;
                                }
                                i8++;
                                length = i2;
                                j8 = 0;
                            }
                            boolean z5 = ln5.X;
                            xgd xgd2 = ln5.Y;
                            if (z5 && (xgd2 == null || xgd2.isEmpty())) {
                                h(ln5);
                                if (!a()) {
                                    j++;
                                    z4 = true;
                                } else {
                                    return;
                                }
                            }
                            if (j2 == 0) {
                                z = z4;
                                break;
                            }
                            i7++;
                            i2 = i;
                            if (i7 == i2) {
                                i7 = 0;
                            }
                            i8++;
                            length = i2;
                            j8 = 0;
                        } else {
                            return;
                        }
                    }
                    this.D0 = i7;
                    this.C0 = ln5Arr[i7].a;
                    j4 = j;
                    j3 = 0;
                } else {
                    j3 = 0;
                    j4 = j;
                    z = false;
                }
                if (j4 != j3 && !this.x0) {
                    this.A0.i(j4);
                }
                if (z) {
                    i3 = i4;
                } else {
                    i3 = addAndGet(-i4);
                    if (i3 == 0) {
                        return;
                    }
                }
            } else {
                this.w0.e(this.a);
                return;
            }
        }
    }

    public final vgd g() {
        vgd vgd = this.Y;
        if (vgd == null) {
            vgd = this.o == Integer.MAX_VALUE ? new knd(this.X) : new jnd(this.o);
            this.Y = vgd;
        }
        return vgd;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: ln5[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: ln5} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(defpackage.ln5 r8) {
        /*
            r7 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReference r0 = r7.y0
            java.lang.Object r1 = r0.get()
            ln5[] r1 = (defpackage.ln5[]) r1
            int r2 = r1.length
            if (r2 != 0) goto L_0x000c
            return
        L_0x000c:
            r3 = 0
            r4 = r3
        L_0x000e:
            if (r4 >= r2) goto L_0x0018
            r5 = r1[r4]
            if (r5 != r8) goto L_0x0015
            goto L_0x0019
        L_0x0015:
            int r4 = r4 + 1
            goto L_0x000e
        L_0x0018:
            r4 = -1
        L_0x0019:
            if (r4 >= 0) goto L_0x001c
            return
        L_0x001c:
            r5 = 1
            if (r2 != r5) goto L_0x0022
            ln5[] r2 = G0
            goto L_0x0031
        L_0x0022:
            int r6 = r2 + -1
            ln5[] r6 = new defpackage.ln5[r6]
            java.lang.System.arraycopy(r1, r3, r6, r3, r4)
            int r3 = r4 + 1
            int r2 = r2 - r4
            int r2 = r2 - r5
            java.lang.System.arraycopy(r1, r3, r6, r4, r2)
            r2 = r6
        L_0x0031:
            boolean r3 = r0.compareAndSet(r1, r2)
            if (r3 == 0) goto L_0x0038
            return
        L_0x0038:
            java.lang.Object r3 = r0.get()
            if (r3 == r1) goto L_0x0031
            goto L_0x0000
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mn5.h(ln5):void");
    }

    public final void i(long j) {
        if (f1e.d(j)) {
            z3d.b(this.z0, j);
            d();
        }
    }

    public final void onError(Throwable th) {
        if (this.Z) {
            xs7.F(th);
        } else if (this.w0.a(th)) {
            this.Z = true;
            if (!this.c) {
                for (ln5 ln5 : (ln5[]) this.y0.getAndSet(H0)) {
                    ln5.getClass();
                    f1e.a(ln5);
                }
            }
            d();
        }
    }
}
