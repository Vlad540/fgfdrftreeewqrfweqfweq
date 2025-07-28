package defpackage;

import android.net.Uri;

/* renamed from: p46  reason: default package */
public final class p46 implements pg7 {
    public final o46 a;
    public final Uri b;
    public final boolean c;
    public final long o;

    public p46(o46 o46, Uri uri, boolean z) {
        this.a = o46;
        this.b = uri;
        this.c = z;
        this.o = (long) o46.a.b().hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p46)) {
            return false;
        }
        p46 p46 = (p46) obj;
        return hhd.f(this.a, p46.a) && hhd.f(this.b, p46.b) && this.c == p46.c;
    }

    public final long getItemId() {
        return this.o;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Uri uri = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (uri == null ? 0 : uri.hashCode())) * 31);
    }

    public final int l() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GalleryAlbumUiItem(album=");
        sb.append(this.a);
        sb.append(", cover=");
        sb.append(this.b);
        sb.append(", isSelected=");
        return hr1.j(sb, this.c, ")");
    }
}
