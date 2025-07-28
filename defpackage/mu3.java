package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.internal.Symbol;

/* renamed from: mu3  reason: default package */
public final class mu3 extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater x0 = AtomicIntegerFieldUpdater.newUpdater(mu3.class, "workerCtl$volatile");
    public long X;
    public int Y;
    public boolean Z;
    public final utf a = new utf();
    public final l7c b = new Object();
    public int c = 4;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker = nu3.z0;
    public long o;
    public final /* synthetic */ nu3 w0;
    private volatile /* synthetic */ int workerCtl$volatile;

    /* JADX WARNING: type inference failed for: r3v4, types: [l7c, java.lang.Object] */
    public mu3(nu3 nu3, int i) {
        this.w0 = nu3;
        setDaemon(true);
        setContextClassLoader(nu3.getClass().getClassLoader());
        int nanoTime = (int) System.nanoTime();
        this.Y = nanoTime == 0 ? 42 : nanoTime;
        f(i);
    }

    public final sde a(boolean z) {
        sde e;
        sde e2;
        nu3 nu3;
        long j;
        int i = this.c;
        boolean z2 = true;
        sde sde = null;
        utf utf = this.a;
        nu3 nu32 = this.w0;
        if (i != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = nu3.x0;
            do {
                nu3 = this.w0;
                j = atomicLongFieldUpdater.get(nu3);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    utf.getClass();
                    loop1:
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = utf.b;
                        sde sde2 = (sde) atomicReferenceFieldUpdater.get(utf);
                        if (sde2 != null && ((ii5) sde2.taskContext).b == 1) {
                            while (true) {
                                if (atomicReferenceFieldUpdater.compareAndSet(utf, sde2, (Object) null)) {
                                    sde = sde2;
                                    break loop1;
                                } else if (atomicReferenceFieldUpdater.get(utf) != sde2) {
                                }
                            }
                        }
                    }
                    int i2 = utf.d.get(utf);
                    int i3 = utf.c.get(utf);
                    while (true) {
                        if (i2 != i3 && utf.e.get(utf) != 0) {
                            i3--;
                            sde c2 = utf.c(i3, true);
                            if (c2 != null) {
                                sde = c2;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (sde != null) {
                        return sde;
                    }
                    sde sde3 = (sde) nu32.Y.removeFirstOrNull();
                    return sde3 == null ? i(1) : sde3;
                }
            } while (!nu3.x0.compareAndSet(nu3, j, j - 4398046511104L));
            this.c = 1;
        }
        if (z) {
            if (d(nu32.a * 2) != 0) {
                z2 = false;
            }
            if (z2 && (e2 = e()) != null) {
                return e2;
            }
            utf.getClass();
            sde sde4 = (sde) utf.b.getAndSet(utf, (Object) null);
            if (sde4 == null) {
                sde4 = utf.b();
            }
            if (sde4 != null) {
                return sde4;
            }
            if (!z2 && (e = e()) != null) {
                return e;
            }
        } else {
            sde e3 = e();
            if (e3 != null) {
                return e3;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i) {
        int i2 = this.Y;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.Y = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i6 & i5 : (Integer.MAX_VALUE & i5) % i;
    }

    public final sde e() {
        int d = d(2);
        nu3 nu3 = this.w0;
        if (d == 0) {
            sde sde = (sde) nu3.X.removeFirstOrNull();
            return sde != null ? sde : (sde) nu3.Y.removeFirstOrNull();
        }
        sde sde2 = (sde) nu3.Y.removeFirstOrNull();
        return sde2 != null ? sde2 : (sde) nu3.X.removeFirstOrNull();
    }

    public final void f(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.w0.o);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(int i) {
        int i2 = this.c;
        boolean z = true;
        if (i2 != 1) {
            z = false;
        }
        if (z) {
            nu3.x0.addAndGet(this.w0, 4398046511104L);
        }
        if (i2 != i) {
            this.c = i;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0082, code lost:
        r19 = r6;
        r6 = -2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.sde i(int r24) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = defpackage.nu3.x0
            nu3 r3 = r0.w0
            long r4 = r2.get(r3)
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r2 = (int) r4
            r4 = 2
            r5 = 0
            if (r2 >= r4) goto L_0x0016
            return r5
        L_0x0016:
            int r6 = r0.d(r2)
            r10 = 0
            r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x0020:
            if (r10 >= r2) goto L_0x00e9
            r15 = 1
            int r6 = r6 + r15
            if (r6 <= r2) goto L_0x0027
            r6 = r15
        L_0x0027:
            kotlinx.coroutines.internal.ResizableAtomicArray r4 = r3.Z
            java.lang.Object r4 = r4.get(r6)
            mu3 r4 = (defpackage.mu3) r4
            if (r4 == 0) goto L_0x00df
            if (r4 == r0) goto L_0x00df
            r7 = 3
            utf r4 = r4.a
            if (r1 != r7) goto L_0x003d
            sde r7 = r4.b()
            goto L_0x0069
        L_0x003d:
            r4.getClass()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r7 = defpackage.utf.d
            int r7 = r7.get(r4)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r8 = defpackage.utf.c
            int r8 = r8.get(r4)
            if (r1 != r15) goto L_0x0050
            r9 = r15
            goto L_0x0051
        L_0x0050:
            r9 = 0
        L_0x0051:
            if (r7 == r8) goto L_0x005d
            if (r9 == 0) goto L_0x005f
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r13 = defpackage.utf.e
            int r13 = r13.get(r4)
            if (r13 != 0) goto L_0x005f
        L_0x005d:
            r7 = r5
            goto L_0x0069
        L_0x005f:
            int r13 = r7 + 1
            sde r7 = r4.c(r7, r9)
            if (r7 != 0) goto L_0x0069
            r7 = r13
            goto L_0x0051
        L_0x0069:
            l7c r13 = r0.b
            if (r7 == 0) goto L_0x0076
            r13.a = r7
            r19 = r6
        L_0x0071:
            r6 = -1
        L_0x0073:
            r8 = -1
            goto L_0x00bb
        L_0x0076:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = defpackage.utf.b
            java.lang.Object r14 = r7.get(r4)
            sde r14 = (defpackage.sde) r14
            r18 = -2
            if (r14 != 0) goto L_0x0089
        L_0x0082:
            r21 = r18
            r19 = r6
            r6 = r21
            goto L_0x0073
        L_0x0089:
            xde r8 = r14.taskContext
            ii5 r8 = (defpackage.ii5) r8
            int r8 = r8.b
            if (r8 != r15) goto L_0x0093
            r8 = r15
            goto L_0x0094
        L_0x0093:
            r8 = 2
        L_0x0094:
            r8 = r8 & r1
            if (r8 != 0) goto L_0x0098
            goto L_0x0082
        L_0x0098:
            m54 r8 = defpackage.oee.f
            r8.getClass()
            long r8 = java.lang.System.nanoTime()
            r19 = r6
            long r5 = r14.submissionTime
            long r8 = r8 - r5
            long r5 = defpackage.oee.b
            int r20 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r20 >= 0) goto L_0x00b1
            long r4 = r5 - r8
            r6 = r4
            r5 = 0
            goto L_0x0073
        L_0x00b1:
            r5 = 0
            boolean r6 = r7.compareAndSet(r4, r14, r5)
            if (r6 == 0) goto L_0x00d1
            r13.a = r14
            goto L_0x0071
        L_0x00bb:
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 != 0) goto L_0x00c6
            java.lang.Object r0 = r13.a
            sde r0 = (defpackage.sde) r0
            r13.a = r5
            return r0
        L_0x00c6:
            r16 = 0
            int r4 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r4 <= 0) goto L_0x00e1
            long r11 = java.lang.Math.min(r11, r6)
            goto L_0x00e1
        L_0x00d1:
            r8 = -1
            r16 = 0
            java.lang.Object r5 = r7.get(r4)
            if (r5 == r14) goto L_0x00b1
            r6 = r19
            r5 = 0
            goto L_0x0076
        L_0x00df:
            r19 = r6
        L_0x00e1:
            int r10 = r10 + 1
            r6 = r19
            r4 = 2
            r5 = 0
            goto L_0x0020
        L_0x00e9:
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r16 = 0
            int r1 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x00f5
            goto L_0x00f7
        L_0x00f5:
            r11 = r16
        L_0x00f7:
            r0.X = r11
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu3.i(int):sde");
    }

    public final void run() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        int i;
        loop0:
        while (true) {
            boolean z = false;
            while (true) {
                nu3 nu3 = this.w0;
                nu3.getClass();
                int i2 = 5;
                if (nu3.y0.get(nu3) == 0 && this.c != 5) {
                    sde a2 = a(this.Z);
                    int i3 = 3;
                    if (a2 == null) {
                        this.Z = false;
                        if (this.X != 0) {
                            if (z) {
                                h(3);
                                Thread.interrupted();
                                LockSupport.parkNanos(this.X);
                                this.X = 0;
                                break;
                            }
                            z = true;
                        } else {
                            Object obj = this.nextParkedWorker;
                            Symbol symbol = nu3.z0;
                            if (obj != symbol) {
                                x0.set(this, -1);
                                while (this.nextParkedWorker != nu3.z0) {
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = x0;
                                    if (atomicIntegerFieldUpdater.get(this) != -1) {
                                        break;
                                    }
                                    nu3 nu32 = this.w0;
                                    nu32.getClass();
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = nu3.y0;
                                    if (atomicIntegerFieldUpdater2.get(nu32) != 0 || this.c == i2) {
                                        break;
                                    }
                                    h(i3);
                                    Thread.interrupted();
                                    if (this.o == 0) {
                                        this.o = System.nanoTime() + this.w0.c;
                                    }
                                    LockSupport.parkNanos(this.w0.c);
                                    if (System.nanoTime() - this.o >= 0) {
                                        this.o = 0;
                                        nu3 nu33 = this.w0;
                                        synchronized (nu33.Z) {
                                            try {
                                                if (!(atomicIntegerFieldUpdater2.get(nu33) != 0)) {
                                                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = nu3.x0;
                                                    if (((int) (atomicLongFieldUpdater2.get(nu33) & 2097151)) > nu33.a) {
                                                        if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                            int i4 = this.indexInArray;
                                                            f(0);
                                                            nu33.S(this, i4, 0);
                                                            int andDecrement = (int) (atomicLongFieldUpdater2.getAndDecrement(nu33) & 2097151);
                                                            if (andDecrement != i4) {
                                                                mu3 mu3 = (mu3) nu33.Z.get(andDecrement);
                                                                nu33.Z.setSynchronized(i4, mu3);
                                                                mu3.f(i4);
                                                                nu33.S(mu3, andDecrement, i4);
                                                            }
                                                            nu33.Z.setSynchronized(andDecrement, null);
                                                            this.c = 5;
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                    }
                                    i2 = 5;
                                    i3 = 3;
                                }
                            } else {
                                nu3 nu34 = this.w0;
                                nu34.getClass();
                                if (this.nextParkedWorker == symbol) {
                                    do {
                                        atomicLongFieldUpdater = nu3.w0;
                                        j = atomicLongFieldUpdater.get(nu34);
                                        i = this.indexInArray;
                                        this.nextParkedWorker = nu34.Z.get((int) (j & 2097151));
                                    } while (!atomicLongFieldUpdater.compareAndSet(nu34, j, ((j + PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) & -2097152) | ((long) i)));
                                }
                            }
                        }
                    } else {
                        this.X = 0;
                        int i5 = ((ii5) a2.taskContext).b;
                        this.o = 0;
                        if (this.c == 3) {
                            this.c = 2;
                        }
                        nu3 nu35 = this.w0;
                        if (i5 != 0 && h(2) && !nu35.e0() && !nu35.U(nu3.x0.get(nu35))) {
                            nu35.e0();
                        }
                        nu35.getClass();
                        try {
                            a2.run();
                        } catch (Throwable th2) {
                            Throwable th3 = th2;
                            Thread currentThread = Thread.currentThread();
                            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th3);
                        }
                        if (i5 != 0) {
                            nu3.x0.addAndGet(nu35, -2097152);
                            if (this.c != 5) {
                                this.c = 4;
                            }
                        }
                    }
                }
            }
        }
        h(5);
    }
}
