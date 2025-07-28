package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: mye  reason: default package */
public abstract class mye {
    public final HashSet a = new HashSet();
    public final Object b = new Object();
    public int c = 2;
    public pye d;
    public pye e;
    public pye f;
    public va0 g;
    public pye h;
    public Rect i;
    public Matrix j = new Matrix();
    public hu1 k;
    public hu1 l;
    public k5f m;
    public c2d n = c2d.a();
    public c2d o = c2d.a();

    public mye(pye pye) {
        this.e = pye;
        this.f = pye;
    }

    public void A(Matrix matrix) {
        this.j = new Matrix(matrix);
    }

    public final boolean B(int i2) {
        Size size;
        int B = ((br6) this.f).B(-1);
        if (B != -1 && B == i2) {
            return false;
        }
        oye l2 = l(this.e);
        br6 br6 = (br6) l2.r();
        int B2 = br6.B(-1);
        if (B2 == -1 || B2 != i2) {
            ((hp6) l2).e(i2);
        }
        if (!(B2 == -1 || i2 == -1 || B2 == i2)) {
            if (Math.abs(z3d.O(i2) - z3d.O(B2)) % 180 == 90 && (size = (Size) br6.d(br6.F, (Object) null)) != null) {
                ((hp6) l2).d(new Size(size.getHeight(), size.getWidth()));
            }
        }
        this.e = l2.r();
        hu1 c2 = c();
        if (c2 == null) {
            this.f = this.e;
            return true;
        }
        this.f = o(c2.p(), this.d, this.h);
        return true;
    }

    public void C(Rect rect) {
        this.i = rect;
    }

    public final void D(hu1 hu1) {
        z();
        synchronized (this.b) {
            try {
                hu1 hu12 = this.k;
                if (hu1 == hu12) {
                    this.a.remove(hu12);
                    this.k = null;
                }
                hu1 hu13 = this.l;
                if (hu1 == hu13) {
                    this.a.remove(hu13);
                    this.l = null;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        this.g = null;
        this.i = null;
        this.f = this.e;
        this.d = null;
        this.h = null;
    }

    public final void E(List list) {
        if (!list.isEmpty()) {
            this.n = (c2d) list.get(0);
            if (list.size() > 1) {
                this.o = (c2d) list.get(1);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                for (xc4 xc4 : ((c2d) it.next()).b()) {
                    if (xc4.j == null) {
                        xc4.j = getClass();
                    }
                }
            }
        }
    }

    public final void a(hu1 hu1, hu1 hu12, pye pye, pye pye2) {
        synchronized (this.b) {
            this.k = hu1;
            this.l = hu12;
            this.a.add(hu1);
            if (hu12 != null) {
                this.a.add(hu12);
            }
        }
        this.d = pye;
        this.h = pye2;
        this.f = o(hu1.p(), this.d, this.h);
        s();
    }

    public final int b() {
        return ((Integer) ((br6) this.f).d(br6.D, -1)).intValue();
    }

    public final hu1 c() {
        hu1 hu1;
        synchronized (this.b) {
            hu1 = this.k;
        }
        return hu1;
    }

    public final ot1 d() {
        synchronized (this.b) {
            try {
                hu1 hu1 = this.k;
                if (hu1 == null) {
                    nt1 nt1 = ot1.a;
                    return nt1;
                }
                ot1 g2 = hu1.g();
                return g2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String e() {
        hu1 c2 = c();
        e07.o(c2, "No camera attached to use case: " + this);
        return c2.p().d();
    }

    public abstract pye f(boolean z, sye sye);

    public final String g() {
        pye pye = this.f;
        String str = (String) pye.d(gde.c0, "<UnknownUseCase-" + hashCode() + ">");
        Objects.requireNonNull(str);
        return str;
    }

    public final int h(hu1 hu1, boolean z) {
        int l2 = hu1.p().l(k());
        return (hu1.n() || !z) ? l2 : hqe.i(-l2);
    }

    public final hu1 i() {
        hu1 hu1;
        synchronized (this.b) {
            hu1 = this.l;
        }
        return hu1;
    }

    public Set j() {
        return Collections.emptySet();
    }

    public final int k() {
        return ((br6) this.f).B(0);
    }

    public abstract oye l(ia3 ia3);

    public final boolean m(int i2) {
        for (Integer intValue : j()) {
            int intValue2 = intValue.intValue();
            if ((i2 & intValue2) == intValue2) {
                return true;
            }
        }
        return false;
    }

    public final boolean n(hu1 hu1) {
        int intValue = ((Integer) ((br6) this.f).d(br6.E, -1)).intValue();
        if (intValue == -1 || intValue == 0) {
            return false;
        }
        if (intValue == 1) {
            return true;
        }
        if (intValue == 2) {
            return hu1.d();
        }
        throw new AssertionError(wn6.h(intValue, "Unknown mirrorMode: "));
    }

    public final pye o(fu1 fu1, pye pye, pye pye2) {
        fc9 fc9;
        if (pye2 != null) {
            fc9 = fc9.e(pye2);
            fc9.a.remove(gde.c0);
        } else {
            fc9 = fc9.c();
        }
        boolean l2 = this.e.l(br6.B);
        TreeMap treeMap = fc9.a;
        if (l2 || this.e.l(br6.F)) {
            z80 z80 = br6.J;
            if (treeMap.containsKey(z80)) {
                treeMap.remove(z80);
            }
        }
        pye pye3 = this.e;
        z80 z802 = br6.J;
        if (pye3.l(z802)) {
            z80 z803 = br6.H;
            if (treeMap.containsKey(z803) && ((ibc) this.e.h(z802)).b != null) {
                treeMap.remove(z803);
            }
        }
        for (z80 p : this.e.f()) {
            ia3.p(fc9, fc9, this.e, p);
        }
        if (pye != null) {
            for (z80 z804 : pye.f()) {
                if (!z804.a.equals(gde.c0.a)) {
                    ia3.p(fc9, fc9, pye, z804);
                }
            }
        }
        if (treeMap.containsKey(br6.F)) {
            z80 z805 = br6.B;
            if (treeMap.containsKey(z805)) {
                treeMap.remove(z805);
            }
        }
        z80 z806 = br6.J;
        if (treeMap.containsKey(z806) && ((ibc) fc9.h(z806)).c != 0) {
            fc9.j(pye.q0, Boolean.TRUE);
        }
        return u(fu1, l(fc9));
    }

    public final void p() {
        this.c = 1;
        r();
    }

    public final void q() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((lye) it.next()).c(this);
        }
    }

    public final void r() {
        int t = hr1.t(this.c);
        HashSet hashSet = this.a;
        if (t == 0) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((lye) it.next()).e(this);
            }
        } else if (t == 1) {
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                ((lye) it2.next()).m(this);
            }
        }
    }

    public void s() {
    }

    public void t() {
    }

    public abstract pye u(fu1 fu1, oye oye);

    public void v() {
    }

    public void w() {
    }

    public abstract va0 x(ia3 ia3);

    public abstract va0 y(va0 va0, va0 va02);

    public void z() {
    }
}
