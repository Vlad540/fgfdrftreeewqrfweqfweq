package defpackage;

import java.util.Objects;
import java.util.concurrent.Callable;

/* renamed from: mv9  reason: default package */
public final class mv9 extends dhd {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ mv9(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void l(zhd zhd) {
        switch (this.a) {
            case 0:
                ((nv9) this.b).a(new qs9(zhd));
                return;
            case 1:
                ihd ihd = new ihd(zhd);
                zhd.d(ihd);
                try {
                    ((bid) this.b).j(ihd);
                    return;
                } catch (Throwable th) {
                    ek8.a0(th);
                    ihd.onError(th);
                    return;
                }
            case 2:
                a7 a7Var = new a7(1, z3d.h);
                zhd.d(a7Var);
                if (!a7Var.h()) {
                    try {
                        Object call = ((Callable) this.b).call();
                        Objects.requireNonNull(call, "The callable returned a null value");
                        if (!a7Var.h()) {
                            zhd.a(call);
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        ek8.a0(th2);
                        if (!a7Var.h()) {
                            zhd.onError(th2);
                            return;
                        } else {
                            xs7.F(th2);
                            return;
                        }
                    }
                } else {
                    return;
                }
            default:
                zhd.d(cw4.a);
                zhd.a(this.b);
                return;
        }
    }
}
