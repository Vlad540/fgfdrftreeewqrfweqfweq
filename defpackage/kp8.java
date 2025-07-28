package defpackage;

import java.util.Collection;
import java.util.Set;

/* renamed from: kp8  reason: default package */
public final class kp8 implements qp8 {
    public final Collection a;
    public final boolean b;

    public kp8(Set set, boolean z) {
        this.a = set;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kp8)) {
            return false;
        }
        kp8 kp8 = (kp8) obj;
        return hhd.f(this.a, kp8.a) && this.b == kp8.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Add(messageIds=");
        sb.append(this.a);
        sb.append(", isSelf=");
        return hr1.j(sb, this.b, ")");
    }
}
