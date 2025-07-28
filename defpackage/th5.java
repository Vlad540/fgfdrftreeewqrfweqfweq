package defpackage;

/* renamed from: th5  reason: default package */
public final class th5 implements q8b {
    public final String a;
    public final r33 b;

    public th5(String str, r33 r33) {
        this.a = str;
        this.b = r33;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof th5)) {
            return false;
        }
        th5 th5 = (th5) obj;
        return hhd.f(this.a, th5.a) && hhd.f(this.b, th5.b);
    }

    public final boolean g(pg7 pg7) {
        return ((long) 1) == pg7.getItemId();
    }

    public final long getItemId() {
        return (long) 1;
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
        return 1;
    }

    public final Object n(Object obj) {
        pg7 pg7 = (pg7) obj;
        if (!(pg7 instanceof th5)) {
            return null;
        }
        return new g9b(((th5) pg7).b);
    }

    public final boolean t(Object obj) {
        return equals((pg7) obj);
    }

    public final String toString() {
        return "FirstNameItem(text=" + this.a + ", errorText=" + this.b + ")";
    }
}
