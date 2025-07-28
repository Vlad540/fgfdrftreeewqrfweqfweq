package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ye5  reason: default package */
public final class ye5 {
    public static final long[] h = {1, 2, 5, 10, 16};
    public final dy a;
    public final e3 b;
    public final we5 c;
    public final AtomicReference d = new AtomicReference((Object) null);
    public final Object e = new Object();
    public ju3 f;
    public final t97 g = ez3.O(2, new gz3(10, this));

    public ye5(dy dyVar, e3 e3Var, we5 we5) {
        this.a = dyVar;
        this.b = e3Var;
        this.c = we5;
    }

    public final void a(jc9 jc9) {
        ju3 ju3;
        synchronized (this.e) {
            try {
                e3 e3Var = this.b;
                if (e3Var != null) {
                    e3Var.e("schedule update");
                }
                this.d.set(jc9);
                if (this.f == null) {
                    try {
                        ju3 = this.c.a().limitedParallelism(1, "file-prefs");
                    } catch (Throwable unused) {
                        ju3 = null;
                    }
                    this.f = ju3;
                }
                ju3 ju32 = this.f;
                if (ju32 != null) {
                    ju32.dispatch(bw4.a, (xe5) this.g.getValue());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
