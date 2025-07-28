package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: gv5  reason: default package */
public final class gv5 {
    public final Set a;
    public final mnc b;

    public gv5(LinkedHashSet linkedHashSet, mnc mnc) {
        this.a = linkedHashSet;
        this.b = mnc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gv5)) {
            return false;
        }
        gv5 gv5 = (gv5) obj;
        return hhd.f(this.a, gv5.a) && this.b == gv5.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ForwardInAppReviewData(triggeredConditions=" + this.a + ", screen=" + this.b + ")";
    }
}
