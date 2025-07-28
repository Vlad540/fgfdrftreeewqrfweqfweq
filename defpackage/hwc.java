package defpackage;

/* renamed from: hwc  reason: default package */
public final class hwc extends jwc {
    public final String b;
    public final long c;
    public final int d;

    public hwc(long j, String str, int i) {
        super(str);
        this.b = str;
        this.c = j;
        this.d = i;
    }

    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hwc)) {
            return false;
        }
        hwc hwc = (hwc) obj;
        return hhd.f(this.b, hwc.b) && this.c == hwc.c && this.d == hwc.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + sxe.m(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Neuro(uri=");
        sb.append(this.b);
        sb.append(", photoId=");
        sb.append(this.c);
        sb.append(", categoryId=");
        return wn6.j(sb, this.d, ")");
    }
}
