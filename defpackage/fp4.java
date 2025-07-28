package defpackage;

/* renamed from: fp4  reason: default package */
public final class fp4 {
    public final String a;
    public final String b;
    public final int c;

    public fp4(String str, String str2, int i) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fp4) {
            fp4 fp4 = (fp4) obj;
            if (hhd.f(this.a, fp4.a) && hhd.f(this.b, fp4.b) && this.c == fp4.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return me4.d(this.a.hashCode() * 31, 31, this.b) + this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DropRecord(event='");
        sb.append(this.a);
        sb.append("', reason='");
        sb.append(this.b);
        sb.append("', count=");
        return hr1.h(sb, this.c, ')');
    }
}
