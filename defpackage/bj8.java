package defpackage;

import java.util.Collection;
import java.util.List;

/* renamed from: bj8  reason: default package */
public final class bj8 implements dj8 {
    public final Collection a;

    public bj8(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bj8) && hhd.f(this.a, ((bj8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LocalDeleteMembers(ids=" + this.a + ")";
    }
}
