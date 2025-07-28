package defpackage;

/* renamed from: hu9  reason: default package */
public final class hu9 implements bw9, xi4 {
    public final /* synthetic */ int a;
    public xi4 b;
    public final Object c;

    public /* synthetic */ hu9(int i, Object obj) {
        this.a = i;
        this.c = obj;
    }

    private final void a(Object obj) {
    }

    private final void e(Object obj) {
    }

    public final void b() {
        switch (this.a) {
            case 0:
                ((bw9) this.c).b();
                return;
            default:
                ((g73) this.c).b();
                return;
        }
    }

    public final void c(Object obj) {
        int i = this.a;
    }

    public final void d(xi4 xi4) {
        switch (this.a) {
            case 0:
                this.b = xi4;
                ((bw9) this.c).d(this);
                return;
            default:
                this.b = xi4;
                ((g73) this.c).d(this);
                return;
        }
    }

    public final void f() {
        switch (this.a) {
            case 0:
                this.b.f();
                return;
            default:
                this.b.f();
                return;
        }
    }

    public final boolean h() {
        switch (this.a) {
            case 0:
                return this.b.h();
            default:
                return this.b.h();
        }
    }

    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                ((bw9) this.c).onError(th);
                return;
            default:
                ((g73) this.c).onError(th);
                return;
        }
    }
}
