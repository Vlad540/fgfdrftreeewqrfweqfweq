package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: at9  reason: default package */
public final class at9 extends AtomicReference implements qt9, xi4, zhd {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ at9(AtomicInteger atomicInteger, int i) {
        this.a = i;
        this.b = atomicInteger;
    }

    public void a(Object obj) {
        switch (this.a) {
            case 1:
                on5 on5 = (on5) this.b;
                on5.X.c(this);
                if (on5.get() == 0) {
                    boolean z = false;
                    if (on5.compareAndSet(0, 1)) {
                        if (on5.Y.decrementAndGet() == 0) {
                            z = true;
                        }
                        if (on5.o.get() != 0) {
                            on5.a.c(obj);
                            knd knd = (knd) on5.x0.get();
                            if (!z || (knd != null && !knd.isEmpty())) {
                                z3d.J(on5.o, 1);
                                if (on5.c != Integer.MAX_VALUE) {
                                    on5.y0.i(1);
                                }
                            } else {
                                on5.Z.e(on5.a);
                                return;
                            }
                        } else {
                            knd g = on5.g();
                            synchronized (g) {
                                g.offer(obj);
                            }
                        }
                        if (on5.decrementAndGet() == 0) {
                            return;
                        }
                        on5.f();
                        return;
                    }
                }
                knd g2 = on5.g();
                synchronized (g2) {
                    g2.offer(obj);
                }
                on5.Y.decrementAndGet();
                if (on5.getAndIncrement() != 0) {
                    return;
                }
                on5.f();
                return;
            default:
                zt9 zt9 = (zt9) this.b;
                zt9.o.c(this);
                if (zt9.get() == 0) {
                    boolean z2 = false;
                    if (zt9.compareAndSet(0, 1)) {
                        zt9.b.c(obj);
                        if (zt9.X.decrementAndGet() == 0) {
                            z2 = true;
                        }
                        knd knd2 = (knd) zt9.w0.get();
                        if (!z2 || (knd2 != null && !knd2.isEmpty())) {
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
                knd knd3 = (knd) atomicReference.get();
                if (knd3 == null) {
                    knd knd4 = new knd(an5.a);
                    while (true) {
                        if (atomicReference.compareAndSet((Object) null, knd4)) {
                            knd3 = knd4;
                        } else if (atomicReference.get() != null) {
                            knd3 = (knd) atomicReference.get();
                        }
                    }
                }
                synchronized (knd3) {
                    knd3.offer(obj);
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
        if (!h()) {
            try {
                ((bw9) this.b).b();
            } finally {
                bj4.a(this);
            }
        }
    }

    public void c(Object obj) {
        if (obj == null) {
            NullPointerException b2 = i15.b("onNext called with a null value.");
            if (!e(b2)) {
                xs7.F(b2);
            }
        } else if (!h()) {
            ((bw9) this.b).c(obj);
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

    /* JADX INFO: finally extract failed */
    public boolean e(Throwable th) {
        if (h()) {
            return false;
        }
        try {
            ((bw9) this.b).onError(th);
            bj4.a(this);
            return true;
        } catch (Throwable th2) {
            bj4.a(this);
            throw th2;
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
                return bj4.b((xi4) get());
            default:
                return bj4.b((xi4) get());
        }
    }

    public void onError(Throwable th) {
        switch (this.a) {
            case 1:
                on5 on5 = (on5) this.b;
                n83 n83 = on5.X;
                n83.c(this);
                if (on5.Z.a(th)) {
                    if (!on5.b) {
                        on5.y0.cancel();
                        n83.f();
                    } else if (on5.c != Integer.MAX_VALUE) {
                        on5.y0.i(1);
                    }
                    on5.Y.decrementAndGet();
                    on5.d();
                    return;
                }
                return;
            default:
                zt9 zt9 = (zt9) this.b;
                n83 n832 = zt9.o;
                n832.c(this);
                if (zt9.Y.a(th)) {
                    if (!zt9.c) {
                        zt9.x0.f();
                        n832.f();
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
                String simpleName = at9.class.getSimpleName();
                String atomicReference = super.toString();
                return simpleName + "{" + atomicReference + "}";
            default:
                return super.toString();
        }
    }

    public at9(bw9 bw9) {
        this.a = 0;
        this.b = bw9;
    }
}
