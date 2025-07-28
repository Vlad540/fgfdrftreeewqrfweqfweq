package defpackage;

/* renamed from: l3  reason: default package */
public final class l3 extends gwf {
    public final void G(m3 m3Var, m3 m3Var2) {
        m3Var.b = m3Var2;
    }

    public final void H(m3 m3Var, Thread thread) {
        m3Var.a = thread;
    }

    public final boolean d(n3 n3Var, j3 j3Var, j3 j3Var2) {
        synchronized (n3Var) {
            try {
                if (n3Var.b != j3Var) {
                    return false;
                }
                n3Var.b = j3Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean e(n3 n3Var, Object obj, Object obj2) {
        synchronized (n3Var) {
            try {
                if (n3Var.a != obj) {
                    return false;
                }
                n3Var.a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean f(n3 n3Var, m3 m3Var, m3 m3Var2) {
        synchronized (n3Var) {
            try {
                if (n3Var.c != m3Var) {
                    return false;
                }
                n3Var.c = m3Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
