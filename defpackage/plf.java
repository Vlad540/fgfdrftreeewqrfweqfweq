package defpackage;

/* renamed from: plf  reason: default package */
public final class plf implements wlf {
    public final String a;
    public final String b;

    public plf(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof plf)) {
            return false;
        }
        plf plf = (plf) obj;
        return hhd.f(this.a, plf.a) && hhd.f(this.b, plf.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SendJsEvent(name=");
        sb.append(this.a);
        sb.append(", data=");
        return wn6.l(sb, this.b, ")");
    }
}
