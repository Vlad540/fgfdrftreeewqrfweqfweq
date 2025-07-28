package defpackage;

import java.io.Serializable;

/* renamed from: wia  reason: default package */
public final class wia implements Serializable {
    public final Object a;
    public final Object b;

    public wia(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wia)) {
            return false;
        }
        wia wia = (wia) obj;
        return hhd.f(this.a, wia.a) && hhd.f(this.b, wia.b);
    }

    public final int hashCode() {
        int i = 0;
        Object obj = this.a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.b;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "(" + this.a + ", " + this.b + ')';
    }
}
