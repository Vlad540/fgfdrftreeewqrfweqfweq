package defpackage;

/* renamed from: ph  reason: default package */
public final class ph {
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public ph(long j, String str, String str2, String str3, String str4) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ph)) {
            return false;
        }
        ph phVar = (ph) obj;
        return this.a == phVar.a && hhd.f(this.b, phVar.b) && hhd.f(this.c, phVar.c) && hhd.f(this.d, phVar.d) && hhd.f(this.e, phVar.e);
    }

    public final int hashCode() {
        int d2 = me4.d(Long.hashCode(this.a) * 31, 31, this.b);
        int i = 0;
        String str = this.c;
        int hashCode = (d2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Animoji(id=");
        sb.append(this.a);
        sb.append(", emoji=");
        sb.append(this.b);
        sb.append(", lottieUrl=");
        sb.append(this.c);
        sb.append(", effectLottieUrl=");
        sb.append(this.d);
        sb.append(", iconUrl=");
        return wn6.l(sb, this.e, ")");
    }
}
