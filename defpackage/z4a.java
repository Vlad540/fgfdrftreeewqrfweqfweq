package defpackage;

/* renamed from: z4a  reason: default package */
public final class z4a {
    public final String a;
    public final dv3 b;

    public z4a(String str, dv3 dv3) {
        this.a = str;
        this.b = dv3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z4a)) {
            return false;
        }
        z4a z4a = (z4a) obj;
        return hhd.f(this.a, z4a.a) && hhd.f(this.b, z4a.b);
    }

    public final int hashCode() {
        return Integer.hashCode(this.b.a) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FolderCounter(folderId=" + this.a + ", counter=" + this.b + ")";
    }
}
