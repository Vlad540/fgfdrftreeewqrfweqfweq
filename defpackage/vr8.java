package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: vr8  reason: default package */
public final class vr8 implements Serializable {
    public final List a;
    public final int b;
    public final rr8 c;

    public vr8(ArrayList arrayList, int i, rr8 rr8) {
        this.a = arrayList;
        this.b = i;
        this.c = rr8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vr8)) {
            return false;
        }
        vr8 vr8 = (vr8) obj;
        return hhd.f(this.a, vr8.a) && this.b == vr8.b && hhd.f(this.c, vr8.c);
    }

    public final int hashCode() {
        int d = c3d.d(this.b, this.a.hashCode() * 31, 31);
        rr8 rr8 = this.c;
        return d + (rr8 == null ? 0 : rr8.hashCode());
    }

    public final String toString() {
        return "MessageReactionInfo(counters=" + this.a + ", totalCount=" + this.b + ", yourReaction=" + this.c + ")";
    }
}
