package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.internal.LockFreeTaskQueue;
import kotlinx.coroutines.internal.ResizableAtomicArray;
import kotlinx.coroutines.internal.Symbol;

/* renamed from: nu3  reason: default package */
public final class nu3 implements Executor, Closeable {
    public static final /* synthetic */ AtomicLongFieldUpdater w0;
    public static final /* synthetic */ AtomicLongFieldUpdater x0;
    public static final /* synthetic */ AtomicIntegerFieldUpdater y0;
    public static final Symbol z0 = new Symbol("NOT_IN_STACK");
    public final ga6 X;
    public final ga6 Y;
    public final ResizableAtomicArray Z;
    private volatile /* synthetic */ int _isTerminated$volatile;
    public final int a;
    public final int b;
    public final long c;
    private volatile /* synthetic */ long controlState$volatile;
    public final String o;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    static {
        Class<nu3> cls = nu3.class;
        w0 = AtomicLongFieldUpdater.newUpdater(cls, "parkedWorkersStack$volatile");
        x0 = AtomicLongFieldUpdater.newUpdater(cls, "controlState$volatile");
        y0 = AtomicIntegerFieldUpdater.newUpdater(cls, "_isTerminated$volatile");
    }

    /* JADX WARNING: type inference failed for: r4v3, types: [ga6, kotlinx.coroutines.internal.LockFreeTaskQueue] */
    /* JADX WARNING: type inference failed for: r4v4, types: [ga6, kotlinx.coroutines.internal.LockFreeTaskQueue] */
    public nu3(int i, int i2, long j) {
        String str = oee.a;
        this.a = i;
        this.b = i2;
        this.c = j;
        this.o = str;
        if (i < 1) {
            throw new IllegalArgumentException(rf0.f(i, "Core pool size ", " should be at least 1").toString());
        } else if (i2 < i) {
            throw new IllegalArgumentException(me4.g("Max pool size ", i2, i, " should be greater than or equals to core pool size ").toString());
        } else if (i2 > 2097150) {
            throw new IllegalArgumentException(rf0.f(i2, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        } else if (j > 0) {
            this.X = new LockFreeTaskQueue(false);
            this.Y = new LockFreeTaskQueue(false);
            this.Z = new ResizableAtomicArray((i + 1) * 2);
            this.controlState$volatile = ((long) i) << 42;
            this._isTerminated$volatile = 0;
        } else {
            throw new IllegalArgumentException(us8.j(j, "Idle worker keep alive time ", " must be positive").toString());
        }
    }

    public static /* synthetic */ void o(nu3 nu3, Runnable runnable, boolean z, int i) {
        ii5 ii5 = oee.g;
        if ((i & 4) != 0) {
            z = false;
        }
        nu3.n(runnable, ii5, z);
    }

    public final void S(mu3 mu3, int i, int i2) {
        while (true) {
            long j = w0.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + j) & -2097152;
            if (i3 == i) {
                if (i2 == 0) {
                    Object c2 = mu3.c();
                    while (true) {
                        if (c2 == z0) {
                            i3 = -1;
                            break;
                        } else if (c2 == null) {
                            i3 = 0;
                            break;
                        } else {
                            mu3 mu32 = (mu3) c2;
                            int b2 = mu32.b();
                            if (b2 != 0) {
                                i3 = b2;
                                break;
                            }
                            c2 = mu32.c();
                        }
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                if (w0.compareAndSet(this, j, ((long) i3) | j2)) {
                    return;
                }
            }
        }
    }

    public final boolean U(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.a;
        if (i < i2) {
            int m = m();
            if (m == 1 && i2 > 1) {
                m();
            }
            if (m > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0086, code lost:
        if (r1 == null) goto L_0x0088;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void close() {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = y0
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto L_0x000c
            goto L_0x00ae
        L_0x000c:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof defpackage.mu3
            r3 = 0
            if (r1 == 0) goto L_0x0018
            mu3 r0 = (defpackage.mu3) r0
            goto L_0x0019
        L_0x0018:
            r0 = r3
        L_0x0019:
            if (r0 == 0) goto L_0x0024
            nu3 r1 = r0.w0
            boolean r1 = defpackage.hhd.f(r1, r8)
            if (r1 == 0) goto L_0x0024
            goto L_0x0025
        L_0x0024:
            r0 = r3
        L_0x0025:
            kotlinx.coroutines.internal.ResizableAtomicArray r1 = r8.Z
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = x0     // Catch:{ all -> 0x00c0 }
            long r4 = r4.get(r8)     // Catch:{ all -> 0x00c0 }
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r4 = (int) r4
            monitor-exit(r1)
            if (r2 > r4) goto L_0x0076
            r1 = r2
        L_0x0037:
            kotlinx.coroutines.internal.ResizableAtomicArray r5 = r8.Z
            java.lang.Object r5 = r5.get(r1)
            mu3 r5 = (defpackage.mu3) r5
            if (r5 == r0) goto L_0x0071
        L_0x0041:
            java.lang.Thread$State r6 = r5.getState()
            java.lang.Thread$State r7 = java.lang.Thread.State.TERMINATED
            if (r6 == r7) goto L_0x0052
            java.util.concurrent.locks.LockSupport.unpark(r5)
            r6 = 10000(0x2710, double:4.9407E-320)
            r5.join(r6)
            goto L_0x0041
        L_0x0052:
            utf r5 = r5.a
            ga6 r6 = r8.Y
            r5.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = defpackage.utf.b
            java.lang.Object r7 = r7.getAndSet(r5, r3)
            sde r7 = (defpackage.sde) r7
            if (r7 == 0) goto L_0x0066
            r6.addLast(r7)
        L_0x0066:
            sde r7 = r5.b()
            if (r7 != 0) goto L_0x006d
            goto L_0x0071
        L_0x006d:
            r6.addLast(r7)
            goto L_0x0066
        L_0x0071:
            if (r1 == r4) goto L_0x0076
            int r1 = r1 + 1
            goto L_0x0037
        L_0x0076:
            ga6 r1 = r8.Y
            r1.close()
            ga6 r1 = r8.X
            r1.close()
        L_0x0080:
            if (r0 == 0) goto L_0x0088
            sde r1 = r0.a(r2)
            if (r1 != 0) goto L_0x00af
        L_0x0088:
            ga6 r1 = r8.X
            java.lang.Object r1 = r1.removeFirstOrNull()
            sde r1 = (defpackage.sde) r1
            if (r1 != 0) goto L_0x00af
            ga6 r1 = r8.Y
            java.lang.Object r1 = r1.removeFirstOrNull()
            sde r1 = (defpackage.sde) r1
            if (r1 != 0) goto L_0x00af
            if (r0 == 0) goto L_0x00a2
            r1 = 5
            r0.h(r1)
        L_0x00a2:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = w0
            r1 = 0
            r0.set(r8, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = x0
            r0.set(r8, r1)
        L_0x00ae:
            return
        L_0x00af:
            r1.run()     // Catch:{ all -> 0x00b3 }
            goto L_0x0080
        L_0x00b3:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()
            r4.uncaughtException(r3, r1)
            goto L_0x0080
        L_0x00c0:
            r8 = move-exception
            monitor-exit(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nu3.close():void");
    }

    public final boolean e0() {
        Symbol symbol;
        int i;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = w0;
            long j = atomicLongFieldUpdater.get(this);
            mu3 mu3 = (mu3) this.Z.get((int) (2097151 & j));
            if (mu3 == null) {
                mu3 = null;
            } else {
                long j2 = (PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + j) & -2097152;
                Object c2 = mu3.c();
                while (true) {
                    symbol = z0;
                    if (c2 == symbol) {
                        i = -1;
                        break;
                    } else if (c2 == null) {
                        i = 0;
                        break;
                    } else {
                        mu3 mu32 = (mu3) c2;
                        i = mu32.b();
                        if (i != 0) {
                            break;
                        }
                        c2 = mu32.c();
                    }
                }
                if (i >= 0) {
                    if (atomicLongFieldUpdater.compareAndSet(this, j, j2 | ((long) i))) {
                        mu3.g(symbol);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (mu3 == null) {
                return false;
            }
            if (mu3.x0.compareAndSet(mu3, -1, 0)) {
                LockSupport.unpark(mu3);
                return true;
            }
        }
    }

    public final void execute(Runnable runnable) {
        o(this, runnable, false, 6);
    }

    public final int m() {
        synchronized (this.Z) {
            try {
                if (y0.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = x0;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int i2 = i - ((int) ((j & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.a) {
                    return 0;
                }
                if (i >= this.b) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 <= 0 || this.Z.get(i3) != null) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                mu3 mu3 = new mu3(this, i3);
                this.Z.setSynchronized(i3, mu3);
                if (i3 == ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    int i4 = i2 + 1;
                    mu3.start();
                    return i4;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void n(Runnable runnable, xde xde, boolean z) {
        sde sde;
        int i;
        oee.f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof sde) {
            sde = (sde) runnable;
            sde.submissionTime = nanoTime;
            sde.taskContext = xde;
        } else {
            sde = new eee(runnable, nanoTime, xde);
        }
        boolean z2 = false;
        boolean z3 = ((ii5) sde.taskContext).b == 1;
        AtomicLongFieldUpdater atomicLongFieldUpdater = x0;
        long addAndGet = z3 ? atomicLongFieldUpdater.addAndGet(this, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) : 0;
        Thread currentThread = Thread.currentThread();
        mu3 mu3 = currentThread instanceof mu3 ? (mu3) currentThread : null;
        if (mu3 == null || !hhd.f(mu3.w0, this)) {
            mu3 = null;
        }
        if (!(mu3 == null || (i = mu3.c) == 5 || (((ii5) sde.taskContext).b == 0 && i == 2))) {
            mu3.Z = true;
            utf utf = mu3.a;
            if (z) {
                sde = utf.a(sde);
            } else {
                utf.getClass();
                sde sde2 = (sde) utf.b.getAndSet(utf, sde);
                sde = sde2 == null ? null : utf.a(sde2);
            }
        }
        if (sde != null) {
            if (!(((ii5) sde.taskContext).b == 1 ? this.Y.addLast(sde) : this.X.addLast(sde))) {
                throw new RejectedExecutionException(wn6.l(new StringBuilder(), this.o, " was terminated"));
            }
        }
        if (z && mu3 != null) {
            z2 = true;
        }
        if (z3) {
            if (!z2 && !e0() && !U(addAndGet)) {
                e0();
            }
        } else if (!z2 && !e0() && !U(atomicLongFieldUpdater.get(this))) {
            e0();
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ResizableAtomicArray resizableAtomicArray = this.Z;
        int currentLength = resizableAtomicArray.currentLength();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < currentLength; i6++) {
            mu3 mu3 = (mu3) resizableAtomicArray.get(i6);
            if (mu3 != null) {
                utf utf = mu3.a;
                utf.getClass();
                int i7 = utf.b.get(utf) != null ? (utf.c.get(utf) - utf.d.get(utf)) + 1 : utf.c.get(utf) - utf.d.get(utf);
                int t = hr1.t(mu3.c);
                if (t == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i7);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (t == 1) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i7);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (t == 2) {
                    i3++;
                } else if (t == 3) {
                    i4++;
                    if (i7 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i7);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (t == 4) {
                    i5++;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        long j = x0.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.o);
        sb4.append('@');
        sb4.append(a24.F(this));
        sb4.append("[Pool Size {core = ");
        int i8 = this.a;
        sb4.append(i8);
        sb4.append(", max = ");
        th2.l(sb4, this.b, "}, Worker States {CPU = ", i, ", blocking = ");
        th2.l(sb4, i2, ", parked = ", i3, ", dormant = ");
        th2.l(sb4, i4, ", terminated = ", i5, "}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.X.getSize());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.Y.getSize());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i8 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
