package defpackage;

import android.text.SpannableStringBuilder;

/* renamed from: n91  reason: default package */
public final class n91 extends r91 {
    public final CharSequence a;
    public final String b;

    public n91(SpannableStringBuilder spannableStringBuilder, String str) {
        this.a = spannableStringBuilder;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n91)) {
            return false;
        }
        n91 n91 = (n91) obj;
        return hhd.f(this.a, n91.a) && hhd.f(this.b, n91.b);
    }

    public final int hashCode() {
        int i = 0;
        CharSequence charSequence = this.a;
        int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        String str = this.b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "Name(name=" + this.a + ", accessibility=" + this.b + ")";
    }
}
