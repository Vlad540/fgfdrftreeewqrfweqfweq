package defpackage;

import android.net.Uri;

/* renamed from: cf  reason: default package */
public final class cf implements ov0 {
    public final ov0 a;
    public final int b;

    public cf(ov0 ov0, int i) {
        this.a = ov0;
        this.b = i;
    }

    public final boolean a(Uri uri) {
        return this.a.a(uri);
    }

    public final boolean b() {
        return false;
    }

    public final String c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cf)) {
            return false;
        }
        cf cfVar = (cf) obj;
        return this.b == cfVar.b && this.a.equals(cfVar.a);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 1013) + this.b;
    }

    public final String toString() {
        jg8 X = at7.X(this);
        X.h(this.a, "imageCacheKey");
        X.f(this.b, "frameIndex");
        return X.toString();
    }
}
