package defpackage;

import java.util.List;

/* renamed from: bu1  reason: default package */
public final class bu1 extends du1 {
    public final String a;
    public final List b;

    public bu1(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bu1)) {
            return false;
        }
        bu1 bu1 = (bu1) obj;
        return hhd.f(this.a, bu1.a) && hhd.f(this.b, bu1.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Front(cameraId=" + this.a + ", cameraParameterList=" + this.b + ")";
    }
}
