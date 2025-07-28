package defpackage;

import android.net.Uri;
import android.text.Layout;

/* renamed from: oq8  reason: default package */
public final class oq8 implements qq8 {
    public final String a;
    public final int b;
    public final Layout c;
    public final Uri d;

    public oq8(String str, int i, Layout layout, Uri uri) {
        this.a = str;
        this.b = i;
        this.c = layout;
        this.d = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oq8)) {
            return false;
        }
        oq8 oq8 = (oq8) obj;
        return hhd.f(this.a, oq8.a) && this.b == oq8.b && hhd.f(this.c, oq8.c) && hhd.f(this.d, oq8.d);
    }

    public final int hashCode() {
        int i = 0;
        String str = this.a;
        int hashCode = (this.c.hashCode() + c3d.d(this.b, (str == null ? 0 : str.hashCode()) * 31, 31)) * 31;
        Uri uri = this.d;
        if (uri != null) {
            i = uri.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "Media(url=" + this.a + ", attachCount=" + this.b + ", description=" + this.c + ", lowResPreviewUri=" + this.d + ")";
    }
}
