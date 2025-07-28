package defpackage;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: tv9  reason: default package */
public final class tv9 extends AtomicInteger implements bw9, xi4, Runnable {
    public volatile boolean A0;
    public boolean B0;
    public final boolean X;
    public final AtomicReference Y;
    public final of3 Z;
    public final bw9 a;
    public final long b = 3;
    public final TimeUnit c;
    public final omc o;
    public xi4 w0;
    public volatile boolean x0;
    public Throwable y0;
    public volatile boolean z0;

    public tv9(bw9 bw9, TimeUnit timeUnit, omc omc) {
        this.a = bw9;
        this.c = timeUnit;
        this.o = omc;
        this.X = false;
        this.Y = new AtomicReference();
        this.Z = null;
    }

    public final void a() {
        if (getAndIncrement() == 0) {
            AtomicReference atomicReference = this.Y;
            bw9 bw9 = this.a;
            int i = 1;
            while (!this.z0) {
                boolean z = this.x0;
                Throwable th = this.y0;
                if (!z || th == null) {
                    boolean z2 = atomicReference.get() == null;
                    if (z) {
                        if (!z2) {
                            Object andSet = atomicReference.getAndSet((Object) null);
                            if (this.X) {
                                bw9.c(andSet);
                            } else {
                                of3 of3 = this.Z;
                                if (of3 != null) {
                                    try {
                                        of3.accept(andSet);
                                    } catch (Throwable th2) {
                                        ek8.a0(th2);
                                        bw9.onError(th2);
                                        this.o.f();
                                        return;
                                    }
                                }
                            }
                        }
                        bw9.b();
                        this.o.f();
                        return;
                    }
                    if (z2) {
                        if (this.A0) {
                            this.B0 = false;
                            this.A0 = false;
                        }
                    } else if (!this.B0 || this.A0) {
                        bw9.c(atomicReference.getAndSet((Object) null));
                        this.A0 = false;
                        this.B0 = true;
                        this.o.c(this, this.b, this.c);
                    }
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    if (this.Z != null) {
                        Object andSet2 = atomicReference.getAndSet((Object) null);
                        if (andSet2 != null) {
                            try {
                                this.Z.accept(andSet2);
                            } catch (Throwable th3) {
                                ek8.a0(th3);
                                th = new CompositeException(th, th3);
                            }
                        }
                    } else {
                        atomicReference.lazySet((Object) null);
                    }
                    bw9.onError(th);
                    this.o.f();
                    return;
                }
            }
            AtomicReference atomicReference2 = this.Y;
            of3 of32 = this.Z;
            if (of32 != null) {
                Object andSet3 = atomicReference2.getAndSet((Object) null);
                if (andSet3 != null) {
                    try {
                        of32.accept(andSet3);
                    } catch (Throwable th4) {
                        ek8.a0(th4);
                        xs7.F(th4);
                    }
                }
            } else {
                atomicReference2.lazySet((Object) null);
            }
        }
    }

    public final void b() {
        this.x0 = true;
        a();
    }

    public final void c(Object obj) {
        Object andSet = this.Y.getAndSet(obj);
        of3 of3 = this.Z;
        if (!(of3 == null || andSet == null)) {
            try {
                of3.accept(andSet);
            } catch (Throwable th) {
                ek8.a0(th);
                this.w0.f();
                this.y0 = th;
                this.x0 = true;
            }
        }
        a();
    }

    public final void d(xi4 xi4) {
        if (bj4.g(this.w0, xi4)) {
            this.w0 = xi4;
            this.a.d(this);
        }
    }

    public final void f() {
        this.z0 = true;
        this.w0.f();
        this.o.f();
        if (getAndIncrement() == 0) {
            AtomicReference atomicReference = this.Y;
            of3 of3 = this.Z;
            if (of3 != null) {
                Object andSet = atomicReference.getAndSet((Object) null);
                if (andSet != null) {
                    try {
                        of3.accept(andSet);
                    } catch (Throwable th) {
                        ek8.a0(th);
                        xs7.F(th);
                    }
                }
            } else {
                atomicReference.lazySet((Object) null);
            }
        }
    }

    public final boolean h() {
        return this.z0;
    }

    public final void onError(Throwable th) {
        this.y0 = th;
        this.x0 = true;
        a();
    }

    public final void run() {
        this.A0 = true;
        a();
    }
}
