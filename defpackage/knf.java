package defpackage;

/* renamed from: knf  reason: default package */
public final class knf {
    public static final jnf Companion = new Object();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ knf(String str, int i, String str2, String str3) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof knf)) {
            return false;
        }
        knf knf = (knf) obj;
        return hhd.f(this.a, knf.a) && hhd.f(this.b, knf.b) && hhd.f(this.c, knf.c);
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
        StringBuilder sb = new StringBuilder("WebAppShareRequest(url=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", text=");
        return wn6.l(sb, this.c, ")");
    }
}
