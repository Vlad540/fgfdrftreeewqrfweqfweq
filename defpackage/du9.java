package defpackage;

import java.util.concurrent.Callable;

/* renamed from: du9  reason: default package */
public final class du9 extends ms9 implements q3e {
    public final Callable a;

    public du9(m5 m5Var) {
        this.a = m5Var;
    }

    public final Object get() {
        Object call = this.a.call();
        if (call != null) {
            h15 h15 = i15.a;
            return call;
        }
        throw i15.b("The Callable returned a null value.");
    }

    public final void q(bw9 bw9) {
        cd4 cd4 = new cd4(bw9);
        bw9.d(cd4);
        if (!cd4.h()) {
            try {
                Object call = this.a.call();
                if (call != null) {
                    h15 h15 = i15.a;
                    cd4.e(call);
                    return;
                }
                throw i15.b("Callable returned a null value.");
            } catch (Throwable th) {
                ek8.a0(th);
                if (!cd4.h()) {
                    bw9.onError(th);
                } else {
                    xs7.F(th);
                }
            }
        }
    }
}
