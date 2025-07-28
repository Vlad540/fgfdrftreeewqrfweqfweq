package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: eo5  reason: default package */
public final class eo5 extends AtomicInteger implements ko5, d1e {
    public int A0;
    public final int X;
    public final int Y;
    public volatile boolean Z;
    public final b1e a;
    public final mk0 b;
    public final jnd c;
    public final AtomicLong o = new AtomicLong();
    public volatile boolean w0;
    public Throwable x0;
    public d1e y0;
    public Object z0;

    public eo5(b1e b1e, mk0 mk0, Object obj, int i) {
        this.a = b1e;
        this.b = mk0;
        this.z0 = obj;
        this.X = i;
        this.Y = i - (i >> 2);
        jnd jnd = new jnd(i);
        this.c = jnd;
        jnd.offer(obj);
    }

    public final void a() {
        int i;
        int i2;
        Throwable th;
        if (getAndIncrement() == 0) {
            b1e b1e = this.a;
            jnd jnd = this.c;
            int i3 = this.Y;
            int i4 = this.A0;
            int i5 = 1;
            do {
                long j = this.o.get();
                long j2 = 0;
                while (true) {
                    i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
                    if (i == 0) {
                        i2 = i5;
                        break;
                    } else if (this.Z) {
                        jnd.clear();
                        return;
                    } else {
                        boolean z = this.w0;
                        if (!z || (th = this.x0) == null) {
                            AtomicLong atomicLong = jnd.o;
                            i2 = i5;
                            long j3 = atomicLong.get();
                            int i6 = ((int) j3) & jnd.a;
                            Object obj = jnd.get(i6);
                            long j4 = j;
                            if (obj == null) {
                                obj = null;
                            } else {
                                atomicLong.lazySet(j3 + 1);
                                jnd.lazySet(i6, (Object) null);
                            }
                            boolean z2 = obj == null;
                            if (z && z2) {
                                b1e.b();
                                return;
                            } else if (z2) {
                                break;
                            } else {
                                b1e.c(obj);
                                j2++;
                                i4++;
                                if (i4 == i3) {
                                    this.y0.i((long) i3);
                                    i4 = 0;
                                }
                                i5 = i2;
                                j = j4;
                            }
                        } else {
                            jnd.clear();
                            b1e.onError(th);
                            return;
                        }
                    }
                }
                if (i == 0 && this.w0) {
                    Throwable th2 = this.x0;
                    if (th2 != null) {
                        jnd.clear();
                        b1e.onError(th2);
                        return;
                    } else if (jnd.isEmpty()) {
                        b1e.b();
                        return;
                    }
                }
                if (j2 != 0) {
                    z3d.J(this.o, j2);
                }
                this.A0 = i4;
                i5 = addAndGet(-i2);
            } while (i5 != 0);
        }
    }

    public final void b() {
        if (!this.w0) {
            this.w0 = true;
            a();
        }
    }

    public final void c(Object obj) {
        if (!this.w0) {
            try {
                Object apply = this.b.apply(this.z0, obj);
                this.z0 = apply;
                this.c.offer(apply);
                a();
            } catch (Throwable th) {
                ek8.a0(th);
                this.y0.cancel();
                onError(th);
            }
        }
    }

    public final void cancel() {
        this.Z = true;
        this.y0.cancel();
        if (getAndIncrement() == 0) {
            this.c.clear();
        }
    }

    public final void e(d1e d1e) {
        if (f1e.e(this.y0, d1e)) {
            this.y0 = d1e;
            this.a.e(this);
            d1e.i((long) (this.X - 1));
        }
    }

    public final void i(long j) {
        if (f1e.d(j)) {
            z3d.b(this.o, j);
            a();
        }
    }

    public final void onError(Throwable th) {
        if (this.w0) {
            xs7.F(th);
            return;
        }
        this.x0 = th;
        this.w0 = true;
        a();
    }
}
