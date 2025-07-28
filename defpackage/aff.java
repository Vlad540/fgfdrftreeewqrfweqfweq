package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: aff  reason: default package */
public final class aff extends WeakReference implements xi4 {
    public final void f() {
        xi4 xi4 = (xi4) get();
        if (xi4 != null) {
            xi4.f();
        }
    }

    public final boolean h() {
        xi4 xi4 = (xi4) get();
        return xi4 == null || xi4.h();
    }
}
