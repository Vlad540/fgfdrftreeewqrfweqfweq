package defpackage;

import java.util.Objects;
import java.util.concurrent.Executor;

/* renamed from: s4e  reason: default package */
public final class s4e implements r4e {
    public final r4e a;
    public final Executor b;
    public final rf3 c;

    public s4e(k5f k5f) {
        r4e r4e = k5f.e;
        Objects.requireNonNull(r4e);
        this.a = r4e;
        this.b = k5f.d;
        this.c = k5f.f;
    }

    public final void a(y4e y4e) {
        this.b.execute(new sbc(this, 24, y4e));
    }

    public final ch7 b(int i, int i2) {
        return new as6(1, new Exception("Snapshot not supported by external SurfaceProcessor"));
    }

    public final void c(q4e q4e) {
        this.b.execute(new sbc(this, 25, q4e));
    }

    public final void release() {
    }
}
