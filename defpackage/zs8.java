package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: zs8  reason: default package */
public final class zs8 {
    public final t97 a;
    public final t97 b;
    public final t97 c;
    public final AtomicBoolean d = new AtomicBoolean();
    public final r7e e;

    public zs8(t97 t97, t97 t972, t97 t973, t97 t974) {
        this.a = t97;
        this.b = t972;
        this.c = t974;
        this.e = new r7e(new xq(20, t973));
    }

    public final void a() {
        udd.q(zs8.class.getName(), "try to restore uploads");
        if (this.d.compareAndSet(false, true)) {
            ((ExecutorService) this.e.getValue()).execute(new eq6(12, this));
        }
    }
}
