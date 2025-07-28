package defpackage;

import android.net.Uri;

/* renamed from: ngd  reason: default package */
public final class ngd implements ov0 {
    public final String a;

    public ngd(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean a(Uri uri) {
        return this.a.contains(uri.toString());
    }

    public final boolean b() {
        return false;
    }

    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ngd) {
            return this.a.equals(((ngd) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
