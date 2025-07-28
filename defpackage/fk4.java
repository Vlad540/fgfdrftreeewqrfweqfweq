package defpackage;

import android.net.Uri;

/* renamed from: fk4  reason: default package */
public final class fk4 implements gk4 {
    public final Uri a;
    public final ak4 b;

    public fk4(Uri uri, ak4 ak4) {
        this.a = uri;
        this.b = ak4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fk4)) {
            return false;
        }
        fk4 fk4 = (fk4) obj;
        return hhd.f(this.a, fk4.a) && this.b == fk4.b;
    }

    public final int hashCode() {
        Uri uri = this.a;
        return this.b.hashCode() + ((uri == null ? 0 : uri.hashCode()) * 31);
    }

    public final String toString() {
        return "DownloadMediaCompleted(uri=" + this.a + ", cause=" + this.b + ")";
    }
}
