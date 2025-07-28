package defpackage;

/* renamed from: ve4  reason: default package */
public final class ve4 implements q8b {
    public final String a;
    public final mge b;
    public final int c;

    public ve4(String str, hge hge, int i) {
        this.a = str;
        this.b = hge;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ve4)) {
            return false;
        }
        ve4 ve4 = (ve4) obj;
        return hhd.f(this.a, ve4.a) && hhd.f(this.b, ve4.b) && this.c == ve4.c;
    }

    public final boolean g(pg7 pg7) {
        return ((long) 4) == pg7.getItemId();
    }

    public final long getItemId() {
        return (long) 4;
    }

    public final int hashCode() {
        String str = this.a;
        return Integer.hashCode(this.c) + c3d.e((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }

    public final int l() {
        return 4;
    }

    public final boolean t(Object obj) {
        return equals((pg7) obj);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DescriptionItem(text=");
        sb.append(this.a);
        sb.append(", hint=");
        sb.append(this.b);
        sb.append(", limitCharacters=");
        return wn6.j(sb, this.c, ")");
    }
}
