package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: n90  reason: default package */
public final class n90 {
    public final String a;
    public final List b;

    public n90(String str, ArrayList arrayList) {
        if (str != null) {
            this.a = str;
            this.b = arrayList;
            return;
        }
        throw new NullPointerException("Null userAgent");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n90)) {
            return false;
        }
        n90 n90 = (n90) obj;
        return this.a.equals(n90.a) && this.b.equals(n90.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HeartBeatResult{userAgent=");
        sb.append(this.a);
        sb.append(", usedDates=");
        return hr1.i(sb, this.b, "}");
    }
}
