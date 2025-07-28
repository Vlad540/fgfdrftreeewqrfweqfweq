package defpackage;

import android.net.Uri;

/* renamed from: rg3  reason: default package */
public final class rg3 implements ug3 {
    public final Uri a;

    public rg3(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rg3)) {
            return false;
        }
        return hhd.f(this.a, ((rg3) obj).a) && "image/*".equals("image/*");
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + 1911932022;
    }

    public final String toString() {
        return "ShareMedia(localUrl=" + this.a + ", mimetype=image/*)";
    }
}
