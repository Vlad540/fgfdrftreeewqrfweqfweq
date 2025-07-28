package defpackage;

/* renamed from: y60  reason: default package */
public final class y60 extends lbe {
    public final String X;
    public final uj3 Y;
    public final String c;
    public final ep7 o;

    public y60(String str, ep7 ep7, String str2, uj3 uj3) {
        this.c = str;
        this.o = ep7;
        this.X = str2;
        this.Y = uj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y60)) {
            return false;
        }
        y60 y60 = (y60) obj;
        return hhd.f(this.c, y60.c) && this.o == y60.o && hhd.f(this.X, y60.X) && hhd.f(this.Y, y60.Y);
    }

    public final int hashCode() {
        int hashCode = (this.o.hashCode() + (this.c.hashCode() * 31)) * 31;
        String str = this.X;
        return this.Y.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        String v = r1g.v(this.c);
        String v2 = r1g.v(this.X);
        StringBuilder m = hr1.m("{token='", v, ", tokenType=");
        m.append(this.o);
        m.append(", userToken='");
        m.append(v2);
        m.append(", profile=");
        m.append(this.Y);
        m.append("}");
        return m.toString();
    }
}
