package defpackage;

/* renamed from: of1  reason: default package */
public final class of1 {
    public final Integer a;
    public final ub9 b;
    public final CharSequence c;

    public of1(Integer num, ub9 ub9, CharSequence charSequence) {
        this.a = num;
        this.b = ub9;
        this.c = charSequence;
    }

    public static of1 a(of1 of1, Integer num, ub9 ub9, CharSequence charSequence, int i) {
        if ((i & 1) != 0) {
            num = of1.a;
        }
        if ((i & 2) != 0) {
            ub9 = of1.b;
        }
        if ((i & 4) != 0) {
            charSequence = of1.c;
        }
        of1.getClass();
        return new of1(num, ub9, charSequence);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof of1)) {
            return false;
        }
        of1 of1 = (of1) obj;
        return hhd.f(this.a, of1.a) && hhd.f(this.b, of1.b) && hhd.f(this.c, of1.c);
    }

    public final int hashCode() {
        int i = 0;
        Integer num = this.a;
        int hashCode = (this.b.hashCode() + ((num == null ? 0 : num.hashCode()) * 31)) * 31;
        CharSequence charSequence = this.c;
        if (charSequence != null) {
            i = charSequence.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "State(selectedEmoji=" + this.a + ", selectedReasons=" + this.b + ", otherReasonText=" + this.c + ")";
    }
}
