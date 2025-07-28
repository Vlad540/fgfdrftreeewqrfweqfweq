package defpackage;

/* renamed from: qi2  reason: default package */
public final class qi2 implements q8b {
    public final String a;
    public final mge b;
    public final r33 c;
    public final int o;

    public qi2(String str, hge hge, r33 r33, int i) {
        this.a = str;
        this.b = hge;
        this.c = r33;
        this.o = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qi2)) {
            return false;
        }
        qi2 qi2 = (qi2) obj;
        return hhd.f(this.a, qi2.a) && hhd.f(this.b, qi2.b) && hhd.f(this.c, qi2.c) && this.o == qi2.o;
    }

    public final boolean g(pg7 pg7) {
        return ((long) 131072) == pg7.getItemId();
    }

    public final long getItemId() {
        return (long) 131072;
    }

    public final int hashCode() {
        int i = 0;
        String str = this.a;
        int e = c3d.e((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        r33 r33 = this.c;
        if (r33 != null) {
            i = r33.a.hashCode();
        }
        return Integer.hashCode(this.o) + ((e + i) * 31);
    }

    public final int l() {
        return 131072;
    }

    public final Object n(Object obj) {
        pg7 pg7 = (pg7) obj;
        if (!(pg7 instanceof qi2)) {
            return null;
        }
        return new f9b(((qi2) pg7).c);
    }

    public final boolean t(Object obj) {
        return equals((pg7) obj);
    }

    public final String toString() {
        return "ChatNameItem(text=" + this.a + ", hintText=" + this.b + ", errorText=" + this.c + ", limitCharacters=" + this.o + ")";
    }
}
