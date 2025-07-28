package defpackage;

/* renamed from: d65  reason: default package */
public final class d65 extends lbe {
    public final Long c;
    public final String o;

    public d65(String str, Long l) {
        this.c = l;
        this.o = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d65)) {
            return false;
        }
        d65 d65 = (d65) obj;
        return hhd.f(this.c, d65.c) && hhd.f(this.o, d65.o);
    }

    public final int hashCode() {
        int i = 0;
        Long l = this.c;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.o;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "Response(botId=" + this.c + ", startParams=" + this.o + ")";
    }
}
