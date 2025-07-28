package defpackage;

import java.util.concurrent.Executor;

/* renamed from: gbc  reason: default package */
public final class gbc implements y4b {
    public final Executor a;
    public final qe4 b;
    public final y4b c;
    public final boolean d;
    public final wr6 e;

    public gbc(Executor executor, qe4 qe4, y4b y4b, boolean z, wr6 wr6) {
        executor.getClass();
        this.a = executor;
        qe4.getClass();
        this.b = qe4;
        this.c = y4b;
        wr6.getClass();
        this.e = wr6;
        this.d = z;
    }

    public final void a(ah0 ah0, z4b z4b) {
        this.c.a(new fbc(this, ah0, z4b, this.d, this.e), z4b);
    }
}
