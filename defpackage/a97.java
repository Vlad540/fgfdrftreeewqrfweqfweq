package defpackage;

import android.text.SpannableStringBuilder;

/* renamed from: a97  reason: default package */
public final class a97 {
    public static final a97 f = new a97((le1) null, (SpannableStringBuilder) null, false, false, ize.o);
    public final le1 a;
    public final CharSequence b;
    public final boolean c;
    public final boolean d;
    public final ize e;

    public a97(le1 le1, SpannableStringBuilder spannableStringBuilder, boolean z, boolean z2, ize ize) {
        this.a = le1;
        this.b = spannableStringBuilder;
        this.c = z;
        this.d = z2;
        this.e = ize;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a97)) {
            return false;
        }
        a97 a97 = (a97) obj;
        return hhd.f(this.a, a97.a) && hhd.f(this.b, a97.b) && this.c == a97.c && this.d == a97.d && this.e == a97.e;
    }

    public final int hashCode() {
        int i = 0;
        le1 le1 = this.a;
        int hashCode = (le1 == null ? 0 : le1.hashCode()) * 31;
        CharSequence charSequence = this.b;
        if (charSequence != null) {
            i = charSequence.hashCode();
        }
        return this.e.hashCode() + th2.f(th2.f((hashCode + i) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        return "LabelSpeakerState(participantId=" + this.a + ", title=" + this.b + ", isPinned=" + this.c + ", isTalking=" + this.d + ", action=" + this.e + ")";
    }
}
