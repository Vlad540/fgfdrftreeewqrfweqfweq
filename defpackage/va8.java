package defpackage;

import android.os.Bundle;
import java.util.List;

/* renamed from: va8  reason: default package */
public final class va8 {
    public final Bundle a;
    public qb8 b;

    public va8(qb8 qb8, boolean z) {
        if (qb8 != null) {
            Bundle bundle = new Bundle();
            this.a = bundle;
            this.b = qb8;
            bundle.putBundle("selector", qb8.a);
            bundle.putBoolean("activeScan", z);
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public final void a() {
        if (this.b == null) {
            Bundle bundle = this.a.getBundle("selector");
            qb8 qb8 = null;
            if (bundle != null) {
                qb8 = new qb8((List) null, bundle);
            } else {
                qb8 qb82 = qb8.c;
            }
            this.b = qb8;
            if (qb8 == null) {
                this.b = qb8.c;
            }
        }
    }

    public final boolean b() {
        return this.a.getBoolean("activeScan");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof va8)) {
            return false;
        }
        va8 va8 = (va8) obj;
        a();
        qb8 qb8 = this.b;
        va8.a();
        return qb8.equals(va8.b) && b() == va8.b();
    }

    public final int hashCode() {
        a();
        return b() ^ this.b.hashCode() ? 1 : 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiscoveryRequest{ selector=");
        a();
        sb.append(this.b);
        sb.append(", activeScan=");
        sb.append(b());
        sb.append(", isValid=");
        a();
        qb8 qb8 = this.b;
        qb8.a();
        return hr1.j(sb, !qb8.b.contains((Object) null), " }");
    }
}
