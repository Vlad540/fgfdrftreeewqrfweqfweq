package defpackage;

/* renamed from: mu9  reason: default package */
public final class mu9 extends qj0 implements bw9, Runnable {
    public xgd X;
    public xi4 Y;
    public Throwable Z;
    public final bw9 a;
    public final omc b;
    public final boolean c = false;
    public final int o;
    public volatile boolean w0;
    public volatile boolean x0;
    public int y0;
    public boolean z0;

    public mu9(bw9 bw9, omc omc, int i) {
        this.a = bw9;
        this.b = omc;
        this.o = i;
    }

    public final void b() {
        if (!this.w0) {
            this.w0 = true;
            if (getAndIncrement() == 0) {
                this.b.b(this);
            }
        }
    }

    public final void c(Object obj) {
        if (!this.w0) {
            if (this.y0 != 2) {
                this.X.offer(obj);
            }
            if (getAndIncrement() == 0) {
                this.b.b(this);
            }
        }
    }

    public final void clear() {
        this.X.clear();
    }

    public final void d(xi4 xi4) {
        if (bj4.g(this.Y, xi4)) {
            this.Y = xi4;
            if (xi4 instanceof xjb) {
                xjb xjb = (xjb) xi4;
                int q = xjb.q(7);
                if (q == 1) {
                    this.y0 = q;
                    this.X = xjb;
                    this.w0 = true;
                    this.a.d(this);
                    if (getAndIncrement() == 0) {
                        this.b.b(this);
                        return;
                    }
                    return;
                } else if (q == 2) {
                    this.y0 = q;
                    this.X = xjb;
                    this.a.d(this);
                    return;
                }
            }
            this.X = new knd(this.o);
            this.a.d(this);
        }
    }

    public final boolean e(boolean z, boolean z2, bw9 bw9) {
        if (this.x0) {
            this.X.clear();
            return true;
        } else if (!z) {
            return false;
        } else {
            Throwable th = this.Z;
            if (this.c) {
                if (!z2) {
                    return false;
                }
                this.x0 = true;
                if (th != null) {
                    bw9.onError(th);
                } else {
                    bw9.b();
                }
                this.b.f();
                return true;
            } else if (th != null) {
                this.x0 = true;
                this.X.clear();
                bw9.onError(th);
                this.b.f();
                return true;
            } else if (!z2) {
                return false;
            } else {
                this.x0 = true;
                bw9.b();
                this.b.f();
                return true;
            }
        }
    }

    public final void f() {
        if (!this.x0) {
            this.x0 = true;
            this.Y.f();
            this.b.f();
            if (!this.z0 && getAndIncrement() == 0) {
                this.X.clear();
            }
        }
    }

    public final boolean h() {
        return this.x0;
    }

    public final boolean isEmpty() {
        return this.X.isEmpty();
    }

    public final void onError(Throwable th) {
        if (this.w0) {
            xs7.F(th);
            return;
        }
        this.Z = th;
        this.w0 = true;
        if (getAndIncrement() == 0) {
            this.b.b(this);
        }
    }

    public final Object poll() {
        return this.X.poll();
    }

    public final int q(int i) {
        this.z0 = true;
        return 2;
    }

    public final void run() {
        if (this.z0) {
            int i = 1;
            while (!this.x0) {
                boolean z = this.w0;
                Throwable th = this.Z;
                if (this.c || !z || th == null) {
                    this.a.c((Object) null);
                    if (z) {
                        this.x0 = true;
                        Throwable th2 = this.Z;
                        if (th2 != null) {
                            this.a.onError(th2);
                        } else {
                            this.a.b();
                        }
                        this.b.f();
                        return;
                    }
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    this.x0 = true;
                    this.a.onError(this.Z);
                    this.b.f();
                    return;
                }
            }
            return;
        }
        xgd xgd = this.X;
        bw9 bw9 = this.a;
        int i2 = 1;
        while (!e(this.w0, xgd.isEmpty(), bw9)) {
            while (true) {
                boolean z2 = this.w0;
                try {
                    Object poll = xgd.poll();
                    boolean z3 = poll == null;
                    if (!e(z2, z3, bw9)) {
                        if (z3) {
                            i2 = addAndGet(-i2);
                            if (i2 == 0) {
                                return;
                            }
                        } else {
                            bw9.c(poll);
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th3) {
                    ek8.a0(th3);
                    this.x0 = true;
                    this.Y.f();
                    xgd.clear();
                    bw9.onError(th3);
                    this.b.f();
                    return;
                }
            }
        }
    }
}
