package defpackage;

import android.net.Uri;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: c34  reason: default package */
public final class c34 {
    public final Uri a;
    public final int b;
    public final Set c;
    public final boolean d;
    public final Set e;

    public c34(Uri uri, int i, LinkedHashSet linkedHashSet, boolean z, Set set) {
        this.a = uri;
        this.b = i;
        this.c = linkedHashSet;
        this.d = z;
        this.e = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c34)) {
            return false;
        }
        c34 c34 = (c34) obj;
        return hhd.f(this.a, c34.a) && this.b == c34.b && hhd.f(this.c, c34.c) && this.d == c34.d && hhd.f(this.e, c34.e);
    }

    public final int hashCode() {
        int f = th2.f((this.c.hashCode() + us8.h(this.b, this.a.hashCode() * 31, 31)) * 31, 31, this.d);
        Set set = this.e;
        return f + (set == null ? 0 : set.hashCode());
    }

    public final String toString() {
        StringBuilder m = hr1.m("DeepLinkRoute(deepLinkUri=", this.a.toString(), ", constraint=");
        int i = this.b;
        m.append(i != 1 ? i != 2 ? "null" : "LOGGED_IN" : "NOT_LOGGED_IN");
        m.append(", requiredParams=");
        m.append(this.c);
        m.append(", supportRoot=");
        m.append(this.d);
        m.append(", bundleRequiredParams=");
        m.append(this.e);
        m.append(")");
        return m.toString();
    }
}
