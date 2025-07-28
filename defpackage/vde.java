package defpackage;

/* renamed from: vde  reason: default package */
public final class vde {
    public final n6g a = new n6g();

    public final void a(Exception exc) {
        this.a.m(exc);
    }

    public final void b(Object obj) {
        this.a.n(obj);
    }

    public final void c(Exception exc) {
        n6g n6g = this.a;
        n6g.getClass();
        a24.p(exc, "Exception must not be null");
        synchronized (n6g.a) {
            try {
                if (!n6g.c) {
                    n6g.c = true;
                    n6g.f = exc;
                    n6g.b.z(n6g);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public final void d(Object obj) {
        n6g n6g = this.a;
        synchronized (n6g.a) {
            try {
                if (!n6g.c) {
                    n6g.c = true;
                    n6g.e = obj;
                    n6g.b.z(n6g);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }
}
