package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: uyc  reason: default package */
public final class uyc implements syc, gw0 {
    public final String a;
    public final d8 b;
    public final int c;
    public final List d;
    public final HashSet e;
    public final String[] f;
    public final syc[] g;
    public final List[] h;
    public final boolean[] i;
    public final Map j;
    public final syc[] k;
    public final r7e l;

    public uyc(String str, d8 d8Var, int i2, List list, bd4 bd4) {
        this.a = str;
        this.b = d8Var;
        this.c = i2;
        this.d = (List) bd4.b;
        ArrayList arrayList = (ArrayList) bd4.o;
        this.e = o23.q0(arrayList);
        int i3 = 0;
        this.f = (String[]) arrayList.toArray(new String[0]);
        this.g = ete.q((ArrayList) bd4.X);
        this.h = (List[]) ((ArrayList) bd4.c).toArray(new List[0]);
        ArrayList arrayList2 = (ArrayList) bd4.Y;
        boolean[] zArr = new boolean[arrayList2.size()];
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            zArr[i3] = ((Boolean) it.next()).booleanValue();
            i3++;
        }
        this.i = zArr;
        ds dsVar = new ds(2, new ke(1, (Object) this.f));
        ArrayList arrayList3 = new ArrayList(q23.H(dsVar, 10));
        Iterator it2 = dsVar.iterator();
        while (true) {
            gp4 gp4 = (gp4) it2;
            if (gp4.b.hasNext()) {
                uv6 uv6 = (uv6) gp4.next();
                arrayList3.add(new wia(uv6.b, Integer.valueOf(uv6.a)));
            } else {
                this.j = ju7.V(arrayList3);
                this.k = ete.q(list);
                this.l = new r7e(new u5b(20, this));
                return;
            }
        }
    }

    public final String a() {
        return this.a;
    }

    public final Set b() {
        return this.e;
    }

    public final boolean c() {
        return false;
    }

    public final int d(String str) {
        Integer num = (Integer) this.j.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public final d8 e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof uyc) {
            syc syc = (syc) obj;
            if (hhd.f(a(), syc.a()) && Arrays.equals(this.k, ((uyc) obj).k) && f() == syc.f()) {
                int f2 = f();
                int i2 = 0;
                while (i2 < f2) {
                    if (hhd.f(i(i2).a(), syc.i(i2).a()) && hhd.f(i(i2).e(), syc.i(i2).e())) {
                        i2++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int f() {
        return this.c;
    }

    public final String g(int i2) {
        return this.f[i2];
    }

    public final List getAnnotations() {
        return this.d;
    }

    public final List h(int i2) {
        return this.h[i2];
    }

    public final int hashCode() {
        return ((Number) this.l.getValue()).intValue();
    }

    public final syc i(int i2) {
        return this.g[i2];
    }

    public final boolean isInline() {
        return false;
    }

    public final boolean j(int i2) {
        return this.i[i2];
    }

    public final String toString() {
        return o23.c0(gwf.S(0, this.c), ", ", me4.l(new StringBuilder(), this.a, '('), ")", new ljc(1, this), 24);
    }
}
