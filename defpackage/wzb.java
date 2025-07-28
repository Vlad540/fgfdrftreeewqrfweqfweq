package defpackage;

import java.util.List;

/* renamed from: wzb  reason: default package */
public final class wzb {
    public final String a;
    public final long b;
    public final List c;

    public wzb(long j, String str, List list) {
        this.a = str;
        this.b = j;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wzb)) {
            return false;
        }
        wzb wzb = (wzb) obj;
        return hhd.f(this.a, wzb.a) && this.b == wzb.b && hhd.f(this.c, wzb.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + sxe.m(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReactionsSectionEntity(id=");
        sb.append(this.a);
        sb.append(", updateTime=");
        sb.append(this.b);
        sb.append(", reactions=");
        return hr1.i(sb, this.c, ")");
    }
}
