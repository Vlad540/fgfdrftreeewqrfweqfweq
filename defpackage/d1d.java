package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: d1d  reason: default package */
public class d1d extends f1d {
    public final String D0;
    public final List E0;
    public List F0;
    public final boolean G0;

    public d1d(c1d c1d) {
        super(c1d);
        this.D0 = c1d.m;
        this.E0 = c1d.n;
        this.F0 = c1d.l;
        this.G0 = c1d.o;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, p10] */
    public uo8 y() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(this.F0.size());
        Iterator it = this.F0.iterator();
        while (true) {
            d0d d0d = null;
            if (!it.hasNext()) {
                break;
            }
            o2 o2Var = (o2) it.next();
            if (o2Var instanceof nz) {
                arrayList2.add(o2Var);
                arrayList.add(((nz) o2Var).c);
            } else {
                d0d d0d2 = this.a;
                if (d0d2 != null) {
                    d0d = d0d2;
                }
                xia b = ((n4b) d0d.B.getValue()).b(o2Var, this.G0);
                if (b != null) {
                    o2 o2Var2 = (o2) b.a;
                    o10 o10 = (o10) b.b;
                    if (!(o2Var2 == null || o10 == null)) {
                        arrayList2.add(o2Var2);
                        arrayList.add(o10);
                    }
                }
            }
        }
        String str = this.D0;
        if ((str == null || str.length() == 0) && arrayList2.isEmpty()) {
            return null;
        }
        this.F0 = arrayList2;
        ? obj = new Object();
        obj.a = arrayList;
        jj7 c = obj.c();
        uo8 uo8 = new uo8();
        uo8.n = c;
        if (!r1g.p(str)) {
            uo8.g = str;
        }
        List list = this.E0;
        if (list != null && !list.isEmpty()) {
            uo8.F = list;
        }
        return uo8;
    }

    public final long z(long j, i22 i22) {
        vo8 vo8;
        int i;
        int i2;
        i22 i222 = i22;
        long z = super.z(j, i22);
        vo8 q = o().q(j);
        if (q == null) {
            return 0;
        }
        int size = this.F0.size();
        int i3 = 0;
        while (i3 < size) {
            o2 o2Var = (o2) this.F0.get(i3);
            String str = q.D0.u(i3).q;
            if (o2Var instanceof r65) {
                luf u = u();
                r65 r65 = (r65) o2Var;
                i2 = size;
                i = i3;
                vo8 = q;
                t65 t65 = r5;
                t65 t652 = new t65(((j2b) p()).a.n(), r65.b, str, j, i222.a, r65.Y);
                u.b(t65);
            } else {
                vo8 = q;
                i2 = size;
                i = i3;
                if (!(o2Var instanceof nz)) {
                    d0d d0d = this.a;
                    if (d0d == null) {
                        d0d = null;
                    }
                    ((uc5) d0d.b.getValue()).c(o2Var, j, i222.a, str);
                }
            }
            i3 = i + 1;
            long j2 = j;
            size = i2;
            q = vo8;
        }
        return z;
    }
}
