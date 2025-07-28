package defpackage;

import java.util.LinkedHashSet;
import java.util.Objects;

/* renamed from: o7e  reason: default package */
public final /* synthetic */ class o7e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p7e b;
    public final /* synthetic */ p7e c;

    public /* synthetic */ o7e(p7e p7e, p7e p7e2, int i) {
        this.a = i;
        this.b = p7e;
        this.c = p7e2;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                p7e p7e = this.b;
                Objects.requireNonNull(p7e.e);
                p7e.e.g(this.c);
                return;
            default:
                p7e p7e2 = this.b;
                p7e p7e3 = this.c;
                s30 s30 = p7e2.b;
                synchronized (s30.b) {
                    ((LinkedHashSet) s30.c).remove(p7e2);
                    ((LinkedHashSet) s30.o).remove(p7e2);
                }
                p7e2.g(p7e3);
                if (p7e2.f != null) {
                    Objects.requireNonNull(p7e2.e);
                    p7e2.e.c(p7e3);
                    return;
                }
                p7e2.toString();
                return;
        }
    }
}
