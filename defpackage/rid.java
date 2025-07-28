package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: rid  reason: default package */
public final class rid extends AtomicReference implements xi4 {
    public final zhd a;

    public rid(zhd zhd, sid sid) {
        this.a = zhd;
        lazySet(sid);
    }

    public final void f() {
        sid sid = (sid) getAndSet((Object) null);
        if (sid != null) {
            sid.o(this);
        }
    }

    public final boolean h() {
        return get() == null;
    }
}
