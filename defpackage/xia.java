package defpackage;

/* renamed from: xia  reason: default package */
public final class xia {
    public final Object a;
    public final Object b;

    public xia(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xia.class != obj.getClass()) {
            return false;
        }
        xia xia = (xia) obj;
        Object obj2 = xia.a;
        Object obj3 = this.a;
        if (obj3 == null ? obj2 != null : !obj3.equals(obj2)) {
            return false;
        }
        Object obj4 = xia.b;
        Object obj5 = this.b;
        return obj5 != null ? obj5.equals(obj4) : obj4 == null;
    }

    public final int hashCode() {
        int i = 0;
        Object obj = this.a;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.b;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "Pair{first=" + this.a + ", second=" + this.b + '}';
    }
}
