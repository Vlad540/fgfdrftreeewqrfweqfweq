package defpackage;

import java.util.Arrays;

/* renamed from: zk  reason: default package */
public final class zk {
    public final int a;
    public final qe4 b;
    public final nk c;
    public final String d;

    public zk(qe4 qe4, nk nkVar, String str) {
        this.b = qe4;
        this.c = nkVar;
        this.d = str;
        this.a = Arrays.hashCode(new Object[]{qe4, nkVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zk)) {
            return false;
        }
        zk zkVar = (zk) obj;
        return x87.F(this.b, zkVar.b) && x87.F(this.c, zkVar.c) && x87.F(this.d, zkVar.d);
    }

    public final int hashCode() {
        return this.a;
    }
}
