package defpackage;

/* renamed from: u90  reason: default package */
public final class u90 {
    public final String a;
    public final String b;

    public u90(String str, String str2) {
        this.a = str;
        if (str2 != null) {
            this.b = str2;
            return;
        }
        throw new NullPointerException("Null version");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u90)) {
            return false;
        }
        u90 u90 = (u90) obj;
        return this.a.equals(u90.a) && this.b.equals(u90.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.a);
        sb.append(", version=");
        return wn6.l(sb, this.b, "}");
    }
}
