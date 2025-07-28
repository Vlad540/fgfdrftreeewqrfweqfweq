package defpackage;

/* renamed from: t69  reason: default package */
public final class t69 {
    public final w69 a;
    public final String b;
    public final String c;
    public final c79 d;
    public final gt0 e;
    public final j79 f;

    public t69(w69 w69, String str, String str2, c79 c79, gt0 gt0, j79 j79) {
        this.a = w69;
        this.b = str;
        this.c = str2;
        this.d = c79;
        this.e = gt0;
        this.f = j79;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t69)) {
            return false;
        }
        t69 t69 = (t69) obj;
        return hhd.f(this.a, t69.a) && hhd.f(this.b, t69.b) && hhd.f(this.c, t69.c) && this.d == t69.d && hhd.f(this.e, t69.e) && hhd.f(this.f, t69.f);
    }

    public final int hashCode() {
        int d2 = me4.d(me4.d(Long.hashCode(this.a.a) * 31, 31, this.b), 31, this.c);
        int hashCode = this.e.hashCode();
        return this.f.a.hashCode() + ((hashCode + ((this.d.hashCode() + d2) * 31)) * 31);
    }

    public final String toString() {
        return "Movie(movieId=" + this.a + ", externalMovieId=" + this.b + ", title=" + this.c + ", sourceType=" + this.d + ", duration=" + this.e + ", thumbnail=" + this.f + ")";
    }
}
