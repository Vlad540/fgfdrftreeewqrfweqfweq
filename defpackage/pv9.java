package defpackage;

/* renamed from: pv9  reason: default package */
public final class pv9 implements bw9, xi4 {
    public final bw9 a;
    public boolean b;
    public xi4 c;
    public long o;

    public pv9(bw9 bw9, long j) {
        this.a = bw9;
        this.o = j;
    }

    public final void b() {
        if (!this.b) {
            this.b = true;
            this.c.f();
            this.a.b();
        }
    }

    public final void c(Object obj) {
        if (!this.b) {
            long j = this.o;
            long j2 = j - 1;
            this.o = j2;
            if (j > 0) {
                boolean z = j2 == 0;
                this.a.c(obj);
                if (z) {
                    b();
                }
            }
        }
    }

    public final void d(xi4 xi4) {
        if (bj4.g(this.c, xi4)) {
            this.c = xi4;
            int i = (this.o > 0 ? 1 : (this.o == 0 ? 0 : -1));
            bw9 bw9 = this.a;
            if (i == 0) {
                this.b = true;
                xi4.f();
                cw4.a(bw9);
                return;
            }
            bw9.d(this);
        }
    }

    public final void f() {
        this.c.f();
    }

    public final boolean h() {
        return this.c.h();
    }

    public final void onError(Throwable th) {
        if (this.b) {
            xs7.F(th);
            return;
        }
        this.b = true;
        this.c.f();
        this.a.onError(th);
    }
}
