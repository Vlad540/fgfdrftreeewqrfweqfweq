package defpackage;

/* renamed from: ab3  reason: default package */
public final class ab3 extends t81 {
    public final String b;
    public final y2b c;

    public ab3(String str, y2b y2b) {
        super(3);
        this.b = str;
        this.c = y2b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ab3)) {
            return false;
        }
        ab3 ab3 = (ab3) obj;
        return hhd.f(this.b, ab3.b) && hhd.f(this.c, ab3.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "NameInputScreen(token=" + this.b + ", presetAvatars=" + this.c + ")";
    }
}
