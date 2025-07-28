package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: z1d  reason: default package */
public final class z1d implements a2d {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final a2d b;

    public z1d(a2d a2d) {
        this.b = a2d;
    }

    public final void a(c2d c2d) {
        if (!this.a.get()) {
            this.b.a(c2d);
        }
    }

    public final void b() {
        this.a.set(true);
    }
}
