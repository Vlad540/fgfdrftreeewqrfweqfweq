package defpackage;

import java.util.List;

/* renamed from: cu1  reason: default package */
public final class cu1 extends du1 {
    public final String a;
    public final List b;

    public cu1(String str, List list) {
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
        if (!(obj instanceof cu1)) {
            return false;
        }
        cu1 cu1 = (cu1) obj;
        return hhd.f(this.a, cu1.a) && hhd.f(this.b, cu1.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Unknown(cameraId=" + this.a + ", cameraParameterList=" + this.b + ")";
    }
}
