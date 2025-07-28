package defpackage;

/* renamed from: i8e  reason: default package */
public final class i8e {
    public final String a;
    public final int b;
    public final int c;

    public i8e(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i8e)) {
            return false;
        }
        i8e i8e = (i8e) obj;
        return hhd.f(this.a, i8e.a) && this.b == i8e.b && this.c == i8e.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + c3d.d(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SystemIdInfo(workSpecId=");
        sb.append(this.a);
        sb.append(", generation=");
        sb.append(this.b);
        sb.append(", systemId=");
        return hr1.h(sb, this.c, ')');
    }
}
