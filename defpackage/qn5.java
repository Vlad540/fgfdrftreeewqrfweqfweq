package defpackage;

import io.reactivex.rxjava3.exceptions.QueueOverflowException;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: qn5  reason: default package */
public final class qn5 extends rj0 implements ko5 {
    public int A0;
    public int B0;
    public final AtomicLong X = new AtomicLong();
    public d1e Y;
    public xgd Z;
    public final b1e a;
    public final j26 b;
    public final int c;
    public final int o;
    public volatile boolean w0;
    public volatile boolean x0;
    public final AtomicReference y0 = new AtomicReference();
    public Iterator z0;

    public qn5(b1e b1e, j26 j26, int i) {
        this.a = b1e;
        this.b = j26;
        this.c = i;
        this.o = i - (i >> 2);
    }

    public final void b() {
        if (!this.w0) {
            this.w0 = true;
            h();
        }
    }

    public final void c(Object obj) {
        if (!this.w0) {
            if (this.B0 != 0 || this.Z.offer(obj)) {
                h();
            } else {
                onError(new QueueOverflowException());
            }
        }
    }

    public final void cancel() {
        if (!this.x0) {
            this.x0 = true;
            this.Y.cancel();
            if (getAndIncrement() == 0) {
                this.Z.clear();
            }
        }
    }

    public final void clear() {
        this.z0 = null;
        this.Z.clear();
    }

    public final void e(d1e d1e) {
        if (f1e.e(this.Y, d1e)) {
            this.Y = d1e;
            if (d1e instanceof zjb) {
                zjb zjb = (zjb) d1e;
                int q = zjb.q(3);
                if (q == 1) {
                    this.B0 = q;
                    this.Z = zjb;
                    this.w0 = true;
                    this.a.e(this);
                    return;
                } else if (q == 2) {
                    this.B0 = q;
                    this.Z = zjb;
                    this.a.e(this);
                    d1e.i((long) this.c);
                    return;
                }
            }
            this.Z = new jnd(this.c);
            this.a.e(this);
            d1e.i((long) this.c);
        }
    }

