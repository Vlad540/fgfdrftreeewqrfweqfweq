package defpackage;

import android.net.Uri;

/* renamed from: hf3  reason: default package */
public final class hf3 {
    public final Uri a;
    public final boolean b;

    public hf3(Uri uri, boolean z) {
        this.a = uri;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!hf3.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        hf3 hf3 = (hf3) obj;
        return hhd.f(this.a, hf3.a) && this.b == hf3.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
