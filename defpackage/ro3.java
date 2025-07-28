package defpackage;

/* renamed from: ro3  reason: default package */
public final class ro3 {
    public final mm3 a;

    public ro3(mm3 mm3) {
        this.a = mm3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ro3) && hhd.f(this.a, ((ro3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnResult(contactsResult=" + this.a + ")";
    }
}
