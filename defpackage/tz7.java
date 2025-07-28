package defpackage;

import android.net.Uri;

/* renamed from: tz7  reason: default package */
public final class tz7 implements wz7 {
    public final Uri a;

    public tz7(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tz7) && hhd.f(this.a, ((tz7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SendFile(uri=" + this.a + ")";
    }
}
