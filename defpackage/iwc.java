package defpackage;

/* renamed from: iwc  reason: default package */
public final class iwc extends jwc {
    public final String b;
    public final String c;
    public final d10 d;
    public final int e;

    public iwc(String str, String str2, d10 d10, int i) {
        super(str);
        this.b = str;
        this.c = str2;
        this.d = d10;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iwc)) {
            return false;
        }
        iwc iwc = (iwc) obj;
        return hhd.f(this.b, iwc.b) && hhd.f(this.c, iwc.c) && hhd.f(this.d, iwc.d) && this.e == iwc.e;
    }

    public final int hashCode() {
        int d2 = me4.d(this.b.hashCode() * 31, 31, this.c);
        return hr1.t(this.e) + ((this.d.hashCode() + d2) * 31);
    }

    public final String toString() {
        return "Photo(localCroppedUri=" + this.b + ", originalUri=" + this.c + ", relativeCrop=" + this.d + ", source=" + hr1.v(this.e) + ")";
    }
}
