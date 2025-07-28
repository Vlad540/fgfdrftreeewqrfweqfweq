package defpackage;

/* renamed from: x40  reason: default package */
public final class x40 {
    public final Long a;
    public final float b;
    public final o20 c;

    public x40(Long l, float f, o20 o20) {
        this.a = l;
        this.b = f;
        this.c = o20;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x40)) {
            return false;
        }
        x40 x40 = (x40) obj;
        return hhd.f(this.a, x40.a) && Float.compare(this.b, x40.b) == 0 && hhd.f(this.c, x40.c);
    }

    public final int hashCode() {
        Long l = this.a;
        return this.c.hashCode() + th2.e((l == null ? 0 : l.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        return "AudioMessageState(messageId=" + this.a + ", currentPosition=" + this.b + ", audioButtonState=" + this.c + ")";
    }
}
