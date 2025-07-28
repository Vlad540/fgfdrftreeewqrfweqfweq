package defpackage;

import android.text.SpannableString;

/* renamed from: x71  reason: default package */
public final class x71 {
    public static final x71 c = new x71((SpannableString) null, y71.a);
    public final CharSequence a;
    public final y71 b;

    public x71(SpannableString spannableString, y71 y71) {
        this.a = spannableString;
        this.b = y71;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x71)) {
            return false;
        }
        x71 x71 = (x71) obj;
        return hhd.f(this.a, x71.a) && this.b == x71.b;
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        return this.b.hashCode() + ((charSequence == null ? 0 : charSequence.hashCode()) * 31);
    }

    public final String toString() {
        return "CallIndicatorState(title=" + this.a + ", indicatorState=" + this.b + ")";
    }
}
