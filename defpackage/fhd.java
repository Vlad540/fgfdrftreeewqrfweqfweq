package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: fhd  reason: default package */
public final class fhd extends AtomicBoolean implements xi4 {
    public final zhd a;
    public final ghd b;

    public fhd(zhd zhd, ghd ghd) {
        this.a = zhd;
        this.b = ghd;
    }

    public final void f() {
        if (compareAndSet(false, true)) {
            this.b.o(this);
        }
    }

    public final boolean h() {
        return get();
    }
}
