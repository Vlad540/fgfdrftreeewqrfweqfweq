package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* renamed from: b3b  reason: default package */
public final class b3b extends mye {
    public static final z2b x = new Object();
    public static final vd6 y = pa2.A();
    public a3b p;
    public Executor q;
    public y1d r;
    public xc4 s;
    public o4e t;
    public y4e u;
    public ydc v;
    public z1d w;

    public final void C(Rect rect) {
        this.i = rect;
        hu1 c = c();
        o4e o4e = this.t;
        if (c != null && o4e != null) {
            gt0.I(new as0(o4e, h(c, n(c)), b(), 5));
        }
    }

    public final void F() {
        z1d z1d = this.w;
        if (z1d != null) {
            z1d.b();
            this.w = null;
        }
        xc4 xc4 = this.s;
        if (xc4 != null) {
            xc4.a();
            this.s = null;
        }
        ydc ydc = this.v;
        if (ydc != null) {
            ydc.release();
            this.v = null;
        }
        o4e o4e = this.t;
        if (o4e != null) {
            o4e.c();
            this.t = null;
        }
        this.u = null;
    }

    public final void G(a3b a3b) {
        gt0.i();
        Size size = null;
        if (a3b == null) {
            this.p = null;
            this.c = 2;
            r();
            return;
        }
        this.p = a3b;
        this.q = y;
        va0 va0 = this.g;
        if (va0 != null) {
            size = va0.a;
        }
        if (size != null) {
            H((c3b) this.f, va0);
            q();
        }
        p();
    }

    public final void H(c3b c3b, va0 va0) {
        Rect rect;
        va0 va02 = va0;
        gt0.i();
        hu1 c = c();
        Objects.requireNonNull(c);
        F();
        Rect rect2 = null;
        e07.p((String) null, this.t == null);
        Matrix matrix = this.j;
        boolean n = c.n();
        Size size = va02.a;
        Rect rect3 = this.i;
        if (rect3 != null) {
            rect = rect3;
        } else {
            if (size != null) {
                rect2 = new Rect(0, 0, size.getWidth(), size.getHeight());
            }
            rect = rect2;
        }
        Objects.requireNonNull(rect);
        o4e o4e = new o4e(1, 34, va0, matrix, n, rect, h(c, n(c)), b(), c.n() && n(c));
        this.t = o4e;
        k5f k5f = this.m;
        if (k5f != null) {
            this.v = new ydc(c, new s4e(k5f));
            this.t.a(new eq6(26, this));
            o4e o4e2 = this.t;
            int i = o4e2.f;
            int i2 = o4e2.i;
            Rect rect4 = o4e2.d;
            ba0 ba0 = new ba0(UUID.randomUUID(), i, o4e2.a, rect4, hqe.g(hqe.e(rect4), i2), o4e2.i, o4e2.e, false);
            o4e o4e3 = (o4e) this.v.J(new ab0(this.t, Collections.singletonList(ba0))).get(ba0);
            Objects.requireNonNull(o4e3);
            o4e3.a(new hg9(this, 15, c));
            this.u = o4e3.d(c, true);
            o4e o4e4 = this.t;
            o4e4.getClass();
            gt0.i();
            o4e4.b();
            e07.p("Consumer can only be linked once.", !o4e4.j);
            o4e4.j = true;
            this.s = o4e4.l;
        } else {
            o4e.a(new eq6(26, this));
            y4e d = this.t.d(c, true);
            this.u = d;
            this.s = d.l;
        }
        if (this.p != null) {
            hu1 c2 = c();
            o4e o4e5 = this.t;
            if (!(c2 == null || o4e5 == null)) {
                gt0.I(new as0(o4e5, h(c2, n(c2)), b(), 5));
            }
            a3b a3b = this.p;
            a3b.getClass();
            y4e y4e = this.u;
            y4e.getClass();
            this.q.execute(new hg9(a3b, 16, y4e));
        }
        y1d d2 = y1d.d(c3b, va02.a);
        w30 w30 = d2.b;
        w30.getClass();
        ((fc9) w30.f).j(pw1.k, va02.c);
        int y2 = c3b.y();
        if (y2 != 0) {
            w30.getClass();
            if (y2 != 0) {
                ((fc9) w30.f).j(pye.t0, Integer.valueOf(y2));
            }
        }
        ia3 ia3 = va02.d;
        if (ia3 != null) {
            w30.c(ia3);
        }
        if (this.p != null) {
            d2.b(this.s, va02.b, ((Integer) ((br6) this.f).d(br6.E, -1)).intValue());
        }
        z1d z1d = this.w;
        if (z1d != null) {
            z1d.b();
        }
        z1d z1d2 = new z1d(new fp6(3, this));
        this.w = z1d2;
        d2.f = z1d2;
        this.r = d2;
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{d2.c()}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        E(Collections.unmodifiableList(arrayList));
    }

    public final pye f(boolean z, sye sye) {
        x.getClass();
        c3b c3b = z2b.a;
        ia3 a = sye.a(c3b.t(), 1);
        if (z) {
            a = ia3.s(a, c3b);
        }
        if (a == null) {
            return null;
        }
        return new c3b(hga.a(((hp6) l(a)).b));
    }

    public final Set j() {
        HashSet hashSet = new HashSet();
        hashSet.add(1);
        return hashSet;
    }

    public final oye l(ia3 ia3) {
        return new hp6(fc9.e(ia3), 2);
    }

    public final String toString() {
        return "Preview:".concat(g());
    }

    public final pye u(fu1 fu1, oye oye) {
        ((fc9) oye.o()).j(qq6.z, 34);
        return oye.r();
    }

    public final va0 x(ia3 ia3) {
        this.r.a(ia3);
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{this.r.c()}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        E(Collections.unmodifiableList(arrayList));
        uwb a = this.g.a();
        a.e = ia3;
        return a.i();
    }

    public final va0 y(va0 va0, va0 va02) {
        H((c3b) this.f, va0);
        return va0;
    }

    public final void z() {
        F();
    }
}
