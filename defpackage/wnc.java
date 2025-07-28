package defpackage;

/* renamed from: wnc  reason: default package */
public final class wnc implements aq6 {
    public final aq6 a;
    public final Object b = new Object();
    public boolean c;
    public cs1 d;

    public wnc(aq6 aq6) {
        this.a = aq6;
    }

    public final void a(long j, cs1 cs1) {
        jue jue;
        synchronized (this.b) {
            this.c = true;
            this.d = cs1;
        }
        aq6 aq6 = this.a;
        if (aq6 != null) {
            aq6.a(j, new cs1(1, this));
            jue = jue.a;
        } else {
            jue = null;
        }
        if (jue == null) {
            c();
        }
    }

    public final void b() {
        aq6 aq6;
        synchronized (this.b) {
            try {
                if (this.c && (aq6 = this.a) != null) {
                    aq6.clear();
                }
                this.c = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        synchronized (this.b) {
            try {
                cs1 cs1 = this.d;
                if (cs1 != null) {
                    cs1.a();
                }
                this.d = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void clear() {
        b();
    }
}
