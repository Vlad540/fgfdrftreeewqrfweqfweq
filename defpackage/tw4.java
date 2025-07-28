package defpackage;

/* renamed from: tw4  reason: default package */
public final class tw4 implements uw4 {
    public final String a;
    public final mge b;
    public final mge c;

    public tw4(String str, hge hge, hge hge2) {
        this.a = str;
        this.b = hge;
        this.c = hge2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tw4)) {
            return false;
        }
        tw4 tw4 = (tw4) obj;
        return hhd.f(this.a, tw4.a) && hhd.f(this.b, tw4.b) && hhd.f(this.c, tw4.c);
    }

    public final int hashCode() {
        String str = this.a;
        return this.c.hashCode() + c3d.e((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        return "SavedMessages(avatar=" + this.a + ", title=" + this.b + ", subtitle=" + this.c + ")";
    }
}
