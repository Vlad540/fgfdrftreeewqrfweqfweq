package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: lp1  reason: default package */
public final class lp1 {
    public final i22 a;
    public final tf3 b;
    public final xm8 c;
    public final oa1 d;
    public List e;

    public lp1(xm8 xm8, tf3 tf3) {
        this.b = tf3;
        this.c = xm8;
        this.a = null;
        this.d = null;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(this.c.a.b));
        List list = this.e;
        if ((list == null ? 0 : list.size()) > 0) {
            for (lp1 lp1 : this.e) {
                arrayList.add(Long.valueOf(lp1.c.a.b));
            }
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || lp1.class != obj.getClass()) {
            return false;
        }
        lp1 lp1 = (lp1) obj;
        i22 i22 = lp1.a;
        i22 i222 = this.a;
        if (i222 == null ? i22 != null : !i222.equals(i22)) {
            return false;
        }
        tf3 tf3 = lp1.b;
        tf3 tf32 = this.b;
        if (tf32 == null ? tf3 != null : !tf32.equals(tf3)) {
            return false;
        }
        xm8 xm8 = lp1.c;
        xm8 xm82 = this.c;
        if (xm82 == null ? xm8 != null : !xm82.equals(xm8)) {
            return false;
        }
        oa1 oa1 = lp1.d;
        oa1 oa12 = this.d;
        if (oa12 == null ? oa1 != null : !oa12.equals(oa1)) {
            return false;
        }
        List list = this.e;
        return list != null ? list.equals(lp1.e) : lp1.e == null;
    }

    public final int hashCode() {
        int i = 0;
        i22 i22 = this.a;
        int hashCode = (i22 != null ? i22.hashCode() : 0) * 31;
        tf3 tf3 = this.b;
        int hashCode2 = (hashCode + (tf3 != null ? tf3.hashCode() : 0)) * 31;
        xm8 xm8 = this.c;
        int hashCode3 = (hashCode2 + (xm8 != null ? xm8.hashCode() : 0)) * 31;
        oa1 oa1 = this.d;
        int hashCode4 = (hashCode3 + (oa1 != null ? oa1.hashCode() : 0)) * 31;
        List list = this.e;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode4 + i;
    }

    public lp1(i22 i22, xm8 xm8) {
        this.a = i22;
        this.c = xm8;
        this.b = null;
        this.d = null;
    }

    public lp1(oa1 oa1) {
        this.d = oa1;
        this.a = null;
        this.c = null;
        this.b = null;
    }
}
