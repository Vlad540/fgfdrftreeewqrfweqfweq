package defpackage;

import java.util.List;

/* renamed from: fg6  reason: default package */
public final class fg6 {
    public final long a;
    public final List b;

    public fg6(long j, List list) {
        this.a = j;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fg6)) {
            return false;
        }
        fg6 fg6 = (fg6) obj;
        return this.a == fg6.a && hhd.f(this.b, fg6.b);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "HighlightTextState(messageLocalId=" + this.a + ", highlights=" + this.b + ")";
    }
}
