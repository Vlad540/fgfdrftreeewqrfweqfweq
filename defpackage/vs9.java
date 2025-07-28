package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: vs9  reason: default package */
public final class vs9 extends AtomicReference implements bw9 {
    public final /* synthetic */ int a;
    public final bw9 b;
    public final AtomicInteger c;

    public /* synthetic */ vs9(bw9 bw9, AtomicInteger atomicInteger, int i) {
        this.a = i;
        this.b = bw9;
        this.c = atomicInteger;
    }

    public final void b() {
        switch (this.a) {
            case 0:
                ws9 ws9 = (ws9) this.c;
                ws9.x0 = false;
                ws9.a();
                return;
            default:
                xs9 xs9 = (xs9) this.c;
                xs9.Z = false;
                xs9.a();
                return;
        }
    }

    public final void c(Object obj) {
        switch (this.a) {
            case 0:
                this.b.c(obj);
                return;
            default:
                this.b.c(obj);
                return;
        }
    }

    public final void d(xi4 xi4) {
        switch (this.a) {
            case 0:
                bj4.c(this, xi4);
                return;
            default:
                bj4.c(this, xi4);
                return;
        }
    }

    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                ws9 ws9 = (ws9) this.c;
                if (ws9.o.a(th)) {
                    if (!ws9.Y) {
                        ws9.w0.f();
                    }
                    ws9.x0 = false;
                    ws9.a();
                    return;
                }
                return;
            default:
                ((xs9) this.c).f();
                this.b.onError(th);
                return;
        }
    }
}
