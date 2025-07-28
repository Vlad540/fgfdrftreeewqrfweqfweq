package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: k73  reason: default package */
public final class k73 extends AtomicReference implements xi4 {
    public final g73 a;

    public k73(g73 g73, l73 l73) {
        this.a = g73;
        lazySet(l73);
    }

    public final void f() {
        l73 l73 = (l73) getAndSet((Object) null);
        if (l73 != null) {
            l73.m(this);
        }
    }

    public final boolean h() {
        return get() == null;
    }
}
