package defpackage;

import java.io.Serializable;

/* renamed from: ese  reason: default package */
public final class ese implements Serializable {
    public final Object a;
    public final Object b;
    public final Object c;

    public ese(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ese)) {
            return false;
        }
        ese ese = (ese) obj;
        return hhd.f(this.a, ese.a) && hhd.f(this.b, ese.b) && hhd.f(this.c, ese.c);
    }

    public final int hashCode() {
        int i = 0;
        Object obj = this.a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.b;
        int hashCode2 = (hashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.c;
        if (obj3 != null) {
            i = obj3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "(" + this.a + ", " + this.b + ", " + this.c + ')';
    }
}
