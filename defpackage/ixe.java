package defpackage;

/* renamed from: ixe  reason: default package */
public final class ixe {
    public final float a;
    public final long b;
    public final String c;

    public ixe(float f, long j, String str) {
        this.a = f;
        this.b = j;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ixe)) {
            return false;
        }
        ixe ixe = (ixe) obj;
        return Float.compare(this.a, ixe.a) == 0 && this.b == ixe.b && hhd.f(this.c, ixe.c);
    }

    public final int hashCode() {
        int m = sxe.m(Float.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        return m + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UploadState(progress=");
        sb.append(this.a);
        sb.append(", fileSize=");
        sb.append(this.b);
        sb.append(", uploadToken=");
        return wn6.l(sb, this.c, ")");
    }
}
