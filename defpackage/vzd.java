package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: vzd  reason: default package */
public final class vzd extends AtomicInteger implements ko5, d1e {
    public final AtomicBoolean X = new AtomicBoolean();
    public volatile boolean Y;
    public final b1e a;
    public final ey b = new AtomicReference();
    public final AtomicLong c = new AtomicLong();
    public final AtomicReference o = new AtomicReference();

    /* JADX WARNING: type inference failed for: r1v1, types: [ey, java.util.concurrent.atomic.AtomicReference] */
    public vzd(b1e b1e) {
        this.a = b1e;
    }

    public final void b() {
        this.Y = true;
        b1e b1e = this.a;
        ey eyVar = this.b;
        if (getAndIncrement() == 0) {
            eyVar.e(b1e);
        }
    }

    public final void c(Object obj) {
        if (get() == 0 && compareAndSet(0, 1)) {
            b1e b1e = this.a;
            b1e.c(obj);
            if (decrementAndGet() != 0) {
                this.b.e(b1e);
            }
        }
    }

    public final void cancel() {
        if (!this.Y) {
            f1e.a(this.o);
        }
    }

    public final void e(d1e d1e) {
        if (this.X.compareAndSet(false, true)) {
            this.a.e(this);
            AtomicReference atomicReference = this.o;
            AtomicLong atomicLong = this.c;
            if (f1e.c(atomicReference, d1e)) {
                long andSet = atomicLong.getAndSet(0);
                if (andSet != 0) {
                    d1e.i(andSet);
                    return;
                }
                return;
            }
            return;
        }
        d1e.cancel();
        cancel();
        onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
    }

    public final void i(long j) {
        if (j <= 0) {
            cancel();
            onError(new IllegalArgumentException(us8.i(j, "§3.9 violated: positive request amount required but it was ")));
            return;
        }
        f1e.b(this.o, this.c, j);
    }

    public final void onError(Throwable th) {
        this.Y = true;
        b1e b1e = this.a;
        ey eyVar = this.b;
        if (eyVar.a(th) && getAndIncrement() == 0) {
            eyVar.e(b1e);
        }
    }
}
