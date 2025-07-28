package defpackage;

/* renamed from: ahf  reason: default package */
public final class ahf {
    public final long a;
    public final long b;
    public final long c;
    public final String d;
    public final boolean e;
    public final boolean f;

    public ahf(long j, long j2, long j3, String str, boolean z, boolean z2) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = str;
        this.e = z;
        this.f = z2;
    }

    public static ahf a(ahf ahf, boolean z, boolean z2, int i) {
        String str = (i & 8) != 0 ? ahf.d : null;
        if ((i & 16) != 0) {
            z = ahf.e;
        }
        boolean z3 = z;
        if ((i & 32) != 0) {
            z2 = ahf.f;
        }
        return new ahf(ahf.a, ahf.b, ahf.c, str, z3, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ahf)) {
            return false;
        }
        ahf ahf = (ahf) obj;
        return this.a == ahf.a && this.b == ahf.b && this.c == ahf.c && hhd.f(this.d, ahf.d) && this.e == ahf.e && this.f == ahf.f;
    }

    public final int hashCode() {
        int m = sxe.m(sxe.m(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return Boolean.hashCode(this.f) + th2.f((m + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebAppBiometryEntity(id=");
        sb.append(this.a);
        sb.append(", userId=");
        sb.append(this.b);
        sb.append(", botId=");
        sb.append(this.c);
        sb.append(", token=");
        sb.append(this.d);
        sb.append(", accessRequested=");
        sb.append(this.e);
        sb.append(", accessGranted=");
        return hr1.j(sb, this.f, ")");
    }

    public ahf(long j, long j2, boolean z) {
        this(0, j, j2, (String) null, true, z);
    }
}
