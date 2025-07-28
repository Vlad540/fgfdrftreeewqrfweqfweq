package defpackage;

import java.util.Arrays;

/* renamed from: ib6  reason: default package */
public final class ib6 {
    public final gb6 a;
    public final mb6 b;
    public final hb6 c;
    public final jb6 d;
    public final kb6 e;
    public final lb6 f;
    public final nb6 g;

    public ib6(gb6 gb6, mb6 mb6, hb6 hb6, jb6 jb6, kb6 kb6, lb6 lb6, nb6 nb6) {
        this.a = gb6;
        this.b = mb6;
        this.c = hb6;
        this.d = jb6;
        this.e = kb6;
        this.f = lb6;
        this.g = nb6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ib6)) {
            return false;
        }
        ib6 ib6 = (ib6) obj;
        return hhd.f(this.a, ib6.a) && hhd.f(this.b, ib6.b) && hhd.f(this.c, ib6.c) && hhd.f(this.d, ib6.d) && hhd.f(this.e, ib6.e) && hhd.f(this.f, ib6.f) && hhd.f(this.g, ib6.g);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        int hashCode3 = Arrays.hashCode(this.d.a);
        int hashCode4 = this.e.hashCode();
        int hashCode5 = this.f.hashCode();
        return this.g.hashCode() + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "GradientsColors(bannerDk=" + this.a + ", overlay=" + this.b + ", buttonTextPromo=" + this.c + ", complex=" + this.d + ", emptyBlockIconWrapper=" + this.e + ", loadingIcon=" + this.f + ", skeleton=" + this.g + ")";
    }
}
