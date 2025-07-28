package defpackage;

import java.util.concurrent.Executor;

/* renamed from: rt1  reason: default package */
public final class rt1 implements rf3 {
    public final /* synthetic */ Executor a;
    public final /* synthetic */ rf3 b;
    public final /* synthetic */ st1 c;

    public rt1(st1 st1, Executor executor, jv1 jv1) {
        this.c = st1;
        this.a = executor;
        this.b = jv1;
    }

    public final void accept(Object obj) {
        f8f f8f = (f8f) obj;
        if (f8f instanceof a8f) {
            if (!gt0.C()) {
                this.a.execute(new ds1(1, this));
            } else {
                st1 st1 = this.c;
                a6c a6c = (a6c) st1.h.remove(this);
                if (a6c != null && st1.g == a6c) {
                    st1.g = null;
                }
            }
        }
        this.b.accept(f8f);
    }
}