    public final boolean f(boolean z, boolean z2, b1e b1e, xgd xgd) {
        if (this.x0) {
            this.z0 = null;
            xgd.clear();
            return true;
        } else if (!z) {
            return false;
        } else {
            if (((Throwable) this.y0.get()) != null) {
                Throwable d = i15.d(this.y0);
                this.z0 = null;
                xgd.clear();
                b1e.onError(d);
                return true;
            } else if (!z2) {
                return false;
            } else {
                b1e.b();
                return true;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0140, code lost:
        if (r6 == null) goto L_0x0142;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h() {
        /*
            r16 = this;
            r1 = r16
            int r0 = r16.getAndIncrement()
            if (r0 == 0) goto L_0x0009
            return
        L_0x0009:
            b1e r2 = r1.a
            xgd r3 = r1.Z
            int r0 = r1.B0
            r4 = 1
            r5 = 0
            if (r0 == r4) goto L_0x0015
            r0 = r4
            goto L_0x0016
        L_0x0015:
            r0 = r5
        L_0x0016:
            java.util.Iterator r6 = r1.z0
            r7 = r4
        L_0x0019:
            r8 = 0
            if (r6 != 0) goto L_0x0091
            boolean r9 = r1.w0
            java.lang.Object r10 = r3.poll()     // Catch:{ all -> 0x0073 }
            if (r10 != 0) goto L_0x0026
            r11 = r4
            goto L_0x0027
        L_0x0026:
            r11 = r5
        L_0x0027:
            boolean r9 = r1.f(r9, r11, r2, r3)
            if (r9 == 0) goto L_0x002e
            return
        L_0x002e:
            if (r10 == 0) goto L_0x0091
            j26 r6 = r1.b     // Catch:{ all -> 0x005b }
            java.lang.Object r6 = r6.apply(r10)     // Catch:{ all -> 0x005b }
            java.lang.Iterable r6 = (java.lang.Iterable) r6     // Catch:{ all -> 0x005b }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x005b }
            boolean r9 = r6.hasNext()     // Catch:{ all -> 0x005b }
            if (r9 != 0) goto L_0x0058
            if (r0 == 0) goto L_0x0056
            int r6 = r1.A0
            int r6 = r6 + r4
            int r9 = r1.o
            if (r6 != r9) goto L_0x0054
            r1.A0 = r5
            d1e r9 = r1.Y
            long r10 = (long) r6
            r9.i(r10)
            goto L_0x0056
        L_0x0054:
            r1.A0 = r6
        L_0x0056:
            r6 = r8
            goto L_0x0019
        L_0x0058:
            r1.z0 = r6
            goto L_0x0091
        L_0x005b:
            r0 = move-exception
            ek8.a0(r0)
            d1e r3 = r1.Y
            r3.cancel()
            java.util.concurrent.atomic.AtomicReference r3 = r1.y0
            defpackage.i15.a(r3, r0)
            java.util.concurrent.atomic.AtomicReference r0 = r1.y0
            java.lang.Throwable r0 = defpackage.i15.d(r0)
            r2.onError(r0)
            return
        L_0x0073:
            r0 = move-exception
            r4 = r0
            ek8.a0(r4)
            d1e r0 = r1.Y
            r0.cancel()
            java.util.concurrent.atomic.AtomicReference r0 = r1.y0
            defpackage.i15.a(r0, r4)
            java.util.concurrent.atomic.AtomicReference r0 = r1.y0
            java.lang.Throwable r0 = defpackage.i15.d(r0)
            r1.z0 = r8
            r3.clear()
            r2.onError(r0)
            return
        L_0x0091:
            if (r6 == 0) goto L_0x0146
            java.util.concurrent.atomic.AtomicLong r9 = r1.X
            long r9 = r9.get()
            r13 = 0
        L_0x009b:
            int r15 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r15 == 0) goto L_0x0113
            boolean r15 = r1.w0
            boolean r15 = r1.f(r15, r5, r2, r3)
            if (r15 == 0) goto L_0x00a8
            return
        L_0x00a8:
            java.lang.Object r15 = r6.next()     // Catch:{ all -> 0x00f9 }
            java.lang.String r11 = "The iterator returned a null value"
            java.util.Objects.requireNonNull(r15, r11)     // Catch:{ all -> 0x00f9 }
            r2.c(r15)
            boolean r11 = r1.w0
            boolean r11 = r1.f(r11, r5, r2, r3)
            if (r11 == 0) goto L_0x00bd
            return
        L_0x00bd:
            r11 = 1
            long r13 = r13 + r11
            boolean r11 = r6.hasNext()     // Catch:{ all -> 0x00de }
            if (r11 != 0) goto L_0x009b
            if (r0 == 0) goto L_0x00da
            int r6 = r1.A0
            int r6 = r6 + r4
            int r11 = r1.o
            if (r6 != r11) goto L_0x00d8
            r1.A0 = r5
            d1e r11 = r1.Y
            long r4 = (long) r6
            r11.i(r4)
            goto L_0x00da
        L_0x00d8:
            r1.A0 = r6
        L_0x00da:
            r1.z0 = r8
            r6 = r8
            goto L_0x0113
        L_0x00de:
            r0 = move-exception
            r3 = r0
            ek8.a0(r3)
            r1.z0 = r8
            d1e r0 = r1.Y
            r0.cancel()
            java.util.concurrent.atomic.AtomicReference r0 = r1.y0
            defpackage.i15.a(r0, r3)
            java.util.concurrent.atomic.AtomicReference r0 = r1.y0
            java.lang.Throwable r0 = defpackage.i15.d(r0)
            r2.onError(r0)
            return
        L_0x00f9:
            r0 = move-exception
            ek8.a0(r0)
            r1.z0 = r8
            d1e r3 = r1.Y
            r3.cancel()
            java.util.concurrent.atomic.AtomicReference r3 = r1.y0
            defpackage.i15.a(r3, r0)
            java.util.concurrent.atomic.AtomicReference r0 = r1.y0
            java.lang.Throwable r0 = defpackage.i15.d(r0)
            r2.onError(r0)
            return
        L_0x0113:
            int r4 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r4 != 0) goto L_0x012b
            boolean r4 = r1.w0
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto L_0x0123
            if (r6 != 0) goto L_0x0123
            r5 = 1
            goto L_0x0124
        L_0x0123:
            r5 = 0
        L_0x0124:
            boolean r4 = r1.f(r4, r5, r2, r3)
            if (r4 == 0) goto L_0x012b
            return
        L_0x012b:
            r4 = 0
            int r4 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r4 == 0) goto L_0x0140
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r4 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r4 == 0) goto L_0x0140
            java.util.concurrent.atomic.AtomicLong r4 = r1.X
            long r8 = -r13
            r4.addAndGet(r8)
        L_0x0140:
            if (r6 != 0) goto L_0x0146
        L_0x0142:
            r4 = 1
            r5 = 0
            goto L_0x0019
        L_0x0146:
            int r4 = -r7
            int r7 = r1.addAndGet(r4)
            if (r7 != 0) goto L_0x0142
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qn5.h():void");
    }

    public final void i(long j) {
        if (f1e.d(j)) {
            z3d.b(this.X, j);
            h();
        }
    }

    public final boolean isEmpty() {
        return this.z0 == null && this.Z.isEmpty();
    }

    public final void onError(Throwable th) {
        if (this.w0 || !i15.a(this.y0, th)) {
            xs7.F(th);
            return;
        }
        this.w0 = true;
        h();
    }

    public final Object poll() {
        Iterator it = this.z0;
        while (true) {
            if (it == null) {
                Object poll = this.Z.poll();
                if (poll != null) {
                    it = ((Iterable) this.b.apply(poll)).iterator();
                    if (it.hasNext()) {
                        this.z0 = it;
                        break;
                    }
                    it = null;
                } else {
                    return null;
                }
            } else {
                break;
            }
        }
        Object next = it.next();
        Objects.requireNonNull(next, "The iterator returned a null value");
        if (!it.hasNext()) {
            this.z0 = null;
        }
        return next;
    }

    public final int q(int i) {
        return this.B0 == 1 ? 1 : 0;
    }
}
