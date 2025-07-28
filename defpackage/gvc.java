package defpackage;

/* renamed from: gvc  reason: default package */
public final class gvc implements ivc {
    public final o46 a;

    public gvc(o46 o46) {
        this.a = o46;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gvc) && hhd.f(this.a, ((gvc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnAlbumSelected(album=" + this.a + ")";
    }
}
