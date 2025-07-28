package defpackage;

/* renamed from: jb  reason: default package */
public final class jb implements kb {
    public final le1 a;

    public jb(le1 le1) {
        this.a = le1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jb)) {
            return false;
        }
        return hhd.f(this.a, ((jb) obj).a);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DisableScreenSharingForParticipant(id=" + this.a + ", isSuccess=true)";
    }
}
