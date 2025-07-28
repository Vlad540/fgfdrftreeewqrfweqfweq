package defpackage;

/* renamed from: z2f  reason: default package */
public final class z2f {
    public final a3f a;
    public final boolean b;
    public final String c;
    public final String d;

    public z2f(e06 e06) {
        this.a = (a3f) e06.b;
        this.b = e06.a;
        this.c = (String) e06.c;
        this.d = (String) e06.o;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, e06] */
    public final e06 a() {
        ? obj = new Object();
        obj.b = this.a;
        obj.a = this.b;
        obj.c = this.c;
        obj.o = this.d;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z2f.class != obj.getClass()) {
            return false;
        }
        z2f z2f = (z2f) obj;
        if (this.b != z2f.b) {
            return false;
        }
        a3f a3f = z2f.a;
        a3f a3f2 = this.a;
        if (a3f2 == null ? a3f != null : !a3f2.equals(a3f)) {
            return false;
        }
        String str = z2f.c;
        String str2 = this.c;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        String str3 = z2f.d;
        String str4 = this.d;
        return str4 != null ? str4.equals(str3) : str3 == null;
    }

    public final int hashCode() {
        int i = 0;
        a3f a3f = this.a;
        int hashCode = (((a3f != null ? a3f.hashCode() : 0) * 31) + (this.b ? 1 : 0)) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoConversion{videoConversionData=");
        sb.append(this.a);
        sb.append(", finished=");
        sb.append(this.b);
        sb.append(", preparedPath='");
        sb.append(this.c);
        sb.append("', resultPath='");
        return wn6.l(sb, this.d, "'}");
    }
}
