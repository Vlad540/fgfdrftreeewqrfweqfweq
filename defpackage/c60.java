package defpackage;

import java.util.Objects;
import java.util.concurrent.Executor;

/* renamed from: c60  reason: default package */
public final class c60 implements ls9 {
    public final /* synthetic */ tx4 a;
    public final /* synthetic */ d60 b;

    public c60(d60 d60, tx4 tx4) {
        this.b = d60;
        this.a = tx4;
    }

    public final void a(Object obj) {
        gs0 gs0 = (gs0) obj;
        Objects.requireNonNull(gs0);
        d60 d60 = this.b;
        if (d60.l == this.a) {
            Objects.toString(d60.h);
            gs0.toString();
            if (d60.h != gs0) {
                d60.h = gs0;
                d60.d();
            }
        }
    }

    public final void onError(Throwable th) {
        d60 d60 = this.b;
        if (d60.l == this.a) {
            Executor executor = d60.j;
            f2b f2b = d60.k;
            if (executor != null && f2b != null) {
                executor.execute(new c(f2b, 8, th));
            }
        }
    }
}
