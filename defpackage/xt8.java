package defpackage;

import android.net.Uri;

/* renamed from: xt8  reason: default package */
public final class xt8 implements au8 {
    public final Uri a;

    public xt8(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xt8) && hhd.f(this.a, ((xt8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SendImage(mediaUri=" + this.a + ")";
    }
}
