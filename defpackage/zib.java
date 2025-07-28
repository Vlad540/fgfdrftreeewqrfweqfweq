package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: zib  reason: default package */
public final class zib extends AtomicBoolean implements xi4 {
    public final bw9 a;
    public final ajb b;

    public zib(bw9 bw9, ajb ajb) {
        this.a = bw9;
        this.b = ajb;
    }

    public final void f() {
        if (compareAndSet(false, true)) {
            this.b.z(this);
        }
    }

    public final boolean h() {
        return get();
    }
}
