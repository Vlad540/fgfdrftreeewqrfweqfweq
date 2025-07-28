package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: rr  reason: default package */
public final class rr implements l77 {
    public final l77 a;
    public final pr b;

    public rr(l77 l77) {
        this.a = l77;
        this.b = new pr(l77.d());
    }

    public Object a(b9 b9Var) {
        return j(b9Var);
    }

    public void b(ur3 ur3, Object obj) {
        int h = h(obj);
        ur3 b2 = ur3.b(d());
        Iterator g = g(obj);
        for (int i = 0; i < h; i++) {
            b2.k(d(), i, this.a, g.next());
        }
        b2.o();
    }

    public final syc d() {
        return this.b;
    }

    public final Object e() {
        return new ArrayList();
    }

    public final int f(Object obj) {
        return ((ArrayList) obj).size();
    }

    public final Iterator g(Object obj) {
        return ((Collection) obj).iterator();
    }

    public final int h(Object obj) {
        return ((Collection) obj).size();
    }

    public final void i(Object obj, int i, Object obj2) {
        ((ArrayList) obj).add(i, obj2);
    }

    public final Object j(b9 b9Var) {
        Object e = e();
        int f = f(e);
        b9 j = b9Var.j(d());
        while (true) {
            int p = j.p(d());
            if (p != -1) {
                k(j, p + f, e, true);
            } else {
                j.z(d());
                return l(e);
            }
        }
    }

    public void k(b9 b9Var, int i, Object obj, boolean z) {
        i(obj, i, b9Var.t(d(), i, this.a, (Object) null));
    }

    public final Object l(Object obj) {
        return (ArrayList) obj;
    }
}
