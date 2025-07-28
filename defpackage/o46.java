package defpackage;

/* renamed from: o46  reason: default package */
public final class o46 {
    public final n46 a;
    public int b;
    public boolean c;
    public final boolean d;

    public o46(n46 n46, int i, boolean z, boolean z2) {
        this.a = n46;
        this.b = i;
        this.c = z;
        this.d = z2;
    }

    public static o46 a(o46 o46, int i, boolean z, int i2) {
        n46 n46 = o46.a;
        if ((i2 & 4) != 0) {
            z = o46.c;
        }
        boolean z2 = o46.d;
        o46.getClass();
        return new o46(n46, i, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o46)) {
            return false;
        }
        o46 o46 = (o46) obj;
        return hhd.f(this.a, o46.a) && this.b == o46.b && this.c == o46.c && this.d == o46.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + th2.f(c3d.d(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        int i = this.b;
        boolean z = this.c;
        return "GalleryAlbum(type=" + this.a + ", totalCount=" + i + ", isLoaded=" + z + ", hasImages=" + this.d + ")";
    }
}
