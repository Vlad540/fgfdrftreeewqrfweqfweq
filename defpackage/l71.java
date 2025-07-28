package defpackage;

import android.text.SpannableStringBuilder;

/* renamed from: l71  reason: default package */
public final class l71 implements n71 {
    public final y11 a;
    public final boolean b;
    public final CharSequence c;

    public l71(y11 y11, boolean z, SpannableStringBuilder spannableStringBuilder) {
        this.a = y11;
        this.b = z;
        this.c = spannableStringBuilder;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l71)) {
            return false;
        }
        l71 l71 = (l71) obj;
        return hhd.f(this.a, l71.a) && this.b == l71.b && hhd.f(this.c, l71.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + th2.f(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "Calling(chatState=" + this.a + ", isVideo=" + this.b + ", callTypeDescription=" + this.c + ")";
    }
}
