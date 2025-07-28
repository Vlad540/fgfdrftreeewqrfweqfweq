package defpackage;

import android.net.Uri;

/* renamed from: p58  reason: default package */
public final class p58 {
    public static final String b = Integer.toString(0, 36);
    public final Uri a;

    static {
        int i = oze.a;
    }

    public p58(gvf gvf) {
        this.a = (Uri) gvf.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p58)) {
            return false;
        }
        return this.a.equals(((p58) obj).a) && oze.a((Object) null, (Object) null);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
