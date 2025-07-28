package defpackage;

/* renamed from: v46  reason: default package */
public final class v46 implements x46 {
    public final o46 a;

    public v46(o46 o46) {
        this.a = o46;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v46) && hhd.f(this.a, ((v46) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnSelectAlbum(album=" + this.a + ")";
    }
}
