package defpackage;

/* renamed from: nt8  reason: default package */
public final class nt8 {
    public final long a;
    public final CharSequence b;
    public final tt8 c;
    public final boolean d;
    public final boolean e;

    public nt8(long j, CharSequence charSequence, tt8 tt8, boolean z, boolean z2) {
        this.a = j;
        this.b = charSequence;
        this.c = tt8;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nt8)) {
            return false;
        }
        nt8 nt8 = (nt8) obj;
        return this.a == nt8.a && hhd.f(this.b, nt8.b) && hhd.f(this.c, nt8.c) && this.d == nt8.d && this.e == nt8.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + th2.f((this.c.hashCode() + me4.f(this.b, Long.hashCode(this.a) * 31, 31)) * 31, 31, this.d);
    }

    public final String toString() {
        return "EditMessageData(messageId=" + this.a + ", messageText=" + this.b + ", quoteData=" + this.c + ", hasMediaAttaches=" + this.d + ", shouldInsertOriginalText=" + this.e + ")";
    }
}
