package defpackage;

import java.util.List;

/* renamed from: yab  reason: default package */
public final class yab extends abb {
    public final List a;

    public yab(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yab) && hhd.f(this.a, ((yab) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ShowMoreActions(actions=" + this.a + ")";
    }
}
