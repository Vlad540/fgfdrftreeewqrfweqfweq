package defpackage;

import java.util.Iterator;

/* renamed from: nz4  reason: default package */
public final class nz4 extends wza {
    public final xyc l = xyc.g;
    public final r7e m;

    public nz4(int i) {
        super("one.me.webapp.domain.jsbridge.SuccessResponse.Status", (t66) null, i);
        this.m = new r7e(new mz4(i, this));
    }

    public final d8 e() {
        return this.l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof syc)) {
            return false;
        }
        syc syc = (syc) obj;
        if (syc.e() != xyc.g) {
            return false;
        }
        return hhd.f(this.a, syc.a()) && hhd.f(ete.i(this), ete.i(syc));
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        Iterator it = new ds(4, this).iterator();
        int i = 1;
        while (it.hasNext()) {
            int i2 = i * 31;
            String str = (String) it.next();
            i = i2 + (str != null ? str.hashCode() : 0);
        }
        return (hashCode * 31) + i;
    }

    public final syc i(int i) {
        return ((syc[]) this.m.getValue())[i];
    }

    public final String toString() {
        return o23.c0(new ds(4, this), ", ", me4.l(new StringBuilder(), this.a, '('), ")", (u16) null, 56);
    }
}
