package defpackage;

/* renamed from: h8b  reason: default package */
public final class h8b implements j8b {
    public final long a;

    public h8b(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h8b) && this.a == ((h8b) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return wn6.k(new StringBuilder("ProfilePhotoUpdate(photoId="), this.a, ")");
    }
}
