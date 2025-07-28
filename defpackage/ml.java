package defpackage;

/* renamed from: ml  reason: default package */
public final class ml {
    public final String a;
    public final String b;
    public final String c;

    public ml(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ml)) {
            return false;
        }
        ml mlVar = (ml) obj;
        return hhd.f(this.a, mlVar.a) && hhd.f(this.b, mlVar.b) && hhd.f(this.c, mlVar.c);
    }

    public final int hashCode() {
        int i = 0;
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionInfo(sessionKey=");
        sb.append(this.a);
        sb.append(", sessionSecret=");
        sb.append(this.b);
        sb.append(", apiEndpoint=");
        return wn6.l(sb, this.c, ")");
    }
}
