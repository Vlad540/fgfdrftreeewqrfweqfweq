package defpackage;

/* renamed from: rt8  reason: default package */
public final class rt8 {
    public final CharSequence a;
    public final Integer b;

    public rt8(CharSequence charSequence, Integer num) {
        this.a = charSequence;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rt8)) {
            return false;
        }
        rt8 rt8 = (rt8) obj;
        return hhd.f(this.a, rt8.a) && hhd.f(this.b, rt8.b);
    }

    public final int hashCode() {
        int i = 0;
        CharSequence charSequence = this.a;
        int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        Integer num = this.b;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "InputTextData(inputText=" + this.a + ", inputCursorPosition=" + this.b + ")";
    }
}
