package defpackage;

import java.util.List;

/* renamed from: o9e  reason: default package */
public final class o9e {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final List e;

    public o9e(String str, String str2, String str3, List list, List list2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o9e)) {
            return false;
        }
        o9e o9e = (o9e) obj;
        if (hhd.f(this.a, o9e.a) && hhd.f(this.b, o9e.b) && hhd.f(this.c, o9e.c) && hhd.f(this.d, o9e.d)) {
            return hhd.f(this.e, o9e.e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + c3d.f(this.d, me4.d(me4.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        return "ForeignKey{referenceTable='" + this.a + "', onDelete='" + this.b + " +', onUpdate='" + this.c + "', columnNames=" + this.d + ", referenceColumnNames=" + this.e + '}';
    }
}
