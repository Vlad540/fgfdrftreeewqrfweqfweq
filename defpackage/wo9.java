package defpackage;

import android.net.Uri;

/* renamed from: wo9  reason: default package */
public final class wo9 {
    public final String a;
    public final boolean b;
    public final Uri c;

    public wo9(String str, boolean z, Uri uri) {
        this.a = str;
        this.b = z;
        this.c = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wo9)) {
            return false;
        }
        wo9 wo9 = (wo9) obj;
        return hhd.f(this.a, wo9.a) && this.b == wo9.b && hhd.f(this.c, wo9.c) && "image/*".equals("image/*");
    }

    public final int hashCode() {
        String str = this.a;
        return ((this.c.hashCode() + th2.f((str == null ? 0 : str.hashCode()) * 31, 31, this.b)) * 31) + 1911932022;
    }

    public final String toString() {
        return "NotificationImage(prefetchUrl=" + this.a + ", canBeLoadedFromNetwork=" + this.b + ", notificationImageUri=" + this.c + ", notificationImageMimeType=image/*)";
    }
}
