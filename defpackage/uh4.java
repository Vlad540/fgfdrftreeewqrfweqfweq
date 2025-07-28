package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: uh4  reason: default package */
public final class uh4 extends ki0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uh4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void a() {
        switch (this.a) {
            case 0:
                ((AtomicBoolean) this.b).set(true);
                return;
            default:
                l1b l1b = (l1b) this.b;
                if (l1b.n()) {
                    l1b.b.c();
                    return;
                }
                return;
        }
    }
}
