package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: rx7  reason: default package */
public final class rx7 extends rj0 implements wx7 {
    public final ey X = new AtomicReference();
    public final int Y;
    public volatile boolean Z;
    public final b1e a;
    public final n83 b = new Object();
    public final AtomicLong c = new AtomicLong();
    public final tx7 o;
    public boolean w0;
    public long x0;

    /* JADX WARNING: type inference failed for: r1v1, types: [n83, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v3, types: [ey, java.util.concurrent.atomic.AtomicReference] */
    public rx7(b1e b1e, int i, tx7 tx7) {
        this.a = b1e;
        this.Y = i;
        this.o = tx7;
    }

    public final void a(Object obj) {
        this.o.offer(obj);
        f();
    }

    public final void b() {
        this.o.offer(ap9.a);
        f();
    }

    public final void cancel() {
        if (!this.Z) {
            this.Z = true;
            this.b.f();
            if (getAndIncrement() == 0) {
                this.o.clear();
            }
        }
    }

    public final void clear() {
        this.o.clear();
    }

    public final void d(xi4 xi4) {
        this.b.a(xi4);
    }

    public final void f() {
        int i;
        ap9 ap9;
        if (getAndIncrement() == 0) {
            int i2 = 1;
            if (this.w0) {
                b1e b1e = this.a;
                tx7 tx7 = this.o;
                int i3 = 1;
                while (!this.Z) {
                    Throwable th = (Throwable) this.X.get();
                    if (th != null) {
                        tx7.clear();
                        b1e.onError(th);
                        return;
                    }
                    boolean z = tx7.g() == this.Y;
                    if (!tx7.isEmpty()) {
                        b1e.c((Object) null);
                    }
                    if (z) {
                        b1e.b();
                        return;
                    }
                    i3 = addAndGet(-i3);
                    if (i3 == 0) {
                        return;
                    }
                }
                tx7.clear();
                return;
            }
            b1e b1e2 = this.a;
            tx7 tx72 = this.o;
            long j = this.x0;
            do {
                long j2 = this.c.get();
                while (true) {
                    i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
                    ap9 = ap9.a;
                    if (i == 0) {
                        break;
                    } else if (this.Z) {
                        tx72.clear();
                        return;
                    } else if (((Throwable) this.X.get()) != null) {
                        tx72.clear();
                        this.X.e(this.a);
                        return;
                    } else if (tx72.j() == this.Y) {
                        b1e2.b();
                        return;
                    } else {
                        Object poll = tx72.poll();
                        if (poll == null) {
                            break;
                        } else if (poll != ap9) {
                            b1e2.c(poll);
                            j++;
                        }
                    }
                }
                if (i == 0) {
                    if (((Throwable) this.X.get()) != null) {
                        tx72.clear();
                        this.X.e(this.a);
                        return;
                    }
                    while (tx72.peek() == ap9) {
                        tx72.m();
                    }
                    if (tx72.j() == this.Y) {
                        b1e2.b();
                        return;
                    }
                }
                this.x0 = j;
                i2 = addAndGet(-i2);
            } while (i2 != 0);
        }
    }

    public final void i(long j) {
        if (f1e.d(j)) {
            z3d.b(this.c, j);
            f();
        }
    }

    public final boolean isEmpty() {
        return this.o.isEmpty();
    }

    public final void onError(Throwable th) {
        if (this.X.a(th)) {
            this.b.f();
            this.o.offer(ap9.a);
            f();
        }
    }

    public final Object poll() {
        Object poll;
        do {
            poll = this.o.poll();
        } while (poll == ap9.a);
        return poll;
    }

    public final int q(int i) {
        this.w0 = true;
        return 2;
    }
}
