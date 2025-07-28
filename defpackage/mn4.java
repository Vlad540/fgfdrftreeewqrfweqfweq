package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;

/* renamed from: mn4  reason: default package */
public class mn4 implements hdf {
    public gn4 X = null;
    public final kn4 Y;
    public boolean a = false;
    public boolean b = false;
    public boolean c = true;
    public ln4 o;

    public mn4(y66 y66) {
        this.Y = kn4.c ? new kn4() : kn4.b;
        if (y66 != null) {
            j(y66);
        }
    }

    public final void a(boolean z) {
        if (this.c != z) {
            this.Y.a(z ? jn4.F0 : jn4.G0);
            this.c = z;
            c();
        }
    }

    public final void b() {
        if (!this.a) {
            jn4 jn4 = jn4.Z;
            this.Y.a(jn4);
            this.a = true;
            gn4 gn4 = this.X;
            if (gn4 != null) {
                k0 k0Var = (k0) gn4;
                if (k0Var.h != null) {
                    n06.s();
                    if (m75.a.i(2)) {
                        m75.f(k0.x, "controller %x %s: onAttach: %s", Integer.valueOf(System.identityHashCode(k0Var)), k0Var.j, k0Var.m ? "request already submitted" : "request needs submit");
                    }
                    k0Var.a.a(jn4);
                    k0Var.h.getClass();
                    k0Var.b.b(k0Var);
                    k0Var.l = true;
                    if (!k0Var.m) {
                        k0Var.r();
                    }
                    n06.s();
                }
            }
        }
    }

    public final void c() {
        if (!this.b || !this.c) {
            d();
        } else {
            b();
        }
    }

    public final void d() {
        if (this.a) {
            kn4 kn4 = this.Y;
            jn4 jn4 = jn4.w0;
            kn4.a(jn4);
            boolean z = false;
            this.a = false;
            if (f()) {
                k0 k0Var = (k0) this.X;
                k0Var.getClass();
                n06.s();
                if (m75.a.i(2)) {
                    m75.e(k0.x, "controller %x %s: onDetach", Integer.valueOf(System.identityHashCode(k0Var)), k0Var.j);
                }
                k0Var.a.a(jn4);
                k0Var.l = false;
                bd4 bd4 = k0Var.b;
                bd4.getClass();
                if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                    synchronized (bd4.b) {
                        try {
                            if (!((ArrayList) bd4.o).contains(k0Var)) {
                                ((ArrayList) bd4.o).add(k0Var);
                                if (((ArrayList) bd4.o).size() == 1) {
                                    z = true;
                                }
                                if (z) {
                                    ((Handler) bd4.c).post((re) bd4.Y);
                                }
                            }
                        } catch (Throwable th) {
                            while (true) {
                                throw th;
                            }
                        }
                    }
                } else {
                    k0Var.n();
                }
                n06.s();
            }
        }
    }

    public final lfc e() {
        ln4 ln4 = this.o;
        if (ln4 == null) {
            return null;
        }
        return ((y66) ln4).d;
    }

    public final boolean f() {
        gn4 gn4 = this.X;
        return gn4 != null && ((k0) gn4).h == this.o;
    }

    public final void g() {
        this.Y.a(jn4.D0);
        this.b = true;
        c();
    }

    public final void h() {
        this.Y.a(jn4.E0);
        this.b = false;
        c();
    }

    public final void i(gn4 gn4) {
        boolean z = this.a;
        if (z) {
            d();
        }
        boolean f = f();
        kn4 kn4 = this.Y;
        if (f) {
            kn4.a(jn4.o);
            ((xwa) this.X).w((ln4) null);
        }
        this.X = gn4;
        if (gn4 != null) {
            kn4.a(jn4.c);
            ((xwa) this.X).w(this.o);
        } else {
            kn4.a(jn4.X);
        }
        if (z) {
            b();
        }
    }

    public final void j(ln4 ln4) {
        this.Y.a(jn4.a);
        boolean f = f();
        lfc e = e();
        if (e instanceof gdf) {
            e.Y = null;
        }
        ln4.getClass();
        this.o = ln4;
        lfc lfc = ((y66) ln4).d;
        a(lfc == null || lfc.isVisible());
        lfc e2 = e();
        if (e2 instanceof gdf) {
            e2.Y = this;
        }
        if (f) {
            ((xwa) this.X).w(ln4);
        }
    }

    public final void onDraw() {
        if (!this.a) {
            m75.j(kn4.class, "%x: Draw requested for a non-attached controller %x. %s", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.X)), toString());
            this.b = true;
            this.c = true;
            c();
        }
    }

    public final String toString() {
        jg8 X2 = at7.X(this);
        X2.g("controllerAttached", this.a);
        X2.g("holderAttached", this.b);
        X2.g("drawableVisible", this.c);
        X2.h(this.Y.a.toString(), "events");
        return X2.toString();
    }
}
