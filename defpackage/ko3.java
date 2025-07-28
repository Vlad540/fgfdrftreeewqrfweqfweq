package defpackage;

/* renamed from: ko3  reason: default package */
public final class ko3 {
    public final Integer a;

    public ko3(Integer num) {
        this.a = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ko3) && hhd.f(this.a, ((ko3) obj).a);
    }

    public final int hashCode() {
        Integer num = this.a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return "ButtonTitle(buttonTitleRes=" + this.a + ")";
    }
}
