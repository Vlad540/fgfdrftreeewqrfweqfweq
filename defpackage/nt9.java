package defpackage;

import java.util.NoSuchElementException;

/* renamed from: nt9  reason: default package */
public final class nt9 implements bw9, xi4 {
    public boolean X;
    public final Object Y;
    public final /* synthetic */ int a;
    public final long b;
    public xi4 c;
    public long o;

    public /* synthetic */ nt9(Object obj, long j, int i) {
        this.a = i;
        this.Y = obj;
        this.b = j;
    }

    public final void b() {
        switch (this.a) {
            case 0:
                if (!this.X) {
                    this.X = true;
                    ((wx7) this.Y).b();
                    return;
                }
                return;
            default:
                if (!this.X) {
                    this.X = true;
                    ((zhd) this.Y).onError(new NoSuchElementException());
                    return;
                }
                return;
        }
    }

    public final void c(Object obj) {
        switch (this.a) {
            case 0:
                if (!this.X) {
                    long j = this.o;
                    if (j == this.b) {
                        this.X = true;
                        this.c.f();
                        ((wx7) this.Y).a(obj);
                        return;
                    }
                    this.o = j + 1;
                    return;
                }
                return;
            default:
                if (!this.X) {
                    long j2 = this.o;
                    if (j2 == this.b) {
                        this.X = true;
                        this.c.f();
                        ((zhd) this.Y).a(obj);
                        return;
                    }
                    this.o = j2 + 1;
                    return;
                }
                return;
        }
    }

    public final void d(xi4 xi4) {
        switch (this.a) {
            case 0:
                if (bj4.g(this.c, xi4)) {
                    this.c = xi4;
                    ((wx7) this.Y).d(this);
                    return;
                }
                return;
            default:
                if (bj4.g(this.c, xi4)) {
                    this.c = xi4;
                    ((zhd) this.Y).d(this);
                    return;
                }
                return;
        }
    }

    public final void f() {
        switch (this.a) {
            case 0:
                this.c.f();
                return;
            default:
                this.c.f();
                return;
        }
    }

    public final boolean h() {
        switch (this.a) {
            case 0:
                return this.c.h();
            default:
                return this.c.h();
        }
    }

    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                if (this.X) {
                    xs7.F(th);
                    return;
                }
                this.X = true;
                ((wx7) this.Y).onError(th);
                return;
            default:
                if (this.X) {
                    xs7.F(th);
                    return;
                }
                this.X = true;
                ((zhd) this.Y).onError(th);
                return;
        }
    }
}
