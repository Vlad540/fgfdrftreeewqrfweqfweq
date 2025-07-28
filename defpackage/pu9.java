package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: pu9  reason: default package */
public final class pu9 extends AtomicReference implements xi4 {
    public final bw9 a;

    public pu9(bw9 bw9, qu9 qu9) {
        this.a = bw9;
        lazySet(qu9);
    }

    public final void f() {
        qu9 qu9 = (qu9) getAndSet((Object) null);
        if (qu9 != null) {
            qu9.a(this);
        }
    }

    public final boolean h() {
        return get() == null;
    }
}
