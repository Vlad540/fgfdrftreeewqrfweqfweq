package defpackage;

import java.util.NoSuchElementException;

/* renamed from: lt9  reason: default package */
public final class lt9 implements bw9, xi4 {
    public xi4 X;
    public long Y;
    public boolean Z;
    public final bw9 a;
    public final long b;
    public final Object c;
    public final boolean o;

    public lt9(bw9 bw9, long j, Object obj, boolean z) {
        this.a = bw9;
        this.b = j;
        this.c = obj;
        this.o = z;
    }

    public final void b() {
        if (!this.Z) {
            this.Z = true;
            bw9 bw9 = this.a;
            Object obj = this.c;
            if (obj != null || !this.o) {
                if (obj != null) {
                    bw9.c(obj);
                }
                bw9.b();
                return;
            }
            bw9.onError(new NoSuchElementException());
        }
    }

    public final void c(Object obj) {
        if (!this.Z) {
            long j = this.Y;
            if (j == this.b) {
                this.Z = true;
                this.X.f();
                bw9 bw9 = this.a;
                bw9.c(obj);
                bw9.b();
                return;
            }
            this.Y = j + 1;
        }
    }

    public final void d(xi4 xi4) {
        if (bj4.g(this.X, xi4)) {
            this.X = xi4;
            this.a.d(this);
        }
    }

    public final void f() {
        this.X.f();
    }

    public final boolean h() {
        return this.X.h();
    }

    public final void onError(Throwable th) {
        if (this.Z) {
            xs7.F(th);
            return;
        }
        this.Z = true;
        this.a.onError(th);
    }
}
