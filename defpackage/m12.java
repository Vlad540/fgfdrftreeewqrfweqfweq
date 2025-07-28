package defpackage;

/* renamed from: m12  reason: default package */
public final class m12 {
    public static final l12 b = new Object();
    public final Object a;

    public /* synthetic */ m12(Object obj) {
        this.a = obj;
    }

    public static final Throwable a(Object obj) {
        k12 k12 = obj instanceof k12 ? (k12) obj : null;
        if (k12 != null) {
            return k12.a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m12)) {
            return false;
        }
        return hhd.f(this.a, ((m12) obj).a);
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.a;
        if (obj instanceof k12) {
            return ((k12) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
