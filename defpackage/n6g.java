package defpackage;

import com.google.android.gms.tasks.DuplicateTaskCompletionException;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* renamed from: n6g  reason: default package */
public final class n6g extends Task {
    public final Object a = new Object();
    public final ud b = new ud();
    public boolean c;
    public volatile boolean d;
    public Object e;
    public Exception f;

    public final n6g a(Executor executor, gx9 gx9) {
        this.b.y(new z3g(executor, gx9));
        q();
        return this;
    }

    public final n6g b(Executor executor, hx9 hx9) {
        this.b.y(new z3g(executor, hx9));
        q();
        return this;
    }

    public final n6g c(Executor executor, kx9 kx9) {
        this.b.y(new z3g(executor, kx9));
        q();
        return this;
    }

    public final n6g d(Executor executor, tx9 tx9) {
        this.b.y(new z3g(executor, tx9));
        q();
        return this;
    }

    public final Exception e() {
        Exception exc;
        synchronized (this.a) {
            exc = this.f;
        }
        return exc;
    }

    public final Object f() {
        Object obj;
        synchronized (this.a) {
            try {
                a24.q("Task is not yet complete", this.c);
                if (!this.d) {
                    Exception exc = this.f;
                    if (exc == null) {
                        obj = this.e;
                    } else {
                        throw new RuntimeException(exc);
                    }
                } else {
                    throw new CancellationException("Task is already canceled.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public final boolean g() {
        boolean z;
        synchronized (this.a) {
            z = this.c;
        }
        return z;
    }

    public final boolean h() {
        boolean z;
        synchronized (this.a) {
            try {
                z = false;
                if (this.c && !this.d && this.f == null) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public final n6g i(hx9 hx9) {
        this.b.y(new z3g((Executor) cee.a, hx9));
        q();
        return this;
    }

    public final n6g j(Executor executor, cr3 cr3) {
        n6g n6g = new n6g();
        this.b.y(new i2g(executor, cr3, n6g, 0));
        q();
        return n6g;
    }

    public final n6g k(Executor executor, cr3 cr3) {
        n6g n6g = new n6g();
        this.b.y(new i2g(executor, cr3, n6g, 1));
        q();
        return n6g;
    }

    public final n6g l(Executor executor, y1e y1e) {
        n6g n6g = new n6g();
        this.b.y(new z3g(executor, y1e, n6g));
        q();
        return n6g;
    }

    public final void m(Exception exc) {
        a24.p(exc, "Exception must not be null");
        synchronized (this.a) {
            p();
            this.c = true;
            this.f = exc;
        }
        this.b.z(this);
    }

    public final void n(Object obj) {
        synchronized (this.a) {
            p();
            this.c = true;
            this.e = obj;
        }
        this.b.z(this);
    }

    public final void o() {
        synchronized (this.a) {
            try {
                if (!this.c) {
                    this.c = true;
                    this.d = true;
                    this.b.z(this);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public final void p() {
        IllegalStateException illegalStateException;
        if (this.c) {
            int i = DuplicateTaskCompletionException.a;
            if (g()) {
                Exception e2 = e();
                illegalStateException = new IllegalStateException("Complete with: ".concat(e2 == null ? !h() ? this.d ? "cancellation" : "unknown issue" : "result ".concat(String.valueOf(f())) : "failure"), e2);
            } else {
                illegalStateException = new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            throw illegalStateException;
        }
    }

    public final void q() {
        synchronized (this.a) {
            try {
                if (this.c) {
                    this.b.z(this);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }
}
