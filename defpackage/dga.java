package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: dga  reason: default package */
public final class dga implements pg7 {
    public static final dga o = new dga(hw4.a, 0, 1);
    public final int a;
    public final int b;
    public final List c;

    public dga(List list, int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        dga dga = (dga) obj;
        if (this.a != dga.a || this.b != dga.b) {
            return false;
        }
        List list = this.c;
        int size = list.size();
        List list2 = dga.c;
        if (size != list2.size()) {
            return false;
        }
        ArrayList y0 = o23.y0(list, list2);
        if (!y0.isEmpty()) {
            Iterator it = y0.iterator();
            while (it.hasNext()) {
                wia wia = (wia) it.next();
                if (!hhd.f((v91) wia.a, (v91) wia.b)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean g(pg7 pg7) {
        dga dga = (dga) pg7;
        return dga.b == this.b && dga.a == this.a;
    }

    public final long getItemId() {
        return (long) this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + us8.h(this.b, this.a * 31, 31);
    }

    public final int l() {
        return 1;
    }

    public final Object n(Object obj) {
        dga dga = (pg7) obj;
        return equals(dga) ? hw4.a : Collections.singletonList(new cga(dga));
    }

    public final boolean t(Object obj) {
        dga dga = (pg7) obj;
        dga dga2 = dga;
        return dga.equals(this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpponentsPageState(pagePosition=");
        sb.append(this.a);
        sb.append(", pageType=");
        int i = this.b;
        sb.append(i != 1 ? i != 2 ? "null" : "SCREEN_SHARING" : "DEFAULT");
        sb.append(", opponents=");
        return hr1.i(sb, this.c, ")");
    }
}
