package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;

/* renamed from: o4e  reason: default package */
public final class o4e {
    public final int a;
    public final Matrix b;
    public final boolean c;
    public final Rect d;
    public final boolean e;
    public final int f;
    public final va0 g;
    public int h;
    public int i;
    public boolean j = false;
    public y4e k;
    public n4e l;
    public final HashSet m = new HashSet();
    public boolean n = false;
    public final ArrayList o = new ArrayList();

    public o4e(int i2, int i3, va0 va0, Matrix matrix, boolean z, Rect rect, int i4, int i5, boolean z2) {
        this.f = i2;
        this.a = i3;
        this.g = va0;
        this.b = matrix;
        this.c = z;
        this.d = rect;
        this.i = i4;
        this.h = i5;
        this.e = z2;
        this.l = new n4e(va0.a, i3);
    }

    public final void a(Runnable runnable) {
        gt0.i();
        b();
        this.m.add(runnable);
    }

    public final void b() {
        e07.p("Edge is already closed.", !this.n);
    }

    public final void c() {
        gt0.i();
        this.l.a();
        this.n = true;
    }

    public final y4e d(hu1 hu1, boolean z) {
        gt0.i();
        b();
        va0 va0 = this.g;
        hu1 hu12 = hu1;
        boolean z2 = z;
        y4e y4e = new y4e(va0.a, hu12, z2, va0.b, va0.c, new k4e(this, 0));
        try {
            cs6 cs6 = y4e.l;
            n4e n4e = this.l;
            Objects.requireNonNull(n4e);
            if (n4e.f(cs6, new l4e(n4e, 0))) {
                ct0.A(n4e.e).c(new wc4((xc4) cs6, 1), pa2.j());
            }
            this.k = y4e;
            f();
            return y4e;
        } catch (DeferrableSurface$SurfaceClosedException e2) {
            throw new AssertionError("Surface is somehow already closed", e2);
        } catch (RuntimeException e3) {
            y4e.d();
            throw e3;
        }
    }

    public final void e() {
        boolean z;
        gt0.i();
        b();
        n4e n4e = this.l;
        n4e.getClass();
        gt0.i();
        if (n4e.p == null) {
            synchronized (n4e.a) {
                z = n4e.c;
            }
            if (!z) {
                return;
            }
        }
        this.j = false;
        this.l.a();
        this.l = new n4e(this.g.a, this.a);
        Iterator it = this.m.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public final void f() {
        x4e x4e;
        Executor executor;
        gt0.i();
        cb0 cb0 = new cb0(this.d, this.i, this.h, this.c, this.b, this.e);
        y4e y4e = this.k;
        if (y4e != null) {
            synchronized (y4e.a) {
                y4e.m = cb0;
                x4e = y4e.n;
                executor = y4e.o;
            }
            if (!(x4e == null || executor == null)) {
                executor.execute(new t4e(x4e, cb0, 0));
            }
        }
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            ((rf3) it.next()).accept(cb0);
        }
    }
}
