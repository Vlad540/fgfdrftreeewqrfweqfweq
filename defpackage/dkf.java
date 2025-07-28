package defpackage;

/* renamed from: dkf  reason: default package */
public final class dkf extends lbe {
    public final String c;
    public final String o;

    public dkf(String str, String str2) {
        this.c = str;
        this.o = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkf)) {
            return false;
        }
        dkf dkf = (dkf) obj;
        return hhd.f(this.c, dkf.c) && hhd.f(this.o, dkf.o);
    }

    public final int hashCode() {
        int i = 0;
        String str = this.c;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.o;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Response(url=");
        sb.append(this.c);
        sb.append(", queryId=");
        return wn6.l(sb, this.o, ")");
    }
}
