package defpackage;

import android.net.Uri;

/* renamed from: ca0  reason: default package */
public final class ca0 {
    public final Uri a;

    public ca0(Uri uri) {
        if (uri != null) {
            this.a = uri;
            return;
        }
        throw new NullPointerException("Null outputUri");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ca0)) {
            return false;
        }
        return this.a.equals(((ca0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "OutputResults{outputUri=" + this.a + "}";
    }
}
