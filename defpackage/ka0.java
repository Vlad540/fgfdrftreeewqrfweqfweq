package defpackage;

/* renamed from: ka0  reason: default package */
public final class ka0 {
    public final Integer a;

    public ka0(Integer num) {
        this.a = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ka0)) {
            return false;
        }
        ka0 ka0 = (ka0) obj;
        Integer num = this.a;
        return num == null ? ka0.a == null : num.equals(ka0.a);
    }

    public final int hashCode() {
        Integer num = this.a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "ProductData{productId=" + this.a + "}";
    }
}
