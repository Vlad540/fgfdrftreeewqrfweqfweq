package defpackage;

import java.util.Arrays;

/* renamed from: ol0  reason: default package */
public final class ol0 {
    public final int a;
    public final CharSequence b;

    public ol0(int i, CharSequence charSequence) {
        this.a = i;
        this.b = charSequence;
    }

    public final boolean equals(Object obj) {
        ol0 ol0;
        if (!(obj instanceof ol0) || this.a != (ol0 = (ol0) obj).a) {
            return false;
        }
        String str = null;
        CharSequence charSequence = this.b;
        String charSequence2 = charSequence != null ? charSequence.toString() : null;
        CharSequence charSequence3 = ol0.b;
        if (charSequence3 != null) {
            str = charSequence3.toString();
        }
        return (charSequence2 == null && str == null) || (charSequence2 != null && charSequence2.equals(str));
    }

    public final int hashCode() {
        Integer valueOf = Integer.valueOf(this.a);
        CharSequence charSequence = this.b;
        return Arrays.hashCode(new Object[]{valueOf, charSequence != null ? charSequence.toString() : null});
    }
}
