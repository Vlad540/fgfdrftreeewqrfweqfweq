package defpackage;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ex7  reason: default package */
public final class ex7 extends AtomicReference implements gx7, xi4, zhd, wx7 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ ex7(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void a(Object obj) {
        xi4 xi4;
        switch (this.a) {
            case 0:
                Object obj2 = get();
                bj4 bj4 = bj4.a;
                if (obj2 != bj4 && (xi4 = (xi4) getAndSet(bj4)) != bj4) {
                    wx7 wx7 = (wx7) this.b;
                    if (obj == null) {
                        try {
                            wx7.onError(i15.b("onSuccess called with a null value."));
                        } finally {
                            if (xi4 != null) {
                                xi4.f();
                            }
                        }
                    } else {
                        wx7.a(obj);
                    }
                    if (xi4 == null) {
                        return;
                    }
                    return;
                }
                return;
            case 1:
                try {
                    lazySet(bj4.a);
                    ((lk0) this.b).accept(obj, (Object) null);
                    return;
                } catch (Throwable th) {
                    ek8.a0(th);
                    xs7.F(th);
                    return;
                }
            default:
                zt9 zt9 = (zt9) this.b;
                zt9.o.c(this);
                if (zt9.get() == 0) {
                    boolean z = false;
                    if (zt9.compareAndSet(0, 1)) {
                        zt9.b.c(obj);
                        if (zt9.X.decrementAndGet() == 0) {
                            z = true;
                        }
                        knd knd = (knd) zt9.w0.get();
                        if (!z || (knd != null && !knd.isEmpty())) {
                            if (zt9.decrementAndGet() == 0) {
                                return;
                            }
                            zt9.a();
                            return;
                        }
                        zt9.Y.d(zt9.b);
                        return;
                    }
                }
                AtomicReference atomicReference = zt9.w0;
                knd knd2 = (knd) atomicReference.get();
                if (knd2 == null) {
                    knd knd3 = new knd(an5.a);
                    while (true) {
                        if (atomicReference.compareAndSet((Object) null, knd3)) {
                            knd2 = knd3;
                        } else if (atomicReference.get() != null) {
                            knd2 = (knd) atomicReference.get();
                        }
                    }
                }
                synchronized (knd2) {
                    knd2.offer(obj);
                }
                zt9.X.decrementAndGet();
                if (zt9.getAndIncrement() != 0) {
                    return;
                }
                zt9.a();
                return;
        }
    }

    public void b() {
        xi4 xi4;
        switch (this.a) {
            case 0:
                Object obj = get();
                bj4 bj4 = bj4.a;
                if (obj != bj4 && (xi4 = (xi4) getAndSet(bj4)) != bj4) {
                    try {
                        ((wx7) this.b).b();
                        if (xi4 == null) {
                            return;
                        }
                        return;
                    } finally {
                        if (xi4 != null) {
                            xi4.f();
                        }
                    }
                } else {
                    return;
                }
            default:
                zt9 zt9 = (zt9) this.b;
                zt9.o.c(this);
                int i = zt9.get();
                AtomicInteger atomicInteger = zt9.X;
                if (i == 0) {
                    boolean z = false;
                    if (zt9.compareAndSet(0, 1)) {
                        if (atomicInteger.decrementAndGet() == 0) {
                            z = true;
                        }
                        knd knd = (knd) zt9.w0.get();
                        if (z && (knd == null || knd.isEmpty())) {
                            zt9.Y.d(zt9.b);
                            return;
                        } else if (zt9.decrementAndGet() != 0) {
                            zt9.a();
                            return;
                        } else {
                            return;
                        }
                    }
                }
                atomicInteger.decrementAndGet();
                if (zt9.getAndIncrement() == 0) {
                    zt9.a();
                    return;
                }
                return;
        }
    }

    public void d(xi4 xi4) {
        switch (this.a) {
            case 1:
                bj4.e(this, xi4);
                return;
            default:
                bj4.e(this, xi4);
                return;
        }
    }

    public final void f() {
        switch (this.a) {
            case 0:
                bj4.a(this);
                return;
            case 1:
                bj4.a(this);
                return;
            default:
                bj4.a(this);
                return;
        }
    }

    public final boolean h() {
        switch (this.a) {
            case 0:
                return bj4.b((xi4) get());
            case 1:
                return get() == bj4.a;
            default:
                return bj4.b((xi4) get());
        }
    }

    public final void onError(Throwable th) {
        xi4 xi4;
        switch (this.a) {
            case 0:
                Throwable b2 = th == null ? i15.b("onError called with a null Throwable.") : th;
                Object obj = get();
                bj4 bj4 = bj4.a;
                if (obj == bj4 || (xi4 = (xi4) getAndSet(bj4)) == bj4) {
                    xs7.F(th);
                    return;
                }
                try {
                    ((wx7) this.b).onError(b2);
                    if (xi4 == null) {
                        return;
                    }
                    return;
                } finally {
                    if (xi4 != null) {
                        xi4.f();
                    }
                }
            case 1:
                try {
                    lazySet(bj4.a);
                    ((lk0) this.b).accept((Object) null, th);
                    return;
                } catch (Throwable th2) {
                    ek8.a0(th2);
                    xs7.F(new CompositeException(th, th2));
                    return;
                }
            default:
                zt9 zt9 = (zt9) this.b;
                n83 n83 = zt9.o;
                n83.c(this);
                if (zt9.Y.a(th)) {
                    if (!zt9.c) {
                        zt9.x0.f();
                        n83.f();
                    }
                    zt9.X.decrementAndGet();
                    if (zt9.getAndIncrement() == 0) {
                        zt9.a();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                String simpleName = ex7.class.getSimpleName();
                String atomicReference = super.toString();
                return simpleName + "{" + atomicReference + "}";
            default:
                return super.toString();
        }
    }

    public ex7(zt9 zt9) {
        this.a = 2;
        this.b = zt9;
    }
}
