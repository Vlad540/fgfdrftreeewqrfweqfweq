package defpackage;

/* renamed from: f57  reason: default package */
public final class f57 implements h57 {
    public final String a;
    public final String b;

    public f57(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f57)) {
            return false;
        }
        f57 f57 = (f57) obj;
        return hhd.f(this.a, f57.a) && hhd.f(this.b, f57.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JsEvent(name=");
        sb.append(this.a);
        sb.append(", data=");
        return wn6.l(sb, this.b, ")");
    }
}
