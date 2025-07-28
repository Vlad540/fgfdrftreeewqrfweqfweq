package defpackage;

import android.net.Uri;

/* renamed from: ufa  reason: default package */
public final class ufa extends t81 {
    public final Uri b;

    public ufa(Uri uri) {
        super(8);
        this.b = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ufa) && hhd.f(this.b, ((ufa) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "OpenExternalLink(url=" + this.b + ")";
    }
}
