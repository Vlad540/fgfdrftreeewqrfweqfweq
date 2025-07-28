package defpackage;

import java.util.List;

/* renamed from: bgf  reason: default package */
public final class bgf implements cgf {
    public final mge a;
    public final List b;

    public bgf(hge hge, List list) {
        this.a = hge;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bgf)) {
            return false;
        }
        bgf bgf = (bgf) obj;
        return hhd.f(this.a, bgf.a) && hhd.f(this.b, bgf.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RequestOpenSettings(title=" + this.a + ", buttons=" + this.b + ")";
    }
}
