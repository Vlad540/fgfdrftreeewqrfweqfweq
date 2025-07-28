package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: fn5  reason: default package */
public final class fn5 extends AtomicReference implements zhd, bw9 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ fn5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public void a(Object obj) {
        switch (this.a) {
            case 0:
                gn5 gn5 = (gn5) this.b;
                gn5.D0 = obj;
                gn5.E0 = 2;
                gn5.a();
                return;
            case 1:
                zs9 zs9 = (zs9) this.b;
                zs9.z0 = obj;
                zs9.A0 = 2;
                zs9.a();
                return;
            default:
                ((zhd) this.b).a(obj);
                return;
        }
    }

    public void b() {
        gv9 gv9 = (gv9) this.b;
        bj4.a(gv9.Y);
        if (gv9.getAndIncrement() == 0) {
            gv9.c.d(gv9.a);
        }
    }

    public void c(Object obj) {
        ((gv9) this.b).a();
    }

    public final void d(xi4 xi4) {
        switch (this.a) {
            case 0:
                bj4.c(this, xi4);
                return;
            case 1:
                bj4.c(this, xi4);
                return;
            case 2:
                bj4.e(this, xi4);
                return;
            default:
                bj4.e(this, xi4);
                return;
        }
    }

    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                gn5 gn5 = (gn5) this.b;
                if (gn5.a.a(th)) {
                    if (gn5.c != 3) {
                        gn5.X.cancel();
                    }
                    gn5.E0 = 0;
                    gn5.a();
                    return;
                }
                return;
            case 1:
                zs9 zs9 = (zs9) this.b;
                if (zs9.a.a(th)) {
                    if (zs9.c != 3) {
                        zs9.X.f();
                    }
                    zs9.A0 = 0;
                    zs9.a();
                    return;
                }
                return;
            case 2:
                gv9 gv9 = (gv9) this.b;
                bj4.a(gv9.Y);
                ey eyVar = gv9.c;
                if (eyVar.a(th) && gv9.getAndIncrement() == 0) {
                    eyVar.d(gv9.a);
                    return;
                }
                return;
            default:
                ((zhd) this.b).onError(th);
                return;
        }
    }

    public fn5(gv9 gv9) {
        this.a = 2;
        this.b = gv9;
    }
}
