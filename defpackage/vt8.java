package defpackage;

/* renamed from: vt8  reason: default package */
public final class vt8 implements au8 {
    public final CharSequence a;

    public vt8(CharSequence charSequence) {
        this.a = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vt8) && hhd.f(this.a, ((vt8) obj).a);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        if (charSequence == null) {
            return 0;
        }
        return charSequence.hashCode();
    }

    public final String toString() {
        return "FinishEditMessage(text=" + this.a + ")";
    }
}
