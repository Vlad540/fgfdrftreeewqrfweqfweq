package defpackage;

import java.util.List;

/* renamed from: nv6  reason: default package */
public final class nv6 implements o3e {
    public final List a;
    public final boolean b;

    public nv6(List list, boolean z) {
        ez3.k("List of suppliers is empty!", !list.isEmpty());
        this.a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nv6)) {
            return false;
        }
        return at7.o(this.a, ((nv6) obj).a);
    }

    public final Object get() {
        return new mv6(this);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        jg8 X = at7.X(this);
        X.h(this.a, "list");
        return X.toString();
    }
}
