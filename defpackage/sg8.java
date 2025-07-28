package defpackage;

import android.net.Uri;

/* renamed from: sg8  reason: default package */
public final class sg8 implements ug8 {
    public final Uri a;

    public sg8(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sg8) && hhd.f(this.a, ((sg8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SendFile(uri=" + this.a + ")";
    }
}
