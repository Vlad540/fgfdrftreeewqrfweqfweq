package defpackage;

import android.net.Uri;

/* renamed from: llf  reason: default package */
public final class llf implements wlf {
    public final Uri a;

    public llf(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof llf) && hhd.f(this.a, ((llf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "InternalNavigation(uri=" + this.a + ")";
    }
}
