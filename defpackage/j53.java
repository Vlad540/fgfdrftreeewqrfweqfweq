package defpackage;

/* renamed from: j53  reason: default package */
public final class j53 {
    public final b43 a;
    public final w53 b;
    public final k53 c;
    public final v53 d;
    public final z33 e;
    public final p53 f;
    public final s53 g;

    public j53(b43 b43, w53 w53, k53 k53, v53 v53, z33 z33, p53 p53, s53 s53) {
        this.a = b43;
        this.b = w53;
        this.c = k53;
        this.d = v53;
        this.e = z33;
        this.f = p53;
        this.g = s53;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j53)) {
            return false;
        }
        j53 j53 = (j53) obj;
        return hhd.f(this.a, j53.a) && hhd.f(this.b, j53.b) && hhd.f(this.c, j53.c) && hhd.f(this.d, j53.d) && hhd.f(this.e, j53.e) && hhd.f(this.f, j53.f) && hhd.f(this.g, j53.g);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        int hashCode3 = this.d.hashCode();
        int hashCode4 = this.e.hashCode();
        int hashCode5 = this.f.hashCode();
        return this.g.hashCode() + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CommonColors(background=" + this.a + ", text=" + this.b + ", icon=" + this.c + ", stroke=" + this.d + ", action=" + this.e + ", shadows=" + this.f + ", states=" + this.g + ")";
    }
}
