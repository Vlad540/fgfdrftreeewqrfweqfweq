package defpackage;

import java.util.List;

/* renamed from: au1  reason: default package */
public final class au1 extends du1 {
    public final String a;
    public final List b;

    public au1(String str, List list) {
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
        if (!(obj instanceof au1)) {
            return false;
        }
        au1 au1 = (au1) obj;
        return hhd.f(this.a, au1.a) && hhd.f(this.b, au1.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Back(cameraId=" + this.a + ", cameraParameterList=" + this.b + ")";
    }
}
