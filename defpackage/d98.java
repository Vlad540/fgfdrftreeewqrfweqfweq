package defpackage;

import android.net.Uri;

/* renamed from: d98  reason: default package */
public final class d98 extends sg9 {
    public final Uri b;
    public final String c;

    public d98(Uri uri, String str) {
        super(jue.a);
        this.b = uri;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d98)) {
            return false;
        }
        d98 d98 = (d98) obj;
        return hhd.f(this.b, d98.b) && hhd.f(this.c, d98.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "OpenCropScreen(uri=" + this.b + ", path=" + this.c + ")";
    }
}
