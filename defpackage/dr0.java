package defpackage;

/* renamed from: dr0  reason: default package */
public final class dr0 {
    public final xq0 a;
    public final gr0 b;
    public final er0 c;
    public final fr0 d;

    public dr0(xq0 xq0, gr0 gr0, er0 er0, fr0 fr0) {
        this.a = xq0;
        this.b = gr0;
        this.c = er0;
        this.d = fr0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dr0)) {
            return false;
        }
        dr0 dr0 = (dr0) obj;
        return hhd.f(this.a, dr0.a) && hhd.f(this.b, dr0.b) && hhd.f(this.c, dr0.c) && hhd.f(this.d, dr0.d);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        return this.d.hashCode() + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "BubbleColors(background=" + this.a + ", text=" + this.b + ", icon=" + this.c + ", stroke=" + this.d + ")";
    }
}
