package defpackage;

import android.util.Pair;

/* renamed from: qie  reason: default package */
public final class qie extends rd4 {
    public final /* synthetic */ rie c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qie(rie rie, ah0 ah0) {
        super(ah0);
        this.c = rie;
    }

    public final void d() {
        this.b.c();
        m();
    }

    public final void f(Throwable th) {
        this.b.e(th);
        m();
    }

    public final void h(int i, Object obj) {
        this.b.g(i, obj);
        if (ah0.a(i)) {
            m();
        }
    }

    public final void m() {
        Pair pair;
        synchronized (this.c) {
            try {
                pair = (Pair) this.c.c.poll();
                if (pair == null) {
                    rie rie = this.c;
                    rie.b--;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (pair != null) {
            this.c.d.execute(new p36((Object) this, (Object) pair, false, 26));
        }
    }
}
