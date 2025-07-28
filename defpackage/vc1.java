package defpackage;

/* renamed from: vc1  reason: default package */
public final class vc1 extends zc1 {
    public final Integer a;

    public vc1(Integer num) {
        this.a = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vc1) && hhd.f(this.a, ((vc1) obj).a);
    }

    public final int hashCode() {
        Integer num = this.a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return "Description(description=" + this.a + ")";
    }
}
