package defpackage;

/* renamed from: j97  reason: default package */
public final class j97 implements q8b {
    public final String a;
    public final r33 b;

    public j97(String str, r33 r33) {
        this.a = str;
        this.b = r33;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j97)) {
            return false;
        }
        j97 j97 = (j97) obj;
        return hhd.f(this.a, j97.a) && hhd.f(this.b, j97.b);
    }

    public final boolean g(pg7 pg7) {
        return ((long) 2) == pg7.getItemId();
    }

    public final long getItemId() {
        return (long) 2;
    }

    public final int hashCode() {
        int i = 0;
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        r33 r33 = this.b;
        if (r33 != null) {
            i = r33.a.hashCode();
        }
        return hashCode + i;
    }

    public final int l() {
        return 2;
    }

    public final Object n(Object obj) {
        pg7 pg7 = (pg7) obj;
        if (!(pg7 instanceof j97)) {
            return null;
        }
        return new h9b(((j97) pg7).b);
    }

    public final boolean t(Object obj) {
        return equals((pg7) obj);
    }

    public final String toString() {
        return "LastNameItem(text=" + this.a + ", errorText=" + this.b + ")";
    }
}
