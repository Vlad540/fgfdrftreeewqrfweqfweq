package defpackage;

/* renamed from: ga  reason: default package */
public final class ga {
    public final long a;
    public final int b;
    public final long c;
    public final String d;

    public ga(int i, long j, long j2, String str) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ga)) {
            return false;
        }
        ga gaVar = (ga) obj;
        return this.a == gaVar.a && this.b == gaVar.b && this.c == gaVar.c && hhd.f(this.d, gaVar.d);
    }

    public final int hashCode() {
        int m = sxe.m(c3d.d(this.b, Long.hashCode(this.a) * 31, 31), 31, this.c);
        String str = this.d;
        return m + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdminParticipant(id=");
        sb.append(this.a);
        sb.append(", permissions=");
        sb.append(this.b);
        sb.append(", inviterId=");
        sb.append(this.c);
        sb.append(", alias=");
        return wn6.l(sb, this.d, ")");
    }
}
